# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build Commands

Use `./gradlew` (the wrapper pins Gradle 8.13). **Never use a global `gradle` command** — Gradle 9+ (current default as of 2026) uses Groovy 4.x which causes `AbstractExtensionMethodCache.getDisablePropertyName()` errors because ForgeGradle 6.x was compiled against Groovy 3.x. NeoGradle 7.0.x also requires exactly Gradle 8.13 (not older, not 9.x).

```bash
# Build ALL versions (use this for production builds)
./gradlew chiseledBuild

# Build single version — MUST switch active first, then clean build
./gradlew "Set active project to 1.20.1-forge"
./gradlew clean build

./gradlew "Set active project to 1.21.1-neoforge"
./gradlew clean build
```

On Windows use `gradlew.bat` or `.\gradlew` in PowerShell.

**Critical build rules:**
- `gradle build` on the root builds only the currently active version's JAR into `build/libs/` (may be stale)
- Running `:1.21.1-neoforge:build` directly without switching active produces an empty NO-SOURCE JAR
- Output JARs for deployment: `versions/1.20.1-forge/build/libs/` and `versions/1.21.1-neoforge/build/libs/`
- Active development branch: `main`. Branch `1.20.x` is an OLD reference — do NOT target it for PRs

## Test Deployment Paths

- **1.21.1 NeoForge**: `C:\Users\conno\curseforge\minecraft\Instances\Test Platform\mods`
- **1.20.1 Forge**: `C:\Users\conno\curseforge\minecraft\Instances\Test 1.20.1\mods`

## Stonecutter Multi-Version Setup

This project uses [Stonecutter 0.5.1](https://stonecutter.kikugie.dev/) to share one `src/` directory across Forge 1.20.1 and NeoForge 1.21.1. The active version is `1.20.1-forge` (set in `stonecutter.gradle`).

**Preprocessor constants** defined in `build.gradle`:

| Constant | True when |
|---|---|
| `forge` | building for Forge |
| `neoforge` | building for NeoForge |
| `forge_1201` | Forge 1.20.1 (old serializer API, `getId()`, `NetworkHooks`) |
| `forge_mid` | Forge 1.20.2/1.20.4 |
| `old_props` | Forge 1.20.1–1.20.2 (`Properties.copy()` instead of `ofFullCopy()`) |
| `recipe_holder` | NeoForge or Forge 1.20.2+ (`getAllRecipesFor` returns `List<RecipeHolder<T>>`) |
| `modern_nbt` | NeoForge or Forge 1.20.6+ (NBT methods take `HolderLookup.Provider`, codec-based serializers, `RecipeInput`) |
| `block_codec` | All except `forge_1201` (requires `codec()` override in `BaseEntityBlock`) |

**Syntax for conditionals in source:**
```java
//? if forge {
import net.minecraftforge.eventbus.api.IEventBus;
//?} else {
/*import net.neoforged.bus.api.IEventBus;
*///?}
```

**Important Stonecutter rules:**
- Never use non-ASCII characters (e.g. `─`, emoji) in comments inside conditional blocks — they become bare code when activated
- Comments inside conditional blocks must have their own `//` prefix, not rely on the `/* */` wrapper
- Helper methods used by both branches (e.g. `cauldronProps()`) must be defined in both `//? if neoforge {` and `//?} else {` blocks

**Key API differences across versions:**
- Registry holders: `RegistryObject<T>` (Forge) vs `DeferredHolder<R, T>` / `DeferredItem<T>` (NeoForge)
- Block interaction: `use()` (Forge) vs `useWithoutItem()` (NeoForge)
- NBT load: `load(CompoundTag)` (Forge) vs `loadAdditional(CompoundTag, HolderLookup.Provider)` (NeoForge)
- Recipe serializer: `fromJson/toNetwork/fromNetwork` (Forge 1.20.1) vs `codec()+streamCodec()` (NeoForge)
- Recipe container: `Container` (Forge 1.20.1) vs `RecipeInput` (NeoForge)
- NeoForge `StairBlock`: takes `BlockState` directly, not a `() -> BlockState` lambda
- NeoForge `PressurePlateBlock`: no `Sensitivity` param — constructor is `(BlockSetType, Properties)`
- NeoForge `StandingSignBlock`/`WallSignBlock`: arg order is `(WoodType, Properties)`
- NeoForge `TreeGrower`: second param is `float`, not `Optional<Float>`

## Architecture Overview

**Package:** `com.moderngamingworld.woodenutilities`

### Registration Order (WoodenUtilities.java)
`ModWoodTypes.init()` → `ModBlocks.register()` → `ModItems.register()` → `ModDataComponents` → `ModBlockEntities` → `ModRecipes` → `ModMenuTypes` → `ModCreativeTabs`

`ModWoodTypes.init()` MUST run before `ModBlocks.register()`.

On Forge only: `GeckoLib.initialize()` is called in the constructor.

### Block Types

| Block Class | Count | Description |
|---|---|---|
| `WoodenCauldronBlock` | 38+ | `BaseEntityBlock`; fluid processing via `WoodenCauldronBlockEntity` |
| `WoodenBarrelBlock` | 65+ | GeckoLib-animated; `getRenderShape()` → `ENTITYBLOCK_ANIMATED` |
| `WoodenHopperBlock` | 38+ | Hopper-style item transport |
| `WoodenCraftingTableSlabBlock` | 64/65 | `SlabBlock` that opens a `CraftingMenu` |
| `WoodenAnvilBlock` | 1 | Opens `WoodenAnvilMenu` (`ItemCombinerMenu`) |

### Wooden Cauldron System
- `WoodenCauldronBlockEntity`: two 1000 mB `FluidTank`s (tankA, tankB) + 1-slot `ItemStackHandler`
- Automation sides: UP = item insert only, DOWN = fluid extract only, sides = fluid fill+extract
- `ForgeCapabilities.FLUID_HANDLER` / `ITEM_HANDLER` exposed via `LazyOptional` per face; call `invalidateCaps()` to refresh
- Recipe type: `woodenutilities:wooden_cauldron` — KubeJS-compatible; JSON at `data/woodenutilities/recipes/`
- Real recipe matching happens in `WoodenCauldronRecipe.matches(BE)`, not the standard `matches(Container)` stub

### Wooden Anvil System
- `WoodenAnvilMenu` extends `ItemCombinerMenu`; `createResult()` queries `RecipeManager` live via `rm.getAllRecipesFor(...)`
- Recipe type: `woodenutilities:wooden_anvil`; 64 JSONs at `data/woodenutilities/recipes/wooden_anvil/`
- `spirit.json` references a NeoForge-only item — silently skipped on Forge 1.20.1

### GeckoLib Barrel Rendering
- Hard dependency: GeckoLib 4.8.3 for both loaders (`geckolib_version=4.8.3` in both `versions/*/gradle.properties`)
- Maven: `https://dl.cloudsmith.io/public/geckolib3/geckolib/maven/`
- GeckoLib package paths differ between loaders (Stonecutter `//? if forge {` conditionals required):
  - Forge 4.x: `software.bernie.geckolib.core.animatable.instance.*`, `core.animation.*`, `core.object.PlayState`
  - NeoForge 4.x: `software.bernie.geckolib.animatable.instance.*`, `animation.*`, `animation.PlayState` (no `core` prefix)
  - `AnimationController` constructor: Forge takes a transition ticks param `(0)`; NeoForge omits it
- Item rendering: Forge uses `initializeClient(Consumer<IClientItemExtensions>)`; NeoForge uses `createGeoRenderer(Consumer<GeoRenderProvider>)`
- All barrel items use `WoodenBarrelBlockItem` (not plain `BlockItem`)
- Blockstates simplified to `{"variants":{"":{"model":"minecraft:block/oak_planks"}}}`; item models use `{"parent":"builtin/entity"}`
- 8 barrels fall back to oak model — see `MISSING_BARREL_ASSETS.txt` at repo root

### JEI Integration
- Plugin: `jei/WoodenUtilitiesJeiPlugin.java`
- Both cauldron and anvil recipes registered inside a shared `if (Minecraft.getInstance().level != null)` guard

### Wood Type System
- `ModWoodTypes.java` — registers `WoodType` and `BlockSetType` for each custom wood
- 14 custom wood types added (african_blackwood, banyan, black_walnut, bloodwood, bristlecone_pine, cork_oak, dragon_blood, kapok, larch, sandalwood, sycamore, teak, wenge, zebrawood)
- Python scripts in `scripts/` generate the ~2000 resource JSON files for new wood types

### KubeJS Recipe Examples
See `wooden_anvil_kubejs_example.txt` at repo root.

```js
// Cauldron
ServerEvents.recipes(e => {
  e.custom({ type: 'woodenutilities:wooden_cauldron', ... })
})
// Anvil
ServerEvents.recipes(e => {
  e.custom({ type: 'woodenutilities:wooden_anvil', input: { item: '...' }, result: { item: '...', count: 2 } })
})
```

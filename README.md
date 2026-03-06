[![Curseforge][curseImg]][curseLink] [![Twitch Status](https://img.shields.io/twitch/status/ModernGamingWorld?label=ModernGamingWorld&style=social)](https://www.twitch.tv/moderngamingworld) [![Discord][discordimg]][discordlink]

[discordImg]: https://img.shields.io/discord/912551516592816170?logo=Discord&label=Everlasting%20Creativity

[discordLink]: https://discord.gg/EVA2pznvjb
[curseImg]: http://cf.way2muchnoise.eu/409871.svg
[curseLink]: https://www.curseforge.com/minecraft/mc-mods/wooden-utilities

# Wooden Utilities

Wooden Utilities adds wood-themed utility blocks to Minecraft — cauldrons, barrels, hoppers, chests, crafting slabs, anvils, and more — across 70+ wood types from vanilla, Twilight Forest, Biomes O' Plenty, Deep Aether, Aether, and Biomes We've Gone. All barrels and chests are GeckoLib-animated with open/close animations.

## Features

- **Wooden Plates** — 57+ variants across all supported mod ecosystems
- **Wooden Cauldrons** — fluid processing (two 1000 mB tanks + item slot); KubeJS recipe support
- **Wooden Barrels** — GeckoLib-animated; Sophisticated Storage compat (per-tier animated textures)
- **Wooden Chests** — GeckoLib-animated single and double chests; Sophisticated Storage compat
- **Wooden Hoppers** — item transport for all wood types
- **Wooden Crafting Table Slabs** — opens a full crafting grid in slab form
- **Wooden Anvil** — custom recipe type, KubeJS-compatible
- **Wooden Tools & Bucket** — shears, wrench, hammer, and a fluid-carrying bucket
- **Sawdust** — crafting ingredient

## Mod Compatibility

| Mod | Status |
|-----|--------|
| Twilight Forest | Hard support (6 wood types) |
| Biomes O' Plenty | Hard support (13 wood types) |
| Deep Aether | Hard support (5 wood types) |
| Aether | Hard support (Skyroot) |
| Biomes We've Gone | Hard support (25 wood types) |
| Sophisticated Storage | Soft dependency — animated barrel/chest textures per SS upgrade tier |
| JEI | Integration for cauldron and anvil recipe categories |

## KubeJS Recipes

See `wooden_anvil_kubejs_example.txt` at the repo root for anvil recipe examples.

Cauldron recipe type: `woodenutilities:wooden_cauldron`
Anvil recipe type: `woodenutilities:wooden_anvil`

## Development

Multi-version via [Stonecutter 0.5.1](https://stonecutter.kikugie.dev/). Targets: **Forge 1.20.1** and **NeoForge 1.21.1**.

**Build all versions:**
```bash
gradle chiseledBuild
```

**Build a single version:**
```bash
gradle "Set active project to 1.20.1-forge"
gradle clean build
# JARs at versions/1.20.1-forge/build/libs/
```

No Gradle wrapper is committed. Requires global Gradle installation (see `CLAUDE.md`).

**Asset generation:** See `scripts/README.md` for the generation pipeline used when adding new wood types.

---

<p align="center">
  <a href="https://bisecthosting.com/ModernGamingWorld">
    <img width="1124" height="200" src="https://bisecthosting.com/images/CF/Wooden_Utilities/BH_WU_PromoCard.png">
  </a>
</p>

<p align="center">
Use code <strong>ModernGamingWorld</strong> for 25% off your first month at BisectHosting.
</p>

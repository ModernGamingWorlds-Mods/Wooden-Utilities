# Wooden Cauldron Design Pivot

**Status:** In Progress - specifics being finalized
**Date:** 2026-02-20

## Original Design
The wooden cauldrons were vanilla `CauldronBlock` re-skins. When a player right-clicked with a water bucket, vanilla logic replaced the modded block with `Blocks.WATER_CAULDRON`, losing the wooden texture. The planned fix was paired empty/water-filled blocks per wood type with custom `CauldronInteraction` maps.

## New Direction
Instead of acting as a water container, the wooden cauldron will function as a **single-slot crafting vessel** (Deus Ex Machina style):

- Holds **one item** or **one bucket of fluid** at a time (no layered water levels)
- Players add items/fluids to trigger **recipes** that produce outputs
- Visually still looks like a cauldron
- All 38 wood variants retain this behavior

## Open Questions (Pending Design Finalization)
- What does the recipe flow look like? (Item A + Item B = Output C? Or timed transformation?)
- How are recipes defined? (JSON data-driven via the existing `WaterCrucibleRecipeManager` pattern, or a new system?)
- Should the cauldron show a visual of the item/fluid inside? (Rendered item in basin, fluid color tint, etc.)
- Can the player retrieve items back out, or is insertion one-way until output is produced?
- Do different wood types affect recipe outcomes, or are they purely cosmetic variants?
- Does the `WaterCrucibleRecipe`/`WaterCrucibleRecipeManager` system get repurposed for this, or replaced?

## Existing Code Relevant to This
- `WoodenCauldronBlock.java` - Current custom block (extends `CauldronBlock`, only filters non-water buckets)
- `WaterCrucibleRecipe.java` - JSON recipe parser with ingredient/result/fluid matching
- `WaterCrucibleRecipeManager.java` - Resource reload listener that loads from `data/<namespace>/water_crucible/` folder
- `ModBlocks.java` - 38 cauldron block registrations (currently all use vanilla `CauldronBlock`, not `WoodenCauldronBlock`)

## What's Been Done So Far
- Wooden bucket item created (for use with cauldron fluid interactions)
- This documentation created to preserve planning context

## Wood Types (38 total)
### Vanilla (11)
oak, spruce, birch, jungle, acacia, dark_oak, mangrove, cherry, bamboo, crimson, warped

### Twilight Forest (9)
twilight_oak, canopy, twilight_mangrove, dark, time, mining, sorting, towerwood

### Biomes O' Plenty (10)
fir, pine, maple, redwood, mahogany, jacaranda, palm, willow, dead, magic, umbran, hellbark, empyreal

### The Aether (1)
skyroot

### Other Mod Woods (7)
roseroot, yagroot, cruderoot, conberry, sunroot

## Notes for Implementation
- The `ModBlocks.java` registrations currently use `new CauldronBlock(...)` not `new WoodenCauldronBlock(...)` - this needs fixing regardless of which direction the cauldron design takes
- The `WoodenCauldronBlock.use()` override only prevents non-water bucket interactions but still delegates water bucket handling to vanilla (which causes the block replacement bug)
- A block entity will likely be needed to store the held item/fluid state

# scripts/

Python scripts for generating resource files for Wooden Utilities. All scripts run from the **repo root**.

## Generation scripts (new wood types)

Run these in order when adding the 14 new wood types or regenerating their resources.

| Script | Purpose |
|---|---|
| `copy_assets.py` | Copy textures and barrel geo from download dirs to `src/main/resources/` |
| `gen_blockstates.py` | Generate blockstate JSONs for all 14 woods × 24 block types |
| `gen_block_models.py` | Generate block model JSONs (~550 files) |
| `gen_item_models.py` | Generate item model JSONs (~406 files) |
| `gen_recipes.py` | Generate crafting recipe JSONs (~330 files) |
| `gen_loot_tables.py` | Generate loot table JSONs (336 files) |
| `gen_lang.py` | Merge lang entries for new woods into `en_us.json` |
| `gen_tags.py` | Update tag files (logs, planks, slabs, fences, etc.) |
| `gen_worldgen.py` | Generate configured/placed features and biome modifier JSONs |

## Asset conversion scripts

| Script | Purpose |
|---|---|
| `convert_barrel_geo.py` | Convert Blockbench barrel geo exports to GeckoLib format |
| `convert_ss_barrel_assets.py` | Convert Sophisticated Storage barrel textures (79 woods × 5 tiers) |
| `convert_chest_assets.py` | Convert chest geo/texture exports for GeckoLib |

## Code/data patching scripts (one-shot, already run)

| Script | Purpose |
|---|---|
| `add_chest_support.py` | Added chest block/item registrations and lang entries |
| `add_section_comments.py` | Added ecosystem section comments to ModBlocks.java |
| `add_chest_section_headers.py` | Added chest section headers to ModBlocks.java |
| `fix_forge_constructors.py` | Fixed NeoForge-specific block constructor differences |

## Usage

```bash
# Run all generation scripts in order (new wood types):
python scripts/run_gen.py

# Or run individually:
python scripts/gen_blockstates.py
python scripts/gen_lang.py
```

"""
Script 4: gen_item_models.py
Generate item model JSON files for all 14 woods.
Run from repo root: python scripts/gen_item_models.py
"""

import json
from pathlib import Path

WOODS = [
    "african_blackwood", "banyan", "black_walnut", "bloodwood", "bristlecone_pine",
    "cork_oak", "dragon_blood", "kapok", "larch", "sandalwood",
    "sycamore", "teak", "wenge", "zebrawood"
]

REPO_ROOT = Path(__file__).parent.parent
MODELS_ITEM = REPO_ROOT / "src" / "main" / "resources" / "assets" / "woodenutilities" / "models" / "item"


def write_json(path: Path, data: dict):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(data, indent=2), encoding="utf-8")
    print(f"  [WROTE] {path.name}")


def block_parent(resource: str) -> dict:
    """Item that simply renders the block model."""
    return {"parent": f"woodenutilities:block/{resource}"}


def generated(layer0: str) -> dict:
    """Item using the flat generated item model."""
    return {"parent": "minecraft:item/generated", "textures": {"layer0": layer0}}


def main():
    total = 0
    MODELS_ITEM.mkdir(parents=True, exist_ok=True)

    for wood in WOODS:
        print(f"\n=== {wood} ===")

        # Logs / Wood / Stripped — inherit from block model
        write_json(MODELS_ITEM / f"{wood}_log.json",            block_parent(f"{wood}_log"))
        write_json(MODELS_ITEM / f"{wood}_wood.json",           block_parent(f"{wood}_wood"))
        write_json(MODELS_ITEM / f"stripped_{wood}_log.json",   block_parent(f"stripped_{wood}_log"))
        write_json(MODELS_ITEM / f"stripped_{wood}_wood.json",  block_parent(f"stripped_{wood}_wood"))
        total += 4

        # Planks / Leaves
        write_json(MODELS_ITEM / f"{wood}_planks.json", block_parent(f"{wood}_planks"))
        write_json(MODELS_ITEM / f"{wood}_leaves.json", block_parent(f"{wood}_leaves"))
        total += 2

        # Sapling (flat item)
        write_json(MODELS_ITEM / f"{wood}_sapling.json",
                   generated(f"woodenutilities:block/{wood}_sapling"))
        total += 1

        # Slab / Stairs
        write_json(MODELS_ITEM / f"{wood}_slab.json",   block_parent(f"{wood}_slab"))
        write_json(MODELS_ITEM / f"{wood}_stairs.json", block_parent(f"{wood}_stairs"))
        total += 2

        # Fence (uses inventory model)
        write_json(MODELS_ITEM / f"{wood}_fence.json", block_parent(f"{wood}_fence_inventory"))
        total += 1

        # Fence Gate
        write_json(MODELS_ITEM / f"{wood}_fence_gate.json", block_parent(f"{wood}_fence_gate"))
        total += 1

        # Pressure Plate / Button
        write_json(MODELS_ITEM / f"{wood}_pressure_plate.json", block_parent(f"{wood}_pressure_plate"))
        write_json(MODELS_ITEM / f"{wood}_button.json",         block_parent(f"{wood}_button_inventory"))
        total += 2

        # Door (flat item — no door texture yet, use planks)
        write_json(MODELS_ITEM / f"{wood}_door.json",
                   generated(f"woodenutilities:block/{wood}_planks"))
        total += 1

        # Trapdoor
        write_json(MODELS_ITEM / f"{wood}_trapdoor.json", block_parent(f"{wood}_trapdoor_bottom"))
        total += 1

        # Sign / Hanging Sign (flat item)
        write_json(MODELS_ITEM / f"{wood}_sign.json",
                   generated(f"woodenutilities:item/{wood}_sign"))
        write_json(MODELS_ITEM / f"{wood}_hanging_sign.json",
                   generated(f"woodenutilities:item/{wood}_hanging_sign"))
        total += 2

        # Boat / Chest Boat
        write_json(MODELS_ITEM / f"{wood}_boat.json",
                   generated(f"woodenutilities:item/{wood}_boat"))
        write_json(MODELS_ITEM / f"{wood}_chest_boat.json",
                   generated(f"woodenutilities:item/{wood}_chest_boat"))
        total += 2

        # Crafting Table Slab / Crafting Table
        write_json(MODELS_ITEM / f"{wood}_wooden_crafting_table_slab.json",
                   block_parent(f"{wood}_wooden_crafting_table_slab"))
        write_json(MODELS_ITEM / f"{wood}_wooden_crafting_table.json",
                   block_parent(f"{wood}_wooden_crafting_table"))
        total += 2

        # Cauldron / Hopper (air model — entity rendering)
        write_json(MODELS_ITEM / f"{wood}_wooden_cauldron.json", {"parent": "minecraft:block/air"})
        write_json(MODELS_ITEM / f"{wood}_wooden_hopper.json",   {"parent": "minecraft:block/air"})
        total += 2

        # Barrel (GeckoLib entity model)
        write_json(MODELS_ITEM / f"{wood}_wooden_barrel.json", {"parent": "builtin/entity"})
        total += 1

        # Wooden Plate
        write_json(MODELS_ITEM / f"{wood}_wooden_plate.json",
                   generated(f"woodenutilities:item/{wood}_wooden_plate"))
        total += 1

    print(f"\nDone. Total item model files written: {total}")


if __name__ == "__main__":
    main()

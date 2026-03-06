"""
Script 5: gen_loot_tables.py
Generate loot table JSON files for all 14 woods.
Run from repo root: python scripts/gen_loot_tables.py
"""

import json
from pathlib import Path

WOODS = [
    "african_blackwood", "banyan", "black_walnut", "bloodwood", "bristlecone_pine",
    "cork_oak", "dragon_blood", "kapok", "larch", "sandalwood",
    "sycamore", "teak", "wenge", "zebrawood"
]

REPO_ROOT = Path(__file__).parent.parent
LOOT_DIR = REPO_ROOT / "src" / "main" / "resources" / "data" / "woodenutilities" / "loot_tables" / "blocks"


def write_json(path: Path, data: dict):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(data, indent=2), encoding="utf-8")
    print(f"  [WROTE] {path.name}")


def self_drop(item_id: str) -> dict:
    """Standard single self-drop, survives explosion."""
    return {
        "type": "minecraft:block",
        "pools": [{
            "rolls": 1,
            "entries": [{"type": "minecraft:item", "name": item_id}],
            "conditions": [{"condition": "minecraft:survives_explosion"}]
        }]
    }


def leaves_loot(wood: str) -> dict:
    ns_leaves  = f"woodenutilities:{wood}_leaves"
    ns_sapling = f"woodenutilities:{wood}_sapling"
    return {
        "type": "minecraft:block",
        "pools": [
            {
                "rolls": 1,
                "entries": [{"type": "minecraft:item", "name": ns_leaves}],
                "conditions": [{
                    "condition": "minecraft:block_state_property",
                    "block": ns_leaves,
                    "properties": {"persistent": "true"}
                }]
            },
            {
                "rolls": 1,
                "entries": [{
                    "type": "minecraft:item",
                    "name": ns_sapling,
                    "conditions": [{
                        "condition": "minecraft:table_bonus",
                        "enchantment": "minecraft:fortune",
                        "chances": [0.05, 0.0625, 0.083333336, 0.1]
                    }]
                }],
                "conditions": [{
                    "condition": "minecraft:block_state_property",
                    "block": ns_leaves,
                    "properties": {"persistent": "false"}
                }]
            }
        ]
    }


def slab_loot(item_id: str, block_id: str) -> dict:
    """Drops 2 when double slab, 1 otherwise."""
    return {
        "type": "minecraft:block",
        "pools": [{
            "rolls": 1,
            "entries": [{
                "type": "minecraft:item",
                "name": item_id,
                "functions": [{
                    "function": "minecraft:set_count",
                    "conditions": [{
                        "condition": "minecraft:block_state_property",
                        "block": block_id,
                        "properties": {"type": "double"}
                    }],
                    "count": 2,
                    "add": False
                }]
            }],
            "conditions": [{"condition": "minecraft:survives_explosion"}]
        }]
    }


def door_loot(item_id: str, block_id: str) -> dict:
    """Only drops when the lower half is broken."""
    return {
        "type": "minecraft:block",
        "pools": [{
            "rolls": 1,
            "entries": [{"type": "minecraft:item", "name": item_id}],
            "conditions": [
                {
                    "condition": "minecraft:block_state_property",
                    "block": block_id,
                    "properties": {"half": "lower"}
                },
                {"condition": "minecraft:survives_explosion"}
            ]
        }]
    }


def main():
    total = 0
    LOOT_DIR.mkdir(parents=True, exist_ok=True)

    # Blocks that use simple self-drop (not needing special logic)
    SIMPLE_SUFFIXES = [
        "_log", "_wood", "_stripped_log", "_stripped_wood",
        "_planks", "_sapling",
        "_stairs",
        "_fence", "_fence_gate",
        "_pressure_plate", "_button",
        "_trapdoor",
        "_sign", "_hanging_sign",
        "_wooden_crafting_table",
        "_wooden_cauldron", "_wooden_hopper", "_wooden_barrel",
    ]

    for wood in WOODS:
        print(f"\n=== {wood} ===")

        # Simple self-drop blocks
        for suffix in SIMPLE_SUFFIXES:
            # Handle stripped prefix
            if suffix in ("_stripped_log", "_stripped_wood"):
                block_id = f"stripped_{wood}{suffix.replace('_stripped', '')}"
            else:
                block_id = f"{wood}{suffix}"
            write_json(LOOT_DIR / f"{block_id}.json",
                       self_drop(f"woodenutilities:{block_id}"))
            total += 1

        # Leaves (fortune sapling drop)
        write_json(LOOT_DIR / f"{wood}_leaves.json", leaves_loot(wood))
        total += 1

        # Slab
        slab_block = f"woodenutilities:{wood}_slab"
        write_json(LOOT_DIR / f"{wood}_slab.json",
                   slab_loot(slab_block, slab_block))
        total += 1

        # Crafting Table Slab
        ct_slab_block = f"woodenutilities:{wood}_wooden_crafting_table_slab"
        write_json(LOOT_DIR / f"{wood}_wooden_crafting_table_slab.json",
                   slab_loot(ct_slab_block, ct_slab_block))
        total += 1

        # Door (lower half only)
        door_block = f"woodenutilities:{wood}_door"
        write_json(LOOT_DIR / f"{wood}_door.json",
                   door_loot(door_block, door_block))
        total += 1

    print(f"\nDone. Total loot table files written: {total}")


if __name__ == "__main__":
    main()

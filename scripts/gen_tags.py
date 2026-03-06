"""
Script 8: gen_tags.py
Generate/update tag JSON files for all 14 new woods.
Run from repo root: python scripts/gen_tags.py
"""

import json
from pathlib import Path

WOODS = [
    "african_blackwood", "banyan", "black_walnut", "bloodwood", "bristlecone_pine",
    "cork_oak", "dragon_blood", "kapok", "larch", "sandalwood",
    "sycamore", "teak", "wenge", "zebrawood"
]

REPO_ROOT = Path(__file__).parent.parent
DATA = REPO_ROOT / "src" / "main" / "resources" / "data"

MC_BLOCK_TAGS = DATA / "minecraft" / "tags" / "blocks"
MC_ITEM_TAGS  = DATA / "minecraft" / "tags" / "items"
WU_TAGS       = DATA / "woodenutilities" / "tags"


def read_tag(path: Path) -> dict:
    """Read existing tag file or return a fresh empty tag."""
    if path.exists():
        data = json.loads(path.read_text(encoding="utf-8"))
        # Ensure structure is correct
        if "values" not in data:
            data["values"] = []
        if "replace" not in data:
            data["replace"] = False
        return data
    return {"replace": False, "values": []}


def write_tag(path: Path, data: dict):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(data, indent=2), encoding="utf-8")
    print(f"  [WROTE] {path.relative_to(REPO_ROOT)}")


def add_values(data: dict, new_values: list) -> int:
    """Add values to tag if not already present. Returns count added."""
    existing = set(data["values"])
    added = 0
    for v in new_values:
        if v not in existing:
            data["values"].append(v)
            existing.add(v)
            added += 1
    return added


def update_tag(path: Path, new_values: list):
    """Read tag, add new values, write back."""
    data = read_tag(path)
    added = add_values(data, new_values)
    write_tag(path, data)
    print(f"    (+{added} new values)")


# ---------------------------------------------------------------------------
# Build tag value lists
# ---------------------------------------------------------------------------

def ns(suffix: str) -> str:
    return f"woodenutilities:{suffix}"


# Logs: log + wood + stripped variants
log_blocks = []
for w in WOODS:
    log_blocks += [
        ns(f"{w}_log"), ns(f"{w}_wood"),
        ns(f"stripped_{w}_log"), ns(f"stripped_{w}_wood"),
    ]

leaves_blocks  = [ns(f"{w}_leaves")       for w in WOODS]
sapling_blocks = [ns(f"{w}_sapling")      for w in WOODS]
slab_blocks    = [ns(f"{w}_slab")         for w in WOODS]
stair_blocks   = [ns(f"{w}_stairs")       for w in WOODS]
fence_blocks   = [ns(f"{w}_fence")        for w in WOODS]
gate_blocks    = [ns(f"{w}_fence_gate")   for w in WOODS]
plate_blocks   = [ns(f"{w}_pressure_plate") for w in WOODS]
button_blocks  = [ns(f"{w}_button")       for w in WOODS]
door_blocks    = [ns(f"{w}_door")         for w in WOODS]
trap_blocks    = [ns(f"{w}_trapdoor")     for w in WOODS]
sign_items     = [ns(f"{w}_sign")         for w in WOODS]
hsign_items    = [ns(f"{w}_hanging_sign") for w in WOODS]
boat_items     = [ns(f"{w}_boat")         for w in WOODS]
cboat_items    = [ns(f"{w}_chest_boat")   for w in WOODS]


def main():
    print("=== Block Tags (minecraft) ===\n")

    # logs_that_burn
    update_tag(MC_BLOCK_TAGS / "logs_that_burn.json", log_blocks)
    # logs
    update_tag(MC_BLOCK_TAGS / "logs.json", log_blocks)
    # leaves
    update_tag(MC_BLOCK_TAGS / "leaves.json", leaves_blocks)
    # saplings
    update_tag(MC_BLOCK_TAGS / "saplings.json", sapling_blocks)
    # wooden_slabs
    update_tag(MC_BLOCK_TAGS / "wooden_slabs.json", slab_blocks)
    # wooden_stairs
    update_tag(MC_BLOCK_TAGS / "wooden_stairs.json", stair_blocks)
    # wooden_fences
    update_tag(MC_BLOCK_TAGS / "wooden_fences.json", fence_blocks)
    # fence_gates
    update_tag(MC_BLOCK_TAGS / "fence_gates.json", gate_blocks)
    # wooden_pressure_plates
    update_tag(MC_BLOCK_TAGS / "wooden_pressure_plates.json", plate_blocks)
    # wooden_buttons
    update_tag(MC_BLOCK_TAGS / "wooden_buttons.json", button_blocks)
    # wooden_doors
    update_tag(MC_BLOCK_TAGS / "wooden_doors.json", door_blocks)
    # wooden_trapdoors
    update_tag(MC_BLOCK_TAGS / "wooden_trapdoors.json", trap_blocks)

    print("\n=== Item Tags (minecraft) ===\n")

    update_tag(MC_ITEM_TAGS / "logs_that_burn.json", log_blocks)
    update_tag(MC_ITEM_TAGS / "logs.json", log_blocks)
    update_tag(MC_ITEM_TAGS / "leaves.json", leaves_blocks)
    update_tag(MC_ITEM_TAGS / "saplings.json", sapling_blocks)
    update_tag(MC_ITEM_TAGS / "wooden_slabs.json", slab_blocks)
    update_tag(MC_ITEM_TAGS / "wooden_stairs.json", stair_blocks)
    update_tag(MC_ITEM_TAGS / "wooden_fences.json", fence_blocks)
    update_tag(MC_ITEM_TAGS / "fence_gates.json", gate_blocks)
    update_tag(MC_ITEM_TAGS / "wooden_pressure_plates.json", plate_blocks)
    update_tag(MC_ITEM_TAGS / "wooden_buttons.json", button_blocks)
    update_tag(MC_ITEM_TAGS / "wooden_doors.json", door_blocks)
    update_tag(MC_ITEM_TAGS / "wooden_trapdoors.json", trap_blocks)
    update_tag(MC_ITEM_TAGS / "signs.json", sign_items)
    update_tag(MC_ITEM_TAGS / "hanging_signs.json", hsign_items)
    update_tag(MC_ITEM_TAGS / "boats.json", boat_items)
    update_tag(MC_ITEM_TAGS / "chest_boats.json", cboat_items)

    print("\n=== Worldgen Biome Tag (woodenutilities) ===\n")

    cork_oak_biome_tag = WU_TAGS / "worldgen" / "biome" / "has_cork_oak_tree.json"
    # Write directly (this is a static file, not merged from existing woods)
    cork_oak_data = read_tag(cork_oak_biome_tag)
    # Ensure the fixed biomes are present
    add_values(cork_oak_data, ["minecraft:plains", "minecraft:sunflower_plains", "minecraft:meadow"])
    write_tag(cork_oak_biome_tag, cork_oak_data)

    print("\nDone.")


if __name__ == "__main__":
    main()

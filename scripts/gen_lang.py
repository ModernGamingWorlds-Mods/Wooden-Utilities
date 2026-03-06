"""
Script 7: gen_lang.py
Add lang entries for all 14 new woods to en_us.json.
Run from repo root: python scripts/gen_lang.py
"""

import json
from pathlib import Path

WOODS = [
    "african_blackwood", "banyan", "black_walnut", "bloodwood", "bristlecone_pine",
    "cork_oak", "dragon_blood", "kapok", "larch", "sandalwood",
    "sycamore", "teak", "wenge", "zebrawood"
]

REPO_ROOT = Path(__file__).parent.parent
LANG_FILE = REPO_ROOT / "src" / "main" / "resources" / "assets" / "woodenutilities" / "lang" / "en_us.json"


def wood_display_name(wood: str) -> str:
    """Convert snake_case wood name to Title Case display name."""
    return " ".join(word.capitalize() for word in wood.split("_"))


def build_entries(wood: str) -> dict:
    name = wood_display_name(wood)
    b = "block.woodenutilities"
    i = "item.woodenutilities"
    return {
        f"{b}.{wood}_log":                           f"{name} Log",
        f"{b}.{wood}_wood":                          f"{name} Wood",
        f"{b}.stripped_{wood}_log":                  f"Stripped {name} Log",
        f"{b}.stripped_{wood}_wood":                 f"Stripped {name} Wood",
        f"{b}.{wood}_planks":                        f"{name} Planks",
        f"{b}.{wood}_leaves":                        f"{name} Leaves",
        f"{b}.{wood}_slab":                          f"{name} Slab",
        f"{b}.{wood}_stairs":                        f"{name} Stairs",
        f"{b}.{wood}_fence":                         f"{name} Fence",
        f"{b}.{wood}_fence_gate":                    f"{name} Fence Gate",
        f"{b}.{wood}_pressure_plate":                f"{name} Pressure Plate",
        f"{b}.{wood}_button":                        f"{name} Button",
        f"{b}.{wood}_door":                          f"{name} Door",
        f"{b}.{wood}_trapdoor":                      f"{name} Trapdoor",
        f"{i}.{wood}_sign":                          f"{name} Sign",
        f"{i}.{wood}_hanging_sign":                  f"{name} Hanging Sign",
        f"{i}.{wood}_boat":                          f"{name} Boat",
        f"{i}.{wood}_chest_boat":                    f"{name} Boat with Chest",
        f"{b}.{wood}_sapling":                       f"{name} Sapling",
        f"{b}.{wood}_wooden_crafting_table":         f"{name} Crafting Table",
        f"{b}.{wood}_wooden_crafting_table_slab":    f"{name} Crafting Table Slab",
        f"{b}.{wood}_wooden_cauldron":               f"{name} Wooden Cauldron",
        f"{b}.{wood}_wooden_hopper":                 f"{name} Wooden Hopper",
        f"{b}.{wood}_wooden_barrel":                 f"{name} Wooden Barrel",
        f"{i}.{wood}_wooden_plate":                  f"{name} Wooden Plate",
    }


def main():
    LANG_FILE.parent.mkdir(parents=True, exist_ok=True)

    # Read existing lang file if present
    if LANG_FILE.exists():
        existing = json.loads(LANG_FILE.read_text(encoding="utf-8"))
        print(f"Loaded existing lang file ({len(existing)} entries).")
    else:
        existing = {}
        print("No existing lang file found — creating new.")

    new_entries = 0
    updated_entries = 0

    for wood in WOODS:
        print(f"\n  Adding entries for: {wood}")
        entries = build_entries(wood)
        for key, value in entries.items():
            if key not in existing:
                existing[key] = value
                print(f"    [NEW]     {key} = {value}")
                new_entries += 1
            elif existing[key] != value:
                print(f"    [UPDATE]  {key}: '{existing[key]}' -> '{value}'")
                existing[key] = value
                updated_entries += 1
            else:
                print(f"    [SKIP]    {key} (already exists)")

    LANG_FILE.write_text(json.dumps(existing, indent=2, ensure_ascii=False), encoding="utf-8")
    print(f"\nDone. New: {new_entries}, Updated: {updated_entries}. Wrote {LANG_FILE}")


if __name__ == "__main__":
    main()

"""
Script 6: gen_recipes.py
Generate crafting recipe JSON files for all 14 woods.
Run from repo root: python scripts/gen_recipes.py
"""

import json
from pathlib import Path

WOODS = [
    "african_blackwood", "banyan", "black_walnut", "bloodwood", "bristlecone_pine",
    "cork_oak", "dragon_blood", "kapok", "larch", "sandalwood",
    "sycamore", "teak", "wenge", "zebrawood"
]

REPO_ROOT = Path(__file__).parent.parent
RECIPES_DIR = REPO_ROOT / "src" / "main" / "resources" / "data" / "woodenutilities" / "recipes"


def write_json(path: Path, data: dict):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(data, indent=2), encoding="utf-8")
    print(f"  [WROTE] {path.name}")


def item(id_: str, count: int = 1) -> dict:
    result = {"item": id_}
    if count != 1:
        result["count"] = count
    return result


def ingredient(id_: str) -> dict:
    return {"item": id_}


def shapeless(ingredients: list, result_item: str, count: int = 1) -> dict:
    data: dict = {
        "type": "minecraft:crafting_shapeless",
        "ingredients": ingredients,
        "result": item(result_item, count),
    }
    return data


def shaped(pattern: list, key: dict, result_item: str, count: int = 1) -> dict:
    data: dict = {
        "type": "minecraft:crafting_shaped",
        "pattern": pattern,
        "key": key,
        "result": item(result_item, count),
    }
    return data


def ns(wood: str, suffix: str) -> str:
    return f"woodenutilities:{wood}{suffix}"


def main():
    total = 0
    RECIPES_DIR.mkdir(parents=True, exist_ok=True)

    for wood in WOODS:
        print(f"\n=== {wood} ===")

        planks   = ns(wood, "_planks")
        log      = ns(wood, "_log")
        wood_blk = ns(wood, "_wood")
        str_log  = f"woodenutilities:stripped_{wood}_log"
        str_wood = f"woodenutilities:stripped_{wood}_wood"
        slab     = ns(wood, "_slab")
        boat     = ns(wood, "_boat")

        # --- Planks from log / wood / stripped variants (shapeless, 4 planks) ---
        for src_item, recipe_name in [
            (log,      "planks_from_log"),
            (wood_blk, "planks_from_wood"),
            (str_log,  "planks_from_stripped_log"),
            (str_wood, "planks_from_stripped_wood"),
        ]:
            write_json(RECIPES_DIR / f"{wood}_{recipe_name}.json",
                       shapeless([ingredient(src_item)], planks, 4))
            total += 1

        # --- Slab (6 from 3 planks in a row) ---
        write_json(RECIPES_DIR / f"{wood}_slab.json",
                   shaped(["###"], {"#": ingredient(planks)}, slab, 6))
        total += 1

        # --- Stairs (4 from 6 planks) ---
        write_json(RECIPES_DIR / f"{wood}_stairs.json",
                   shaped(["#  ", "## ", "###"], {"#": ingredient(planks)}, ns(wood, "_stairs"), 4))
        total += 1

        # --- Fence (3 from 4 planks + 2 sticks) ---
        write_json(RECIPES_DIR / f"{wood}_fence.json",
                   shaped(
                       ["#W#", "#W#"],
                       {"#": ingredient(planks), "W": ingredient("minecraft:stick")},
                       ns(wood, "_fence"), 3
                   ))
        total += 1

        # --- Fence Gate (1 from 2 planks + 4 sticks) ---
        write_json(RECIPES_DIR / f"{wood}_fence_gate.json",
                   shaped(
                       ["W#W", "W#W"],
                       {"#": ingredient(planks), "W": ingredient("minecraft:stick")},
                       ns(wood, "_fence_gate")
                   ))
        total += 1

        # --- Pressure Plate (1 from 2 planks) ---
        write_json(RECIPES_DIR / f"{wood}_pressure_plate.json",
                   shaped(["##"], {"#": ingredient(planks)}, ns(wood, "_pressure_plate")))
        total += 1

        # --- Button (1 from 1 plank, shapeless) ---
        write_json(RECIPES_DIR / f"{wood}_button.json",
                   shapeless([ingredient(planks)], ns(wood, "_button")))
        total += 1

        # --- Door (3 from 6 planks) ---
        write_json(RECIPES_DIR / f"{wood}_door.json",
                   shaped(["##", "##", "##"], {"#": ingredient(planks)}, ns(wood, "_door"), 3))
        total += 1

        # --- Trapdoor (2 from 6 planks) ---
        write_json(RECIPES_DIR / f"{wood}_trapdoor.json",
                   shaped(["###", "###"], {"#": ingredient(planks)}, ns(wood, "_trapdoor"), 2))
        total += 1

        # --- Sign (3 from 6 planks + 1 stick) ---
        write_json(RECIPES_DIR / f"{wood}_sign.json",
                   shaped(
                       ["###", "###", " W "],
                       {"#": ingredient(planks), "W": ingredient("minecraft:stick")},
                       ns(wood, "_sign"), 3
                   ))
        total += 1

        # --- Hanging Sign (6 from 6 stripped logs + 2 chains) ---
        write_json(RECIPES_DIR / f"{wood}_hanging_sign.json",
                   shaped(
                       ["X X", "###", "###"],
                       {"#": ingredient(str_log), "X": ingredient("minecraft:chain")},
                       ns(wood, "_hanging_sign"), 6
                   ))
        total += 1

        # --- Crafting Table Slab (2 from 4 planks, 2x2) ---
        write_json(RECIPES_DIR / f"{wood}_wooden_crafting_table_slab.json",
                   shaped(["##", "##"], {"#": ingredient(planks)},
                          ns(wood, "_wooden_crafting_table_slab"), 2))
        total += 1

        # --- Boat (1 from 5 planks) ---
        write_json(RECIPES_DIR / f"{wood}_boat.json",
                   shaped(["# #", "###"], {"#": ingredient(planks)}, boat))
        total += 1

        # --- Chest Boat (boat + chest, shapeless) ---
        write_json(RECIPES_DIR / f"{wood}_chest_boat.json",
                   shapeless([ingredient(boat), ingredient("minecraft:chest")],
                              ns(wood, "_chest_boat")))
        total += 1

        # --- Wooden Plate (1 from 2 planks) ---
        write_json(RECIPES_DIR / f"{wood}_wooden_plate.json",
                   shaped(["##"], {"#": ingredient(planks)}, ns(wood, "_wooden_plate")))
        total += 1

        # --- Wooden Barrel (planks + slabs, vanilla barrel pattern) ---
        write_json(RECIPES_DIR / f"{wood}_wooden_barrel.json",
                   shaped(
                       ["#S#", "# #", "#S#"],
                       {"#": ingredient(planks), "S": ingredient(slab)},
                       ns(wood, "_wooden_barrel")
                   ))
        total += 1

    print(f"\nDone. Total recipe files written: {total}")


if __name__ == "__main__":
    main()

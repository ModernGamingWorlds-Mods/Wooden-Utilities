"""
Script 3: gen_block_models.py
Generate block model JSON files for all 14 woods.
Run from repo root: python scripts/gen_block_models.py
"""

import json
from pathlib import Path

WOODS = [
    "african_blackwood", "banyan", "black_walnut", "bloodwood", "bristlecone_pine",
    "cork_oak", "dragon_blood", "kapok", "larch", "sandalwood",
    "sycamore", "teak", "wenge", "zebrawood"
]

REPO_ROOT = Path(__file__).parent.parent
MODELS_BLOCK = REPO_ROOT / "src" / "main" / "resources" / "assets" / "woodenutilities" / "models" / "block"


def write_json(path: Path, data: dict):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(data, indent=2), encoding="utf-8")
    print(f"  [WROTE] {path.name}")


def planks_tex(wood: str) -> str:
    return f"woodenutilities:block/{wood}_planks"


def main():
    total = 0
    MODELS_BLOCK.mkdir(parents=True, exist_ok=True)

    for wood in WOODS:
        print(f"\n=== {wood} ===")

        # Log (y-axis)
        write_json(MODELS_BLOCK / f"{wood}_log.json", {
            "parent": "minecraft:block/cube_column",
            "textures": {
                "end":  f"woodenutilities:block/{wood}_log_top",
                "side": f"woodenutilities:block/{wood}_log_side",
            }
        })
        total += 1

        # Log horizontal (x/z-axis)
        write_json(MODELS_BLOCK / f"{wood}_log_horizontal.json", {
            "parent": "minecraft:block/cube_column_horizontal",
            "textures": {
                "end":  f"woodenutilities:block/{wood}_log_top",
                "side": f"woodenutilities:block/{wood}_log_side",
            }
        })
        total += 1

        # Wood (all sides = log side)
        write_json(MODELS_BLOCK / f"{wood}_wood.json", {
            "parent": "minecraft:block/cube_column",
            "textures": {
                "end":  f"woodenutilities:block/{wood}_log_side",
                "side": f"woodenutilities:block/{wood}_log_side",
            }
        })
        total += 1

        # Stripped log
        write_json(MODELS_BLOCK / f"stripped_{wood}_log.json", {
            "parent": "minecraft:block/cube_column",
            "textures": {
                "end":  f"woodenutilities:block/{wood}_stripped_log_top",
                "side": f"woodenutilities:block/{wood}_stripped_log_side",
            }
        })
        total += 1

        # Stripped log horizontal
        write_json(MODELS_BLOCK / f"stripped_{wood}_log_horizontal.json", {
            "parent": "minecraft:block/cube_column_horizontal",
            "textures": {
                "end":  f"woodenutilities:block/{wood}_stripped_log_top",
                "side": f"woodenutilities:block/{wood}_stripped_log_side",
            }
        })
        total += 1

        # Stripped wood (all sides = stripped log side)
        write_json(MODELS_BLOCK / f"stripped_{wood}_wood.json", {
            "parent": "minecraft:block/cube_column",
            "textures": {
                "end":  f"woodenutilities:block/{wood}_stripped_log_side",
                "side": f"woodenutilities:block/{wood}_stripped_log_side",
            }
        })
        total += 1

        # Planks
        write_json(MODELS_BLOCK / f"{wood}_planks.json", {
            "parent": "minecraft:block/cube_all",
            "textures": {"all": planks_tex(wood)}
        })
        total += 1

        # Leaves
        write_json(MODELS_BLOCK / f"{wood}_leaves.json", {
            "parent": "minecraft:block/leaves",
            "textures": {"all": f"woodenutilities:block/{wood}_leaves"}
        })
        total += 1

        # Sapling
        write_json(MODELS_BLOCK / f"{wood}_sapling.json", {
            "parent": "minecraft:block/cross",
            "textures": {"cross": f"woodenutilities:block/{wood}_sapling"}
        })
        total += 1

        # Sapling tinted
        write_json(MODELS_BLOCK / f"{wood}_sapling_tinted.json", {
            "parent": "minecraft:block/tinted_cross",
            "textures": {"cross": f"woodenutilities:block/{wood}_sapling"}
        })
        total += 1

        # Slab bottom
        write_json(MODELS_BLOCK / f"{wood}_slab.json", {
            "parent": "minecraft:block/slab",
            "textures": {
                "bottom": planks_tex(wood),
                "side":   planks_tex(wood),
                "top":    planks_tex(wood),
            }
        })
        total += 1

        # Slab top
        write_json(MODELS_BLOCK / f"{wood}_slab_top.json", {
            "parent": "minecraft:block/slab_top",
            "textures": {
                "bottom": planks_tex(wood),
                "side":   planks_tex(wood),
                "top":    planks_tex(wood),
            }
        })
        total += 1

        # Stairs
        stair_tex = {"bottom": planks_tex(wood), "side": planks_tex(wood), "top": planks_tex(wood)}
        for variant, parent in [
            (f"{wood}_stairs",       "minecraft:block/stairs"),
            (f"{wood}_stairs_inner", "minecraft:block/inner_stairs"),
            (f"{wood}_stairs_outer", "minecraft:block/outer_stairs"),
        ]:
            write_json(MODELS_BLOCK / f"{variant}.json", {"parent": parent, "textures": stair_tex})
            total += 1

        # Fence post, side, inventory
        fence_tex = {"texture": planks_tex(wood)}
        for variant, parent in [
            (f"{wood}_fence_post",      "minecraft:block/fence_post"),
            (f"{wood}_fence_side",      "minecraft:block/fence_side"),
            (f"{wood}_fence_inventory", "minecraft:block/fence_inventory"),
        ]:
            write_json(MODELS_BLOCK / f"{variant}.json", {"parent": parent, "textures": fence_tex})
            total += 1

        # Fence gate variants
        for variant, parent in [
            (f"{wood}_fence_gate",           "minecraft:block/template_fence_gate"),
            (f"{wood}_fence_gate_open",      "minecraft:block/template_fence_gate_open"),
            (f"{wood}_fence_gate_wall",      "minecraft:block/template_fence_gate_wall"),
            (f"{wood}_fence_gate_wall_open", "minecraft:block/template_fence_gate_wall_open"),
        ]:
            write_json(MODELS_BLOCK / f"{variant}.json", {"parent": parent, "textures": fence_tex})
            total += 1

        # Pressure plate
        for variant, parent in [
            (f"{wood}_pressure_plate",      "minecraft:block/pressure_plate_up"),
            (f"{wood}_pressure_plate_down", "minecraft:block/pressure_plate_down"),
        ]:
            write_json(MODELS_BLOCK / f"{variant}.json", {"parent": parent, "textures": {"texture": planks_tex(wood)}})
            total += 1

        # Button
        for variant, parent in [
            (f"{wood}_button",           "minecraft:block/button"),
            (f"{wood}_button_pressed",   "minecraft:block/button_pressed"),
            (f"{wood}_button_inventory", "minecraft:block/button_inventory"),
        ]:
            write_json(MODELS_BLOCK / f"{variant}.json", {"parent": parent, "textures": {"texture": planks_tex(wood)}})
            total += 1

        # Door (8 half models using planks texture as stand-in)
        door_tex = {"bottom": planks_tex(wood), "top": planks_tex(wood)}
        for half in ["bottom", "top"]:
            for side in ["left", "right"]:
                for open_suffix in ["", "_open"]:
                    variant = f"{wood}_door_{half}_{side}{open_suffix}"
                    parent  = f"minecraft:block/door_{half}_{side}{open_suffix}"
                    write_json(MODELS_BLOCK / f"{variant}.json", {"parent": parent, "textures": door_tex})
                    total += 1

        # Trapdoor
        trap_tex = {"texture": planks_tex(wood)}
        for variant, parent in [
            (f"{wood}_trapdoor_bottom", "minecraft:block/template_orientable_trapdoor_bottom"),
            (f"{wood}_trapdoor_top",    "minecraft:block/template_orientable_trapdoor_top"),
            (f"{wood}_trapdoor_open",   "minecraft:block/template_orientable_trapdoor_open"),
        ]:
            write_json(MODELS_BLOCK / f"{variant}.json", {"parent": parent, "textures": trap_tex})
            total += 1

        # Sign / Wall Sign (air — special rendering)
        for variant in [f"{wood}_sign", f"{wood}_wall_sign"]:
            write_json(MODELS_BLOCK / f"{variant}.json", {"parent": "minecraft:block/air"})
            total += 1

        # Hanging Sign / Wall Hanging Sign (air)
        for variant in [f"{wood}_hanging_sign", f"{wood}_wall_hanging_sign"]:
            write_json(MODELS_BLOCK / f"{variant}.json", {"parent": "minecraft:block/air"})
            total += 1

        # Crafting Table
        write_json(MODELS_BLOCK / f"{wood}_wooden_crafting_table.json", {
            "parent": "minecraft:block/cube",
            "textures": {
                "down":     planks_tex(wood),
                "east":     planks_tex(wood),
                "north":    planks_tex(wood),
                "particle": "minecraft:block/crafting_table_front",
                "south":    planks_tex(wood),
                "up":       "minecraft:block/crafting_table_top",
                "west":     planks_tex(wood),
            }
        })
        total += 1

        # Crafting Table Slab bottom
        write_json(MODELS_BLOCK / f"{wood}_wooden_crafting_table_slab.json", {
            "parent": "minecraft:block/slab",
            "textures": {
                "bottom": planks_tex(wood),
                "side":   planks_tex(wood),
                "top":    "minecraft:block/crafting_table_top",
            }
        })
        total += 1

        # Crafting Table Slab top
        write_json(MODELS_BLOCK / f"{wood}_wooden_crafting_table_slab_top.json", {
            "parent": "minecraft:block/slab_top",
            "textures": {
                "bottom": planks_tex(wood),
                "side":   planks_tex(wood),
                "top":    "minecraft:block/crafting_table_top",
            }
        })
        total += 1

        # Cauldron stub
        write_json(MODELS_BLOCK / f"{wood}_wooden_cauldron.json", {"parent": "minecraft:block/air"})
        total += 1

        # Hopper stub
        write_json(MODELS_BLOCK / f"{wood}_wooden_hopper.json", {"parent": "minecraft:block/air"})
        total += 1

        # Barrel stubs (GeckoLib entity rendering)
        write_json(MODELS_BLOCK / f"{wood}_wooden_barrel.json",      {"parent": "builtin/entity"})
        write_json(MODELS_BLOCK / f"{wood}_wooden_barrel_open.json", {"parent": "builtin/entity"})
        total += 2

    print(f"\nDone. Total block model files written: {total}")


if __name__ == "__main__":
    main()

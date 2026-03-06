"""
Script 2: gen_blockstates.py
Generate blockstate JSON files for all 14 woods x 24 block types.
Run from repo root: python scripts/gen_blockstates.py
"""

import json
from pathlib import Path

WOODS = [
    "african_blackwood", "banyan", "black_walnut", "bloodwood", "bristlecone_pine",
    "cork_oak", "dragon_blood", "kapok", "larch", "sandalwood",
    "sycamore", "teak", "wenge", "zebrawood"
]

REPO_ROOT = Path(__file__).parent.parent
BLOCKSTATES_DIR = REPO_ROOT / "src" / "main" / "resources" / "assets" / "woodenutilities" / "blockstates"


def write_json(path: Path, data: dict):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(data, indent=2), encoding="utf-8")
    print(f"  [WROTE] {path.name}")


# ---------------------------------------------------------------------------
# Stair variant generation (vanilla MC pattern)
# ---------------------------------------------------------------------------
STAIR_FACINGS = ["east", "north", "south", "west"]
STAIR_HALVES  = ["bottom", "top"]
STAIR_SHAPES  = ["inner_left", "inner_right", "outer_left", "outer_right", "straight"]

# y-rotation for each facing (0=south for straight model; MC convention)
FACING_Y = {"east": 0, "west": 180, "south": 90, "north": 270}

def make_stair_variant(wood: str, facing: str, half: str, shape: str) -> dict:
    ns = f"woodenutilities:block/{wood}_stairs"
    if shape in ("inner_left", "inner_right"):
        model = f"woodenutilities:block/{wood}_stairs_inner"
    elif shape in ("outer_left", "outer_right"):
        model = f"woodenutilities:block/{wood}_stairs_outer"
    else:
        model = ns

    y = FACING_Y[facing]
    x = 0

    if half == "top":
        x = 180
        if shape == "straight":
            y = (FACING_Y[facing] + 180) % 360
        elif shape == "inner_left":
            y = (FACING_Y[facing] + 270) % 360
        elif shape == "inner_right":
            y = (FACING_Y[facing] + 90) % 360
        elif shape == "outer_left":
            y = (FACING_Y[facing] + 270) % 360
        elif shape == "outer_right":
            y = (FACING_Y[facing] + 90) % 360
    else:  # bottom
        if shape == "inner_left":
            y = (FACING_Y[facing] + 270) % 360
        elif shape == "inner_right":
            y = FACING_Y[facing]
        elif shape == "outer_left":
            y = (FACING_Y[facing] + 270) % 360
        elif shape == "outer_right":
            y = FACING_Y[facing]
        else:  # straight
            y = FACING_Y[facing]

    entry: dict = {"model": model}
    if x != 0:
        entry["x"] = x
    if y != 0:
        entry["y"] = y
    entry["uvlock"] = True
    return entry


def gen_stairs_blockstate(wood: str) -> dict:
    variants: dict = {}
    for facing in STAIR_FACINGS:
        for half in STAIR_HALVES:
            for shape in STAIR_SHAPES:
                key = f"facing={facing},half={half},shape={shape}"
                variants[key] = make_stair_variant(wood, facing, half, shape)
    return {"variants": variants}


# ---------------------------------------------------------------------------
# Fence gate blockstate
# ---------------------------------------------------------------------------
GATE_FACING_Y = {"south": 0, "west": 90, "north": 180, "east": 270}

def gen_fence_gate_blockstate(wood: str) -> dict:
    variants: dict = {}
    for facing in ["south", "west", "north", "east"]:
        y = GATE_FACING_Y[facing]
        for in_wall in ["false", "true"]:
            for open_ in ["false", "true"]:
                key = f"facing={facing},in_wall={in_wall},open={open_}"
                if in_wall == "true":
                    model = (f"woodenutilities:block/{wood}_fence_gate_wall_open"
                             if open_ == "true"
                             else f"woodenutilities:block/{wood}_fence_gate_wall")
                else:
                    model = (f"woodenutilities:block/{wood}_fence_gate_open"
                             if open_ == "true"
                             else f"woodenutilities:block/{wood}_fence_gate")
                entry: dict = {"model": model}
                if y != 0:
                    entry["y"] = y
                entry["uvlock"] = True
                variants[key] = entry
    return {"variants": variants}


# ---------------------------------------------------------------------------
# Button blockstate (vanilla MC pattern)
# ---------------------------------------------------------------------------
BUTTON_FACING_Y = {"east": 0, "west": 180, "south": 90, "north": 270}

def gen_button_blockstate(wood: str) -> dict:
    variants: dict = {}
    for face in ["ceiling", "floor", "wall"]:
        for facing in ["east", "north", "south", "west"]:
            for powered in ["false", "true"]:
                key = f"face={face},facing={facing},powered={powered}"
                model_suffix = "_pressed" if powered == "true" else ""
                model = f"woodenutilities:block/{wood}_button{model_suffix}"
                y = BUTTON_FACING_Y[facing]
                entry: dict = {"model": model}
                if face == "ceiling":
                    entry["x"] = 180
                    if y != 0:
                        entry["y"] = y
                elif face == "floor":
                    if y != 0:
                        entry["y"] = y
                else:  # wall
                    entry["x"] = 90
                    if y != 0:
                        entry["y"] = y
                entry["uvlock"] = False
                variants[key] = entry
    return {"variants": variants}


# ---------------------------------------------------------------------------
# Door blockstate (vanilla MC pattern)
# ---------------------------------------------------------------------------
DOOR_FACING_Y = {"east": 0, "south": 90, "west": 180, "north": 270}

def gen_door_blockstate(wood: str) -> dict:
    variants: dict = {}
    for facing in ["east", "south", "west", "north"]:
        for half in ["lower", "upper"]:
            for hinge in ["left", "right"]:
                for open_ in ["false", "true"]:
                    key = f"facing={facing},half={half},hinge={hinge},open={open_}"
                    y_base = DOOR_FACING_Y[facing]

                    if half == "lower":
                        if open_ == "false":
                            if hinge == "left":
                                model = f"woodenutilities:block/{wood}_door_bottom_left"
                                y = y_base
                            else:
                                model = f"woodenutilities:block/{wood}_door_bottom_right"
                                y = y_base
                        else:
                            if hinge == "left":
                                model = f"woodenutilities:block/{wood}_door_bottom_left_open"
                                y = (y_base + 90) % 360
                            else:
                                model = f"woodenutilities:block/{wood}_door_bottom_right_open"
                                y = (y_base + 270) % 360
                    else:  # upper
                        if open_ == "false":
                            if hinge == "left":
                                model = f"woodenutilities:block/{wood}_door_top_left"
                                y = y_base
                            else:
                                model = f"woodenutilities:block/{wood}_door_top_right"
                                y = y_base
                        else:
                            if hinge == "left":
                                model = f"woodenutilities:block/{wood}_door_top_left_open"
                                y = (y_base + 90) % 360
                            else:
                                model = f"woodenutilities:block/{wood}_door_top_right_open"
                                y = (y_base + 270) % 360

                    entry: dict = {"model": model}
                    if y != 0:
                        entry["y"] = y
                    variants[key] = entry
    return {"variants": variants}


# ---------------------------------------------------------------------------
# Trapdoor blockstate (vanilla MC pattern)
# ---------------------------------------------------------------------------
TRAP_FACING_Y = {"north": 0, "south": 180, "east": 90, "west": 270}

def gen_trapdoor_blockstate(wood: str) -> dict:
    variants: dict = {}
    for facing in ["north", "south", "east", "west"]:
        for half in ["bottom", "top"]:
            for open_ in ["false", "true"]:
                key = f"facing={facing},half={half},open={open_}"
                y = TRAP_FACING_Y[facing]
                if open_ == "true":
                    model = f"woodenutilities:block/{wood}_trapdoor_open"
                    entry: dict = {"model": model}
                    if y != 0:
                        entry["y"] = y
                    if facing in ("north", "south"):
                        pass  # x handled by model
                elif half == "top":
                    model = f"woodenutilities:block/{wood}_trapdoor_top"
                    entry = {"model": model}
                    if y != 0:
                        entry["y"] = y
                else:
                    model = f"woodenutilities:block/{wood}_trapdoor_bottom"
                    entry = {"model": model}
                    if y != 0:
                        entry["y"] = y
                entry["uvlock"] = True
                variants[key] = entry
    return {"variants": variants}


# ---------------------------------------------------------------------------
# Pillar (log/wood) blockstate
# ---------------------------------------------------------------------------
def gen_pillar_blockstate(wood: str, model_name: str) -> dict:
    return {
        "variants": {
            "axis=x": {"model": f"woodenutilities:block/{model_name}", "x": 90, "y": 90},
            "axis=y": {"model": f"woodenutilities:block/{model_name}"},
            "axis=z": {"model": f"woodenutilities:block/{model_name}", "x": 90},
        }
    }


# ---------------------------------------------------------------------------
# Main
# ---------------------------------------------------------------------------
def main():
    total = 0
    BLOCKSTATES_DIR.mkdir(parents=True, exist_ok=True)

    for wood in WOODS:
        print(f"\n=== {wood} ===")

        # Log / Wood / Stripped (pillar blocks)
        for model_key in [
            (f"{wood}_log", f"{wood}_log"),
            (f"{wood}_wood", f"{wood}_wood"),
            (f"stripped_{wood}_log", f"stripped_{wood}_log"),
            (f"stripped_{wood}_wood", f"stripped_{wood}_wood"),
        ]:
            fname, model_name = model_key
            write_json(BLOCKSTATES_DIR / f"{fname}.json", gen_pillar_blockstate(wood, model_name))
            total += 1

        # Planks
        write_json(BLOCKSTATES_DIR / f"{wood}_planks.json", {
            "variants": {"": {"model": f"woodenutilities:block/{wood}_planks"}}
        })
        total += 1

        # Leaves
        write_json(BLOCKSTATES_DIR / f"{wood}_leaves.json", {
            "variants": {"": {"model": f"woodenutilities:block/{wood}_leaves"}}
        })
        total += 1

        # Sapling
        write_json(BLOCKSTATES_DIR / f"{wood}_sapling.json", {
            "variants": {"": {"model": f"woodenutilities:block/{wood}_sapling"}}
        })
        total += 1

        # Slab
        write_json(BLOCKSTATES_DIR / f"{wood}_slab.json", {
            "variants": {
                "type=bottom": {"model": f"woodenutilities:block/{wood}_slab"},
                "type=double": {"model": f"woodenutilities:block/{wood}_planks"},
                "type=top":    {"model": f"woodenutilities:block/{wood}_slab_top"},
            }
        })
        total += 1

        # Stairs
        write_json(BLOCKSTATES_DIR / f"{wood}_stairs.json", gen_stairs_blockstate(wood))
        total += 1

        # Fence (multipart)
        write_json(BLOCKSTATES_DIR / f"{wood}_fence.json", {
            "multipart": [
                {"apply": {"model": f"woodenutilities:block/{wood}_fence_post"}},
                {"when": {"north": "true"}, "apply": {"model": f"woodenutilities:block/{wood}_fence_side", "uvlock": True}},
                {"when": {"east":  "true"}, "apply": {"model": f"woodenutilities:block/{wood}_fence_side", "uvlock": True, "y": 90}},
                {"when": {"south": "true"}, "apply": {"model": f"woodenutilities:block/{wood}_fence_side", "uvlock": True, "y": 180}},
                {"when": {"west":  "true"}, "apply": {"model": f"woodenutilities:block/{wood}_fence_side", "uvlock": True, "y": 270}},
            ]
        })
        total += 1

        # Fence Gate
        write_json(BLOCKSTATES_DIR / f"{wood}_fence_gate.json", gen_fence_gate_blockstate(wood))
        total += 1

        # Pressure Plate
        write_json(BLOCKSTATES_DIR / f"{wood}_pressure_plate.json", {
            "variants": {
                "powered=false": {"model": f"woodenutilities:block/{wood}_pressure_plate"},
                "powered=true":  {"model": f"woodenutilities:block/{wood}_pressure_plate_down"},
            }
        })
        total += 1

        # Button
        write_json(BLOCKSTATES_DIR / f"{wood}_button.json", gen_button_blockstate(wood))
        total += 1

        # Door
        write_json(BLOCKSTATES_DIR / f"{wood}_door.json", gen_door_blockstate(wood))
        total += 1

        # Trapdoor
        write_json(BLOCKSTATES_DIR / f"{wood}_trapdoor.json", gen_trapdoor_blockstate(wood))
        total += 1

        # Sign (standing - 16 rotation variants)
        sign_variants = {f"rotation={r}": {"model": f"woodenutilities:block/{wood}_sign"} for r in range(16)}
        write_json(BLOCKSTATES_DIR / f"{wood}_sign.json", {"variants": sign_variants})
        total += 1

        # Wall Sign
        wall_sign_y = {"north": 180, "south": 0, "east": 270, "west": 90}
        wall_sign_variants: dict = {}
        for facing, y in wall_sign_y.items():
            entry: dict = {"model": f"woodenutilities:block/{wood}_wall_sign"}
            if y != 0:
                entry["y"] = y
            wall_sign_variants[f"facing={facing}"] = entry
        write_json(BLOCKSTATES_DIR / f"{wood}_wall_sign.json", {"variants": wall_sign_variants})
        total += 1

        # Hanging Sign (16 rotation variants)
        hanging_variants = {
            f"attached=false,rotation={r}": {"model": f"woodenutilities:block/{wood}_hanging_sign"}
            for r in range(16)
        }
        hanging_variants.update({
            f"attached=true,rotation={r}": {"model": f"woodenutilities:block/{wood}_hanging_sign"}
            for r in range(16)
        })
        write_json(BLOCKSTATES_DIR / f"{wood}_hanging_sign.json", {"variants": hanging_variants})
        total += 1

        # Wall Hanging Sign
        wall_hanging_y = {"north": 180, "south": 0, "east": 270, "west": 90}
        wall_hanging_variants: dict = {}
        for facing, y in wall_hanging_y.items():
            entry = {"model": f"woodenutilities:block/{wood}_wall_hanging_sign"}
            if y != 0:
                entry["y"] = y
            wall_hanging_variants[f"facing={facing}"] = entry
        write_json(BLOCKSTATES_DIR / f"{wood}_wall_hanging_sign.json", {"variants": wall_hanging_variants})
        total += 1

        # Crafting Table
        write_json(BLOCKSTATES_DIR / f"{wood}_wooden_crafting_table.json", {
            "variants": {"": {"model": f"woodenutilities:block/{wood}_wooden_crafting_table"}}
        })
        total += 1

        # Crafting Table Slab
        write_json(BLOCKSTATES_DIR / f"{wood}_wooden_crafting_table_slab.json", {
            "variants": {
                "type=bottom": {"model": f"woodenutilities:block/{wood}_wooden_crafting_table_slab"},
                "type=double": {"model": f"woodenutilities:block/{wood}_wooden_crafting_table"},
                "type=top":    {"model": f"woodenutilities:block/{wood}_wooden_crafting_table_slab_top"},
            }
        })
        total += 1

        # Cauldron stub
        write_json(BLOCKSTATES_DIR / f"{wood}_wooden_cauldron.json", {
            "variants": {"": {"model": "minecraft:block/oak_planks"}}
        })
        total += 1

        # Hopper stub
        write_json(BLOCKSTATES_DIR / f"{wood}_wooden_hopper.json", {
            "variants": {"": {"model": "minecraft:block/oak_planks"}}
        })
        total += 1

        # Barrel stub
        write_json(BLOCKSTATES_DIR / f"{wood}_wooden_barrel.json", {
            "variants": {"": {"model": "minecraft:block/oak_planks"}}
        })
        total += 1

    print(f"\nDone. Total blockstate files written: {total}")


if __name__ == "__main__":
    main()

"""
Script 9: gen_worldgen.py
Generate world generation data files (configured features, placed features,
Forge biome modifiers, NeoForge biome modifiers) for all 14 new woods.
Run from repo root: python scripts/gen_worldgen.py
"""

import json
from pathlib import Path

WOODS = [
    "african_blackwood", "banyan", "black_walnut", "bloodwood", "bristlecone_pine",
    "cork_oak", "dragon_blood", "kapok", "larch", "sandalwood",
    "sycamore", "teak", "wenge", "zebrawood"
]

REPO_ROOT = Path(__file__).parent.parent
DATA = REPO_ROOT / "src" / "main" / "resources" / "data" / "woodenutilities"

CF_DIR     = DATA / "worldgen" / "configured_feature"
PF_DIR     = DATA / "worldgen" / "placed_feature"
FORGE_DIR  = DATA / "forge" / "biome_modifier"
NEO_DIR    = DATA / "neoforge" / "biome_modifier"


def write_json(path: Path, data: dict):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(data, indent=2), encoding="utf-8")
    print(f"  [WROTE] {path.relative_to(REPO_ROOT)}")


# ---------------------------------------------------------------------------
# Tree configuration data
# ---------------------------------------------------------------------------

TREE_CONFIGS = {
    "african_blackwood": {
        "trunk": "straight", "base_height": 4, "height_rand_a": 2, "height_rand_b": 0,
        "foliage": "blob", "radius": 2, "offset": 0, "layers": 3
    },
    "banyan": {
        "trunk": "mega_jungle", "base_height": 10, "height_rand_a": 2, "height_rand_b": 19,
        "foliage": "jungle_foliage", "height_below_top": 2, "branch_height": 1, "branch_length": 1
    },
    "black_walnut": {
        "trunk": "fancy", "base_height": 3, "height_rand_a": 11, "height_rand_b": 0,
        "foliage": "fancy"
    },
    "bloodwood": {
        "trunk": "straight", "base_height": 5, "height_rand_a": 2, "height_rand_b": 0,
        "foliage": "blob", "radius": 2, "offset": 0, "layers": 3
    },
    "bristlecone_pine": {
        "trunk": "straight", "base_height": 3, "height_rand_a": 1, "height_rand_b": 0,
        "foliage": "spruce", "min_height": 4, "max_height": 6
    },
    "cork_oak": {
        "trunk": "straight", "base_height": 4, "height_rand_a": 2, "height_rand_b": 0,
        "foliage": "blob", "radius": 2, "offset": 0, "layers": 3
    },
    "dragon_blood": {
        "trunk": "straight", "base_height": 4, "height_rand_a": 1, "height_rand_b": 0,
        "foliage": "bush"
    },
    "kapok": {
        "trunk": "dark_oak", "base_height": 6, "height_rand_a": 2, "height_rand_b": 1,
        "foliage": "dark_oak"
    },
    "larch": {
        "trunk": "straight", "base_height": 6, "height_rand_a": 4, "height_rand_b": 0,
        "foliage": "spruce", "min_height": 5, "max_height": 8
    },
    "sandalwood": {
        "trunk": "straight", "base_height": 5, "height_rand_a": 2, "height_rand_b": 0,
        "foliage": "blob", "radius": 2, "offset": 0, "layers": 3
    },
    "sycamore": {
        "trunk": "fancy", "base_height": 3, "height_rand_a": 11, "height_rand_b": 0,
        "foliage": "fancy"
    },
    "teak": {
        "trunk": "straight", "base_height": 7, "height_rand_a": 3, "height_rand_b": 0,
        "foliage": "blob", "radius": 3, "offset": 0, "layers": 3
    },
    "wenge": {
        "trunk": "straight", "base_height": 5, "height_rand_a": 2, "height_rand_b": 0,
        "foliage": "blob", "radius": 2, "offset": 0, "layers": 4
    },
    "zebrawood": {
        "trunk": "fancy", "base_height": 3, "height_rand_a": 11, "height_rand_b": 0,
        "foliage": "acacia_foliage"
    },
}

RARITY = {
    "banyan":            24,
    "kapok":             24,
    "bristlecone_pine":  20,
    "dragon_blood":      20,
    "african_blackwood": 12,
    "bloodwood":         12,
    "cork_oak":          14,
    "black_walnut":      10,
    "larch":             10,
    "sandalwood":        12,
    "sycamore":          10,
    "teak":              12,
    "wenge":             10,
    "zebrawood":         12,
}

BIOMES = {
    "african_blackwood": "#minecraft:is_savanna",
    "banyan":            "#minecraft:is_jungle",
    "black_walnut":      "#minecraft:is_forest",
    "bloodwood":         "#minecraft:is_savanna",
    "bristlecone_pine":  "#minecraft:is_mountain",
    "cork_oak":          "#woodenutilities:has_cork_oak_tree",
    "dragon_blood":      "#minecraft:is_badlands",
    "kapok":             "#minecraft:is_jungle",
    "larch":             "#minecraft:is_taiga",
    "sandalwood":        "#minecraft:is_jungle",
    "sycamore":          "#minecraft:is_forest",
    "teak":              "#minecraft:is_jungle",
    "wenge":             "#minecraft:is_forest",
    "zebrawood":         "#minecraft:is_jungle",
}


# ---------------------------------------------------------------------------
# Configured Feature builders
# ---------------------------------------------------------------------------

def log_provider(wood: str) -> dict:
    return {
        "type": "minecraft:simple_state_provider",
        "state": {
            "Name": f"woodenutilities:{wood}_log",
            "Properties": {"axis": "y"}
        }
    }


def leaves_provider(wood: str) -> dict:
    return {
        "type": "minecraft:simple_state_provider",
        "state": {
            "Name": f"woodenutilities:{wood}_leaves",
            "Properties": {
                "distance":   "1",
                "persistent": "false",
                "waterlogged": "false"
            }
        }
    }


def two_layers_size(limit: int = 1, lower: int = 0, upper: int = 1) -> dict:
    return {
        "type": "minecraft:two_layers_feature_size",
        "limit": limit,
        "lower_size": lower,
        "upper_size": upper
    }


def three_layers_size(limit: int = 1, lower: int = 0, middle: int = 1, upper: int = 1) -> dict:
    return {
        "type": "minecraft:three_layers_feature_size",
        "limit": limit,
        "lower_size": lower,
        "middle_size": middle,
        "upper_size": upper
    }


def build_configured_feature(wood: str, cfg: dict) -> dict:
    trunk   = cfg["trunk"]
    foliage = cfg["foliage"]

    # Trunk placer
    if trunk == "straight":
        trunk_placer = {
            "type": "minecraft:straight_trunk_placer",
            "base_height":    cfg["base_height"],
            "height_rand_a":  cfg["height_rand_a"],
            "height_rand_b":  cfg["height_rand_b"],
        }
    elif trunk == "fancy":
        trunk_placer = {
            "type": "minecraft:fancy_trunk_placer",
            "base_height":   cfg["base_height"],
            "height_rand_a": cfg["height_rand_a"],
            "height_rand_b": cfg["height_rand_b"],
        }
    elif trunk == "mega_jungle":
        trunk_placer = {
            "type": "minecraft:mega_jungle_trunk_placer",
            "base_height":   cfg["base_height"],
            "height_rand_a": cfg["height_rand_a"],
            "height_rand_b": cfg["height_rand_b"],
        }
    elif trunk == "dark_oak":
        trunk_placer = {
            "type": "minecraft:dark_oak_trunk_placer",
            "base_height":   cfg["base_height"],
            "height_rand_a": cfg["height_rand_a"],
            "height_rand_b": cfg["height_rand_b"],
        }
    else:
        raise ValueError(f"Unknown trunk type: {trunk}")

    # Foliage placer
    if foliage == "blob":
        foliage_placer = {
            "type":   "minecraft:blob_foliage_placer",
            "radius": cfg["radius"],
            "offset": cfg["offset"],
            "height": cfg["layers"],
        }
        minimum_size = two_layers_size(1, 0, 1)

    elif foliage == "fancy":
        foliage_placer = {"type": "minecraft:fancy_foliage_placer", "radius": 2, "offset": 4}
        minimum_size = two_layers_size(0, 0, 1)

    elif foliage == "spruce":
        foliage_placer = {
            "type":       "minecraft:spruce_foliage_placer",
            "radius":     2,
            "offset":     0,
            "trunk_height": {"type": "minecraft:uniform", "value": {"min_inclusive": cfg["min_height"], "max_inclusive": cfg["max_height"]}}
        }
        minimum_size = two_layers_size(1, 0, 1)

    elif foliage == "jungle_foliage":
        foliage_placer = {
            "type":   "minecraft:jungle_foliage_placer",
            "radius": 2,
            "offset": 0,
            "height": 2,
        }
        minimum_size = two_layers_size(1, 1, 2)

    elif foliage == "dark_oak":
        foliage_placer = {
            "type":   "minecraft:dark_oak_foliage_placer",
            "radius": 0,
            "offset": 0,
        }
        minimum_size = three_layers_size(1, 0, 1, 1)

    elif foliage == "bush":
        foliage_placer = {
            "type":   "minecraft:bush_foliage_placer",
            "radius": 2,
            "offset": 0,
            "height": 2,
        }
        minimum_size = two_layers_size(1, 0, 0)

    elif foliage == "acacia_foliage":
        foliage_placer = {
            "type":   "minecraft:acacia_foliage_placer",
            "radius": 2,
            "offset": 0,
        }
        minimum_size = two_layers_size(0, 0, 1)

    else:
        raise ValueError(f"Unknown foliage type: {foliage}")

    return {
        "type": "minecraft:tree",
        "config": {
            "trunk_provider":   log_provider(wood),
            "foliage_provider": leaves_provider(wood),
            "minimum_size":     minimum_size,
            "trunk_placer":     trunk_placer,
            "foliage_placer":   foliage_placer,
            "decorators":       [],
            "ignore_vines":     True,
        }
    }


# ---------------------------------------------------------------------------
# Placed Feature builder
# ---------------------------------------------------------------------------

def build_placed_feature(wood: str, chance: int) -> dict:
    return {
        "feature": f"woodenutilities:{wood}_tree",
        "placement": [
            {"type": "minecraft:rarity_filter", "chance": chance},
            {"type": "minecraft:in_square"},
            {
                "type": "minecraft:placed_feature_filter",
                "features": [{
                    "Feature": "minecraft:default_block_predicate",
                    "config": {
                        "state": {"Name": "minecraft:grass_block"}
                    }
                }]
            },
            {"type": "minecraft:heightmap", "heightmap": "MOTION_BLOCKING_NO_LEAVES"},
            {"type": "minecraft:biome"},
        ]
    }


# ---------------------------------------------------------------------------
# Biome Modifier builders
# ---------------------------------------------------------------------------

def build_forge_modifier(wood: str, biome: str) -> dict:
    return {
        "type": "forge:add_features",
        "biomes": biome,
        "features": f"woodenutilities:{wood}_tree",
        "step": "vegetal_decoration",
    }


def build_neoforge_modifier(wood: str, biome: str) -> dict:
    return {
        "type": "neoforge:add_features",
        "biomes": biome,
        "features": f"woodenutilities:{wood}_tree",
        "step": "vegetal_decoration",
    }


# ---------------------------------------------------------------------------
# Main
# ---------------------------------------------------------------------------

def main():
    total = 0

    for wood in WOODS:
        print(f"\n=== {wood} ===")

        cfg = TREE_CONFIGS[wood]

        # Configured Feature
        write_json(CF_DIR / f"{wood}_tree.json", build_configured_feature(wood, cfg))
        total += 1

        # Placed Feature
        write_json(PF_DIR / f"{wood}_tree.json", build_placed_feature(wood, RARITY[wood]))
        total += 1

        # Forge Biome Modifier
        write_json(FORGE_DIR / f"{wood}_tree.json", build_forge_modifier(wood, BIOMES[wood]))
        total += 1

        # NeoForge Biome Modifier
        write_json(NEO_DIR / f"{wood}_tree.json", build_neoforge_modifier(wood, BIOMES[wood]))
        total += 1

    print(f"\nDone. Total worldgen files written: {total}")


if __name__ == "__main__":
    main()

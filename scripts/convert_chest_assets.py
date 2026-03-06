"""
Convert chest Blockbench projects to GeckoLib assets.

Input folders: Chest_{prefix}_{tier} and Double_Chest_{prefix}_{tier}
Tiers: wood, iron, gold, diamond, netherite

Outputs:
  geo/block/{block_name}.geo.json            -- per-wood single chest geo
  geo/block/{block_name}_double.geo.json     -- per-wood double chest geo
  geo/block/ss_chest.geo.json                -- shared SS single chest geo (from oak_wood)
  geo/block/ss_chest_double.geo.json         -- shared SS double chest geo (from oak_wood)
  textures/geo/chest/{block_name}.png        -- wooden chest texture
  textures/geo/chest/{block_name}_double.png -- wooden chest double texture
  textures/geo/chest/ss_{prefix}_{ss_tier}.png        -- SS single chest texture
  textures/geo/chest/ss_{prefix}_{ss_tier}_double.png -- SS double chest texture
"""

import json
import shutil
from pathlib import Path

# ── Paths ───────────────────────────────────────────────────────────────────
MOD_ROOT = Path(r"C:\Users\conno\Documents\Wooden-Utilities")
GEO_OUT  = MOD_ROOT / "src/main/resources/assets/woodenutilities/geo/block"
TEX_OUT  = MOD_ROOT / "src/main/resources/assets/woodenutilities/textures/geo/chest"

SOURCE = Path(r"C:\Users\conno\Downloads\All_Wood_Tier_Chests\Output\2026-03-06_08-56")

# Folder tier suffix → SS tier name
TIER_MAP = {
    "_wood":      "chest",
    "_iron":      "iron_chest",
    "_gold":      "gold_chest",
    "_diamond":   "diamond_chest",
    "_netherite": "netherite_chest",
}

# Maps folder prefix (after Chest_) → mod block name prefix (before _wooden_chest)
# Only _wood tier entries need this. SS textures use the raw folder prefix as wood key.
PREFIX_TO_BLOCK = {
    "vanilla_oak":             "oak",
    "vanilla_spruce":          "spruce",
    "vanilla_birch":           "birch",
    "vanilla_jungle":          "jungle",
    "vanilla_acacia":          "acacia",
    "vanilla_dark_oak":        "dark_oak",
    "vanilla_mangrove":        "mangrove",
    "vanilla_cherry":          "cherry",
    "vanilla_bamboo":          "bamboo",
    "vanilla_crimson":         "crimson",
    "vanilla_warped":          "warped",
    # vanilla_pale_oak not registered in our mod — skip
    "tf_twilight_oak":         "twilight_oak",
    "tf_canopy":               "canopy",
    "tf_mangrove":             "twilight_mangrove",
    "tf_darkwood":             "dark",
    "tf_time":                 "time",
    "tf_trans":                "transformation",
    "tf_mine":                 "mining",
    "tf_sort":                 "sorting",
    "tf_towerwood":            "towerwood",
    "bop_fir":                 "fir",
    "bop_pine":                "pine",
    "bop_maple":               "maple",
    "bop_redwood":             "redwood",
    "bop_mahogany":            "mahogany",
    "bop_jacaranda":           "jacaranda",
    "bop_palm":                "palm",
    "bop_willow":              "willow",
    "bop_dead":                "dead",
    "bop_magic":               "magic",
    "bop_umbran":              "umbran",
    "bop_hellbark":            "hellbark",
    "bop_empyreal":            "empyreal",
    "aether_skyroot":          "skyroot",
    "deep_aether_roseroot":    "roseroot",
    "deep_aether_yagroot":     "yagroot",
    "deep_aether_cruderoot":   "cruderoot",
    "deep_aether_conberry":    "conberry",
    "deep_aether_sunroot":     "sunroot",
    "bwg_aspen":               "aspen",
    "bwg_baobab":              "baobab",
    "bwg_blue_enchanted":      "blue_enchanted",
    "bwg_cika":                "cika",
    "bwg_cypress":             "cypress",
    "bwg_ebony":               "ebony",
    "bwg_fir":                 "bwg_fir",
    "bwg_florus":              "florus",
    "bwg_green_enchanted":     "green_enchanted",
    "bwg_holly":               "holly",
    "bwg_ironwood":            "ironwood",
    "bwg_jacaranda":           "bwg_jacaranda",
    "bwg_mahogany":            "bwg_mahogany",
    "bwg_maple":               "bwg_maple",
    "bwg_palm":                "bwg_palm",
    "bwg_pine":                "bwg_pine",
    "bwg_rainbow_eucalyptus":  "rainbow_eucalyptus",
    "bwg_redwood":             "bwg_redwood",
    "bwg_sakura":              "sakura",
    "bwg_skyris":              "skyris",
    "bwg_spirit":              "spirit",
    "bwg_white_mangrove":      "white_mangrove",
    "bwg_willow":              "bwg_willow",
    "bwg_witch_hazel":         "witch_hazel",
    "bwg_zelkova":             "zelkova",
    "african_blackwood":       "african_blackwood",
    "banyan":                  "banyan",
    "black_walnut":            "black_walnut",
    "bloodwood":               "bloodwood",
    "bristlecone_pine":        "bristlecone_pine",
    "cork_oak":                "cork_oak",
    "dragon_blood":            "dragon_blood",
    "kapok":                   "kapok",
    "larch":                   "larch",
    "sandalwood":              "sandalwood",
    "sycamore":                "sycamore",
    "teak":                    "teak",
    "wenge":                   "wenge",
    "zebrawood":               "zebrawood",
}


def convert_geo(bb_data: dict, identifier: str) -> dict:
    """Convert Blockbench 5.0 project data to GeckoLib 1.12.0 geo.json."""
    res = bb_data["resolution"]
    tex_w, tex_h = res["width"], res["height"]

    uuid_to_elem = {e["uuid"]: e for e in bb_data["elements"]}
    group_by_uuid = {
        g["uuid"]: g
        for g in bb_data["groups"]
        if isinstance(g, dict)
    }

    bones = []
    for entry in bb_data["outliner"]:
        if not isinstance(entry, dict):
            continue
        group = group_by_uuid.get(entry["uuid"], {})
        pivot = group.get("origin", [0, 0, 0])
        name  = group.get("name", "bone")

        cubes = []
        for child in entry["children"]:
            if isinstance(child, dict):
                # sub-group — skip for now (chests are flat)
                continue
            elem = uuid_to_elem.get(child)
            if elem is None:
                continue
            fx, fy, fz = elem["from"]
            tx, ty, tz = elem["to"]
            cubes.append({
                "origin": [fx, fy, fz],
                "size":   [tx - fx, ty - fy, tz - fz],
                "uv":     elem.get("uv_offset", [0, 0]),
            })

        bones.append({"name": name, "pivot": pivot, "cubes": cubes})

    return {
        "format_version": "1.12.0",
        "minecraft:geometry": [{
            "description": {
                "identifier":            f"geometry.{identifier}",
                "texture_width":         tex_w,
                "texture_height":        tex_h,
                "visible_bounds_width":  2,
                "visible_bounds_height": 2,
                "visible_bounds_offset": [0, 0, 0],
            },
            "bones": bones,
        }],
    }


def parse_folder(folder_name: str):
    """
    Returns (is_double, prefix, ss_tier) or (None, None, None) if not a chest folder.
    """
    if folder_name.startswith("Double_Chest_"):
        is_double = True
        base = folder_name[len("Double_Chest_"):]
    elif folder_name.startswith("Chest_"):
        is_double = False
        base = folder_name[len("Chest_"):]
    else:
        return None, None, None

    for suffix, ss_tier in TIER_MAP.items():
        if base.endswith(suffix):
            return is_double, base[:-len(suffix)], ss_tier

    return None, None, None


def main():
    GEO_OUT.mkdir(parents=True, exist_ok=True)
    TEX_OUT.mkdir(parents=True, exist_ok=True)

    ss_single_geo_done = False
    ss_double_geo_done = False
    wooden_geo_ok = []
    wooden_tex_ok = []
    ss_tex_ok = []
    skipped = []
    errors = []

    for export_dir in sorted(SOURCE.iterdir()):
        if not export_dir.is_dir():
            continue

        folder_name = export_dir.name
        is_double, prefix, ss_tier = parse_folder(folder_name)
        if prefix is None:
            skipped.append(folder_name)
            continue

        geo_src = export_dir / f"{folder_name}.geo.json"
        png_src = export_dir / f"{folder_name}.png"

        # ── SS shared geo (from vanilla_oak_wood only) ──────────────────────
        if prefix == "vanilla_oak":
            if not is_double and not ss_single_geo_done and geo_src.exists():
                try:
                    with open(geo_src, encoding="utf-8") as f:
                        bb_data = json.load(f)
                    geo_out = GEO_OUT / "ss_chest.geo.json"
                    with open(geo_out, "w", encoding="utf-8") as f:
                        json.dump(convert_geo(bb_data, "ss_chest"), f, indent=2)
                    ss_single_geo_done = True
                    print(f"[GEO-SS] ss_chest.geo.json from {folder_name}")
                except Exception as e:
                    errors.append(f"SS single geo failed: {e}")

            if is_double and not ss_double_geo_done and geo_src.exists():
                try:
                    with open(geo_src, encoding="utf-8") as f:
                        bb_data = json.load(f)
                    geo_out = GEO_OUT / "ss_chest_double.geo.json"
                    with open(geo_out, "w", encoding="utf-8") as f:
                        json.dump(convert_geo(bb_data, "ss_chest_double"), f, indent=2)
                    ss_double_geo_done = True
                    print(f"[GEO-SS] ss_chest_double.geo.json from {folder_name}")
                except Exception as e:
                    errors.append(f"SS double geo failed: {e}")

        # ── Wooden chest block geo + texture (wood tier only) ───────────────
        if ss_tier == "chest":  # _wood tier
            block_prefix = PREFIX_TO_BLOCK.get(prefix)
            if block_prefix:
                block_name = f"{block_prefix}_wooden_chest"
                suffix = "_double" if is_double else ""
                geo_name = f"{block_name}{suffix}.geo.json"
                tex_name = f"{block_name}{suffix}.png"

                if geo_src.exists():
                    try:
                        with open(geo_src, encoding="utf-8") as f:
                            bb_data = json.load(f)
                        geo_out = GEO_OUT / geo_name
                        ident = f"wooden_chest_double" if is_double else "wooden_chest"
                        with open(geo_out, "w", encoding="utf-8") as f:
                            json.dump(convert_geo(bb_data, ident), f, indent=2)
                        wooden_geo_ok.append(geo_name)
                    except Exception as e:
                        errors.append(f"Geo failed {folder_name}: {e}")

                if png_src.exists():
                    shutil.copy2(png_src, TEX_OUT / tex_name)
                    wooden_tex_ok.append(tex_name)
            else:
                skipped.append(f"{folder_name} (no block mapping for prefix '{prefix}')")

        # ── SS chest texture (all tiers) ────────────────────────────────────
        double_suffix = "_double" if is_double else ""
        ss_tex_name = f"ss_{prefix}_{ss_tier}{double_suffix}.png"
        if png_src.exists():
            shutil.copy2(png_src, TEX_OUT / ss_tex_name)
            ss_tex_ok.append(ss_tex_name)
        else:
            errors.append(f"Missing PNG: {folder_name}")

    # ── Summary ──────────────────────────────────────────────────────────────
    print(f"\n{'='*60}")
    print(f"SS geo:         {'single OK' if ss_single_geo_done else 'MISSING'}, "
          f"{'double OK' if ss_double_geo_done else 'MISSING'}")
    print(f"Wooden geo:     {len(wooden_geo_ok)} converted")
    print(f"Wooden tex:     {len(wooden_tex_ok)} copied")
    print(f"SS tex:         {len(ss_tex_ok)} copied")
    print(f"Skipped:        {len(skipped)}")
    print(f"Errors:         {len(errors)}")

    if errors:
        print("\n[ERRORS]")
        for e in errors:
            print(f"  {e}")

    if skipped:
        print("\n[SKIPPED]")
        for s in skipped:
            print(f"  {s}")

    # ── Print HAS_OWN_ASSETS set for WoodenChestGeoModel ───────────────────
    block_names = sorted(
        f"{v}_wooden_chest"
        for v in PREFIX_TO_BLOCK.values()
    )
    print(f"\n[HAS_OWN_ASSETS — paste into WoodenChestGeoModel and WoodenChestItemGeoModel]")
    print("    private static final Set<String> HAS_OWN_ASSETS = Set.of(")
    for name in block_names:
        print(f'            "{name}",')
    print("    );")


if __name__ == "__main__":
    main()

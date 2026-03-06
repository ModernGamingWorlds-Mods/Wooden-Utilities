# Converts Blockbench 5.0 .geo.json exports to GeckoLib 1.12.0 format,
# then copies the converted geo and PNG files into the mod with correct names.

import json
import shutil
from pathlib import Path

# ── Paths ──────────────────────────────────────────────────────────────────────
MOD_ROOT    = Path(r"C:\Users\conno\Documents\Wooden-Utilities")
GEO_OUT     = MOD_ROOT / "src/main/resources/assets/woodenutilities/geo/block"
TEX_OUT     = MOD_ROOT / "src/main/resources/assets/woodenutilities/textures/geo/barrel"

SOURCES = [
    Path(r"C:\Users\conno\Downloads\All_Barrels\Output\2026-03-03_08-16"),
    Path(r"C:\Users\conno\Downloads\New_Wood_Barrels\Output\2026-03-03_08-25"),
    Path(r"C:\Users\conno\Downloads\Aether_Barrels\Output\2026-03-03_08-49"),
]

# ── Export-folder-name → mod barrel name ──────────────────────────────────────
NAME_MAP = {
    # Vanilla
    "Barrel_vanilla_oak":             "oak_wooden_barrel",
    "Barrel_vanilla_spruce":          "spruce_wooden_barrel",
    "Barrel_vanilla_birch":           "birch_wooden_barrel",
    "Barrel_vanilla_jungle":          "jungle_wooden_barrel",
    "Barrel_vanilla_acacia":          "acacia_wooden_barrel",
    "Barrel_vanilla_dark_oak":        "dark_oak_wooden_barrel",
    "Barrel_vanilla_mangrove":        "mangrove_wooden_barrel",
    "Barrel_vanilla_cherry":          "cherry_wooden_barrel",
    "Barrel_vanilla_bamboo":          "bamboo_wooden_barrel",
    "Barrel_vanilla_crimson":         "crimson_wooden_barrel",
    "Barrel_vanilla_warped":          "warped_wooden_barrel",
    "Barrel_vanilla_pale_oak":        "pale_oak_wooden_barrel",
    # Twilight Forest
    "Barrel_tf_twilight_oak":         "twilight_oak_wooden_barrel",
    "Barrel_tf_canopy":               "canopy_wooden_barrel",
    "Barrel_tf_mangrove":             "twilight_mangrove_wooden_barrel",
    "Barrel_tf_darkwood":             "dark_wooden_barrel",
    "Barrel_tf_time":                 "time_wooden_barrel",
    "Barrel_tf_trans":                "transformation_wooden_barrel",
    "Barrel_tf_mine":                 "mining_wooden_barrel",
    "Barrel_tf_sort":                 "sorting_wooden_barrel",
    # BOP / other mods
    "Barrel_fir":                     "fir_wooden_barrel",
    "Barrel_pine":                    "pine_wooden_barrel",
    "Barrel_maple":                   "maple_wooden_barrel",
    "Barrel_redwood":                 "redwood_wooden_barrel",
    "Barrel_mahogany":                "mahogany_wooden_barrel",
    "Barrel_jacaranda":               "jacaranda_wooden_barrel",
    "Barrel_palm":                    "palm_wooden_barrel",
    "Barrel_willow":                  "willow_wooden_barrel",
    "Barrel_dead":                    "dead_wooden_barrel",
    "Barrel_magic":                   "magic_wooden_barrel",
    "Barrel_umbran":                  "umbran_wooden_barrel",
    "Barrel_hellbark":                "hellbark_wooden_barrel",
    "Barrel_empyreal":                "empyreal_wooden_barrel",
    # BWG
    "Barrel_bwg_fir":                 "bwg_fir_wooden_barrel",
    "Barrel_bwg_pine":                "bwg_pine_wooden_barrel",
    "Barrel_bwg_maple":               "bwg_maple_wooden_barrel",
    "Barrel_bwg_redwood":             "bwg_redwood_wooden_barrel",
    "Barrel_bwg_mahogany":            "bwg_mahogany_wooden_barrel",
    "Barrel_bwg_jacaranda":           "bwg_jacaranda_wooden_barrel",
    "Barrel_bwg_palm":                "bwg_palm_wooden_barrel",
    "Barrel_bwg_willow":              "bwg_willow_wooden_barrel",
    "Barrel_bwg_aspen":               "bwg_aspen_wooden_barrel",
    "Barrel_bwg_baobab":              "bwg_baobab_wooden_barrel",
    "Barrel_bwg_blue_enchanted":      "blue_enchanted_wooden_barrel",
    "Barrel_bwg_cika":                "cika_wooden_barrel",
    "Barrel_bwg_cypress":             "cypress_wooden_barrel",
    "Barrel_bwg_ebony":               "ebony_wooden_barrel",
    "Barrel_bwg_florus":              "florus_wooden_barrel",
    "Barrel_bwg_green_enchanted":     "green_enchanted_wooden_barrel",
    "Barrel_bwg_holly":               "holly_wooden_barrel",
    "Barrel_bwg_ironwood":            "ironwood_wooden_barrel",
    "Barrel_bwg_rainbow_eucalyptus":  "rainbow_eucalyptus_wooden_barrel",
    "Barrel_bwg_sakura":              "sakura_wooden_barrel",
    "Barrel_bwg_skyris":              "skyris_wooden_barrel",
    "Barrel_bwg_spirit":              "spirit_wooden_barrel",
    "Barrel_bwg_white_mangrove":      "white_mangrove_wooden_barrel",
    "Barrel_bwg_witch_hazel":         "witch_hazel_wooden_barrel",
    "Barrel_bwg_zelkova":             "zelkova_wooden_barrel",
    # Aether / Deep Aether / TF Towerwood
    "Barrel_aether_skyroot":          "skyroot_wooden_barrel",
    "Barrel_deep_aether_conberry":    "conberry_wooden_barrel",
    "Barrel_deep_aether_cruderoot":   "cruderoot_wooden_barrel",
    "Barrel_deep_aether_roseroot":    "roseroot_wooden_barrel",
    "Barrel_deep_aether_sunroot":     "sunroot_wooden_barrel",
    "Barrel_deep_aether_yagroot":     "yagroot_wooden_barrel",
    "Barrel_tf_towerwood":            "towerwood_wooden_barrel",
    # 14 new custom wood types
    "Barrel_african_blackwood":       "african_blackwood_wooden_barrel",
    "Barrel_banyan":                  "banyan_wooden_barrel",
    "Barrel_black_walnut":            "black_walnut_wooden_barrel",
    "Barrel_bloodwood":               "bloodwood_wooden_barrel",
    "Barrel_bristlecone_pine":        "bristlecone_pine_wooden_barrel",
    "Barrel_cork_oak":                "cork_oak_wooden_barrel",
    "Barrel_dragon_blood":            "dragon_blood_wooden_barrel",
    "Barrel_kapok":                   "kapok_wooden_barrel",
    "Barrel_larch":                   "larch_wooden_barrel",
    "Barrel_sandalwood":              "sandalwood_wooden_barrel",
    "Barrel_sycamore":                "sycamore_wooden_barrel",
    "Barrel_teak":                    "teak_wooden_barrel",
    "Barrel_wenge":                   "wenge_wooden_barrel",
    "Barrel_zebrawood":               "zebrawood_wooden_barrel",
}


def convert(bb_data: dict, identifier: str) -> dict:
    """Convert Blockbench 5.0 project data to GeckoLib 1.12.0 geo.json format."""
    res = bb_data["resolution"]
    tex_w, tex_h = res["width"], res["height"]

    # UUID → element lookup
    uuid_to_elem = {e["uuid"]: e for e in bb_data["elements"]}

    # UUID → group info (pivot / name) from the flat groups list
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
        for child_uuid in entry["children"]:
            elem = uuid_to_elem.get(child_uuid)
            if elem is None:
                continue

            fx, fy, fz = elem["from"]
            tx, ty, tz = elem["to"]
            size = [tx - fx, ty - fy, tz - fz]
            uv   = elem.get("uv_offset", [0, 0])

            cubes.append({
                "origin": [fx, fy, fz],
                "size":   size,
                "uv":     uv,
            })

        bones.append({
            "name":   name,
            "pivot":  pivot,
            "cubes":  cubes,
        })

    return {
        "format_version": "1.12.0",
        "minecraft:geometry": [
            {
                "description": {
                    "identifier":            f"geometry.{identifier}",
                    "texture_width":         tex_w,
                    "texture_height":        tex_h,
                    "visible_bounds_width":  2,
                    "visible_bounds_height": 2,
                    "visible_bounds_offset": [0, 0, 0],
                },
                "bones": bones,
            }
        ],
    }


def process_folder(source_dir: Path):
    ok = []
    skipped = []
    errors = []

    for export_dir in sorted(source_dir.iterdir()):
        if not export_dir.is_dir():
            continue

        folder_name = export_dir.name
        mod_name = NAME_MAP.get(folder_name)
        if mod_name is None:
            skipped.append(f"{folder_name} (no mapping)")
            continue

        geo_src = export_dir / f"{folder_name}.geo.json"
        png_src = export_dir / f"{folder_name}.png"

        if not geo_src.exists():
            errors.append(f"{folder_name}: geo.json not found")
            continue

        # Convert geo.json
        try:
            with open(geo_src, encoding="utf-8") as f:
                bb_data = json.load(f)

            converted = convert(bb_data, mod_name)

            geo_dst = GEO_OUT / f"{mod_name}.geo.json"
            with open(geo_dst, "w", encoding="utf-8") as f:
                json.dump(converted, f, indent=2)
        except Exception as e:
            errors.append(f"{folder_name}: conversion failed — {e}")
            continue

        # Copy PNG texture
        if png_src.exists():
            tex_dst = TEX_OUT / f"{mod_name}.png"
            shutil.copy2(png_src, tex_dst)
            ok.append(f"{folder_name} -> {mod_name}  [geo + texture]")
        else:
            ok.append(f"{folder_name} -> {mod_name}  [geo only, no PNG]")

    return ok, skipped, errors


def main():
    GEO_OUT.mkdir(parents=True, exist_ok=True)
    TEX_OUT.mkdir(parents=True, exist_ok=True)

    total_ok = []
    total_skipped = []
    total_errors = []

    for source in SOURCES:
        print(f"\nProcessing: {source}")
        ok, skipped, errors = process_folder(source)
        total_ok.extend(ok)
        total_skipped.extend(skipped)
        total_errors.extend(errors)

    print(f"\n{'='*60}")
    print(f"Converted:  {len(total_ok)}")
    print(f"Skipped:    {len(total_skipped)}")
    print(f"Errors:     {len(total_errors)}")

    if total_ok:
        print("\n[OK]")
        for m in total_ok:
            print(f"  {m}")

    if total_skipped:
        print("\n[SKIPPED]")
        for m in total_skipped:
            print(f"  {m}")

    if total_errors:
        print("\n[ERROR]")
        for m in total_errors:
            print(f"  {m}")


if __name__ == "__main__":
    main()

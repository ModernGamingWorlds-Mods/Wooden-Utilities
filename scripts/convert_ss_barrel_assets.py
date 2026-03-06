"""
Convert Sophisticated Storage barrel Blockbench projects to GeckoLib assets.

All 395 barrels (79 wood types × 5 tiers) share identical geometry.
Outputs:
  - ONE shared geo: geo/block/ss_barrel.geo.json
  - 395 textures:  textures/geo/barrel/ss_{wood_key}_{ss_tier}.png

Folder name format: Barrel_{wood_key}_{folder_tier}
  folder_tier → ss_tier:  wood→barrel  iron→iron_barrel  gold→gold_barrel
                           diamond→diamond_barrel  netherite→netherite_barrel
"""

import json
import shutil
from pathlib import Path

# ── Paths ──────────────────────────────────────────────────────────────────────
MOD_ROOT = Path(r"C:\Users\conno\Documents\Wooden-Utilities")
GEO_OUT  = MOD_ROOT / "src/main/resources/assets/woodenutilities/geo/block"
TEX_OUT  = MOD_ROOT / "src/main/resources/assets/woodenutilities/textures/geo/barrel"

SOURCE = Path(r"C:\Users\conno\Downloads\All_Wood_Tier_Barrels\Output\2026-03-03_12-18")

# Folder tier suffix → SS tier name (matches SS's BlockEntityType registry paths)
TIER_MAP = {
    "_wood":      "barrel",
    "_iron":      "iron_barrel",
    "_gold":      "gold_barrel",
    "_diamond":   "diamond_barrel",
    "_netherite": "netherite_barrel",
}

# ── Conversion ──────────────────────────────────────────────────────────────────
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
        for child_uuid in entry["children"]:
            elem = uuid_to_elem.get(child_uuid)
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
    """Returns (wood_key, ss_tier) or (None, None) if not a barrel folder."""
    if not folder_name.startswith("Barrel_"):
        return None, None
    base = folder_name[len("Barrel_"):]
    for suffix, ss_tier in TIER_MAP.items():
        if base.endswith(suffix):
            return base[:-len(suffix)], ss_tier
    return None, None


def main():
    GEO_OUT.mkdir(parents=True, exist_ok=True)
    TEX_OUT.mkdir(parents=True, exist_ok=True)

    geo_converted = False
    tex_ok = []
    tex_missing = []
    skipped = []
    errors = []

    for export_dir in sorted(SOURCE.iterdir()):
        if not export_dir.is_dir():
            continue

        folder_name = export_dir.name
        wood_key, ss_tier = parse_folder(folder_name)
        if wood_key is None:
            skipped.append(folder_name)
            continue

        geo_src = export_dir / f"{folder_name}.geo.json"
        png_src = export_dir / f"{folder_name}.png"

        # Convert geo exactly once (all files share identical geometry)
        if not geo_converted:
            if geo_src.exists():
                try:
                    with open(geo_src, encoding="utf-8") as f:
                        bb_data = json.load(f)
                    converted = convert_geo(bb_data, "ss_barrel")
                    geo_dst = GEO_OUT / "ss_barrel.geo.json"
                    with open(geo_dst, "w", encoding="utf-8") as f:
                        json.dump(converted, f, indent=2)
                    geo_converted = True
                    print(f"[GEO] Converted shared geo from {folder_name} -> ss_barrel.geo.json")
                except Exception as e:
                    errors.append(f"Geo conversion failed ({folder_name}): {e}")
            else:
                errors.append(f"No geo.json in {folder_name}")

        # Copy texture for every barrel variant
        tex_name = f"ss_{wood_key}_{ss_tier}.png"
        if png_src.exists():
            shutil.copy2(png_src, TEX_OUT / tex_name)
            tex_ok.append(f"{folder_name} → {tex_name}")
        else:
            tex_missing.append(f"{folder_name}: no PNG")

    print(f"\n{'='*60}")
    print(f"Geo:      {'OK (ss_barrel.geo.json)' if geo_converted else 'FAILED'}")
    print(f"Textures: {len(tex_ok)} copied, {len(tex_missing)} missing")
    print(f"Skipped:  {len(skipped)}")
    print(f"Errors:   {len(errors)}")

    if errors:
        print("\n[ERRORS]")
        for e in errors:
            print(f"  {e}")

    if tex_missing:
        print("\n[MISSING PNGs]")
        for m in tex_missing:
            print(f"  {m}")


if __name__ == "__main__":
    main()

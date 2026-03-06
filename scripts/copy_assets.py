"""
Script 1: copy_assets.py
Copies textures and barrel geo assets from Downloads to project.
Run from repo root: python scripts/copy_assets.py
"""

import shutil
from pathlib import Path

WOODS = [
    "african_blackwood", "banyan", "black_walnut", "bloodwood", "bristlecone_pine",
    "cork_oak", "dragon_blood", "kapok", "larch", "sandalwood",
    "sycamore", "teak", "wenge", "zebrawood"
]

REPO_ROOT = Path(__file__).parent.parent
DOWNLOADS = Path(r"C:\Users\conno\Downloads")

WOOD_MOD_TEXTURES = DOWNLOADS / "wood_mod_textures"
NEW_WOOD_BARRELS = DOWNLOADS / "New_Wood_Barrels" / "Output" / "2026-03-02_16-15"

ASSETS = REPO_ROOT / "src" / "main" / "resources" / "assets" / "woodenutilities"
TEX_BLOCK = ASSETS / "textures" / "block"
TEX_ITEM  = ASSETS / "textures" / "item"
TEX_SIGNS = ASSETS / "textures" / "entity" / "signs"
GEO_BLOCK = ASSETS / "geo" / "block"
TEX_GEO   = ASSETS / "textures" / "geo" / "barrel"

BLOCK_TEXTURE_FILES = [
    "{wood}_leaves.png",
    "{wood}_log_side.png",
    "{wood}_log_top.png",
    "{wood}_planks.png",
    "{wood}_sapling.png",
    "{wood}_stripped_log_side.png",
    "{wood}_stripped_log_top.png",
    "{wood}_stripped_wood.png",
    "{wood}_wood.png",
]

SIGN_TEXTURE_FILES = [
    "{wood}.png",
    "{wood}_boat.png",
    "{wood}_chest_boat.png",
    "{wood}_hanging_sign.png",
    "{wood}_sign.png",
]

ITEM_TEXTURE_FILES = [
    "{wood}_boat.png",
    "{wood}_chest_boat.png",
    "{wood}_hanging_sign.png",
    "{wood}_sign.png",
]


def ensure(path: Path) -> Path:
    path.mkdir(parents=True, exist_ok=True)
    return path


def copy_file(src: Path, dst: Path) -> bool:
    if not src.exists():
        print(f"  [MISSING] {src}")
        return False
    ensure(dst.parent)
    shutil.copy2(src, dst)
    print(f"  [COPIED]  {src.name}  ->  {dst}")
    return True


def main():
    copied = 0
    missing = 0

    for wood in WOODS:
        print(f"\n=== {wood} ===")

        # Block textures
        src_block = WOOD_MOD_TEXTURES / wood / "textures" / "block"
        for tpl in BLOCK_TEXTURE_FILES:
            fname = tpl.format(wood=wood)
            ok = copy_file(src_block / fname, TEX_BLOCK / fname)
            copied += ok
            missing += not ok

        # Entity sign textures
        src_signs = WOOD_MOD_TEXTURES / wood / "textures" / "entity" / "signs"
        for tpl in SIGN_TEXTURE_FILES:
            fname = tpl.format(wood=wood)
            src = src_signs / fname
            if tpl == "{wood}.png":
                # {wood}.png -> entity/signs/{wood}.png (keep as-is)
                dst = TEX_SIGNS / fname
            else:
                # other sign entity textures also go in entity/signs/
                dst = TEX_SIGNS / fname
            ok = copy_file(src, dst)
            copied += ok
            missing += not ok

        # Item textures
        src_items = WOOD_MOD_TEXTURES / wood / "textures" / "item"
        for tpl in ITEM_TEXTURE_FILES:
            fname = tpl.format(wood=wood)
            ok = copy_file(src_items / fname, TEX_ITEM / fname)
            copied += ok
            missing += not ok

        # Barrel geo model
        barrel_dir = NEW_WOOD_BARRELS / f"Barrel_{wood}"
        geo_src = barrel_dir / f"Barrel_{wood}.geo.json"
        geo_dst = GEO_BLOCK / f"{wood}_wooden_barrel.geo.json"
        ok = copy_file(geo_src, geo_dst)
        copied += ok
        missing += not ok

        # Barrel texture
        tex_src = barrel_dir / f"Barrel_{wood}.png"
        tex_dst = TEX_GEO / f"{wood}_wooden_barrel.png"
        ok = copy_file(tex_src, tex_dst)
        copied += ok
        missing += not ok

    print(f"\nDone. Copied: {copied}, Missing: {missing}")


if __name__ == "__main__":
    main()

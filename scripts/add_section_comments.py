"""
add_section_comments.py
Inserts ecosystem section headers into ModBlocks.java and ModItems.java.
Run from repo root: python scripts/add_section_comments.py
"""
import os

ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))

TF_H  = "    // \u2500\u2500 Twilight Forest \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n"
BOP_H = "    // \u2500\u2500 Biomes O'Plenty \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n"
DA_H  = "    // \u2500\u2500 Deep Aether \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n"
AE_H  = "    // \u2500\u2500 Aether \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n"
BWG_H = "    // \u2500\u2500 Biomes We've Gone \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n"
VAN_H = "    // \u2500\u2500 Vanilla \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n"
NEW_H = "    // \u2500\u2500 New Custom Woods \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n"


def section_header(title):
    """Generate a section header for a block type group."""
    dashes = "\u2500" * (58 - len(title))
    return f"    // \u2500\u2500 {title} {dashes}\n"


def replace_once(src, old, new, label=""):
    if old not in src:
        print(f"  MISSING: {label or old[:60]!r}")
        return src
    count = src.count(old)
    if count > 1:
        print(f"  WARN ({count}x): {label or old[:60]!r}")
    else:
        print(f"  OK: {label or old[:60]!r}")
    return src.replace(old, new, 1)


def add_ecosystem_headers(src, block_type, holder_type, cons_call):
    """Add ecosystem section headers to a block type's registration group.

    block_type: e.g. "WOODEN_CAULDRON"
    holder_type: "DeferredHolder<Block, Block>" or "RegistryObject<Block>"
    cons_call: e.g. "cauldronProps()"
    """
    prefix = f"    public static final {holder_type} "
    # The transitions are: after last Vanilla entry → before first TF entry, etc.
    transitions = [
        ("TWILIGHT_OAK_" + block_type, TF_H),
        ("FIR_" + block_type, BOP_H),
        ("ROSEROOT_" + block_type, DA_H),
        ("SKYROOT_" + block_type, AE_H),
        ("ASPEN_" + block_type, BWG_H),
    ]
    for field_name, header in transitions:
        anchor = prefix + field_name + " = BLOCKS.register"
        if anchor in src:
            src = replace_once(src, anchor, "\n" + header + anchor,
                               f"Before {field_name}")
        else:
            # Try without BLOCKS.register (RegistryObject pattern is slightly different)
            anchor2 = prefix + field_name + " ="
            if anchor2 in src:
                src = replace_once(src, anchor2, "\n" + header + anchor2,
                                   f"Before {field_name}")
            else:
                print(f"  MISSING transition: {field_name}")
    return src


def patch_modblocks():
    path = os.path.join(ROOT, "src", "main", "java", "com", "moderngamingworld",
                        "woodenutilities", "registry", "ModBlocks.java")
    with open(path, encoding="utf-8") as f:
        src = f.read()

    NEO = "DeferredHolder<Block, Block>"
    FORGE = "RegistryObject<Block>"

    # ── NeoForge section (inside /* */) ──
    print("--- NeoForge Cauldrons ---")
    src = replace_once(src,
        "    /*public static final DeferredHolder<Block, Block> OAK_WOODEN_CAULDRON",
        "    " + section_header("Wooden Cauldrons") + "    " + VAN_H +
        "    /*public static final DeferredHolder<Block, Block> OAK_WOODEN_CAULDRON",
        "Cauldron section header")
    src = add_ecosystem_headers(src, "WOODEN_CAULDRON", NEO, "cauldronProps()")

    print("--- NeoForge Barrels ---")
    src = replace_once(src,
        '    public static final DeferredHolder<Block, Block> WOODEN_BARREL = BLOCKS.register("wooden_barrel",',
        "    " + section_header("Wooden Barrels") + "    " + VAN_H +
        '    public static final DeferredHolder<Block, Block> WOODEN_BARREL = BLOCKS.register("wooden_barrel",',
        "Barrel section header")
    src = add_ecosystem_headers(src, "WOODEN_BARREL", NEO, "barrelProps()")

    print("--- NeoForge Hoppers ---")
    src = replace_once(src,
        '    public static final DeferredHolder<Block, Block> OAK_WOODEN_HOPPER = BLOCKS.register("oak_wooden_hopper",',
        "    " + section_header("Wooden Hoppers") + "    " + VAN_H +
        '    public static final DeferredHolder<Block, Block> OAK_WOODEN_HOPPER = BLOCKS.register("oak_wooden_hopper",',
        "Hopper section header")
    src = add_ecosystem_headers(src, "WOODEN_HOPPER", NEO, "hopperProps()")

    print("--- NeoForge Crafting Slabs ---")
    src = replace_once(src,
        '    public static final DeferredHolder<Block, Block> OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("oak_wooden_crafting_table_slab",',
        "    " + section_header("Wooden Crafting Table Slabs") + "    " + VAN_H +
        '    public static final DeferredHolder<Block, Block> OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("oak_wooden_crafting_table_slab",',
        "CTS section header")
    src = add_ecosystem_headers(src, "WOODEN_CRAFTING_TABLE_SLAB", NEO, "craftingTableProps()")

    print("--- NeoForge Chests ---")
    chest_start = '    // \u2500\u2500 Wooden Chests (NeoForge) \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n'
    if chest_start in src:
        # Replace the existing header with one that includes VAN_H
        src = replace_once(src, chest_start,
            "    " + section_header("Wooden Chests") + "    " + VAN_H,
            "Chest section header (replacing existing)")
        src = add_ecosystem_headers(src, "WOODEN_CHEST", NEO, "chestProps()")
    else:
        print("  NeoForge chest section header not found")

    # ── Forge section (RegistryObject) ──
    print("--- Forge Cauldrons ---")
    src = replace_once(src,
        '    public static final RegistryObject<Block> OAK_WOODEN_CAULDRON = BLOCKS.register("oak_wooden_cauldron",',
        "    " + section_header("Wooden Cauldrons") + "    " + VAN_H +
        '    public static final RegistryObject<Block> OAK_WOODEN_CAULDRON = BLOCKS.register("oak_wooden_cauldron",',
        "Forge Cauldron section header")
    src = add_ecosystem_headers(src, "WOODEN_CAULDRON", FORGE, "cauldronProps()")

    print("--- Forge Barrels ---")
    src = replace_once(src,
        '    public static final RegistryObject<Block> WOODEN_BARREL = BLOCKS.register("wooden_barrel",',
        "    " + section_header("Wooden Barrels") + "    " + VAN_H +
        '    public static final RegistryObject<Block> WOODEN_BARREL = BLOCKS.register("wooden_barrel",',
        "Forge Barrel section header")
    src = add_ecosystem_headers(src, "WOODEN_BARREL", FORGE, "barrelProps()")

    print("--- Forge Hoppers ---")
    src = replace_once(src,
        '    public static final RegistryObject<Block> OAK_WOODEN_HOPPER = BLOCKS.register("oak_wooden_hopper",',
        "    " + section_header("Wooden Hoppers") + "    " + VAN_H +
        '    public static final RegistryObject<Block> OAK_WOODEN_HOPPER = BLOCKS.register("oak_wooden_hopper",',
        "Forge Hopper section header")
    src = add_ecosystem_headers(src, "WOODEN_HOPPER", FORGE, "hopperProps()")

    print("--- Forge Crafting Slabs ---")
    src = replace_once(src,
        '    public static final RegistryObject<Block> OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("oak_wooden_crafting_table_slab",',
        "    " + section_header("Wooden Crafting Table Slabs") + "    " + VAN_H +
        '    public static final RegistryObject<Block> OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("oak_wooden_crafting_table_slab",',
        "Forge CTS section header")
    src = add_ecosystem_headers(src, "WOODEN_CRAFTING_TABLE_SLAB", FORGE, "craftingTableProps()")

    print("--- Forge Chests ---")
    forge_chest_start = '    // \u2500\u2500 Wooden Chests (Forge) \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n'
    if forge_chest_start in src:
        src = replace_once(src, forge_chest_start,
            "    " + section_header("Wooden Chests") + "    " + VAN_H,
            "Forge chest header")
        src = add_ecosystem_headers(src, "WOODEN_CHEST", FORGE, "chestProps()")
    else:
        print("  Forge chest header not found")

    with open(path, "w", encoding="utf-8") as f:
        f.write(src)
    print("Patched ModBlocks.java")


if __name__ == "__main__":
    patch_modblocks()
    print("Done.")

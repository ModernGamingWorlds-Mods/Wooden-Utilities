#!/usr/bin/env python3
"""
add_chest_support.py
Adds WoodenChestBlock registrations to ModBlocks, ModItems, ModBlockEntities,
ModCreativeTabs, and generates all resource JSON files.
Run from the repo root: python scripts/add_chest_support.py
"""

import json
import os
import re

ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
SRC  = os.path.join(ROOT, "src", "main")
JAVA = os.path.join(SRC, "java", "com", "moderngamingworld", "woodenutilities")
RES  = os.path.join(SRC, "resources", "assets", "woodenutilities")
DATA = os.path.join(SRC, "resources", "data", "woodenutilities")

# ── Wood list ─────────────────────────────────────────────────────────────────
# (CONST_SUFFIX, registry_name, neoforge_only)
# CONST_SUFFIX → OAK_WOODEN_CHEST, registry_name → oak_wooden_chest
WOODS = [
    ("WOODEN",              "wooden",              False),  # generic fallback
    ("OAK_WOODEN",          "oak_wooden",          False),
    ("SPRUCE_WOODEN",       "spruce_wooden",       False),
    ("BIRCH_WOODEN",        "birch_wooden",        False),
    ("JUNGLE_WOODEN",       "jungle_wooden",       False),
    ("ACACIA_WOODEN",       "acacia_wooden",       False),
    ("DARK_OAK_WOODEN",     "dark_oak_wooden",     False),
    ("MANGROVE_WOODEN",     "mangrove_wooden",     False),
    ("CHERRY_WOODEN",       "cherry_wooden",       False),
    ("BAMBOO_WOODEN",       "bamboo_wooden",       False),
    ("CRIMSON_WOODEN",      "crimson_wooden",      False),
    ("WARPED_WOODEN",       "warped_wooden",       False),
    ("TWILIGHT_OAK_WOODEN", "twilight_oak_wooden", False),
    ("CANOPY_WOODEN",       "canopy_wooden",       False),
    ("TWILIGHT_MANGROVE_WOODEN", "twilight_mangrove_wooden", False),
    ("DARK_WOODEN",         "dark_wooden",         False),
    ("TIME_WOODEN",         "time_wooden",         False),
    ("TRANSFORMATION_WOODEN","transformation_wooden",False),
    ("MINING_WOODEN",       "mining_wooden",       False),
    ("SORTING_WOODEN",      "sorting_wooden",      False),
    ("TOWERWOOD_WOODEN",    "towerwood_wooden",    False),
    ("FIR_WOODEN",          "fir_wooden",          False),
    ("PINE_WOODEN",         "pine_wooden",         False),
    ("MAPLE_WOODEN",        "maple_wooden",        False),
    ("REDWOOD_WOODEN",      "redwood_wooden",      False),
    ("MAHOGANY_WOODEN",     "mahogany_wooden",     False),
    ("JACARANDA_WOODEN",    "jacaranda_wooden",    False),
    ("PALM_WOODEN",         "palm_wooden",         False),
    ("WILLOW_WOODEN",       "willow_wooden",       False),
    ("DEAD_WOODEN",         "dead_wooden",         False),
    ("MAGIC_WOODEN",        "magic_wooden",        False),
    ("UMBRAN_WOODEN",       "umbran_wooden",       False),
    ("HELLBARK_WOODEN",     "hellbark_wooden",     False),
    ("EMPYREAL_WOODEN",     "empyreal_wooden",     False),
    ("ROSEROOT_WOODEN",     "roseroot_wooden",     False),
    ("YAGROOT_WOODEN",      "yagroot_wooden",      False),
    ("CRUDEROOT_WOODEN",    "cruderoot_wooden",    False),
    ("CONBERRY_WOODEN",     "conberry_wooden",     False),
    ("SUNROOT_WOODEN",      "sunroot_wooden",      False),
    ("SKYROOT_WOODEN",      "skyroot_wooden",      False),
    ("ASPEN_WOODEN",        "aspen_wooden",        False),
    ("BAOBAB_WOODEN",       "baobab_wooden",       False),
    ("BLUE_ENCHANTED_WOODEN","blue_enchanted_wooden",False),
    ("CIKA_WOODEN",         "cika_wooden",         False),
    ("CYPRESS_WOODEN",      "cypress_wooden",      False),
    ("EBONY_WOODEN",        "ebony_wooden",        False),
    ("BWG_FIR_WOODEN",      "bwg_fir_wooden",      False),
    ("FLORUS_WOODEN",       "florus_wooden",       False),
    ("GREEN_ENCHANTED_WOODEN","green_enchanted_wooden",False),
    ("HOLLY_WOODEN",        "holly_wooden",        False),
    ("IRONWOOD_WOODEN",     "ironwood_wooden",     False),
    ("BWG_JACARANDA_WOODEN","bwg_jacaranda_wooden",False),
    ("BWG_MAHOGANY_WOODEN", "bwg_mahogany_wooden", False),
    ("BWG_MAPLE_WOODEN",    "bwg_maple_wooden",    False),
    ("BWG_PALM_WOODEN",     "bwg_palm_wooden",     False),
    ("BWG_PINE_WOODEN",     "bwg_pine_wooden",     False),
    ("RAINBOW_EUCALYPTUS_WOODEN","rainbow_eucalyptus_wooden",False),
    ("BWG_REDWOOD_WOODEN",  "bwg_redwood_wooden",  False),
    ("SAKURA_WOODEN",       "sakura_wooden",       False),
    ("SKYRIS_WOODEN",       "skyris_wooden",       False),
    ("SPIRIT_WOODEN",       "spirit_wooden",       True),   # NeoForge only
    ("WHITE_MANGROVE_WOODEN","white_mangrove_wooden",False),
    ("BWG_WILLOW_WOODEN",   "bwg_willow_wooden",   False),
    ("WITCH_HAZEL_WOODEN",  "witch_hazel_wooden",  False),
    ("ZELKOVA_WOODEN",      "zelkova_wooden",      False),
    ("AFRICAN_BLACKWOOD_WOODEN","african_blackwood_wooden",False),
    ("BANYAN_WOODEN",       "banyan_wooden",       False),
    ("BLACK_WALNUT_WOODEN", "black_walnut_wooden", False),
    ("BLOODWOOD_WOODEN",    "bloodwood_wooden",    False),
    ("BRISTLECONE_PINE_WOODEN","bristlecone_pine_wooden",False),
    ("CORK_OAK_WOODEN",     "cork_oak_wooden",     False),
    ("DRAGON_BLOOD_WOODEN", "dragon_blood_wooden", False),
    ("KAPOK_WOODEN",        "kapok_wooden",        False),
    ("LARCH_WOODEN",        "larch_wooden",        False),
    ("SANDALWOOD_WOODEN",   "sandalwood_wooden",   False),
    ("SYCAMORE_WOODEN",     "sycamore_wooden",     False),
    ("TEAK_WOODEN",         "teak_wooden",         False),
    ("WENGE_WOODEN",        "wenge_wooden",        False),
    ("ZEBRAWOOD_WOODEN",    "zebrawood_wooden",    False),
]

def reg_name(suffix):   return suffix.lower() + "_chest"
def const_name(suffix): return suffix + "_CHEST"
def field_name(suffix): return suffix + "_WOODEN_CHEST"  # not used directly
# convenience
def chest_reg(suffix):  return suffix.lower() + "_chest"

# ── ModBlocks.java ────────────────────────────────────────────────────────────
def build_blocks_neo():
    lines = []
    lines.append("    // ── Wooden Chests (NeoForge) ────────────────────────────────────────────")
    for suf, reg, neo_only in WOODS:
        cname = suf + "_CHEST"
        rname = reg + "_chest"
        if neo_only:
            lines.append("    //? if neoforge {")
            lines.append(f'    /*public static final DeferredHolder<Block, Block> {cname} = BLOCKS.register("{rname}",')
            lines.append( '        () -> new WoodenChestBlock(chestProps()));')
            lines.append( '    *///?}')
        else:
            lines.append(f'    public static final DeferredHolder<Block, Block> {cname} = BLOCKS.register("{rname}",')
            lines.append( '        () -> new WoodenChestBlock(chestProps()));')
    return "\n".join(lines) + "\n"

def build_blocks_forge():
    lines = []
    lines.append("    // ── Wooden Chests (Forge) ───────────────────────────────────────────────")
    for suf, reg, neo_only in WOODS:
        cname = suf + "_CHEST"
        rname = reg + "_chest"
        if neo_only:
            lines.append("    //? if neoforge {")
            lines.append(f'    /*public static final RegistryObject<Block> {cname} = BLOCKS.register("{rname}",')
            lines.append( '        () -> new WoodenChestBlock(chestProps()));')
            lines.append( '    *///?}')
        else:
            lines.append(f'    public static final RegistryObject<Block> {cname} = BLOCKS.register("{rname}",')
            lines.append( '        () -> new WoodenChestBlock(chestProps()));')
    return "\n".join(lines) + "\n"

def patch_modblocks():
    path = os.path.join(JAVA, "registry", "ModBlocks.java")
    with open(path, encoding="utf-8") as f:
        src = f.read()

    # Check already patched
    if "WOODEN_CHEST" in src:
        print("ModBlocks.java already has chest entries — skipping.")
        return

    # Add import
    src = src.replace(
        "import com.moderngamingworld.woodenutilities.WoodenBarrelBlock;",
        "import com.moderngamingworld.woodenutilities.WoodenBarrelBlock;\nimport com.moderngamingworld.woodenutilities.WoodenChestBlock;"
    )

    # Add chestProps() helper after barrelProps() in both sections.
    # We detect the barrelProps() helper and add chestProps() after it.
    src = src.replace(
        "private static BlockBehaviour.Properties barrelProps() { return BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL); }",
        "private static BlockBehaviour.Properties barrelProps() { return BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL); }\n    private static BlockBehaviour.Properties chestProps()  { return BlockBehaviour.Properties.ofFullCopy(Blocks.CHEST); }"
    )
    # Forge section uses copy() instead of ofFullCopy()
    src = src.replace(
        "private static BlockBehaviour.Properties barrelProps() { return BlockBehaviour.Properties.copy(Blocks.BARREL); }",
        "private static BlockBehaviour.Properties barrelProps() { return BlockBehaviour.Properties.copy(Blocks.BARREL); }\n    private static BlockBehaviour.Properties chestProps()  { return BlockBehaviour.Properties.copy(Blocks.CHEST); }"
    )

    # Insert NeoForge chest entries before the NeoForge section closes (*///?})
    # The NeoForge section ends with the last barrel line then "*///?}"
    neo_marker = '        () -> new WoodenBarrelBlock(barrelProps()));\n    *///?}'
    if neo_marker in src:
        src = src.replace(
            neo_marker,
            '        () -> new WoodenBarrelBlock(barrelProps()));\n\n' + build_blocks_neo() + '    *///?}'
        )

    # Insert Forge chest entries before the Forge section closes (//?})
    forge_marker = '        () -> new WoodenBarrelBlock(barrelProps()));\n\n    //?}\n\n    private ModBlocks'
    if forge_marker in src:
        src = src.replace(
            forge_marker,
            '        () -> new WoodenBarrelBlock(barrelProps()));\n\n' + build_blocks_forge() + '\n    //?}\n\n    private ModBlocks'
        )
    else:
        # Try alternate ending
        forge_marker2 = '        () -> new WoodenBarrelBlock(barrelProps()));\n\n    //?}'
        if forge_marker2 in src:
            src = src.replace(
                forge_marker2,
                '        () -> new WoodenBarrelBlock(barrelProps()));\n\n' + build_blocks_forge() + '\n    //?}'
            )

    with open(path, "w", encoding="utf-8") as f:
        f.write(src)
    print("Patched ModBlocks.java")

# ── ModItems.java ─────────────────────────────────────────────────────────────
def build_items_neo():
    lines = []
    lines.append("    // ── Wooden Chest Items (NeoForge) ───────────────────────────────────────")
    for suf, reg, neo_only in WOODS:
        cname = suf + "_CHEST"
        rname = reg + "_chest"
        block_ref = f"ModBlocks.{cname}.get()"
        if neo_only:
            lines.append("    //? if neoforge {")
            lines.append(f'    /*public static final DeferredItem<Item> {cname} = ITEMS.register("{rname}",')
            lines.append(f'        () -> new WoodenChestBlockItem({block_ref}, new Item.Properties()));')
            lines.append( '    *///?}')
        else:
            lines.append(f'    public static final DeferredItem<Item> {cname} = ITEMS.register("{rname}",')
            lines.append(f'        () -> new WoodenChestBlockItem({block_ref}, new Item.Properties()));')
    return "\n".join(lines) + "\n"

def build_items_forge():
    lines = []
    lines.append("    // ── Wooden Chest Items (Forge) ──────────────────────────────────────────")
    for suf, reg, neo_only in WOODS:
        cname = suf + "_CHEST"
        rname = reg + "_chest"
        block_ref = f"ModBlocks.{cname}.get()"
        if neo_only:
            lines.append("    //? if neoforge {")
            lines.append(f'    /*public static final RegistryObject<Item> {cname} = ITEMS.register("{rname}",')
            lines.append(f'        () -> new WoodenChestBlockItem({block_ref}, new Item.Properties()));')
            lines.append( '    *///?}')
        else:
            lines.append(f'    public static final RegistryObject<Item> {cname} = ITEMS.register("{rname}",')
            lines.append(f'        () -> new WoodenChestBlockItem({block_ref}, new Item.Properties()));')
    return "\n".join(lines) + "\n"

def patch_moditems():
    path = os.path.join(JAVA, "registry", "ModItems.java")
    with open(path, encoding="utf-8") as f:
        src = f.read()

    if "WOODEN_CHEST" in src:
        print("ModItems.java already has chest entries — skipping.")
        return

    # Add import
    src = src.replace(
        "import com.moderngamingworld.woodenutilities.WoodenBarrelBlockItem;",
        "import com.moderngamingworld.woodenutilities.WoodenBarrelBlockItem;\nimport com.moderngamingworld.woodenutilities.WoodenChestBlockItem;"
    )

    # Find the last barrel item in NeoForge section and insert after
    neo_barrel_end = re.search(
        r'(ZEBRAWOOD_WOODEN_BARREL = ITEMS\.register\("zebrawood_wooden_barrel".*?\)\);)',
        src, re.DOTALL
    )
    if neo_barrel_end:
        # Find the *///?} that follows this match
        pos = neo_barrel_end.end()
        neo_close = src.find('*///?}', pos)
        if neo_close != -1:
            src = src[:neo_close] + '\n' + build_items_neo() + src[neo_close:]

    # Find the last barrel item in Forge section and insert after
    # The Forge section is the non-commented one; find the second ZEBRAWOOD_WOODEN_BARREL occurrence
    occurrences = [m.end() for m in re.finditer(
        r'ZEBRAWOOD_WOODEN_BARREL = ITEMS\.register\("zebrawood_wooden_barrel".*?\)\);',
        src, re.DOTALL
    )]
    if len(occurrences) >= 2:
        pos = occurrences[-1]
        # Find the next //?} after this
        forge_close = src.find('//?}', pos)
        if forge_close != -1:
            src = src[:forge_close] + build_items_forge() + '\n    ' + src[forge_close:]

    with open(path, "w", encoding="utf-8") as f:
        f.write(src)
    print("Patched ModItems.java")

# ── ModBlockEntities.java ─────────────────────────────────────────────────────
def build_be_neo():
    lines = []
    lines.append("    //? if neoforge {")
    lines.append("    /*public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenChestBlockEntity>> WOODEN_CHEST =")
    lines.append("    *///?} else {")
    lines.append("    public static final RegistryObject<BlockEntityType<WoodenChestBlockEntity>> WOODEN_CHEST =")
    lines.append("    //?}")
    lines.append('            BLOCK_ENTITIES.register("wooden_chest", () ->')
    lines.append('                    BlockEntityType.Builder.of(WoodenChestBlockEntity::new,')
    for suf, reg, neo_only in WOODS:
        cname = suf + "_CHEST"
        if neo_only:
            lines.append("                            //? if neoforge {")
            lines.append(f"                            /*ModBlocks.{cname}.get(),")
            lines.append("                            *///?}")
        else:
            lines.append(f"                            ModBlocks.{cname}.get(),")
    # Remove trailing comma from last line and close
    # The last line added ends with a comma; replace it
    last = lines[-1]
    lines[-1] = last.rstrip(",") + ""
    lines.append("                    ).build(null));")
    return "\n".join(lines) + "\n"

def patch_modblockentities():
    path = os.path.join(JAVA, "registry", "ModBlockEntities.java")
    with open(path, encoding="utf-8") as f:
        src = f.read()

    if "WOODEN_CHEST" in src:
        print("ModBlockEntities.java already has chest entry — skipping.")
        return

    # Add import
    src = src.replace(
        "import com.moderngamingworld.woodenutilities.WoodenBarrelBlockEntity;",
        "import com.moderngamingworld.woodenutilities.WoodenBarrelBlockEntity;\nimport com.moderngamingworld.woodenutilities.WoodenChestBlockEntity;"
    )

    # Insert WOODEN_CHEST registration before the WOODEN_HOPPER registration
    src = src.replace(
        "    //? if neoforge {\n    /*public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenHopperBlockEntity>> WOODEN_HOPPER =",
        build_be_neo() + "\n    //? if neoforge {\n    /*public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenHopperBlockEntity>> WOODEN_HOPPER ="
    )

    with open(path, "w", encoding="utf-8") as f:
        f.write(src)
    print("Patched ModBlockEntities.java")

# ── ModCreativeTabs.java ──────────────────────────────────────────────────────
def build_creative_tab():
    lines = []
    lines.append("            // ── Wooden Chests ────────────────────────────────────────────────────")
    for suf, reg, neo_only in WOODS:
        cname = suf + "_CHEST"
        if neo_only:
            lines.append("            //? if neoforge {")
            lines.append(f"            /*output.accept(ModItems.{cname}.get());")
            lines.append("            *///?}")
        else:
            lines.append(f"            output.accept(ModItems.{cname}.get());")
    return "\n".join(lines) + "\n"

def patch_creativetabs():
    path = os.path.join(JAVA, "registry", "ModCreativeTabs.java")
    with open(path, encoding="utf-8") as f:
        src = f.read()

    if "WOODEN_CHEST" in src:
        print("ModCreativeTabs.java already has chest entries — skipping.")
        return

    # Insert chest items after the barrel section ends in the storage tab
    # Find "// ── Wooden Hoppers" marker in the storage tab and insert before it
    marker = "            // ── Wooden Hoppers"
    if marker in src:
        src = src.replace(marker, build_creative_tab() + "\n" + marker)
    else:
        # Fallback: insert before closing the storage tab output block
        # Look for ZEBRAWOOD barrel accept and insert after
        src = src.replace(
            "output.accept(ModItems.ZEBRAWOOD_WOODEN_BARREL.get());",
            "output.accept(ModItems.ZEBRAWOOD_WOODEN_BARREL.get());\n\n" + build_creative_tab()
        )

    with open(path, "w", encoding="utf-8") as f:
        f.write(src)
    print("Patched ModCreativeTabs.java")

# ── Resource JSON generation ──────────────────────────────────────────────────
def write_json(path, data):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w", encoding="utf-8") as f:
        json.dump(data, f, indent=2)

def gen_blockstates():
    bs_dir = os.path.join(RES, "blockstates")
    for suf, reg, _ in WOODS:
        name = reg + "_chest"
        path = os.path.join(bs_dir, name + ".json")
        if os.path.exists(path):
            continue
        # Stub blockstate — GeckoLib handles rendering; baked model unused for SINGLE/LEFT,
        # RIGHT uses INVISIBLE. Point all variants to a harmless model so the game doesn't crash.
        data = {"variants": {"": {"model": "minecraft:block/oak_planks"}}}
        write_json(path, data)

def gen_item_models():
    im_dir = os.path.join(RES, "models", "item")
    # Base display parent (reuse barrel display transforms)
    base_path = os.path.join(im_dir, "wooden_chest_display.json")
    if not os.path.exists(base_path):
        base = {
            "parent": "builtin/entity",
            "display": {
                "gui":        {"rotation": [30, 225, 0], "translation": [0, -6, 0], "scale": [0.625, 0.625, 0.625]},
                "ground":     {"rotation": [0, 0, 0],   "translation": [0, 3, 0],  "scale": [0.25, 0.25, 0.25]},
                "fixed":      {"rotation": [0, 180, 0], "translation": [0, 0, 0],  "scale": [0.5, 0.5, 0.5]},
                "thirdperson_righthand": {"rotation": [75, 315, 0], "translation": [0, 2.5, 0], "scale": [0.375, 0.375, 0.375]},
                "firstperson_righthand": {"rotation": [0, 315, 0],  "translation": [0, 0, 0],   "scale": [0.4, 0.4, 0.4]}
            }
        }
        write_json(base_path, base)

    for suf, reg, _ in WOODS:
        name = reg + "_chest"
        path = os.path.join(im_dir, name + ".json")
        if os.path.exists(path):
            continue
        write_json(path, {"parent": "woodenutilities:item/wooden_chest_display"})

def gen_lang():
    lang_path = os.path.join(RES, "lang", "en_us.json")
    with open(lang_path, encoding="utf-8") as f:
        lang = json.load(f)

    for suf, reg, _ in WOODS:
        name = reg + "_chest"
        key = f"block.woodenutilities.{name}"
        if key not in lang:
            # Build pretty name from suffix
            pretty = suf.replace("_WOODEN", "").replace("_", " ").title().strip()
            if pretty:
                lang[key] = f"{pretty} Wooden Chest"
            else:
                lang[key] = "Wooden Chest"

    # Sort for tidiness
    lang = dict(sorted(lang.items()))
    with open(lang_path, "w", encoding="utf-8") as f:
        json.dump(lang, f, indent=2, ensure_ascii=False)
    print("Updated en_us.json with chest names.")

def gen_recipes():
    rec_dir = os.path.join(DATA, "recipes")
    # Planks key per wood registry prefix (everything before _wooden)
    planks_map = {
        "wooden":              "minecraft:oak_planks",  # generic uses oak
        "oak_wooden":          "minecraft:oak_planks",
        "spruce_wooden":       "minecraft:spruce_planks",
        "birch_wooden":        "minecraft:birch_planks",
        "jungle_wooden":       "minecraft:jungle_planks",
        "acacia_wooden":       "minecraft:acacia_planks",
        "dark_oak_wooden":     "minecraft:dark_oak_planks",
        "mangrove_wooden":     "minecraft:mangrove_planks",
        "cherry_wooden":       "minecraft:cherry_planks",
        "bamboo_wooden":       "minecraft:bamboo_planks",
        "crimson_wooden":      "minecraft:crimson_planks",
        "warped_wooden":       "minecraft:warped_planks",
        "twilight_oak_wooden": "twilightforest:twilight_oak_planks",
        "canopy_wooden":       "twilightforest:canopy_planks",
        "twilight_mangrove_wooden": "twilightforest:mangrove_planks",
        "dark_wooden":         "twilightforest:dark_planks",
        "time_wooden":         "twilightforest:time_planks",
        "transformation_wooden": "twilightforest:transformation_planks",
        "mining_wooden":       "twilightforest:mining_planks",
        "sorting_wooden":      "twilightforest:sorting_planks",
        "towerwood_wooden":    "twilightforest:towerwood_planks",
        "fir_wooden":          "biomesoplenty:fir_planks",
        "pine_wooden":         "biomesoplenty:pine_planks",
        "maple_wooden":        "biomesoplenty:maple_planks",
        "redwood_wooden":      "biomesoplenty:redwood_planks",
        "mahogany_wooden":     "biomesoplenty:mahogany_planks",
        "jacaranda_wooden":    "biomesoplenty:jacaranda_planks",
        "palm_wooden":         "biomesoplenty:palm_planks",
        "willow_wooden":       "biomesoplenty:willow_planks",
        "dead_wooden":         "biomesoplenty:dead_planks",
        "magic_wooden":        "biomesoplenty:magic_planks",
        "umbran_wooden":       "biomesoplenty:umbran_planks",
        "hellbark_wooden":     "biomesoplenty:hellbark_planks",
        "empyreal_wooden":     "biomesoplenty:empyreal_planks",
        "roseroot_wooden":     "deepaether:roseroot_planks",
        "yagroot_wooden":      "deepaether:yagroot_planks",
        "cruderoot_wooden":    "deepaether:cruderoot_planks",
        "conberry_wooden":     "deepaether:conberry_planks",
        "sunroot_wooden":      "deepaether:sunroot_planks",
        "skyroot_wooden":      "aether:skyroot_planks",
        "aspen_wooden":        "byg:aspen_planks",
        "baobab_wooden":       "byg:baobab_planks",
        "blue_enchanted_wooden": "byg:blue_enchanted_planks",
        "cika_wooden":         "byg:cika_planks",
        "cypress_wooden":      "byg:cypress_planks",
        "ebony_wooden":        "byg:ebony_planks",
        "bwg_fir_wooden":      "byg:fir_planks",
        "florus_wooden":       "byg:florus_planks",
        "green_enchanted_wooden": "byg:green_enchanted_planks",
        "holly_wooden":        "byg:holly_planks",
        "ironwood_wooden":     "byg:ironwood_planks",
        "bwg_jacaranda_wooden":"byg:jacaranda_planks",
        "bwg_mahogany_wooden": "byg:mahogany_planks",
        "bwg_maple_wooden":    "byg:maple_planks",
        "bwg_palm_wooden":     "byg:palm_planks",
        "bwg_pine_wooden":     "byg:pine_planks",
        "rainbow_eucalyptus_wooden": "byg:rainbow_eucalyptus_planks",
        "bwg_redwood_wooden":  "byg:redwood_planks",
        "sakura_wooden":       "byg:sakura_planks",
        "skyris_wooden":       "byg:skyris_planks",
        "spirit_wooden":       "byg:spirit_planks",
        "white_mangrove_wooden":"byg:white_mangrove_planks",
        "bwg_willow_wooden":   "byg:willow_planks",
        "witch_hazel_wooden":  "byg:witch_hazel_planks",
        "zelkova_wooden":      "byg:zelkova_planks",
        "african_blackwood_wooden": "woodenutilities:african_blackwood_planks",
        "banyan_wooden":       "woodenutilities:banyan_planks",
        "black_walnut_wooden": "woodenutilities:black_walnut_planks",
        "bloodwood_wooden":    "woodenutilities:bloodwood_planks",
        "bristlecone_pine_wooden": "woodenutilities:bristlecone_pine_planks",
        "cork_oak_wooden":     "woodenutilities:cork_oak_planks",
        "dragon_blood_wooden": "woodenutilities:dragon_blood_planks",
        "kapok_wooden":        "woodenutilities:kapok_planks",
        "larch_wooden":        "woodenutilities:larch_planks",
        "sandalwood_wooden":   "woodenutilities:sandalwood_planks",
        "sycamore_wooden":     "woodenutilities:sycamore_planks",
        "teak_wooden":         "woodenutilities:teak_planks",
        "wenge_wooden":        "woodenutilities:wenge_planks",
        "zebrawood_wooden":    "woodenutilities:zebrawood_planks",
    }

    for suf, reg, _ in WOODS:
        name = reg + "_chest"
        path = os.path.join(rec_dir, name + ".json")
        if os.path.exists(path):
            continue
        planks = planks_map.get(reg, "minecraft:oak_planks")
        recipe = {
            "type": "minecraft:crafting_shaped",
            "pattern": ["PPP", "P P", "PPP"],
            "key": {"P": {"item": planks}},
            "result": {"item": f"woodenutilities:{name}", "count": 1}
        }
        write_json(path, recipe)

def gen_loot_tables():
    lt_dir = os.path.join(DATA.replace("woodenutilities", ""), "data", "woodenutilities", "loot_tables", "blocks")
    # use DATA directly
    lt_dir = os.path.join(SRC, "resources", "data", "woodenutilities", "loot_tables", "blocks")
    for suf, reg, _ in WOODS:
        name = reg + "_chest"
        path = os.path.join(lt_dir, name + ".json")
        if os.path.exists(path):
            continue
        data = {
            "type": "minecraft:block",
            "pools": [{
                "rolls": 1,
                "entries": [{
                    "type": "minecraft:item",
                    "name": f"woodenutilities:{name}"
                }],
                "conditions": [{"condition": "minecraft:survives_explosion"}]
            }]
        }
        write_json(path, data)

def gen_geo_placeholders():
    """Create placeholder geo.json symlink files pointing to oak until real assets arrive."""
    geo_dir = os.path.join(RES, "geo", "block")
    tex_dir = os.path.join(RES, "textures", "geo", "chest")
    os.makedirs(geo_dir, exist_ok=True)
    os.makedirs(tex_dir, exist_ok=True)
    print(f"Geo dir ready:     {geo_dir}")
    print(f"Texture dir ready: {tex_dir}")
    print("Drop {wood}_wooden_chest.geo.json and {wood}_wooden_chest_double.geo.json into geo/block/")
    print("Drop {wood}_wooden_chest.png and {wood}_wooden_chest_double.png into textures/geo/chest/")
    print("Oak fallback is active until per-wood assets are placed.")

# ── Main ──────────────────────────────────────────────────────────────────────
if __name__ == "__main__":
    print("=== add_chest_support.py ===")
    patch_modblocks()
    patch_moditems()
    patch_modblockentities()
    patch_creativetabs()
    gen_blockstates()
    gen_item_models()
    gen_lang()
    gen_recipes()
    gen_loot_tables()
    gen_geo_placeholders()
    print("Done. Review the patched files, then build.")

package com.moderngamingworld.woodenutilities.registry;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public final class ModWoodTypes {

    public static final WoodType AFRICAN_BLACKWOOD = WoodType.register(new WoodType("woodenutilities:african_blackwood", BlockSetType.OAK));
    public static final WoodType BANYAN           = WoodType.register(new WoodType("woodenutilities:banyan",           BlockSetType.OAK));
    public static final WoodType BLACK_WALNUT     = WoodType.register(new WoodType("woodenutilities:black_walnut",     BlockSetType.OAK));
    public static final WoodType BLOODWOOD        = WoodType.register(new WoodType("woodenutilities:bloodwood",        BlockSetType.OAK));
    public static final WoodType BRISTLECONE_PINE = WoodType.register(new WoodType("woodenutilities:bristlecone_pine", BlockSetType.OAK));
    public static final WoodType CORK_OAK         = WoodType.register(new WoodType("woodenutilities:cork_oak",         BlockSetType.OAK));
    public static final WoodType DRAGON_BLOOD     = WoodType.register(new WoodType("woodenutilities:dragon_blood",     BlockSetType.OAK));
    public static final WoodType KAPOK            = WoodType.register(new WoodType("woodenutilities:kapok",            BlockSetType.OAK));
    public static final WoodType LARCH            = WoodType.register(new WoodType("woodenutilities:larch",            BlockSetType.OAK));
    public static final WoodType SANDALWOOD       = WoodType.register(new WoodType("woodenutilities:sandalwood",       BlockSetType.OAK));
    public static final WoodType SYCAMORE         = WoodType.register(new WoodType("woodenutilities:sycamore",         BlockSetType.OAK));
    public static final WoodType TEAK             = WoodType.register(new WoodType("woodenutilities:teak",             BlockSetType.OAK));
    public static final WoodType WENGE            = WoodType.register(new WoodType("woodenutilities:wenge",            BlockSetType.OAK));
    public static final WoodType ZEBRAWOOD        = WoodType.register(new WoodType("woodenutilities:zebrawood",        BlockSetType.OAK));

    public static void init() {}

    private ModWoodTypes() {}
}

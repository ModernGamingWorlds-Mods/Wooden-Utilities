package com.moderngamingworld.woodenutilities.worldgen;

import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
//? if neoforge {
/*import net.minecraft.resources.ResourceLocation;
*///?} else {
import net.minecraft.resources.ResourceLocation;
//?}

public final class ModConfiguredFeatures {

    //? if neoforge {
    /*private static ResourceKey<ConfiguredFeature<?, ?>> key(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID, name));
    }
    *///?} else {
    private static ResourceKey<ConfiguredFeature<?, ?>> key(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(WoodenUtilities.MOD_ID, name));
    }
    //?}

    public static final ResourceKey<ConfiguredFeature<?, ?>> AFRICAN_BLACKWOOD_TREE = key("african_blackwood_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BANYAN_TREE            = key("banyan_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_WALNUT_TREE      = key("black_walnut_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLOODWOOD_TREE         = key("bloodwood_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRISTLECONE_PINE_TREE  = key("bristlecone_pine_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CORK_OAK_TREE          = key("cork_oak_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DRAGON_BLOOD_TREE      = key("dragon_blood_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> KAPOK_TREE             = key("kapok_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARCH_TREE             = key("larch_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SANDALWOOD_TREE        = key("sandalwood_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SYCAMORE_TREE          = key("sycamore_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TEAK_TREE              = key("teak_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WENGE_TREE             = key("wenge_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZEBRAWOOD_TREE         = key("zebrawood_tree");

    private ModConfiguredFeatures() {}
}

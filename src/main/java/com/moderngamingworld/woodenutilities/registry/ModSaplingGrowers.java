package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.worldgen.ModConfiguredFeatures;
//? if neoforge {
/*import net.minecraft.world.level.block.grower.TreeGrower;
import java.util.Optional;
*///?} else {
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
//?}

public final class ModSaplingGrowers {

    //? if neoforge {
    /*public static final TreeGrower AFRICAN_BLACKWOOD = new TreeGrower("african_blackwood", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.AFRICAN_BLACKWOOD_TREE), Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower BANYAN            = new TreeGrower("banyan", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.BANYAN_TREE),            Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower BLACK_WALNUT      = new TreeGrower("black_walnut", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.BLACK_WALNUT_TREE),      Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower BLOODWOOD         = new TreeGrower("bloodwood", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.BLOODWOOD_TREE),         Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower BRISTLECONE_PINE  = new TreeGrower("bristlecone_pine", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.BRISTLECONE_PINE_TREE),  Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower CORK_OAK          = new TreeGrower("cork_oak", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.CORK_OAK_TREE),          Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower DRAGON_BLOOD      = new TreeGrower("dragon_blood", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.DRAGON_BLOOD_TREE),      Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower KAPOK             = new TreeGrower("kapok", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.KAPOK_TREE),             Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower LARCH             = new TreeGrower("larch", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.LARCH_TREE),             Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower SANDALWOOD        = new TreeGrower("sandalwood", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.SANDALWOOD_TREE),        Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower SYCAMORE          = new TreeGrower("sycamore", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.SYCAMORE_TREE),          Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower TEAK              = new TreeGrower("teak", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.TEAK_TREE),              Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower WENGE             = new TreeGrower("wenge", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.WENGE_TREE),             Optional.empty(), Optional.empty(), Optional.empty());
    public static final TreeGrower ZEBRAWOOD         = new TreeGrower("zebrawood", 0.0f, Optional.empty(), Optional.empty(), Optional.of(ModConfiguredFeatures.ZEBRAWOOD_TREE),         Optional.empty(), Optional.empty(), Optional.empty());
    *///?} else {
    public static final AbstractTreeGrower AFRICAN_BLACKWOOD = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.AFRICAN_BLACKWOOD_TREE; }
    };
    public static final AbstractTreeGrower BANYAN = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.BANYAN_TREE; }
    };
    public static final AbstractTreeGrower BLACK_WALNUT = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.BLACK_WALNUT_TREE; }
    };
    public static final AbstractTreeGrower BLOODWOOD = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.BLOODWOOD_TREE; }
    };
    public static final AbstractTreeGrower BRISTLECONE_PINE = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.BRISTLECONE_PINE_TREE; }
    };
    public static final AbstractTreeGrower CORK_OAK = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.CORK_OAK_TREE; }
    };
    public static final AbstractTreeGrower DRAGON_BLOOD = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.DRAGON_BLOOD_TREE; }
    };
    public static final AbstractTreeGrower KAPOK = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.KAPOK_TREE; }
    };
    public static final AbstractTreeGrower LARCH = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.LARCH_TREE; }
    };
    public static final AbstractTreeGrower SANDALWOOD = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.SANDALWOOD_TREE; }
    };
    public static final AbstractTreeGrower SYCAMORE = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.SYCAMORE_TREE; }
    };
    public static final AbstractTreeGrower TEAK = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.TEAK_TREE; }
    };
    public static final AbstractTreeGrower WENGE = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.WENGE_TREE; }
    };
    public static final AbstractTreeGrower ZEBRAWOOD = new AbstractTreeGrower() {
        @Override protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource r, boolean b) { return ModConfiguredFeatures.ZEBRAWOOD_TREE; }
    };
    //?}

    private ModSaplingGrowers() {}
}

package com.moderngamingworld.woodenutilities;

//? if has_geckolib {
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.state.properties.ChestType;
import software.bernie.geckolib.model.GeoModel;

import java.util.Set;

public class WoodenChestGeoModel extends GeoModel<WoodenChestBlockEntity> {

    private static final ResourceLocation ANIMATION =
            ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                    "animations/chest.animation.json");

    /**
     * Blocks that have their own geo/texture assets.
     * All others fall back to the oak chest model.
     * Add entries here as per-wood assets are dropped into geo/block/ and textures/geo/chest/.
     */
    private static final Set<String> HAS_OWN_ASSETS = Set.of(
            "acacia_wooden_chest",
            "african_blackwood_wooden_chest",
            "aspen_wooden_chest",
            "bamboo_wooden_chest",
            "banyan_wooden_chest",
            "baobab_wooden_chest",
            "birch_wooden_chest",
            "black_walnut_wooden_chest",
            "bloodwood_wooden_chest",
            "blue_enchanted_wooden_chest",
            "bristlecone_pine_wooden_chest",
            "bwg_fir_wooden_chest",
            "bwg_jacaranda_wooden_chest",
            "bwg_mahogany_wooden_chest",
            "bwg_maple_wooden_chest",
            "bwg_palm_wooden_chest",
            "bwg_pine_wooden_chest",
            "bwg_redwood_wooden_chest",
            "bwg_willow_wooden_chest",
            "canopy_wooden_chest",
            "cherry_wooden_chest",
            "cika_wooden_chest",
            "conberry_wooden_chest",
            "cork_oak_wooden_chest",
            "crimson_wooden_chest",
            "cruderoot_wooden_chest",
            "cypress_wooden_chest",
            "dark_oak_wooden_chest",
            "dark_wooden_chest",
            "dead_wooden_chest",
            "dragon_blood_wooden_chest",
            "ebony_wooden_chest",
            "empyreal_wooden_chest",
            "fir_wooden_chest",
            "florus_wooden_chest",
            "green_enchanted_wooden_chest",
            "hellbark_wooden_chest",
            "holly_wooden_chest",
            "ironwood_wooden_chest",
            "jacaranda_wooden_chest",
            "jungle_wooden_chest",
            "kapok_wooden_chest",
            "larch_wooden_chest",
            "magic_wooden_chest",
            "mahogany_wooden_chest",
            "mangrove_wooden_chest",
            "maple_wooden_chest",
            "mining_wooden_chest",
            "oak_wooden_chest",
            "palm_wooden_chest",
            "pine_wooden_chest",
            "rainbow_eucalyptus_wooden_chest",
            "redwood_wooden_chest",
            "roseroot_wooden_chest",
            "sakura_wooden_chest",
            "sandalwood_wooden_chest",
            "skyris_wooden_chest",
            "skyroot_wooden_chest",
            "sorting_wooden_chest",
            "spirit_wooden_chest",
            "spruce_wooden_chest",
            "sunroot_wooden_chest",
            "sycamore_wooden_chest",
            "teak_wooden_chest",
            "time_wooden_chest",
            "towerwood_wooden_chest",
            "transformation_wooden_chest",
            "twilight_mangrove_wooden_chest",
            "twilight_oak_wooden_chest",
            "umbran_wooden_chest",
            "warped_wooden_chest",
            "wenge_wooden_chest",
            "white_mangrove_wooden_chest",
            "willow_wooden_chest",
            "witch_hazel_wooden_chest",
            "yagroot_wooden_chest",
            "zebrawood_wooden_chest",
            "zelkova_wooden_chest"
    );

    private static String chestKey(Block block, boolean isDouble) {
        String path = BuiltInRegistries.BLOCK.getKey(block).getPath();
        String base = HAS_OWN_ASSETS.contains(path) ? path : "oak_wooden_chest";
        return isDouble ? base + "_double" : base;
    }

    @Override
    public ResourceLocation getModelResource(WoodenChestBlockEntity animatable) {
        boolean isDouble = animatable.getBlockState().getValue(ChestBlock.TYPE) == ChestType.LEFT;
        String key = chestKey(animatable.getBlockState().getBlock(), isDouble);
        return ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                "geo/block/" + key + ".geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WoodenChestBlockEntity animatable) {
        boolean isDouble = animatable.getBlockState().getValue(ChestBlock.TYPE) == ChestType.LEFT;
        String key = chestKey(animatable.getBlockState().getBlock(), isDouble);
        return ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                "textures/geo/chest/" + key + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(WoodenChestBlockEntity animatable) {
        return ANIMATION;
    }
}
//?}

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
            // add wood names here as assets become available, e.g.:
            // "oak_wooden_chest", "spruce_wooden_chest", ...
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

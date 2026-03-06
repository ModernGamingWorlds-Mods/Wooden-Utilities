package com.moderngamingworld.woodenutilities;

//? if has_geckolib {
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import software.bernie.geckolib.model.GeoModel;

import java.util.Set;

public class WoodenChestItemGeoModel extends GeoModel<WoodenChestBlockItem> {

    private static final ResourceLocation ANIMATION =
            ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                    "animations/chest.animation.json");

    /**
     * Items that have their own geo/texture assets (single-chest only for item display).
     * All others fall back to the oak chest model.
     * Add entries here as per-wood assets become available.
     */
    private static final Set<String> HAS_OWN_ASSETS = Set.of(
            // e.g. "oak_wooden_chest", "spruce_wooden_chest", ...
    );

    private static String chestKey(Block block) {
        String path = BuiltInRegistries.BLOCK.getKey(block).getPath();
        return HAS_OWN_ASSETS.contains(path) ? path : "oak_wooden_chest";
    }

    @Override
    public ResourceLocation getModelResource(WoodenChestBlockItem animatable) {
        String key = chestKey(animatable.getBlock());
        return ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                "geo/block/" + key + ".geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WoodenChestBlockItem animatable) {
        String key = chestKey(animatable.getBlock());
        return ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                "textures/geo/chest/" + key + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(WoodenChestBlockItem animatable) {
        return ANIMATION;
    }
}
//?}

package com.moderngamingworld.woodenutilities;

//? if has_geckolib {
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import software.bernie.geckolib.model.GeoModel;

import java.util.Set;

public class WoodenBarrelGeoModel extends GeoModel<WoodenBarrelBlockEntity> {

    private static final ResourceLocation ANIMATION =
            ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                    "animations/barrel.animation.json");

    private static final Set<String> OAK_FALLBACK = Set.of(
            "wooden_barrel"
    );

    private static String barrelKey(Block block) {
        String path = BuiltInRegistries.BLOCK.getKey(block).getPath();
        return OAK_FALLBACK.contains(path) ? "oak_wooden_barrel" : path;
    }

    @Override
    public ResourceLocation getModelResource(WoodenBarrelBlockEntity animatable) {
        String key = barrelKey(animatable.getBlockState().getBlock());
        return ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                "geo/block/" + key + ".geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WoodenBarrelBlockEntity animatable) {
        String key = barrelKey(animatable.getBlockState().getBlock());
        return ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                "textures/geo/barrel/" + key + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(WoodenBarrelBlockEntity animatable) {
        return ANIMATION;
    }
}
//?}

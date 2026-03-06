package com.moderngamingworld.woodenutilities;

//? if has_geckolib {
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import software.bernie.geckolib.model.GeoModel;

import java.util.Set;

public class WoodenBarrelItemGeoModel extends GeoModel<WoodenBarrelBlockItem> {

    private static final ResourceLocation ANIMATION =
            ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                    "animations/barrel.animation.json");

    private static final Set<String> OAK_FALLBACK = Set.of(
            "wooden_barrel",
            "towerwood_wooden_barrel",
            "roseroot_wooden_barrel",
            "yagroot_wooden_barrel",
            "cruderoot_wooden_barrel",
            "conberry_wooden_barrel",
            "sunroot_wooden_barrel",
            "skyroot_wooden_barrel"
    );

    private static String barrelKey(Block block) {
        String path = BuiltInRegistries.BLOCK.getKey(block).getPath();
        return OAK_FALLBACK.contains(path) ? "oak_wooden_barrel" : path;
    }

    @Override
    public ResourceLocation getModelResource(WoodenBarrelBlockItem animatable) {
        String key = barrelKey(animatable.getBlock());
        return ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                "geo/block/" + key + ".geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WoodenBarrelBlockItem animatable) {
        String key = barrelKey(animatable.getBlock());
        return ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                "textures/geo/barrel/" + key + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(WoodenBarrelBlockItem animatable) {
        return ANIMATION;
    }
}
//?}

package com.moderngamingworld.woodenutilities.compat;

//? if has_geckolib {
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SSBarrelGeoModel extends GeoModel<SSBarrelAnimatable> {

    private static final ResourceLocation GEO =
            ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                    "geo/block/ss_barrel.geo.json");

    private static final ResourceLocation ANIMATION =
            ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                    "animations/barrel.animation.json");

    private static String textureTier(String tier) {
        return switch (tier) {
            case "iron_barrel", "gold_barrel", "diamond_barrel", "netherite_barrel" -> tier;
            default -> "barrel";
        };
    }

    @Override
    public ResourceLocation getModelResource(SSBarrelAnimatable animatable) {
        return GEO;
    }

    @Override
    public ResourceLocation getTextureResource(SSBarrelAnimatable animatable) {
        String tex = "ss_" + animatable.getWoodKey() + "_" + textureTier(animatable.getTier());
        return ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                "textures/geo/barrel/" + tex + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(SSBarrelAnimatable animatable) {
        return ANIMATION;
    }
}
//?}

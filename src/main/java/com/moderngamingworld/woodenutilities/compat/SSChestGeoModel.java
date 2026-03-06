package com.moderngamingworld.woodenutilities.compat;

//? if has_geckolib {
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SSChestGeoModel extends GeoModel<SSChestAnimatable> {

    private static final ResourceLocation ANIMATION =
            ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                    "animations/chest.animation.json");

    /** Map SS chest block name tier → texture tier suffix. */
    private static String textureTier(String tier) {
        return switch (tier) {
            case "copper_chest", "iron_chest", "gold_chest",
                 "diamond_chest", "netherite_chest" -> tier;
            default -> "chest";
        };
    }

    @Override
    public ResourceLocation getModelResource(SSChestAnimatable animatable) {
        String base = animatable.isDouble() ? "ss_chest_double" : "ss_chest";
        return ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                "geo/block/" + base + ".geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SSChestAnimatable animatable) {
        String tier = textureTier(animatable.getTier());
        String suffix = animatable.isDouble() ? "_double" : "";
        String tex = "ss_" + animatable.getWoodKey() + "_" + tier + suffix;
        return ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID,
                "textures/geo/chest/" + tex + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(SSChestAnimatable animatable) {
        return ANIMATION;
    }
}
//?}

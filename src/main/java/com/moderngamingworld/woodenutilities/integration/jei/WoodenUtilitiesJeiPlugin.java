package com.moderngamingworld.woodenutilities.integration.jei;

import com.moderngamingworld.woodenutilities.WaterCrucibleRecipeManager;
import com.moderngamingworld.woodenutilities.registry.ModItems;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

@JeiPlugin
public class WoodenUtilitiesJeiPlugin implements IModPlugin {
    private static final ResourceLocation UID = new ResourceLocation("woodenutilities", "jei_plugin");

    @Override
    public ResourceLocation getPluginUid() {
        return UID;
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new WaterCrucibleRecipeCategory(
            registration.getJeiHelpers().getGuiHelper(),
            new ItemStack(ModItems.WOODEN_CAULDRON.get())
        ));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addRecipes(WaterCrucibleRecipeCategory.TYPE, WaterCrucibleRecipeManager.recipes());
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(new ItemStack(ModItems.WOODEN_CAULDRON.get()), WaterCrucibleRecipeCategory.TYPE);
    }
}

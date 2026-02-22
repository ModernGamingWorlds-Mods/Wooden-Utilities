package com.moderngamingworld.woodenutilities.jei;

import com.moderngamingworld.woodenutilities.WoodenCauldronRecipe;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import com.moderngamingworld.woodenutilities.registry.ModBlocks;
import com.moderngamingworld.woodenutilities.registry.ModRecipes;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
//? if neoforge {
import net.minecraft.world.item.crafting.RecipeHolder;
//?}
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.stream.Collectors;

@JeiPlugin
public class WoodenUtilitiesJeiPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        //? if neoforge {
        return ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID, "jei_plugin");
        //?} else {
        /*return new ResourceLocation(WoodenUtilities.MOD_ID, "jei_plugin");
        *///?}
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        IGuiHelper guiHelper = registration.getJeiHelpers().getGuiHelper();
        registration.addRecipeCategories(
            new WoodenCauldronJeiCategory(guiHelper),
            new WoodenAnvilJeiCategory(guiHelper)
        );
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        // Cauldron: read from the live recipe manager — picks up KubeJS recipes automatically
        if (Minecraft.getInstance().level != null) {
            RecipeManager rm = Minecraft.getInstance().level.getRecipeManager();
            //? if neoforge {
            List<WoodenCauldronRecipe> cauldronRecipes =
                rm.getAllRecipesFor(ModRecipes.WOODEN_CAULDRON_TYPE.get())
                  .stream().map(RecipeHolder::value).collect(Collectors.toList());
            //?} else {
            /*List<WoodenCauldronRecipe> cauldronRecipes =
                new java.util.ArrayList<>(rm.getAllRecipesFor(ModRecipes.WOODEN_CAULDRON_TYPE.get()));
            *///?}
            registration.addRecipes(WoodenCauldronJeiCategory.RECIPE_TYPE, cauldronRecipes);
        }

        // Anvil: hardcoded plank → plate pairs
        registration.addRecipes(WoodenAnvilJeiCategory.RECIPE_TYPE,
            WoodenAnvilJeiCategory.buildRecipes());
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        // Every cauldron variant opens the cauldron recipe category
        for (var block : ModBlocks.ALL_WOODEN_CAULDRONS) {
            registration.addRecipeCatalyst(
                new ItemStack(block.get()), WoodenCauldronJeiCategory.RECIPE_TYPE);
        }

        // Wooden anvil opens the anvil crafting category
        registration.addRecipeCatalyst(
            new ItemStack(ModBlocks.WOODEN_ANVIL.get()), WoodenAnvilJeiCategory.RECIPE_TYPE);
    }
}

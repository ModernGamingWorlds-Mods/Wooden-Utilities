package com.moderngamingworld.woodenutilities.integration.jei;

import com.moderngamingworld.woodenutilities.WaterCrucibleRecipe;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

public class WaterCrucibleRecipeCategory implements IRecipeCategory<WaterCrucibleRecipe> {
    public static final RecipeType<WaterCrucibleRecipe> TYPE = RecipeType.create(
        "woodenutilities",
        "water_crucible",
        WaterCrucibleRecipe.class
    );

    private final IDrawable background;
    private final IDrawable icon;

    public WaterCrucibleRecipeCategory(IGuiHelper guiHelper, ItemStack iconStack) {
        this.background = guiHelper.createBlankDrawable(120, 40);
        this.icon = guiHelper.createDrawableItemStack(iconStack);
    }

    @Override
    public RecipeType<WaterCrucibleRecipe> getRecipeType() {
        return TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("jei.woodenutilities.category.water_crucible");
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, WaterCrucibleRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 20, 12)
            .addIngredients(recipe.ingredient());

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 12)
            .addItemStack(recipe.createResultStack());
    }
}

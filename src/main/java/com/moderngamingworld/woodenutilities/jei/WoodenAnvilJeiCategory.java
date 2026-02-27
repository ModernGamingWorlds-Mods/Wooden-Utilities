package com.moderngamingworld.woodenutilities.jei;

import com.moderngamingworld.woodenutilities.WoodenUtilities;
import com.moderngamingworld.woodenutilities.registry.ModBlocks;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

public class WoodenAnvilJeiCategory implements IRecipeCategory<WoodenAnvilJeiCategory.AnvilRecipe> {

    public static final RecipeType<AnvilRecipe> RECIPE_TYPE =
        RecipeType.create(WoodenUtilities.MOD_ID, "wooden_anvil_crafting", AnvilRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public WoodenAnvilJeiCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createBlankDrawable(82, 28);
        this.icon = guiHelper.createDrawableItemStack(new ItemStack(ModBlocks.WOODEN_ANVIL.get()));
    }

    @Override
    public RecipeType<AnvilRecipe> getRecipeType() { return RECIPE_TYPE; }

    @Override
    public Component getTitle() {
        return Component.translatable("jei.woodenutilities.wooden_anvil");
    }

    @Override
    public IDrawable getBackground() { return background; }

    @Override
    public IDrawable getIcon() { return icon; }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, AnvilRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 1, 6)
            .addItemStack(recipe.hammer());
        builder.addSlot(RecipeIngredientRole.INPUT, 31, 6)
            .addItemStack(recipe.plank());
        builder.addSlot(RecipeIngredientRole.OUTPUT, 64, 6)
            .addItemStack(recipe.result());
    }

    @Override
    public void draw(AnvilRecipe recipe, IRecipeSlotsView recipeSlotsView,
                     GuiGraphics guiGraphics, double mouseX, double mouseY) {
        var font = Minecraft.getInstance().font;
        guiGraphics.drawString(font, "+", 21, 10, 0x404040, false);
        guiGraphics.drawString(font, "\u2192", 51, 10, 0x404040, false);
    }

    public record AnvilRecipe(ItemStack hammer, ItemStack plank, ItemStack result) {}
}

package com.moderngamingworld.woodenutilities.jei;

import com.moderngamingworld.woodenutilities.WoodenCauldronRecipe;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import com.moderngamingworld.woodenutilities.registry.ModBlocks;
import mezz.jei.api.constants.VanillaTypes;
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
//? if neoforge {
import mezz.jei.api.neoforge.NeoForgeTypes;
//?} else {
/*import mezz.jei.api.forge.ForgeTypes;
*///?}

import java.util.Arrays;

public class WoodenCauldronJeiCategory implements IRecipeCategory<WoodenCauldronRecipe> {

    public static final RecipeType<WoodenCauldronRecipe> RECIPE_TYPE =
        RecipeType.create(WoodenUtilities.MOD_ID, "wooden_cauldron", WoodenCauldronRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public WoodenCauldronJeiCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createBlankDrawable(82, 28);
        this.icon = guiHelper.createDrawableItemStack(new ItemStack(ModBlocks.OAK_WOODEN_CAULDRON.get()));
    }

    @Override
    public RecipeType<WoodenCauldronRecipe> getRecipeType() {
        return RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("jei.woodenutilities.wooden_cauldron");
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
    public void setRecipe(IRecipeLayoutBuilder builder, WoodenCauldronRecipe recipe, IFocusGroup focuses) {
        // Tank A fluid — always present
        //? if neoforge {
        builder.addSlot(RecipeIngredientRole.INPUT, 1, 6)
            .addIngredient(NeoForgeTypes.FLUID_STACK, recipe.getInputFluid())
            .setFluidRenderer(recipe.getInputFluid().getAmount(), false, 16, 16);
        //?} else {
        /*builder.addSlot(RecipeIngredientRole.INPUT, 1, 6)
            .addIngredient(ForgeTypes.FLUID_STACK, recipe.getInputFluid())
            .setFluidRenderer(recipe.getInputFluid().getAmount(), false, 16, 16);
        *///?}

        // Second input: another fluid, or an item
        if (recipe.isFluidFluid()) {
            //? if neoforge {
            builder.addSlot(RecipeIngredientRole.INPUT, 31, 6)
                .addIngredient(NeoForgeTypes.FLUID_STACK, recipe.getInputFluid2())
                .setFluidRenderer(recipe.getInputFluid2().getAmount(), false, 16, 16);
            //?} else {
            /*builder.addSlot(RecipeIngredientRole.INPUT, 31, 6)
                .addIngredient(ForgeTypes.FLUID_STACK, recipe.getInputFluid2())
                .setFluidRenderer(recipe.getInputFluid2().getAmount(), false, 16, 16);
            *///?}
        } else {
            builder.addSlot(RecipeIngredientRole.INPUT, 31, 6)
                .addIngredients(VanillaTypes.ITEM_STACK,
                    Arrays.asList(recipe.getInputItem().getItems()));
        }

        // Output item
        builder.addSlot(RecipeIngredientRole.OUTPUT, 64, 6)
            .addItemStack(recipe.getResultCopy());
    }

    @Override
    public void draw(WoodenCauldronRecipe recipe, IRecipeSlotsView recipeSlotsView,
                     GuiGraphics guiGraphics, double mouseX, double mouseY) {
        var font = Minecraft.getInstance().font;
        guiGraphics.drawString(font, "+", 21, 10, 0x404040, false);
        guiGraphics.drawString(font, "\u2192", 51, 10, 0x404040, false);
    }
}

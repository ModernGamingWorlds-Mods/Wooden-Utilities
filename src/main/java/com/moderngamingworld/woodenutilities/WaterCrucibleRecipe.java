package com.moderngamingworld.woodenutilities;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapedRecipe;

public record WaterCrucibleRecipe(Ingredient ingredient, ResourceLocation fluid, int amount, ItemStack result) {
    public static WaterCrucibleRecipe fromJson(JsonObject json) {
        Ingredient ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(json, "ingredient"));

        JsonObject fluidObject = GsonHelper.getAsJsonObject(json, "fluid");
        ResourceLocation fluid = new ResourceLocation(GsonHelper.getAsString(fluidObject, "fluid"));
        int amount = GsonHelper.getAsInt(fluidObject, "amount");

        ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "result"));

        return new WaterCrucibleRecipe(ingredient, fluid, amount, result);
    }

    public boolean matches(ItemStack stack, ResourceLocation fluidType) {
        return fluid.equals(fluidType) && ingredient.test(stack);
    }

    public ItemStack createResultStack() {
        return result.copy();
    }
}

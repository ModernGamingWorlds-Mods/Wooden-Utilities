package com.moderngamingworld.woodenutilities;

import com.google.gson.JsonObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;

public final class WaterCrucibleRecipe {
    private final Ingredient ingredient;
    private final ItemStack result;
    private final ResourceLocation fluid;

    private WaterCrucibleRecipe(Ingredient ingredient, ItemStack result, ResourceLocation fluid) {
        this.ingredient = ingredient;
        this.result = result;
        this.fluid = fluid;
    }

    public static WaterCrucibleRecipe fromJson(JsonObject json) {
        Ingredient ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(json, "ingredient"));
        ItemStack result = parseResult(GsonHelper.getAsJsonObject(json, "result"));

        ResourceLocation fluid = WaterCrucibleRecipeManager.waterFluid();
        if (json.has("fluid")) {
            fluid = new ResourceLocation(GsonHelper.getAsString(json, "fluid"));
        }

        return new WaterCrucibleRecipe(ingredient, result, fluid);
    }

    private static ItemStack parseResult(JsonObject resultJson) {
        String itemId = GsonHelper.getAsString(resultJson, "item");
        int count = GsonHelper.getAsInt(resultJson, "count", 1);
        Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemId));
        if (item == null) {
            throw new IllegalArgumentException("Unknown item id in water crucible result: " + itemId);
        }

        return new ItemStack(item, count);
    }

    public boolean matches(ItemStack stack, ResourceLocation fluid) {
        return this.fluid.equals(fluid) && this.ingredient.test(stack);
    }

    public ItemStack getResult() {
        return this.result.copy();
    }
}

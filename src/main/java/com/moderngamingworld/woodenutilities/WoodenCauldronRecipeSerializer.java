package com.moderngamingworld.woodenutilities;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;

public class WoodenCauldronRecipeSerializer implements RecipeSerializer<WoodenCauldronRecipe> {

    @Override
    public WoodenCauldronRecipe fromJson(ResourceLocation id, JsonObject json) {
        FluidStack inputFluid = parseFluidStack(GsonHelper.getAsJsonObject(json, "input_fluid"));

        FluidStack inputFluid2 = null;
        if (json.has("input_fluid_2")) {
            inputFluid2 = parseFluidStack(GsonHelper.getAsJsonObject(json, "input_fluid_2"));
        }

        Ingredient inputItem = null;
        if (json.has("input_item")) {
            inputItem = Ingredient.fromJson(json.get("input_item"));
        }

        if (inputFluid2 == null && inputItem == null) {
            throw new JsonSyntaxException(
                    "Wooden cauldron recipe '" + id + "' must have either 'input_fluid_2' or 'input_item'");
        }

        ItemStack result = parseItemStack(GsonHelper.getAsJsonObject(json, "result"));
        return new WoodenCauldronRecipe(id, inputFluid, inputFluid2, inputItem, result);
    }

    @Override
    @Nullable
    public WoodenCauldronRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
        FluidStack inputFluid = FluidStack.readFromPacket(buf);
        FluidStack inputFluid2 = buf.readBoolean() ? FluidStack.readFromPacket(buf) : null;
        Ingredient inputItem = buf.readBoolean() ? Ingredient.fromNetwork(buf) : null;
        ItemStack result = buf.readItem();
        return new WoodenCauldronRecipe(id, inputFluid, inputFluid2, inputItem, result);
    }

    @Override
    public void toNetwork(FriendlyByteBuf buf, WoodenCauldronRecipe recipe) {
        recipe.getInputFluid().writeToPacket(buf);

        FluidStack fluid2 = recipe.getInputFluid2();
        buf.writeBoolean(fluid2 != null);
        if (fluid2 != null) fluid2.writeToPacket(buf);

        Ingredient item = recipe.getInputItem();
        buf.writeBoolean(item != null);
        if (item != null) item.toNetwork(buf);

        buf.writeItem(recipe.getResultCopy());
    }

    private static FluidStack parseFluidStack(JsonObject json) {
        String fluidId = GsonHelper.getAsString(json, "fluid");
        Fluid fluid = ForgeRegistries.FLUIDS.getValue(new ResourceLocation(fluidId));
        if (fluid == null || fluid == net.minecraft.world.level.material.Fluids.EMPTY) {
            throw new JsonSyntaxException("Unknown fluid: " + fluidId);
        }
        int amount = GsonHelper.getAsInt(json, "amount", 1000);
        return new FluidStack(fluid, amount);
    }

    private static ItemStack parseItemStack(JsonObject json) {
        String itemId = GsonHelper.getAsString(json, "item");
        Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemId));
        if (item == null) {
            throw new JsonSyntaxException("Unknown item: " + itemId);
        }
        int count = GsonHelper.getAsInt(json, "count", 1);
        return new ItemStack(item, count);
    }
}

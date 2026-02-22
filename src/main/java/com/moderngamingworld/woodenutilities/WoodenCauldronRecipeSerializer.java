package com.moderngamingworld.woodenutilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
//? if neoforge {
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.neoforged.neoforge.fluids.FluidStack;
//?} else {
/*import com.google.gson.JsonObject;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.ForgeRegistries;
*///?}

import java.util.Optional;

public class WoodenCauldronRecipeSerializer implements RecipeSerializer<WoodenCauldronRecipe> {

    //? if neoforge {
    public static final MapCodec<WoodenCauldronRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
        instance.group(
            FluidStack.CODEC.fieldOf("input_fluid").forGetter(WoodenCauldronRecipe::getInputFluid),
            FluidStack.CODEC.optionalFieldOf("input_fluid_2").forGetter(r -> Optional.ofNullable(r.getInputFluid2())),
            Ingredient.CODEC.optionalFieldOf("input_item").forGetter(r -> Optional.ofNullable(r.getInputItem())),
            ItemStack.STRICT_CODEC.fieldOf("result").forGetter(WoodenCauldronRecipe::getResultCopy)
        ).apply(instance, (fluid, fluid2, item, result) ->
            new WoodenCauldronRecipe(fluid, fluid2.orElse(null), item.orElse(null), result)
        )
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, WoodenCauldronRecipe> STREAM_CODEC =
        StreamCodec.of(
            (buf, recipe) -> {
                FluidStack.STREAM_CODEC.encode(buf, recipe.getInputFluid());
                FluidStack fluid2 = recipe.getInputFluid2();
                buf.writeBoolean(fluid2 != null);
                if (fluid2 != null) FluidStack.STREAM_CODEC.encode(buf, fluid2);
                Ingredient item = recipe.getInputItem();
                buf.writeBoolean(item != null);
                if (item != null) Ingredient.CONTENTS_STREAM_CODEC.encode(buf, item);
                ItemStack.STREAM_CODEC.encode(buf, recipe.getResultCopy());
            },
            buf -> {
                FluidStack inputFluid = FluidStack.STREAM_CODEC.decode(buf);
                FluidStack inputFluid2 = buf.readBoolean() ? FluidStack.STREAM_CODEC.decode(buf) : null;
                Ingredient inputItem = buf.readBoolean() ? Ingredient.CONTENTS_STREAM_CODEC.decode(buf) : null;
                ItemStack result = ItemStack.STREAM_CODEC.decode(buf);
                return new WoodenCauldronRecipe(inputFluid, inputFluid2, inputItem, result);
            }
        );

    @Override
    public MapCodec<WoodenCauldronRecipe> codec() {
        return CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, WoodenCauldronRecipe> streamCodec() {
        return STREAM_CODEC;
    }
    //?} else {
    /*@Override
    public WoodenCauldronRecipe fromJson(ResourceLocation id, JsonObject json) {
        FluidStack inputFluid = fluidFromJson(json.getAsJsonObject("input_fluid"));
        FluidStack inputFluid2 = json.has("input_fluid_2")
                ? fluidFromJson(json.getAsJsonObject("input_fluid_2")) : null;
        Ingredient inputItem = json.has("input_item")
                ? Ingredient.fromJson(json.get("input_item")) : null;
        ItemStack result = itemFromJson(json.getAsJsonObject("result"));
        WoodenCauldronRecipe recipe = new WoodenCauldronRecipe(inputFluid, inputFluid2, inputItem, result);
        recipe.id = id;
        return recipe;
    }

    @Override
    public WoodenCauldronRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
        FluidStack inputFluid = buf.readFluidStack();
        FluidStack inputFluid2 = buf.readBoolean() ? buf.readFluidStack() : null;
        Ingredient inputItem = buf.readBoolean() ? Ingredient.fromNetwork(buf) : null;
        ItemStack result = buf.readItem();
        return new WoodenCauldronRecipe(inputFluid, inputFluid2, inputItem, result);
    }

    @Override
    public void toNetwork(FriendlyByteBuf buf, WoodenCauldronRecipe recipe) {
        buf.writeFluidStack(recipe.getInputFluid());
        FluidStack fluid2 = recipe.getInputFluid2();
        buf.writeBoolean(fluid2 != null);
        if (fluid2 != null) buf.writeFluidStack(fluid2);
        Ingredient item = recipe.getInputItem();
        buf.writeBoolean(item != null);
        if (item != null) item.toNetwork(buf);
        buf.writeItem(recipe.getResultCopy());
    }

    private static FluidStack fluidFromJson(JsonObject json) {
        String fluidId = json.get("fluid").getAsString();
        int amount = json.has("amount") ? json.get("amount").getAsInt() : 1000;
        net.minecraft.world.level.material.Fluid fluid =
            ForgeRegistries.FLUIDS.getValue(new ResourceLocation(fluidId));
        if (fluid == null) throw new com.google.gson.JsonSyntaxException("Unknown fluid: " + fluidId);
        return new FluidStack(fluid, amount);
    }

    private static ItemStack itemFromJson(JsonObject json) {
        String itemId = json.get("item").getAsString();
        int count = json.has("count") ? json.get("count").getAsInt() : 1;
        net.minecraft.world.item.Item item =
            net.minecraft.core.registries.BuiltInRegistries.ITEM.get(new ResourceLocation(itemId));
        return new ItemStack(item, count);
    }
    *///?}
}

package com.moderngamingworld.woodenutilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
//? if modern_nbt {
/*import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
*///?} else if forge_mid {
/*import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.FriendlyByteBuf;
*///?} else {
import com.google.gson.JsonObject;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
//?}

public class WoodenAnvilRecipeSerializer implements RecipeSerializer<WoodenAnvilRecipe> {

    //? if modern_nbt {
    /*public static final MapCodec<WoodenAnvilRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
        instance.group(
            Ingredient.CODEC.fieldOf("input").forGetter(WoodenAnvilRecipe::getInput),
            ItemStack.STRICT_CODEC.fieldOf("result").forGetter(WoodenAnvilRecipe::getResult)
        ).apply(instance, WoodenAnvilRecipe::new)
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, WoodenAnvilRecipe> STREAM_CODEC =
        StreamCodec.of(
            (buf, recipe) -> {
                Ingredient.CONTENTS_STREAM_CODEC.encode(buf, recipe.getInput());
                ItemStack.STREAM_CODEC.encode(buf, recipe.getResult());
            },
            buf -> {
                Ingredient input = Ingredient.CONTENTS_STREAM_CODEC.decode(buf);
                ItemStack result = ItemStack.STREAM_CODEC.decode(buf);
                return new WoodenAnvilRecipe(input, result);
            }
        );

    @Override
    public MapCodec<WoodenAnvilRecipe> codec() {
        return CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, WoodenAnvilRecipe> streamCodec() {
        return STREAM_CODEC;
    }
    *///?} else if forge_mid {
    /*public static final Codec<WoodenAnvilRecipe> CODEC = RecordCodecBuilder.create(instance ->
        instance.group(
            Ingredient.CODEC.fieldOf("input").forGetter(WoodenAnvilRecipe::getInput),
            ItemStack.CODEC.fieldOf("result").forGetter(WoodenAnvilRecipe::getResult)
        ).apply(instance, WoodenAnvilRecipe::new)
    );

    @Override
    public Codec<WoodenAnvilRecipe> codec() {
        return CODEC;
    }

    @Override
    public WoodenAnvilRecipe fromNetwork(FriendlyByteBuf buf) {
        Ingredient input = Ingredient.fromNetwork(buf);
        ItemStack result = buf.readItem();
        return new WoodenAnvilRecipe(input, result);
    }

    @Override
    public void toNetwork(FriendlyByteBuf buf, WoodenAnvilRecipe recipe) {
        recipe.getInput().toNetwork(buf);
        buf.writeItem(recipe.getResult());
    }
    *///?} else {
    @Override
    public WoodenAnvilRecipe fromJson(ResourceLocation id, JsonObject json) {
        Ingredient input = Ingredient.fromJson(json.get("input"));
        ItemStack result = itemFromJson(json.getAsJsonObject("result"));
        WoodenAnvilRecipe recipe = new WoodenAnvilRecipe(input, result);
        recipe.id = id;
        return recipe;
    }

    @Override
    public WoodenAnvilRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
        Ingredient input = Ingredient.fromNetwork(buf);
        ItemStack result = buf.readItem();
        return new WoodenAnvilRecipe(input, result);
    }

    @Override
    public void toNetwork(FriendlyByteBuf buf, WoodenAnvilRecipe recipe) {
        recipe.getInput().toNetwork(buf);
        buf.writeItem(recipe.getResult());
    }

    private static ItemStack itemFromJson(JsonObject json) {
        String itemId = json.get("item").getAsString();
        int count = json.has("count") ? json.get("count").getAsInt() : 1;
        net.minecraft.world.item.Item item =
            net.minecraft.core.registries.BuiltInRegistries.ITEM.get(new ResourceLocation(itemId));
        return new ItemStack(item, count);
    }
    //?}
}

package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModRecipes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
//? if modern_nbt {
/*import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.crafting.RecipeInput;
*///?} else {
import net.minecraft.core.RegistryAccess;
import net.minecraft.world.Container;
//?}

//? if modern_nbt {
/*public class WoodenAnvilRecipe implements Recipe<RecipeInput> {
*///?} else {
public class WoodenAnvilRecipe implements Recipe<Container> {
//?}

    private final Ingredient input;
    private final ItemStack result;
    //? if forge_1201 {
    net.minecraft.resources.ResourceLocation id;
    //?}

    public WoodenAnvilRecipe(Ingredient input, ItemStack result) {
        this.input = input;
        this.result = result;
    }

    public Ingredient getInput() { return input; }
    public ItemStack getResult() { return result; }

    //? if modern_nbt {
    /*@Override public boolean matches(RecipeInput i, Level l) { return false; }
    @Override public ItemStack assemble(RecipeInput i, HolderLookup.Provider r) { return result.copy(); }
    @Override public ItemStack getResultItem(HolderLookup.Provider r) { return result.copy(); }
    *///?} else {
    @Override public boolean matches(Container c, Level l) { return false; }
    @Override public ItemStack assemble(Container c, RegistryAccess r) { return result.copy(); }
    @Override public ItemStack getResultItem(RegistryAccess r) { return result.copy(); }
    //?}

    @Override public boolean canCraftInDimensions(int w, int h) { return false; }
    @Override public RecipeSerializer<?> getSerializer() { return ModRecipes.WOODEN_ANVIL_SERIALIZER.get(); }
    @Override public RecipeType<?> getType() { return ModRecipes.WOODEN_ANVIL_TYPE.get(); }

    //? if forge_1201 {
    @Override public net.minecraft.resources.ResourceLocation getId() { return id; }
    //?}
}

package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenAnvilRecipe;
import com.moderngamingworld.woodenutilities.WoodenAnvilRecipeSerializer;
import com.moderngamingworld.woodenutilities.WoodenCauldronRecipe;
import com.moderngamingworld.woodenutilities.WoodenCauldronRecipeSerializer;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
//? if neoforge {
/*import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
*///?} else {
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
//?}

public final class ModRecipes {

    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, WoodenUtilities.MOD_ID);

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, WoodenUtilities.MOD_ID);

    //? if neoforge {
    /*public static final DeferredHolder<RecipeType<?>, RecipeType<WoodenCauldronRecipe>> WOODEN_CAULDRON_TYPE =
    *///?} else {
    public static final RegistryObject<RecipeType<WoodenCauldronRecipe>> WOODEN_CAULDRON_TYPE =
    //?}
            RECIPE_TYPES.register("wooden_cauldron", () -> new RecipeType<>() {
                @Override
                public String toString() {
                    return WoodenUtilities.MOD_ID + ":wooden_cauldron";
                }
            });

    //? if neoforge {
    /*public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<WoodenCauldronRecipe>> WOODEN_CAULDRON_SERIALIZER =
    *///?} else {
    public static final RegistryObject<RecipeSerializer<WoodenCauldronRecipe>> WOODEN_CAULDRON_SERIALIZER =
    //?}
            RECIPE_SERIALIZERS.register("wooden_cauldron", WoodenCauldronRecipeSerializer::new);

    //? if neoforge {
    /*public static final DeferredHolder<RecipeType<?>, RecipeType<WoodenAnvilRecipe>> WOODEN_ANVIL_TYPE =
    *///?} else {
    public static final RegistryObject<RecipeType<WoodenAnvilRecipe>> WOODEN_ANVIL_TYPE =
    //?}
            RECIPE_TYPES.register("wooden_anvil", () -> new RecipeType<>() {
                @Override public String toString() { return WoodenUtilities.MOD_ID + ":wooden_anvil"; }
            });

    //? if neoforge {
    /*public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<WoodenAnvilRecipe>> WOODEN_ANVIL_SERIALIZER =
    *///?} else {
    public static final RegistryObject<RecipeSerializer<WoodenAnvilRecipe>> WOODEN_ANVIL_SERIALIZER =
    //?}
            RECIPE_SERIALIZERS.register("wooden_anvil", WoodenAnvilRecipeSerializer::new);

    private ModRecipes() {}

    public static void register(IEventBus eventBus) {
        RECIPE_TYPES.register(eventBus);
        RECIPE_SERIALIZERS.register(eventBus);
    }
}

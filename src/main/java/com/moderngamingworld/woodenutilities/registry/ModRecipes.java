package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenCauldronRecipe;
import com.moderngamingworld.woodenutilities.WoodenCauldronRecipeSerializer;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModRecipes {

    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.RECIPE_TYPES, WoodenUtilities.MOD_ID);

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, WoodenUtilities.MOD_ID);

    public static final RegistryObject<RecipeType<WoodenCauldronRecipe>> WOODEN_CAULDRON_TYPE =
            RECIPE_TYPES.register("wooden_cauldron", () -> new RecipeType<>() {
                @Override
                public String toString() {
                    return WoodenUtilities.MOD_ID + ":wooden_cauldron";
                }
            });

    public static final RegistryObject<RecipeSerializer<WoodenCauldronRecipe>> WOODEN_CAULDRON_SERIALIZER =
            RECIPE_SERIALIZERS.register("wooden_cauldron", WoodenCauldronRecipeSerializer::new);

    private ModRecipes() {}

    public static void register(IEventBus eventBus) {
        RECIPE_TYPES.register(eventBus);
        RECIPE_SERIALIZERS.register(eventBus);
    }
}

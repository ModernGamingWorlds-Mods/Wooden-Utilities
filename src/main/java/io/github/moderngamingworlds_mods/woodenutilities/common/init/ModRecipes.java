package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.recipes.WoodcutterRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;

import java.util.function.Supplier;

public class ModRecipes {

    private static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(Registry.RECIPE_TYPE_REGISTRY, WoodenUtilities.MOD_ID);
    private static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, WoodenUtilities.MOD_ID);

    public static final RegistryObject<RecipeType<WoodcutterRecipe>> WOODCUTTER = type(WoodcutterRecipe.ID);

    public static final RegistryObject<RecipeSerializer<WoodcutterRecipe>> WOODCUTTER_SERIALIZER = serializer(
            WoodcutterRecipe.SERIALIZER_ID, WoodcutterRecipe.WoodcutterSerializer::new
    );



    private static <T extends Recipe<?>> RegistryObject<RecipeType<T>> type(String name) {
        return RECIPE_TYPES.register(name, () -> new RecipeType<T>() {
            @Override
            public String toString() {
                return name;
            }
        });
    }

    private static <T extends RecipeSerializer<?>> RegistryObject<T> serializer(String name, Supplier<? extends T> factory) {
        return SERIALIZERS.register(name, factory);
    }

    public static void init(IEventBus bus) {
        RECIPE_TYPES.register(bus);
        SERIALIZERS.register(bus);
    }
}

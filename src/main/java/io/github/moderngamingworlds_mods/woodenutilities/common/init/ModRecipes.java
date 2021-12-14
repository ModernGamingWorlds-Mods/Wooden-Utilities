package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.common.recipes.WoodcutterRecipe;
import io.github.noeppi_noeppi.libx.annotation.registration.NoReg;
import io.github.noeppi_noeppi.libx.annotation.registration.RegName;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;

@RegisterClass
public class ModRecipes {

    @NoReg
    public static final RecipeType<WoodcutterRecipe> WOODCUTTER = RecipeType.register(WoodcutterRecipe.ID);

    @RegName(WoodcutterRecipe.SERIALIZER_ID)
    public static final RecipeSerializer<WoodcutterRecipe> WOODCUTTER_SERIALIZER = new WoodcutterRecipe.WoodcutterSerializer();
}

package io.github.moderngamingworlds_mods.woodenutilities.common.datagen.providers;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.recipes.WoodcutterRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.Objects;
import java.util.function.Consumer;

public class ModWoodcutterRecipeGen extends RecipeProvider {

    public ModWoodcutterRecipeGen(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        this.simpleWoodcutterRecipe(consumer, Items.OAK_PLANKS, Items.OAK_SLAB, 2);
        this.simpleWoodcutterRecipe(consumer, Items.OAK_PLANKS, Items.OAK_DOOR);
        this.simpleWoodcutterRecipe(consumer, Items.OAK_PLANKS, Items.OAK_SIGN);
        this.simpleWoodcutterRecipe(consumer, Items.OAK_PLANKS, Items.OAK_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(consumer, Items.OAK_PLANKS, Items.OAK_FENCE);
        this.simpleWoodcutterRecipe(consumer, Items.OAK_PLANKS, Items.OAK_FENCE_GATE);
        this.simpleWoodcutterRecipe(consumer, Items.OAK_PLANKS, Items.OAK_TRAPDOOR);
        this.simpleWoodcutterRecipe(consumer, Items.OAK_PLANKS, Items.OAK_BUTTON);
        this.simpleWoodcutterRecipe(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_SLAB, 2);
        this.simpleWoodcutterRecipe(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_DOOR);
        this.simpleWoodcutterRecipe(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_SIGN);
        this.simpleWoodcutterRecipe(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_FENCE);
        this.simpleWoodcutterRecipe(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_FENCE_GATE);
        this.simpleWoodcutterRecipe(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_TRAPDOOR);
        this.simpleWoodcutterRecipe(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_BUTTON);
        this.simpleWoodcutterRecipe(consumer, Items.BIRCH_PLANKS, Items.BIRCH_SLAB, 2);
        this.simpleWoodcutterRecipe(consumer, Items.BIRCH_PLANKS, Items.BIRCH_DOOR);
        this.simpleWoodcutterRecipe(consumer, Items.BIRCH_PLANKS, Items.BIRCH_SIGN);
        this.simpleWoodcutterRecipe(consumer, Items.BIRCH_PLANKS, Items.BIRCH_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(consumer, Items.BIRCH_PLANKS, Items.BIRCH_FENCE);
        this.simpleWoodcutterRecipe(consumer, Items.BIRCH_PLANKS, Items.BIRCH_FENCE_GATE);
        this.simpleWoodcutterRecipe(consumer, Items.BIRCH_PLANKS, Items.BIRCH_TRAPDOOR);
        this.simpleWoodcutterRecipe(consumer, Items.BIRCH_PLANKS, Items.BIRCH_BUTTON);
        this.simpleWoodcutterRecipe(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_SLAB, 2);
        this.simpleWoodcutterRecipe(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_DOOR);
        this.simpleWoodcutterRecipe(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_SIGN);
        this.simpleWoodcutterRecipe(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_FENCE);
        this.simpleWoodcutterRecipe(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_FENCE_GATE);
        this.simpleWoodcutterRecipe(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_TRAPDOOR);
        this.simpleWoodcutterRecipe(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_BUTTON);
        this.simpleWoodcutterRecipe(consumer, Items.ACACIA_PLANKS, Items.ACACIA_SLAB, 2);
        this.simpleWoodcutterRecipe(consumer, Items.ACACIA_PLANKS, Items.ACACIA_DOOR);
        this.simpleWoodcutterRecipe(consumer, Items.ACACIA_PLANKS, Items.ACACIA_SIGN);
        this.simpleWoodcutterRecipe(consumer, Items.ACACIA_PLANKS, Items.ACACIA_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(consumer, Items.ACACIA_PLANKS, Items.ACACIA_FENCE);
        this.simpleWoodcutterRecipe(consumer, Items.ACACIA_PLANKS, Items.ACACIA_FENCE_GATE);
        this.simpleWoodcutterRecipe(consumer, Items.ACACIA_PLANKS, Items.ACACIA_TRAPDOOR);
        this.simpleWoodcutterRecipe(consumer, Items.ACACIA_PLANKS, Items.ACACIA_BUTTON);
        this.simpleWoodcutterRecipe(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_SLAB, 2);
        this.simpleWoodcutterRecipe(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_DOOR);
        this.simpleWoodcutterRecipe(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_SIGN);
        this.simpleWoodcutterRecipe(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_FENCE);
        this.simpleWoodcutterRecipe(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_FENCE_GATE);
        this.simpleWoodcutterRecipe(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_TRAPDOOR);
        this.simpleWoodcutterRecipe(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_BUTTON);
        this.simpleWoodcutterRecipe(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_SLAB, 2);
        this.simpleWoodcutterRecipe(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_DOOR);
        this.simpleWoodcutterRecipe(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_SIGN);
        this.simpleWoodcutterRecipe(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_FENCE);
        this.simpleWoodcutterRecipe(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_FENCE_GATE);
        this.simpleWoodcutterRecipe(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_TRAPDOOR);
        this.simpleWoodcutterRecipe(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_BUTTON);
        this.simpleWoodcutterRecipe(consumer, Items.WARPED_PLANKS, Items.WARPED_SLAB, 2);
        this.simpleWoodcutterRecipe(consumer, Items.WARPED_PLANKS, Items.WARPED_DOOR);
        this.simpleWoodcutterRecipe(consumer, Items.WARPED_PLANKS, Items.WARPED_SIGN);
        this.simpleWoodcutterRecipe(consumer, Items.WARPED_PLANKS, Items.WARPED_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(consumer, Items.WARPED_PLANKS, Items.WARPED_FENCE);
        this.simpleWoodcutterRecipe(consumer, Items.WARPED_PLANKS, Items.WARPED_FENCE_GATE);
        this.simpleWoodcutterRecipe(consumer, Items.WARPED_PLANKS, Items.WARPED_TRAPDOOR);
        this.simpleWoodcutterRecipe(consumer, Items.WARPED_PLANKS, Items.WARPED_BUTTON);
    }

    private void simpleWoodcutterRecipe(Consumer<FinishedRecipe> consumer, ItemLike item, ItemLike result, int count) {
        var path = "woodcutter/".concat(Objects.requireNonNull(result.asItem().getRegistryName()).getPath());
        WoodcutterRecipeBuilder.create(this.modLoc(path)).ingredient(item)
                .result(result).count(count)
                .build(consumer);
    }

    private void simpleWoodcutterRecipe(Consumer<FinishedRecipe> consumer, ItemLike item, ItemLike result) {
        this.simpleWoodcutterRecipe(consumer, item, result, 1);
    }

    private ResourceLocation modLoc(String path) {
        return new ResourceLocation(WoodenUtilities.MOD_ID, path);
    }
}

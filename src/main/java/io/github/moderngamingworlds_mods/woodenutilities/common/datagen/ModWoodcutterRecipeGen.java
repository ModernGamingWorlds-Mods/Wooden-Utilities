package io.github.moderngamingworlds_mods.woodenutilities.common.datagen;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.recipes.WoodcutterRecipeBuilder;
import io.github.noeppi_noeppi.libx.annotation.data.Datagen;
import io.github.noeppi_noeppi.libx.data.provider.recipe.RecipeProviderBase;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.Objects;

@Datagen
public class ModWoodcutterRecipeGen extends RecipeProviderBase {

    public ModWoodcutterRecipeGen(DataGenerator generator) {
        super(WoodenUtilities.getInstance(), generator);
    }

    @Override
    protected void setup() {
        this.simpleWoodcutterRecipe(Items.OAK_PLANKS, Items.OAK_SLAB, 2);
        this.simpleWoodcutterRecipe(Items.OAK_PLANKS, Items.OAK_DOOR);
        this.simpleWoodcutterRecipe(Items.OAK_PLANKS, Items.OAK_SIGN);
        this.simpleWoodcutterRecipe(Items.OAK_PLANKS, Items.OAK_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(Items.OAK_PLANKS, Items.OAK_FENCE);
        this.simpleWoodcutterRecipe(Items.OAK_PLANKS, Items.OAK_FENCE_GATE);
        this.simpleWoodcutterRecipe(Items.OAK_PLANKS, Items.OAK_TRAPDOOR);
        this.simpleWoodcutterRecipe(Items.OAK_PLANKS, Items.OAK_BUTTON);
        this.simpleWoodcutterRecipe(Items.SPRUCE_PLANKS, Items.SPRUCE_SLAB, 2);
        this.simpleWoodcutterRecipe(Items.SPRUCE_PLANKS, Items.SPRUCE_DOOR);
        this.simpleWoodcutterRecipe(Items.SPRUCE_PLANKS, Items.SPRUCE_SIGN);
        this.simpleWoodcutterRecipe(Items.SPRUCE_PLANKS, Items.SPRUCE_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(Items.SPRUCE_PLANKS, Items.SPRUCE_FENCE);
        this.simpleWoodcutterRecipe(Items.SPRUCE_PLANKS, Items.SPRUCE_FENCE_GATE);
        this.simpleWoodcutterRecipe(Items.SPRUCE_PLANKS, Items.SPRUCE_TRAPDOOR);
        this.simpleWoodcutterRecipe(Items.SPRUCE_PLANKS, Items.SPRUCE_BUTTON);
        this.simpleWoodcutterRecipe(Items.BIRCH_PLANKS, Items.BIRCH_SLAB, 2);
        this.simpleWoodcutterRecipe(Items.BIRCH_PLANKS, Items.BIRCH_DOOR);
        this.simpleWoodcutterRecipe(Items.BIRCH_PLANKS, Items.BIRCH_SIGN);
        this.simpleWoodcutterRecipe(Items.BIRCH_PLANKS, Items.BIRCH_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(Items.BIRCH_PLANKS, Items.BIRCH_FENCE);
        this.simpleWoodcutterRecipe(Items.BIRCH_PLANKS, Items.BIRCH_FENCE_GATE);
        this.simpleWoodcutterRecipe(Items.BIRCH_PLANKS, Items.BIRCH_TRAPDOOR);
        this.simpleWoodcutterRecipe(Items.BIRCH_PLANKS, Items.BIRCH_BUTTON);
        this.simpleWoodcutterRecipe(Items.JUNGLE_PLANKS, Items.JUNGLE_SLAB, 2);
        this.simpleWoodcutterRecipe(Items.JUNGLE_PLANKS, Items.JUNGLE_DOOR);
        this.simpleWoodcutterRecipe(Items.JUNGLE_PLANKS, Items.JUNGLE_SIGN);
        this.simpleWoodcutterRecipe(Items.JUNGLE_PLANKS, Items.JUNGLE_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(Items.JUNGLE_PLANKS, Items.JUNGLE_FENCE);
        this.simpleWoodcutterRecipe(Items.JUNGLE_PLANKS, Items.JUNGLE_FENCE_GATE);
        this.simpleWoodcutterRecipe(Items.JUNGLE_PLANKS, Items.JUNGLE_TRAPDOOR);
        this.simpleWoodcutterRecipe(Items.JUNGLE_PLANKS, Items.JUNGLE_BUTTON);
        this.simpleWoodcutterRecipe(Items.ACACIA_PLANKS, Items.ACACIA_SLAB, 2);
        this.simpleWoodcutterRecipe(Items.ACACIA_PLANKS, Items.ACACIA_DOOR);
        this.simpleWoodcutterRecipe(Items.ACACIA_PLANKS, Items.ACACIA_SIGN);
        this.simpleWoodcutterRecipe(Items.ACACIA_PLANKS, Items.ACACIA_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(Items.ACACIA_PLANKS, Items.ACACIA_FENCE);
        this.simpleWoodcutterRecipe(Items.ACACIA_PLANKS, Items.ACACIA_FENCE_GATE);
        this.simpleWoodcutterRecipe(Items.ACACIA_PLANKS, Items.ACACIA_TRAPDOOR);
        this.simpleWoodcutterRecipe(Items.ACACIA_PLANKS, Items.ACACIA_BUTTON);
        this.simpleWoodcutterRecipe(Items.DARK_OAK_PLANKS, Items.DARK_OAK_SLAB, 2);
        this.simpleWoodcutterRecipe(Items.DARK_OAK_PLANKS, Items.DARK_OAK_DOOR);
        this.simpleWoodcutterRecipe(Items.DARK_OAK_PLANKS, Items.DARK_OAK_SIGN);
        this.simpleWoodcutterRecipe(Items.DARK_OAK_PLANKS, Items.DARK_OAK_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(Items.DARK_OAK_PLANKS, Items.DARK_OAK_FENCE);
        this.simpleWoodcutterRecipe(Items.DARK_OAK_PLANKS, Items.DARK_OAK_FENCE_GATE);
        this.simpleWoodcutterRecipe(Items.DARK_OAK_PLANKS, Items.DARK_OAK_TRAPDOOR);
        this.simpleWoodcutterRecipe(Items.DARK_OAK_PLANKS, Items.DARK_OAK_BUTTON);
        this.simpleWoodcutterRecipe(Items.CRIMSON_PLANKS, Items.CRIMSON_SLAB, 2);
        this.simpleWoodcutterRecipe(Items.CRIMSON_PLANKS, Items.CRIMSON_DOOR);
        this.simpleWoodcutterRecipe(Items.CRIMSON_PLANKS, Items.CRIMSON_SIGN);
        this.simpleWoodcutterRecipe(Items.CRIMSON_PLANKS, Items.CRIMSON_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(Items.CRIMSON_PLANKS, Items.CRIMSON_FENCE);
        this.simpleWoodcutterRecipe(Items.CRIMSON_PLANKS, Items.CRIMSON_FENCE_GATE);
        this.simpleWoodcutterRecipe(Items.CRIMSON_PLANKS, Items.CRIMSON_TRAPDOOR);
        this.simpleWoodcutterRecipe(Items.CRIMSON_PLANKS, Items.CRIMSON_BUTTON);
        this.simpleWoodcutterRecipe(Items.WARPED_PLANKS, Items.WARPED_SLAB, 2);
        this.simpleWoodcutterRecipe(Items.WARPED_PLANKS, Items.WARPED_DOOR);
        this.simpleWoodcutterRecipe(Items.WARPED_PLANKS, Items.WARPED_SIGN);
        this.simpleWoodcutterRecipe(Items.WARPED_PLANKS, Items.WARPED_PRESSURE_PLATE);
        this.simpleWoodcutterRecipe(Items.WARPED_PLANKS, Items.WARPED_FENCE);
        this.simpleWoodcutterRecipe(Items.WARPED_PLANKS, Items.WARPED_FENCE_GATE);
        this.simpleWoodcutterRecipe(Items.WARPED_PLANKS, Items.WARPED_TRAPDOOR);
        this.simpleWoodcutterRecipe(Items.WARPED_PLANKS, Items.WARPED_BUTTON);
    }

    private void simpleWoodcutterRecipe(Item item, Item result, int count) {
        var path = "woodcutter/".concat(Objects.requireNonNull(result.getRegistryName()).getPath());
        WoodcutterRecipeBuilder.create(this.modLoc(path)).ingredient(item)
                .result(result).count(count)
                .build(this.consumer());
    }

    private void simpleWoodcutterRecipe(Item item, Item result) {
        this.simpleWoodcutterRecipe(item, result, 1);
    }

    private ResourceLocation modLoc(String path) {
        return new ResourceLocation(this.mod.modid, path);
    }
}

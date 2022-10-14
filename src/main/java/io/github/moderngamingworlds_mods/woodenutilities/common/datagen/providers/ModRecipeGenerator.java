package io.github.moderngamingworlds_mods.woodenutilities.common.datagen.providers;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModBlocks;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModItems;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;

import java.util.Objects;
import java.util.function.Consumer;

public class ModRecipeGenerator extends RecipeProvider {

    public ModRecipeGenerator(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(ModItems.WOODEN_SHEARS.get())
                .define('#', ItemTags.PLANKS)
                .pattern(" #")
                .pattern("# ")
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.WOODEN_TNT.get())
                .define('G', Tags.Items.GUNPOWDER)
                .define('P', ModTags.WOODEN_PLATES)
                .pattern("GPG")
                .pattern("PGP")
                .pattern("GPG")
                .unlockedBy("has_plates", has(ModTags.WOODEN_PLATES))
                .save(consumer);

        this.plateRecipe(consumer, ModItems.OAK_PLATE.get(), Items.OAK_PLANKS);
        this.plateRecipe(consumer, ModItems.SPRUCE_PLATE.get(), Items.SPRUCE_PLANKS);
        this.plateRecipe(consumer, ModItems.BIRCH_PLATE.get(), Items.BIRCH_PLANKS);
        this.plateRecipe(consumer, ModItems.JUNGLE_PLATE.get(), Items.JUNGLE_PLANKS);
        this.plateRecipe(consumer, ModItems.ACACIA_PLATE.get(), Items.ACACIA_PLANKS);
        this.plateRecipe(consumer, ModItems.DARK_OAK_PLATE.get(), Items.DARK_OAK_PLANKS);
        this.plateRecipe(consumer, ModItems.CRIMSON_PLATE.get(), Items.CRIMSON_PLANKS);
        this.plateRecipe(consumer, ModItems.WARPED_PLATE.get(), Items.WARPED_PLANKS);

        this.bucketRecipe(consumer, ModItems.WOODEN_BUCKET.get());

        this.woodenFurnace(consumer, ModBlocks.OAK_FURNACE.get(), Items.OAK_PLANKS, ModTags.WOODEN_PLATES);
        this.woodenFurnace(consumer, ModBlocks.SPRUCE_FURNACE.get(), Items.SPRUCE_PLANKS, ModTags.WOODEN_PLATES);
        this.woodenFurnace(consumer, ModBlocks.BIRCH_FURNACE.get(), Items.BIRCH_PLANKS, ModTags.WOODEN_PLATES);
        this.woodenFurnace(consumer, ModBlocks.JUNGLE_FURNACE.get(), Items.JUNGLE_PLANKS, ModTags.WOODEN_PLATES);
        this.woodenFurnace(consumer, ModBlocks.ACACIA_FURNACE.get(), Items.ACACIA_PLANKS, ModTags.WOODEN_PLATES);
        this.woodenFurnace(consumer, ModBlocks.DARK_OAK_FURNACE.get(), Items.DARK_OAK_PLANKS, ModTags.WOODEN_PLATES);
        this.woodenFurnace(consumer, ModBlocks.CRIMSON_FURNACE.get(), Items.CRIMSON_PLANKS, ModTags.WOODEN_PLATES);
        this.woodenFurnace(consumer, ModBlocks.WARPED_FURNACE.get(), Items.WARPED_PLANKS, ModTags.WOODEN_PLATES);
    }

    private void plateRecipe(Consumer<FinishedRecipe> consumer, Item plate, ItemLike material) {
        ShapelessRecipeBuilder.shapeless(plate)
                .requires(material)
                .requires(ModItems.WOODEN_SHEARS.get())
                .unlockedBy("has_" + Objects.requireNonNull(material.asItem().getRegistryName()).getPath(), has(material))
                .save(consumer);
    }

    private void bucketRecipe(Consumer<FinishedRecipe> consumer, Item bucket) {
        ShapedRecipeBuilder.shaped(bucket)
                .define('#', ItemTags.PLANKS)
                .pattern("# #")
                .pattern("# #")
                .pattern(" # ")
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(consumer);
    }

    private void woodenFurnace(Consumer<FinishedRecipe> consumer, ItemLike furnace, ItemLike planks, TagKey<Item> plate) {
        //noinspection ConstantConditions
        ShapedRecipeBuilder.shaped(furnace)
                .pattern("TTT")
                .pattern("TPT")
                .pattern("TTT")
                .define('T', planks)
                .define('P', plate)
                .unlockedBy("hasPlanks", has(planks))
                .unlockedBy("hasPlate", has(plate))
                .save(consumer, modLoc("wooden_furnace/" + furnace.asItem().getRegistryName().getPath()));
    }

    private ResourceLocation modLoc(String path) {
        return new ResourceLocation(WoodenUtilities.MOD_ID, path);
    }
}

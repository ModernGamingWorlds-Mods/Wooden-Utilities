package io.github.moderngamingworlds_mods.woodenutilities.common.datagen.providers;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.*;
import io.github.moderngamingworlds_mods.woodenutilities.common.util.WoodItemSet;
import io.github.moderngamingworlds_mods.woodenutilities.common.util.WoodTypeCondition;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.registries.RegistryObject;

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

        bucketRecipe(consumer, ModItems.WOODEN_BUCKET.get());

        for (ModWoodType type : ModWoodType.values()) {
            plateRecipe(consumer, type);
            woodenFurnace(consumer, type, ModTags.WOODEN_PLATES);
        }
    }

    private static void plateRecipe(Consumer<FinishedRecipe> consumer, ModWoodType type) {
        ItemLike plate = ModItems.PLATES.getRaw(type);
        WoodItemSet material = type.getPlanksItem();

        wrapInCondition(
                ShapelessRecipeBuilder.shapeless(plate)
                        .requires(material.getIngredient())
                        .requires(ModItems.WOODEN_SHEARS.get())
                        .unlockedBy("has_" + type.getName() + "_planks", has(material)),
                consumer,
                type
        );
    }

    private static void bucketRecipe(Consumer<FinishedRecipe> consumer, Item bucket) {
        ShapedRecipeBuilder.shaped(bucket)
                .define('#', ItemTags.PLANKS)
                .pattern("# #")
                .pattern("# #")
                .pattern(" # ")
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(consumer);
    }

    private static void woodenFurnace(Consumer<FinishedRecipe> consumer, ModWoodType type, TagKey<Item> plate) {
        RegistryObject<Block> furnace = ModBlocks.FURNACES.get(type);
        WoodItemSet planks = type.getPlanksItem();

        wrapInCondition(
                ShapedRecipeBuilder.shaped(furnace.get())
                        .pattern("TTT")
                        .pattern("TPT")
                        .pattern("TTT")
                        .define('T', planks.getIngredient())
                        .define('P', plate)
                        .unlockedBy("hasPlanks", has(planks))
                        .unlockedBy("hasPlate", has(plate)),
                consumer,
                modLoc("wooden_furnace/" + furnace.getId().getPath()),
                type
        );
    }

    private static void wrapInCondition(RecipeBuilder builder, Consumer<FinishedRecipe> consumer, ModWoodType type) {
        wrapInCondition(builder, consumer, RecipeBuilder.getDefaultRecipeId(builder.getResult()), type);
    }

    private static void wrapInCondition(RecipeBuilder builder, Consumer<FinishedRecipe> consumer, ResourceLocation name, ModWoodType type) {
        if (type.isVanilla()) {
            builder.save(consumer, name);
            return;
        }

        FinishedRecipe[] recipe = new FinishedRecipe[1];
        builder.save(finishedRecipe -> recipe[0] = finishedRecipe);

        ConditionalRecipe.builder()
                .addCondition(new WoodTypeCondition(type))
                .addRecipe(recipe[0])
                .generateAdvancement(recipe[0].getAdvancementId())
                .build(consumer, name);
    }

    private static InventoryChangeTrigger.TriggerInstance has(WoodItemSet set) {
        return set.getTagKey() != null ? has(set.getTagKey()) : has(set.getMainItem());
    }

    private static ResourceLocation modLoc(String path) {
        return new ResourceLocation(WoodenUtilities.MOD_ID, path);
    }

    private static String name(ItemLike item) {
        return Objects.requireNonNull(item.asItem().getRegistryName()).getPath();
    }
}

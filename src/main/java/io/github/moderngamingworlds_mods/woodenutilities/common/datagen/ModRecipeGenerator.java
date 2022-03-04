package io.github.moderngamingworlds_mods.woodenutilities.common.datagen;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModBlocks;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModItems;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModTags;
import io.github.noeppi_noeppi.libx.annotation.data.Datagen;
import io.github.noeppi_noeppi.libx.data.provider.recipe.RecipeProviderBase;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;

import java.util.Objects;

@Datagen
public class ModRecipeGenerator extends RecipeProviderBase {

    public ModRecipeGenerator(DataGenerator dataGenerator) {
        super(WoodenUtilities.getInstance(), dataGenerator);
    }

    @Override
    protected void setup() {
        ShapedRecipeBuilder.shaped(ModItems.woodenShears)
                .define('#', ItemTags.PLANKS)
                .pattern(" #")
                .pattern("# ")
                .unlockedBy("has_planks", has(ItemTags.PLANKS)).save(this.consumer());

        ShapedRecipeBuilder.shaped(ModBlocks.woodenTnt)
                .define('G', Tags.Items.GUNPOWDER)
                .define('P', ModTags.WOODEN_PLATES)
                .pattern("GPG")
                .pattern("PGP")
                .pattern("GPG")
                .unlockedBy("has_plates", has(ModTags.WOODEN_PLATES)).save(this.consumer());

        this.plateRecipe(ModItems.oakPlate, Items.OAK_PLANKS);
        this.plateRecipe(ModItems.birchPlate, Items.BIRCH_PLANKS);
        this.plateRecipe(ModItems.junglePlate, Items.JUNGLE_PLANKS);
        this.plateRecipe(ModItems.acaciaPlate, Items.ACACIA_PLANKS);
        this.plateRecipe(ModItems.darkOakPlate, Items.DARK_OAK_PLANKS);
        this.plateRecipe(ModItems.sprucePlate, Items.SPRUCE_PLANKS);
        this.plateRecipe(ModItems.crimsonPlate, Items.CRIMSON_PLANKS);
        this.plateRecipe(ModItems.warpedPlate, Items.WARPED_PLANKS);

        this.bucketRecipe(ModItems.woodenBucket);
    }

    private void plateRecipe(Item plate, ItemLike material) {
        ShapelessRecipeBuilder.shapeless(plate)
                .requires(material)
                .requires(ModItems.woodenShears)
                .unlockedBy("has_" + Objects.requireNonNull(material.asItem().getRegistryName()).getPath(), has(material))
                .save(this.consumer());
    }

    private void bucketRecipe(Item bucket) {
        ShapedRecipeBuilder.shaped(bucket)
                .define('#', ItemTags.PLANKS)
                .pattern("# #")
                .pattern("# #")
                .pattern(" # ")
                .unlockedBy("has_planks", has(ItemTags.PLANKS)).save(this.consumer());
    }

    // TODO: Hopefully Forge will change this private method to protected.
    public static InventoryChangeTrigger.TriggerInstance has(TagKey<Item> pTag) {
        return inventoryTrigger(ItemPredicate.Builder.item().of(pTag).build());
    }
}

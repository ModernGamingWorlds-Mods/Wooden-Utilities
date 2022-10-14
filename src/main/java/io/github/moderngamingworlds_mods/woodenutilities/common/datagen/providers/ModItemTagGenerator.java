package io.github.moderngamingworlds_mods.woodenutilities.common.datagen.providers;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModItems;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagGenerator extends ItemTagsProvider {

    public ModItemTagGenerator(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper fileHelper) {
        super(generator, blockTags, WoodenUtilities.MOD_ID, fileHelper);
    }

    @Override
    public void addTags() {
        this.tag(Tags.Items.SHEARS)
                .add(ModItems.WOODEN_SHEARS.get());

        this.tag(ModTags.WOODEN_PLATES)
                .add(ModItems.ACACIA_PLATE.get())
                .add(ModItems.BIRCH_PLATE.get())
                .add(ModItems.CRIMSON_PLATE.get())
                .add(ModItems.DARK_OAK_PLATE.get())
                .add(ModItems.JUNGLE_PLATE.get())
                .add(ModItems.OAK_PLATE.get())
                .add(ModItems.SPRUCE_PLATE.get())
                .add(ModItems.WARPED_PLATE.get());
    }
}

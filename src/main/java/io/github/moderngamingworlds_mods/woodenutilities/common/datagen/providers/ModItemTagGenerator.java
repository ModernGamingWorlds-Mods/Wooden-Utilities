package io.github.moderngamingworlds_mods.woodenutilities.common.datagen.providers;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.*;
import io.github.moderngamingworlds_mods.woodenutilities.common.util.WoodItemSet;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashSet;
import java.util.Set;

public class ModItemTagGenerator extends ItemTagsProvider {

    public ModItemTagGenerator(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper fileHelper) {
        super(generator, blockTags, WoodenUtilities.MOD_ID, fileHelper);
    }

    @Override
    public void addTags() {
        this.tag(Tags.Items.SHEARS)
                .add(ModItems.WOODEN_SHEARS.get());

        this.tag(ModTags.WOODEN_PLATES).add(
                ModItems.PLATES.getAll()
                        .stream()
                        .map(RegistryObject::get)
                        .toArray(Item[]::new)
        );

        Set<String> encountered = new HashSet<>();
        for (ModWoodType type : ModWoodType.values()) {
            WoodItemSet set = type.getPlanksItem();
            if (set.getTagKey() != null && encountered.add(type.getSharedName())) {
                set.fillTag(this.tag(set.getTagKey()));
            }
        }
    }
}

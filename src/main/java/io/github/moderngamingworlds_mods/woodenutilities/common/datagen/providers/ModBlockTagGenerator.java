package io.github.moderngamingworlds_mods.woodenutilities.common.datagen.providers;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, WoodenUtilities.MOD_ID, fileHelper);
    }
}

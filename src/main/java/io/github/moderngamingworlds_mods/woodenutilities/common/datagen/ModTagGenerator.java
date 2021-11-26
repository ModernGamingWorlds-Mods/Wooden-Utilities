package io.github.moderngamingworlds_mods.woodenutilities.common.datagen;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModItems;
import io.github.noeppi_noeppi.libx.annotation.data.Datagen;
import io.github.noeppi_noeppi.libx.data.provider.CommonTagsProviderBase;
import io.github.noeppi_noeppi.libx.mod.ModX;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

@Datagen
public class ModTagGenerator extends CommonTagsProviderBase {

    public ModTagGenerator(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(WoodenUtilities.getInstance(), generator, fileHelper);
    }

    @Override
    public void setup() {
        this.item(Tags.Items.SHEARS).add(ModItems.woodenShears);
    }
}

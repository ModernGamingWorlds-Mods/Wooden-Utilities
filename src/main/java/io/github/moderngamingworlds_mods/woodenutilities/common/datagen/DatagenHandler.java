package io.github.moderngamingworlds_mods.woodenutilities.common.datagen;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.datagen.providers.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = WoodenUtilities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DatagenHandler {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        if (event.includeClient()) {
            gen.addProvider(new ModBlockStateGenerator(gen, fileHelper));
            gen.addProvider(new ModItemGenerator(gen, fileHelper));
        }

        if (event.includeServer()) {
            gen.addProvider(new ModRecipeGenerator(gen));
            ModBlockTagGenerator blockTags = new ModBlockTagGenerator(gen, fileHelper);
            gen.addProvider(new ModItemTagGenerator(gen, blockTags, fileHelper));
            gen.addProvider(new ModWoodcutterRecipeGen(gen));
        }
    }
}

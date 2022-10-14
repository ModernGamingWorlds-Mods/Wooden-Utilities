package io.github.moderngamingworlds_mods.woodenutilities;

import io.github.moderngamingworlds_mods.woodenutilities.common.config.WUCommonConfig;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModBlocks;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModItems;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModMenus;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModRecipes;
import io.github.moderngamingworlds_mods.woodenutilities.common.item.buckets.EnumWoodenBucket;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.Nonnull;

@Mod(WoodenUtilities.MOD_ID)
public final class WoodenUtilities {

    public static final String MOD_ID = "woodenutilities";
    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab("woodenutilities") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.OAK_PLATE.get());
        }
    };

    public WoodenUtilities() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.init(bus);
        ModItems.init(bus);
        ModRecipes.init(bus);
        ModMenus.init(bus);

        bus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, WUCommonConfig.SPEC);
    }

    private void setup(FMLCommonSetupEvent event) {
        EnumWoodenBucket.setup();
    }
}

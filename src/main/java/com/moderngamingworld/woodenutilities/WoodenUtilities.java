package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModBlocks;
import com.moderngamingworld.woodenutilities.registry.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(WoodenUtilities.MOD_ID)
public class WoodenUtilities {
    public static final String MOD_ID = "woodenutilities";
    private static final Logger LOGGER = LoggerFactory.getLogger(WoodenUtilities.class);

    public WoodenUtilities() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Wooden Utilities initialized.");
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModItems.OAK_WOODEN_PLATE);
            event.accept(ModItems.SPRUCE_WOODEN_PLATE);
            event.accept(ModItems.BIRCH_WOODEN_PLATE);
            event.accept(ModItems.JUNGLE_WOODEN_PLATE);
            event.accept(ModItems.ACACIA_WOODEN_PLATE);
            event.accept(ModItems.DARK_OAK_WOODEN_PLATE);
            event.accept(ModItems.MANGROVE_WOODEN_PLATE);
            event.accept(ModItems.CHERRY_WOODEN_PLATE);
            event.accept(ModItems.BAMBOO_WOODEN_PLATE);
            event.accept(ModItems.CRIMSON_WOODEN_PLATE);
            event.accept(ModItems.WARPED_WOODEN_PLATE);
            event.accept(ModItems.TWILIGHT_OAK_WOODEN_PLATE);
            event.accept(ModItems.CANOPY_WOODEN_PLATE);
            event.accept(ModItems.TWILIGHT_MANGROVE_WOODEN_PLATE);
            event.accept(ModItems.DARK_WOODEN_PLATE);
            event.accept(ModItems.TIME_WOODEN_PLATE);
            event.accept(ModItems.TRANSFORMATION_WOODEN_PLATE);
            event.accept(ModItems.MINING_WOODEN_PLATE);
            event.accept(ModItems.SORTING_WOODEN_PLATE);
            event.accept(ModItems.TOWERWOOD_WOODEN_PLATE);
            event.accept(ModItems.FIR_WOODEN_PLATE);
            event.accept(ModItems.PINE_WOODEN_PLATE);
            event.accept(ModItems.MAPLE_WOODEN_PLATE);
            event.accept(ModItems.REDWOOD_WOODEN_PLATE);
            event.accept(ModItems.MAHOGANY_WOODEN_PLATE);
            event.accept(ModItems.JACARANDA_WOODEN_PLATE);
            event.accept(ModItems.PALM_WOODEN_PLATE);
            event.accept(ModItems.WILLOW_WOODEN_PLATE);
            event.accept(ModItems.DEAD_WOODEN_PLATE);
            event.accept(ModItems.MAGIC_WOODEN_PLATE);
            event.accept(ModItems.UMBRAN_WOODEN_PLATE);
            event.accept(ModItems.HELLBARK_WOODEN_PLATE);
            event.accept(ModItems.EMPYREAL_WOODEN_PLATE);
            event.accept(ModItems.ROSEROOT_WOODEN_PLATE);
            event.accept(ModItems.YAGROOT_WOODEN_PLATE);
            event.accept(ModItems.CRUDEROOT_WOODEN_PLATE);
            event.accept(ModItems.CONBERRY_WOODEN_PLATE);
            event.accept(ModItems.SUNROOT_WOODEN_PLATE);
            event.accept(ModItems.SKYROOT_WOODEN_PLATE);
            event.accept(ModItems.OAK_WOODEN_CAULDRON);
            event.accept(ModItems.SPRUCE_WOODEN_CAULDRON);
            event.accept(ModItems.BIRCH_WOODEN_CAULDRON);
            event.accept(ModItems.JUNGLE_WOODEN_CAULDRON);
            event.accept(ModItems.ACACIA_WOODEN_CAULDRON);
            event.accept(ModItems.DARK_OAK_WOODEN_CAULDRON);
            event.accept(ModItems.MANGROVE_WOODEN_CAULDRON);
            event.accept(ModItems.CHERRY_WOODEN_CAULDRON);
            event.accept(ModItems.BAMBOO_WOODEN_CAULDRON);
            event.accept(ModItems.CRIMSON_WOODEN_CAULDRON);
            event.accept(ModItems.WARPED_WOODEN_CAULDRON);
            event.accept(ModItems.TWILIGHT_OAK_WOODEN_CAULDRON);
            event.accept(ModItems.CANOPY_WOODEN_CAULDRON);
            event.accept(ModItems.TWILIGHT_MANGROVE_WOODEN_CAULDRON);
            event.accept(ModItems.DARK_WOODEN_CAULDRON);
            event.accept(ModItems.TIME_WOODEN_CAULDRON);
            event.accept(ModItems.TRANSFORMATION_WOODEN_CAULDRON);
            event.accept(ModItems.MINING_WOODEN_CAULDRON);
            event.accept(ModItems.SORTING_WOODEN_CAULDRON);
            event.accept(ModItems.TOWERWOOD_WOODEN_CAULDRON);
            event.accept(ModItems.FIR_WOODEN_CAULDRON);
            event.accept(ModItems.PINE_WOODEN_CAULDRON);
            event.accept(ModItems.MAPLE_WOODEN_CAULDRON);
            event.accept(ModItems.REDWOOD_WOODEN_CAULDRON);
            event.accept(ModItems.MAHOGANY_WOODEN_CAULDRON);
            event.accept(ModItems.JACARANDA_WOODEN_CAULDRON);
            event.accept(ModItems.PALM_WOODEN_CAULDRON);
            event.accept(ModItems.WILLOW_WOODEN_CAULDRON);
            event.accept(ModItems.DEAD_WOODEN_CAULDRON);
            event.accept(ModItems.MAGIC_WOODEN_CAULDRON);
            event.accept(ModItems.UMBRAN_WOODEN_CAULDRON);
            event.accept(ModItems.HELLBARK_WOODEN_CAULDRON);
            event.accept(ModItems.EMPYREAL_WOODEN_CAULDRON);
            event.accept(ModItems.ROSEROOT_WOODEN_CAULDRON);
            event.accept(ModItems.YAGROOT_WOODEN_CAULDRON);
            event.accept(ModItems.CRUDEROOT_WOODEN_CAULDRON);
            event.accept(ModItems.CONBERRY_WOODEN_CAULDRON);
            event.accept(ModItems.SUNROOT_WOODEN_CAULDRON);
            event.accept(ModItems.SKYROOT_WOODEN_CAULDRON);
        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.WOODEN_SHEARS);
            event.accept(ModItems.WOODEN_WRENCH);
            event.accept(ModItems.WOODEN_HAMMER);
        }

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(ModItems.WOODEN_BARREL);
            event.accept(ModItems.OAK_WOODEN_BARREL);
            event.accept(ModItems.SPRUCE_WOODEN_BARREL);
            event.accept(ModItems.BIRCH_WOODEN_BARREL);
            event.accept(ModItems.JUNGLE_WOODEN_BARREL);
            event.accept(ModItems.ACACIA_WOODEN_BARREL);
            event.accept(ModItems.DARK_OAK_WOODEN_BARREL);
            event.accept(ModItems.MANGROVE_WOODEN_BARREL);
            event.accept(ModItems.CHERRY_WOODEN_BARREL);
            event.accept(ModItems.BAMBOO_WOODEN_BARREL);
            event.accept(ModItems.CRIMSON_WOODEN_BARREL);
            event.accept(ModItems.WARPED_WOODEN_BARREL);
            event.accept(ModItems.TWILIGHT_OAK_WOODEN_BARREL);
            event.accept(ModItems.CANOPY_WOODEN_BARREL);
            event.accept(ModItems.TWILIGHT_MANGROVE_WOODEN_BARREL);
            event.accept(ModItems.DARK_WOODEN_BARREL);
            event.accept(ModItems.TIME_WOODEN_BARREL);
            event.accept(ModItems.TRANSFORMATION_WOODEN_BARREL);
            event.accept(ModItems.MINING_WOODEN_BARREL);
            event.accept(ModItems.SORTING_WOODEN_BARREL);
            event.accept(ModItems.TOWERWOOD_WOODEN_BARREL);
            event.accept(ModItems.FIR_WOODEN_BARREL);
            event.accept(ModItems.PINE_WOODEN_BARREL);
            event.accept(ModItems.MAPLE_WOODEN_BARREL);
            event.accept(ModItems.REDWOOD_WOODEN_BARREL);
            event.accept(ModItems.MAHOGANY_WOODEN_BARREL);
            event.accept(ModItems.JACARANDA_WOODEN_BARREL);
            event.accept(ModItems.PALM_WOODEN_BARREL);
            event.accept(ModItems.WILLOW_WOODEN_BARREL);
            event.accept(ModItems.DEAD_WOODEN_BARREL);
            event.accept(ModItems.MAGIC_WOODEN_BARREL);
            event.accept(ModItems.UMBRAN_WOODEN_BARREL);
            event.accept(ModItems.HELLBARK_WOODEN_BARREL);
            event.accept(ModItems.EMPYREAL_WOODEN_BARREL);
            event.accept(ModItems.ROSEROOT_WOODEN_BARREL);
            event.accept(ModItems.YAGROOT_WOODEN_BARREL);
            event.accept(ModItems.CRUDEROOT_WOODEN_BARREL);
            event.accept(ModItems.CONBERRY_WOODEN_BARREL);
            event.accept(ModItems.SUNROOT_WOODEN_BARREL);
            event.accept(ModItems.SKYROOT_WOODEN_BARREL);
        }
    }
}

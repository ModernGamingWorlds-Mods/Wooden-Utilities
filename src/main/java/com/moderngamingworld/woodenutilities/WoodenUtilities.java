package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModBlockEntities;
import com.moderngamingworld.woodenutilities.registry.ModBlocks;
import com.moderngamingworld.woodenutilities.registry.ModCreativeTabs;
import com.moderngamingworld.woodenutilities.registry.ModDataComponents;
import com.moderngamingworld.woodenutilities.registry.ModItems;
import com.moderngamingworld.woodenutilities.registry.ModMenuTypes;
import com.moderngamingworld.woodenutilities.registry.ModRecipes;
import net.minecraft.core.Direction;
import net.minecraft.world.item.CreativeModeTabs;
//? if neoforge {
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
//?} else {
/*import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
*///?}
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(WoodenUtilities.MOD_ID)
public class WoodenUtilities {
    public static final String MOD_ID = "woodenutilities";
    private static final Logger LOGGER = LoggerFactory.getLogger(WoodenUtilities.class);

    //? if neoforge {
    public WoodenUtilities(IEventBus modEventBus) {
        modEventBus.addListener(WoodenUtilities::registerCapabilities);
    //?} else {
    /*public WoodenUtilities() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    *///?}
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModDataComponents.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModRecipes.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Wooden Utilities initialized.");
    }

    //? if neoforge {
    private static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(
            Capabilities.FluidHandler.BLOCK,
            ModBlockEntities.WOODEN_CAULDRON.get(),
            (be, side) -> {
                if (side == Direction.UP) return null;
                if (side == Direction.DOWN) return be.extractFluidHandler;
                return be.sideFluidHandler;
            }
        );
        event.registerBlockEntity(
            Capabilities.ItemHandler.BLOCK,
            ModBlockEntities.WOODEN_CAULDRON.get(),
            (be, side) -> {
                if (side == null || side == Direction.UP) return be.insertOnlyItemHandler;
                return null;
            }
        );

        // Register fluid capability for all wooden bucket variants
        for (var holder : ModItems.ALL_WOODEN_BUCKETS) {
            event.registerItem(
                Capabilities.FluidHandler.ITEM,
                (stack, ctx) -> WoodenBucketItem.createFluidHandler(stack),
                holder.get()
            );
        }
    }
    //?}

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
            event.accept(ModItems.ASPEN_WOODEN_PLATE);
            event.accept(ModItems.BAOBAB_WOODEN_PLATE);
            event.accept(ModItems.BLUE_ENCHANTED_WOODEN_PLATE);
            event.accept(ModItems.CIKA_WOODEN_PLATE);
            event.accept(ModItems.CYPRESS_WOODEN_PLATE);
            event.accept(ModItems.EBONY_WOODEN_PLATE);
            event.accept(ModItems.BWG_FIR_WOODEN_PLATE);
            event.accept(ModItems.FLORUS_WOODEN_PLATE);
            event.accept(ModItems.GREEN_ENCHANTED_WOODEN_PLATE);
            event.accept(ModItems.HOLLY_WOODEN_PLATE);
            event.accept(ModItems.IRONWOOD_WOODEN_PLATE);
            event.accept(ModItems.BWG_JACARANDA_WOODEN_PLATE);
            event.accept(ModItems.BWG_MAHOGANY_WOODEN_PLATE);
            event.accept(ModItems.BWG_MAPLE_WOODEN_PLATE);
            event.accept(ModItems.BWG_PALM_WOODEN_PLATE);
            event.accept(ModItems.BWG_PINE_WOODEN_PLATE);
            event.accept(ModItems.RAINBOW_EUCALYPTUS_WOODEN_PLATE);
            event.accept(ModItems.BWG_REDWOOD_WOODEN_PLATE);
            event.accept(ModItems.SAKURA_WOODEN_PLATE);
            event.accept(ModItems.SKYRIS_WOODEN_PLATE);
            //? if neoforge {
            event.accept(ModItems.SPIRIT_WOODEN_PLATE);
            //?}
            event.accept(ModItems.WHITE_MANGROVE_WOODEN_PLATE);
            event.accept(ModItems.BWG_WILLOW_WOODEN_PLATE);
            event.accept(ModItems.WITCH_HAZEL_WOODEN_PLATE);
            event.accept(ModItems.ZELKOVA_WOODEN_PLATE);
            event.accept(ModItems.ASPEN_WOODEN_CAULDRON);
            event.accept(ModItems.BAOBAB_WOODEN_CAULDRON);
            event.accept(ModItems.BLUE_ENCHANTED_WOODEN_CAULDRON);
            event.accept(ModItems.CIKA_WOODEN_CAULDRON);
            event.accept(ModItems.CYPRESS_WOODEN_CAULDRON);
            event.accept(ModItems.EBONY_WOODEN_CAULDRON);
            event.accept(ModItems.BWG_FIR_WOODEN_CAULDRON);
            event.accept(ModItems.FLORUS_WOODEN_CAULDRON);
            event.accept(ModItems.GREEN_ENCHANTED_WOODEN_CAULDRON);
            event.accept(ModItems.HOLLY_WOODEN_CAULDRON);
            event.accept(ModItems.IRONWOOD_WOODEN_CAULDRON);
            event.accept(ModItems.BWG_JACARANDA_WOODEN_CAULDRON);
            event.accept(ModItems.BWG_MAHOGANY_WOODEN_CAULDRON);
            event.accept(ModItems.BWG_MAPLE_WOODEN_CAULDRON);
            event.accept(ModItems.BWG_PALM_WOODEN_CAULDRON);
            event.accept(ModItems.BWG_PINE_WOODEN_CAULDRON);
            event.accept(ModItems.RAINBOW_EUCALYPTUS_WOODEN_CAULDRON);
            event.accept(ModItems.BWG_REDWOOD_WOODEN_CAULDRON);
            event.accept(ModItems.SAKURA_WOODEN_CAULDRON);
            event.accept(ModItems.SKYRIS_WOODEN_CAULDRON);
            //? if neoforge {
            event.accept(ModItems.SPIRIT_WOODEN_CAULDRON);
            //?}
            event.accept(ModItems.WHITE_MANGROVE_WOODEN_CAULDRON);
            event.accept(ModItems.BWG_WILLOW_WOODEN_CAULDRON);
            event.accept(ModItems.WITCH_HAZEL_WOODEN_CAULDRON);
            event.accept(ModItems.ZELKOVA_WOODEN_CAULDRON);
        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.WOODEN_SHEARS);
            event.accept(ModItems.WOODEN_WRENCH);
            event.accept(ModItems.WOODEN_HAMMER);
            event.accept(ModItems.WOODEN_BUCKET);
        }

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(ModItems.WOODEN_ANVIL);
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
            event.accept(ModItems.ASPEN_WOODEN_BARREL);
            event.accept(ModItems.BAOBAB_WOODEN_BARREL);
            event.accept(ModItems.BLUE_ENCHANTED_WOODEN_BARREL);
            event.accept(ModItems.CIKA_WOODEN_BARREL);
            event.accept(ModItems.CYPRESS_WOODEN_BARREL);
            event.accept(ModItems.EBONY_WOODEN_BARREL);
            event.accept(ModItems.BWG_FIR_WOODEN_BARREL);
            event.accept(ModItems.FLORUS_WOODEN_BARREL);
            event.accept(ModItems.GREEN_ENCHANTED_WOODEN_BARREL);
            event.accept(ModItems.HOLLY_WOODEN_BARREL);
            event.accept(ModItems.IRONWOOD_WOODEN_BARREL);
            event.accept(ModItems.BWG_JACARANDA_WOODEN_BARREL);
            event.accept(ModItems.BWG_MAHOGANY_WOODEN_BARREL);
            event.accept(ModItems.BWG_MAPLE_WOODEN_BARREL);
            event.accept(ModItems.BWG_PALM_WOODEN_BARREL);
            event.accept(ModItems.BWG_PINE_WOODEN_BARREL);
            event.accept(ModItems.RAINBOW_EUCALYPTUS_WOODEN_BARREL);
            event.accept(ModItems.BWG_REDWOOD_WOODEN_BARREL);
            event.accept(ModItems.SAKURA_WOODEN_BARREL);
            event.accept(ModItems.SKYRIS_WOODEN_BARREL);
            //? if neoforge {
            event.accept(ModItems.SPIRIT_WOODEN_BARREL);
            //?}
            event.accept(ModItems.WHITE_MANGROVE_WOODEN_BARREL);
            event.accept(ModItems.BWG_WILLOW_WOODEN_BARREL);
            event.accept(ModItems.WITCH_HAZEL_WOODEN_BARREL);
            event.accept(ModItems.ZELKOVA_WOODEN_BARREL);
            event.accept(ModItems.OAK_WOODEN_HOPPER);
            event.accept(ModItems.SPRUCE_WOODEN_HOPPER);
            event.accept(ModItems.BIRCH_WOODEN_HOPPER);
            event.accept(ModItems.JUNGLE_WOODEN_HOPPER);
            event.accept(ModItems.ACACIA_WOODEN_HOPPER);
            event.accept(ModItems.DARK_OAK_WOODEN_HOPPER);
            event.accept(ModItems.MANGROVE_WOODEN_HOPPER);
            event.accept(ModItems.CHERRY_WOODEN_HOPPER);
            event.accept(ModItems.BAMBOO_WOODEN_HOPPER);
            event.accept(ModItems.CRIMSON_WOODEN_HOPPER);
            event.accept(ModItems.WARPED_WOODEN_HOPPER);
            event.accept(ModItems.TWILIGHT_OAK_WOODEN_HOPPER);
            event.accept(ModItems.CANOPY_WOODEN_HOPPER);
            event.accept(ModItems.TWILIGHT_MANGROVE_WOODEN_HOPPER);
            event.accept(ModItems.DARK_WOODEN_HOPPER);
            event.accept(ModItems.TIME_WOODEN_HOPPER);
            event.accept(ModItems.MINING_WOODEN_HOPPER);
            event.accept(ModItems.SORTING_WOODEN_HOPPER);
            event.accept(ModItems.TOWERWOOD_WOODEN_HOPPER);
            event.accept(ModItems.FIR_WOODEN_HOPPER);
            event.accept(ModItems.PINE_WOODEN_HOPPER);
            event.accept(ModItems.MAPLE_WOODEN_HOPPER);
            event.accept(ModItems.REDWOOD_WOODEN_HOPPER);
            event.accept(ModItems.MAHOGANY_WOODEN_HOPPER);
            event.accept(ModItems.JACARANDA_WOODEN_HOPPER);
            event.accept(ModItems.PALM_WOODEN_HOPPER);
            event.accept(ModItems.WILLOW_WOODEN_HOPPER);
            event.accept(ModItems.DEAD_WOODEN_HOPPER);
            event.accept(ModItems.MAGIC_WOODEN_HOPPER);
            event.accept(ModItems.UMBRAN_WOODEN_HOPPER);
            event.accept(ModItems.HELLBARK_WOODEN_HOPPER);
            event.accept(ModItems.EMPYREAL_WOODEN_HOPPER);
            event.accept(ModItems.ROSEROOT_WOODEN_HOPPER);
            event.accept(ModItems.YAGROOT_WOODEN_HOPPER);
            event.accept(ModItems.CRUDEROOT_WOODEN_HOPPER);
            event.accept(ModItems.CONBERRY_WOODEN_HOPPER);
            event.accept(ModItems.SUNROOT_WOODEN_HOPPER);
            event.accept(ModItems.SKYROOT_WOODEN_HOPPER);
            event.accept(ModItems.ASPEN_WOODEN_HOPPER);
            event.accept(ModItems.BAOBAB_WOODEN_HOPPER);
            event.accept(ModItems.BLUE_ENCHANTED_WOODEN_HOPPER);
            event.accept(ModItems.CIKA_WOODEN_HOPPER);
            event.accept(ModItems.CYPRESS_WOODEN_HOPPER);
            event.accept(ModItems.EBONY_WOODEN_HOPPER);
            event.accept(ModItems.BWG_FIR_WOODEN_HOPPER);
            event.accept(ModItems.FLORUS_WOODEN_HOPPER);
            event.accept(ModItems.GREEN_ENCHANTED_WOODEN_HOPPER);
            event.accept(ModItems.HOLLY_WOODEN_HOPPER);
            event.accept(ModItems.IRONWOOD_WOODEN_HOPPER);
            event.accept(ModItems.BWG_JACARANDA_WOODEN_HOPPER);
            event.accept(ModItems.BWG_MAHOGANY_WOODEN_HOPPER);
            event.accept(ModItems.BWG_MAPLE_WOODEN_HOPPER);
            event.accept(ModItems.BWG_PALM_WOODEN_HOPPER);
            event.accept(ModItems.BWG_PINE_WOODEN_HOPPER);
            event.accept(ModItems.RAINBOW_EUCALYPTUS_WOODEN_HOPPER);
            event.accept(ModItems.BWG_REDWOOD_WOODEN_HOPPER);
            event.accept(ModItems.SAKURA_WOODEN_HOPPER);
            event.accept(ModItems.SKYRIS_WOODEN_HOPPER);
            //? if neoforge {
            event.accept(ModItems.SPIRIT_WOODEN_HOPPER);
            //?}
            event.accept(ModItems.WHITE_MANGROVE_WOODEN_HOPPER);
            event.accept(ModItems.BWG_WILLOW_WOODEN_HOPPER);
            event.accept(ModItems.WITCH_HAZEL_WOODEN_HOPPER);
            event.accept(ModItems.ZELKOVA_WOODEN_HOPPER);
        }
    }
}

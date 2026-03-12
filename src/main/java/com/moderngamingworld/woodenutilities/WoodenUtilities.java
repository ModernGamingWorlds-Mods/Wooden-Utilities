package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModBlockEntities;
import com.moderngamingworld.woodenutilities.registry.ModBlocks;
import com.moderngamingworld.woodenutilities.registry.ModCreativeTabs;
import com.moderngamingworld.woodenutilities.registry.ModDataComponents;
import com.moderngamingworld.woodenutilities.registry.ModItems;
import com.moderngamingworld.woodenutilities.registry.ModMenuTypes;
import com.moderngamingworld.woodenutilities.registry.ModRecipes;
import com.moderngamingworld.woodenutilities.registry.ModWoodTypes;
import net.minecraft.core.Direction;
import net.minecraft.world.item.CreativeModeTabs;
//? if neoforge {
/*import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
*///?} else {
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
//? if has_geckolib {
import software.bernie.geckolib.GeckoLib;
//?}
//?}
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(WoodenUtilities.MOD_ID)
public class WoodenUtilities {
    public static final String MOD_ID = "woodenutilities";
    private static final Logger LOGGER = LoggerFactory.getLogger(WoodenUtilities.class);

    //? if neoforge {
    /*public WoodenUtilities(IEventBus modEventBus) {
        modEventBus.addListener(WoodenUtilities::registerCapabilities);
    *///?} else {
    public WoodenUtilities() {
        //? if has_geckolib {
        GeckoLib.initialize();
        //?}
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    //?}
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        ModWoodTypes.init();
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
    /*private static void registerCapabilities(RegisterCapabilitiesEvent event) {
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
    *///?}

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            ModItems.ALL_PLATES.forEach(event::accept);
            ModItems.ALL_CAULDRONS.forEach(event::accept);
        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.WOODEN_SHEARS);
            event.accept(ModItems.WOODEN_WRENCH);
            event.accept(ModItems.WOODEN_HAMMER);
            event.accept(ModItems.WOODEN_BUCKET);
        }

        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.SAWDUST);
        }

        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(ModItems.WOODEN_ANVIL);
            ModItems.ALL_BARRELS.forEach(event::accept);
            ModItems.ALL_HOPPERS.forEach(event::accept);
        }
    }
}

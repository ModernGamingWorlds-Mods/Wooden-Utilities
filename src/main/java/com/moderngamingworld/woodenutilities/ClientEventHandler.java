package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModMenuTypes;
//? if neoforge {
/*import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
*///?} else {
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraft.client.gui.screens.MenuScreens;
//?}

//? if neoforge {
/*@EventBusSubscriber(modid = WoodenUtilities.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
*///?} else {
@Mod.EventBusSubscriber(modid = WoodenUtilities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
//?}
public class ClientEventHandler {

    //? if neoforge {
    /*@SubscribeEvent
    public static void registerScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenuTypes.WOODEN_ANVIL.get(), WoodenAnvilScreen::new);
    }
    *///?} else {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() ->
            MenuScreens.register(ModMenuTypes.WOODEN_ANVIL.get(), WoodenAnvilScreen::new)
        );
    }
    //?}
}

package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenAnvilMenu;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
//? if neoforge {
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
//?} else {
/*import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
*///?}

public final class ModMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENU_TYPES =
        DeferredRegister.create(Registries.MENU, WoodenUtilities.MOD_ID);

    //? if neoforge {
    public static final DeferredHolder<MenuType<?>, MenuType<WoodenAnvilMenu>> WOODEN_ANVIL =
    //?} else {
    /*public static final RegistryObject<MenuType<WoodenAnvilMenu>> WOODEN_ANVIL =
    *///?}
        MENU_TYPES.register("wooden_anvil",
            () -> new MenuType<>((containerId, inventory) ->
                new WoodenAnvilMenu(containerId, inventory), FeatureFlags.VANILLA_SET));

    private ModMenuTypes() {}

    public static void register(IEventBus eventBus) {
        MENU_TYPES.register(eventBus);
    }
}

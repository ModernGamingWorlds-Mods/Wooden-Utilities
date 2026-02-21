package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenAnvilMenu;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENU_TYPES =
        DeferredRegister.create(ForgeRegistries.MENU_TYPES, WoodenUtilities.MOD_ID);

    public static final RegistryObject<MenuType<WoodenAnvilMenu>> WOODEN_ANVIL =
        MENU_TYPES.register("wooden_anvil",
            () -> IForgeMenuType.create((containerId, inventory, buf) ->
                new WoodenAnvilMenu(containerId, inventory)));

    private ModMenuTypes() {}

    public static void register(IEventBus eventBus) {
        MENU_TYPES.register(eventBus);
    }
}

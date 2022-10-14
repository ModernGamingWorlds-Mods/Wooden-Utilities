package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import com.mojang.datafixers.util.Function4;
import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.menu.AbstractBlockMenu;
import io.github.moderngamingworlds_mods.woodenutilities.common.menu.WoodCutterMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;

public class ModMenus {

    private static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, WoodenUtilities.MOD_ID);

    public static final RegistryObject<MenuType<WoodCutterMenu>> WOODCUTTER = menu("woodcutter", WoodCutterMenu::new);



    private static <T extends AbstractBlockMenu> RegistryObject<MenuType<T>> menu(
            String name, Function4<Level, BlockPos, Inventory, Integer, T> constructor
    ) {
        return MENU_TYPES.register(name, () -> IForgeMenuType.create((windowId, inv, data) ->
                constructor.apply(inv.player.level, data.readBlockPos(), inv, windowId)
        ));
    }

    public static void init(IEventBus bus) {
        MENU_TYPES.register(bus);
    }
}

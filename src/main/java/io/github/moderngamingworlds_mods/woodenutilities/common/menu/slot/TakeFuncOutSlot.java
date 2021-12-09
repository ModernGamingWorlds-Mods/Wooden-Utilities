package io.github.moderngamingworlds_mods.woodenutilities.common.menu.slot;

import io.github.moderngamingworlds_mods.woodenutilities.common.util.BiVoidFunc;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class TakeFuncOutSlot extends Slot {

    private final BiVoidFunc<Player, ItemStack> onTake;

    public TakeFuncOutSlot(Container container, int slotId, int x, int y, BiVoidFunc<Player, ItemStack> onTake) {
        super(container, slotId, x, y);
        this.onTake = onTake;
    }

    public boolean mayPlace(ItemStack p_40362_) {
        return false;
    }

    @Override
    public void onTake(Player player, ItemStack itemStack) {
        this.onTake.apply(player, itemStack);
        super.onTake(player, itemStack);
    }
}

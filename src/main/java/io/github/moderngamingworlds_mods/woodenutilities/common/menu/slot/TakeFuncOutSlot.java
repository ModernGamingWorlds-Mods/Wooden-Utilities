package io.github.moderngamingworlds_mods.woodenutilities.common.menu.slot;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

import java.util.function.BiConsumer;

public class TakeFuncOutSlot extends Slot {

    private final BiConsumer<Player, ItemStack> onTake;

    public TakeFuncOutSlot(Container container, int slotId, int x, int y, BiConsumer<Player, ItemStack> onTake) {
        super(container, slotId, x, y);
        this.onTake = onTake;
    }

    public boolean mayPlace(ItemStack stack) {
        return false;
    }

    @Override
    public void onTake(Player player, ItemStack itemStack) {
        this.onTake.accept(player, itemStack);
        super.onTake(player, itemStack);
    }
}

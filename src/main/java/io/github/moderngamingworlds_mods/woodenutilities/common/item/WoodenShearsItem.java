package io.github.moderngamingworlds_mods.woodenutilities.common.item;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;

import java.util.Objects;

public class WoodenShearsItem extends ShearsItem {

    public WoodenShearsItem() {
        super(new Properties().durability(119).tab(Objects.requireNonNull(WoodenUtilities.getInstance().tab)));
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        int damage = stack.getDamageValue() + 1;
        if (damage >= stack.getMaxDamage()) {
            return ItemStack.EMPTY;
        }

        stack.setDamageValue(damage);
        return stack.copy();
    }
}

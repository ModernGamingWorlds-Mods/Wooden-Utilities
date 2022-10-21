package io.github.moderngamingworlds_mods.woodenutilities.common.item;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModWoodType;
import io.github.moderngamingworlds_mods.woodenutilities.common.util.IWoodenObject;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.*;

public class WoodItem extends Item implements IWoodenObject {

    private final ModWoodType type;

    public WoodItem(ModWoodType type) {
        this(type, new Properties().tab(WoodenUtilities.CREATIVE_TAB));
    }

    public WoodItem(ModWoodType type, Properties props) {
        super(props);
        this.type = type;
    }

    @Override
    public void fillItemCategory(CreativeModeTab category, NonNullList<ItemStack> items) {
        if (this.type.isAvailable()) {
            super.fillItemCategory(category, items);
        }
    }

    @Override
    public final ModWoodType getType() {
        return this.type;
    }
}

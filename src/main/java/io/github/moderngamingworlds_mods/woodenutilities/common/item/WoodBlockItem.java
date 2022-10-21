package io.github.moderngamingworlds_mods.woodenutilities.common.item;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModWoodType;
import io.github.moderngamingworlds_mods.woodenutilities.common.util.IWoodenObject;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

public class WoodBlockItem extends BlockItem implements IWoodenObject {

    private final ModWoodType type;

    public WoodBlockItem(ModWoodType type, Block block) {
        this(type, block, new Properties().tab(WoodenUtilities.CREATIVE_TAB));
    }

    public WoodBlockItem(ModWoodType type, Block block, Properties properties) {
        super(block, properties);
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

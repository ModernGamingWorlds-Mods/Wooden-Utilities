package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;

public class ModTags {

    public static final Tag.Named<Item> WOODEN_PLATES = ItemTags.bind(WoodenUtilities.getInstance().modid.concat(":wooden_plates"));
}

package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static final TagKey<Item> WOODEN_PLATES = ItemTags.create(new ResourceLocation(WoodenUtilities.getInstance().modid, "wooden_plates"));
}

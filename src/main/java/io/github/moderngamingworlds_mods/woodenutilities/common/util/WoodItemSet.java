package io.github.moderngamingworlds_mods.woodenutilities.common.util;

import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModWoodType;
import net.minecraft.core.Registry;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public final class WoodItemSet {

    private final ModWoodType type;
    private final String shape;
    private final RegistryObject<Item> mainItem;
    private final List<RegistryObject<Item>> allItems = new ArrayList<>();
    private TagKey<Item> tagKey = null;

    public WoodItemSet(ModWoodType type, String shape, Item item) {
        //noinspection ConstantConditions
        this(type, shape, "minecraft", item.getRegistryName().getPath());
    }

    public WoodItemSet(ModWoodType type, String shape, String mod, String itemName) {
        this.type = type;
        this.shape = shape;
        this.mainItem = RegistryObject.create(new ResourceLocation(mod, itemName), ForgeRegistries.ITEMS);
        this.allItems.add(this.mainItem);
    }

    public void add(WoodItemSet set) {
        this.allItems.add(set.mainItem);
    }

    public Item getMainItem() {
        return this.mainItem.get();
    }

    public void fillTag(TagsProvider.TagAppender<Item> tag) {
        this.allItems.forEach(item -> tag.addOptional(item.getId()));
    }

    public Ingredient getIngredient() {
        if (this.allItems.size() > 1) {
            return Ingredient.of(getTagKey());
        }
        return Ingredient.of(this.mainItem.get());
    }

    public TagKey<Item> getTagKey() {
        if (this.tagKey == null && this.allItems.size() > 1) {
            this.tagKey = new TagKey<>(
                    Registry.ITEM_REGISTRY,
                    new ResourceLocation("forge", shape + "/" + type.getSharedName())
            );
        }
        return this.tagKey;
    }
}

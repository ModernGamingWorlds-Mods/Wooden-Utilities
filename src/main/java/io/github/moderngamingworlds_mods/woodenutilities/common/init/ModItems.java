package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.item.WoodItem;
import io.github.moderngamingworlds_mods.woodenutilities.common.item.WoodenShearsItem;
import io.github.moderngamingworlds_mods.woodenutilities.common.item.buckets.WoodenBucketItem;
import io.github.moderngamingworlds_mods.woodenutilities.common.util.WoodTypeObjectMap;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WoodenUtilities.MOD_ID);

    public static final WoodTypeObjectMap<Item> PLATES = woodItems("plate");

    public static final RegistryObject<Item> WOODEN_SHEARS = item("wooden_shears", WoodenShearsItem::new);
    public static final RegistryObject<Item> WOODEN_DIAMOND = item("wooden_diamond");

    public static final RegistryObject<Item> WOODEN_BUCKET = item("wooden_bucket", () -> new WoodenBucketItem(() -> Fluids.EMPTY));
    public static final RegistryObject<Item> WATER_WOODEN_BUCKET = item("water_wooden_bucket", () -> new WoodenBucketItem(() -> Fluids.WATER));
    public static final RegistryObject<Item> LAVA_WOODEN_BUCKET = item("lava_wooden_bucket", () -> new WoodenBucketItem(() -> Fluids.LAVA));



    private static WoodTypeObjectMap<Item> woodItems(String nameSuffix) {
        return woodItems(nameSuffix, WoodItem::new);
    }

    private static WoodTypeObjectMap<Item> woodItems(String nameSuffix, Supplier<Item> factory) {
        return woodItems(nameSuffix, type -> factory.get());
    }

    private static WoodTypeObjectMap<Item> woodItems(String nameSuffix, Function<ModWoodType, Item> factory) {
        Map<ModWoodType, RegistryObject<Item>> map = new EnumMap<>(ModWoodType.class);
        for (ModWoodType type : ModWoodType.values()) {
            map.put(
                    type,
                    item(type.getName() + "_" + nameSuffix, () -> factory.apply(type))
            );
        }
        return new WoodTypeObjectMap<>(map);
    }

    private static RegistryObject<Item> item(String name) {
        return item(name, () -> new Item(new Item.Properties().tab(WoodenUtilities.CREATIVE_TAB)));
    }

    private static RegistryObject<Item> item(String name, Supplier<Item> factory) {
        return ITEMS.register(name, factory);
    }

    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static Collection<RegistryObject<Item>> getRegisteredItems() {
        return ITEMS.getEntries();
    }
}

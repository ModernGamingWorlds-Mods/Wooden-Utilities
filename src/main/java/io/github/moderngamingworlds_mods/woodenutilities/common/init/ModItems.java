package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.item.WoodenShearsItem;
import io.github.moderngamingworlds_mods.woodenutilities.common.item.buckets.WoodenBucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;

import java.util.Collection;
import java.util.function.Supplier;

public class ModItems {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WoodenUtilities.MOD_ID);

    public static final RegistryObject<Item> OAK_PLATE = item("oak_plate");
    public static final RegistryObject<Item> BIRCH_PLATE = item("birch_plate");
    public static final RegistryObject<Item> JUNGLE_PLATE = item("jungle_plate");
    public static final RegistryObject<Item> ACACIA_PLATE = item("acacia_plate");
    public static final RegistryObject<Item> DARK_OAK_PLATE = item("dark_oak_plate");
    public static final RegistryObject<Item> SPRUCE_PLATE = item("spruce_plate");
    public static final RegistryObject<Item> CRIMSON_PLATE = item("crimson_plate");
    public static final RegistryObject<Item> WARPED_PLATE = item("warped_plate");

    public static final RegistryObject<Item> WOODEN_SHEARS = item("wooden_shears", WoodenShearsItem::new);
    public static final RegistryObject<Item> WOODEN_DIAMOND = item("wooden_diamond");

    public static final RegistryObject<Item> WOODEN_BUCKET = item("wooden_bucket", () -> new WoodenBucketItem(() -> Fluids.EMPTY));
    public static final RegistryObject<Item> WATER_WOODEN_BUCKET = item("water_wooden_bucket", () -> new WoodenBucketItem(() -> Fluids.WATER));
    public static final RegistryObject<Item> LAVA_WOODEN_BUCKET = item("lava_wooden_bucket", () -> new WoodenBucketItem(() -> Fluids.LAVA));



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

package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenBucketItem;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.BlockItem;
//? if neoforge {
/*import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
*///?} else {
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
//?}

import java.util.List;

public final class ModItems {

    //? if neoforge {
    /*public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WoodenUtilities.MOD_ID);
    *///?} else {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WoodenUtilities.MOD_ID);
    //?}

    //? if neoforge {
    /*public static final DeferredItem<Item> OAK_WOODEN_PLATE = ITEMS.register("oak_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_WOODEN_PLATE = ITEMS.register("spruce_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_WOODEN_PLATE = ITEMS.register("birch_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JUNGLE_WOODEN_PLATE = ITEMS.register("jungle_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ACACIA_WOODEN_PLATE = ITEMS.register("acacia_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DARK_OAK_WOODEN_PLATE = ITEMS.register("dark_oak_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGROVE_WOODEN_PLATE = ITEMS.register("mangrove_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHERRY_WOODEN_PLATE = ITEMS.register("cherry_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BAMBOO_WOODEN_PLATE = ITEMS.register("bamboo_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRIMSON_WOODEN_PLATE = ITEMS.register("crimson_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WARPED_WOODEN_PLATE = ITEMS.register("warped_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_OAK_WOODEN_PLATE = ITEMS.register("twilight_oak_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CANOPY_WOODEN_PLATE = ITEMS.register("canopy_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_MANGROVE_WOODEN_PLATE = ITEMS.register("twilight_mangrove_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DARK_WOODEN_PLATE = ITEMS.register("dark_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIME_WOODEN_PLATE = ITEMS.register("time_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TRANSFORMATION_WOODEN_PLATE = ITEMS.register("transformation_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MINING_WOODEN_PLATE = ITEMS.register("mining_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SORTING_WOODEN_PLATE = ITEMS.register("sorting_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TOWERWOOD_WOODEN_PLATE = ITEMS.register("towerwood_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIR_WOODEN_PLATE = ITEMS.register("fir_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PINE_WOODEN_PLATE = ITEMS.register("pine_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAPLE_WOODEN_PLATE = ITEMS.register("maple_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDWOOD_WOODEN_PLATE = ITEMS.register("redwood_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAHOGANY_WOODEN_PLATE = ITEMS.register("mahogany_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JACARANDA_WOODEN_PLATE = ITEMS.register("jacaranda_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PALM_WOODEN_PLATE = ITEMS.register("palm_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WILLOW_WOODEN_PLATE = ITEMS.register("willow_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEAD_WOODEN_PLATE = ITEMS.register("dead_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGIC_WOODEN_PLATE = ITEMS.register("magic_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UMBRAN_WOODEN_PLATE = ITEMS.register("umbran_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HELLBARK_WOODEN_PLATE = ITEMS.register("hellbark_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EMPYREAL_WOODEN_PLATE = ITEMS.register("empyreal_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROSEROOT_WOODEN_PLATE = ITEMS.register("roseroot_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YAGROOT_WOODEN_PLATE = ITEMS.register("yagroot_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRUDEROOT_WOODEN_PLATE = ITEMS.register("cruderoot_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CONBERRY_WOODEN_PLATE = ITEMS.register("conberry_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SUNROOT_WOODEN_PLATE = ITEMS.register("sunroot_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SKYROOT_WOODEN_PLATE = ITEMS.register("skyroot_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ASPEN_WOODEN_PLATE = ITEMS.register("aspen_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BAOBAB_WOODEN_PLATE = ITEMS.register("baobab_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUE_ENCHANTED_WOODEN_PLATE = ITEMS.register("blue_enchanted_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CIKA_WOODEN_PLATE = ITEMS.register("cika_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CYPRESS_WOODEN_PLATE = ITEMS.register("cypress_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EBONY_WOODEN_PLATE = ITEMS.register("ebony_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BWG_FIR_WOODEN_PLATE = ITEMS.register("bwg_fir_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLORUS_WOODEN_PLATE = ITEMS.register("florus_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREEN_ENCHANTED_WOODEN_PLATE = ITEMS.register("green_enchanted_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HOLLY_WOODEN_PLATE = ITEMS.register("holly_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRONWOOD_WOODEN_PLATE = ITEMS.register("ironwood_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BWG_JACARANDA_WOODEN_PLATE = ITEMS.register("bwg_jacaranda_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAHOGANY_WOODEN_PLATE = ITEMS.register("bwg_mahogany_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAPLE_WOODEN_PLATE = ITEMS.register("bwg_maple_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BWG_PALM_WOODEN_PLATE = ITEMS.register("bwg_palm_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BWG_PINE_WOODEN_PLATE = ITEMS.register("bwg_pine_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAINBOW_EUCALYPTUS_WOODEN_PLATE = ITEMS.register("rainbow_eucalyptus_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BWG_REDWOOD_WOODEN_PLATE = ITEMS.register("bwg_redwood_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAKURA_WOODEN_PLATE = ITEMS.register("sakura_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SKYRIS_WOODEN_PLATE = ITEMS.register("skyris_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPIRIT_WOODEN_PLATE = ITEMS.register("spirit_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITE_MANGROVE_WOODEN_PLATE = ITEMS.register("white_mangrove_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BWG_WILLOW_WOODEN_PLATE = ITEMS.register("bwg_willow_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WITCH_HAZEL_WOODEN_PLATE = ITEMS.register("witch_hazel_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZELKOVA_WOODEN_PLATE = ITEMS.register("zelkova_wooden_plate",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OAK_WOODEN_CAULDRON = ITEMS.register("oak_wooden_cauldron",
        () -> new BlockItem(ModBlocks.OAK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_WOODEN_CAULDRON = ITEMS.register("spruce_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SPRUCE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_WOODEN_CAULDRON = ITEMS.register("birch_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BIRCH_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> JUNGLE_WOODEN_CAULDRON = ITEMS.register("jungle_wooden_cauldron",
        () -> new BlockItem(ModBlocks.JUNGLE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> ACACIA_WOODEN_CAULDRON = ITEMS.register("acacia_wooden_cauldron",
        () -> new BlockItem(ModBlocks.ACACIA_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> DARK_OAK_WOODEN_CAULDRON = ITEMS.register("dark_oak_wooden_cauldron",
        () -> new BlockItem(ModBlocks.DARK_OAK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> MANGROVE_WOODEN_CAULDRON = ITEMS.register("mangrove_wooden_cauldron",
        () -> new BlockItem(ModBlocks.MANGROVE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> CHERRY_WOODEN_CAULDRON = ITEMS.register("cherry_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CHERRY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BAMBOO_WOODEN_CAULDRON = ITEMS.register("bamboo_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BAMBOO_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRIMSON_WOODEN_CAULDRON = ITEMS.register("crimson_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CRIMSON_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> WARPED_WOODEN_CAULDRON = ITEMS.register("warped_wooden_cauldron",
        () -> new BlockItem(ModBlocks.WARPED_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_OAK_WOODEN_CAULDRON = ITEMS.register("twilight_oak_wooden_cauldron",
        () -> new BlockItem(ModBlocks.TWILIGHT_OAK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> CANOPY_WOODEN_CAULDRON = ITEMS.register("canopy_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CANOPY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_MANGROVE_WOODEN_CAULDRON = ITEMS.register("twilight_mangrove_wooden_cauldron",
        () -> new BlockItem(ModBlocks.TWILIGHT_MANGROVE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> DARK_WOODEN_CAULDRON = ITEMS.register("dark_wooden_cauldron",
        () -> new BlockItem(ModBlocks.DARK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> TIME_WOODEN_CAULDRON = ITEMS.register("time_wooden_cauldron",
        () -> new BlockItem(ModBlocks.TIME_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> MINING_WOODEN_CAULDRON = ITEMS.register("mining_wooden_cauldron",
        () -> new BlockItem(ModBlocks.MINING_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> SORTING_WOODEN_CAULDRON = ITEMS.register("sorting_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SORTING_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> TOWERWOOD_WOODEN_CAULDRON = ITEMS.register("towerwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.TOWERWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> FIR_WOODEN_CAULDRON = ITEMS.register("fir_wooden_cauldron",
        () -> new BlockItem(ModBlocks.FIR_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> PINE_WOODEN_CAULDRON = ITEMS.register("pine_wooden_cauldron",
        () -> new BlockItem(ModBlocks.PINE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAPLE_WOODEN_CAULDRON = ITEMS.register("maple_wooden_cauldron",
        () -> new BlockItem(ModBlocks.MAPLE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> REDWOOD_WOODEN_CAULDRON = ITEMS.register("redwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.REDWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAHOGANY_WOODEN_CAULDRON = ITEMS.register("mahogany_wooden_cauldron",
        () -> new BlockItem(ModBlocks.MAHOGANY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> JACARANDA_WOODEN_CAULDRON = ITEMS.register("jacaranda_wooden_cauldron",
        () -> new BlockItem(ModBlocks.JACARANDA_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> PALM_WOODEN_CAULDRON = ITEMS.register("palm_wooden_cauldron",
        () -> new BlockItem(ModBlocks.PALM_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> WILLOW_WOODEN_CAULDRON = ITEMS.register("willow_wooden_cauldron",
        () -> new BlockItem(ModBlocks.WILLOW_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> DEAD_WOODEN_CAULDRON = ITEMS.register("dead_wooden_cauldron",
        () -> new BlockItem(ModBlocks.DEAD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAGIC_WOODEN_CAULDRON = ITEMS.register("magic_wooden_cauldron",
        () -> new BlockItem(ModBlocks.MAGIC_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> UMBRAN_WOODEN_CAULDRON = ITEMS.register("umbran_wooden_cauldron",
        () -> new BlockItem(ModBlocks.UMBRAN_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> HELLBARK_WOODEN_CAULDRON = ITEMS.register("hellbark_wooden_cauldron",
        () -> new BlockItem(ModBlocks.HELLBARK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> EMPYREAL_WOODEN_CAULDRON = ITEMS.register("empyreal_wooden_cauldron",
        () -> new BlockItem(ModBlocks.EMPYREAL_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> ROSEROOT_WOODEN_CAULDRON = ITEMS.register("roseroot_wooden_cauldron",
        () -> new BlockItem(ModBlocks.ROSEROOT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> YAGROOT_WOODEN_CAULDRON = ITEMS.register("yagroot_wooden_cauldron",
        () -> new BlockItem(ModBlocks.YAGROOT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRUDEROOT_WOODEN_CAULDRON = ITEMS.register("cruderoot_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CRUDEROOT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> CONBERRY_WOODEN_CAULDRON = ITEMS.register("conberry_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CONBERRY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> SUNROOT_WOODEN_CAULDRON = ITEMS.register("sunroot_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SUNROOT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> SKYROOT_WOODEN_CAULDRON = ITEMS.register("skyroot_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SKYROOT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> ASPEN_WOODEN_CAULDRON = ITEMS.register("aspen_wooden_cauldron",
        () -> new BlockItem(ModBlocks.ASPEN_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BAOBAB_WOODEN_CAULDRON = ITEMS.register("baobab_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BAOBAB_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLUE_ENCHANTED_WOODEN_CAULDRON = ITEMS.register("blue_enchanted_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BLUE_ENCHANTED_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> CIKA_WOODEN_CAULDRON = ITEMS.register("cika_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CIKA_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> CYPRESS_WOODEN_CAULDRON = ITEMS.register("cypress_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CYPRESS_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> EBONY_WOODEN_CAULDRON = ITEMS.register("ebony_wooden_cauldron",
        () -> new BlockItem(ModBlocks.EBONY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_FIR_WOODEN_CAULDRON = ITEMS.register("bwg_fir_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_FIR_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> FLORUS_WOODEN_CAULDRON = ITEMS.register("florus_wooden_cauldron",
        () -> new BlockItem(ModBlocks.FLORUS_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> GREEN_ENCHANTED_WOODEN_CAULDRON = ITEMS.register("green_enchanted_wooden_cauldron",
        () -> new BlockItem(ModBlocks.GREEN_ENCHANTED_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> HOLLY_WOODEN_CAULDRON = ITEMS.register("holly_wooden_cauldron",
        () -> new BlockItem(ModBlocks.HOLLY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> IRONWOOD_WOODEN_CAULDRON = ITEMS.register("ironwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.IRONWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_JACARANDA_WOODEN_CAULDRON = ITEMS.register("bwg_jacaranda_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_JACARANDA_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAHOGANY_WOODEN_CAULDRON = ITEMS.register("bwg_mahogany_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_MAHOGANY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAPLE_WOODEN_CAULDRON = ITEMS.register("bwg_maple_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_MAPLE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_PALM_WOODEN_CAULDRON = ITEMS.register("bwg_palm_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_PALM_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_PINE_WOODEN_CAULDRON = ITEMS.register("bwg_pine_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_PINE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> RAINBOW_EUCALYPTUS_WOODEN_CAULDRON = ITEMS.register("rainbow_eucalyptus_wooden_cauldron",
        () -> new BlockItem(ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_REDWOOD_WOODEN_CAULDRON = ITEMS.register("bwg_redwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_REDWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> SAKURA_WOODEN_CAULDRON = ITEMS.register("sakura_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SAKURA_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> SKYRIS_WOODEN_CAULDRON = ITEMS.register("skyris_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SKYRIS_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPIRIT_WOODEN_CAULDRON = ITEMS.register("spirit_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SPIRIT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> WHITE_MANGROVE_WOODEN_CAULDRON = ITEMS.register("white_mangrove_wooden_cauldron",
        () -> new BlockItem(ModBlocks.WHITE_MANGROVE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_WILLOW_WOODEN_CAULDRON = ITEMS.register("bwg_willow_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_WILLOW_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> WITCH_HAZEL_WOODEN_CAULDRON = ITEMS.register("witch_hazel_wooden_cauldron",
        () -> new BlockItem(ModBlocks.WITCH_HAZEL_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZELKOVA_WOODEN_CAULDRON = ITEMS.register("zelkova_wooden_cauldron",
        () -> new BlockItem(ModBlocks.ZELKOVA_WOODEN_CAULDRON.get(), new Item.Properties()));

    public static final DeferredItem<Item> WOODEN_BARREL = ITEMS.register("wooden_barrel",
        () -> new BlockItem(ModBlocks.WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> OAK_WOODEN_BARREL = ITEMS.register("oak_wooden_barrel",
        () -> new BlockItem(ModBlocks.OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_WOODEN_BARREL = ITEMS.register("spruce_wooden_barrel",
        () -> new BlockItem(ModBlocks.SPRUCE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_WOODEN_BARREL = ITEMS.register("birch_wooden_barrel",
        () -> new BlockItem(ModBlocks.BIRCH_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> JUNGLE_WOODEN_BARREL = ITEMS.register("jungle_wooden_barrel",
        () -> new BlockItem(ModBlocks.JUNGLE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> ACACIA_WOODEN_BARREL = ITEMS.register("acacia_wooden_barrel",
        () -> new BlockItem(ModBlocks.ACACIA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> DARK_OAK_WOODEN_BARREL = ITEMS.register("dark_oak_wooden_barrel",
        () -> new BlockItem(ModBlocks.DARK_OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> MANGROVE_WOODEN_BARREL = ITEMS.register("mangrove_wooden_barrel",
        () -> new BlockItem(ModBlocks.MANGROVE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CHERRY_WOODEN_BARREL = ITEMS.register("cherry_wooden_barrel",
        () -> new BlockItem(ModBlocks.CHERRY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BAMBOO_WOODEN_BARREL = ITEMS.register("bamboo_wooden_barrel",
        () -> new BlockItem(ModBlocks.BAMBOO_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRIMSON_WOODEN_BARREL = ITEMS.register("crimson_wooden_barrel",
        () -> new BlockItem(ModBlocks.CRIMSON_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> WARPED_WOODEN_BARREL = ITEMS.register("warped_wooden_barrel",
        () -> new BlockItem(ModBlocks.WARPED_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_OAK_WOODEN_BARREL = ITEMS.register("twilight_oak_wooden_barrel",
        () -> new BlockItem(ModBlocks.TWILIGHT_OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CANOPY_WOODEN_BARREL = ITEMS.register("canopy_wooden_barrel",
        () -> new BlockItem(ModBlocks.CANOPY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_MANGROVE_WOODEN_BARREL = ITEMS.register("twilight_mangrove_wooden_barrel",
        () -> new BlockItem(ModBlocks.TWILIGHT_MANGROVE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> DARK_WOODEN_BARREL = ITEMS.register("dark_wooden_barrel",
        () -> new BlockItem(ModBlocks.DARK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> TIME_WOODEN_BARREL = ITEMS.register("time_wooden_barrel",
        () -> new BlockItem(ModBlocks.TIME_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> TRANSFORMATION_WOODEN_BARREL = ITEMS.register("transformation_wooden_barrel",
        () -> new BlockItem(ModBlocks.TRANSFORMATION_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> MINING_WOODEN_BARREL = ITEMS.register("mining_wooden_barrel",
        () -> new BlockItem(ModBlocks.MINING_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SORTING_WOODEN_BARREL = ITEMS.register("sorting_wooden_barrel",
        () -> new BlockItem(ModBlocks.SORTING_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> TOWERWOOD_WOODEN_BARREL = ITEMS.register("towerwood_wooden_barrel",
        () -> new BlockItem(ModBlocks.TOWERWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> FIR_WOODEN_BARREL = ITEMS.register("fir_wooden_barrel",
        () -> new BlockItem(ModBlocks.FIR_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> PINE_WOODEN_BARREL = ITEMS.register("pine_wooden_barrel",
        () -> new BlockItem(ModBlocks.PINE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAPLE_WOODEN_BARREL = ITEMS.register("maple_wooden_barrel",
        () -> new BlockItem(ModBlocks.MAPLE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> REDWOOD_WOODEN_BARREL = ITEMS.register("redwood_wooden_barrel",
        () -> new BlockItem(ModBlocks.REDWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAHOGANY_WOODEN_BARREL = ITEMS.register("mahogany_wooden_barrel",
        () -> new BlockItem(ModBlocks.MAHOGANY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> JACARANDA_WOODEN_BARREL = ITEMS.register("jacaranda_wooden_barrel",
        () -> new BlockItem(ModBlocks.JACARANDA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> PALM_WOODEN_BARREL = ITEMS.register("palm_wooden_barrel",
        () -> new BlockItem(ModBlocks.PALM_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> WILLOW_WOODEN_BARREL = ITEMS.register("willow_wooden_barrel",
        () -> new BlockItem(ModBlocks.WILLOW_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> DEAD_WOODEN_BARREL = ITEMS.register("dead_wooden_barrel",
        () -> new BlockItem(ModBlocks.DEAD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAGIC_WOODEN_BARREL = ITEMS.register("magic_wooden_barrel",
        () -> new BlockItem(ModBlocks.MAGIC_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> UMBRAN_WOODEN_BARREL = ITEMS.register("umbran_wooden_barrel",
        () -> new BlockItem(ModBlocks.UMBRAN_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> HELLBARK_WOODEN_BARREL = ITEMS.register("hellbark_wooden_barrel",
        () -> new BlockItem(ModBlocks.HELLBARK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> EMPYREAL_WOODEN_BARREL = ITEMS.register("empyreal_wooden_barrel",
        () -> new BlockItem(ModBlocks.EMPYREAL_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> ROSEROOT_WOODEN_BARREL = ITEMS.register("roseroot_wooden_barrel",
        () -> new BlockItem(ModBlocks.ROSEROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> YAGROOT_WOODEN_BARREL = ITEMS.register("yagroot_wooden_barrel",
        () -> new BlockItem(ModBlocks.YAGROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRUDEROOT_WOODEN_BARREL = ITEMS.register("cruderoot_wooden_barrel",
        () -> new BlockItem(ModBlocks.CRUDEROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CONBERRY_WOODEN_BARREL = ITEMS.register("conberry_wooden_barrel",
        () -> new BlockItem(ModBlocks.CONBERRY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SUNROOT_WOODEN_BARREL = ITEMS.register("sunroot_wooden_barrel",
        () -> new BlockItem(ModBlocks.SUNROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SKYROOT_WOODEN_BARREL = ITEMS.register("skyroot_wooden_barrel",
        () -> new BlockItem(ModBlocks.SKYROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> ASPEN_WOODEN_BARREL = ITEMS.register("aspen_wooden_barrel",
        () -> new BlockItem(ModBlocks.ASPEN_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BAOBAB_WOODEN_BARREL = ITEMS.register("baobab_wooden_barrel",
        () -> new BlockItem(ModBlocks.BAOBAB_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLUE_ENCHANTED_WOODEN_BARREL = ITEMS.register("blue_enchanted_wooden_barrel",
        () -> new BlockItem(ModBlocks.BLUE_ENCHANTED_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CIKA_WOODEN_BARREL = ITEMS.register("cika_wooden_barrel",
        () -> new BlockItem(ModBlocks.CIKA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CYPRESS_WOODEN_BARREL = ITEMS.register("cypress_wooden_barrel",
        () -> new BlockItem(ModBlocks.CYPRESS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> EBONY_WOODEN_BARREL = ITEMS.register("ebony_wooden_barrel",
        () -> new BlockItem(ModBlocks.EBONY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_FIR_WOODEN_BARREL = ITEMS.register("bwg_fir_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_FIR_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> FLORUS_WOODEN_BARREL = ITEMS.register("florus_wooden_barrel",
        () -> new BlockItem(ModBlocks.FLORUS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> GREEN_ENCHANTED_WOODEN_BARREL = ITEMS.register("green_enchanted_wooden_barrel",
        () -> new BlockItem(ModBlocks.GREEN_ENCHANTED_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> HOLLY_WOODEN_BARREL = ITEMS.register("holly_wooden_barrel",
        () -> new BlockItem(ModBlocks.HOLLY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> IRONWOOD_WOODEN_BARREL = ITEMS.register("ironwood_wooden_barrel",
        () -> new BlockItem(ModBlocks.IRONWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_JACARANDA_WOODEN_BARREL = ITEMS.register("bwg_jacaranda_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_JACARANDA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAHOGANY_WOODEN_BARREL = ITEMS.register("bwg_mahogany_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_MAHOGANY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAPLE_WOODEN_BARREL = ITEMS.register("bwg_maple_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_MAPLE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_PALM_WOODEN_BARREL = ITEMS.register("bwg_palm_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_PALM_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_PINE_WOODEN_BARREL = ITEMS.register("bwg_pine_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_PINE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> RAINBOW_EUCALYPTUS_WOODEN_BARREL = ITEMS.register("rainbow_eucalyptus_wooden_barrel",
        () -> new BlockItem(ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_REDWOOD_WOODEN_BARREL = ITEMS.register("bwg_redwood_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_REDWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SAKURA_WOODEN_BARREL = ITEMS.register("sakura_wooden_barrel",
        () -> new BlockItem(ModBlocks.SAKURA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SKYRIS_WOODEN_BARREL = ITEMS.register("skyris_wooden_barrel",
        () -> new BlockItem(ModBlocks.SKYRIS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPIRIT_WOODEN_BARREL = ITEMS.register("spirit_wooden_barrel",
        () -> new BlockItem(ModBlocks.SPIRIT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> WHITE_MANGROVE_WOODEN_BARREL = ITEMS.register("white_mangrove_wooden_barrel",
        () -> new BlockItem(ModBlocks.WHITE_MANGROVE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_WILLOW_WOODEN_BARREL = ITEMS.register("bwg_willow_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_WILLOW_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> WITCH_HAZEL_WOODEN_BARREL = ITEMS.register("witch_hazel_wooden_barrel",
        () -> new BlockItem(ModBlocks.WITCH_HAZEL_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZELKOVA_WOODEN_BARREL = ITEMS.register("zelkova_wooden_barrel",
        () -> new BlockItem(ModBlocks.ZELKOVA_WOODEN_BARREL.get(), new Item.Properties()));

    public static final DeferredItem<Item> WOODEN_SHEARS = ITEMS.register("wooden_shears",
        () -> new ShearsItem(new Item.Properties().durability(64)));
    public static final DeferredItem<Item> WOODEN_WRENCH = ITEMS.register("wooden_wrench",
        () -> new Item(new Item.Properties().durability(128)));
    public static final DeferredItem<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
        () -> new Item(new Item.Properties().durability(96)));

    public static final DeferredItem<Item> SAWDUST = ITEMS.register("sawdust",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ACACIA_ROD = ITEMS.register("acacia_rod",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BIRCH_ROD = ITEMS.register("birch_rod",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DARK_OAK_ROD = ITEMS.register("dark_oak_rod",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> WOODEN_BUCKET = ITEMS.register("wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> OAK_WOODEN_BUCKET = ITEMS.register("oak_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SPRUCE_WOODEN_BUCKET = ITEMS.register("spruce_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BIRCH_WOODEN_BUCKET = ITEMS.register("birch_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> JUNGLE_WOODEN_BUCKET = ITEMS.register("jungle_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ACACIA_WOODEN_BUCKET = ITEMS.register("acacia_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> DARK_OAK_WOODEN_BUCKET = ITEMS.register("dark_oak_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> MANGROVE_WOODEN_BUCKET = ITEMS.register("mangrove_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CHERRY_WOODEN_BUCKET = ITEMS.register("cherry_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BAMBOO_WOODEN_BUCKET = ITEMS.register("bamboo_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CRIMSON_WOODEN_BUCKET = ITEMS.register("crimson_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> WARPED_WOODEN_BUCKET = ITEMS.register("warped_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> TWILIGHT_OAK_WOODEN_BUCKET = ITEMS.register("twilight_oak_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CANOPY_WOODEN_BUCKET = ITEMS.register("canopy_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> TWILIGHT_MANGROVE_WOODEN_BUCKET = ITEMS.register("twilight_mangrove_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> DARK_WOODEN_BUCKET = ITEMS.register("dark_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> TIME_WOODEN_BUCKET = ITEMS.register("time_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> MINING_WOODEN_BUCKET = ITEMS.register("mining_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SORTING_WOODEN_BUCKET = ITEMS.register("sorting_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> TOWERWOOD_WOODEN_BUCKET = ITEMS.register("towerwood_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> FIR_WOODEN_BUCKET = ITEMS.register("fir_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> PINE_WOODEN_BUCKET = ITEMS.register("pine_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> MAPLE_WOODEN_BUCKET = ITEMS.register("maple_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> REDWOOD_WOODEN_BUCKET = ITEMS.register("redwood_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> MAHOGANY_WOODEN_BUCKET = ITEMS.register("mahogany_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> JACARANDA_WOODEN_BUCKET = ITEMS.register("jacaranda_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> PALM_WOODEN_BUCKET = ITEMS.register("palm_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> WILLOW_WOODEN_BUCKET = ITEMS.register("willow_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> DEAD_WOODEN_BUCKET = ITEMS.register("dead_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> MAGIC_WOODEN_BUCKET = ITEMS.register("magic_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> UMBRAN_WOODEN_BUCKET = ITEMS.register("umbran_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> HELLBARK_WOODEN_BUCKET = ITEMS.register("hellbark_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> EMPYREAL_WOODEN_BUCKET = ITEMS.register("empyreal_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ROSEROOT_WOODEN_BUCKET = ITEMS.register("roseroot_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> YAGROOT_WOODEN_BUCKET = ITEMS.register("yagroot_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CRUDEROOT_WOODEN_BUCKET = ITEMS.register("cruderoot_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CONBERRY_WOODEN_BUCKET = ITEMS.register("conberry_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SUNROOT_WOODEN_BUCKET = ITEMS.register("sunroot_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SKYROOT_WOODEN_BUCKET = ITEMS.register("skyroot_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> WOODEN_ANVIL = ITEMS.register("wooden_anvil",
        () -> new BlockItem(ModBlocks.WOODEN_ANVIL.get(), new Item.Properties()));

    public static final DeferredItem<Item> OAK_WOODEN_HOPPER = ITEMS.register("oak_wooden_hopper",
        () -> new BlockItem(ModBlocks.OAK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_WOODEN_HOPPER = ITEMS.register("spruce_wooden_hopper",
        () -> new BlockItem(ModBlocks.SPRUCE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_WOODEN_HOPPER = ITEMS.register("birch_wooden_hopper",
        () -> new BlockItem(ModBlocks.BIRCH_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> JUNGLE_WOODEN_HOPPER = ITEMS.register("jungle_wooden_hopper",
        () -> new BlockItem(ModBlocks.JUNGLE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> ACACIA_WOODEN_HOPPER = ITEMS.register("acacia_wooden_hopper",
        () -> new BlockItem(ModBlocks.ACACIA_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> DARK_OAK_WOODEN_HOPPER = ITEMS.register("dark_oak_wooden_hopper",
        () -> new BlockItem(ModBlocks.DARK_OAK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> MANGROVE_WOODEN_HOPPER = ITEMS.register("mangrove_wooden_hopper",
        () -> new BlockItem(ModBlocks.MANGROVE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> CHERRY_WOODEN_HOPPER = ITEMS.register("cherry_wooden_hopper",
        () -> new BlockItem(ModBlocks.CHERRY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BAMBOO_WOODEN_HOPPER = ITEMS.register("bamboo_wooden_hopper",
        () -> new BlockItem(ModBlocks.BAMBOO_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRIMSON_WOODEN_HOPPER = ITEMS.register("crimson_wooden_hopper",
        () -> new BlockItem(ModBlocks.CRIMSON_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> WARPED_WOODEN_HOPPER = ITEMS.register("warped_wooden_hopper",
        () -> new BlockItem(ModBlocks.WARPED_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_OAK_WOODEN_HOPPER = ITEMS.register("twilight_oak_wooden_hopper",
        () -> new BlockItem(ModBlocks.TWILIGHT_OAK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> CANOPY_WOODEN_HOPPER = ITEMS.register("canopy_wooden_hopper",
        () -> new BlockItem(ModBlocks.CANOPY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_MANGROVE_WOODEN_HOPPER = ITEMS.register("twilight_mangrove_wooden_hopper",
        () -> new BlockItem(ModBlocks.TWILIGHT_MANGROVE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> DARK_WOODEN_HOPPER = ITEMS.register("dark_wooden_hopper",
        () -> new BlockItem(ModBlocks.DARK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> TIME_WOODEN_HOPPER = ITEMS.register("time_wooden_hopper",
        () -> new BlockItem(ModBlocks.TIME_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> MINING_WOODEN_HOPPER = ITEMS.register("mining_wooden_hopper",
        () -> new BlockItem(ModBlocks.MINING_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> SORTING_WOODEN_HOPPER = ITEMS.register("sorting_wooden_hopper",
        () -> new BlockItem(ModBlocks.SORTING_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> TOWERWOOD_WOODEN_HOPPER = ITEMS.register("towerwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.TOWERWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> FIR_WOODEN_HOPPER = ITEMS.register("fir_wooden_hopper",
        () -> new BlockItem(ModBlocks.FIR_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> PINE_WOODEN_HOPPER = ITEMS.register("pine_wooden_hopper",
        () -> new BlockItem(ModBlocks.PINE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAPLE_WOODEN_HOPPER = ITEMS.register("maple_wooden_hopper",
        () -> new BlockItem(ModBlocks.MAPLE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> REDWOOD_WOODEN_HOPPER = ITEMS.register("redwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.REDWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAHOGANY_WOODEN_HOPPER = ITEMS.register("mahogany_wooden_hopper",
        () -> new BlockItem(ModBlocks.MAHOGANY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> JACARANDA_WOODEN_HOPPER = ITEMS.register("jacaranda_wooden_hopper",
        () -> new BlockItem(ModBlocks.JACARANDA_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> PALM_WOODEN_HOPPER = ITEMS.register("palm_wooden_hopper",
        () -> new BlockItem(ModBlocks.PALM_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> WILLOW_WOODEN_HOPPER = ITEMS.register("willow_wooden_hopper",
        () -> new BlockItem(ModBlocks.WILLOW_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> DEAD_WOODEN_HOPPER = ITEMS.register("dead_wooden_hopper",
        () -> new BlockItem(ModBlocks.DEAD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAGIC_WOODEN_HOPPER = ITEMS.register("magic_wooden_hopper",
        () -> new BlockItem(ModBlocks.MAGIC_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> UMBRAN_WOODEN_HOPPER = ITEMS.register("umbran_wooden_hopper",
        () -> new BlockItem(ModBlocks.UMBRAN_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> HELLBARK_WOODEN_HOPPER = ITEMS.register("hellbark_wooden_hopper",
        () -> new BlockItem(ModBlocks.HELLBARK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> EMPYREAL_WOODEN_HOPPER = ITEMS.register("empyreal_wooden_hopper",
        () -> new BlockItem(ModBlocks.EMPYREAL_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> ROSEROOT_WOODEN_HOPPER = ITEMS.register("roseroot_wooden_hopper",
        () -> new BlockItem(ModBlocks.ROSEROOT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> YAGROOT_WOODEN_HOPPER = ITEMS.register("yagroot_wooden_hopper",
        () -> new BlockItem(ModBlocks.YAGROOT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRUDEROOT_WOODEN_HOPPER = ITEMS.register("cruderoot_wooden_hopper",
        () -> new BlockItem(ModBlocks.CRUDEROOT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> CONBERRY_WOODEN_HOPPER = ITEMS.register("conberry_wooden_hopper",
        () -> new BlockItem(ModBlocks.CONBERRY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> SUNROOT_WOODEN_HOPPER = ITEMS.register("sunroot_wooden_hopper",
        () -> new BlockItem(ModBlocks.SUNROOT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> SKYROOT_WOODEN_HOPPER = ITEMS.register("skyroot_wooden_hopper",
        () -> new BlockItem(ModBlocks.SKYROOT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> ASPEN_WOODEN_HOPPER = ITEMS.register("aspen_wooden_hopper",
        () -> new BlockItem(ModBlocks.ASPEN_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BAOBAB_WOODEN_HOPPER = ITEMS.register("baobab_wooden_hopper",
        () -> new BlockItem(ModBlocks.BAOBAB_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLUE_ENCHANTED_WOODEN_HOPPER = ITEMS.register("blue_enchanted_wooden_hopper",
        () -> new BlockItem(ModBlocks.BLUE_ENCHANTED_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> CIKA_WOODEN_HOPPER = ITEMS.register("cika_wooden_hopper",
        () -> new BlockItem(ModBlocks.CIKA_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> CYPRESS_WOODEN_HOPPER = ITEMS.register("cypress_wooden_hopper",
        () -> new BlockItem(ModBlocks.CYPRESS_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> EBONY_WOODEN_HOPPER = ITEMS.register("ebony_wooden_hopper",
        () -> new BlockItem(ModBlocks.EBONY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_FIR_WOODEN_HOPPER = ITEMS.register("bwg_fir_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_FIR_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> FLORUS_WOODEN_HOPPER = ITEMS.register("florus_wooden_hopper",
        () -> new BlockItem(ModBlocks.FLORUS_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> GREEN_ENCHANTED_WOODEN_HOPPER = ITEMS.register("green_enchanted_wooden_hopper",
        () -> new BlockItem(ModBlocks.GREEN_ENCHANTED_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> HOLLY_WOODEN_HOPPER = ITEMS.register("holly_wooden_hopper",
        () -> new BlockItem(ModBlocks.HOLLY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> IRONWOOD_WOODEN_HOPPER = ITEMS.register("ironwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.IRONWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_JACARANDA_WOODEN_HOPPER = ITEMS.register("bwg_jacaranda_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_JACARANDA_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAHOGANY_WOODEN_HOPPER = ITEMS.register("bwg_mahogany_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_MAHOGANY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAPLE_WOODEN_HOPPER = ITEMS.register("bwg_maple_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_MAPLE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_PALM_WOODEN_HOPPER = ITEMS.register("bwg_palm_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_PALM_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_PINE_WOODEN_HOPPER = ITEMS.register("bwg_pine_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_PINE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> RAINBOW_EUCALYPTUS_WOODEN_HOPPER = ITEMS.register("rainbow_eucalyptus_wooden_hopper",
        () -> new BlockItem(ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_REDWOOD_WOODEN_HOPPER = ITEMS.register("bwg_redwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_REDWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> SAKURA_WOODEN_HOPPER = ITEMS.register("sakura_wooden_hopper",
        () -> new BlockItem(ModBlocks.SAKURA_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> SKYRIS_WOODEN_HOPPER = ITEMS.register("skyris_wooden_hopper",
        () -> new BlockItem(ModBlocks.SKYRIS_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPIRIT_WOODEN_HOPPER = ITEMS.register("spirit_wooden_hopper",
        () -> new BlockItem(ModBlocks.SPIRIT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> WHITE_MANGROVE_WOODEN_HOPPER = ITEMS.register("white_mangrove_wooden_hopper",
        () -> new BlockItem(ModBlocks.WHITE_MANGROVE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_WILLOW_WOODEN_HOPPER = ITEMS.register("bwg_willow_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_WILLOW_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> WITCH_HAZEL_WOODEN_HOPPER = ITEMS.register("witch_hazel_wooden_hopper",
        () -> new BlockItem(ModBlocks.WITCH_HAZEL_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZELKOVA_WOODEN_HOPPER = ITEMS.register("zelkova_wooden_hopper",
        () -> new BlockItem(ModBlocks.ZELKOVA_WOODEN_HOPPER.get(), new Item.Properties()));

    public static final DeferredItem<Item> WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> OAK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("oak_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.OAK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("spruce_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SPRUCE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("birch_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BIRCH_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> JUNGLE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("jungle_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.JUNGLE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> ACACIA_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("acacia_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.ACACIA_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> DARK_OAK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("dark_oak_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.DARK_OAK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("mangrove_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.MANGROVE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> CHERRY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("cherry_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CHERRY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BAMBOO_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bamboo_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BAMBOO_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRIMSON_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("crimson_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CRIMSON_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> WARPED_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("warped_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.WARPED_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_OAK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("twilight_oak_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.TWILIGHT_OAK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> CANOPY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("canopy_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CANOPY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("twilight_mangrove_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.TWILIGHT_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> DARK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("dark_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.DARK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> TIME_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("time_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.TIME_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> TRANSFORMATION_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("transformation_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.TRANSFORMATION_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> MINING_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("mining_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.MINING_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> SORTING_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("sorting_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SORTING_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> TOWERWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("towerwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.TOWERWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> FIR_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("fir_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.FIR_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> PINE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("pine_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.PINE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAPLE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("maple_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.MAPLE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> REDWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("redwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.REDWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("mahogany_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> JACARANDA_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("jacaranda_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.JACARANDA_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> PALM_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("palm_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.PALM_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> WILLOW_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("willow_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.WILLOW_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> DEAD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("dead_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.DEAD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAGIC_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("magic_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.MAGIC_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> UMBRAN_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("umbran_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.UMBRAN_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> HELLBARK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("hellbark_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.HELLBARK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> EMPYREAL_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("empyreal_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.EMPYREAL_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> ROSEROOT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("roseroot_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.ROSEROOT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> YAGROOT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("yagroot_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.YAGROOT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRUDEROOT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("cruderoot_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CRUDEROOT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> CONBERRY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("conberry_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CONBERRY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> SUNROOT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("sunroot_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SUNROOT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> SKYROOT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("skyroot_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SKYROOT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> ASPEN_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("aspen_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.ASPEN_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BAOBAB_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("baobab_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BAOBAB_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLUE_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("blue_enchanted_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BLUE_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> CIKA_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("cika_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CIKA_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> CYPRESS_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("cypress_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CYPRESS_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> EBONY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("ebony_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.EBONY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_FIR_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_fir_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_FIR_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> FLORUS_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("florus_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.FLORUS_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> GREEN_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("green_enchanted_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.GREEN_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> HOLLY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("holly_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.HOLLY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> IRONWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("ironwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.IRONWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_JACARANDA_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_jacaranda_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_JACARANDA_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_mahogany_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAPLE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_maple_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_MAPLE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_PALM_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_palm_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_PALM_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_PINE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_pine_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_PINE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> RAINBOW_EUCALYPTUS_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("rainbow_eucalyptus_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_REDWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_redwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_REDWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> SAKURA_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("sakura_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SAKURA_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> SKYRIS_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("skyris_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SKYRIS_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPIRIT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("spirit_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SPIRIT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> WHITE_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("white_mangrove_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.WHITE_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_WILLOW_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_willow_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_WILLOW_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> WITCH_HAZEL_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("witch_hazel_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.WITCH_HAZEL_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZELKOVA_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("zelkova_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.ZELKOVA_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    *///?} else {
    public static final RegistryObject<Item> OAK_WOODEN_PLATE = ITEMS.register("oak_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WOODEN_PLATE = ITEMS.register("spruce_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WOODEN_PLATE = ITEMS.register("birch_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_WOODEN_PLATE = ITEMS.register("jungle_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_WOODEN_PLATE = ITEMS.register("acacia_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_WOODEN_PLATE = ITEMS.register("dark_oak_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WOODEN_PLATE = ITEMS.register("mangrove_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_WOODEN_PLATE = ITEMS.register("cherry_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WOODEN_PLATE = ITEMS.register("bamboo_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_WOODEN_PLATE = ITEMS.register("crimson_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WARPED_WOODEN_PLATE = ITEMS.register("warped_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_OAK_WOODEN_PLATE = ITEMS.register("twilight_oak_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CANOPY_WOODEN_PLATE = ITEMS.register("canopy_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_MANGROVE_WOODEN_PLATE = ITEMS.register("twilight_mangrove_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_WOODEN_PLATE = ITEMS.register("dark_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIME_WOODEN_PLATE = ITEMS.register("time_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TRANSFORMATION_WOODEN_PLATE = ITEMS.register("transformation_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MINING_WOODEN_PLATE = ITEMS.register("mining_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SORTING_WOODEN_PLATE = ITEMS.register("sorting_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOWERWOOD_WOODEN_PLATE = ITEMS.register("towerwood_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIR_WOODEN_PLATE = ITEMS.register("fir_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINE_WOODEN_PLATE = ITEMS.register("pine_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_WOODEN_PLATE = ITEMS.register("maple_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_WOODEN_PLATE = ITEMS.register("redwood_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_WOODEN_PLATE = ITEMS.register("mahogany_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_WOODEN_PLATE = ITEMS.register("jacaranda_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALM_WOODEN_PLATE = ITEMS.register("palm_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_WOODEN_PLATE = ITEMS.register("willow_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEAD_WOODEN_PLATE = ITEMS.register("dead_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_WOODEN_PLATE = ITEMS.register("magic_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_WOODEN_PLATE = ITEMS.register("umbran_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_WOODEN_PLATE = ITEMS.register("hellbark_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_WOODEN_PLATE = ITEMS.register("empyreal_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSEROOT_WOODEN_PLATE = ITEMS.register("roseroot_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YAGROOT_WOODEN_PLATE = ITEMS.register("yagroot_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUDEROOT_WOODEN_PLATE = ITEMS.register("cruderoot_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONBERRY_WOODEN_PLATE = ITEMS.register("conberry_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUNROOT_WOODEN_PLATE = ITEMS.register("sunroot_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYROOT_WOODEN_PLATE = ITEMS.register("skyroot_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_WOODEN_PLATE = ITEMS.register("aspen_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BAOBAB_WOODEN_PLATE = ITEMS.register("baobab_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ENCHANTED_WOODEN_PLATE = ITEMS.register("blue_enchanted_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CIKA_WOODEN_PLATE = ITEMS.register("cika_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CYPRESS_WOODEN_PLATE = ITEMS.register("cypress_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EBONY_WOODEN_PLATE = ITEMS.register("ebony_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BWG_FIR_WOODEN_PLATE = ITEMS.register("bwg_fir_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLORUS_WOODEN_PLATE = ITEMS.register("florus_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_ENCHANTED_WOODEN_PLATE = ITEMS.register("green_enchanted_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOLLY_WOODEN_PLATE = ITEMS.register("holly_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRONWOOD_WOODEN_PLATE = ITEMS.register("ironwood_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BWG_JACARANDA_WOODEN_PLATE = ITEMS.register("bwg_jacaranda_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAHOGANY_WOODEN_PLATE = ITEMS.register("bwg_mahogany_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAPLE_WOODEN_PLATE = ITEMS.register("bwg_maple_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BWG_PALM_WOODEN_PLATE = ITEMS.register("bwg_palm_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BWG_PINE_WOODEN_PLATE = ITEMS.register("bwg_pine_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAINBOW_EUCALYPTUS_WOODEN_PLATE = ITEMS.register("rainbow_eucalyptus_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BWG_REDWOOD_WOODEN_PLATE = ITEMS.register("bwg_redwood_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAKURA_WOODEN_PLATE = ITEMS.register("sakura_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYRIS_WOODEN_PLATE = ITEMS.register("skyris_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPIRIT_WOODEN_PLATE = ITEMS.register("spirit_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_MANGROVE_WOODEN_PLATE = ITEMS.register("white_mangrove_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BWG_WILLOW_WOODEN_PLATE = ITEMS.register("bwg_willow_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WITCH_HAZEL_WOODEN_PLATE = ITEMS.register("witch_hazel_wooden_plate",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZELKOVA_WOODEN_PLATE = ITEMS.register("zelkova_wooden_plate",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OAK_WOODEN_CAULDRON = ITEMS.register("oak_wooden_cauldron",
        () -> new BlockItem(ModBlocks.OAK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WOODEN_CAULDRON = ITEMS.register("spruce_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SPRUCE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WOODEN_CAULDRON = ITEMS.register("birch_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BIRCH_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_WOODEN_CAULDRON = ITEMS.register("jungle_wooden_cauldron",
        () -> new BlockItem(ModBlocks.JUNGLE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_WOODEN_CAULDRON = ITEMS.register("acacia_wooden_cauldron",
        () -> new BlockItem(ModBlocks.ACACIA_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_WOODEN_CAULDRON = ITEMS.register("dark_oak_wooden_cauldron",
        () -> new BlockItem(ModBlocks.DARK_OAK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WOODEN_CAULDRON = ITEMS.register("mangrove_wooden_cauldron",
        () -> new BlockItem(ModBlocks.MANGROVE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_WOODEN_CAULDRON = ITEMS.register("cherry_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CHERRY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WOODEN_CAULDRON = ITEMS.register("bamboo_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BAMBOO_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_WOODEN_CAULDRON = ITEMS.register("crimson_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CRIMSON_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_WOODEN_CAULDRON = ITEMS.register("warped_wooden_cauldron",
        () -> new BlockItem(ModBlocks.WARPED_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_OAK_WOODEN_CAULDRON = ITEMS.register("twilight_oak_wooden_cauldron",
        () -> new BlockItem(ModBlocks.TWILIGHT_OAK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> CANOPY_WOODEN_CAULDRON = ITEMS.register("canopy_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CANOPY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_MANGROVE_WOODEN_CAULDRON = ITEMS.register("twilight_mangrove_wooden_cauldron",
        () -> new BlockItem(ModBlocks.TWILIGHT_MANGROVE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_WOODEN_CAULDRON = ITEMS.register("dark_wooden_cauldron",
        () -> new BlockItem(ModBlocks.DARK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIME_WOODEN_CAULDRON = ITEMS.register("time_wooden_cauldron",
        () -> new BlockItem(ModBlocks.TIME_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> MINING_WOODEN_CAULDRON = ITEMS.register("mining_wooden_cauldron",
        () -> new BlockItem(ModBlocks.MINING_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> SORTING_WOODEN_CAULDRON = ITEMS.register("sorting_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SORTING_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> TOWERWOOD_WOODEN_CAULDRON = ITEMS.register("towerwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.TOWERWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> FIR_WOODEN_CAULDRON = ITEMS.register("fir_wooden_cauldron",
        () -> new BlockItem(ModBlocks.FIR_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_WOODEN_CAULDRON = ITEMS.register("pine_wooden_cauldron",
        () -> new BlockItem(ModBlocks.PINE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_WOODEN_CAULDRON = ITEMS.register("maple_wooden_cauldron",
        () -> new BlockItem(ModBlocks.MAPLE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_WOODEN_CAULDRON = ITEMS.register("redwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.REDWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_WOODEN_CAULDRON = ITEMS.register("mahogany_wooden_cauldron",
        () -> new BlockItem(ModBlocks.MAHOGANY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_WOODEN_CAULDRON = ITEMS.register("jacaranda_wooden_cauldron",
        () -> new BlockItem(ModBlocks.JACARANDA_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_WOODEN_CAULDRON = ITEMS.register("palm_wooden_cauldron",
        () -> new BlockItem(ModBlocks.PALM_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_WOODEN_CAULDRON = ITEMS.register("willow_wooden_cauldron",
        () -> new BlockItem(ModBlocks.WILLOW_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_WOODEN_CAULDRON = ITEMS.register("dead_wooden_cauldron",
        () -> new BlockItem(ModBlocks.DEAD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_WOODEN_CAULDRON = ITEMS.register("magic_wooden_cauldron",
        () -> new BlockItem(ModBlocks.MAGIC_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_WOODEN_CAULDRON = ITEMS.register("umbran_wooden_cauldron",
        () -> new BlockItem(ModBlocks.UMBRAN_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_WOODEN_CAULDRON = ITEMS.register("hellbark_wooden_cauldron",
        () -> new BlockItem(ModBlocks.HELLBARK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_WOODEN_CAULDRON = ITEMS.register("empyreal_wooden_cauldron",
        () -> new BlockItem(ModBlocks.EMPYREAL_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEROOT_WOODEN_CAULDRON = ITEMS.register("roseroot_wooden_cauldron",
        () -> new BlockItem(ModBlocks.ROSEROOT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> YAGROOT_WOODEN_CAULDRON = ITEMS.register("yagroot_wooden_cauldron",
        () -> new BlockItem(ModBlocks.YAGROOT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRUDEROOT_WOODEN_CAULDRON = ITEMS.register("cruderoot_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CRUDEROOT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONBERRY_WOODEN_CAULDRON = ITEMS.register("conberry_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CONBERRY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> SUNROOT_WOODEN_CAULDRON = ITEMS.register("sunroot_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SUNROOT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYROOT_WOODEN_CAULDRON = ITEMS.register("skyroot_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SKYROOT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_WOODEN_CAULDRON = ITEMS.register("aspen_wooden_cauldron",
        () -> new BlockItem(ModBlocks.ASPEN_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAOBAB_WOODEN_CAULDRON = ITEMS.register("baobab_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BAOBAB_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ENCHANTED_WOODEN_CAULDRON = ITEMS.register("blue_enchanted_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BLUE_ENCHANTED_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> CIKA_WOODEN_CAULDRON = ITEMS.register("cika_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CIKA_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYPRESS_WOODEN_CAULDRON = ITEMS.register("cypress_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CYPRESS_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> EBONY_WOODEN_CAULDRON = ITEMS.register("ebony_wooden_cauldron",
        () -> new BlockItem(ModBlocks.EBONY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_FIR_WOODEN_CAULDRON = ITEMS.register("bwg_fir_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_FIR_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLORUS_WOODEN_CAULDRON = ITEMS.register("florus_wooden_cauldron",
        () -> new BlockItem(ModBlocks.FLORUS_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_ENCHANTED_WOODEN_CAULDRON = ITEMS.register("green_enchanted_wooden_cauldron",
        () -> new BlockItem(ModBlocks.GREEN_ENCHANTED_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> HOLLY_WOODEN_CAULDRON = ITEMS.register("holly_wooden_cauldron",
        () -> new BlockItem(ModBlocks.HOLLY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRONWOOD_WOODEN_CAULDRON = ITEMS.register("ironwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.IRONWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_JACARANDA_WOODEN_CAULDRON = ITEMS.register("bwg_jacaranda_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_JACARANDA_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAHOGANY_WOODEN_CAULDRON = ITEMS.register("bwg_mahogany_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_MAHOGANY_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAPLE_WOODEN_CAULDRON = ITEMS.register("bwg_maple_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_MAPLE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_PALM_WOODEN_CAULDRON = ITEMS.register("bwg_palm_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_PALM_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_PINE_WOODEN_CAULDRON = ITEMS.register("bwg_pine_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_PINE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAINBOW_EUCALYPTUS_WOODEN_CAULDRON = ITEMS.register("rainbow_eucalyptus_wooden_cauldron",
        () -> new BlockItem(ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_REDWOOD_WOODEN_CAULDRON = ITEMS.register("bwg_redwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_REDWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAKURA_WOODEN_CAULDRON = ITEMS.register("sakura_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SAKURA_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYRIS_WOODEN_CAULDRON = ITEMS.register("skyris_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SKYRIS_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_MANGROVE_WOODEN_CAULDRON = ITEMS.register("white_mangrove_wooden_cauldron",
        () -> new BlockItem(ModBlocks.WHITE_MANGROVE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_WILLOW_WOODEN_CAULDRON = ITEMS.register("bwg_willow_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BWG_WILLOW_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> WITCH_HAZEL_WOODEN_CAULDRON = ITEMS.register("witch_hazel_wooden_cauldron",
        () -> new BlockItem(ModBlocks.WITCH_HAZEL_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZELKOVA_WOODEN_CAULDRON = ITEMS.register("zelkova_wooden_cauldron",
        () -> new BlockItem(ModBlocks.ZELKOVA_WOODEN_CAULDRON.get(), new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_BARREL = ITEMS.register("wooden_barrel",
        () -> new BlockItem(ModBlocks.WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WOODEN_BARREL = ITEMS.register("oak_wooden_barrel",
        () -> new BlockItem(ModBlocks.OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WOODEN_BARREL = ITEMS.register("spruce_wooden_barrel",
        () -> new BlockItem(ModBlocks.SPRUCE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WOODEN_BARREL = ITEMS.register("birch_wooden_barrel",
        () -> new BlockItem(ModBlocks.BIRCH_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_WOODEN_BARREL = ITEMS.register("jungle_wooden_barrel",
        () -> new BlockItem(ModBlocks.JUNGLE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_WOODEN_BARREL = ITEMS.register("acacia_wooden_barrel",
        () -> new BlockItem(ModBlocks.ACACIA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_WOODEN_BARREL = ITEMS.register("dark_oak_wooden_barrel",
        () -> new BlockItem(ModBlocks.DARK_OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WOODEN_BARREL = ITEMS.register("mangrove_wooden_barrel",
        () -> new BlockItem(ModBlocks.MANGROVE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_WOODEN_BARREL = ITEMS.register("cherry_wooden_barrel",
        () -> new BlockItem(ModBlocks.CHERRY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WOODEN_BARREL = ITEMS.register("bamboo_wooden_barrel",
        () -> new BlockItem(ModBlocks.BAMBOO_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_WOODEN_BARREL = ITEMS.register("crimson_wooden_barrel",
        () -> new BlockItem(ModBlocks.CRIMSON_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_WOODEN_BARREL = ITEMS.register("warped_wooden_barrel",
        () -> new BlockItem(ModBlocks.WARPED_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_OAK_WOODEN_BARREL = ITEMS.register("twilight_oak_wooden_barrel",
        () -> new BlockItem(ModBlocks.TWILIGHT_OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CANOPY_WOODEN_BARREL = ITEMS.register("canopy_wooden_barrel",
        () -> new BlockItem(ModBlocks.CANOPY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_MANGROVE_WOODEN_BARREL = ITEMS.register("twilight_mangrove_wooden_barrel",
        () -> new BlockItem(ModBlocks.TWILIGHT_MANGROVE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_WOODEN_BARREL = ITEMS.register("dark_wooden_barrel",
        () -> new BlockItem(ModBlocks.DARK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIME_WOODEN_BARREL = ITEMS.register("time_wooden_barrel",
        () -> new BlockItem(ModBlocks.TIME_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TRANSFORMATION_WOODEN_BARREL = ITEMS.register("transformation_wooden_barrel",
        () -> new BlockItem(ModBlocks.TRANSFORMATION_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MINING_WOODEN_BARREL = ITEMS.register("mining_wooden_barrel",
        () -> new BlockItem(ModBlocks.MINING_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SORTING_WOODEN_BARREL = ITEMS.register("sorting_wooden_barrel",
        () -> new BlockItem(ModBlocks.SORTING_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TOWERWOOD_WOODEN_BARREL = ITEMS.register("towerwood_wooden_barrel",
        () -> new BlockItem(ModBlocks.TOWERWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> FIR_WOODEN_BARREL = ITEMS.register("fir_wooden_barrel",
        () -> new BlockItem(ModBlocks.FIR_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_WOODEN_BARREL = ITEMS.register("pine_wooden_barrel",
        () -> new BlockItem(ModBlocks.PINE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_WOODEN_BARREL = ITEMS.register("maple_wooden_barrel",
        () -> new BlockItem(ModBlocks.MAPLE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_WOODEN_BARREL = ITEMS.register("redwood_wooden_barrel",
        () -> new BlockItem(ModBlocks.REDWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_WOODEN_BARREL = ITEMS.register("mahogany_wooden_barrel",
        () -> new BlockItem(ModBlocks.MAHOGANY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_WOODEN_BARREL = ITEMS.register("jacaranda_wooden_barrel",
        () -> new BlockItem(ModBlocks.JACARANDA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_WOODEN_BARREL = ITEMS.register("palm_wooden_barrel",
        () -> new BlockItem(ModBlocks.PALM_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_WOODEN_BARREL = ITEMS.register("willow_wooden_barrel",
        () -> new BlockItem(ModBlocks.WILLOW_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_WOODEN_BARREL = ITEMS.register("dead_wooden_barrel",
        () -> new BlockItem(ModBlocks.DEAD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_WOODEN_BARREL = ITEMS.register("magic_wooden_barrel",
        () -> new BlockItem(ModBlocks.MAGIC_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_WOODEN_BARREL = ITEMS.register("umbran_wooden_barrel",
        () -> new BlockItem(ModBlocks.UMBRAN_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_WOODEN_BARREL = ITEMS.register("hellbark_wooden_barrel",
        () -> new BlockItem(ModBlocks.HELLBARK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_WOODEN_BARREL = ITEMS.register("empyreal_wooden_barrel",
        () -> new BlockItem(ModBlocks.EMPYREAL_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEROOT_WOODEN_BARREL = ITEMS.register("roseroot_wooden_barrel",
        () -> new BlockItem(ModBlocks.ROSEROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> YAGROOT_WOODEN_BARREL = ITEMS.register("yagroot_wooden_barrel",
        () -> new BlockItem(ModBlocks.YAGROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRUDEROOT_WOODEN_BARREL = ITEMS.register("cruderoot_wooden_barrel",
        () -> new BlockItem(ModBlocks.CRUDEROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONBERRY_WOODEN_BARREL = ITEMS.register("conberry_wooden_barrel",
        () -> new BlockItem(ModBlocks.CONBERRY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SUNROOT_WOODEN_BARREL = ITEMS.register("sunroot_wooden_barrel",
        () -> new BlockItem(ModBlocks.SUNROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYROOT_WOODEN_BARREL = ITEMS.register("skyroot_wooden_barrel",
        () -> new BlockItem(ModBlocks.SKYROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_WOODEN_BARREL = ITEMS.register("aspen_wooden_barrel",
        () -> new BlockItem(ModBlocks.ASPEN_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAOBAB_WOODEN_BARREL = ITEMS.register("baobab_wooden_barrel",
        () -> new BlockItem(ModBlocks.BAOBAB_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ENCHANTED_WOODEN_BARREL = ITEMS.register("blue_enchanted_wooden_barrel",
        () -> new BlockItem(ModBlocks.BLUE_ENCHANTED_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CIKA_WOODEN_BARREL = ITEMS.register("cika_wooden_barrel",
        () -> new BlockItem(ModBlocks.CIKA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYPRESS_WOODEN_BARREL = ITEMS.register("cypress_wooden_barrel",
        () -> new BlockItem(ModBlocks.CYPRESS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> EBONY_WOODEN_BARREL = ITEMS.register("ebony_wooden_barrel",
        () -> new BlockItem(ModBlocks.EBONY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_FIR_WOODEN_BARREL = ITEMS.register("bwg_fir_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_FIR_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLORUS_WOODEN_BARREL = ITEMS.register("florus_wooden_barrel",
        () -> new BlockItem(ModBlocks.FLORUS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_ENCHANTED_WOODEN_BARREL = ITEMS.register("green_enchanted_wooden_barrel",
        () -> new BlockItem(ModBlocks.GREEN_ENCHANTED_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> HOLLY_WOODEN_BARREL = ITEMS.register("holly_wooden_barrel",
        () -> new BlockItem(ModBlocks.HOLLY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRONWOOD_WOODEN_BARREL = ITEMS.register("ironwood_wooden_barrel",
        () -> new BlockItem(ModBlocks.IRONWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_JACARANDA_WOODEN_BARREL = ITEMS.register("bwg_jacaranda_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_JACARANDA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAHOGANY_WOODEN_BARREL = ITEMS.register("bwg_mahogany_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_MAHOGANY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAPLE_WOODEN_BARREL = ITEMS.register("bwg_maple_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_MAPLE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_PALM_WOODEN_BARREL = ITEMS.register("bwg_palm_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_PALM_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_PINE_WOODEN_BARREL = ITEMS.register("bwg_pine_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_PINE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAINBOW_EUCALYPTUS_WOODEN_BARREL = ITEMS.register("rainbow_eucalyptus_wooden_barrel",
        () -> new BlockItem(ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_REDWOOD_WOODEN_BARREL = ITEMS.register("bwg_redwood_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_REDWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAKURA_WOODEN_BARREL = ITEMS.register("sakura_wooden_barrel",
        () -> new BlockItem(ModBlocks.SAKURA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYRIS_WOODEN_BARREL = ITEMS.register("skyris_wooden_barrel",
        () -> new BlockItem(ModBlocks.SKYRIS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_MANGROVE_WOODEN_BARREL = ITEMS.register("white_mangrove_wooden_barrel",
        () -> new BlockItem(ModBlocks.WHITE_MANGROVE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_WILLOW_WOODEN_BARREL = ITEMS.register("bwg_willow_wooden_barrel",
        () -> new BlockItem(ModBlocks.BWG_WILLOW_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WITCH_HAZEL_WOODEN_BARREL = ITEMS.register("witch_hazel_wooden_barrel",
        () -> new BlockItem(ModBlocks.WITCH_HAZEL_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZELKOVA_WOODEN_BARREL = ITEMS.register("zelkova_wooden_barrel",
        () -> new BlockItem(ModBlocks.ZELKOVA_WOODEN_BARREL.get(), new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_SHEARS = ITEMS.register("wooden_shears",
        () -> new ShearsItem(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> WOODEN_WRENCH = ITEMS.register("wooden_wrench",
        () -> new Item(new Item.Properties().durability(128)));
    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
        () -> new Item(new Item.Properties().durability(96)));

    public static final RegistryObject<Item> SAWDUST = ITEMS.register("sawdust",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ACACIA_ROD = ITEMS.register("acacia_rod",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BIRCH_ROD = ITEMS.register("birch_rod",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DARK_OAK_ROD = ITEMS.register("dark_oak_rod",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_BUCKET = ITEMS.register("wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OAK_WOODEN_BUCKET = ITEMS.register("oak_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SPRUCE_WOODEN_BUCKET = ITEMS.register("spruce_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BIRCH_WOODEN_BUCKET = ITEMS.register("birch_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JUNGLE_WOODEN_BUCKET = ITEMS.register("jungle_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ACACIA_WOODEN_BUCKET = ITEMS.register("acacia_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DARK_OAK_WOODEN_BUCKET = ITEMS.register("dark_oak_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MANGROVE_WOODEN_BUCKET = ITEMS.register("mangrove_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHERRY_WOODEN_BUCKET = ITEMS.register("cherry_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BAMBOO_WOODEN_BUCKET = ITEMS.register("bamboo_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CRIMSON_WOODEN_BUCKET = ITEMS.register("crimson_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WARPED_WOODEN_BUCKET = ITEMS.register("warped_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TWILIGHT_OAK_WOODEN_BUCKET = ITEMS.register("twilight_oak_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CANOPY_WOODEN_BUCKET = ITEMS.register("canopy_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TWILIGHT_MANGROVE_WOODEN_BUCKET = ITEMS.register("twilight_mangrove_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DARK_WOODEN_BUCKET = ITEMS.register("dark_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TIME_WOODEN_BUCKET = ITEMS.register("time_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MINING_WOODEN_BUCKET = ITEMS.register("mining_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SORTING_WOODEN_BUCKET = ITEMS.register("sorting_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TOWERWOOD_WOODEN_BUCKET = ITEMS.register("towerwood_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FIR_WOODEN_BUCKET = ITEMS.register("fir_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PINE_WOODEN_BUCKET = ITEMS.register("pine_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAPLE_WOODEN_BUCKET = ITEMS.register("maple_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> REDWOOD_WOODEN_BUCKET = ITEMS.register("redwood_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAHOGANY_WOODEN_BUCKET = ITEMS.register("mahogany_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> JACARANDA_WOODEN_BUCKET = ITEMS.register("jacaranda_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PALM_WOODEN_BUCKET = ITEMS.register("palm_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WILLOW_WOODEN_BUCKET = ITEMS.register("willow_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DEAD_WOODEN_BUCKET = ITEMS.register("dead_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAGIC_WOODEN_BUCKET = ITEMS.register("magic_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> UMBRAN_WOODEN_BUCKET = ITEMS.register("umbran_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HELLBARK_WOODEN_BUCKET = ITEMS.register("hellbark_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> EMPYREAL_WOODEN_BUCKET = ITEMS.register("empyreal_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ROSEROOT_WOODEN_BUCKET = ITEMS.register("roseroot_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> YAGROOT_WOODEN_BUCKET = ITEMS.register("yagroot_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CRUDEROOT_WOODEN_BUCKET = ITEMS.register("cruderoot_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CONBERRY_WOODEN_BUCKET = ITEMS.register("conberry_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SUNROOT_WOODEN_BUCKET = ITEMS.register("sunroot_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SKYROOT_WOODEN_BUCKET = ITEMS.register("skyroot_wooden_bucket",
        () -> new WoodenBucketItem(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> WOODEN_ANVIL = ITEMS.register("wooden_anvil",
        () -> new BlockItem(ModBlocks.WOODEN_ANVIL.get(), new Item.Properties()));

    public static final RegistryObject<Item> OAK_WOODEN_HOPPER = ITEMS.register("oak_wooden_hopper",
        () -> new BlockItem(ModBlocks.OAK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WOODEN_HOPPER = ITEMS.register("spruce_wooden_hopper",
        () -> new BlockItem(ModBlocks.SPRUCE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WOODEN_HOPPER = ITEMS.register("birch_wooden_hopper",
        () -> new BlockItem(ModBlocks.BIRCH_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_WOODEN_HOPPER = ITEMS.register("jungle_wooden_hopper",
        () -> new BlockItem(ModBlocks.JUNGLE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_WOODEN_HOPPER = ITEMS.register("acacia_wooden_hopper",
        () -> new BlockItem(ModBlocks.ACACIA_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_WOODEN_HOPPER = ITEMS.register("dark_oak_wooden_hopper",
        () -> new BlockItem(ModBlocks.DARK_OAK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WOODEN_HOPPER = ITEMS.register("mangrove_wooden_hopper",
        () -> new BlockItem(ModBlocks.MANGROVE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_WOODEN_HOPPER = ITEMS.register("cherry_wooden_hopper",
        () -> new BlockItem(ModBlocks.CHERRY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WOODEN_HOPPER = ITEMS.register("bamboo_wooden_hopper",
        () -> new BlockItem(ModBlocks.BAMBOO_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_WOODEN_HOPPER = ITEMS.register("crimson_wooden_hopper",
        () -> new BlockItem(ModBlocks.CRIMSON_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_WOODEN_HOPPER = ITEMS.register("warped_wooden_hopper",
        () -> new BlockItem(ModBlocks.WARPED_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_OAK_WOODEN_HOPPER = ITEMS.register("twilight_oak_wooden_hopper",
        () -> new BlockItem(ModBlocks.TWILIGHT_OAK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CANOPY_WOODEN_HOPPER = ITEMS.register("canopy_wooden_hopper",
        () -> new BlockItem(ModBlocks.CANOPY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_MANGROVE_WOODEN_HOPPER = ITEMS.register("twilight_mangrove_wooden_hopper",
        () -> new BlockItem(ModBlocks.TWILIGHT_MANGROVE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_WOODEN_HOPPER = ITEMS.register("dark_wooden_hopper",
        () -> new BlockItem(ModBlocks.DARK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIME_WOODEN_HOPPER = ITEMS.register("time_wooden_hopper",
        () -> new BlockItem(ModBlocks.TIME_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MINING_WOODEN_HOPPER = ITEMS.register("mining_wooden_hopper",
        () -> new BlockItem(ModBlocks.MINING_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SORTING_WOODEN_HOPPER = ITEMS.register("sorting_wooden_hopper",
        () -> new BlockItem(ModBlocks.SORTING_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> TOWERWOOD_WOODEN_HOPPER = ITEMS.register("towerwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.TOWERWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> FIR_WOODEN_HOPPER = ITEMS.register("fir_wooden_hopper",
        () -> new BlockItem(ModBlocks.FIR_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_WOODEN_HOPPER = ITEMS.register("pine_wooden_hopper",
        () -> new BlockItem(ModBlocks.PINE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_WOODEN_HOPPER = ITEMS.register("maple_wooden_hopper",
        () -> new BlockItem(ModBlocks.MAPLE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_WOODEN_HOPPER = ITEMS.register("redwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.REDWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_WOODEN_HOPPER = ITEMS.register("mahogany_wooden_hopper",
        () -> new BlockItem(ModBlocks.MAHOGANY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_WOODEN_HOPPER = ITEMS.register("jacaranda_wooden_hopper",
        () -> new BlockItem(ModBlocks.JACARANDA_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_WOODEN_HOPPER = ITEMS.register("palm_wooden_hopper",
        () -> new BlockItem(ModBlocks.PALM_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_WOODEN_HOPPER = ITEMS.register("willow_wooden_hopper",
        () -> new BlockItem(ModBlocks.WILLOW_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_WOODEN_HOPPER = ITEMS.register("dead_wooden_hopper",
        () -> new BlockItem(ModBlocks.DEAD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_WOODEN_HOPPER = ITEMS.register("magic_wooden_hopper",
        () -> new BlockItem(ModBlocks.MAGIC_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_WOODEN_HOPPER = ITEMS.register("umbran_wooden_hopper",
        () -> new BlockItem(ModBlocks.UMBRAN_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_WOODEN_HOPPER = ITEMS.register("hellbark_wooden_hopper",
        () -> new BlockItem(ModBlocks.HELLBARK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_WOODEN_HOPPER = ITEMS.register("empyreal_wooden_hopper",
        () -> new BlockItem(ModBlocks.EMPYREAL_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEROOT_WOODEN_HOPPER = ITEMS.register("roseroot_wooden_hopper",
        () -> new BlockItem(ModBlocks.ROSEROOT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> YAGROOT_WOODEN_HOPPER = ITEMS.register("yagroot_wooden_hopper",
        () -> new BlockItem(ModBlocks.YAGROOT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRUDEROOT_WOODEN_HOPPER = ITEMS.register("cruderoot_wooden_hopper",
        () -> new BlockItem(ModBlocks.CRUDEROOT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONBERRY_WOODEN_HOPPER = ITEMS.register("conberry_wooden_hopper",
        () -> new BlockItem(ModBlocks.CONBERRY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SUNROOT_WOODEN_HOPPER = ITEMS.register("sunroot_wooden_hopper",
        () -> new BlockItem(ModBlocks.SUNROOT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYROOT_WOODEN_HOPPER = ITEMS.register("skyroot_wooden_hopper",
        () -> new BlockItem(ModBlocks.SKYROOT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_WOODEN_HOPPER = ITEMS.register("aspen_wooden_hopper",
        () -> new BlockItem(ModBlocks.ASPEN_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAOBAB_WOODEN_HOPPER = ITEMS.register("baobab_wooden_hopper",
        () -> new BlockItem(ModBlocks.BAOBAB_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ENCHANTED_WOODEN_HOPPER = ITEMS.register("blue_enchanted_wooden_hopper",
        () -> new BlockItem(ModBlocks.BLUE_ENCHANTED_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CIKA_WOODEN_HOPPER = ITEMS.register("cika_wooden_hopper",
        () -> new BlockItem(ModBlocks.CIKA_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYPRESS_WOODEN_HOPPER = ITEMS.register("cypress_wooden_hopper",
        () -> new BlockItem(ModBlocks.CYPRESS_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> EBONY_WOODEN_HOPPER = ITEMS.register("ebony_wooden_hopper",
        () -> new BlockItem(ModBlocks.EBONY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_FIR_WOODEN_HOPPER = ITEMS.register("bwg_fir_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_FIR_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLORUS_WOODEN_HOPPER = ITEMS.register("florus_wooden_hopper",
        () -> new BlockItem(ModBlocks.FLORUS_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_ENCHANTED_WOODEN_HOPPER = ITEMS.register("green_enchanted_wooden_hopper",
        () -> new BlockItem(ModBlocks.GREEN_ENCHANTED_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> HOLLY_WOODEN_HOPPER = ITEMS.register("holly_wooden_hopper",
        () -> new BlockItem(ModBlocks.HOLLY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRONWOOD_WOODEN_HOPPER = ITEMS.register("ironwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.IRONWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_JACARANDA_WOODEN_HOPPER = ITEMS.register("bwg_jacaranda_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_JACARANDA_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAHOGANY_WOODEN_HOPPER = ITEMS.register("bwg_mahogany_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_MAHOGANY_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAPLE_WOODEN_HOPPER = ITEMS.register("bwg_maple_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_MAPLE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_PALM_WOODEN_HOPPER = ITEMS.register("bwg_palm_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_PALM_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_PINE_WOODEN_HOPPER = ITEMS.register("bwg_pine_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_PINE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAINBOW_EUCALYPTUS_WOODEN_HOPPER = ITEMS.register("rainbow_eucalyptus_wooden_hopper",
        () -> new BlockItem(ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_REDWOOD_WOODEN_HOPPER = ITEMS.register("bwg_redwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_REDWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAKURA_WOODEN_HOPPER = ITEMS.register("sakura_wooden_hopper",
        () -> new BlockItem(ModBlocks.SAKURA_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYRIS_WOODEN_HOPPER = ITEMS.register("skyris_wooden_hopper",
        () -> new BlockItem(ModBlocks.SKYRIS_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_MANGROVE_WOODEN_HOPPER = ITEMS.register("white_mangrove_wooden_hopper",
        () -> new BlockItem(ModBlocks.WHITE_MANGROVE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_WILLOW_WOODEN_HOPPER = ITEMS.register("bwg_willow_wooden_hopper",
        () -> new BlockItem(ModBlocks.BWG_WILLOW_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WITCH_HAZEL_WOODEN_HOPPER = ITEMS.register("witch_hazel_wooden_hopper",
        () -> new BlockItem(ModBlocks.WITCH_HAZEL_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZELKOVA_WOODEN_HOPPER = ITEMS.register("zelkova_wooden_hopper",
        () -> new BlockItem(ModBlocks.ZELKOVA_WOODEN_HOPPER.get(), new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("oak_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.OAK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("spruce_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SPRUCE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("birch_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BIRCH_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("jungle_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.JUNGLE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("acacia_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.ACACIA_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("dark_oak_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.DARK_OAK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("mangrove_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.MANGROVE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("cherry_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CHERRY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bamboo_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BAMBOO_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("crimson_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CRIMSON_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("warped_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.WARPED_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_OAK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("twilight_oak_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.TWILIGHT_OAK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CANOPY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("canopy_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CANOPY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("twilight_mangrove_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.TWILIGHT_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("dark_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.DARK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIME_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("time_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.TIME_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> TRANSFORMATION_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("transformation_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.TRANSFORMATION_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MINING_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("mining_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.MINING_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SORTING_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("sorting_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SORTING_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> TOWERWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("towerwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.TOWERWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> FIR_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("fir_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.FIR_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("pine_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.PINE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("maple_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.MAPLE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("redwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.REDWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("mahogany_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("jacaranda_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.JACARANDA_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("palm_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.PALM_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("willow_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.WILLOW_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("dead_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.DEAD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("magic_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.MAGIC_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("umbran_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.UMBRAN_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("hellbark_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.HELLBARK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("empyreal_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.EMPYREAL_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEROOT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("roseroot_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.ROSEROOT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> YAGROOT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("yagroot_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.YAGROOT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRUDEROOT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("cruderoot_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CRUDEROOT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONBERRY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("conberry_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CONBERRY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SUNROOT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("sunroot_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SUNROOT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYROOT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("skyroot_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SKYROOT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("aspen_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.ASPEN_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAOBAB_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("baobab_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BAOBAB_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("blue_enchanted_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BLUE_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CIKA_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("cika_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CIKA_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYPRESS_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("cypress_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CYPRESS_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> EBONY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("ebony_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.EBONY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_FIR_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_fir_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_FIR_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLORUS_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("florus_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.FLORUS_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("green_enchanted_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.GREEN_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> HOLLY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("holly_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.HOLLY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRONWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("ironwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.IRONWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_JACARANDA_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_jacaranda_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_JACARANDA_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_mahogany_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAPLE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_maple_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_MAPLE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_PALM_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_palm_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_PALM_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_PINE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_pine_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_PINE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAINBOW_EUCALYPTUS_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("rainbow_eucalyptus_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_REDWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_redwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_REDWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAKURA_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("sakura_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SAKURA_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYRIS_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("skyris_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SKYRIS_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("white_mangrove_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.WHITE_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_WILLOW_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bwg_willow_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BWG_WILLOW_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WITCH_HAZEL_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("witch_hazel_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.WITCH_HAZEL_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZELKOVA_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("zelkova_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.ZELKOVA_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));

    //?}

    //? if neoforge {
    /*public static final List<DeferredItem<Item>> ALL_WOODEN_BUCKETS = List.of(
        WOODEN_BUCKET, OAK_WOODEN_BUCKET, SPRUCE_WOODEN_BUCKET, BIRCH_WOODEN_BUCKET,
        JUNGLE_WOODEN_BUCKET, ACACIA_WOODEN_BUCKET, DARK_OAK_WOODEN_BUCKET,
        MANGROVE_WOODEN_BUCKET, CHERRY_WOODEN_BUCKET, BAMBOO_WOODEN_BUCKET,
        CRIMSON_WOODEN_BUCKET, WARPED_WOODEN_BUCKET, TWILIGHT_OAK_WOODEN_BUCKET,
        CANOPY_WOODEN_BUCKET, TWILIGHT_MANGROVE_WOODEN_BUCKET, DARK_WOODEN_BUCKET,
        TIME_WOODEN_BUCKET, MINING_WOODEN_BUCKET, SORTING_WOODEN_BUCKET,
        TOWERWOOD_WOODEN_BUCKET, FIR_WOODEN_BUCKET, PINE_WOODEN_BUCKET,
        MAPLE_WOODEN_BUCKET, REDWOOD_WOODEN_BUCKET, MAHOGANY_WOODEN_BUCKET,
        JACARANDA_WOODEN_BUCKET, PALM_WOODEN_BUCKET, WILLOW_WOODEN_BUCKET,
        DEAD_WOODEN_BUCKET, MAGIC_WOODEN_BUCKET, UMBRAN_WOODEN_BUCKET,
        HELLBARK_WOODEN_BUCKET, EMPYREAL_WOODEN_BUCKET, ROSEROOT_WOODEN_BUCKET,
        YAGROOT_WOODEN_BUCKET, CRUDEROOT_WOODEN_BUCKET, CONBERRY_WOODEN_BUCKET,
        SUNROOT_WOODEN_BUCKET, SKYROOT_WOODEN_BUCKET
    );
    *///?}

    private ModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

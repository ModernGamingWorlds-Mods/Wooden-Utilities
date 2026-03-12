package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenBarrelBlockItem;
import com.moderngamingworld.woodenutilities.WoodenChestBlockItem;
import com.moderngamingworld.woodenutilities.WoodenBucketItem;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.SignItem;
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
        () -> new WoodenBarrelBlockItem(ModBlocks.WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> OAK_WOODEN_BARREL = ITEMS.register("oak_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_WOODEN_BARREL = ITEMS.register("spruce_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SPRUCE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_WOODEN_BARREL = ITEMS.register("birch_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BIRCH_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> JUNGLE_WOODEN_BARREL = ITEMS.register("jungle_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.JUNGLE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> ACACIA_WOODEN_BARREL = ITEMS.register("acacia_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.ACACIA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> DARK_OAK_WOODEN_BARREL = ITEMS.register("dark_oak_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.DARK_OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> MANGROVE_WOODEN_BARREL = ITEMS.register("mangrove_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.MANGROVE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CHERRY_WOODEN_BARREL = ITEMS.register("cherry_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CHERRY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BAMBOO_WOODEN_BARREL = ITEMS.register("bamboo_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BAMBOO_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRIMSON_WOODEN_BARREL = ITEMS.register("crimson_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CRIMSON_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> WARPED_WOODEN_BARREL = ITEMS.register("warped_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.WARPED_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_OAK_WOODEN_BARREL = ITEMS.register("twilight_oak_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.TWILIGHT_OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CANOPY_WOODEN_BARREL = ITEMS.register("canopy_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CANOPY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_MANGROVE_WOODEN_BARREL = ITEMS.register("twilight_mangrove_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.TWILIGHT_MANGROVE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> DARK_WOODEN_BARREL = ITEMS.register("dark_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.DARK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> TIME_WOODEN_BARREL = ITEMS.register("time_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.TIME_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> TRANSFORMATION_WOODEN_BARREL = ITEMS.register("transformation_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.TRANSFORMATION_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> MINING_WOODEN_BARREL = ITEMS.register("mining_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.MINING_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SORTING_WOODEN_BARREL = ITEMS.register("sorting_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SORTING_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> TOWERWOOD_WOODEN_BARREL = ITEMS.register("towerwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.TOWERWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> FIR_WOODEN_BARREL = ITEMS.register("fir_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.FIR_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> PINE_WOODEN_BARREL = ITEMS.register("pine_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.PINE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAPLE_WOODEN_BARREL = ITEMS.register("maple_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.MAPLE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> REDWOOD_WOODEN_BARREL = ITEMS.register("redwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.REDWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAHOGANY_WOODEN_BARREL = ITEMS.register("mahogany_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.MAHOGANY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> JACARANDA_WOODEN_BARREL = ITEMS.register("jacaranda_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.JACARANDA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> PALM_WOODEN_BARREL = ITEMS.register("palm_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.PALM_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> WILLOW_WOODEN_BARREL = ITEMS.register("willow_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.WILLOW_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> DEAD_WOODEN_BARREL = ITEMS.register("dead_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.DEAD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAGIC_WOODEN_BARREL = ITEMS.register("magic_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.MAGIC_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> UMBRAN_WOODEN_BARREL = ITEMS.register("umbran_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.UMBRAN_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> HELLBARK_WOODEN_BARREL = ITEMS.register("hellbark_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.HELLBARK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> EMPYREAL_WOODEN_BARREL = ITEMS.register("empyreal_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.EMPYREAL_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> ROSEROOT_WOODEN_BARREL = ITEMS.register("roseroot_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.ROSEROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> YAGROOT_WOODEN_BARREL = ITEMS.register("yagroot_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.YAGROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRUDEROOT_WOODEN_BARREL = ITEMS.register("cruderoot_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CRUDEROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CONBERRY_WOODEN_BARREL = ITEMS.register("conberry_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CONBERRY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SUNROOT_WOODEN_BARREL = ITEMS.register("sunroot_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SUNROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SKYROOT_WOODEN_BARREL = ITEMS.register("skyroot_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SKYROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> ASPEN_WOODEN_BARREL = ITEMS.register("aspen_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.ASPEN_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BAOBAB_WOODEN_BARREL = ITEMS.register("baobab_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BAOBAB_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLUE_ENCHANTED_WOODEN_BARREL = ITEMS.register("blue_enchanted_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BLUE_ENCHANTED_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CIKA_WOODEN_BARREL = ITEMS.register("cika_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CIKA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CYPRESS_WOODEN_BARREL = ITEMS.register("cypress_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CYPRESS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> EBONY_WOODEN_BARREL = ITEMS.register("ebony_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.EBONY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_FIR_WOODEN_BARREL = ITEMS.register("bwg_fir_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_FIR_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> FLORUS_WOODEN_BARREL = ITEMS.register("florus_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.FLORUS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> GREEN_ENCHANTED_WOODEN_BARREL = ITEMS.register("green_enchanted_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.GREEN_ENCHANTED_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> HOLLY_WOODEN_BARREL = ITEMS.register("holly_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.HOLLY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> IRONWOOD_WOODEN_BARREL = ITEMS.register("ironwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.IRONWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_JACARANDA_WOODEN_BARREL = ITEMS.register("bwg_jacaranda_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_JACARANDA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAHOGANY_WOODEN_BARREL = ITEMS.register("bwg_mahogany_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_MAHOGANY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAPLE_WOODEN_BARREL = ITEMS.register("bwg_maple_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_MAPLE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_PALM_WOODEN_BARREL = ITEMS.register("bwg_palm_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_PALM_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_PINE_WOODEN_BARREL = ITEMS.register("bwg_pine_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_PINE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> RAINBOW_EUCALYPTUS_WOODEN_BARREL = ITEMS.register("rainbow_eucalyptus_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_REDWOOD_WOODEN_BARREL = ITEMS.register("bwg_redwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_REDWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SAKURA_WOODEN_BARREL = ITEMS.register("sakura_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SAKURA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SKYRIS_WOODEN_BARREL = ITEMS.register("skyris_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SKYRIS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPIRIT_WOODEN_BARREL = ITEMS.register("spirit_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SPIRIT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> WHITE_MANGROVE_WOODEN_BARREL = ITEMS.register("white_mangrove_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.WHITE_MANGROVE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_WILLOW_WOODEN_BARREL = ITEMS.register("bwg_willow_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_WILLOW_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> WITCH_HAZEL_WOODEN_BARREL = ITEMS.register("witch_hazel_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.WITCH_HAZEL_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZELKOVA_WOODEN_BARREL = ITEMS.register("zelkova_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.ZELKOVA_WOODEN_BARREL.get(), new Item.Properties()));

    public static final DeferredItem<Item> WOODEN_SHEARS = ITEMS.register("wooden_shears",
        () -> new ShearsItem(new Item.Properties().durability(64)));
    public static final DeferredItem<Item> WOODEN_WRENCH = ITEMS.register("wooden_wrench",
        () -> new Item(new Item.Properties().durability(128)));
    public static final DeferredItem<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
        () -> new Item(new Item.Properties().durability(96)));

    public static final DeferredItem<Item> SAWDUST = ITEMS.register("sawdust",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> OAK_ROD = ITEMS.register("oak_rod",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ACACIA_ROD = ITEMS.register("acacia_rod",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> BIRCH_ROD = ITEMS.register("birch_rod",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> DARK_OAK_ROD = ITEMS.register("dark_oak_rod",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> JUNGLE_ROD = ITEMS.register("jungle_rod",
        () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SPRUCE_ROD = ITEMS.register("spruce_rod",
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

    // ── African Blackwood ──────────────────────────────────
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_LOG = ITEMS.register("african_blackwood_log",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_AFRICAN_BLACKWOOD_LOG = ITEMS.register("stripped_african_blackwood_log",
        () -> new BlockItem(ModBlocks.STRIPPED_AFRICAN_BLACKWOOD_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_WOOD = ITEMS.register("african_blackwood_wood",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_AFRICAN_BLACKWOOD_WOOD = ITEMS.register("stripped_african_blackwood_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_AFRICAN_BLACKWOOD_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_PLANKS = ITEMS.register("african_blackwood_planks",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_LEAVES = ITEMS.register("african_blackwood_leaves",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_SAPLING = ITEMS.register("african_blackwood_sapling",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_SLAB = ITEMS.register("african_blackwood_slab",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_STAIRS = ITEMS.register("african_blackwood_stairs",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_FENCE = ITEMS.register("african_blackwood_fence",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_FENCE_GATE = ITEMS.register("african_blackwood_fence_gate",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_PRESSURE_PLATE = ITEMS.register("african_blackwood_pressure_plate",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_BUTTON = ITEMS.register("african_blackwood_button",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_DOOR = ITEMS.register("african_blackwood_door",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_TRAPDOOR = ITEMS.register("african_blackwood_trapdoor",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_SIGN = ITEMS.register("african_blackwood_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.AFRICAN_BLACKWOOD_SIGN.get(), ModBlocks.AFRICAN_BLACKWOOD_WALL_SIGN.get()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_HANGING_SIGN = ITEMS.register("african_blackwood_hanging_sign",
        () -> new HangingSignItem(ModBlocks.AFRICAN_BLACKWOOD_HANGING_SIGN.get(), ModBlocks.AFRICAN_BLACKWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE = ITEMS.register("african_blackwood_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("african_blackwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_WOODEN_CAULDRON = ITEMS.register("african_blackwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_WOODEN_HOPPER = ITEMS.register("african_blackwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_WOODEN_BARREL = ITEMS.register("african_blackwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_BOAT = ITEMS.register("african_blackwood_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_CHEST_BOAT = ITEMS.register("african_blackwood_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_WOODEN_PLATE = ITEMS.register("african_blackwood_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Banyan ──────────────────────────────────
    public static final DeferredItem<Item> BANYAN_LOG = ITEMS.register("banyan_log",
        () -> new BlockItem(ModBlocks.BANYAN_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_BANYAN_LOG = ITEMS.register("stripped_banyan_log",
        () -> new BlockItem(ModBlocks.STRIPPED_BANYAN_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_WOOD = ITEMS.register("banyan_wood",
        () -> new BlockItem(ModBlocks.BANYAN_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_BANYAN_WOOD = ITEMS.register("stripped_banyan_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_BANYAN_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_PLANKS = ITEMS.register("banyan_planks",
        () -> new BlockItem(ModBlocks.BANYAN_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_LEAVES = ITEMS.register("banyan_leaves",
        () -> new BlockItem(ModBlocks.BANYAN_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_SAPLING = ITEMS.register("banyan_sapling",
        () -> new BlockItem(ModBlocks.BANYAN_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_SLAB = ITEMS.register("banyan_slab",
        () -> new BlockItem(ModBlocks.BANYAN_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_STAIRS = ITEMS.register("banyan_stairs",
        () -> new BlockItem(ModBlocks.BANYAN_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_FENCE = ITEMS.register("banyan_fence",
        () -> new BlockItem(ModBlocks.BANYAN_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_FENCE_GATE = ITEMS.register("banyan_fence_gate",
        () -> new BlockItem(ModBlocks.BANYAN_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_PRESSURE_PLATE = ITEMS.register("banyan_pressure_plate",
        () -> new BlockItem(ModBlocks.BANYAN_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_BUTTON = ITEMS.register("banyan_button",
        () -> new BlockItem(ModBlocks.BANYAN_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_DOOR = ITEMS.register("banyan_door",
        () -> new BlockItem(ModBlocks.BANYAN_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_TRAPDOOR = ITEMS.register("banyan_trapdoor",
        () -> new BlockItem(ModBlocks.BANYAN_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_SIGN = ITEMS.register("banyan_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BANYAN_SIGN.get(), ModBlocks.BANYAN_WALL_SIGN.get()));
    public static final DeferredItem<Item> BANYAN_HANGING_SIGN = ITEMS.register("banyan_hanging_sign",
        () -> new HangingSignItem(ModBlocks.BANYAN_HANGING_SIGN.get(), ModBlocks.BANYAN_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> BANYAN_WOODEN_CRAFTING_TABLE = ITEMS.register("banyan_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.BANYAN_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("banyan_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BANYAN_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_WOODEN_CAULDRON = ITEMS.register("banyan_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BANYAN_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_WOODEN_HOPPER = ITEMS.register("banyan_wooden_hopper",
        () -> new BlockItem(ModBlocks.BANYAN_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_WOODEN_BARREL = ITEMS.register("banyan_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BANYAN_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_BOAT = ITEMS.register("banyan_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BANYAN_CHEST_BOAT = ITEMS.register("banyan_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BANYAN_WOODEN_PLATE = ITEMS.register("banyan_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Black Walnut ──────────────────────────────────
    public static final DeferredItem<Item> BLACK_WALNUT_LOG = ITEMS.register("black_walnut_log",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_BLACK_WALNUT_LOG = ITEMS.register("stripped_black_walnut_log",
        () -> new BlockItem(ModBlocks.STRIPPED_BLACK_WALNUT_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_WOOD = ITEMS.register("black_walnut_wood",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_BLACK_WALNUT_WOOD = ITEMS.register("stripped_black_walnut_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_BLACK_WALNUT_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_PLANKS = ITEMS.register("black_walnut_planks",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_LEAVES = ITEMS.register("black_walnut_leaves",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_SAPLING = ITEMS.register("black_walnut_sapling",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_SLAB = ITEMS.register("black_walnut_slab",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_STAIRS = ITEMS.register("black_walnut_stairs",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_FENCE = ITEMS.register("black_walnut_fence",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_FENCE_GATE = ITEMS.register("black_walnut_fence_gate",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_PRESSURE_PLATE = ITEMS.register("black_walnut_pressure_plate",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_BUTTON = ITEMS.register("black_walnut_button",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_DOOR = ITEMS.register("black_walnut_door",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_TRAPDOOR = ITEMS.register("black_walnut_trapdoor",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_SIGN = ITEMS.register("black_walnut_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BLACK_WALNUT_SIGN.get(), ModBlocks.BLACK_WALNUT_WALL_SIGN.get()));
    public static final DeferredItem<Item> BLACK_WALNUT_HANGING_SIGN = ITEMS.register("black_walnut_hanging_sign",
        () -> new HangingSignItem(ModBlocks.BLACK_WALNUT_HANGING_SIGN.get(), ModBlocks.BLACK_WALNUT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> BLACK_WALNUT_WOODEN_CRAFTING_TABLE = ITEMS.register("black_walnut_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("black_walnut_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_WOODEN_CAULDRON = ITEMS.register("black_walnut_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_WOODEN_HOPPER = ITEMS.register("black_walnut_wooden_hopper",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_WOODEN_BARREL = ITEMS.register("black_walnut_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BLACK_WALNUT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_BOAT = ITEMS.register("black_walnut_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BLACK_WALNUT_CHEST_BOAT = ITEMS.register("black_walnut_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BLACK_WALNUT_WOODEN_PLATE = ITEMS.register("black_walnut_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Bloodwood ──────────────────────────────────
    public static final DeferredItem<Item> BLOODWOOD_LOG = ITEMS.register("bloodwood_log",
        () -> new BlockItem(ModBlocks.BLOODWOOD_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_BLOODWOOD_LOG = ITEMS.register("stripped_bloodwood_log",
        () -> new BlockItem(ModBlocks.STRIPPED_BLOODWOOD_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_WOOD = ITEMS.register("bloodwood_wood",
        () -> new BlockItem(ModBlocks.BLOODWOOD_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_BLOODWOOD_WOOD = ITEMS.register("stripped_bloodwood_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_BLOODWOOD_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_PLANKS = ITEMS.register("bloodwood_planks",
        () -> new BlockItem(ModBlocks.BLOODWOOD_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_LEAVES = ITEMS.register("bloodwood_leaves",
        () -> new BlockItem(ModBlocks.BLOODWOOD_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_SAPLING = ITEMS.register("bloodwood_sapling",
        () -> new BlockItem(ModBlocks.BLOODWOOD_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_SLAB = ITEMS.register("bloodwood_slab",
        () -> new BlockItem(ModBlocks.BLOODWOOD_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_STAIRS = ITEMS.register("bloodwood_stairs",
        () -> new BlockItem(ModBlocks.BLOODWOOD_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_FENCE = ITEMS.register("bloodwood_fence",
        () -> new BlockItem(ModBlocks.BLOODWOOD_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_FENCE_GATE = ITEMS.register("bloodwood_fence_gate",
        () -> new BlockItem(ModBlocks.BLOODWOOD_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_PRESSURE_PLATE = ITEMS.register("bloodwood_pressure_plate",
        () -> new BlockItem(ModBlocks.BLOODWOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_BUTTON = ITEMS.register("bloodwood_button",
        () -> new BlockItem(ModBlocks.BLOODWOOD_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_DOOR = ITEMS.register("bloodwood_door",
        () -> new BlockItem(ModBlocks.BLOODWOOD_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_TRAPDOOR = ITEMS.register("bloodwood_trapdoor",
        () -> new BlockItem(ModBlocks.BLOODWOOD_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_SIGN = ITEMS.register("bloodwood_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BLOODWOOD_SIGN.get(), ModBlocks.BLOODWOOD_WALL_SIGN.get()));
    public static final DeferredItem<Item> BLOODWOOD_HANGING_SIGN = ITEMS.register("bloodwood_hanging_sign",
        () -> new HangingSignItem(ModBlocks.BLOODWOOD_HANGING_SIGN.get(), ModBlocks.BLOODWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> BLOODWOOD_WOODEN_CRAFTING_TABLE = ITEMS.register("bloodwood_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.BLOODWOOD_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bloodwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BLOODWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_WOODEN_CAULDRON = ITEMS.register("bloodwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BLOODWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_WOODEN_HOPPER = ITEMS.register("bloodwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.BLOODWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_WOODEN_BARREL = ITEMS.register("bloodwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BLOODWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_BOAT = ITEMS.register("bloodwood_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BLOODWOOD_CHEST_BOAT = ITEMS.register("bloodwood_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BLOODWOOD_WOODEN_PLATE = ITEMS.register("bloodwood_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Bristlecone Pine ──────────────────────────────────
    public static final DeferredItem<Item> BRISTLECONE_PINE_LOG = ITEMS.register("bristlecone_pine_log",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_BRISTLECONE_PINE_LOG = ITEMS.register("stripped_bristlecone_pine_log",
        () -> new BlockItem(ModBlocks.STRIPPED_BRISTLECONE_PINE_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_WOOD = ITEMS.register("bristlecone_pine_wood",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_BRISTLECONE_PINE_WOOD = ITEMS.register("stripped_bristlecone_pine_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_BRISTLECONE_PINE_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_PLANKS = ITEMS.register("bristlecone_pine_planks",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_LEAVES = ITEMS.register("bristlecone_pine_leaves",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_SAPLING = ITEMS.register("bristlecone_pine_sapling",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_SLAB = ITEMS.register("bristlecone_pine_slab",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_STAIRS = ITEMS.register("bristlecone_pine_stairs",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_FENCE = ITEMS.register("bristlecone_pine_fence",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_FENCE_GATE = ITEMS.register("bristlecone_pine_fence_gate",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_PRESSURE_PLATE = ITEMS.register("bristlecone_pine_pressure_plate",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_BUTTON = ITEMS.register("bristlecone_pine_button",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_DOOR = ITEMS.register("bristlecone_pine_door",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_TRAPDOOR = ITEMS.register("bristlecone_pine_trapdoor",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_SIGN = ITEMS.register("bristlecone_pine_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BRISTLECONE_PINE_SIGN.get(), ModBlocks.BRISTLECONE_PINE_WALL_SIGN.get()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_HANGING_SIGN = ITEMS.register("bristlecone_pine_hanging_sign",
        () -> new HangingSignItem(ModBlocks.BRISTLECONE_PINE_HANGING_SIGN.get(), ModBlocks.BRISTLECONE_PINE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE = ITEMS.register("bristlecone_pine_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bristlecone_pine_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_WOODEN_CAULDRON = ITEMS.register("bristlecone_pine_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_WOODEN_HOPPER = ITEMS.register("bristlecone_pine_wooden_hopper",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_WOODEN_BARREL = ITEMS.register("bristlecone_pine_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BRISTLECONE_PINE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_BOAT = ITEMS.register("bristlecone_pine_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BRISTLECONE_PINE_CHEST_BOAT = ITEMS.register("bristlecone_pine_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> BRISTLECONE_PINE_WOODEN_PLATE = ITEMS.register("bristlecone_pine_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Cork Oak ──────────────────────────────────
    public static final DeferredItem<Item> CORK_OAK_LOG = ITEMS.register("cork_oak_log",
        () -> new BlockItem(ModBlocks.CORK_OAK_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_CORK_OAK_LOG = ITEMS.register("stripped_cork_oak_log",
        () -> new BlockItem(ModBlocks.STRIPPED_CORK_OAK_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_WOOD = ITEMS.register("cork_oak_wood",
        () -> new BlockItem(ModBlocks.CORK_OAK_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_CORK_OAK_WOOD = ITEMS.register("stripped_cork_oak_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_CORK_OAK_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_PLANKS = ITEMS.register("cork_oak_planks",
        () -> new BlockItem(ModBlocks.CORK_OAK_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_LEAVES = ITEMS.register("cork_oak_leaves",
        () -> new BlockItem(ModBlocks.CORK_OAK_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_SAPLING = ITEMS.register("cork_oak_sapling",
        () -> new BlockItem(ModBlocks.CORK_OAK_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_SLAB = ITEMS.register("cork_oak_slab",
        () -> new BlockItem(ModBlocks.CORK_OAK_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_STAIRS = ITEMS.register("cork_oak_stairs",
        () -> new BlockItem(ModBlocks.CORK_OAK_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_FENCE = ITEMS.register("cork_oak_fence",
        () -> new BlockItem(ModBlocks.CORK_OAK_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_FENCE_GATE = ITEMS.register("cork_oak_fence_gate",
        () -> new BlockItem(ModBlocks.CORK_OAK_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_PRESSURE_PLATE = ITEMS.register("cork_oak_pressure_plate",
        () -> new BlockItem(ModBlocks.CORK_OAK_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_BUTTON = ITEMS.register("cork_oak_button",
        () -> new BlockItem(ModBlocks.CORK_OAK_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_DOOR = ITEMS.register("cork_oak_door",
        () -> new BlockItem(ModBlocks.CORK_OAK_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_TRAPDOOR = ITEMS.register("cork_oak_trapdoor",
        () -> new BlockItem(ModBlocks.CORK_OAK_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_SIGN = ITEMS.register("cork_oak_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CORK_OAK_SIGN.get(), ModBlocks.CORK_OAK_WALL_SIGN.get()));
    public static final DeferredItem<Item> CORK_OAK_HANGING_SIGN = ITEMS.register("cork_oak_hanging_sign",
        () -> new HangingSignItem(ModBlocks.CORK_OAK_HANGING_SIGN.get(), ModBlocks.CORK_OAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> CORK_OAK_WOODEN_CRAFTING_TABLE = ITEMS.register("cork_oak_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.CORK_OAK_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("cork_oak_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CORK_OAK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_WOODEN_CAULDRON = ITEMS.register("cork_oak_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CORK_OAK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_WOODEN_HOPPER = ITEMS.register("cork_oak_wooden_hopper",
        () -> new BlockItem(ModBlocks.CORK_OAK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_WOODEN_BARREL = ITEMS.register("cork_oak_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CORK_OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_BOAT = ITEMS.register("cork_oak_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CORK_OAK_CHEST_BOAT = ITEMS.register("cork_oak_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> CORK_OAK_WOODEN_PLATE = ITEMS.register("cork_oak_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Dragon Blood ──────────────────────────────────
    public static final DeferredItem<Item> DRAGON_BLOOD_LOG = ITEMS.register("dragon_blood_log",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_DRAGON_BLOOD_LOG = ITEMS.register("stripped_dragon_blood_log",
        () -> new BlockItem(ModBlocks.STRIPPED_DRAGON_BLOOD_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_WOOD = ITEMS.register("dragon_blood_wood",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_DRAGON_BLOOD_WOOD = ITEMS.register("stripped_dragon_blood_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_DRAGON_BLOOD_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_PLANKS = ITEMS.register("dragon_blood_planks",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_LEAVES = ITEMS.register("dragon_blood_leaves",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_SAPLING = ITEMS.register("dragon_blood_sapling",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_SLAB = ITEMS.register("dragon_blood_slab",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_STAIRS = ITEMS.register("dragon_blood_stairs",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_FENCE = ITEMS.register("dragon_blood_fence",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_FENCE_GATE = ITEMS.register("dragon_blood_fence_gate",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_PRESSURE_PLATE = ITEMS.register("dragon_blood_pressure_plate",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_BUTTON = ITEMS.register("dragon_blood_button",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_DOOR = ITEMS.register("dragon_blood_door",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_TRAPDOOR = ITEMS.register("dragon_blood_trapdoor",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_SIGN = ITEMS.register("dragon_blood_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DRAGON_BLOOD_SIGN.get(), ModBlocks.DRAGON_BLOOD_WALL_SIGN.get()));
    public static final DeferredItem<Item> DRAGON_BLOOD_HANGING_SIGN = ITEMS.register("dragon_blood_hanging_sign",
        () -> new HangingSignItem(ModBlocks.DRAGON_BLOOD_HANGING_SIGN.get(), ModBlocks.DRAGON_BLOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> DRAGON_BLOOD_WOODEN_CRAFTING_TABLE = ITEMS.register("dragon_blood_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("dragon_blood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_WOODEN_CAULDRON = ITEMS.register("dragon_blood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_WOODEN_HOPPER = ITEMS.register("dragon_blood_wooden_hopper",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_WOODEN_BARREL = ITEMS.register("dragon_blood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.DRAGON_BLOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_BOAT = ITEMS.register("dragon_blood_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> DRAGON_BLOOD_CHEST_BOAT = ITEMS.register("dragon_blood_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> DRAGON_BLOOD_WOODEN_PLATE = ITEMS.register("dragon_blood_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Kapok ──────────────────────────────────
    public static final DeferredItem<Item> KAPOK_LOG = ITEMS.register("kapok_log",
        () -> new BlockItem(ModBlocks.KAPOK_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_KAPOK_LOG = ITEMS.register("stripped_kapok_log",
        () -> new BlockItem(ModBlocks.STRIPPED_KAPOK_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_WOOD = ITEMS.register("kapok_wood",
        () -> new BlockItem(ModBlocks.KAPOK_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_KAPOK_WOOD = ITEMS.register("stripped_kapok_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_KAPOK_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_PLANKS = ITEMS.register("kapok_planks",
        () -> new BlockItem(ModBlocks.KAPOK_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_LEAVES = ITEMS.register("kapok_leaves",
        () -> new BlockItem(ModBlocks.KAPOK_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_SAPLING = ITEMS.register("kapok_sapling",
        () -> new BlockItem(ModBlocks.KAPOK_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_SLAB = ITEMS.register("kapok_slab",
        () -> new BlockItem(ModBlocks.KAPOK_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_STAIRS = ITEMS.register("kapok_stairs",
        () -> new BlockItem(ModBlocks.KAPOK_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_FENCE = ITEMS.register("kapok_fence",
        () -> new BlockItem(ModBlocks.KAPOK_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_FENCE_GATE = ITEMS.register("kapok_fence_gate",
        () -> new BlockItem(ModBlocks.KAPOK_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_PRESSURE_PLATE = ITEMS.register("kapok_pressure_plate",
        () -> new BlockItem(ModBlocks.KAPOK_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_BUTTON = ITEMS.register("kapok_button",
        () -> new BlockItem(ModBlocks.KAPOK_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_DOOR = ITEMS.register("kapok_door",
        () -> new BlockItem(ModBlocks.KAPOK_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_TRAPDOOR = ITEMS.register("kapok_trapdoor",
        () -> new BlockItem(ModBlocks.KAPOK_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_SIGN = ITEMS.register("kapok_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.KAPOK_SIGN.get(), ModBlocks.KAPOK_WALL_SIGN.get()));
    public static final DeferredItem<Item> KAPOK_HANGING_SIGN = ITEMS.register("kapok_hanging_sign",
        () -> new HangingSignItem(ModBlocks.KAPOK_HANGING_SIGN.get(), ModBlocks.KAPOK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> KAPOK_WOODEN_CRAFTING_TABLE = ITEMS.register("kapok_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.KAPOK_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("kapok_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.KAPOK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_WOODEN_CAULDRON = ITEMS.register("kapok_wooden_cauldron",
        () -> new BlockItem(ModBlocks.KAPOK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_WOODEN_HOPPER = ITEMS.register("kapok_wooden_hopper",
        () -> new BlockItem(ModBlocks.KAPOK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_WOODEN_BARREL = ITEMS.register("kapok_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.KAPOK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_BOAT = ITEMS.register("kapok_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> KAPOK_CHEST_BOAT = ITEMS.register("kapok_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> KAPOK_WOODEN_PLATE = ITEMS.register("kapok_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Larch ──────────────────────────────────
    public static final DeferredItem<Item> LARCH_LOG = ITEMS.register("larch_log",
        () -> new BlockItem(ModBlocks.LARCH_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_LARCH_LOG = ITEMS.register("stripped_larch_log",
        () -> new BlockItem(ModBlocks.STRIPPED_LARCH_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_WOOD = ITEMS.register("larch_wood",
        () -> new BlockItem(ModBlocks.LARCH_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_LARCH_WOOD = ITEMS.register("stripped_larch_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_LARCH_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_PLANKS = ITEMS.register("larch_planks",
        () -> new BlockItem(ModBlocks.LARCH_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_LEAVES = ITEMS.register("larch_leaves",
        () -> new BlockItem(ModBlocks.LARCH_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_SAPLING = ITEMS.register("larch_sapling",
        () -> new BlockItem(ModBlocks.LARCH_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_SLAB = ITEMS.register("larch_slab",
        () -> new BlockItem(ModBlocks.LARCH_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_STAIRS = ITEMS.register("larch_stairs",
        () -> new BlockItem(ModBlocks.LARCH_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_FENCE = ITEMS.register("larch_fence",
        () -> new BlockItem(ModBlocks.LARCH_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_FENCE_GATE = ITEMS.register("larch_fence_gate",
        () -> new BlockItem(ModBlocks.LARCH_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_PRESSURE_PLATE = ITEMS.register("larch_pressure_plate",
        () -> new BlockItem(ModBlocks.LARCH_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_BUTTON = ITEMS.register("larch_button",
        () -> new BlockItem(ModBlocks.LARCH_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_DOOR = ITEMS.register("larch_door",
        () -> new BlockItem(ModBlocks.LARCH_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_TRAPDOOR = ITEMS.register("larch_trapdoor",
        () -> new BlockItem(ModBlocks.LARCH_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_SIGN = ITEMS.register("larch_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LARCH_SIGN.get(), ModBlocks.LARCH_WALL_SIGN.get()));
    public static final DeferredItem<Item> LARCH_HANGING_SIGN = ITEMS.register("larch_hanging_sign",
        () -> new HangingSignItem(ModBlocks.LARCH_HANGING_SIGN.get(), ModBlocks.LARCH_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> LARCH_WOODEN_CRAFTING_TABLE = ITEMS.register("larch_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.LARCH_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("larch_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.LARCH_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_WOODEN_CAULDRON = ITEMS.register("larch_wooden_cauldron",
        () -> new BlockItem(ModBlocks.LARCH_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_WOODEN_HOPPER = ITEMS.register("larch_wooden_hopper",
        () -> new BlockItem(ModBlocks.LARCH_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_WOODEN_BARREL = ITEMS.register("larch_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.LARCH_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_BOAT = ITEMS.register("larch_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> LARCH_CHEST_BOAT = ITEMS.register("larch_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> LARCH_WOODEN_PLATE = ITEMS.register("larch_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Sandalwood ──────────────────────────────────
    public static final DeferredItem<Item> SANDALWOOD_LOG = ITEMS.register("sandalwood_log",
        () -> new BlockItem(ModBlocks.SANDALWOOD_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_SANDALWOOD_LOG = ITEMS.register("stripped_sandalwood_log",
        () -> new BlockItem(ModBlocks.STRIPPED_SANDALWOOD_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_WOOD = ITEMS.register("sandalwood_wood",
        () -> new BlockItem(ModBlocks.SANDALWOOD_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_SANDALWOOD_WOOD = ITEMS.register("stripped_sandalwood_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_SANDALWOOD_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_PLANKS = ITEMS.register("sandalwood_planks",
        () -> new BlockItem(ModBlocks.SANDALWOOD_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_LEAVES = ITEMS.register("sandalwood_leaves",
        () -> new BlockItem(ModBlocks.SANDALWOOD_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_SAPLING = ITEMS.register("sandalwood_sapling",
        () -> new BlockItem(ModBlocks.SANDALWOOD_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_SLAB = ITEMS.register("sandalwood_slab",
        () -> new BlockItem(ModBlocks.SANDALWOOD_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_STAIRS = ITEMS.register("sandalwood_stairs",
        () -> new BlockItem(ModBlocks.SANDALWOOD_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_FENCE = ITEMS.register("sandalwood_fence",
        () -> new BlockItem(ModBlocks.SANDALWOOD_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_FENCE_GATE = ITEMS.register("sandalwood_fence_gate",
        () -> new BlockItem(ModBlocks.SANDALWOOD_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_PRESSURE_PLATE = ITEMS.register("sandalwood_pressure_plate",
        () -> new BlockItem(ModBlocks.SANDALWOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_BUTTON = ITEMS.register("sandalwood_button",
        () -> new BlockItem(ModBlocks.SANDALWOOD_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_DOOR = ITEMS.register("sandalwood_door",
        () -> new BlockItem(ModBlocks.SANDALWOOD_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_TRAPDOOR = ITEMS.register("sandalwood_trapdoor",
        () -> new BlockItem(ModBlocks.SANDALWOOD_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_SIGN = ITEMS.register("sandalwood_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.SANDALWOOD_SIGN.get(), ModBlocks.SANDALWOOD_WALL_SIGN.get()));
    public static final DeferredItem<Item> SANDALWOOD_HANGING_SIGN = ITEMS.register("sandalwood_hanging_sign",
        () -> new HangingSignItem(ModBlocks.SANDALWOOD_HANGING_SIGN.get(), ModBlocks.SANDALWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> SANDALWOOD_WOODEN_CRAFTING_TABLE = ITEMS.register("sandalwood_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.SANDALWOOD_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("sandalwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SANDALWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_WOODEN_CAULDRON = ITEMS.register("sandalwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SANDALWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_WOODEN_HOPPER = ITEMS.register("sandalwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.SANDALWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_WOODEN_BARREL = ITEMS.register("sandalwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SANDALWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_BOAT = ITEMS.register("sandalwood_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SANDALWOOD_CHEST_BOAT = ITEMS.register("sandalwood_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SANDALWOOD_WOODEN_PLATE = ITEMS.register("sandalwood_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Sycamore ──────────────────────────────────
    public static final DeferredItem<Item> SYCAMORE_LOG = ITEMS.register("sycamore_log",
        () -> new BlockItem(ModBlocks.SYCAMORE_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_SYCAMORE_LOG = ITEMS.register("stripped_sycamore_log",
        () -> new BlockItem(ModBlocks.STRIPPED_SYCAMORE_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_WOOD = ITEMS.register("sycamore_wood",
        () -> new BlockItem(ModBlocks.SYCAMORE_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_SYCAMORE_WOOD = ITEMS.register("stripped_sycamore_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_SYCAMORE_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_PLANKS = ITEMS.register("sycamore_planks",
        () -> new BlockItem(ModBlocks.SYCAMORE_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_LEAVES = ITEMS.register("sycamore_leaves",
        () -> new BlockItem(ModBlocks.SYCAMORE_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_SAPLING = ITEMS.register("sycamore_sapling",
        () -> new BlockItem(ModBlocks.SYCAMORE_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_SLAB = ITEMS.register("sycamore_slab",
        () -> new BlockItem(ModBlocks.SYCAMORE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_STAIRS = ITEMS.register("sycamore_stairs",
        () -> new BlockItem(ModBlocks.SYCAMORE_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_FENCE = ITEMS.register("sycamore_fence",
        () -> new BlockItem(ModBlocks.SYCAMORE_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_FENCE_GATE = ITEMS.register("sycamore_fence_gate",
        () -> new BlockItem(ModBlocks.SYCAMORE_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_PRESSURE_PLATE = ITEMS.register("sycamore_pressure_plate",
        () -> new BlockItem(ModBlocks.SYCAMORE_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_BUTTON = ITEMS.register("sycamore_button",
        () -> new BlockItem(ModBlocks.SYCAMORE_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_DOOR = ITEMS.register("sycamore_door",
        () -> new BlockItem(ModBlocks.SYCAMORE_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_TRAPDOOR = ITEMS.register("sycamore_trapdoor",
        () -> new BlockItem(ModBlocks.SYCAMORE_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_SIGN = ITEMS.register("sycamore_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.SYCAMORE_SIGN.get(), ModBlocks.SYCAMORE_WALL_SIGN.get()));
    public static final DeferredItem<Item> SYCAMORE_HANGING_SIGN = ITEMS.register("sycamore_hanging_sign",
        () -> new HangingSignItem(ModBlocks.SYCAMORE_HANGING_SIGN.get(), ModBlocks.SYCAMORE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> SYCAMORE_WOODEN_CRAFTING_TABLE = ITEMS.register("sycamore_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.SYCAMORE_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("sycamore_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SYCAMORE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_WOODEN_CAULDRON = ITEMS.register("sycamore_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SYCAMORE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_WOODEN_HOPPER = ITEMS.register("sycamore_wooden_hopper",
        () -> new BlockItem(ModBlocks.SYCAMORE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_WOODEN_BARREL = ITEMS.register("sycamore_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SYCAMORE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_BOAT = ITEMS.register("sycamore_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SYCAMORE_CHEST_BOAT = ITEMS.register("sycamore_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> SYCAMORE_WOODEN_PLATE = ITEMS.register("sycamore_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Teak ──────────────────────────────────
    public static final DeferredItem<Item> TEAK_LOG = ITEMS.register("teak_log",
        () -> new BlockItem(ModBlocks.TEAK_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_TEAK_LOG = ITEMS.register("stripped_teak_log",
        () -> new BlockItem(ModBlocks.STRIPPED_TEAK_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_WOOD = ITEMS.register("teak_wood",
        () -> new BlockItem(ModBlocks.TEAK_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_TEAK_WOOD = ITEMS.register("stripped_teak_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_TEAK_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_PLANKS = ITEMS.register("teak_planks",
        () -> new BlockItem(ModBlocks.TEAK_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_LEAVES = ITEMS.register("teak_leaves",
        () -> new BlockItem(ModBlocks.TEAK_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_SAPLING = ITEMS.register("teak_sapling",
        () -> new BlockItem(ModBlocks.TEAK_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_SLAB = ITEMS.register("teak_slab",
        () -> new BlockItem(ModBlocks.TEAK_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_STAIRS = ITEMS.register("teak_stairs",
        () -> new BlockItem(ModBlocks.TEAK_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_FENCE = ITEMS.register("teak_fence",
        () -> new BlockItem(ModBlocks.TEAK_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_FENCE_GATE = ITEMS.register("teak_fence_gate",
        () -> new BlockItem(ModBlocks.TEAK_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_PRESSURE_PLATE = ITEMS.register("teak_pressure_plate",
        () -> new BlockItem(ModBlocks.TEAK_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_BUTTON = ITEMS.register("teak_button",
        () -> new BlockItem(ModBlocks.TEAK_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_DOOR = ITEMS.register("teak_door",
        () -> new BlockItem(ModBlocks.TEAK_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_TRAPDOOR = ITEMS.register("teak_trapdoor",
        () -> new BlockItem(ModBlocks.TEAK_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_SIGN = ITEMS.register("teak_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.TEAK_SIGN.get(), ModBlocks.TEAK_WALL_SIGN.get()));
    public static final DeferredItem<Item> TEAK_HANGING_SIGN = ITEMS.register("teak_hanging_sign",
        () -> new HangingSignItem(ModBlocks.TEAK_HANGING_SIGN.get(), ModBlocks.TEAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> TEAK_WOODEN_CRAFTING_TABLE = ITEMS.register("teak_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.TEAK_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("teak_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.TEAK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_WOODEN_CAULDRON = ITEMS.register("teak_wooden_cauldron",
        () -> new BlockItem(ModBlocks.TEAK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_WOODEN_HOPPER = ITEMS.register("teak_wooden_hopper",
        () -> new BlockItem(ModBlocks.TEAK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_WOODEN_BARREL = ITEMS.register("teak_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.TEAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_BOAT = ITEMS.register("teak_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> TEAK_CHEST_BOAT = ITEMS.register("teak_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> TEAK_WOODEN_PLATE = ITEMS.register("teak_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Wenge ──────────────────────────────────
    public static final DeferredItem<Item> WENGE_LOG = ITEMS.register("wenge_log",
        () -> new BlockItem(ModBlocks.WENGE_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_WENGE_LOG = ITEMS.register("stripped_wenge_log",
        () -> new BlockItem(ModBlocks.STRIPPED_WENGE_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_WOOD = ITEMS.register("wenge_wood",
        () -> new BlockItem(ModBlocks.WENGE_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_WENGE_WOOD = ITEMS.register("stripped_wenge_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_WENGE_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_PLANKS = ITEMS.register("wenge_planks",
        () -> new BlockItem(ModBlocks.WENGE_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_LEAVES = ITEMS.register("wenge_leaves",
        () -> new BlockItem(ModBlocks.WENGE_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_SAPLING = ITEMS.register("wenge_sapling",
        () -> new BlockItem(ModBlocks.WENGE_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_SLAB = ITEMS.register("wenge_slab",
        () -> new BlockItem(ModBlocks.WENGE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_STAIRS = ITEMS.register("wenge_stairs",
        () -> new BlockItem(ModBlocks.WENGE_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_FENCE = ITEMS.register("wenge_fence",
        () -> new BlockItem(ModBlocks.WENGE_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_FENCE_GATE = ITEMS.register("wenge_fence_gate",
        () -> new BlockItem(ModBlocks.WENGE_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_PRESSURE_PLATE = ITEMS.register("wenge_pressure_plate",
        () -> new BlockItem(ModBlocks.WENGE_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_BUTTON = ITEMS.register("wenge_button",
        () -> new BlockItem(ModBlocks.WENGE_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_DOOR = ITEMS.register("wenge_door",
        () -> new BlockItem(ModBlocks.WENGE_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_TRAPDOOR = ITEMS.register("wenge_trapdoor",
        () -> new BlockItem(ModBlocks.WENGE_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_SIGN = ITEMS.register("wenge_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WENGE_SIGN.get(), ModBlocks.WENGE_WALL_SIGN.get()));
    public static final DeferredItem<Item> WENGE_HANGING_SIGN = ITEMS.register("wenge_hanging_sign",
        () -> new HangingSignItem(ModBlocks.WENGE_HANGING_SIGN.get(), ModBlocks.WENGE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> WENGE_WOODEN_CRAFTING_TABLE = ITEMS.register("wenge_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.WENGE_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("wenge_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.WENGE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_WOODEN_CAULDRON = ITEMS.register("wenge_wooden_cauldron",
        () -> new BlockItem(ModBlocks.WENGE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_WOODEN_HOPPER = ITEMS.register("wenge_wooden_hopper",
        () -> new BlockItem(ModBlocks.WENGE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_WOODEN_BARREL = ITEMS.register("wenge_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.WENGE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_BOAT = ITEMS.register("wenge_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> WENGE_CHEST_BOAT = ITEMS.register("wenge_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> WENGE_WOODEN_PLATE = ITEMS.register("wenge_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Zebrawood ──────────────────────────────────
    public static final DeferredItem<Item> ZEBRAWOOD_LOG = ITEMS.register("zebrawood_log",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_ZEBRAWOOD_LOG = ITEMS.register("stripped_zebrawood_log",
        () -> new BlockItem(ModBlocks.STRIPPED_ZEBRAWOOD_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_WOOD = ITEMS.register("zebrawood_wood",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> STRIPPED_ZEBRAWOOD_WOOD = ITEMS.register("stripped_zebrawood_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_ZEBRAWOOD_WOOD.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_PLANKS = ITEMS.register("zebrawood_planks",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_PLANKS.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_LEAVES = ITEMS.register("zebrawood_leaves",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_LEAVES.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_SAPLING = ITEMS.register("zebrawood_sapling",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_SAPLING.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_SLAB = ITEMS.register("zebrawood_slab",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_STAIRS = ITEMS.register("zebrawood_stairs",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_STAIRS.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_FENCE = ITEMS.register("zebrawood_fence",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_FENCE.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_FENCE_GATE = ITEMS.register("zebrawood_fence_gate",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_FENCE_GATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_PRESSURE_PLATE = ITEMS.register("zebrawood_pressure_plate",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_BUTTON = ITEMS.register("zebrawood_button",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_BUTTON.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_DOOR = ITEMS.register("zebrawood_door",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_DOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_TRAPDOOR = ITEMS.register("zebrawood_trapdoor",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_TRAPDOOR.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_SIGN = ITEMS.register("zebrawood_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ZEBRAWOOD_SIGN.get(), ModBlocks.ZEBRAWOOD_WALL_SIGN.get()));
    public static final DeferredItem<Item> ZEBRAWOOD_HANGING_SIGN = ITEMS.register("zebrawood_hanging_sign",
        () -> new HangingSignItem(ModBlocks.ZEBRAWOOD_HANGING_SIGN.get(), ModBlocks.ZEBRAWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> ZEBRAWOOD_WOODEN_CRAFTING_TABLE = ITEMS.register("zebrawood_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("zebrawood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_WOODEN_CAULDRON = ITEMS.register("zebrawood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_WOODEN_HOPPER = ITEMS.register("zebrawood_wooden_hopper",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_WOODEN_BARREL = ITEMS.register("zebrawood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.ZEBRAWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_BOAT = ITEMS.register("zebrawood_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ZEBRAWOOD_CHEST_BOAT = ITEMS.register("zebrawood_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> ZEBRAWOOD_WOODEN_PLATE = ITEMS.register("zebrawood_wooden_plate",
        () -> new Item(new Item.Properties()));
    
    // ── Wooden Chest Items (NeoForge) ───────────────────────────────────────
    public static final DeferredItem<Item> WOODEN_CHEST = ITEMS.register("wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> OAK_WOODEN_CHEST = ITEMS.register("oak_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.OAK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPRUCE_WOODEN_CHEST = ITEMS.register("spruce_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SPRUCE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BIRCH_WOODEN_CHEST = ITEMS.register("birch_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BIRCH_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> JUNGLE_WOODEN_CHEST = ITEMS.register("jungle_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.JUNGLE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> ACACIA_WOODEN_CHEST = ITEMS.register("acacia_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.ACACIA_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> DARK_OAK_WOODEN_CHEST = ITEMS.register("dark_oak_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.DARK_OAK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> MANGROVE_WOODEN_CHEST = ITEMS.register("mangrove_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.MANGROVE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> CHERRY_WOODEN_CHEST = ITEMS.register("cherry_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CHERRY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BAMBOO_WOODEN_CHEST = ITEMS.register("bamboo_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BAMBOO_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRIMSON_WOODEN_CHEST = ITEMS.register("crimson_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CRIMSON_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> WARPED_WOODEN_CHEST = ITEMS.register("warped_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.WARPED_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_OAK_WOODEN_CHEST = ITEMS.register("twilight_oak_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.TWILIGHT_OAK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> CANOPY_WOODEN_CHEST = ITEMS.register("canopy_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CANOPY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> TWILIGHT_MANGROVE_WOODEN_CHEST = ITEMS.register("twilight_mangrove_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.TWILIGHT_MANGROVE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> DARK_WOODEN_CHEST = ITEMS.register("dark_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.DARK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> TIME_WOODEN_CHEST = ITEMS.register("time_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.TIME_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> TRANSFORMATION_WOODEN_CHEST = ITEMS.register("transformation_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.TRANSFORMATION_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> MINING_WOODEN_CHEST = ITEMS.register("mining_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.MINING_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> SORTING_WOODEN_CHEST = ITEMS.register("sorting_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SORTING_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> TOWERWOOD_WOODEN_CHEST = ITEMS.register("towerwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.TOWERWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> FIR_WOODEN_CHEST = ITEMS.register("fir_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.FIR_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> PINE_WOODEN_CHEST = ITEMS.register("pine_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.PINE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAPLE_WOODEN_CHEST = ITEMS.register("maple_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.MAPLE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> REDWOOD_WOODEN_CHEST = ITEMS.register("redwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.REDWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAHOGANY_WOODEN_CHEST = ITEMS.register("mahogany_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.MAHOGANY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> JACARANDA_WOODEN_CHEST = ITEMS.register("jacaranda_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.JACARANDA_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> PALM_WOODEN_CHEST = ITEMS.register("palm_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.PALM_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> WILLOW_WOODEN_CHEST = ITEMS.register("willow_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.WILLOW_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> DEAD_WOODEN_CHEST = ITEMS.register("dead_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.DEAD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> MAGIC_WOODEN_CHEST = ITEMS.register("magic_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.MAGIC_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> UMBRAN_WOODEN_CHEST = ITEMS.register("umbran_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.UMBRAN_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> HELLBARK_WOODEN_CHEST = ITEMS.register("hellbark_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.HELLBARK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> EMPYREAL_WOODEN_CHEST = ITEMS.register("empyreal_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.EMPYREAL_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> ROSEROOT_WOODEN_CHEST = ITEMS.register("roseroot_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.ROSEROOT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> YAGROOT_WOODEN_CHEST = ITEMS.register("yagroot_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.YAGROOT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRUDEROOT_WOODEN_CHEST = ITEMS.register("cruderoot_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CRUDEROOT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> CONBERRY_WOODEN_CHEST = ITEMS.register("conberry_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CONBERRY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> SUNROOT_WOODEN_CHEST = ITEMS.register("sunroot_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SUNROOT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> SKYROOT_WOODEN_CHEST = ITEMS.register("skyroot_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SKYROOT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> ASPEN_WOODEN_CHEST = ITEMS.register("aspen_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.ASPEN_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BAOBAB_WOODEN_CHEST = ITEMS.register("baobab_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BAOBAB_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLUE_ENCHANTED_WOODEN_CHEST = ITEMS.register("blue_enchanted_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BLUE_ENCHANTED_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> CIKA_WOODEN_CHEST = ITEMS.register("cika_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CIKA_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> CYPRESS_WOODEN_CHEST = ITEMS.register("cypress_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CYPRESS_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> EBONY_WOODEN_CHEST = ITEMS.register("ebony_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.EBONY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_FIR_WOODEN_CHEST = ITEMS.register("bwg_fir_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_FIR_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> FLORUS_WOODEN_CHEST = ITEMS.register("florus_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.FLORUS_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> GREEN_ENCHANTED_WOODEN_CHEST = ITEMS.register("green_enchanted_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.GREEN_ENCHANTED_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> HOLLY_WOODEN_CHEST = ITEMS.register("holly_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.HOLLY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> IRONWOOD_WOODEN_CHEST = ITEMS.register("ironwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.IRONWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_JACARANDA_WOODEN_CHEST = ITEMS.register("bwg_jacaranda_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_JACARANDA_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAHOGANY_WOODEN_CHEST = ITEMS.register("bwg_mahogany_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_MAHOGANY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_MAPLE_WOODEN_CHEST = ITEMS.register("bwg_maple_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_MAPLE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_PALM_WOODEN_CHEST = ITEMS.register("bwg_palm_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_PALM_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_PINE_WOODEN_CHEST = ITEMS.register("bwg_pine_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_PINE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> RAINBOW_EUCALYPTUS_WOODEN_CHEST = ITEMS.register("rainbow_eucalyptus_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_REDWOOD_WOODEN_CHEST = ITEMS.register("bwg_redwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_REDWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> SAKURA_WOODEN_CHEST = ITEMS.register("sakura_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SAKURA_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> SKYRIS_WOODEN_CHEST = ITEMS.register("skyris_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SKYRIS_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> SPIRIT_WOODEN_CHEST = ITEMS.register("spirit_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SPIRIT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> WHITE_MANGROVE_WOODEN_CHEST = ITEMS.register("white_mangrove_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.WHITE_MANGROVE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BWG_WILLOW_WOODEN_CHEST = ITEMS.register("bwg_willow_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_WILLOW_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> WITCH_HAZEL_WOODEN_CHEST = ITEMS.register("witch_hazel_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.WITCH_HAZEL_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZELKOVA_WOODEN_CHEST = ITEMS.register("zelkova_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.ZELKOVA_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> AFRICAN_BLACKWOOD_WOODEN_CHEST = ITEMS.register("african_blackwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BANYAN_WOODEN_CHEST = ITEMS.register("banyan_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BANYAN_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_WALNUT_WOODEN_CHEST = ITEMS.register("black_walnut_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BLACK_WALNUT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLOODWOOD_WOODEN_CHEST = ITEMS.register("bloodwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BLOODWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> BRISTLECONE_PINE_WOODEN_CHEST = ITEMS.register("bristlecone_pine_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BRISTLECONE_PINE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> CORK_OAK_WOODEN_CHEST = ITEMS.register("cork_oak_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CORK_OAK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> DRAGON_BLOOD_WOODEN_CHEST = ITEMS.register("dragon_blood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.DRAGON_BLOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> KAPOK_WOODEN_CHEST = ITEMS.register("kapok_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.KAPOK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> LARCH_WOODEN_CHEST = ITEMS.register("larch_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.LARCH_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> SANDALWOOD_WOODEN_CHEST = ITEMS.register("sandalwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SANDALWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> SYCAMORE_WOODEN_CHEST = ITEMS.register("sycamore_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SYCAMORE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> TEAK_WOODEN_CHEST = ITEMS.register("teak_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.TEAK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> WENGE_WOODEN_CHEST = ITEMS.register("wenge_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.WENGE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final DeferredItem<Item> ZEBRAWOOD_WOODEN_CHEST = ITEMS.register("zebrawood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.ZEBRAWOOD_WOODEN_CHEST.get(), new Item.Properties()));
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
        () -> new WoodenBarrelBlockItem(ModBlocks.WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WOODEN_BARREL = ITEMS.register("oak_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WOODEN_BARREL = ITEMS.register("spruce_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SPRUCE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WOODEN_BARREL = ITEMS.register("birch_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BIRCH_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_WOODEN_BARREL = ITEMS.register("jungle_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.JUNGLE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_WOODEN_BARREL = ITEMS.register("acacia_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.ACACIA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_WOODEN_BARREL = ITEMS.register("dark_oak_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.DARK_OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WOODEN_BARREL = ITEMS.register("mangrove_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.MANGROVE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_WOODEN_BARREL = ITEMS.register("cherry_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CHERRY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WOODEN_BARREL = ITEMS.register("bamboo_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BAMBOO_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_WOODEN_BARREL = ITEMS.register("crimson_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CRIMSON_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_WOODEN_BARREL = ITEMS.register("warped_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.WARPED_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_OAK_WOODEN_BARREL = ITEMS.register("twilight_oak_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.TWILIGHT_OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CANOPY_WOODEN_BARREL = ITEMS.register("canopy_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CANOPY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_MANGROVE_WOODEN_BARREL = ITEMS.register("twilight_mangrove_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.TWILIGHT_MANGROVE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_WOODEN_BARREL = ITEMS.register("dark_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.DARK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIME_WOODEN_BARREL = ITEMS.register("time_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.TIME_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TRANSFORMATION_WOODEN_BARREL = ITEMS.register("transformation_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.TRANSFORMATION_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MINING_WOODEN_BARREL = ITEMS.register("mining_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.MINING_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SORTING_WOODEN_BARREL = ITEMS.register("sorting_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SORTING_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TOWERWOOD_WOODEN_BARREL = ITEMS.register("towerwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.TOWERWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> FIR_WOODEN_BARREL = ITEMS.register("fir_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.FIR_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_WOODEN_BARREL = ITEMS.register("pine_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.PINE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_WOODEN_BARREL = ITEMS.register("maple_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.MAPLE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_WOODEN_BARREL = ITEMS.register("redwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.REDWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_WOODEN_BARREL = ITEMS.register("mahogany_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.MAHOGANY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_WOODEN_BARREL = ITEMS.register("jacaranda_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.JACARANDA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_WOODEN_BARREL = ITEMS.register("palm_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.PALM_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_WOODEN_BARREL = ITEMS.register("willow_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.WILLOW_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_WOODEN_BARREL = ITEMS.register("dead_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.DEAD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_WOODEN_BARREL = ITEMS.register("magic_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.MAGIC_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_WOODEN_BARREL = ITEMS.register("umbran_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.UMBRAN_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_WOODEN_BARREL = ITEMS.register("hellbark_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.HELLBARK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_WOODEN_BARREL = ITEMS.register("empyreal_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.EMPYREAL_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEROOT_WOODEN_BARREL = ITEMS.register("roseroot_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.ROSEROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> YAGROOT_WOODEN_BARREL = ITEMS.register("yagroot_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.YAGROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRUDEROOT_WOODEN_BARREL = ITEMS.register("cruderoot_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CRUDEROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONBERRY_WOODEN_BARREL = ITEMS.register("conberry_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CONBERRY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SUNROOT_WOODEN_BARREL = ITEMS.register("sunroot_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SUNROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYROOT_WOODEN_BARREL = ITEMS.register("skyroot_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SKYROOT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_WOODEN_BARREL = ITEMS.register("aspen_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.ASPEN_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAOBAB_WOODEN_BARREL = ITEMS.register("baobab_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BAOBAB_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ENCHANTED_WOODEN_BARREL = ITEMS.register("blue_enchanted_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BLUE_ENCHANTED_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CIKA_WOODEN_BARREL = ITEMS.register("cika_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CIKA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYPRESS_WOODEN_BARREL = ITEMS.register("cypress_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CYPRESS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> EBONY_WOODEN_BARREL = ITEMS.register("ebony_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.EBONY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_FIR_WOODEN_BARREL = ITEMS.register("bwg_fir_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_FIR_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLORUS_WOODEN_BARREL = ITEMS.register("florus_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.FLORUS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_ENCHANTED_WOODEN_BARREL = ITEMS.register("green_enchanted_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.GREEN_ENCHANTED_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> HOLLY_WOODEN_BARREL = ITEMS.register("holly_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.HOLLY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRONWOOD_WOODEN_BARREL = ITEMS.register("ironwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.IRONWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_JACARANDA_WOODEN_BARREL = ITEMS.register("bwg_jacaranda_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_JACARANDA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAHOGANY_WOODEN_BARREL = ITEMS.register("bwg_mahogany_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_MAHOGANY_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAPLE_WOODEN_BARREL = ITEMS.register("bwg_maple_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_MAPLE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_PALM_WOODEN_BARREL = ITEMS.register("bwg_palm_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_PALM_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_PINE_WOODEN_BARREL = ITEMS.register("bwg_pine_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_PINE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAINBOW_EUCALYPTUS_WOODEN_BARREL = ITEMS.register("rainbow_eucalyptus_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_REDWOOD_WOODEN_BARREL = ITEMS.register("bwg_redwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_REDWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAKURA_WOODEN_BARREL = ITEMS.register("sakura_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SAKURA_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYRIS_WOODEN_BARREL = ITEMS.register("skyris_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SKYRIS_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WHITE_MANGROVE_WOODEN_BARREL = ITEMS.register("white_mangrove_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.WHITE_MANGROVE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_WILLOW_WOODEN_BARREL = ITEMS.register("bwg_willow_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BWG_WILLOW_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WITCH_HAZEL_WOODEN_BARREL = ITEMS.register("witch_hazel_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.WITCH_HAZEL_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZELKOVA_WOODEN_BARREL = ITEMS.register("zelkova_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.ZELKOVA_WOODEN_BARREL.get(), new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_SHEARS = ITEMS.register("wooden_shears",
        () -> new ShearsItem(new Item.Properties().durability(64)));
    public static final RegistryObject<Item> WOODEN_WRENCH = ITEMS.register("wooden_wrench",
        () -> new Item(new Item.Properties().durability(128)));
    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
        () -> new Item(new Item.Properties().durability(96)));

    public static final RegistryObject<Item> SAWDUST = ITEMS.register("sawdust",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OAK_ROD = ITEMS.register("oak_rod",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ACACIA_ROD = ITEMS.register("acacia_rod",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BIRCH_ROD = ITEMS.register("birch_rod",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DARK_OAK_ROD = ITEMS.register("dark_oak_rod",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JUNGLE_ROD = ITEMS.register("jungle_rod",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPRUCE_ROD = ITEMS.register("spruce_rod",
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

    // ── African Blackwood ──────────────────────────────────
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_LOG = ITEMS.register("african_blackwood_log",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_AFRICAN_BLACKWOOD_LOG = ITEMS.register("stripped_african_blackwood_log",
        () -> new BlockItem(ModBlocks.STRIPPED_AFRICAN_BLACKWOOD_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_WOOD = ITEMS.register("african_blackwood_wood",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_AFRICAN_BLACKWOOD_WOOD = ITEMS.register("stripped_african_blackwood_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_AFRICAN_BLACKWOOD_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_PLANKS = ITEMS.register("african_blackwood_planks",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_LEAVES = ITEMS.register("african_blackwood_leaves",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_SAPLING = ITEMS.register("african_blackwood_sapling",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_SLAB = ITEMS.register("african_blackwood_slab",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_STAIRS = ITEMS.register("african_blackwood_stairs",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_FENCE = ITEMS.register("african_blackwood_fence",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_FENCE_GATE = ITEMS.register("african_blackwood_fence_gate",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_PRESSURE_PLATE = ITEMS.register("african_blackwood_pressure_plate",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_BUTTON = ITEMS.register("african_blackwood_button",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_DOOR = ITEMS.register("african_blackwood_door",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_TRAPDOOR = ITEMS.register("african_blackwood_trapdoor",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_SIGN = ITEMS.register("african_blackwood_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.AFRICAN_BLACKWOOD_SIGN.get(), ModBlocks.AFRICAN_BLACKWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_HANGING_SIGN = ITEMS.register("african_blackwood_hanging_sign",
        () -> new HangingSignItem(ModBlocks.AFRICAN_BLACKWOOD_HANGING_SIGN.get(), ModBlocks.AFRICAN_BLACKWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE = ITEMS.register("african_blackwood_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("african_blackwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_WOODEN_CAULDRON = ITEMS.register("african_blackwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_WOODEN_HOPPER = ITEMS.register("african_blackwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_WOODEN_BARREL = ITEMS.register("african_blackwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_BOAT = ITEMS.register("african_blackwood_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_CHEST_BOAT = ITEMS.register("african_blackwood_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_WOODEN_PLATE = ITEMS.register("african_blackwood_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Banyan ──────────────────────────────────
    public static final RegistryObject<Item> BANYAN_LOG = ITEMS.register("banyan_log",
        () -> new BlockItem(ModBlocks.BANYAN_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BANYAN_LOG = ITEMS.register("stripped_banyan_log",
        () -> new BlockItem(ModBlocks.STRIPPED_BANYAN_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_WOOD = ITEMS.register("banyan_wood",
        () -> new BlockItem(ModBlocks.BANYAN_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BANYAN_WOOD = ITEMS.register("stripped_banyan_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_BANYAN_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_PLANKS = ITEMS.register("banyan_planks",
        () -> new BlockItem(ModBlocks.BANYAN_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_LEAVES = ITEMS.register("banyan_leaves",
        () -> new BlockItem(ModBlocks.BANYAN_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_SAPLING = ITEMS.register("banyan_sapling",
        () -> new BlockItem(ModBlocks.BANYAN_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_SLAB = ITEMS.register("banyan_slab",
        () -> new BlockItem(ModBlocks.BANYAN_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_STAIRS = ITEMS.register("banyan_stairs",
        () -> new BlockItem(ModBlocks.BANYAN_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_FENCE = ITEMS.register("banyan_fence",
        () -> new BlockItem(ModBlocks.BANYAN_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_FENCE_GATE = ITEMS.register("banyan_fence_gate",
        () -> new BlockItem(ModBlocks.BANYAN_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_PRESSURE_PLATE = ITEMS.register("banyan_pressure_plate",
        () -> new BlockItem(ModBlocks.BANYAN_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_BUTTON = ITEMS.register("banyan_button",
        () -> new BlockItem(ModBlocks.BANYAN_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_DOOR = ITEMS.register("banyan_door",
        () -> new BlockItem(ModBlocks.BANYAN_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_TRAPDOOR = ITEMS.register("banyan_trapdoor",
        () -> new BlockItem(ModBlocks.BANYAN_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_SIGN = ITEMS.register("banyan_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BANYAN_SIGN.get(), ModBlocks.BANYAN_WALL_SIGN.get()));
    public static final RegistryObject<Item> BANYAN_HANGING_SIGN = ITEMS.register("banyan_hanging_sign",
        () -> new HangingSignItem(ModBlocks.BANYAN_HANGING_SIGN.get(), ModBlocks.BANYAN_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BANYAN_WOODEN_CRAFTING_TABLE = ITEMS.register("banyan_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.BANYAN_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("banyan_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BANYAN_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_WOODEN_CAULDRON = ITEMS.register("banyan_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BANYAN_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_WOODEN_HOPPER = ITEMS.register("banyan_wooden_hopper",
        () -> new BlockItem(ModBlocks.BANYAN_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_WOODEN_BARREL = ITEMS.register("banyan_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BANYAN_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_BOAT = ITEMS.register("banyan_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BANYAN_CHEST_BOAT = ITEMS.register("banyan_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BANYAN_WOODEN_PLATE = ITEMS.register("banyan_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Black Walnut ──────────────────────────────────
    public static final RegistryObject<Item> BLACK_WALNUT_LOG = ITEMS.register("black_walnut_log",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACK_WALNUT_LOG = ITEMS.register("stripped_black_walnut_log",
        () -> new BlockItem(ModBlocks.STRIPPED_BLACK_WALNUT_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_WOOD = ITEMS.register("black_walnut_wood",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLACK_WALNUT_WOOD = ITEMS.register("stripped_black_walnut_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_BLACK_WALNUT_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_PLANKS = ITEMS.register("black_walnut_planks",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_LEAVES = ITEMS.register("black_walnut_leaves",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_SAPLING = ITEMS.register("black_walnut_sapling",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_SLAB = ITEMS.register("black_walnut_slab",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_STAIRS = ITEMS.register("black_walnut_stairs",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_FENCE = ITEMS.register("black_walnut_fence",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_FENCE_GATE = ITEMS.register("black_walnut_fence_gate",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_PRESSURE_PLATE = ITEMS.register("black_walnut_pressure_plate",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_BUTTON = ITEMS.register("black_walnut_button",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_DOOR = ITEMS.register("black_walnut_door",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_TRAPDOOR = ITEMS.register("black_walnut_trapdoor",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_SIGN = ITEMS.register("black_walnut_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BLACK_WALNUT_SIGN.get(), ModBlocks.BLACK_WALNUT_WALL_SIGN.get()));
    public static final RegistryObject<Item> BLACK_WALNUT_HANGING_SIGN = ITEMS.register("black_walnut_hanging_sign",
        () -> new HangingSignItem(ModBlocks.BLACK_WALNUT_HANGING_SIGN.get(), ModBlocks.BLACK_WALNUT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BLACK_WALNUT_WOODEN_CRAFTING_TABLE = ITEMS.register("black_walnut_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("black_walnut_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_WOODEN_CAULDRON = ITEMS.register("black_walnut_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_WOODEN_HOPPER = ITEMS.register("black_walnut_wooden_hopper",
        () -> new BlockItem(ModBlocks.BLACK_WALNUT_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_WOODEN_BARREL = ITEMS.register("black_walnut_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BLACK_WALNUT_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_BOAT = ITEMS.register("black_walnut_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLACK_WALNUT_CHEST_BOAT = ITEMS.register("black_walnut_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLACK_WALNUT_WOODEN_PLATE = ITEMS.register("black_walnut_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Bloodwood ──────────────────────────────────
    public static final RegistryObject<Item> BLOODWOOD_LOG = ITEMS.register("bloodwood_log",
        () -> new BlockItem(ModBlocks.BLOODWOOD_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLOODWOOD_LOG = ITEMS.register("stripped_bloodwood_log",
        () -> new BlockItem(ModBlocks.STRIPPED_BLOODWOOD_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_WOOD = ITEMS.register("bloodwood_wood",
        () -> new BlockItem(ModBlocks.BLOODWOOD_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BLOODWOOD_WOOD = ITEMS.register("stripped_bloodwood_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_BLOODWOOD_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_PLANKS = ITEMS.register("bloodwood_planks",
        () -> new BlockItem(ModBlocks.BLOODWOOD_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_LEAVES = ITEMS.register("bloodwood_leaves",
        () -> new BlockItem(ModBlocks.BLOODWOOD_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_SAPLING = ITEMS.register("bloodwood_sapling",
        () -> new BlockItem(ModBlocks.BLOODWOOD_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_SLAB = ITEMS.register("bloodwood_slab",
        () -> new BlockItem(ModBlocks.BLOODWOOD_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_STAIRS = ITEMS.register("bloodwood_stairs",
        () -> new BlockItem(ModBlocks.BLOODWOOD_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_FENCE = ITEMS.register("bloodwood_fence",
        () -> new BlockItem(ModBlocks.BLOODWOOD_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_FENCE_GATE = ITEMS.register("bloodwood_fence_gate",
        () -> new BlockItem(ModBlocks.BLOODWOOD_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_PRESSURE_PLATE = ITEMS.register("bloodwood_pressure_plate",
        () -> new BlockItem(ModBlocks.BLOODWOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_BUTTON = ITEMS.register("bloodwood_button",
        () -> new BlockItem(ModBlocks.BLOODWOOD_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_DOOR = ITEMS.register("bloodwood_door",
        () -> new BlockItem(ModBlocks.BLOODWOOD_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_TRAPDOOR = ITEMS.register("bloodwood_trapdoor",
        () -> new BlockItem(ModBlocks.BLOODWOOD_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_SIGN = ITEMS.register("bloodwood_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BLOODWOOD_SIGN.get(), ModBlocks.BLOODWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> BLOODWOOD_HANGING_SIGN = ITEMS.register("bloodwood_hanging_sign",
        () -> new HangingSignItem(ModBlocks.BLOODWOOD_HANGING_SIGN.get(), ModBlocks.BLOODWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BLOODWOOD_WOODEN_CRAFTING_TABLE = ITEMS.register("bloodwood_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.BLOODWOOD_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bloodwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BLOODWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_WOODEN_CAULDRON = ITEMS.register("bloodwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BLOODWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_WOODEN_HOPPER = ITEMS.register("bloodwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.BLOODWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_WOODEN_BARREL = ITEMS.register("bloodwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BLOODWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_BOAT = ITEMS.register("bloodwood_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLOODWOOD_CHEST_BOAT = ITEMS.register("bloodwood_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLOODWOOD_WOODEN_PLATE = ITEMS.register("bloodwood_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Bristlecone Pine ──────────────────────────────────
    public static final RegistryObject<Item> BRISTLECONE_PINE_LOG = ITEMS.register("bristlecone_pine_log",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BRISTLECONE_PINE_LOG = ITEMS.register("stripped_bristlecone_pine_log",
        () -> new BlockItem(ModBlocks.STRIPPED_BRISTLECONE_PINE_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_WOOD = ITEMS.register("bristlecone_pine_wood",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_BRISTLECONE_PINE_WOOD = ITEMS.register("stripped_bristlecone_pine_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_BRISTLECONE_PINE_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_PLANKS = ITEMS.register("bristlecone_pine_planks",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_LEAVES = ITEMS.register("bristlecone_pine_leaves",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_SAPLING = ITEMS.register("bristlecone_pine_sapling",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_SLAB = ITEMS.register("bristlecone_pine_slab",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_STAIRS = ITEMS.register("bristlecone_pine_stairs",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_FENCE = ITEMS.register("bristlecone_pine_fence",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_FENCE_GATE = ITEMS.register("bristlecone_pine_fence_gate",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_PRESSURE_PLATE = ITEMS.register("bristlecone_pine_pressure_plate",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_BUTTON = ITEMS.register("bristlecone_pine_button",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_DOOR = ITEMS.register("bristlecone_pine_door",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_TRAPDOOR = ITEMS.register("bristlecone_pine_trapdoor",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_SIGN = ITEMS.register("bristlecone_pine_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.BRISTLECONE_PINE_SIGN.get(), ModBlocks.BRISTLECONE_PINE_WALL_SIGN.get()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_HANGING_SIGN = ITEMS.register("bristlecone_pine_hanging_sign",
        () -> new HangingSignItem(ModBlocks.BRISTLECONE_PINE_HANGING_SIGN.get(), ModBlocks.BRISTLECONE_PINE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE = ITEMS.register("bristlecone_pine_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("bristlecone_pine_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_WOODEN_CAULDRON = ITEMS.register("bristlecone_pine_wooden_cauldron",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_WOODEN_HOPPER = ITEMS.register("bristlecone_pine_wooden_hopper",
        () -> new BlockItem(ModBlocks.BRISTLECONE_PINE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_WOODEN_BARREL = ITEMS.register("bristlecone_pine_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.BRISTLECONE_PINE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_BOAT = ITEMS.register("bristlecone_pine_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BRISTLECONE_PINE_CHEST_BOAT = ITEMS.register("bristlecone_pine_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BRISTLECONE_PINE_WOODEN_PLATE = ITEMS.register("bristlecone_pine_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Cork Oak ──────────────────────────────────
    public static final RegistryObject<Item> CORK_OAK_LOG = ITEMS.register("cork_oak_log",
        () -> new BlockItem(ModBlocks.CORK_OAK_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CORK_OAK_LOG = ITEMS.register("stripped_cork_oak_log",
        () -> new BlockItem(ModBlocks.STRIPPED_CORK_OAK_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_WOOD = ITEMS.register("cork_oak_wood",
        () -> new BlockItem(ModBlocks.CORK_OAK_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_CORK_OAK_WOOD = ITEMS.register("stripped_cork_oak_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_CORK_OAK_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_PLANKS = ITEMS.register("cork_oak_planks",
        () -> new BlockItem(ModBlocks.CORK_OAK_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_LEAVES = ITEMS.register("cork_oak_leaves",
        () -> new BlockItem(ModBlocks.CORK_OAK_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_SAPLING = ITEMS.register("cork_oak_sapling",
        () -> new BlockItem(ModBlocks.CORK_OAK_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_SLAB = ITEMS.register("cork_oak_slab",
        () -> new BlockItem(ModBlocks.CORK_OAK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_STAIRS = ITEMS.register("cork_oak_stairs",
        () -> new BlockItem(ModBlocks.CORK_OAK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_FENCE = ITEMS.register("cork_oak_fence",
        () -> new BlockItem(ModBlocks.CORK_OAK_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_FENCE_GATE = ITEMS.register("cork_oak_fence_gate",
        () -> new BlockItem(ModBlocks.CORK_OAK_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_PRESSURE_PLATE = ITEMS.register("cork_oak_pressure_plate",
        () -> new BlockItem(ModBlocks.CORK_OAK_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_BUTTON = ITEMS.register("cork_oak_button",
        () -> new BlockItem(ModBlocks.CORK_OAK_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_DOOR = ITEMS.register("cork_oak_door",
        () -> new BlockItem(ModBlocks.CORK_OAK_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_TRAPDOOR = ITEMS.register("cork_oak_trapdoor",
        () -> new BlockItem(ModBlocks.CORK_OAK_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_SIGN = ITEMS.register("cork_oak_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CORK_OAK_SIGN.get(), ModBlocks.CORK_OAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> CORK_OAK_HANGING_SIGN = ITEMS.register("cork_oak_hanging_sign",
        () -> new HangingSignItem(ModBlocks.CORK_OAK_HANGING_SIGN.get(), ModBlocks.CORK_OAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> CORK_OAK_WOODEN_CRAFTING_TABLE = ITEMS.register("cork_oak_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.CORK_OAK_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("cork_oak_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.CORK_OAK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_WOODEN_CAULDRON = ITEMS.register("cork_oak_wooden_cauldron",
        () -> new BlockItem(ModBlocks.CORK_OAK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_WOODEN_HOPPER = ITEMS.register("cork_oak_wooden_hopper",
        () -> new BlockItem(ModBlocks.CORK_OAK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_WOODEN_BARREL = ITEMS.register("cork_oak_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.CORK_OAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_BOAT = ITEMS.register("cork_oak_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CORK_OAK_CHEST_BOAT = ITEMS.register("cork_oak_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CORK_OAK_WOODEN_PLATE = ITEMS.register("cork_oak_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Dragon Blood ──────────────────────────────────
    public static final RegistryObject<Item> DRAGON_BLOOD_LOG = ITEMS.register("dragon_blood_log",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DRAGON_BLOOD_LOG = ITEMS.register("stripped_dragon_blood_log",
        () -> new BlockItem(ModBlocks.STRIPPED_DRAGON_BLOOD_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_WOOD = ITEMS.register("dragon_blood_wood",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_DRAGON_BLOOD_WOOD = ITEMS.register("stripped_dragon_blood_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_DRAGON_BLOOD_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_PLANKS = ITEMS.register("dragon_blood_planks",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_LEAVES = ITEMS.register("dragon_blood_leaves",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_SAPLING = ITEMS.register("dragon_blood_sapling",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_SLAB = ITEMS.register("dragon_blood_slab",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_STAIRS = ITEMS.register("dragon_blood_stairs",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_FENCE = ITEMS.register("dragon_blood_fence",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_FENCE_GATE = ITEMS.register("dragon_blood_fence_gate",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_PRESSURE_PLATE = ITEMS.register("dragon_blood_pressure_plate",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_BUTTON = ITEMS.register("dragon_blood_button",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_DOOR = ITEMS.register("dragon_blood_door",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_TRAPDOOR = ITEMS.register("dragon_blood_trapdoor",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_SIGN = ITEMS.register("dragon_blood_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DRAGON_BLOOD_SIGN.get(), ModBlocks.DRAGON_BLOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> DRAGON_BLOOD_HANGING_SIGN = ITEMS.register("dragon_blood_hanging_sign",
        () -> new HangingSignItem(ModBlocks.DRAGON_BLOOD_HANGING_SIGN.get(), ModBlocks.DRAGON_BLOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> DRAGON_BLOOD_WOODEN_CRAFTING_TABLE = ITEMS.register("dragon_blood_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("dragon_blood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_WOODEN_CAULDRON = ITEMS.register("dragon_blood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_WOODEN_HOPPER = ITEMS.register("dragon_blood_wooden_hopper",
        () -> new BlockItem(ModBlocks.DRAGON_BLOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_WOODEN_BARREL = ITEMS.register("dragon_blood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.DRAGON_BLOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_BOAT = ITEMS.register("dragon_blood_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DRAGON_BLOOD_CHEST_BOAT = ITEMS.register("dragon_blood_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DRAGON_BLOOD_WOODEN_PLATE = ITEMS.register("dragon_blood_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Kapok ──────────────────────────────────
    public static final RegistryObject<Item> KAPOK_LOG = ITEMS.register("kapok_log",
        () -> new BlockItem(ModBlocks.KAPOK_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_LOG = ITEMS.register("stripped_kapok_log",
        () -> new BlockItem(ModBlocks.STRIPPED_KAPOK_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_WOOD = ITEMS.register("kapok_wood",
        () -> new BlockItem(ModBlocks.KAPOK_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_KAPOK_WOOD = ITEMS.register("stripped_kapok_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_KAPOK_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_PLANKS = ITEMS.register("kapok_planks",
        () -> new BlockItem(ModBlocks.KAPOK_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_LEAVES = ITEMS.register("kapok_leaves",
        () -> new BlockItem(ModBlocks.KAPOK_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_SAPLING = ITEMS.register("kapok_sapling",
        () -> new BlockItem(ModBlocks.KAPOK_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_SLAB = ITEMS.register("kapok_slab",
        () -> new BlockItem(ModBlocks.KAPOK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_STAIRS = ITEMS.register("kapok_stairs",
        () -> new BlockItem(ModBlocks.KAPOK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_FENCE = ITEMS.register("kapok_fence",
        () -> new BlockItem(ModBlocks.KAPOK_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_FENCE_GATE = ITEMS.register("kapok_fence_gate",
        () -> new BlockItem(ModBlocks.KAPOK_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_PRESSURE_PLATE = ITEMS.register("kapok_pressure_plate",
        () -> new BlockItem(ModBlocks.KAPOK_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_BUTTON = ITEMS.register("kapok_button",
        () -> new BlockItem(ModBlocks.KAPOK_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_DOOR = ITEMS.register("kapok_door",
        () -> new BlockItem(ModBlocks.KAPOK_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_TRAPDOOR = ITEMS.register("kapok_trapdoor",
        () -> new BlockItem(ModBlocks.KAPOK_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_SIGN = ITEMS.register("kapok_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.KAPOK_SIGN.get(), ModBlocks.KAPOK_WALL_SIGN.get()));
    public static final RegistryObject<Item> KAPOK_HANGING_SIGN = ITEMS.register("kapok_hanging_sign",
        () -> new HangingSignItem(ModBlocks.KAPOK_HANGING_SIGN.get(), ModBlocks.KAPOK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> KAPOK_WOODEN_CRAFTING_TABLE = ITEMS.register("kapok_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.KAPOK_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("kapok_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.KAPOK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_WOODEN_CAULDRON = ITEMS.register("kapok_wooden_cauldron",
        () -> new BlockItem(ModBlocks.KAPOK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_WOODEN_HOPPER = ITEMS.register("kapok_wooden_hopper",
        () -> new BlockItem(ModBlocks.KAPOK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_WOODEN_BARREL = ITEMS.register("kapok_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.KAPOK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_BOAT = ITEMS.register("kapok_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> KAPOK_CHEST_BOAT = ITEMS.register("kapok_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> KAPOK_WOODEN_PLATE = ITEMS.register("kapok_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Larch ──────────────────────────────────
    public static final RegistryObject<Item> LARCH_LOG = ITEMS.register("larch_log",
        () -> new BlockItem(ModBlocks.LARCH_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_LARCH_LOG = ITEMS.register("stripped_larch_log",
        () -> new BlockItem(ModBlocks.STRIPPED_LARCH_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_WOOD = ITEMS.register("larch_wood",
        () -> new BlockItem(ModBlocks.LARCH_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_LARCH_WOOD = ITEMS.register("stripped_larch_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_LARCH_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_PLANKS = ITEMS.register("larch_planks",
        () -> new BlockItem(ModBlocks.LARCH_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_LEAVES = ITEMS.register("larch_leaves",
        () -> new BlockItem(ModBlocks.LARCH_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_SAPLING = ITEMS.register("larch_sapling",
        () -> new BlockItem(ModBlocks.LARCH_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_SLAB = ITEMS.register("larch_slab",
        () -> new BlockItem(ModBlocks.LARCH_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_STAIRS = ITEMS.register("larch_stairs",
        () -> new BlockItem(ModBlocks.LARCH_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_FENCE = ITEMS.register("larch_fence",
        () -> new BlockItem(ModBlocks.LARCH_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_FENCE_GATE = ITEMS.register("larch_fence_gate",
        () -> new BlockItem(ModBlocks.LARCH_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_PRESSURE_PLATE = ITEMS.register("larch_pressure_plate",
        () -> new BlockItem(ModBlocks.LARCH_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_BUTTON = ITEMS.register("larch_button",
        () -> new BlockItem(ModBlocks.LARCH_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_DOOR = ITEMS.register("larch_door",
        () -> new BlockItem(ModBlocks.LARCH_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_TRAPDOOR = ITEMS.register("larch_trapdoor",
        () -> new BlockItem(ModBlocks.LARCH_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_SIGN = ITEMS.register("larch_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.LARCH_SIGN.get(), ModBlocks.LARCH_WALL_SIGN.get()));
    public static final RegistryObject<Item> LARCH_HANGING_SIGN = ITEMS.register("larch_hanging_sign",
        () -> new HangingSignItem(ModBlocks.LARCH_HANGING_SIGN.get(), ModBlocks.LARCH_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> LARCH_WOODEN_CRAFTING_TABLE = ITEMS.register("larch_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.LARCH_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("larch_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.LARCH_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_WOODEN_CAULDRON = ITEMS.register("larch_wooden_cauldron",
        () -> new BlockItem(ModBlocks.LARCH_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_WOODEN_HOPPER = ITEMS.register("larch_wooden_hopper",
        () -> new BlockItem(ModBlocks.LARCH_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_WOODEN_BARREL = ITEMS.register("larch_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.LARCH_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_BOAT = ITEMS.register("larch_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LARCH_CHEST_BOAT = ITEMS.register("larch_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LARCH_WOODEN_PLATE = ITEMS.register("larch_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Sandalwood ──────────────────────────────────
    public static final RegistryObject<Item> SANDALWOOD_LOG = ITEMS.register("sandalwood_log",
        () -> new BlockItem(ModBlocks.SANDALWOOD_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SANDALWOOD_LOG = ITEMS.register("stripped_sandalwood_log",
        () -> new BlockItem(ModBlocks.STRIPPED_SANDALWOOD_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_WOOD = ITEMS.register("sandalwood_wood",
        () -> new BlockItem(ModBlocks.SANDALWOOD_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SANDALWOOD_WOOD = ITEMS.register("stripped_sandalwood_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_SANDALWOOD_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_PLANKS = ITEMS.register("sandalwood_planks",
        () -> new BlockItem(ModBlocks.SANDALWOOD_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_LEAVES = ITEMS.register("sandalwood_leaves",
        () -> new BlockItem(ModBlocks.SANDALWOOD_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_SAPLING = ITEMS.register("sandalwood_sapling",
        () -> new BlockItem(ModBlocks.SANDALWOOD_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_SLAB = ITEMS.register("sandalwood_slab",
        () -> new BlockItem(ModBlocks.SANDALWOOD_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_STAIRS = ITEMS.register("sandalwood_stairs",
        () -> new BlockItem(ModBlocks.SANDALWOOD_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_FENCE = ITEMS.register("sandalwood_fence",
        () -> new BlockItem(ModBlocks.SANDALWOOD_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_FENCE_GATE = ITEMS.register("sandalwood_fence_gate",
        () -> new BlockItem(ModBlocks.SANDALWOOD_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_PRESSURE_PLATE = ITEMS.register("sandalwood_pressure_plate",
        () -> new BlockItem(ModBlocks.SANDALWOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_BUTTON = ITEMS.register("sandalwood_button",
        () -> new BlockItem(ModBlocks.SANDALWOOD_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_DOOR = ITEMS.register("sandalwood_door",
        () -> new BlockItem(ModBlocks.SANDALWOOD_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_TRAPDOOR = ITEMS.register("sandalwood_trapdoor",
        () -> new BlockItem(ModBlocks.SANDALWOOD_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_SIGN = ITEMS.register("sandalwood_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.SANDALWOOD_SIGN.get(), ModBlocks.SANDALWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> SANDALWOOD_HANGING_SIGN = ITEMS.register("sandalwood_hanging_sign",
        () -> new HangingSignItem(ModBlocks.SANDALWOOD_HANGING_SIGN.get(), ModBlocks.SANDALWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SANDALWOOD_WOODEN_CRAFTING_TABLE = ITEMS.register("sandalwood_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.SANDALWOOD_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("sandalwood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SANDALWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_WOODEN_CAULDRON = ITEMS.register("sandalwood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SANDALWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_WOODEN_HOPPER = ITEMS.register("sandalwood_wooden_hopper",
        () -> new BlockItem(ModBlocks.SANDALWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_WOODEN_BARREL = ITEMS.register("sandalwood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SANDALWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_BOAT = ITEMS.register("sandalwood_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SANDALWOOD_CHEST_BOAT = ITEMS.register("sandalwood_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SANDALWOOD_WOODEN_PLATE = ITEMS.register("sandalwood_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Sycamore ──────────────────────────────────
    public static final RegistryObject<Item> SYCAMORE_LOG = ITEMS.register("sycamore_log",
        () -> new BlockItem(ModBlocks.SYCAMORE_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_LOG = ITEMS.register("stripped_sycamore_log",
        () -> new BlockItem(ModBlocks.STRIPPED_SYCAMORE_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_WOOD = ITEMS.register("sycamore_wood",
        () -> new BlockItem(ModBlocks.SYCAMORE_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_SYCAMORE_WOOD = ITEMS.register("stripped_sycamore_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_SYCAMORE_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_PLANKS = ITEMS.register("sycamore_planks",
        () -> new BlockItem(ModBlocks.SYCAMORE_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_LEAVES = ITEMS.register("sycamore_leaves",
        () -> new BlockItem(ModBlocks.SYCAMORE_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_SAPLING = ITEMS.register("sycamore_sapling",
        () -> new BlockItem(ModBlocks.SYCAMORE_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_SLAB = ITEMS.register("sycamore_slab",
        () -> new BlockItem(ModBlocks.SYCAMORE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_STAIRS = ITEMS.register("sycamore_stairs",
        () -> new BlockItem(ModBlocks.SYCAMORE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_FENCE = ITEMS.register("sycamore_fence",
        () -> new BlockItem(ModBlocks.SYCAMORE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_FENCE_GATE = ITEMS.register("sycamore_fence_gate",
        () -> new BlockItem(ModBlocks.SYCAMORE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_PRESSURE_PLATE = ITEMS.register("sycamore_pressure_plate",
        () -> new BlockItem(ModBlocks.SYCAMORE_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_BUTTON = ITEMS.register("sycamore_button",
        () -> new BlockItem(ModBlocks.SYCAMORE_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_DOOR = ITEMS.register("sycamore_door",
        () -> new BlockItem(ModBlocks.SYCAMORE_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_TRAPDOOR = ITEMS.register("sycamore_trapdoor",
        () -> new BlockItem(ModBlocks.SYCAMORE_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_SIGN = ITEMS.register("sycamore_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.SYCAMORE_SIGN.get(), ModBlocks.SYCAMORE_WALL_SIGN.get()));
    public static final RegistryObject<Item> SYCAMORE_HANGING_SIGN = ITEMS.register("sycamore_hanging_sign",
        () -> new HangingSignItem(ModBlocks.SYCAMORE_HANGING_SIGN.get(), ModBlocks.SYCAMORE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SYCAMORE_WOODEN_CRAFTING_TABLE = ITEMS.register("sycamore_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.SYCAMORE_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("sycamore_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.SYCAMORE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_WOODEN_CAULDRON = ITEMS.register("sycamore_wooden_cauldron",
        () -> new BlockItem(ModBlocks.SYCAMORE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_WOODEN_HOPPER = ITEMS.register("sycamore_wooden_hopper",
        () -> new BlockItem(ModBlocks.SYCAMORE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_WOODEN_BARREL = ITEMS.register("sycamore_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.SYCAMORE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_BOAT = ITEMS.register("sycamore_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SYCAMORE_CHEST_BOAT = ITEMS.register("sycamore_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SYCAMORE_WOODEN_PLATE = ITEMS.register("sycamore_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Teak ──────────────────────────────────
    public static final RegistryObject<Item> TEAK_LOG = ITEMS.register("teak_log",
        () -> new BlockItem(ModBlocks.TEAK_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_TEAK_LOG = ITEMS.register("stripped_teak_log",
        () -> new BlockItem(ModBlocks.STRIPPED_TEAK_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_WOOD = ITEMS.register("teak_wood",
        () -> new BlockItem(ModBlocks.TEAK_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_TEAK_WOOD = ITEMS.register("stripped_teak_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_TEAK_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_PLANKS = ITEMS.register("teak_planks",
        () -> new BlockItem(ModBlocks.TEAK_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_LEAVES = ITEMS.register("teak_leaves",
        () -> new BlockItem(ModBlocks.TEAK_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_SAPLING = ITEMS.register("teak_sapling",
        () -> new BlockItem(ModBlocks.TEAK_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_SLAB = ITEMS.register("teak_slab",
        () -> new BlockItem(ModBlocks.TEAK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_STAIRS = ITEMS.register("teak_stairs",
        () -> new BlockItem(ModBlocks.TEAK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_FENCE = ITEMS.register("teak_fence",
        () -> new BlockItem(ModBlocks.TEAK_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_FENCE_GATE = ITEMS.register("teak_fence_gate",
        () -> new BlockItem(ModBlocks.TEAK_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_PRESSURE_PLATE = ITEMS.register("teak_pressure_plate",
        () -> new BlockItem(ModBlocks.TEAK_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_BUTTON = ITEMS.register("teak_button",
        () -> new BlockItem(ModBlocks.TEAK_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_DOOR = ITEMS.register("teak_door",
        () -> new BlockItem(ModBlocks.TEAK_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_TRAPDOOR = ITEMS.register("teak_trapdoor",
        () -> new BlockItem(ModBlocks.TEAK_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_SIGN = ITEMS.register("teak_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.TEAK_SIGN.get(), ModBlocks.TEAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> TEAK_HANGING_SIGN = ITEMS.register("teak_hanging_sign",
        () -> new HangingSignItem(ModBlocks.TEAK_HANGING_SIGN.get(), ModBlocks.TEAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> TEAK_WOODEN_CRAFTING_TABLE = ITEMS.register("teak_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.TEAK_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("teak_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.TEAK_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_WOODEN_CAULDRON = ITEMS.register("teak_wooden_cauldron",
        () -> new BlockItem(ModBlocks.TEAK_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_WOODEN_HOPPER = ITEMS.register("teak_wooden_hopper",
        () -> new BlockItem(ModBlocks.TEAK_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_WOODEN_BARREL = ITEMS.register("teak_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.TEAK_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_BOAT = ITEMS.register("teak_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TEAK_CHEST_BOAT = ITEMS.register("teak_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TEAK_WOODEN_PLATE = ITEMS.register("teak_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Wenge ──────────────────────────────────
    public static final RegistryObject<Item> WENGE_LOG = ITEMS.register("wenge_log",
        () -> new BlockItem(ModBlocks.WENGE_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WENGE_LOG = ITEMS.register("stripped_wenge_log",
        () -> new BlockItem(ModBlocks.STRIPPED_WENGE_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_WOOD = ITEMS.register("wenge_wood",
        () -> new BlockItem(ModBlocks.WENGE_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_WENGE_WOOD = ITEMS.register("stripped_wenge_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_WENGE_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_PLANKS = ITEMS.register("wenge_planks",
        () -> new BlockItem(ModBlocks.WENGE_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_LEAVES = ITEMS.register("wenge_leaves",
        () -> new BlockItem(ModBlocks.WENGE_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_SAPLING = ITEMS.register("wenge_sapling",
        () -> new BlockItem(ModBlocks.WENGE_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_SLAB = ITEMS.register("wenge_slab",
        () -> new BlockItem(ModBlocks.WENGE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_STAIRS = ITEMS.register("wenge_stairs",
        () -> new BlockItem(ModBlocks.WENGE_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_FENCE = ITEMS.register("wenge_fence",
        () -> new BlockItem(ModBlocks.WENGE_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_FENCE_GATE = ITEMS.register("wenge_fence_gate",
        () -> new BlockItem(ModBlocks.WENGE_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_PRESSURE_PLATE = ITEMS.register("wenge_pressure_plate",
        () -> new BlockItem(ModBlocks.WENGE_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_BUTTON = ITEMS.register("wenge_button",
        () -> new BlockItem(ModBlocks.WENGE_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_DOOR = ITEMS.register("wenge_door",
        () -> new BlockItem(ModBlocks.WENGE_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_TRAPDOOR = ITEMS.register("wenge_trapdoor",
        () -> new BlockItem(ModBlocks.WENGE_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_SIGN = ITEMS.register("wenge_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WENGE_SIGN.get(), ModBlocks.WENGE_WALL_SIGN.get()));
    public static final RegistryObject<Item> WENGE_HANGING_SIGN = ITEMS.register("wenge_hanging_sign",
        () -> new HangingSignItem(ModBlocks.WENGE_HANGING_SIGN.get(), ModBlocks.WENGE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> WENGE_WOODEN_CRAFTING_TABLE = ITEMS.register("wenge_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.WENGE_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("wenge_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.WENGE_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_WOODEN_CAULDRON = ITEMS.register("wenge_wooden_cauldron",
        () -> new BlockItem(ModBlocks.WENGE_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_WOODEN_HOPPER = ITEMS.register("wenge_wooden_hopper",
        () -> new BlockItem(ModBlocks.WENGE_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_WOODEN_BARREL = ITEMS.register("wenge_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.WENGE_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_BOAT = ITEMS.register("wenge_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WENGE_CHEST_BOAT = ITEMS.register("wenge_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WENGE_WOODEN_PLATE = ITEMS.register("wenge_wooden_plate",
        () -> new Item(new Item.Properties()));

    // ── Zebrawood ──────────────────────────────────
    public static final RegistryObject<Item> ZEBRAWOOD_LOG = ITEMS.register("zebrawood_log",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ZEBRAWOOD_LOG = ITEMS.register("stripped_zebrawood_log",
        () -> new BlockItem(ModBlocks.STRIPPED_ZEBRAWOOD_LOG.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_WOOD = ITEMS.register("zebrawood_wood",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRIPPED_ZEBRAWOOD_WOOD = ITEMS.register("stripped_zebrawood_wood",
        () -> new BlockItem(ModBlocks.STRIPPED_ZEBRAWOOD_WOOD.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_PLANKS = ITEMS.register("zebrawood_planks",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_PLANKS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_LEAVES = ITEMS.register("zebrawood_leaves",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_LEAVES.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_SAPLING = ITEMS.register("zebrawood_sapling",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_SAPLING.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_SLAB = ITEMS.register("zebrawood_slab",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_STAIRS = ITEMS.register("zebrawood_stairs",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_FENCE = ITEMS.register("zebrawood_fence",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_FENCE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_FENCE_GATE = ITEMS.register("zebrawood_fence_gate",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_FENCE_GATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_PRESSURE_PLATE = ITEMS.register("zebrawood_pressure_plate",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_PRESSURE_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_BUTTON = ITEMS.register("zebrawood_button",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_BUTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_DOOR = ITEMS.register("zebrawood_door",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_DOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_TRAPDOOR = ITEMS.register("zebrawood_trapdoor",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_TRAPDOOR.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_SIGN = ITEMS.register("zebrawood_sign",
        () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ZEBRAWOOD_SIGN.get(), ModBlocks.ZEBRAWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> ZEBRAWOOD_HANGING_SIGN = ITEMS.register("zebrawood_hanging_sign",
        () -> new HangingSignItem(ModBlocks.ZEBRAWOOD_HANGING_SIGN.get(), ModBlocks.ZEBRAWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> ZEBRAWOOD_WOODEN_CRAFTING_TABLE = ITEMS.register("zebrawood_wooden_crafting_table",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_WOODEN_CRAFTING_TABLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_WOODEN_CRAFTING_TABLE_SLAB = ITEMS.register("zebrawood_wooden_crafting_table_slab",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_WOODEN_CRAFTING_TABLE_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_WOODEN_CAULDRON = ITEMS.register("zebrawood_wooden_cauldron",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_WOODEN_CAULDRON.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_WOODEN_HOPPER = ITEMS.register("zebrawood_wooden_hopper",
        () -> new BlockItem(ModBlocks.ZEBRAWOOD_WOODEN_HOPPER.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_WOODEN_BARREL = ITEMS.register("zebrawood_wooden_barrel",
        () -> new WoodenBarrelBlockItem(ModBlocks.ZEBRAWOOD_WOODEN_BARREL.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_BOAT = ITEMS.register("zebrawood_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ZEBRAWOOD_CHEST_BOAT = ITEMS.register("zebrawood_chest_boat",
        () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ZEBRAWOOD_WOODEN_PLATE = ITEMS.register("zebrawood_wooden_plate",
        () -> new Item(new Item.Properties()));

        // ── Wooden Chest Items (Forge) ──────────────────────────────────────────
    public static final RegistryObject<Item> WOODEN_CHEST = ITEMS.register("wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_WOODEN_CHEST = ITEMS.register("oak_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.OAK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_WOODEN_CHEST = ITEMS.register("spruce_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SPRUCE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_WOODEN_CHEST = ITEMS.register("birch_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BIRCH_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_WOODEN_CHEST = ITEMS.register("jungle_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.JUNGLE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_WOODEN_CHEST = ITEMS.register("acacia_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.ACACIA_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_WOODEN_CHEST = ITEMS.register("dark_oak_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.DARK_OAK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_WOODEN_CHEST = ITEMS.register("mangrove_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.MANGROVE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_WOODEN_CHEST = ITEMS.register("cherry_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CHERRY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAMBOO_WOODEN_CHEST = ITEMS.register("bamboo_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BAMBOO_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_WOODEN_CHEST = ITEMS.register("crimson_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CRIMSON_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> WARPED_WOODEN_CHEST = ITEMS.register("warped_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.WARPED_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_OAK_WOODEN_CHEST = ITEMS.register("twilight_oak_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.TWILIGHT_OAK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> CANOPY_WOODEN_CHEST = ITEMS.register("canopy_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CANOPY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHT_MANGROVE_WOODEN_CHEST = ITEMS.register("twilight_mangrove_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.TWILIGHT_MANGROVE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> DARK_WOODEN_CHEST = ITEMS.register("dark_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.DARK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> TIME_WOODEN_CHEST = ITEMS.register("time_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.TIME_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> TRANSFORMATION_WOODEN_CHEST = ITEMS.register("transformation_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.TRANSFORMATION_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> MINING_WOODEN_CHEST = ITEMS.register("mining_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.MINING_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> SORTING_WOODEN_CHEST = ITEMS.register("sorting_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SORTING_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> TOWERWOOD_WOODEN_CHEST = ITEMS.register("towerwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.TOWERWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> FIR_WOODEN_CHEST = ITEMS.register("fir_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.FIR_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> PINE_WOODEN_CHEST = ITEMS.register("pine_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.PINE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAPLE_WOODEN_CHEST = ITEMS.register("maple_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.MAPLE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> REDWOOD_WOODEN_CHEST = ITEMS.register("redwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.REDWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAHOGANY_WOODEN_CHEST = ITEMS.register("mahogany_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.MAHOGANY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> JACARANDA_WOODEN_CHEST = ITEMS.register("jacaranda_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.JACARANDA_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> PALM_WOODEN_CHEST = ITEMS.register("palm_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.PALM_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> WILLOW_WOODEN_CHEST = ITEMS.register("willow_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.WILLOW_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEAD_WOODEN_CHEST = ITEMS.register("dead_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.DEAD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> MAGIC_WOODEN_CHEST = ITEMS.register("magic_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.MAGIC_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> UMBRAN_WOODEN_CHEST = ITEMS.register("umbran_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.UMBRAN_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> HELLBARK_WOODEN_CHEST = ITEMS.register("hellbark_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.HELLBARK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> EMPYREAL_WOODEN_CHEST = ITEMS.register("empyreal_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.EMPYREAL_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> ROSEROOT_WOODEN_CHEST = ITEMS.register("roseroot_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.ROSEROOT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> YAGROOT_WOODEN_CHEST = ITEMS.register("yagroot_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.YAGROOT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> CRUDEROOT_WOODEN_CHEST = ITEMS.register("cruderoot_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CRUDEROOT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> CONBERRY_WOODEN_CHEST = ITEMS.register("conberry_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CONBERRY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> SUNROOT_WOODEN_CHEST = ITEMS.register("sunroot_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SUNROOT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYROOT_WOODEN_CHEST = ITEMS.register("skyroot_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SKYROOT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPEN_WOODEN_CHEST = ITEMS.register("aspen_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.ASPEN_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BAOBAB_WOODEN_CHEST = ITEMS.register("baobab_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BAOBAB_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ENCHANTED_WOODEN_CHEST = ITEMS.register("blue_enchanted_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BLUE_ENCHANTED_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> CIKA_WOODEN_CHEST = ITEMS.register("cika_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CIKA_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> CYPRESS_WOODEN_CHEST = ITEMS.register("cypress_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CYPRESS_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> EBONY_WOODEN_CHEST = ITEMS.register("ebony_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.EBONY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_FIR_WOODEN_CHEST = ITEMS.register("bwg_fir_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_FIR_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLORUS_WOODEN_CHEST = ITEMS.register("florus_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.FLORUS_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> GREEN_ENCHANTED_WOODEN_CHEST = ITEMS.register("green_enchanted_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.GREEN_ENCHANTED_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> HOLLY_WOODEN_CHEST = ITEMS.register("holly_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.HOLLY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> IRONWOOD_WOODEN_CHEST = ITEMS.register("ironwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.IRONWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_JACARANDA_WOODEN_CHEST = ITEMS.register("bwg_jacaranda_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_JACARANDA_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAHOGANY_WOODEN_CHEST = ITEMS.register("bwg_mahogany_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_MAHOGANY_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_MAPLE_WOODEN_CHEST = ITEMS.register("bwg_maple_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_MAPLE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_PALM_WOODEN_CHEST = ITEMS.register("bwg_palm_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_PALM_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_PINE_WOODEN_CHEST = ITEMS.register("bwg_pine_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_PINE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAINBOW_EUCALYPTUS_WOODEN_CHEST = ITEMS.register("rainbow_eucalyptus_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_REDWOOD_WOODEN_CHEST = ITEMS.register("bwg_redwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_REDWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> SAKURA_WOODEN_CHEST = ITEMS.register("sakura_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SAKURA_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> SKYRIS_WOODEN_CHEST = ITEMS.register("skyris_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SKYRIS_WOODEN_CHEST.get(), new Item.Properties()));
    //? if neoforge {
    /*public static final RegistryObject<Item> SPIRIT_WOODEN_CHEST = ITEMS.register("spirit_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SPIRIT_WOODEN_CHEST.get(), new Item.Properties()));
    *///?}
    public static final RegistryObject<Item> WHITE_MANGROVE_WOODEN_CHEST = ITEMS.register("white_mangrove_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.WHITE_MANGROVE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BWG_WILLOW_WOODEN_CHEST = ITEMS.register("bwg_willow_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BWG_WILLOW_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> WITCH_HAZEL_WOODEN_CHEST = ITEMS.register("witch_hazel_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.WITCH_HAZEL_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZELKOVA_WOODEN_CHEST = ITEMS.register("zelkova_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.ZELKOVA_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> AFRICAN_BLACKWOOD_WOODEN_CHEST = ITEMS.register("african_blackwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.AFRICAN_BLACKWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BANYAN_WOODEN_CHEST = ITEMS.register("banyan_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BANYAN_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLACK_WALNUT_WOODEN_CHEST = ITEMS.register("black_walnut_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BLACK_WALNUT_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BLOODWOOD_WOODEN_CHEST = ITEMS.register("bloodwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BLOODWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> BRISTLECONE_PINE_WOODEN_CHEST = ITEMS.register("bristlecone_pine_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.BRISTLECONE_PINE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> CORK_OAK_WOODEN_CHEST = ITEMS.register("cork_oak_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.CORK_OAK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> DRAGON_BLOOD_WOODEN_CHEST = ITEMS.register("dragon_blood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.DRAGON_BLOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> KAPOK_WOODEN_CHEST = ITEMS.register("kapok_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.KAPOK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> LARCH_WOODEN_CHEST = ITEMS.register("larch_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.LARCH_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> SANDALWOOD_WOODEN_CHEST = ITEMS.register("sandalwood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SANDALWOOD_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> SYCAMORE_WOODEN_CHEST = ITEMS.register("sycamore_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.SYCAMORE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> TEAK_WOODEN_CHEST = ITEMS.register("teak_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.TEAK_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> WENGE_WOODEN_CHEST = ITEMS.register("wenge_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.WENGE_WOODEN_CHEST.get(), new Item.Properties()));
    public static final RegistryObject<Item> ZEBRAWOOD_WOODEN_CHEST = ITEMS.register("zebrawood_wooden_chest",
        () -> new WoodenChestBlockItem(ModBlocks.ZEBRAWOOD_WOODEN_CHEST.get(), new Item.Properties()));

    // ── Grouped item lists (for addCreative() and ModCreativeTabs) ──────────────────
    public static final List<RegistryObject<Item>> ALL_PLATES = List.of(
        OAK_WOODEN_PLATE, SPRUCE_WOODEN_PLATE, BIRCH_WOODEN_PLATE, JUNGLE_WOODEN_PLATE,
        ACACIA_WOODEN_PLATE, DARK_OAK_WOODEN_PLATE, MANGROVE_WOODEN_PLATE, CHERRY_WOODEN_PLATE,
        BAMBOO_WOODEN_PLATE, CRIMSON_WOODEN_PLATE, WARPED_WOODEN_PLATE,
        TWILIGHT_OAK_WOODEN_PLATE, CANOPY_WOODEN_PLATE, TWILIGHT_MANGROVE_WOODEN_PLATE,
        DARK_WOODEN_PLATE, TIME_WOODEN_PLATE, TRANSFORMATION_WOODEN_PLATE, MINING_WOODEN_PLATE,
        SORTING_WOODEN_PLATE, TOWERWOOD_WOODEN_PLATE,
        FIR_WOODEN_PLATE, PINE_WOODEN_PLATE, MAPLE_WOODEN_PLATE, REDWOOD_WOODEN_PLATE,
        MAHOGANY_WOODEN_PLATE, JACARANDA_WOODEN_PLATE, PALM_WOODEN_PLATE, WILLOW_WOODEN_PLATE,
        DEAD_WOODEN_PLATE, MAGIC_WOODEN_PLATE, UMBRAN_WOODEN_PLATE, HELLBARK_WOODEN_PLATE,
        EMPYREAL_WOODEN_PLATE, ROSEROOT_WOODEN_PLATE, YAGROOT_WOODEN_PLATE, CRUDEROOT_WOODEN_PLATE,
        CONBERRY_WOODEN_PLATE, SUNROOT_WOODEN_PLATE, SKYROOT_WOODEN_PLATE,
        ASPEN_WOODEN_PLATE, BAOBAB_WOODEN_PLATE, BLUE_ENCHANTED_WOODEN_PLATE, CIKA_WOODEN_PLATE,
        CYPRESS_WOODEN_PLATE, EBONY_WOODEN_PLATE, BWG_FIR_WOODEN_PLATE, FLORUS_WOODEN_PLATE,
        GREEN_ENCHANTED_WOODEN_PLATE, HOLLY_WOODEN_PLATE, IRONWOOD_WOODEN_PLATE,
        BWG_JACARANDA_WOODEN_PLATE, BWG_MAHOGANY_WOODEN_PLATE, BWG_MAPLE_WOODEN_PLATE,
        BWG_PALM_WOODEN_PLATE, BWG_PINE_WOODEN_PLATE, RAINBOW_EUCALYPTUS_WOODEN_PLATE,
        BWG_REDWOOD_WOODEN_PLATE, SAKURA_WOODEN_PLATE, SKYRIS_WOODEN_PLATE,
        WHITE_MANGROVE_WOODEN_PLATE, BWG_WILLOW_WOODEN_PLATE, WITCH_HAZEL_WOODEN_PLATE,
        ZELKOVA_WOODEN_PLATE,
        AFRICAN_BLACKWOOD_WOODEN_PLATE, BANYAN_WOODEN_PLATE, BLACK_WALNUT_WOODEN_PLATE,
        BLOODWOOD_WOODEN_PLATE, BRISTLECONE_PINE_WOODEN_PLATE, CORK_OAK_WOODEN_PLATE,
        DRAGON_BLOOD_WOODEN_PLATE, KAPOK_WOODEN_PLATE, LARCH_WOODEN_PLATE, SANDALWOOD_WOODEN_PLATE,
        SYCAMORE_WOODEN_PLATE, TEAK_WOODEN_PLATE, WENGE_WOODEN_PLATE, ZEBRAWOOD_WOODEN_PLATE
    );
    public static final List<RegistryObject<Item>> ALL_CAULDRONS = List.of(
        OAK_WOODEN_CAULDRON, SPRUCE_WOODEN_CAULDRON, BIRCH_WOODEN_CAULDRON, JUNGLE_WOODEN_CAULDRON,
        ACACIA_WOODEN_CAULDRON, DARK_OAK_WOODEN_CAULDRON, MANGROVE_WOODEN_CAULDRON, CHERRY_WOODEN_CAULDRON,
        BAMBOO_WOODEN_CAULDRON, CRIMSON_WOODEN_CAULDRON, WARPED_WOODEN_CAULDRON,
        TWILIGHT_OAK_WOODEN_CAULDRON, CANOPY_WOODEN_CAULDRON, TWILIGHT_MANGROVE_WOODEN_CAULDRON,
        DARK_WOODEN_CAULDRON, TIME_WOODEN_CAULDRON, MINING_WOODEN_CAULDRON,
        SORTING_WOODEN_CAULDRON, TOWERWOOD_WOODEN_CAULDRON,
        FIR_WOODEN_CAULDRON, PINE_WOODEN_CAULDRON, MAPLE_WOODEN_CAULDRON, REDWOOD_WOODEN_CAULDRON,
        MAHOGANY_WOODEN_CAULDRON, JACARANDA_WOODEN_CAULDRON, PALM_WOODEN_CAULDRON, WILLOW_WOODEN_CAULDRON,
        DEAD_WOODEN_CAULDRON, MAGIC_WOODEN_CAULDRON, UMBRAN_WOODEN_CAULDRON, HELLBARK_WOODEN_CAULDRON,
        EMPYREAL_WOODEN_CAULDRON, ROSEROOT_WOODEN_CAULDRON, YAGROOT_WOODEN_CAULDRON, CRUDEROOT_WOODEN_CAULDRON,
        CONBERRY_WOODEN_CAULDRON, SUNROOT_WOODEN_CAULDRON, SKYROOT_WOODEN_CAULDRON,
        ASPEN_WOODEN_CAULDRON, BAOBAB_WOODEN_CAULDRON, BLUE_ENCHANTED_WOODEN_CAULDRON, CIKA_WOODEN_CAULDRON,
        CYPRESS_WOODEN_CAULDRON, EBONY_WOODEN_CAULDRON, BWG_FIR_WOODEN_CAULDRON, FLORUS_WOODEN_CAULDRON,
        GREEN_ENCHANTED_WOODEN_CAULDRON, HOLLY_WOODEN_CAULDRON, IRONWOOD_WOODEN_CAULDRON,
        BWG_JACARANDA_WOODEN_CAULDRON, BWG_MAHOGANY_WOODEN_CAULDRON, BWG_MAPLE_WOODEN_CAULDRON,
        BWG_PALM_WOODEN_CAULDRON, BWG_PINE_WOODEN_CAULDRON, RAINBOW_EUCALYPTUS_WOODEN_CAULDRON,
        BWG_REDWOOD_WOODEN_CAULDRON, SAKURA_WOODEN_CAULDRON, SKYRIS_WOODEN_CAULDRON,
        WHITE_MANGROVE_WOODEN_CAULDRON, BWG_WILLOW_WOODEN_CAULDRON, WITCH_HAZEL_WOODEN_CAULDRON,
        ZELKOVA_WOODEN_CAULDRON,
        AFRICAN_BLACKWOOD_WOODEN_CAULDRON, BANYAN_WOODEN_CAULDRON, BLACK_WALNUT_WOODEN_CAULDRON,
        BLOODWOOD_WOODEN_CAULDRON, BRISTLECONE_PINE_WOODEN_CAULDRON, CORK_OAK_WOODEN_CAULDRON,
        DRAGON_BLOOD_WOODEN_CAULDRON, KAPOK_WOODEN_CAULDRON, LARCH_WOODEN_CAULDRON, SANDALWOOD_WOODEN_CAULDRON,
        SYCAMORE_WOODEN_CAULDRON, TEAK_WOODEN_CAULDRON, WENGE_WOODEN_CAULDRON, ZEBRAWOOD_WOODEN_CAULDRON
    );
    public static final List<RegistryObject<Item>> ALL_BARRELS = List.of(
        WOODEN_BARREL, OAK_WOODEN_BARREL, SPRUCE_WOODEN_BARREL, BIRCH_WOODEN_BARREL, JUNGLE_WOODEN_BARREL,
        ACACIA_WOODEN_BARREL, DARK_OAK_WOODEN_BARREL, MANGROVE_WOODEN_BARREL, CHERRY_WOODEN_BARREL,
        BAMBOO_WOODEN_BARREL, CRIMSON_WOODEN_BARREL, WARPED_WOODEN_BARREL,
        TWILIGHT_OAK_WOODEN_BARREL, CANOPY_WOODEN_BARREL, TWILIGHT_MANGROVE_WOODEN_BARREL,
        DARK_WOODEN_BARREL, TIME_WOODEN_BARREL, TRANSFORMATION_WOODEN_BARREL, MINING_WOODEN_BARREL,
        SORTING_WOODEN_BARREL, TOWERWOOD_WOODEN_BARREL,
        FIR_WOODEN_BARREL, PINE_WOODEN_BARREL, MAPLE_WOODEN_BARREL, REDWOOD_WOODEN_BARREL,
        MAHOGANY_WOODEN_BARREL, JACARANDA_WOODEN_BARREL, PALM_WOODEN_BARREL, WILLOW_WOODEN_BARREL,
        DEAD_WOODEN_BARREL, MAGIC_WOODEN_BARREL, UMBRAN_WOODEN_BARREL, HELLBARK_WOODEN_BARREL,
        EMPYREAL_WOODEN_BARREL, ROSEROOT_WOODEN_BARREL, YAGROOT_WOODEN_BARREL, CRUDEROOT_WOODEN_BARREL,
        CONBERRY_WOODEN_BARREL, SUNROOT_WOODEN_BARREL, SKYROOT_WOODEN_BARREL,
        ASPEN_WOODEN_BARREL, BAOBAB_WOODEN_BARREL, BLUE_ENCHANTED_WOODEN_BARREL, CIKA_WOODEN_BARREL,
        CYPRESS_WOODEN_BARREL, EBONY_WOODEN_BARREL, BWG_FIR_WOODEN_BARREL, FLORUS_WOODEN_BARREL,
        GREEN_ENCHANTED_WOODEN_BARREL, HOLLY_WOODEN_BARREL, IRONWOOD_WOODEN_BARREL,
        BWG_JACARANDA_WOODEN_BARREL, BWG_MAHOGANY_WOODEN_BARREL, BWG_MAPLE_WOODEN_BARREL,
        BWG_PALM_WOODEN_BARREL, BWG_PINE_WOODEN_BARREL, RAINBOW_EUCALYPTUS_WOODEN_BARREL,
        BWG_REDWOOD_WOODEN_BARREL, SAKURA_WOODEN_BARREL, SKYRIS_WOODEN_BARREL,
        WHITE_MANGROVE_WOODEN_BARREL, BWG_WILLOW_WOODEN_BARREL, WITCH_HAZEL_WOODEN_BARREL,
        ZELKOVA_WOODEN_BARREL,
        AFRICAN_BLACKWOOD_WOODEN_BARREL, BANYAN_WOODEN_BARREL, BLACK_WALNUT_WOODEN_BARREL,
        BLOODWOOD_WOODEN_BARREL, BRISTLECONE_PINE_WOODEN_BARREL, CORK_OAK_WOODEN_BARREL,
        DRAGON_BLOOD_WOODEN_BARREL, KAPOK_WOODEN_BARREL, LARCH_WOODEN_BARREL, SANDALWOOD_WOODEN_BARREL,
        SYCAMORE_WOODEN_BARREL, TEAK_WOODEN_BARREL, WENGE_WOODEN_BARREL, ZEBRAWOOD_WOODEN_BARREL
    );
    public static final List<RegistryObject<Item>> ALL_HOPPERS = List.of(
        OAK_WOODEN_HOPPER, SPRUCE_WOODEN_HOPPER, BIRCH_WOODEN_HOPPER, JUNGLE_WOODEN_HOPPER,
        ACACIA_WOODEN_HOPPER, DARK_OAK_WOODEN_HOPPER, MANGROVE_WOODEN_HOPPER, CHERRY_WOODEN_HOPPER,
        BAMBOO_WOODEN_HOPPER, CRIMSON_WOODEN_HOPPER, WARPED_WOODEN_HOPPER,
        TWILIGHT_OAK_WOODEN_HOPPER, CANOPY_WOODEN_HOPPER, TWILIGHT_MANGROVE_WOODEN_HOPPER,
        DARK_WOODEN_HOPPER, TIME_WOODEN_HOPPER, MINING_WOODEN_HOPPER,
        SORTING_WOODEN_HOPPER, TOWERWOOD_WOODEN_HOPPER,
        FIR_WOODEN_HOPPER, PINE_WOODEN_HOPPER, MAPLE_WOODEN_HOPPER, REDWOOD_WOODEN_HOPPER,
        MAHOGANY_WOODEN_HOPPER, JACARANDA_WOODEN_HOPPER, PALM_WOODEN_HOPPER, WILLOW_WOODEN_HOPPER,
        DEAD_WOODEN_HOPPER, MAGIC_WOODEN_HOPPER, UMBRAN_WOODEN_HOPPER, HELLBARK_WOODEN_HOPPER,
        EMPYREAL_WOODEN_HOPPER, ROSEROOT_WOODEN_HOPPER, YAGROOT_WOODEN_HOPPER, CRUDEROOT_WOODEN_HOPPER,
        CONBERRY_WOODEN_HOPPER, SUNROOT_WOODEN_HOPPER, SKYROOT_WOODEN_HOPPER,
        ASPEN_WOODEN_HOPPER, BAOBAB_WOODEN_HOPPER, BLUE_ENCHANTED_WOODEN_HOPPER, CIKA_WOODEN_HOPPER,
        CYPRESS_WOODEN_HOPPER, EBONY_WOODEN_HOPPER, BWG_FIR_WOODEN_HOPPER, FLORUS_WOODEN_HOPPER,
        GREEN_ENCHANTED_WOODEN_HOPPER, HOLLY_WOODEN_HOPPER, IRONWOOD_WOODEN_HOPPER,
        BWG_JACARANDA_WOODEN_HOPPER, BWG_MAHOGANY_WOODEN_HOPPER, BWG_MAPLE_WOODEN_HOPPER,
        BWG_PALM_WOODEN_HOPPER, BWG_PINE_WOODEN_HOPPER, RAINBOW_EUCALYPTUS_WOODEN_HOPPER,
        BWG_REDWOOD_WOODEN_HOPPER, SAKURA_WOODEN_HOPPER, SKYRIS_WOODEN_HOPPER,
        WHITE_MANGROVE_WOODEN_HOPPER, BWG_WILLOW_WOODEN_HOPPER, WITCH_HAZEL_WOODEN_HOPPER,
        ZELKOVA_WOODEN_HOPPER,
        AFRICAN_BLACKWOOD_WOODEN_HOPPER, BANYAN_WOODEN_HOPPER, BLACK_WALNUT_WOODEN_HOPPER,
        BLOODWOOD_WOODEN_HOPPER, BRISTLECONE_PINE_WOODEN_HOPPER, CORK_OAK_WOODEN_HOPPER,
        DRAGON_BLOOD_WOODEN_HOPPER, KAPOK_WOODEN_HOPPER, LARCH_WOODEN_HOPPER, SANDALWOOD_WOODEN_HOPPER,
        SYCAMORE_WOODEN_HOPPER, TEAK_WOODEN_HOPPER, WENGE_WOODEN_HOPPER, ZEBRAWOOD_WOODEN_HOPPER
    );
    public static final List<RegistryObject<Item>> ALL_CHESTS = List.of(
        WOODEN_CHEST, OAK_WOODEN_CHEST, SPRUCE_WOODEN_CHEST, BIRCH_WOODEN_CHEST, JUNGLE_WOODEN_CHEST,
        ACACIA_WOODEN_CHEST, DARK_OAK_WOODEN_CHEST, MANGROVE_WOODEN_CHEST, CHERRY_WOODEN_CHEST,
        BAMBOO_WOODEN_CHEST, CRIMSON_WOODEN_CHEST, WARPED_WOODEN_CHEST,
        TWILIGHT_OAK_WOODEN_CHEST, CANOPY_WOODEN_CHEST, TWILIGHT_MANGROVE_WOODEN_CHEST,
        DARK_WOODEN_CHEST, TIME_WOODEN_CHEST, TRANSFORMATION_WOODEN_CHEST, MINING_WOODEN_CHEST,
        SORTING_WOODEN_CHEST, TOWERWOOD_WOODEN_CHEST,
        FIR_WOODEN_CHEST, PINE_WOODEN_CHEST, MAPLE_WOODEN_CHEST, REDWOOD_WOODEN_CHEST,
        MAHOGANY_WOODEN_CHEST, JACARANDA_WOODEN_CHEST, PALM_WOODEN_CHEST, WILLOW_WOODEN_CHEST,
        DEAD_WOODEN_CHEST, MAGIC_WOODEN_CHEST, UMBRAN_WOODEN_CHEST, HELLBARK_WOODEN_CHEST,
        EMPYREAL_WOODEN_CHEST, ROSEROOT_WOODEN_CHEST, YAGROOT_WOODEN_CHEST, CRUDEROOT_WOODEN_CHEST,
        CONBERRY_WOODEN_CHEST, SUNROOT_WOODEN_CHEST, SKYROOT_WOODEN_CHEST,
        ASPEN_WOODEN_CHEST, BAOBAB_WOODEN_CHEST, BLUE_ENCHANTED_WOODEN_CHEST, CIKA_WOODEN_CHEST,
        CYPRESS_WOODEN_CHEST, EBONY_WOODEN_CHEST, BWG_FIR_WOODEN_CHEST, FLORUS_WOODEN_CHEST,
        GREEN_ENCHANTED_WOODEN_CHEST, HOLLY_WOODEN_CHEST, IRONWOOD_WOODEN_CHEST,
        BWG_JACARANDA_WOODEN_CHEST, BWG_MAHOGANY_WOODEN_CHEST, BWG_MAPLE_WOODEN_CHEST,
        BWG_PALM_WOODEN_CHEST, BWG_PINE_WOODEN_CHEST, RAINBOW_EUCALYPTUS_WOODEN_CHEST,
        BWG_REDWOOD_WOODEN_CHEST, SAKURA_WOODEN_CHEST, SKYRIS_WOODEN_CHEST,
        WHITE_MANGROVE_WOODEN_CHEST, BWG_WILLOW_WOODEN_CHEST, WITCH_HAZEL_WOODEN_CHEST,
        ZELKOVA_WOODEN_CHEST,
        AFRICAN_BLACKWOOD_WOODEN_CHEST, BANYAN_WOODEN_CHEST, BLACK_WALNUT_WOODEN_CHEST,
        BLOODWOOD_WOODEN_CHEST, BRISTLECONE_PINE_WOODEN_CHEST, CORK_OAK_WOODEN_CHEST,
        DRAGON_BLOOD_WOODEN_CHEST, KAPOK_WOODEN_CHEST, LARCH_WOODEN_CHEST, SANDALWOOD_WOODEN_CHEST,
        SYCAMORE_WOODEN_CHEST, TEAK_WOODEN_CHEST, WENGE_WOODEN_CHEST, ZEBRAWOOD_WOODEN_CHEST
    );
    public static final List<RegistryObject<Item>> ALL_CRAFTING_SLABS = List.of(
        WOODEN_CRAFTING_TABLE_SLAB, OAK_WOODEN_CRAFTING_TABLE_SLAB, SPRUCE_WOODEN_CRAFTING_TABLE_SLAB,
        BIRCH_WOODEN_CRAFTING_TABLE_SLAB, JUNGLE_WOODEN_CRAFTING_TABLE_SLAB, ACACIA_WOODEN_CRAFTING_TABLE_SLAB,
        DARK_OAK_WOODEN_CRAFTING_TABLE_SLAB, MANGROVE_WOODEN_CRAFTING_TABLE_SLAB, CHERRY_WOODEN_CRAFTING_TABLE_SLAB,
        BAMBOO_WOODEN_CRAFTING_TABLE_SLAB, CRIMSON_WOODEN_CRAFTING_TABLE_SLAB, WARPED_WOODEN_CRAFTING_TABLE_SLAB,
        TWILIGHT_OAK_WOODEN_CRAFTING_TABLE_SLAB, CANOPY_WOODEN_CRAFTING_TABLE_SLAB, TWILIGHT_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB,
        DARK_WOODEN_CRAFTING_TABLE_SLAB, TIME_WOODEN_CRAFTING_TABLE_SLAB, TRANSFORMATION_WOODEN_CRAFTING_TABLE_SLAB,
        MINING_WOODEN_CRAFTING_TABLE_SLAB, SORTING_WOODEN_CRAFTING_TABLE_SLAB, TOWERWOOD_WOODEN_CRAFTING_TABLE_SLAB,
        FIR_WOODEN_CRAFTING_TABLE_SLAB, PINE_WOODEN_CRAFTING_TABLE_SLAB, MAPLE_WOODEN_CRAFTING_TABLE_SLAB,
        REDWOOD_WOODEN_CRAFTING_TABLE_SLAB, MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB, JACARANDA_WOODEN_CRAFTING_TABLE_SLAB,
        PALM_WOODEN_CRAFTING_TABLE_SLAB, WILLOW_WOODEN_CRAFTING_TABLE_SLAB, DEAD_WOODEN_CRAFTING_TABLE_SLAB,
        MAGIC_WOODEN_CRAFTING_TABLE_SLAB, UMBRAN_WOODEN_CRAFTING_TABLE_SLAB, HELLBARK_WOODEN_CRAFTING_TABLE_SLAB,
        EMPYREAL_WOODEN_CRAFTING_TABLE_SLAB, ROSEROOT_WOODEN_CRAFTING_TABLE_SLAB, YAGROOT_WOODEN_CRAFTING_TABLE_SLAB,
        CRUDEROOT_WOODEN_CRAFTING_TABLE_SLAB, CONBERRY_WOODEN_CRAFTING_TABLE_SLAB, SUNROOT_WOODEN_CRAFTING_TABLE_SLAB,
        SKYROOT_WOODEN_CRAFTING_TABLE_SLAB,
        ASPEN_WOODEN_CRAFTING_TABLE_SLAB, BAOBAB_WOODEN_CRAFTING_TABLE_SLAB, BLUE_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB,
        CIKA_WOODEN_CRAFTING_TABLE_SLAB, CYPRESS_WOODEN_CRAFTING_TABLE_SLAB, EBONY_WOODEN_CRAFTING_TABLE_SLAB,
        BWG_FIR_WOODEN_CRAFTING_TABLE_SLAB, FLORUS_WOODEN_CRAFTING_TABLE_SLAB, GREEN_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB,
        HOLLY_WOODEN_CRAFTING_TABLE_SLAB, IRONWOOD_WOODEN_CRAFTING_TABLE_SLAB, BWG_JACARANDA_WOODEN_CRAFTING_TABLE_SLAB,
        BWG_MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB, BWG_MAPLE_WOODEN_CRAFTING_TABLE_SLAB, BWG_PALM_WOODEN_CRAFTING_TABLE_SLAB,
        BWG_PINE_WOODEN_CRAFTING_TABLE_SLAB, RAINBOW_EUCALYPTUS_WOODEN_CRAFTING_TABLE_SLAB, BWG_REDWOOD_WOODEN_CRAFTING_TABLE_SLAB,
        SAKURA_WOODEN_CRAFTING_TABLE_SLAB, SKYRIS_WOODEN_CRAFTING_TABLE_SLAB,
        WHITE_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB, BWG_WILLOW_WOODEN_CRAFTING_TABLE_SLAB,
        WITCH_HAZEL_WOODEN_CRAFTING_TABLE_SLAB, ZELKOVA_WOODEN_CRAFTING_TABLE_SLAB,
        AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE_SLAB, BANYAN_WOODEN_CRAFTING_TABLE_SLAB,
        BLACK_WALNUT_WOODEN_CRAFTING_TABLE_SLAB, BLOODWOOD_WOODEN_CRAFTING_TABLE_SLAB,
        BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE_SLAB, CORK_OAK_WOODEN_CRAFTING_TABLE_SLAB,
        DRAGON_BLOOD_WOODEN_CRAFTING_TABLE_SLAB, KAPOK_WOODEN_CRAFTING_TABLE_SLAB, LARCH_WOODEN_CRAFTING_TABLE_SLAB,
        SANDALWOOD_WOODEN_CRAFTING_TABLE_SLAB, SYCAMORE_WOODEN_CRAFTING_TABLE_SLAB, TEAK_WOODEN_CRAFTING_TABLE_SLAB,
        WENGE_WOODEN_CRAFTING_TABLE_SLAB, ZEBRAWOOD_WOODEN_CRAFTING_TABLE_SLAB
    );

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
    public static final List<DeferredItem<Item>> ALL_PLATES = List.of(
        OAK_WOODEN_PLATE, SPRUCE_WOODEN_PLATE, BIRCH_WOODEN_PLATE, JUNGLE_WOODEN_PLATE,
        ACACIA_WOODEN_PLATE, DARK_OAK_WOODEN_PLATE, MANGROVE_WOODEN_PLATE, CHERRY_WOODEN_PLATE,
        BAMBOO_WOODEN_PLATE, CRIMSON_WOODEN_PLATE, WARPED_WOODEN_PLATE,
        TWILIGHT_OAK_WOODEN_PLATE, CANOPY_WOODEN_PLATE, TWILIGHT_MANGROVE_WOODEN_PLATE,
        DARK_WOODEN_PLATE, TIME_WOODEN_PLATE, TRANSFORMATION_WOODEN_PLATE, MINING_WOODEN_PLATE,
        SORTING_WOODEN_PLATE, TOWERWOOD_WOODEN_PLATE,
        FIR_WOODEN_PLATE, PINE_WOODEN_PLATE, MAPLE_WOODEN_PLATE, REDWOOD_WOODEN_PLATE,
        MAHOGANY_WOODEN_PLATE, JACARANDA_WOODEN_PLATE, PALM_WOODEN_PLATE, WILLOW_WOODEN_PLATE,
        DEAD_WOODEN_PLATE, MAGIC_WOODEN_PLATE, UMBRAN_WOODEN_PLATE, HELLBARK_WOODEN_PLATE,
        EMPYREAL_WOODEN_PLATE, ROSEROOT_WOODEN_PLATE, YAGROOT_WOODEN_PLATE, CRUDEROOT_WOODEN_PLATE,
        CONBERRY_WOODEN_PLATE, SUNROOT_WOODEN_PLATE, SKYROOT_WOODEN_PLATE,
        ASPEN_WOODEN_PLATE, BAOBAB_WOODEN_PLATE, BLUE_ENCHANTED_WOODEN_PLATE, CIKA_WOODEN_PLATE,
        CYPRESS_WOODEN_PLATE, EBONY_WOODEN_PLATE, BWG_FIR_WOODEN_PLATE, FLORUS_WOODEN_PLATE,
        GREEN_ENCHANTED_WOODEN_PLATE, HOLLY_WOODEN_PLATE, IRONWOOD_WOODEN_PLATE,
        BWG_JACARANDA_WOODEN_PLATE, BWG_MAHOGANY_WOODEN_PLATE, BWG_MAPLE_WOODEN_PLATE,
        BWG_PALM_WOODEN_PLATE, BWG_PINE_WOODEN_PLATE, RAINBOW_EUCALYPTUS_WOODEN_PLATE,
        BWG_REDWOOD_WOODEN_PLATE, SAKURA_WOODEN_PLATE, SKYRIS_WOODEN_PLATE, SPIRIT_WOODEN_PLATE,
        WHITE_MANGROVE_WOODEN_PLATE, BWG_WILLOW_WOODEN_PLATE, WITCH_HAZEL_WOODEN_PLATE,
        ZELKOVA_WOODEN_PLATE,
        AFRICAN_BLACKWOOD_WOODEN_PLATE, BANYAN_WOODEN_PLATE, BLACK_WALNUT_WOODEN_PLATE,
        BLOODWOOD_WOODEN_PLATE, BRISTLECONE_PINE_WOODEN_PLATE, CORK_OAK_WOODEN_PLATE,
        DRAGON_BLOOD_WOODEN_PLATE, KAPOK_WOODEN_PLATE, LARCH_WOODEN_PLATE, SANDALWOOD_WOODEN_PLATE,
        SYCAMORE_WOODEN_PLATE, TEAK_WOODEN_PLATE, WENGE_WOODEN_PLATE, ZEBRAWOOD_WOODEN_PLATE
    );
    public static final List<DeferredItem<Item>> ALL_CAULDRONS = List.of(
        OAK_WOODEN_CAULDRON, SPRUCE_WOODEN_CAULDRON, BIRCH_WOODEN_CAULDRON, JUNGLE_WOODEN_CAULDRON,
        ACACIA_WOODEN_CAULDRON, DARK_OAK_WOODEN_CAULDRON, MANGROVE_WOODEN_CAULDRON, CHERRY_WOODEN_CAULDRON,
        BAMBOO_WOODEN_CAULDRON, CRIMSON_WOODEN_CAULDRON, WARPED_WOODEN_CAULDRON,
        TWILIGHT_OAK_WOODEN_CAULDRON, CANOPY_WOODEN_CAULDRON, TWILIGHT_MANGROVE_WOODEN_CAULDRON,
        DARK_WOODEN_CAULDRON, TIME_WOODEN_CAULDRON, MINING_WOODEN_CAULDRON,
        SORTING_WOODEN_CAULDRON, TOWERWOOD_WOODEN_CAULDRON,
        FIR_WOODEN_CAULDRON, PINE_WOODEN_CAULDRON, MAPLE_WOODEN_CAULDRON, REDWOOD_WOODEN_CAULDRON,
        MAHOGANY_WOODEN_CAULDRON, JACARANDA_WOODEN_CAULDRON, PALM_WOODEN_CAULDRON, WILLOW_WOODEN_CAULDRON,
        DEAD_WOODEN_CAULDRON, MAGIC_WOODEN_CAULDRON, UMBRAN_WOODEN_CAULDRON, HELLBARK_WOODEN_CAULDRON,
        EMPYREAL_WOODEN_CAULDRON, ROSEROOT_WOODEN_CAULDRON, YAGROOT_WOODEN_CAULDRON, CRUDEROOT_WOODEN_CAULDRON,
        CONBERRY_WOODEN_CAULDRON, SUNROOT_WOODEN_CAULDRON, SKYROOT_WOODEN_CAULDRON,
        ASPEN_WOODEN_CAULDRON, BAOBAB_WOODEN_CAULDRON, BLUE_ENCHANTED_WOODEN_CAULDRON, CIKA_WOODEN_CAULDRON,
        CYPRESS_WOODEN_CAULDRON, EBONY_WOODEN_CAULDRON, BWG_FIR_WOODEN_CAULDRON, FLORUS_WOODEN_CAULDRON,
        GREEN_ENCHANTED_WOODEN_CAULDRON, HOLLY_WOODEN_CAULDRON, IRONWOOD_WOODEN_CAULDRON,
        BWG_JACARANDA_WOODEN_CAULDRON, BWG_MAHOGANY_WOODEN_CAULDRON, BWG_MAPLE_WOODEN_CAULDRON,
        BWG_PALM_WOODEN_CAULDRON, BWG_PINE_WOODEN_CAULDRON, RAINBOW_EUCALYPTUS_WOODEN_CAULDRON,
        BWG_REDWOOD_WOODEN_CAULDRON, SAKURA_WOODEN_CAULDRON, SKYRIS_WOODEN_CAULDRON, SPIRIT_WOODEN_CAULDRON,
        WHITE_MANGROVE_WOODEN_CAULDRON, BWG_WILLOW_WOODEN_CAULDRON, WITCH_HAZEL_WOODEN_CAULDRON,
        ZELKOVA_WOODEN_CAULDRON,
        AFRICAN_BLACKWOOD_WOODEN_CAULDRON, BANYAN_WOODEN_CAULDRON, BLACK_WALNUT_WOODEN_CAULDRON,
        BLOODWOOD_WOODEN_CAULDRON, BRISTLECONE_PINE_WOODEN_CAULDRON, CORK_OAK_WOODEN_CAULDRON,
        DRAGON_BLOOD_WOODEN_CAULDRON, KAPOK_WOODEN_CAULDRON, LARCH_WOODEN_CAULDRON, SANDALWOOD_WOODEN_CAULDRON,
        SYCAMORE_WOODEN_CAULDRON, TEAK_WOODEN_CAULDRON, WENGE_WOODEN_CAULDRON, ZEBRAWOOD_WOODEN_CAULDRON
    );
    public static final List<DeferredItem<Item>> ALL_BARRELS = List.of(
        WOODEN_BARREL, OAK_WOODEN_BARREL, SPRUCE_WOODEN_BARREL, BIRCH_WOODEN_BARREL, JUNGLE_WOODEN_BARREL,
        ACACIA_WOODEN_BARREL, DARK_OAK_WOODEN_BARREL, MANGROVE_WOODEN_BARREL, CHERRY_WOODEN_BARREL,
        BAMBOO_WOODEN_BARREL, CRIMSON_WOODEN_BARREL, WARPED_WOODEN_BARREL,
        TWILIGHT_OAK_WOODEN_BARREL, CANOPY_WOODEN_BARREL, TWILIGHT_MANGROVE_WOODEN_BARREL,
        DARK_WOODEN_BARREL, TIME_WOODEN_BARREL, TRANSFORMATION_WOODEN_BARREL, MINING_WOODEN_BARREL,
        SORTING_WOODEN_BARREL, TOWERWOOD_WOODEN_BARREL,
        FIR_WOODEN_BARREL, PINE_WOODEN_BARREL, MAPLE_WOODEN_BARREL, REDWOOD_WOODEN_BARREL,
        MAHOGANY_WOODEN_BARREL, JACARANDA_WOODEN_BARREL, PALM_WOODEN_BARREL, WILLOW_WOODEN_BARREL,
        DEAD_WOODEN_BARREL, MAGIC_WOODEN_BARREL, UMBRAN_WOODEN_BARREL, HELLBARK_WOODEN_BARREL,
        EMPYREAL_WOODEN_BARREL, ROSEROOT_WOODEN_BARREL, YAGROOT_WOODEN_BARREL, CRUDEROOT_WOODEN_BARREL,
        CONBERRY_WOODEN_BARREL, SUNROOT_WOODEN_BARREL, SKYROOT_WOODEN_BARREL,
        ASPEN_WOODEN_BARREL, BAOBAB_WOODEN_BARREL, BLUE_ENCHANTED_WOODEN_BARREL, CIKA_WOODEN_BARREL,
        CYPRESS_WOODEN_BARREL, EBONY_WOODEN_BARREL, BWG_FIR_WOODEN_BARREL, FLORUS_WOODEN_BARREL,
        GREEN_ENCHANTED_WOODEN_BARREL, HOLLY_WOODEN_BARREL, IRONWOOD_WOODEN_BARREL,
        BWG_JACARANDA_WOODEN_BARREL, BWG_MAHOGANY_WOODEN_BARREL, BWG_MAPLE_WOODEN_BARREL,
        BWG_PALM_WOODEN_BARREL, BWG_PINE_WOODEN_BARREL, RAINBOW_EUCALYPTUS_WOODEN_BARREL,
        BWG_REDWOOD_WOODEN_BARREL, SAKURA_WOODEN_BARREL, SKYRIS_WOODEN_BARREL, SPIRIT_WOODEN_BARREL,
        WHITE_MANGROVE_WOODEN_BARREL, BWG_WILLOW_WOODEN_BARREL, WITCH_HAZEL_WOODEN_BARREL,
        ZELKOVA_WOODEN_BARREL,
        AFRICAN_BLACKWOOD_WOODEN_BARREL, BANYAN_WOODEN_BARREL, BLACK_WALNUT_WOODEN_BARREL,
        BLOODWOOD_WOODEN_BARREL, BRISTLECONE_PINE_WOODEN_BARREL, CORK_OAK_WOODEN_BARREL,
        DRAGON_BLOOD_WOODEN_BARREL, KAPOK_WOODEN_BARREL, LARCH_WOODEN_BARREL, SANDALWOOD_WOODEN_BARREL,
        SYCAMORE_WOODEN_BARREL, TEAK_WOODEN_BARREL, WENGE_WOODEN_BARREL, ZEBRAWOOD_WOODEN_BARREL
    );
    public static final List<DeferredItem<Item>> ALL_HOPPERS = List.of(
        OAK_WOODEN_HOPPER, SPRUCE_WOODEN_HOPPER, BIRCH_WOODEN_HOPPER, JUNGLE_WOODEN_HOPPER,
        ACACIA_WOODEN_HOPPER, DARK_OAK_WOODEN_HOPPER, MANGROVE_WOODEN_HOPPER, CHERRY_WOODEN_HOPPER,
        BAMBOO_WOODEN_HOPPER, CRIMSON_WOODEN_HOPPER, WARPED_WOODEN_HOPPER,
        TWILIGHT_OAK_WOODEN_HOPPER, CANOPY_WOODEN_HOPPER, TWILIGHT_MANGROVE_WOODEN_HOPPER,
        DARK_WOODEN_HOPPER, TIME_WOODEN_HOPPER, MINING_WOODEN_HOPPER,
        SORTING_WOODEN_HOPPER, TOWERWOOD_WOODEN_HOPPER,
        FIR_WOODEN_HOPPER, PINE_WOODEN_HOPPER, MAPLE_WOODEN_HOPPER, REDWOOD_WOODEN_HOPPER,
        MAHOGANY_WOODEN_HOPPER, JACARANDA_WOODEN_HOPPER, PALM_WOODEN_HOPPER, WILLOW_WOODEN_HOPPER,
        DEAD_WOODEN_HOPPER, MAGIC_WOODEN_HOPPER, UMBRAN_WOODEN_HOPPER, HELLBARK_WOODEN_HOPPER,
        EMPYREAL_WOODEN_HOPPER, ROSEROOT_WOODEN_HOPPER, YAGROOT_WOODEN_HOPPER, CRUDEROOT_WOODEN_HOPPER,
        CONBERRY_WOODEN_HOPPER, SUNROOT_WOODEN_HOPPER, SKYROOT_WOODEN_HOPPER,
        ASPEN_WOODEN_HOPPER, BAOBAB_WOODEN_HOPPER, BLUE_ENCHANTED_WOODEN_HOPPER, CIKA_WOODEN_HOPPER,
        CYPRESS_WOODEN_HOPPER, EBONY_WOODEN_HOPPER, BWG_FIR_WOODEN_HOPPER, FLORUS_WOODEN_HOPPER,
        GREEN_ENCHANTED_WOODEN_HOPPER, HOLLY_WOODEN_HOPPER, IRONWOOD_WOODEN_HOPPER,
        BWG_JACARANDA_WOODEN_HOPPER, BWG_MAHOGANY_WOODEN_HOPPER, BWG_MAPLE_WOODEN_HOPPER,
        BWG_PALM_WOODEN_HOPPER, BWG_PINE_WOODEN_HOPPER, RAINBOW_EUCALYPTUS_WOODEN_HOPPER,
        BWG_REDWOOD_WOODEN_HOPPER, SAKURA_WOODEN_HOPPER, SKYRIS_WOODEN_HOPPER, SPIRIT_WOODEN_HOPPER,
        WHITE_MANGROVE_WOODEN_HOPPER, BWG_WILLOW_WOODEN_HOPPER, WITCH_HAZEL_WOODEN_HOPPER,
        ZELKOVA_WOODEN_HOPPER,
        AFRICAN_BLACKWOOD_WOODEN_HOPPER, BANYAN_WOODEN_HOPPER, BLACK_WALNUT_WOODEN_HOPPER,
        BLOODWOOD_WOODEN_HOPPER, BRISTLECONE_PINE_WOODEN_HOPPER, CORK_OAK_WOODEN_HOPPER,
        DRAGON_BLOOD_WOODEN_HOPPER, KAPOK_WOODEN_HOPPER, LARCH_WOODEN_HOPPER, SANDALWOOD_WOODEN_HOPPER,
        SYCAMORE_WOODEN_HOPPER, TEAK_WOODEN_HOPPER, WENGE_WOODEN_HOPPER, ZEBRAWOOD_WOODEN_HOPPER
    );
    public static final List<DeferredItem<Item>> ALL_CHESTS = List.of(
        WOODEN_CHEST, OAK_WOODEN_CHEST, SPRUCE_WOODEN_CHEST, BIRCH_WOODEN_CHEST, JUNGLE_WOODEN_CHEST,
        ACACIA_WOODEN_CHEST, DARK_OAK_WOODEN_CHEST, MANGROVE_WOODEN_CHEST, CHERRY_WOODEN_CHEST,
        BAMBOO_WOODEN_CHEST, CRIMSON_WOODEN_CHEST, WARPED_WOODEN_CHEST,
        TWILIGHT_OAK_WOODEN_CHEST, CANOPY_WOODEN_CHEST, TWILIGHT_MANGROVE_WOODEN_CHEST,
        DARK_WOODEN_CHEST, TIME_WOODEN_CHEST, TRANSFORMATION_WOODEN_CHEST, MINING_WOODEN_CHEST,
        SORTING_WOODEN_CHEST, TOWERWOOD_WOODEN_CHEST,
        FIR_WOODEN_CHEST, PINE_WOODEN_CHEST, MAPLE_WOODEN_CHEST, REDWOOD_WOODEN_CHEST,
        MAHOGANY_WOODEN_CHEST, JACARANDA_WOODEN_CHEST, PALM_WOODEN_CHEST, WILLOW_WOODEN_CHEST,
        DEAD_WOODEN_CHEST, MAGIC_WOODEN_CHEST, UMBRAN_WOODEN_CHEST, HELLBARK_WOODEN_CHEST,
        EMPYREAL_WOODEN_CHEST, ROSEROOT_WOODEN_CHEST, YAGROOT_WOODEN_CHEST, CRUDEROOT_WOODEN_CHEST,
        CONBERRY_WOODEN_CHEST, SUNROOT_WOODEN_CHEST, SKYROOT_WOODEN_CHEST,
        ASPEN_WOODEN_CHEST, BAOBAB_WOODEN_CHEST, BLUE_ENCHANTED_WOODEN_CHEST, CIKA_WOODEN_CHEST,
        CYPRESS_WOODEN_CHEST, EBONY_WOODEN_CHEST, BWG_FIR_WOODEN_CHEST, FLORUS_WOODEN_CHEST,
        GREEN_ENCHANTED_WOODEN_CHEST, HOLLY_WOODEN_CHEST, IRONWOOD_WOODEN_CHEST,
        BWG_JACARANDA_WOODEN_CHEST, BWG_MAHOGANY_WOODEN_CHEST, BWG_MAPLE_WOODEN_CHEST,
        BWG_PALM_WOODEN_CHEST, BWG_PINE_WOODEN_CHEST, RAINBOW_EUCALYPTUS_WOODEN_CHEST,
        BWG_REDWOOD_WOODEN_CHEST, SAKURA_WOODEN_CHEST, SKYRIS_WOODEN_CHEST, SPIRIT_WOODEN_CHEST,
        WHITE_MANGROVE_WOODEN_CHEST, BWG_WILLOW_WOODEN_CHEST, WITCH_HAZEL_WOODEN_CHEST,
        ZELKOVA_WOODEN_CHEST,
        AFRICAN_BLACKWOOD_WOODEN_CHEST, BANYAN_WOODEN_CHEST, BLACK_WALNUT_WOODEN_CHEST,
        BLOODWOOD_WOODEN_CHEST, BRISTLECONE_PINE_WOODEN_CHEST, CORK_OAK_WOODEN_CHEST,
        DRAGON_BLOOD_WOODEN_CHEST, KAPOK_WOODEN_CHEST, LARCH_WOODEN_CHEST, SANDALWOOD_WOODEN_CHEST,
        SYCAMORE_WOODEN_CHEST, TEAK_WOODEN_CHEST, WENGE_WOODEN_CHEST, ZEBRAWOOD_WOODEN_CHEST
    );
    public static final List<DeferredItem<Item>> ALL_CRAFTING_SLABS = List.of(
        WOODEN_CRAFTING_TABLE_SLAB, OAK_WOODEN_CRAFTING_TABLE_SLAB, SPRUCE_WOODEN_CRAFTING_TABLE_SLAB,
        BIRCH_WOODEN_CRAFTING_TABLE_SLAB, JUNGLE_WOODEN_CRAFTING_TABLE_SLAB, ACACIA_WOODEN_CRAFTING_TABLE_SLAB,
        DARK_OAK_WOODEN_CRAFTING_TABLE_SLAB, MANGROVE_WOODEN_CRAFTING_TABLE_SLAB, CHERRY_WOODEN_CRAFTING_TABLE_SLAB,
        BAMBOO_WOODEN_CRAFTING_TABLE_SLAB, CRIMSON_WOODEN_CRAFTING_TABLE_SLAB, WARPED_WOODEN_CRAFTING_TABLE_SLAB,
        TWILIGHT_OAK_WOODEN_CRAFTING_TABLE_SLAB, CANOPY_WOODEN_CRAFTING_TABLE_SLAB, TWILIGHT_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB,
        DARK_WOODEN_CRAFTING_TABLE_SLAB, TIME_WOODEN_CRAFTING_TABLE_SLAB, TRANSFORMATION_WOODEN_CRAFTING_TABLE_SLAB,
        MINING_WOODEN_CRAFTING_TABLE_SLAB, SORTING_WOODEN_CRAFTING_TABLE_SLAB, TOWERWOOD_WOODEN_CRAFTING_TABLE_SLAB,
        FIR_WOODEN_CRAFTING_TABLE_SLAB, PINE_WOODEN_CRAFTING_TABLE_SLAB, MAPLE_WOODEN_CRAFTING_TABLE_SLAB,
        REDWOOD_WOODEN_CRAFTING_TABLE_SLAB, MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB, JACARANDA_WOODEN_CRAFTING_TABLE_SLAB,
        PALM_WOODEN_CRAFTING_TABLE_SLAB, WILLOW_WOODEN_CRAFTING_TABLE_SLAB, DEAD_WOODEN_CRAFTING_TABLE_SLAB,
        MAGIC_WOODEN_CRAFTING_TABLE_SLAB, UMBRAN_WOODEN_CRAFTING_TABLE_SLAB, HELLBARK_WOODEN_CRAFTING_TABLE_SLAB,
        EMPYREAL_WOODEN_CRAFTING_TABLE_SLAB, ROSEROOT_WOODEN_CRAFTING_TABLE_SLAB, YAGROOT_WOODEN_CRAFTING_TABLE_SLAB,
        CRUDEROOT_WOODEN_CRAFTING_TABLE_SLAB, CONBERRY_WOODEN_CRAFTING_TABLE_SLAB, SUNROOT_WOODEN_CRAFTING_TABLE_SLAB,
        SKYROOT_WOODEN_CRAFTING_TABLE_SLAB,
        ASPEN_WOODEN_CRAFTING_TABLE_SLAB, BAOBAB_WOODEN_CRAFTING_TABLE_SLAB, BLUE_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB,
        CIKA_WOODEN_CRAFTING_TABLE_SLAB, CYPRESS_WOODEN_CRAFTING_TABLE_SLAB, EBONY_WOODEN_CRAFTING_TABLE_SLAB,
        BWG_FIR_WOODEN_CRAFTING_TABLE_SLAB, FLORUS_WOODEN_CRAFTING_TABLE_SLAB, GREEN_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB,
        HOLLY_WOODEN_CRAFTING_TABLE_SLAB, IRONWOOD_WOODEN_CRAFTING_TABLE_SLAB, BWG_JACARANDA_WOODEN_CRAFTING_TABLE_SLAB,
        BWG_MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB, BWG_MAPLE_WOODEN_CRAFTING_TABLE_SLAB, BWG_PALM_WOODEN_CRAFTING_TABLE_SLAB,
        BWG_PINE_WOODEN_CRAFTING_TABLE_SLAB, RAINBOW_EUCALYPTUS_WOODEN_CRAFTING_TABLE_SLAB, BWG_REDWOOD_WOODEN_CRAFTING_TABLE_SLAB,
        SAKURA_WOODEN_CRAFTING_TABLE_SLAB, SKYRIS_WOODEN_CRAFTING_TABLE_SLAB, SPIRIT_WOODEN_CRAFTING_TABLE_SLAB,
        WHITE_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB, BWG_WILLOW_WOODEN_CRAFTING_TABLE_SLAB,
        WITCH_HAZEL_WOODEN_CRAFTING_TABLE_SLAB, ZELKOVA_WOODEN_CRAFTING_TABLE_SLAB,
        AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE_SLAB, BANYAN_WOODEN_CRAFTING_TABLE_SLAB,
        BLACK_WALNUT_WOODEN_CRAFTING_TABLE_SLAB, BLOODWOOD_WOODEN_CRAFTING_TABLE_SLAB,
        BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE_SLAB, CORK_OAK_WOODEN_CRAFTING_TABLE_SLAB,
        DRAGON_BLOOD_WOODEN_CRAFTING_TABLE_SLAB, KAPOK_WOODEN_CRAFTING_TABLE_SLAB, LARCH_WOODEN_CRAFTING_TABLE_SLAB,
        SANDALWOOD_WOODEN_CRAFTING_TABLE_SLAB, SYCAMORE_WOODEN_CRAFTING_TABLE_SLAB, TEAK_WOODEN_CRAFTING_TABLE_SLAB,
        WENGE_WOODEN_CRAFTING_TABLE_SLAB, ZEBRAWOOD_WOODEN_CRAFTING_TABLE_SLAB
    );
    *///?}

    private ModItems() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

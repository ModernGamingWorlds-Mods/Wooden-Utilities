package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenAnvilBlock;
import com.moderngamingworld.woodenutilities.WoodenBarrelBlock;
import com.moderngamingworld.woodenutilities.WoodenCauldronBlock;
import com.moderngamingworld.woodenutilities.WoodenCraftingTableBlock;
import com.moderngamingworld.woodenutilities.WoodenCraftingTableSlabBlock;
import com.moderngamingworld.woodenutilities.WoodenHopperBlock;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
//? if neoforge {
/*import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
*///?} else {
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
//?}

import java.util.List;

public final class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, WoodenUtilities.MOD_ID);

    //? if neoforge {
    /*public static final DeferredHolder<Block, Block> OAK_WOODEN_CAULDRON = BLOCKS.register("oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> SPRUCE_WOODEN_CAULDRON = BLOCKS.register("spruce_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> BIRCH_WOODEN_CAULDRON = BLOCKS.register("birch_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> JUNGLE_WOODEN_CAULDRON = BLOCKS.register("jungle_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> ACACIA_WOODEN_CAULDRON = BLOCKS.register("acacia_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> DARK_OAK_WOODEN_CAULDRON = BLOCKS.register("dark_oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> MANGROVE_WOODEN_CAULDRON = BLOCKS.register("mangrove_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> CHERRY_WOODEN_CAULDRON = BLOCKS.register("cherry_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> BAMBOO_WOODEN_CAULDRON = BLOCKS.register("bamboo_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> CRIMSON_WOODEN_CAULDRON = BLOCKS.register("crimson_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> WARPED_WOODEN_CAULDRON = BLOCKS.register("warped_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> TWILIGHT_OAK_WOODEN_CAULDRON = BLOCKS.register("twilight_oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> CANOPY_WOODEN_CAULDRON = BLOCKS.register("canopy_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> TWILIGHT_MANGROVE_WOODEN_CAULDRON = BLOCKS.register("twilight_mangrove_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> DARK_WOODEN_CAULDRON = BLOCKS.register("dark_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> TIME_WOODEN_CAULDRON = BLOCKS.register("time_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> MINING_WOODEN_CAULDRON = BLOCKS.register("mining_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> SORTING_WOODEN_CAULDRON = BLOCKS.register("sorting_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> TOWERWOOD_WOODEN_CAULDRON = BLOCKS.register("towerwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> FIR_WOODEN_CAULDRON = BLOCKS.register("fir_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> PINE_WOODEN_CAULDRON = BLOCKS.register("pine_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> MAPLE_WOODEN_CAULDRON = BLOCKS.register("maple_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> REDWOOD_WOODEN_CAULDRON = BLOCKS.register("redwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> MAHOGANY_WOODEN_CAULDRON = BLOCKS.register("mahogany_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> JACARANDA_WOODEN_CAULDRON = BLOCKS.register("jacaranda_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> PALM_WOODEN_CAULDRON = BLOCKS.register("palm_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> WILLOW_WOODEN_CAULDRON = BLOCKS.register("willow_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> DEAD_WOODEN_CAULDRON = BLOCKS.register("dead_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> MAGIC_WOODEN_CAULDRON = BLOCKS.register("magic_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> UMBRAN_WOODEN_CAULDRON = BLOCKS.register("umbran_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> HELLBARK_WOODEN_CAULDRON = BLOCKS.register("hellbark_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> EMPYREAL_WOODEN_CAULDRON = BLOCKS.register("empyreal_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> ROSEROOT_WOODEN_CAULDRON = BLOCKS.register("roseroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> YAGROOT_WOODEN_CAULDRON = BLOCKS.register("yagroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> CRUDEROOT_WOODEN_CAULDRON = BLOCKS.register("cruderoot_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> CONBERRY_WOODEN_CAULDRON = BLOCKS.register("conberry_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> SUNROOT_WOODEN_CAULDRON = BLOCKS.register("sunroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> SKYROOT_WOODEN_CAULDRON = BLOCKS.register("skyroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> ASPEN_WOODEN_CAULDRON = BLOCKS.register("aspen_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> BAOBAB_WOODEN_CAULDRON = BLOCKS.register("baobab_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> BLUE_ENCHANTED_WOODEN_CAULDRON = BLOCKS.register("blue_enchanted_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> CIKA_WOODEN_CAULDRON = BLOCKS.register("cika_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> CYPRESS_WOODEN_CAULDRON = BLOCKS.register("cypress_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> EBONY_WOODEN_CAULDRON = BLOCKS.register("ebony_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> BWG_FIR_WOODEN_CAULDRON = BLOCKS.register("bwg_fir_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> FLORUS_WOODEN_CAULDRON = BLOCKS.register("florus_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> GREEN_ENCHANTED_WOODEN_CAULDRON = BLOCKS.register("green_enchanted_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> HOLLY_WOODEN_CAULDRON = BLOCKS.register("holly_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> IRONWOOD_WOODEN_CAULDRON = BLOCKS.register("ironwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> BWG_JACARANDA_WOODEN_CAULDRON = BLOCKS.register("bwg_jacaranda_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> BWG_MAHOGANY_WOODEN_CAULDRON = BLOCKS.register("bwg_mahogany_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> BWG_MAPLE_WOODEN_CAULDRON = BLOCKS.register("bwg_maple_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> BWG_PALM_WOODEN_CAULDRON = BLOCKS.register("bwg_palm_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> BWG_PINE_WOODEN_CAULDRON = BLOCKS.register("bwg_pine_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> RAINBOW_EUCALYPTUS_WOODEN_CAULDRON = BLOCKS.register("rainbow_eucalyptus_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> BWG_REDWOOD_WOODEN_CAULDRON = BLOCKS.register("bwg_redwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> SAKURA_WOODEN_CAULDRON = BLOCKS.register("sakura_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> SKYRIS_WOODEN_CAULDRON = BLOCKS.register("skyris_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> SPIRIT_WOODEN_CAULDRON = BLOCKS.register("spirit_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> WHITE_MANGROVE_WOODEN_CAULDRON = BLOCKS.register("white_mangrove_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> BWG_WILLOW_WOODEN_CAULDRON = BLOCKS.register("bwg_willow_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> WITCH_HAZEL_WOODEN_CAULDRON = BLOCKS.register("witch_hazel_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final DeferredHolder<Block, Block> ZELKOVA_WOODEN_CAULDRON = BLOCKS.register("zelkova_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final List<DeferredHolder<Block, Block>> ALL_WOODEN_CAULDRONS = List.of(
        OAK_WOODEN_CAULDRON, SPRUCE_WOODEN_CAULDRON, BIRCH_WOODEN_CAULDRON,
        JUNGLE_WOODEN_CAULDRON, ACACIA_WOODEN_CAULDRON, DARK_OAK_WOODEN_CAULDRON,
        MANGROVE_WOODEN_CAULDRON, CHERRY_WOODEN_CAULDRON, BAMBOO_WOODEN_CAULDRON,
        CRIMSON_WOODEN_CAULDRON, WARPED_WOODEN_CAULDRON,
        TWILIGHT_OAK_WOODEN_CAULDRON, CANOPY_WOODEN_CAULDRON, TWILIGHT_MANGROVE_WOODEN_CAULDRON,
        DARK_WOODEN_CAULDRON, TIME_WOODEN_CAULDRON, MINING_WOODEN_CAULDRON,
        SORTING_WOODEN_CAULDRON, TOWERWOOD_WOODEN_CAULDRON,
        FIR_WOODEN_CAULDRON, PINE_WOODEN_CAULDRON, MAPLE_WOODEN_CAULDRON,
        REDWOOD_WOODEN_CAULDRON, MAHOGANY_WOODEN_CAULDRON, JACARANDA_WOODEN_CAULDRON,
        PALM_WOODEN_CAULDRON, WILLOW_WOODEN_CAULDRON, DEAD_WOODEN_CAULDRON,
        MAGIC_WOODEN_CAULDRON, UMBRAN_WOODEN_CAULDRON, HELLBARK_WOODEN_CAULDRON,
        EMPYREAL_WOODEN_CAULDRON, ROSEROOT_WOODEN_CAULDRON, YAGROOT_WOODEN_CAULDRON,
        CRUDEROOT_WOODEN_CAULDRON, CONBERRY_WOODEN_CAULDRON, SUNROOT_WOODEN_CAULDRON,
        SKYROOT_WOODEN_CAULDRON,
        ASPEN_WOODEN_CAULDRON,
        BAOBAB_WOODEN_CAULDRON,
        BLUE_ENCHANTED_WOODEN_CAULDRON,
        CIKA_WOODEN_CAULDRON,
        CYPRESS_WOODEN_CAULDRON,
        EBONY_WOODEN_CAULDRON,
        BWG_FIR_WOODEN_CAULDRON,
        FLORUS_WOODEN_CAULDRON,
        GREEN_ENCHANTED_WOODEN_CAULDRON,
        HOLLY_WOODEN_CAULDRON,
        IRONWOOD_WOODEN_CAULDRON,
        BWG_JACARANDA_WOODEN_CAULDRON,
        BWG_MAHOGANY_WOODEN_CAULDRON,
        BWG_MAPLE_WOODEN_CAULDRON,
        BWG_PALM_WOODEN_CAULDRON,
        BWG_PINE_WOODEN_CAULDRON,
        RAINBOW_EUCALYPTUS_WOODEN_CAULDRON,
        BWG_REDWOOD_WOODEN_CAULDRON,
        SAKURA_WOODEN_CAULDRON,
        SKYRIS_WOODEN_CAULDRON,
        SPIRIT_WOODEN_CAULDRON,
        WHITE_MANGROVE_WOODEN_CAULDRON,
        BWG_WILLOW_WOODEN_CAULDRON,
        WITCH_HAZEL_WOODEN_CAULDRON,
        ZELKOVA_WOODEN_CAULDRON
    );

    public static final DeferredHolder<Block, Block> WOODEN_BARREL = BLOCKS.register("wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> OAK_WOODEN_BARREL = BLOCKS.register("oak_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> SPRUCE_WOODEN_BARREL = BLOCKS.register("spruce_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> BIRCH_WOODEN_BARREL = BLOCKS.register("birch_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> JUNGLE_WOODEN_BARREL = BLOCKS.register("jungle_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> ACACIA_WOODEN_BARREL = BLOCKS.register("acacia_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> DARK_OAK_WOODEN_BARREL = BLOCKS.register("dark_oak_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> MANGROVE_WOODEN_BARREL = BLOCKS.register("mangrove_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> CHERRY_WOODEN_BARREL = BLOCKS.register("cherry_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> BAMBOO_WOODEN_BARREL = BLOCKS.register("bamboo_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> CRIMSON_WOODEN_BARREL = BLOCKS.register("crimson_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> WARPED_WOODEN_BARREL = BLOCKS.register("warped_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> TWILIGHT_OAK_WOODEN_BARREL = BLOCKS.register("twilight_oak_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> CANOPY_WOODEN_BARREL = BLOCKS.register("canopy_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> TWILIGHT_MANGROVE_WOODEN_BARREL = BLOCKS.register("twilight_mangrove_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> DARK_WOODEN_BARREL = BLOCKS.register("dark_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> TIME_WOODEN_BARREL = BLOCKS.register("time_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> TRANSFORMATION_WOODEN_BARREL = BLOCKS.register("transformation_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> MINING_WOODEN_BARREL = BLOCKS.register("mining_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> SORTING_WOODEN_BARREL = BLOCKS.register("sorting_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> TOWERWOOD_WOODEN_BARREL = BLOCKS.register("towerwood_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> FIR_WOODEN_BARREL = BLOCKS.register("fir_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> PINE_WOODEN_BARREL = BLOCKS.register("pine_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> MAPLE_WOODEN_BARREL = BLOCKS.register("maple_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> REDWOOD_WOODEN_BARREL = BLOCKS.register("redwood_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> MAHOGANY_WOODEN_BARREL = BLOCKS.register("mahogany_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> JACARANDA_WOODEN_BARREL = BLOCKS.register("jacaranda_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> PALM_WOODEN_BARREL = BLOCKS.register("palm_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> WILLOW_WOODEN_BARREL = BLOCKS.register("willow_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> DEAD_WOODEN_BARREL = BLOCKS.register("dead_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> MAGIC_WOODEN_BARREL = BLOCKS.register("magic_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> UMBRAN_WOODEN_BARREL = BLOCKS.register("umbran_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> HELLBARK_WOODEN_BARREL = BLOCKS.register("hellbark_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> EMPYREAL_WOODEN_BARREL = BLOCKS.register("empyreal_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> ROSEROOT_WOODEN_BARREL = BLOCKS.register("roseroot_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> YAGROOT_WOODEN_BARREL = BLOCKS.register("yagroot_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> CRUDEROOT_WOODEN_BARREL = BLOCKS.register("cruderoot_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> CONBERRY_WOODEN_BARREL = BLOCKS.register("conberry_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> SUNROOT_WOODEN_BARREL = BLOCKS.register("sunroot_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> SKYROOT_WOODEN_BARREL = BLOCKS.register("skyroot_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));

    public static final DeferredHolder<Block, Block> ASPEN_WOODEN_BARREL = BLOCKS.register("aspen_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> BAOBAB_WOODEN_BARREL = BLOCKS.register("baobab_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> BLUE_ENCHANTED_WOODEN_BARREL = BLOCKS.register("blue_enchanted_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> CIKA_WOODEN_BARREL = BLOCKS.register("cika_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> CYPRESS_WOODEN_BARREL = BLOCKS.register("cypress_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> EBONY_WOODEN_BARREL = BLOCKS.register("ebony_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> BWG_FIR_WOODEN_BARREL = BLOCKS.register("bwg_fir_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> FLORUS_WOODEN_BARREL = BLOCKS.register("florus_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> GREEN_ENCHANTED_WOODEN_BARREL = BLOCKS.register("green_enchanted_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> HOLLY_WOODEN_BARREL = BLOCKS.register("holly_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> IRONWOOD_WOODEN_BARREL = BLOCKS.register("ironwood_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> BWG_JACARANDA_WOODEN_BARREL = BLOCKS.register("bwg_jacaranda_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> BWG_MAHOGANY_WOODEN_BARREL = BLOCKS.register("bwg_mahogany_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> BWG_MAPLE_WOODEN_BARREL = BLOCKS.register("bwg_maple_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> BWG_PALM_WOODEN_BARREL = BLOCKS.register("bwg_palm_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> BWG_PINE_WOODEN_BARREL = BLOCKS.register("bwg_pine_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> RAINBOW_EUCALYPTUS_WOODEN_BARREL = BLOCKS.register("rainbow_eucalyptus_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> BWG_REDWOOD_WOODEN_BARREL = BLOCKS.register("bwg_redwood_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> SAKURA_WOODEN_BARREL = BLOCKS.register("sakura_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> SKYRIS_WOODEN_BARREL = BLOCKS.register("skyris_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> SPIRIT_WOODEN_BARREL = BLOCKS.register("spirit_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> WHITE_MANGROVE_WOODEN_BARREL = BLOCKS.register("white_mangrove_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> BWG_WILLOW_WOODEN_BARREL = BLOCKS.register("bwg_willow_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> WITCH_HAZEL_WOODEN_BARREL = BLOCKS.register("witch_hazel_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> ZELKOVA_WOODEN_BARREL = BLOCKS.register("zelkova_wooden_barrel",
        () -> new WoodenBarrelBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)));
    public static final DeferredHolder<Block, Block> WOODEN_ANVIL = BLOCKS.register("wooden_anvil",
        () -> new WoodenAnvilBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANVIL).noOcclusion()));

    public static final DeferredHolder<Block, Block> OAK_WOODEN_HOPPER = BLOCKS.register("oak_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> SPRUCE_WOODEN_HOPPER = BLOCKS.register("spruce_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> BIRCH_WOODEN_HOPPER = BLOCKS.register("birch_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> JUNGLE_WOODEN_HOPPER = BLOCKS.register("jungle_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> ACACIA_WOODEN_HOPPER = BLOCKS.register("acacia_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> DARK_OAK_WOODEN_HOPPER = BLOCKS.register("dark_oak_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> MANGROVE_WOODEN_HOPPER = BLOCKS.register("mangrove_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> CHERRY_WOODEN_HOPPER = BLOCKS.register("cherry_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> BAMBOO_WOODEN_HOPPER = BLOCKS.register("bamboo_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> CRIMSON_WOODEN_HOPPER = BLOCKS.register("crimson_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> WARPED_WOODEN_HOPPER = BLOCKS.register("warped_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> TWILIGHT_OAK_WOODEN_HOPPER = BLOCKS.register("twilight_oak_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> CANOPY_WOODEN_HOPPER = BLOCKS.register("canopy_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> TWILIGHT_MANGROVE_WOODEN_HOPPER = BLOCKS.register("twilight_mangrove_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> DARK_WOODEN_HOPPER = BLOCKS.register("dark_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> TIME_WOODEN_HOPPER = BLOCKS.register("time_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> MINING_WOODEN_HOPPER = BLOCKS.register("mining_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> SORTING_WOODEN_HOPPER = BLOCKS.register("sorting_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> TOWERWOOD_WOODEN_HOPPER = BLOCKS.register("towerwood_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> FIR_WOODEN_HOPPER = BLOCKS.register("fir_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> PINE_WOODEN_HOPPER = BLOCKS.register("pine_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> MAPLE_WOODEN_HOPPER = BLOCKS.register("maple_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> REDWOOD_WOODEN_HOPPER = BLOCKS.register("redwood_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> MAHOGANY_WOODEN_HOPPER = BLOCKS.register("mahogany_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> JACARANDA_WOODEN_HOPPER = BLOCKS.register("jacaranda_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> PALM_WOODEN_HOPPER = BLOCKS.register("palm_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> WILLOW_WOODEN_HOPPER = BLOCKS.register("willow_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> DEAD_WOODEN_HOPPER = BLOCKS.register("dead_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> MAGIC_WOODEN_HOPPER = BLOCKS.register("magic_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> UMBRAN_WOODEN_HOPPER = BLOCKS.register("umbran_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> HELLBARK_WOODEN_HOPPER = BLOCKS.register("hellbark_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> EMPYREAL_WOODEN_HOPPER = BLOCKS.register("empyreal_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> ROSEROOT_WOODEN_HOPPER = BLOCKS.register("roseroot_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> YAGROOT_WOODEN_HOPPER = BLOCKS.register("yagroot_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> CRUDEROOT_WOODEN_HOPPER = BLOCKS.register("cruderoot_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> CONBERRY_WOODEN_HOPPER = BLOCKS.register("conberry_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> SUNROOT_WOODEN_HOPPER = BLOCKS.register("sunroot_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> SKYROOT_WOODEN_HOPPER = BLOCKS.register("skyroot_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> ASPEN_WOODEN_HOPPER = BLOCKS.register("aspen_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> BAOBAB_WOODEN_HOPPER = BLOCKS.register("baobab_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> BLUE_ENCHANTED_WOODEN_HOPPER = BLOCKS.register("blue_enchanted_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> CIKA_WOODEN_HOPPER = BLOCKS.register("cika_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> CYPRESS_WOODEN_HOPPER = BLOCKS.register("cypress_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> EBONY_WOODEN_HOPPER = BLOCKS.register("ebony_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> BWG_FIR_WOODEN_HOPPER = BLOCKS.register("bwg_fir_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> FLORUS_WOODEN_HOPPER = BLOCKS.register("florus_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> GREEN_ENCHANTED_WOODEN_HOPPER = BLOCKS.register("green_enchanted_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> HOLLY_WOODEN_HOPPER = BLOCKS.register("holly_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> IRONWOOD_WOODEN_HOPPER = BLOCKS.register("ironwood_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> BWG_JACARANDA_WOODEN_HOPPER = BLOCKS.register("bwg_jacaranda_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> BWG_MAHOGANY_WOODEN_HOPPER = BLOCKS.register("bwg_mahogany_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> BWG_MAPLE_WOODEN_HOPPER = BLOCKS.register("bwg_maple_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> BWG_PALM_WOODEN_HOPPER = BLOCKS.register("bwg_palm_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> BWG_PINE_WOODEN_HOPPER = BLOCKS.register("bwg_pine_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> RAINBOW_EUCALYPTUS_WOODEN_HOPPER = BLOCKS.register("rainbow_eucalyptus_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> BWG_REDWOOD_WOODEN_HOPPER = BLOCKS.register("bwg_redwood_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> SAKURA_WOODEN_HOPPER = BLOCKS.register("sakura_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> SKYRIS_WOODEN_HOPPER = BLOCKS.register("skyris_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> SPIRIT_WOODEN_HOPPER = BLOCKS.register("spirit_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> WHITE_MANGROVE_WOODEN_HOPPER = BLOCKS.register("white_mangrove_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> BWG_WILLOW_WOODEN_HOPPER = BLOCKS.register("bwg_willow_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> WITCH_HAZEL_WOODEN_HOPPER = BLOCKS.register("witch_hazel_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));
    public static final DeferredHolder<Block, Block> ZELKOVA_WOODEN_HOPPER = BLOCKS.register("zelkova_wooden_hopper",
        () -> new WoodenHopperBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.HOPPER)));

    public static final DeferredHolder<Block, Block> WOODEN_CRAFTING_TABLE = BLOCKS.register("wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> OAK_WOODEN_CRAFTING_TABLE = BLOCKS.register("oak_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SPRUCE_WOODEN_CRAFTING_TABLE = BLOCKS.register("spruce_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BIRCH_WOODEN_CRAFTING_TABLE = BLOCKS.register("birch_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> JUNGLE_WOODEN_CRAFTING_TABLE = BLOCKS.register("jungle_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> ACACIA_WOODEN_CRAFTING_TABLE = BLOCKS.register("acacia_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> DARK_OAK_WOODEN_CRAFTING_TABLE = BLOCKS.register("dark_oak_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> MANGROVE_WOODEN_CRAFTING_TABLE = BLOCKS.register("mangrove_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CHERRY_WOODEN_CRAFTING_TABLE = BLOCKS.register("cherry_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BAMBOO_WOODEN_CRAFTING_TABLE = BLOCKS.register("bamboo_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CRIMSON_WOODEN_CRAFTING_TABLE = BLOCKS.register("crimson_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> WARPED_WOODEN_CRAFTING_TABLE = BLOCKS.register("warped_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> TWILIGHT_OAK_WOODEN_CRAFTING_TABLE = BLOCKS.register("twilight_oak_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CANOPY_WOODEN_CRAFTING_TABLE = BLOCKS.register("canopy_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> TWILIGHT_MANGROVE_WOODEN_CRAFTING_TABLE = BLOCKS.register("twilight_mangrove_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> DARK_WOODEN_CRAFTING_TABLE = BLOCKS.register("dark_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> TIME_WOODEN_CRAFTING_TABLE = BLOCKS.register("time_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> TRANSFORMATION_WOODEN_CRAFTING_TABLE = BLOCKS.register("transformation_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> MINING_WOODEN_CRAFTING_TABLE = BLOCKS.register("mining_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SORTING_WOODEN_CRAFTING_TABLE = BLOCKS.register("sorting_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> TOWERWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("towerwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> FIR_WOODEN_CRAFTING_TABLE = BLOCKS.register("fir_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> PINE_WOODEN_CRAFTING_TABLE = BLOCKS.register("pine_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> MAPLE_WOODEN_CRAFTING_TABLE = BLOCKS.register("maple_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> REDWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("redwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> MAHOGANY_WOODEN_CRAFTING_TABLE = BLOCKS.register("mahogany_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> JACARANDA_WOODEN_CRAFTING_TABLE = BLOCKS.register("jacaranda_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> PALM_WOODEN_CRAFTING_TABLE = BLOCKS.register("palm_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> WILLOW_WOODEN_CRAFTING_TABLE = BLOCKS.register("willow_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> DEAD_WOODEN_CRAFTING_TABLE = BLOCKS.register("dead_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> MAGIC_WOODEN_CRAFTING_TABLE = BLOCKS.register("magic_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> UMBRAN_WOODEN_CRAFTING_TABLE = BLOCKS.register("umbran_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> HELLBARK_WOODEN_CRAFTING_TABLE = BLOCKS.register("hellbark_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> EMPYREAL_WOODEN_CRAFTING_TABLE = BLOCKS.register("empyreal_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> ROSEROOT_WOODEN_CRAFTING_TABLE = BLOCKS.register("roseroot_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> YAGROOT_WOODEN_CRAFTING_TABLE = BLOCKS.register("yagroot_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CRUDEROOT_WOODEN_CRAFTING_TABLE = BLOCKS.register("cruderoot_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CONBERRY_WOODEN_CRAFTING_TABLE = BLOCKS.register("conberry_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SUNROOT_WOODEN_CRAFTING_TABLE = BLOCKS.register("sunroot_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SKYROOT_WOODEN_CRAFTING_TABLE = BLOCKS.register("skyroot_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> ASPEN_WOODEN_CRAFTING_TABLE = BLOCKS.register("aspen_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BAOBAB_WOODEN_CRAFTING_TABLE = BLOCKS.register("baobab_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BLUE_ENCHANTED_WOODEN_CRAFTING_TABLE = BLOCKS.register("blue_enchanted_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CIKA_WOODEN_CRAFTING_TABLE = BLOCKS.register("cika_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CYPRESS_WOODEN_CRAFTING_TABLE = BLOCKS.register("cypress_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> EBONY_WOODEN_CRAFTING_TABLE = BLOCKS.register("ebony_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_FIR_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_fir_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> FLORUS_WOODEN_CRAFTING_TABLE = BLOCKS.register("florus_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> GREEN_ENCHANTED_WOODEN_CRAFTING_TABLE = BLOCKS.register("green_enchanted_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> HOLLY_WOODEN_CRAFTING_TABLE = BLOCKS.register("holly_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> IRONWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("ironwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_JACARANDA_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_jacaranda_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_MAHOGANY_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_mahogany_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_MAPLE_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_maple_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_PALM_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_palm_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_PINE_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_pine_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> RAINBOW_EUCALYPTUS_WOODEN_CRAFTING_TABLE = BLOCKS.register("rainbow_eucalyptus_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_REDWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_redwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SAKURA_WOODEN_CRAFTING_TABLE = BLOCKS.register("sakura_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SKYRIS_WOODEN_CRAFTING_TABLE = BLOCKS.register("skyris_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SPIRIT_WOODEN_CRAFTING_TABLE = BLOCKS.register("spirit_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> WHITE_MANGROVE_WOODEN_CRAFTING_TABLE = BLOCKS.register("white_mangrove_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_WILLOW_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_willow_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> WITCH_HAZEL_WOODEN_CRAFTING_TABLE = BLOCKS.register("witch_hazel_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> ZELKOVA_WOODEN_CRAFTING_TABLE = BLOCKS.register("zelkova_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("oak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SPRUCE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("spruce_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BIRCH_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("birch_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> JUNGLE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("jungle_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> ACACIA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("acacia_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> DARK_OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("dark_oak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("mangrove_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CHERRY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cherry_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BAMBOO_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bamboo_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CRIMSON_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("crimson_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> WARPED_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("warped_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> TWILIGHT_OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("twilight_oak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CANOPY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("canopy_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> TWILIGHT_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("twilight_mangrove_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> DARK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("dark_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> TIME_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("time_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> TRANSFORMATION_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("transformation_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> MINING_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("mining_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SORTING_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sorting_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> TOWERWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("towerwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> FIR_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("fir_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> PINE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("pine_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> MAPLE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("maple_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> REDWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("redwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("mahogany_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> JACARANDA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("jacaranda_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> PALM_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("palm_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> WILLOW_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("willow_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> DEAD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("dead_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> MAGIC_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("magic_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> UMBRAN_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("umbran_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> HELLBARK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("hellbark_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> EMPYREAL_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("empyreal_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> ROSEROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("roseroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> YAGROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("yagroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CRUDEROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cruderoot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CONBERRY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("conberry_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SUNROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sunroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SKYROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("skyroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> ASPEN_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("aspen_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BAOBAB_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("baobab_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BLUE_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("blue_enchanted_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CIKA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cika_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> CYPRESS_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cypress_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> EBONY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("ebony_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_FIR_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_fir_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> FLORUS_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("florus_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> GREEN_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("green_enchanted_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> HOLLY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("holly_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> IRONWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("ironwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_JACARANDA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_jacaranda_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_mahogany_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_MAPLE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_maple_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_PALM_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_palm_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_PINE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_pine_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> RAINBOW_EUCALYPTUS_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("rainbow_eucalyptus_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_REDWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_redwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SAKURA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sakura_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SKYRIS_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("skyris_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> SPIRIT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("spirit_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> WHITE_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("white_mangrove_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> BWG_WILLOW_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_willow_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> WITCH_HAZEL_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("witch_hazel_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    public static final DeferredHolder<Block, Block> ZELKOVA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("zelkova_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE)));
    *///?} else {
    //? if old_props {
    /*private static net.minecraft.world.level.block.state.BlockBehaviour.Properties cauldronProps() {
        return net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CAULDRON);
    }
    private static net.minecraft.world.level.block.state.BlockBehaviour.Properties barrelProps() {
        return net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.BARREL);
    }
    private static net.minecraft.world.level.block.state.BlockBehaviour.Properties craftingTableProps() {
        return net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE);
    }
    private static net.minecraft.world.level.block.state.BlockBehaviour.Properties anvilProps() {
        return net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.ANVIL).noOcclusion();
    }
    private static net.minecraft.world.level.block.state.BlockBehaviour.Properties hopperProps() {
        return net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.HOPPER);
    }
    *///?} else {
    private static net.minecraft.world.level.block.state.BlockBehaviour.Properties cauldronProps() {
        return net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.CAULDRON);
    }
    private static net.minecraft.world.level.block.state.BlockBehaviour.Properties barrelProps() {
        return net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.BARREL);
    }
    private static net.minecraft.world.level.block.state.BlockBehaviour.Properties craftingTableProps() {
        return net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.CRAFTING_TABLE);
    }
    private static net.minecraft.world.level.block.state.BlockBehaviour.Properties anvilProps() {
        return net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.ANVIL).noOcclusion();
    }
    private static net.minecraft.world.level.block.state.BlockBehaviour.Properties hopperProps() {
        return net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.HOPPER);
    }
    //?}
    public static final RegistryObject<Block> OAK_WOODEN_CAULDRON = BLOCKS.register("oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> SPRUCE_WOODEN_CAULDRON = BLOCKS.register("spruce_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BIRCH_WOODEN_CAULDRON = BLOCKS.register("birch_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> JUNGLE_WOODEN_CAULDRON = BLOCKS.register("jungle_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> ACACIA_WOODEN_CAULDRON = BLOCKS.register("acacia_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> DARK_OAK_WOODEN_CAULDRON = BLOCKS.register("dark_oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> MANGROVE_WOODEN_CAULDRON = BLOCKS.register("mangrove_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> CHERRY_WOODEN_CAULDRON = BLOCKS.register("cherry_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BAMBOO_WOODEN_CAULDRON = BLOCKS.register("bamboo_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> CRIMSON_WOODEN_CAULDRON = BLOCKS.register("crimson_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> WARPED_WOODEN_CAULDRON = BLOCKS.register("warped_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> TWILIGHT_OAK_WOODEN_CAULDRON = BLOCKS.register("twilight_oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> CANOPY_WOODEN_CAULDRON = BLOCKS.register("canopy_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> TWILIGHT_MANGROVE_WOODEN_CAULDRON = BLOCKS.register("twilight_mangrove_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> DARK_WOODEN_CAULDRON = BLOCKS.register("dark_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> TIME_WOODEN_CAULDRON = BLOCKS.register("time_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> MINING_WOODEN_CAULDRON = BLOCKS.register("mining_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> SORTING_WOODEN_CAULDRON = BLOCKS.register("sorting_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> TOWERWOOD_WOODEN_CAULDRON = BLOCKS.register("towerwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> FIR_WOODEN_CAULDRON = BLOCKS.register("fir_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> PINE_WOODEN_CAULDRON = BLOCKS.register("pine_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> MAPLE_WOODEN_CAULDRON = BLOCKS.register("maple_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> REDWOOD_WOODEN_CAULDRON = BLOCKS.register("redwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> MAHOGANY_WOODEN_CAULDRON = BLOCKS.register("mahogany_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> JACARANDA_WOODEN_CAULDRON = BLOCKS.register("jacaranda_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> PALM_WOODEN_CAULDRON = BLOCKS.register("palm_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> WILLOW_WOODEN_CAULDRON = BLOCKS.register("willow_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> DEAD_WOODEN_CAULDRON = BLOCKS.register("dead_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> MAGIC_WOODEN_CAULDRON = BLOCKS.register("magic_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> UMBRAN_WOODEN_CAULDRON = BLOCKS.register("umbran_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> HELLBARK_WOODEN_CAULDRON = BLOCKS.register("hellbark_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> EMPYREAL_WOODEN_CAULDRON = BLOCKS.register("empyreal_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> ROSEROOT_WOODEN_CAULDRON = BLOCKS.register("roseroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> YAGROOT_WOODEN_CAULDRON = BLOCKS.register("yagroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> CRUDEROOT_WOODEN_CAULDRON = BLOCKS.register("cruderoot_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> CONBERRY_WOODEN_CAULDRON = BLOCKS.register("conberry_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> SUNROOT_WOODEN_CAULDRON = BLOCKS.register("sunroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> SKYROOT_WOODEN_CAULDRON = BLOCKS.register("skyroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> ASPEN_WOODEN_CAULDRON = BLOCKS.register("aspen_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BAOBAB_WOODEN_CAULDRON = BLOCKS.register("baobab_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BLUE_ENCHANTED_WOODEN_CAULDRON = BLOCKS.register("blue_enchanted_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> CIKA_WOODEN_CAULDRON = BLOCKS.register("cika_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> CYPRESS_WOODEN_CAULDRON = BLOCKS.register("cypress_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> EBONY_WOODEN_CAULDRON = BLOCKS.register("ebony_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BWG_FIR_WOODEN_CAULDRON = BLOCKS.register("bwg_fir_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> FLORUS_WOODEN_CAULDRON = BLOCKS.register("florus_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> GREEN_ENCHANTED_WOODEN_CAULDRON = BLOCKS.register("green_enchanted_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> HOLLY_WOODEN_CAULDRON = BLOCKS.register("holly_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> IRONWOOD_WOODEN_CAULDRON = BLOCKS.register("ironwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BWG_JACARANDA_WOODEN_CAULDRON = BLOCKS.register("bwg_jacaranda_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BWG_MAHOGANY_WOODEN_CAULDRON = BLOCKS.register("bwg_mahogany_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BWG_MAPLE_WOODEN_CAULDRON = BLOCKS.register("bwg_maple_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BWG_PALM_WOODEN_CAULDRON = BLOCKS.register("bwg_palm_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BWG_PINE_WOODEN_CAULDRON = BLOCKS.register("bwg_pine_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> RAINBOW_EUCALYPTUS_WOODEN_CAULDRON = BLOCKS.register("rainbow_eucalyptus_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BWG_REDWOOD_WOODEN_CAULDRON = BLOCKS.register("bwg_redwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> SAKURA_WOODEN_CAULDRON = BLOCKS.register("sakura_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> SKYRIS_WOODEN_CAULDRON = BLOCKS.register("skyris_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> WHITE_MANGROVE_WOODEN_CAULDRON = BLOCKS.register("white_mangrove_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BWG_WILLOW_WOODEN_CAULDRON = BLOCKS.register("bwg_willow_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> WITCH_HAZEL_WOODEN_CAULDRON = BLOCKS.register("witch_hazel_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> ZELKOVA_WOODEN_CAULDRON = BLOCKS.register("zelkova_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final List<RegistryObject<Block>> ALL_WOODEN_CAULDRONS = List.of(
        OAK_WOODEN_CAULDRON, SPRUCE_WOODEN_CAULDRON, BIRCH_WOODEN_CAULDRON,
        JUNGLE_WOODEN_CAULDRON, ACACIA_WOODEN_CAULDRON, DARK_OAK_WOODEN_CAULDRON,
        MANGROVE_WOODEN_CAULDRON, CHERRY_WOODEN_CAULDRON, BAMBOO_WOODEN_CAULDRON,
        CRIMSON_WOODEN_CAULDRON, WARPED_WOODEN_CAULDRON,
        TWILIGHT_OAK_WOODEN_CAULDRON, CANOPY_WOODEN_CAULDRON, TWILIGHT_MANGROVE_WOODEN_CAULDRON,
        DARK_WOODEN_CAULDRON, TIME_WOODEN_CAULDRON, MINING_WOODEN_CAULDRON,
        SORTING_WOODEN_CAULDRON, TOWERWOOD_WOODEN_CAULDRON,
        FIR_WOODEN_CAULDRON, PINE_WOODEN_CAULDRON, MAPLE_WOODEN_CAULDRON,
        REDWOOD_WOODEN_CAULDRON, MAHOGANY_WOODEN_CAULDRON, JACARANDA_WOODEN_CAULDRON,
        PALM_WOODEN_CAULDRON, WILLOW_WOODEN_CAULDRON, DEAD_WOODEN_CAULDRON,
        MAGIC_WOODEN_CAULDRON, UMBRAN_WOODEN_CAULDRON, HELLBARK_WOODEN_CAULDRON,
        EMPYREAL_WOODEN_CAULDRON, ROSEROOT_WOODEN_CAULDRON, YAGROOT_WOODEN_CAULDRON,
        CRUDEROOT_WOODEN_CAULDRON, CONBERRY_WOODEN_CAULDRON, SUNROOT_WOODEN_CAULDRON,
        SKYROOT_WOODEN_CAULDRON,
        ASPEN_WOODEN_CAULDRON,
        BAOBAB_WOODEN_CAULDRON,
        BLUE_ENCHANTED_WOODEN_CAULDRON,
        CIKA_WOODEN_CAULDRON,
        CYPRESS_WOODEN_CAULDRON,
        EBONY_WOODEN_CAULDRON,
        BWG_FIR_WOODEN_CAULDRON,
        FLORUS_WOODEN_CAULDRON,
        GREEN_ENCHANTED_WOODEN_CAULDRON,
        HOLLY_WOODEN_CAULDRON,
        IRONWOOD_WOODEN_CAULDRON,
        BWG_JACARANDA_WOODEN_CAULDRON,
        BWG_MAHOGANY_WOODEN_CAULDRON,
        BWG_MAPLE_WOODEN_CAULDRON,
        BWG_PALM_WOODEN_CAULDRON,
        BWG_PINE_WOODEN_CAULDRON,
        RAINBOW_EUCALYPTUS_WOODEN_CAULDRON,
        BWG_REDWOOD_WOODEN_CAULDRON,
        SAKURA_WOODEN_CAULDRON,
        SKYRIS_WOODEN_CAULDRON,
        WHITE_MANGROVE_WOODEN_CAULDRON,
        BWG_WILLOW_WOODEN_CAULDRON,
        WITCH_HAZEL_WOODEN_CAULDRON,
        ZELKOVA_WOODEN_CAULDRON
    );

    public static final RegistryObject<Block> WOODEN_BARREL = BLOCKS.register("wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> OAK_WOODEN_BARREL = BLOCKS.register("oak_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> SPRUCE_WOODEN_BARREL = BLOCKS.register("spruce_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> BIRCH_WOODEN_BARREL = BLOCKS.register("birch_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> JUNGLE_WOODEN_BARREL = BLOCKS.register("jungle_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> ACACIA_WOODEN_BARREL = BLOCKS.register("acacia_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> DARK_OAK_WOODEN_BARREL = BLOCKS.register("dark_oak_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> MANGROVE_WOODEN_BARREL = BLOCKS.register("mangrove_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> CHERRY_WOODEN_BARREL = BLOCKS.register("cherry_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> BAMBOO_WOODEN_BARREL = BLOCKS.register("bamboo_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> CRIMSON_WOODEN_BARREL = BLOCKS.register("crimson_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> WARPED_WOODEN_BARREL = BLOCKS.register("warped_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> TWILIGHT_OAK_WOODEN_BARREL = BLOCKS.register("twilight_oak_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> CANOPY_WOODEN_BARREL = BLOCKS.register("canopy_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> TWILIGHT_MANGROVE_WOODEN_BARREL = BLOCKS.register("twilight_mangrove_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> DARK_WOODEN_BARREL = BLOCKS.register("dark_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> TIME_WOODEN_BARREL = BLOCKS.register("time_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> TRANSFORMATION_WOODEN_BARREL = BLOCKS.register("transformation_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> MINING_WOODEN_BARREL = BLOCKS.register("mining_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> SORTING_WOODEN_BARREL = BLOCKS.register("sorting_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> TOWERWOOD_WOODEN_BARREL = BLOCKS.register("towerwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> FIR_WOODEN_BARREL = BLOCKS.register("fir_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> PINE_WOODEN_BARREL = BLOCKS.register("pine_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> MAPLE_WOODEN_BARREL = BLOCKS.register("maple_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> REDWOOD_WOODEN_BARREL = BLOCKS.register("redwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> MAHOGANY_WOODEN_BARREL = BLOCKS.register("mahogany_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> JACARANDA_WOODEN_BARREL = BLOCKS.register("jacaranda_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> PALM_WOODEN_BARREL = BLOCKS.register("palm_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> WILLOW_WOODEN_BARREL = BLOCKS.register("willow_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> DEAD_WOODEN_BARREL = BLOCKS.register("dead_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> MAGIC_WOODEN_BARREL = BLOCKS.register("magic_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> UMBRAN_WOODEN_BARREL = BLOCKS.register("umbran_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> HELLBARK_WOODEN_BARREL = BLOCKS.register("hellbark_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> EMPYREAL_WOODEN_BARREL = BLOCKS.register("empyreal_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> ROSEROOT_WOODEN_BARREL = BLOCKS.register("roseroot_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> YAGROOT_WOODEN_BARREL = BLOCKS.register("yagroot_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> CRUDEROOT_WOODEN_BARREL = BLOCKS.register("cruderoot_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> CONBERRY_WOODEN_BARREL = BLOCKS.register("conberry_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> SUNROOT_WOODEN_BARREL = BLOCKS.register("sunroot_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> SKYROOT_WOODEN_BARREL = BLOCKS.register("skyroot_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    public static final RegistryObject<Block> ASPEN_WOODEN_BARREL = BLOCKS.register("aspen_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> BAOBAB_WOODEN_BARREL = BLOCKS.register("baobab_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> BLUE_ENCHANTED_WOODEN_BARREL = BLOCKS.register("blue_enchanted_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> CIKA_WOODEN_BARREL = BLOCKS.register("cika_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> CYPRESS_WOODEN_BARREL = BLOCKS.register("cypress_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> EBONY_WOODEN_BARREL = BLOCKS.register("ebony_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> BWG_FIR_WOODEN_BARREL = BLOCKS.register("bwg_fir_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> FLORUS_WOODEN_BARREL = BLOCKS.register("florus_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> GREEN_ENCHANTED_WOODEN_BARREL = BLOCKS.register("green_enchanted_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> HOLLY_WOODEN_BARREL = BLOCKS.register("holly_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> IRONWOOD_WOODEN_BARREL = BLOCKS.register("ironwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> BWG_JACARANDA_WOODEN_BARREL = BLOCKS.register("bwg_jacaranda_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> BWG_MAHOGANY_WOODEN_BARREL = BLOCKS.register("bwg_mahogany_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> BWG_MAPLE_WOODEN_BARREL = BLOCKS.register("bwg_maple_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> BWG_PALM_WOODEN_BARREL = BLOCKS.register("bwg_palm_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> BWG_PINE_WOODEN_BARREL = BLOCKS.register("bwg_pine_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> RAINBOW_EUCALYPTUS_WOODEN_BARREL = BLOCKS.register("rainbow_eucalyptus_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> BWG_REDWOOD_WOODEN_BARREL = BLOCKS.register("bwg_redwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> SAKURA_WOODEN_BARREL = BLOCKS.register("sakura_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> SKYRIS_WOODEN_BARREL = BLOCKS.register("skyris_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> WHITE_MANGROVE_WOODEN_BARREL = BLOCKS.register("white_mangrove_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> BWG_WILLOW_WOODEN_BARREL = BLOCKS.register("bwg_willow_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> WITCH_HAZEL_WOODEN_BARREL = BLOCKS.register("witch_hazel_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> ZELKOVA_WOODEN_BARREL = BLOCKS.register("zelkova_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final RegistryObject<Block> WOODEN_ANVIL = BLOCKS.register("wooden_anvil",
        () -> new WoodenAnvilBlock(anvilProps()));

    public static final RegistryObject<Block> OAK_WOODEN_HOPPER = BLOCKS.register("oak_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> SPRUCE_WOODEN_HOPPER = BLOCKS.register("spruce_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BIRCH_WOODEN_HOPPER = BLOCKS.register("birch_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> JUNGLE_WOODEN_HOPPER = BLOCKS.register("jungle_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> ACACIA_WOODEN_HOPPER = BLOCKS.register("acacia_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> DARK_OAK_WOODEN_HOPPER = BLOCKS.register("dark_oak_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> MANGROVE_WOODEN_HOPPER = BLOCKS.register("mangrove_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> CHERRY_WOODEN_HOPPER = BLOCKS.register("cherry_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BAMBOO_WOODEN_HOPPER = BLOCKS.register("bamboo_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> CRIMSON_WOODEN_HOPPER = BLOCKS.register("crimson_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> WARPED_WOODEN_HOPPER = BLOCKS.register("warped_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> TWILIGHT_OAK_WOODEN_HOPPER = BLOCKS.register("twilight_oak_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> CANOPY_WOODEN_HOPPER = BLOCKS.register("canopy_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> TWILIGHT_MANGROVE_WOODEN_HOPPER = BLOCKS.register("twilight_mangrove_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> DARK_WOODEN_HOPPER = BLOCKS.register("dark_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> TIME_WOODEN_HOPPER = BLOCKS.register("time_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> MINING_WOODEN_HOPPER = BLOCKS.register("mining_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> SORTING_WOODEN_HOPPER = BLOCKS.register("sorting_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> TOWERWOOD_WOODEN_HOPPER = BLOCKS.register("towerwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> FIR_WOODEN_HOPPER = BLOCKS.register("fir_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> PINE_WOODEN_HOPPER = BLOCKS.register("pine_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> MAPLE_WOODEN_HOPPER = BLOCKS.register("maple_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> REDWOOD_WOODEN_HOPPER = BLOCKS.register("redwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> MAHOGANY_WOODEN_HOPPER = BLOCKS.register("mahogany_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> JACARANDA_WOODEN_HOPPER = BLOCKS.register("jacaranda_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> PALM_WOODEN_HOPPER = BLOCKS.register("palm_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> WILLOW_WOODEN_HOPPER = BLOCKS.register("willow_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> DEAD_WOODEN_HOPPER = BLOCKS.register("dead_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> MAGIC_WOODEN_HOPPER = BLOCKS.register("magic_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> UMBRAN_WOODEN_HOPPER = BLOCKS.register("umbran_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> HELLBARK_WOODEN_HOPPER = BLOCKS.register("hellbark_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> EMPYREAL_WOODEN_HOPPER = BLOCKS.register("empyreal_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> ROSEROOT_WOODEN_HOPPER = BLOCKS.register("roseroot_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> YAGROOT_WOODEN_HOPPER = BLOCKS.register("yagroot_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> CRUDEROOT_WOODEN_HOPPER = BLOCKS.register("cruderoot_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> CONBERRY_WOODEN_HOPPER = BLOCKS.register("conberry_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> SUNROOT_WOODEN_HOPPER = BLOCKS.register("sunroot_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> SKYROOT_WOODEN_HOPPER = BLOCKS.register("skyroot_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> ASPEN_WOODEN_HOPPER = BLOCKS.register("aspen_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BAOBAB_WOODEN_HOPPER = BLOCKS.register("baobab_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BLUE_ENCHANTED_WOODEN_HOPPER = BLOCKS.register("blue_enchanted_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> CIKA_WOODEN_HOPPER = BLOCKS.register("cika_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> CYPRESS_WOODEN_HOPPER = BLOCKS.register("cypress_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> EBONY_WOODEN_HOPPER = BLOCKS.register("ebony_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BWG_FIR_WOODEN_HOPPER = BLOCKS.register("bwg_fir_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> FLORUS_WOODEN_HOPPER = BLOCKS.register("florus_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> GREEN_ENCHANTED_WOODEN_HOPPER = BLOCKS.register("green_enchanted_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> HOLLY_WOODEN_HOPPER = BLOCKS.register("holly_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> IRONWOOD_WOODEN_HOPPER = BLOCKS.register("ironwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BWG_JACARANDA_WOODEN_HOPPER = BLOCKS.register("bwg_jacaranda_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BWG_MAHOGANY_WOODEN_HOPPER = BLOCKS.register("bwg_mahogany_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BWG_MAPLE_WOODEN_HOPPER = BLOCKS.register("bwg_maple_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BWG_PALM_WOODEN_HOPPER = BLOCKS.register("bwg_palm_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BWG_PINE_WOODEN_HOPPER = BLOCKS.register("bwg_pine_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> RAINBOW_EUCALYPTUS_WOODEN_HOPPER = BLOCKS.register("rainbow_eucalyptus_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BWG_REDWOOD_WOODEN_HOPPER = BLOCKS.register("bwg_redwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> SAKURA_WOODEN_HOPPER = BLOCKS.register("sakura_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> SKYRIS_WOODEN_HOPPER = BLOCKS.register("skyris_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> WHITE_MANGROVE_WOODEN_HOPPER = BLOCKS.register("white_mangrove_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BWG_WILLOW_WOODEN_HOPPER = BLOCKS.register("bwg_willow_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> WITCH_HAZEL_WOODEN_HOPPER = BLOCKS.register("witch_hazel_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> ZELKOVA_WOODEN_HOPPER = BLOCKS.register("zelkova_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));

    public static final RegistryObject<Block> WOODEN_CRAFTING_TABLE = BLOCKS.register("wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> OAK_WOODEN_CRAFTING_TABLE = BLOCKS.register("oak_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> SPRUCE_WOODEN_CRAFTING_TABLE = BLOCKS.register("spruce_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BIRCH_WOODEN_CRAFTING_TABLE = BLOCKS.register("birch_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> JUNGLE_WOODEN_CRAFTING_TABLE = BLOCKS.register("jungle_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> ACACIA_WOODEN_CRAFTING_TABLE = BLOCKS.register("acacia_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> DARK_OAK_WOODEN_CRAFTING_TABLE = BLOCKS.register("dark_oak_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> MANGROVE_WOODEN_CRAFTING_TABLE = BLOCKS.register("mangrove_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> CHERRY_WOODEN_CRAFTING_TABLE = BLOCKS.register("cherry_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BAMBOO_WOODEN_CRAFTING_TABLE = BLOCKS.register("bamboo_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> CRIMSON_WOODEN_CRAFTING_TABLE = BLOCKS.register("crimson_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> WARPED_WOODEN_CRAFTING_TABLE = BLOCKS.register("warped_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> TWILIGHT_OAK_WOODEN_CRAFTING_TABLE = BLOCKS.register("twilight_oak_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> CANOPY_WOODEN_CRAFTING_TABLE = BLOCKS.register("canopy_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> TWILIGHT_MANGROVE_WOODEN_CRAFTING_TABLE = BLOCKS.register("twilight_mangrove_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> DARK_WOODEN_CRAFTING_TABLE = BLOCKS.register("dark_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> TIME_WOODEN_CRAFTING_TABLE = BLOCKS.register("time_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> TRANSFORMATION_WOODEN_CRAFTING_TABLE = BLOCKS.register("transformation_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> MINING_WOODEN_CRAFTING_TABLE = BLOCKS.register("mining_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> SORTING_WOODEN_CRAFTING_TABLE = BLOCKS.register("sorting_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> TOWERWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("towerwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> FIR_WOODEN_CRAFTING_TABLE = BLOCKS.register("fir_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> PINE_WOODEN_CRAFTING_TABLE = BLOCKS.register("pine_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> MAPLE_WOODEN_CRAFTING_TABLE = BLOCKS.register("maple_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> REDWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("redwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> MAHOGANY_WOODEN_CRAFTING_TABLE = BLOCKS.register("mahogany_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> JACARANDA_WOODEN_CRAFTING_TABLE = BLOCKS.register("jacaranda_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> PALM_WOODEN_CRAFTING_TABLE = BLOCKS.register("palm_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> WILLOW_WOODEN_CRAFTING_TABLE = BLOCKS.register("willow_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> DEAD_WOODEN_CRAFTING_TABLE = BLOCKS.register("dead_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> MAGIC_WOODEN_CRAFTING_TABLE = BLOCKS.register("magic_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> UMBRAN_WOODEN_CRAFTING_TABLE = BLOCKS.register("umbran_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> HELLBARK_WOODEN_CRAFTING_TABLE = BLOCKS.register("hellbark_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> EMPYREAL_WOODEN_CRAFTING_TABLE = BLOCKS.register("empyreal_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> ROSEROOT_WOODEN_CRAFTING_TABLE = BLOCKS.register("roseroot_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> YAGROOT_WOODEN_CRAFTING_TABLE = BLOCKS.register("yagroot_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> CRUDEROOT_WOODEN_CRAFTING_TABLE = BLOCKS.register("cruderoot_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> CONBERRY_WOODEN_CRAFTING_TABLE = BLOCKS.register("conberry_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> SUNROOT_WOODEN_CRAFTING_TABLE = BLOCKS.register("sunroot_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> SKYROOT_WOODEN_CRAFTING_TABLE = BLOCKS.register("skyroot_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> ASPEN_WOODEN_CRAFTING_TABLE = BLOCKS.register("aspen_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BAOBAB_WOODEN_CRAFTING_TABLE = BLOCKS.register("baobab_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BLUE_ENCHANTED_WOODEN_CRAFTING_TABLE = BLOCKS.register("blue_enchanted_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> CIKA_WOODEN_CRAFTING_TABLE = BLOCKS.register("cika_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> CYPRESS_WOODEN_CRAFTING_TABLE = BLOCKS.register("cypress_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> EBONY_WOODEN_CRAFTING_TABLE = BLOCKS.register("ebony_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_FIR_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_fir_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> FLORUS_WOODEN_CRAFTING_TABLE = BLOCKS.register("florus_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> GREEN_ENCHANTED_WOODEN_CRAFTING_TABLE = BLOCKS.register("green_enchanted_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> HOLLY_WOODEN_CRAFTING_TABLE = BLOCKS.register("holly_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> IRONWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("ironwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_JACARANDA_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_jacaranda_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_MAHOGANY_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_mahogany_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_MAPLE_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_maple_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_PALM_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_palm_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_PINE_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_pine_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> RAINBOW_EUCALYPTUS_WOODEN_CRAFTING_TABLE = BLOCKS.register("rainbow_eucalyptus_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_REDWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_redwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> SAKURA_WOODEN_CRAFTING_TABLE = BLOCKS.register("sakura_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> SKYRIS_WOODEN_CRAFTING_TABLE = BLOCKS.register("skyris_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> WHITE_MANGROVE_WOODEN_CRAFTING_TABLE = BLOCKS.register("white_mangrove_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_WILLOW_WOODEN_CRAFTING_TABLE = BLOCKS.register("bwg_willow_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> WITCH_HAZEL_WOODEN_CRAFTING_TABLE = BLOCKS.register("witch_hazel_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> ZELKOVA_WOODEN_CRAFTING_TABLE = BLOCKS.register("zelkova_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("oak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> SPRUCE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("spruce_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BIRCH_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("birch_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> JUNGLE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("jungle_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> ACACIA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("acacia_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> DARK_OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("dark_oak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("mangrove_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> CHERRY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cherry_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BAMBOO_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bamboo_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> CRIMSON_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("crimson_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> WARPED_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("warped_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> TWILIGHT_OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("twilight_oak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> CANOPY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("canopy_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> TWILIGHT_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("twilight_mangrove_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> DARK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("dark_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> TIME_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("time_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> TRANSFORMATION_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("transformation_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> MINING_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("mining_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> SORTING_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sorting_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> TOWERWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("towerwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> FIR_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("fir_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> PINE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("pine_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> MAPLE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("maple_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> REDWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("redwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("mahogany_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> JACARANDA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("jacaranda_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> PALM_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("palm_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> WILLOW_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("willow_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> DEAD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("dead_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> MAGIC_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("magic_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> UMBRAN_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("umbran_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> HELLBARK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("hellbark_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> EMPYREAL_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("empyreal_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> ROSEROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("roseroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> YAGROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("yagroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> CRUDEROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cruderoot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> CONBERRY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("conberry_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> SUNROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sunroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> SKYROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("skyroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> ASPEN_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("aspen_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BAOBAB_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("baobab_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BLUE_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("blue_enchanted_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> CIKA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cika_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> CYPRESS_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cypress_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> EBONY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("ebony_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_FIR_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_fir_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> FLORUS_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("florus_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> GREEN_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("green_enchanted_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> HOLLY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("holly_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> IRONWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("ironwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_JACARANDA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_jacaranda_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_mahogany_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_MAPLE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_maple_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_PALM_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_palm_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_PINE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_pine_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> RAINBOW_EUCALYPTUS_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("rainbow_eucalyptus_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_REDWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_redwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> SAKURA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sakura_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> SKYRIS_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("skyris_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> WHITE_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("white_mangrove_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BWG_WILLOW_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_willow_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> WITCH_HAZEL_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("witch_hazel_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> ZELKOVA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("zelkova_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));

    //?}

    private ModBlocks() {
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

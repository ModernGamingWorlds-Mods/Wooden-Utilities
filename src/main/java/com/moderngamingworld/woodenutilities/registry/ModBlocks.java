package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenAnvilBlock;
import com.moderngamingworld.woodenutilities.WoodenBarrelBlock;
import com.moderngamingworld.woodenutilities.WoodenChestBlock;
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
import com.moderngamingworld.woodenutilities.registry.ModSaplingGrowers;
import com.moderngamingworld.woodenutilities.registry.ModWoodTypes;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.ButtonBlock;
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
        // ── Wooden Cauldrons ──────────────────────────────────────────
        // ── Vanilla ───────────────────────────────────────────────────
    /*public static final DeferredHolder<Block, Block> OAK_WOODEN_CAULDRON = BLOCKS.register("oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> SPRUCE_WOODEN_CAULDRON = BLOCKS.register("spruce_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BIRCH_WOODEN_CAULDRON = BLOCKS.register("birch_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> JUNGLE_WOODEN_CAULDRON = BLOCKS.register("jungle_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> ACACIA_WOODEN_CAULDRON = BLOCKS.register("acacia_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> DARK_OAK_WOODEN_CAULDRON = BLOCKS.register("dark_oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> MANGROVE_WOODEN_CAULDRON = BLOCKS.register("mangrove_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> CHERRY_WOODEN_CAULDRON = BLOCKS.register("cherry_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BAMBOO_WOODEN_CAULDRON = BLOCKS.register("bamboo_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> CRIMSON_WOODEN_CAULDRON = BLOCKS.register("crimson_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> WARPED_WOODEN_CAULDRON = BLOCKS.register("warped_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));

    // ── Twilight Forest ────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> TWILIGHT_OAK_WOODEN_CAULDRON = BLOCKS.register("twilight_oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> CANOPY_WOODEN_CAULDRON = BLOCKS.register("canopy_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> TWILIGHT_MANGROVE_WOODEN_CAULDRON = BLOCKS.register("twilight_mangrove_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> DARK_WOODEN_CAULDRON = BLOCKS.register("dark_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> TIME_WOODEN_CAULDRON = BLOCKS.register("time_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> MINING_WOODEN_CAULDRON = BLOCKS.register("mining_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> SORTING_WOODEN_CAULDRON = BLOCKS.register("sorting_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> TOWERWOOD_WOODEN_CAULDRON = BLOCKS.register("towerwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));

    // ── Biomes O'Plenty ──────────────────────────────────────────
    public static final DeferredHolder<Block, Block> FIR_WOODEN_CAULDRON = BLOCKS.register("fir_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> PINE_WOODEN_CAULDRON = BLOCKS.register("pine_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> MAPLE_WOODEN_CAULDRON = BLOCKS.register("maple_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> REDWOOD_WOODEN_CAULDRON = BLOCKS.register("redwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> MAHOGANY_WOODEN_CAULDRON = BLOCKS.register("mahogany_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> JACARANDA_WOODEN_CAULDRON = BLOCKS.register("jacaranda_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> PALM_WOODEN_CAULDRON = BLOCKS.register("palm_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> WILLOW_WOODEN_CAULDRON = BLOCKS.register("willow_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> DEAD_WOODEN_CAULDRON = BLOCKS.register("dead_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> MAGIC_WOODEN_CAULDRON = BLOCKS.register("magic_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> UMBRAN_WOODEN_CAULDRON = BLOCKS.register("umbran_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> HELLBARK_WOODEN_CAULDRON = BLOCKS.register("hellbark_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> EMPYREAL_WOODEN_CAULDRON = BLOCKS.register("empyreal_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));

    // ── Deep Aether ──────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> ROSEROOT_WOODEN_CAULDRON = BLOCKS.register("roseroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> YAGROOT_WOODEN_CAULDRON = BLOCKS.register("yagroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> CRUDEROOT_WOODEN_CAULDRON = BLOCKS.register("cruderoot_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> CONBERRY_WOODEN_CAULDRON = BLOCKS.register("conberry_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> SUNROOT_WOODEN_CAULDRON = BLOCKS.register("sunroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));

    // ── Aether ───────────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> SKYROOT_WOODEN_CAULDRON = BLOCKS.register("skyroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));

    // ── Biomes We've Gone ────────────────────────────────────────
    public static final DeferredHolder<Block, Block> ASPEN_WOODEN_CAULDRON = BLOCKS.register("aspen_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BAOBAB_WOODEN_CAULDRON = BLOCKS.register("baobab_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BLUE_ENCHANTED_WOODEN_CAULDRON = BLOCKS.register("blue_enchanted_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> CIKA_WOODEN_CAULDRON = BLOCKS.register("cika_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> CYPRESS_WOODEN_CAULDRON = BLOCKS.register("cypress_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> EBONY_WOODEN_CAULDRON = BLOCKS.register("ebony_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BWG_FIR_WOODEN_CAULDRON = BLOCKS.register("bwg_fir_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> FLORUS_WOODEN_CAULDRON = BLOCKS.register("florus_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> GREEN_ENCHANTED_WOODEN_CAULDRON = BLOCKS.register("green_enchanted_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> HOLLY_WOODEN_CAULDRON = BLOCKS.register("holly_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> IRONWOOD_WOODEN_CAULDRON = BLOCKS.register("ironwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BWG_JACARANDA_WOODEN_CAULDRON = BLOCKS.register("bwg_jacaranda_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BWG_MAHOGANY_WOODEN_CAULDRON = BLOCKS.register("bwg_mahogany_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BWG_MAPLE_WOODEN_CAULDRON = BLOCKS.register("bwg_maple_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BWG_PALM_WOODEN_CAULDRON = BLOCKS.register("bwg_palm_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BWG_PINE_WOODEN_CAULDRON = BLOCKS.register("bwg_pine_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> RAINBOW_EUCALYPTUS_WOODEN_CAULDRON = BLOCKS.register("rainbow_eucalyptus_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BWG_REDWOOD_WOODEN_CAULDRON = BLOCKS.register("bwg_redwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> SAKURA_WOODEN_CAULDRON = BLOCKS.register("sakura_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> SKYRIS_WOODEN_CAULDRON = BLOCKS.register("skyris_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> SPIRIT_WOODEN_CAULDRON = BLOCKS.register("spirit_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> WHITE_MANGROVE_WOODEN_CAULDRON = BLOCKS.register("white_mangrove_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BWG_WILLOW_WOODEN_CAULDRON = BLOCKS.register("bwg_willow_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> WITCH_HAZEL_WOODEN_CAULDRON = BLOCKS.register("witch_hazel_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> ZELKOVA_WOODEN_CAULDRON = BLOCKS.register("zelkova_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
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

        // ── Wooden Barrels ────────────────────────────────────────────
        // ── Vanilla ───────────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> WOODEN_BARREL = BLOCKS.register("wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> OAK_WOODEN_BARREL = BLOCKS.register("oak_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> SPRUCE_WOODEN_BARREL = BLOCKS.register("spruce_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> BIRCH_WOODEN_BARREL = BLOCKS.register("birch_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> JUNGLE_WOODEN_BARREL = BLOCKS.register("jungle_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> ACACIA_WOODEN_BARREL = BLOCKS.register("acacia_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> DARK_OAK_WOODEN_BARREL = BLOCKS.register("dark_oak_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> MANGROVE_WOODEN_BARREL = BLOCKS.register("mangrove_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> CHERRY_WOODEN_BARREL = BLOCKS.register("cherry_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> BAMBOO_WOODEN_BARREL = BLOCKS.register("bamboo_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> CRIMSON_WOODEN_BARREL = BLOCKS.register("crimson_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> WARPED_WOODEN_BARREL = BLOCKS.register("warped_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Twilight Forest ────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> TWILIGHT_OAK_WOODEN_BARREL = BLOCKS.register("twilight_oak_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> CANOPY_WOODEN_BARREL = BLOCKS.register("canopy_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> TWILIGHT_MANGROVE_WOODEN_BARREL = BLOCKS.register("twilight_mangrove_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> DARK_WOODEN_BARREL = BLOCKS.register("dark_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> TIME_WOODEN_BARREL = BLOCKS.register("time_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> TRANSFORMATION_WOODEN_BARREL = BLOCKS.register("transformation_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> MINING_WOODEN_BARREL = BLOCKS.register("mining_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> SORTING_WOODEN_BARREL = BLOCKS.register("sorting_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> TOWERWOOD_WOODEN_BARREL = BLOCKS.register("towerwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Biomes O'Plenty ──────────────────────────────────────────
    public static final DeferredHolder<Block, Block> FIR_WOODEN_BARREL = BLOCKS.register("fir_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> PINE_WOODEN_BARREL = BLOCKS.register("pine_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> MAPLE_WOODEN_BARREL = BLOCKS.register("maple_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> REDWOOD_WOODEN_BARREL = BLOCKS.register("redwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> MAHOGANY_WOODEN_BARREL = BLOCKS.register("mahogany_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> JACARANDA_WOODEN_BARREL = BLOCKS.register("jacaranda_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> PALM_WOODEN_BARREL = BLOCKS.register("palm_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> WILLOW_WOODEN_BARREL = BLOCKS.register("willow_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> DEAD_WOODEN_BARREL = BLOCKS.register("dead_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> MAGIC_WOODEN_BARREL = BLOCKS.register("magic_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> UMBRAN_WOODEN_BARREL = BLOCKS.register("umbran_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> HELLBARK_WOODEN_BARREL = BLOCKS.register("hellbark_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> EMPYREAL_WOODEN_BARREL = BLOCKS.register("empyreal_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Deep Aether ──────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> ROSEROOT_WOODEN_BARREL = BLOCKS.register("roseroot_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> YAGROOT_WOODEN_BARREL = BLOCKS.register("yagroot_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> CRUDEROOT_WOODEN_BARREL = BLOCKS.register("cruderoot_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> CONBERRY_WOODEN_BARREL = BLOCKS.register("conberry_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> SUNROOT_WOODEN_BARREL = BLOCKS.register("sunroot_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Aether ───────────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> SKYROOT_WOODEN_BARREL = BLOCKS.register("skyroot_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));


    // ── Biomes We've Gone ────────────────────────────────────────
    public static final DeferredHolder<Block, Block> ASPEN_WOODEN_BARREL = BLOCKS.register("aspen_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> BAOBAB_WOODEN_BARREL = BLOCKS.register("baobab_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> BLUE_ENCHANTED_WOODEN_BARREL = BLOCKS.register("blue_enchanted_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> CIKA_WOODEN_BARREL = BLOCKS.register("cika_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> CYPRESS_WOODEN_BARREL = BLOCKS.register("cypress_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> EBONY_WOODEN_BARREL = BLOCKS.register("ebony_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> BWG_FIR_WOODEN_BARREL = BLOCKS.register("bwg_fir_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> FLORUS_WOODEN_BARREL = BLOCKS.register("florus_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> GREEN_ENCHANTED_WOODEN_BARREL = BLOCKS.register("green_enchanted_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> HOLLY_WOODEN_BARREL = BLOCKS.register("holly_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> IRONWOOD_WOODEN_BARREL = BLOCKS.register("ironwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> BWG_JACARANDA_WOODEN_BARREL = BLOCKS.register("bwg_jacaranda_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> BWG_MAHOGANY_WOODEN_BARREL = BLOCKS.register("bwg_mahogany_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> BWG_MAPLE_WOODEN_BARREL = BLOCKS.register("bwg_maple_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> BWG_PALM_WOODEN_BARREL = BLOCKS.register("bwg_palm_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> BWG_PINE_WOODEN_BARREL = BLOCKS.register("bwg_pine_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> RAINBOW_EUCALYPTUS_WOODEN_BARREL = BLOCKS.register("rainbow_eucalyptus_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> BWG_REDWOOD_WOODEN_BARREL = BLOCKS.register("bwg_redwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> SAKURA_WOODEN_BARREL = BLOCKS.register("sakura_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> SKYRIS_WOODEN_BARREL = BLOCKS.register("skyris_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> SPIRIT_WOODEN_BARREL = BLOCKS.register("spirit_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> WHITE_MANGROVE_WOODEN_BARREL = BLOCKS.register("white_mangrove_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> BWG_WILLOW_WOODEN_BARREL = BLOCKS.register("bwg_willow_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> WITCH_HAZEL_WOODEN_BARREL = BLOCKS.register("witch_hazel_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> ZELKOVA_WOODEN_BARREL = BLOCKS.register("zelkova_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));
    public static final DeferredHolder<Block, Block> WOODEN_ANVIL = BLOCKS.register("wooden_anvil",
        () -> new WoodenAnvilBlock(anvilProps()));

        // ── Wooden Hoppers ────────────────────────────────────────────
        // ── Vanilla ───────────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> OAK_WOODEN_HOPPER = BLOCKS.register("oak_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> SPRUCE_WOODEN_HOPPER = BLOCKS.register("spruce_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BIRCH_WOODEN_HOPPER = BLOCKS.register("birch_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> JUNGLE_WOODEN_HOPPER = BLOCKS.register("jungle_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> ACACIA_WOODEN_HOPPER = BLOCKS.register("acacia_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> DARK_OAK_WOODEN_HOPPER = BLOCKS.register("dark_oak_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> MANGROVE_WOODEN_HOPPER = BLOCKS.register("mangrove_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> CHERRY_WOODEN_HOPPER = BLOCKS.register("cherry_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BAMBOO_WOODEN_HOPPER = BLOCKS.register("bamboo_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> CRIMSON_WOODEN_HOPPER = BLOCKS.register("crimson_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> WARPED_WOODEN_HOPPER = BLOCKS.register("warped_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));

    // ── Twilight Forest ────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> TWILIGHT_OAK_WOODEN_HOPPER = BLOCKS.register("twilight_oak_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> CANOPY_WOODEN_HOPPER = BLOCKS.register("canopy_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> TWILIGHT_MANGROVE_WOODEN_HOPPER = BLOCKS.register("twilight_mangrove_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> DARK_WOODEN_HOPPER = BLOCKS.register("dark_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> TIME_WOODEN_HOPPER = BLOCKS.register("time_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> MINING_WOODEN_HOPPER = BLOCKS.register("mining_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> SORTING_WOODEN_HOPPER = BLOCKS.register("sorting_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> TOWERWOOD_WOODEN_HOPPER = BLOCKS.register("towerwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));

    // ── Biomes O'Plenty ──────────────────────────────────────────
    public static final DeferredHolder<Block, Block> FIR_WOODEN_HOPPER = BLOCKS.register("fir_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> PINE_WOODEN_HOPPER = BLOCKS.register("pine_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> MAPLE_WOODEN_HOPPER = BLOCKS.register("maple_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> REDWOOD_WOODEN_HOPPER = BLOCKS.register("redwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> MAHOGANY_WOODEN_HOPPER = BLOCKS.register("mahogany_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> JACARANDA_WOODEN_HOPPER = BLOCKS.register("jacaranda_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> PALM_WOODEN_HOPPER = BLOCKS.register("palm_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> WILLOW_WOODEN_HOPPER = BLOCKS.register("willow_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> DEAD_WOODEN_HOPPER = BLOCKS.register("dead_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> MAGIC_WOODEN_HOPPER = BLOCKS.register("magic_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> UMBRAN_WOODEN_HOPPER = BLOCKS.register("umbran_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> HELLBARK_WOODEN_HOPPER = BLOCKS.register("hellbark_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> EMPYREAL_WOODEN_HOPPER = BLOCKS.register("empyreal_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));

    // ── Deep Aether ──────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> ROSEROOT_WOODEN_HOPPER = BLOCKS.register("roseroot_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> YAGROOT_WOODEN_HOPPER = BLOCKS.register("yagroot_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> CRUDEROOT_WOODEN_HOPPER = BLOCKS.register("cruderoot_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> CONBERRY_WOODEN_HOPPER = BLOCKS.register("conberry_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> SUNROOT_WOODEN_HOPPER = BLOCKS.register("sunroot_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));

    // ── Aether ───────────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> SKYROOT_WOODEN_HOPPER = BLOCKS.register("skyroot_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));

    // ── Biomes We've Gone ────────────────────────────────────────
    public static final DeferredHolder<Block, Block> ASPEN_WOODEN_HOPPER = BLOCKS.register("aspen_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BAOBAB_WOODEN_HOPPER = BLOCKS.register("baobab_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BLUE_ENCHANTED_WOODEN_HOPPER = BLOCKS.register("blue_enchanted_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> CIKA_WOODEN_HOPPER = BLOCKS.register("cika_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> CYPRESS_WOODEN_HOPPER = BLOCKS.register("cypress_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> EBONY_WOODEN_HOPPER = BLOCKS.register("ebony_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BWG_FIR_WOODEN_HOPPER = BLOCKS.register("bwg_fir_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> FLORUS_WOODEN_HOPPER = BLOCKS.register("florus_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> GREEN_ENCHANTED_WOODEN_HOPPER = BLOCKS.register("green_enchanted_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> HOLLY_WOODEN_HOPPER = BLOCKS.register("holly_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> IRONWOOD_WOODEN_HOPPER = BLOCKS.register("ironwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BWG_JACARANDA_WOODEN_HOPPER = BLOCKS.register("bwg_jacaranda_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BWG_MAHOGANY_WOODEN_HOPPER = BLOCKS.register("bwg_mahogany_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BWG_MAPLE_WOODEN_HOPPER = BLOCKS.register("bwg_maple_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BWG_PALM_WOODEN_HOPPER = BLOCKS.register("bwg_palm_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BWG_PINE_WOODEN_HOPPER = BLOCKS.register("bwg_pine_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> RAINBOW_EUCALYPTUS_WOODEN_HOPPER = BLOCKS.register("rainbow_eucalyptus_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BWG_REDWOOD_WOODEN_HOPPER = BLOCKS.register("bwg_redwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> SAKURA_WOODEN_HOPPER = BLOCKS.register("sakura_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> SKYRIS_WOODEN_HOPPER = BLOCKS.register("skyris_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> SPIRIT_WOODEN_HOPPER = BLOCKS.register("spirit_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> WHITE_MANGROVE_WOODEN_HOPPER = BLOCKS.register("white_mangrove_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BWG_WILLOW_WOODEN_HOPPER = BLOCKS.register("bwg_willow_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> WITCH_HAZEL_WOODEN_HOPPER = BLOCKS.register("witch_hazel_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> ZELKOVA_WOODEN_HOPPER = BLOCKS.register("zelkova_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));

    public static final DeferredHolder<Block, Block> WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
        // ── Wooden Crafting Table Slabs ───────────────────────────────
        // ── Vanilla ───────────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("oak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> SPRUCE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("spruce_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BIRCH_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("birch_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> JUNGLE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("jungle_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> ACACIA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("acacia_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> DARK_OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("dark_oak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("mangrove_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> CHERRY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cherry_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BAMBOO_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bamboo_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> CRIMSON_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("crimson_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> WARPED_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("warped_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));

    // ── Twilight Forest ────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> TWILIGHT_OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("twilight_oak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> CANOPY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("canopy_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> TWILIGHT_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("twilight_mangrove_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> DARK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("dark_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> TIME_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("time_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> TRANSFORMATION_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("transformation_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> MINING_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("mining_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> SORTING_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sorting_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> TOWERWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("towerwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));

    // ── Biomes O'Plenty ──────────────────────────────────────────
    public static final DeferredHolder<Block, Block> FIR_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("fir_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> PINE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("pine_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> MAPLE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("maple_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> REDWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("redwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("mahogany_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> JACARANDA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("jacaranda_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> PALM_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("palm_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> WILLOW_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("willow_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> DEAD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("dead_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> MAGIC_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("magic_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> UMBRAN_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("umbran_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> HELLBARK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("hellbark_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> EMPYREAL_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("empyreal_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));

    // ── Deep Aether ──────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> ROSEROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("roseroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> YAGROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("yagroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> CRUDEROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cruderoot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> CONBERRY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("conberry_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> SUNROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sunroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));

    // ── Aether ───────────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> SKYROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("skyroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));

    // ── Biomes We've Gone ────────────────────────────────────────
    public static final DeferredHolder<Block, Block> ASPEN_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("aspen_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BAOBAB_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("baobab_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BLUE_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("blue_enchanted_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> CIKA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cika_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> CYPRESS_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cypress_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> EBONY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("ebony_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BWG_FIR_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_fir_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> FLORUS_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("florus_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> GREEN_ENCHANTED_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("green_enchanted_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> HOLLY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("holly_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> IRONWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("ironwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BWG_JACARANDA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_jacaranda_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BWG_MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_mahogany_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BWG_MAPLE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_maple_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BWG_PALM_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_palm_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BWG_PINE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_pine_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> RAINBOW_EUCALYPTUS_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("rainbow_eucalyptus_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BWG_REDWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_redwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> SAKURA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sakura_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> SKYRIS_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("skyris_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> SPIRIT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("spirit_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> WHITE_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("white_mangrove_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BWG_WILLOW_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bwg_willow_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> WITCH_HAZEL_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("witch_hazel_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> ZELKOVA_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("zelkova_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));

    // ── African Blackwood ──────────────────────────────────
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_LOG = BLOCKS.register("african_blackwood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_AFRICAN_BLACKWOOD_LOG = BLOCKS.register("stripped_african_blackwood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_WOOD = BLOCKS.register("african_blackwood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_AFRICAN_BLACKWOOD_WOOD = BLOCKS.register("stripped_african_blackwood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_PLANKS = BLOCKS.register("african_blackwood_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_LEAVES = BLOCKS.register("african_blackwood_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_SAPLING = BLOCKS.register("african_blackwood_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.AFRICAN_BLACKWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_SLAB = BLOCKS.register("african_blackwood_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_STAIRS = BLOCKS.register("african_blackwood_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_FENCE = BLOCKS.register("african_blackwood_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_FENCE_GATE = BLOCKS.register("african_blackwood_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.AFRICAN_BLACKWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_PRESSURE_PLATE = BLOCKS.register("african_blackwood_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_BUTTON = BLOCKS.register("african_blackwood_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_DOOR = BLOCKS.register("african_blackwood_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_TRAPDOOR = BLOCKS.register("african_blackwood_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_SIGN = BLOCKS.register("african_blackwood_sign",
        () -> new StandingSignBlock(ModWoodTypes.AFRICAN_BLACKWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_WALL_SIGN = BLOCKS.register("african_blackwood_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.AFRICAN_BLACKWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_HANGING_SIGN = BLOCKS.register("african_blackwood_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.AFRICAN_BLACKWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_WALL_HANGING_SIGN = BLOCKS.register("african_blackwood_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.AFRICAN_BLACKWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("african_blackwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("african_blackwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_WOODEN_CAULDRON = BLOCKS.register("african_blackwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_WOODEN_HOPPER = BLOCKS.register("african_blackwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_WOODEN_BARREL = BLOCKS.register("african_blackwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Banyan ──────────────────────────────────
    public static final DeferredHolder<Block, Block> BANYAN_LOG = BLOCKS.register("banyan_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_BANYAN_LOG = BLOCKS.register("stripped_banyan_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> BANYAN_WOOD = BLOCKS.register("banyan_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_BANYAN_WOOD = BLOCKS.register("stripped_banyan_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> BANYAN_PLANKS = BLOCKS.register("banyan_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> BANYAN_LEAVES = BLOCKS.register("banyan_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> BANYAN_SAPLING = BLOCKS.register("banyan_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.BANYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> BANYAN_SLAB = BLOCKS.register("banyan_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> BANYAN_STAIRS = BLOCKS.register("banyan_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> BANYAN_FENCE = BLOCKS.register("banyan_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> BANYAN_FENCE_GATE = BLOCKS.register("banyan_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.BANYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> BANYAN_PRESSURE_PLATE = BLOCKS.register("banyan_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> BANYAN_BUTTON = BLOCKS.register("banyan_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> BANYAN_DOOR = BLOCKS.register("banyan_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> BANYAN_TRAPDOOR = BLOCKS.register("banyan_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> BANYAN_SIGN = BLOCKS.register("banyan_sign",
        () -> new StandingSignBlock(ModWoodTypes.BANYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> BANYAN_WALL_SIGN = BLOCKS.register("banyan_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.BANYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> BANYAN_HANGING_SIGN = BLOCKS.register("banyan_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.BANYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> BANYAN_WALL_HANGING_SIGN = BLOCKS.register("banyan_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.BANYAN, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> BANYAN_WOODEN_CRAFTING_TABLE = BLOCKS.register("banyan_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BANYAN_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("banyan_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BANYAN_WOODEN_CAULDRON = BLOCKS.register("banyan_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BANYAN_WOODEN_HOPPER = BLOCKS.register("banyan_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BANYAN_WOODEN_BARREL = BLOCKS.register("banyan_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Black Walnut ──────────────────────────────────
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_LOG = BLOCKS.register("black_walnut_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_BLACK_WALNUT_LOG = BLOCKS.register("stripped_black_walnut_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_WOOD = BLOCKS.register("black_walnut_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_BLACK_WALNUT_WOOD = BLOCKS.register("stripped_black_walnut_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_PLANKS = BLOCKS.register("black_walnut_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_LEAVES = BLOCKS.register("black_walnut_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_SAPLING = BLOCKS.register("black_walnut_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.BLACK_WALNUT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_SLAB = BLOCKS.register("black_walnut_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_STAIRS = BLOCKS.register("black_walnut_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_FENCE = BLOCKS.register("black_walnut_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_FENCE_GATE = BLOCKS.register("black_walnut_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.BLACK_WALNUT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_PRESSURE_PLATE = BLOCKS.register("black_walnut_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_BUTTON = BLOCKS.register("black_walnut_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_DOOR = BLOCKS.register("black_walnut_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_TRAPDOOR = BLOCKS.register("black_walnut_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_SIGN = BLOCKS.register("black_walnut_sign",
        () -> new StandingSignBlock(ModWoodTypes.BLACK_WALNUT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_WALL_SIGN = BLOCKS.register("black_walnut_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.BLACK_WALNUT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_HANGING_SIGN = BLOCKS.register("black_walnut_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.BLACK_WALNUT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_WALL_HANGING_SIGN = BLOCKS.register("black_walnut_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.BLACK_WALNUT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_WOODEN_CRAFTING_TABLE = BLOCKS.register("black_walnut_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("black_walnut_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_WOODEN_CAULDRON = BLOCKS.register("black_walnut_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_WOODEN_HOPPER = BLOCKS.register("black_walnut_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_WOODEN_BARREL = BLOCKS.register("black_walnut_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Bloodwood ──────────────────────────────────
    public static final DeferredHolder<Block, Block> BLOODWOOD_LOG = BLOCKS.register("bloodwood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_BLOODWOOD_LOG = BLOCKS.register("stripped_bloodwood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_WOOD = BLOCKS.register("bloodwood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_BLOODWOOD_WOOD = BLOCKS.register("stripped_bloodwood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_PLANKS = BLOCKS.register("bloodwood_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_LEAVES = BLOCKS.register("bloodwood_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_SAPLING = BLOCKS.register("bloodwood_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.BLOODWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_SLAB = BLOCKS.register("bloodwood_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_STAIRS = BLOCKS.register("bloodwood_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_FENCE = BLOCKS.register("bloodwood_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_FENCE_GATE = BLOCKS.register("bloodwood_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.BLOODWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_PRESSURE_PLATE = BLOCKS.register("bloodwood_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_BUTTON = BLOCKS.register("bloodwood_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_DOOR = BLOCKS.register("bloodwood_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_TRAPDOOR = BLOCKS.register("bloodwood_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_SIGN = BLOCKS.register("bloodwood_sign",
        () -> new StandingSignBlock(ModWoodTypes.BLOODWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_WALL_SIGN = BLOCKS.register("bloodwood_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.BLOODWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_HANGING_SIGN = BLOCKS.register("bloodwood_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.BLOODWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_WALL_HANGING_SIGN = BLOCKS.register("bloodwood_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.BLOODWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> BLOODWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("bloodwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BLOODWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bloodwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BLOODWOOD_WOODEN_CAULDRON = BLOCKS.register("bloodwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BLOODWOOD_WOODEN_HOPPER = BLOCKS.register("bloodwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BLOODWOOD_WOODEN_BARREL = BLOCKS.register("bloodwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Bristlecone Pine ──────────────────────────────────
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_LOG = BLOCKS.register("bristlecone_pine_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_BRISTLECONE_PINE_LOG = BLOCKS.register("stripped_bristlecone_pine_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_WOOD = BLOCKS.register("bristlecone_pine_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_BRISTLECONE_PINE_WOOD = BLOCKS.register("stripped_bristlecone_pine_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_PLANKS = BLOCKS.register("bristlecone_pine_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_LEAVES = BLOCKS.register("bristlecone_pine_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_SAPLING = BLOCKS.register("bristlecone_pine_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.BRISTLECONE_PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_SLAB = BLOCKS.register("bristlecone_pine_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_STAIRS = BLOCKS.register("bristlecone_pine_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_FENCE = BLOCKS.register("bristlecone_pine_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_FENCE_GATE = BLOCKS.register("bristlecone_pine_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.BRISTLECONE_PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_PRESSURE_PLATE = BLOCKS.register("bristlecone_pine_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_BUTTON = BLOCKS.register("bristlecone_pine_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_DOOR = BLOCKS.register("bristlecone_pine_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_TRAPDOOR = BLOCKS.register("bristlecone_pine_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_SIGN = BLOCKS.register("bristlecone_pine_sign",
        () -> new StandingSignBlock(ModWoodTypes.BRISTLECONE_PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_WALL_SIGN = BLOCKS.register("bristlecone_pine_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.BRISTLECONE_PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_HANGING_SIGN = BLOCKS.register("bristlecone_pine_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.BRISTLECONE_PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_WALL_HANGING_SIGN = BLOCKS.register("bristlecone_pine_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.BRISTLECONE_PINE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE = BLOCKS.register("bristlecone_pine_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bristlecone_pine_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_WOODEN_CAULDRON = BLOCKS.register("bristlecone_pine_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_WOODEN_HOPPER = BLOCKS.register("bristlecone_pine_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_WOODEN_BARREL = BLOCKS.register("bristlecone_pine_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Cork Oak ──────────────────────────────────
    public static final DeferredHolder<Block, Block> CORK_OAK_LOG = BLOCKS.register("cork_oak_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_CORK_OAK_LOG = BLOCKS.register("stripped_cork_oak_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> CORK_OAK_WOOD = BLOCKS.register("cork_oak_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_CORK_OAK_WOOD = BLOCKS.register("stripped_cork_oak_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> CORK_OAK_PLANKS = BLOCKS.register("cork_oak_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> CORK_OAK_LEAVES = BLOCKS.register("cork_oak_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> CORK_OAK_SAPLING = BLOCKS.register("cork_oak_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.CORK_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> CORK_OAK_SLAB = BLOCKS.register("cork_oak_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> CORK_OAK_STAIRS = BLOCKS.register("cork_oak_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> CORK_OAK_FENCE = BLOCKS.register("cork_oak_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> CORK_OAK_FENCE_GATE = BLOCKS.register("cork_oak_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.CORK_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> CORK_OAK_PRESSURE_PLATE = BLOCKS.register("cork_oak_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> CORK_OAK_BUTTON = BLOCKS.register("cork_oak_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> CORK_OAK_DOOR = BLOCKS.register("cork_oak_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> CORK_OAK_TRAPDOOR = BLOCKS.register("cork_oak_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> CORK_OAK_SIGN = BLOCKS.register("cork_oak_sign",
        () -> new StandingSignBlock(ModWoodTypes.CORK_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> CORK_OAK_WALL_SIGN = BLOCKS.register("cork_oak_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.CORK_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> CORK_OAK_HANGING_SIGN = BLOCKS.register("cork_oak_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.CORK_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> CORK_OAK_WALL_HANGING_SIGN = BLOCKS.register("cork_oak_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.CORK_OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> CORK_OAK_WOODEN_CRAFTING_TABLE = BLOCKS.register("cork_oak_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> CORK_OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cork_oak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> CORK_OAK_WOODEN_CAULDRON = BLOCKS.register("cork_oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> CORK_OAK_WOODEN_HOPPER = BLOCKS.register("cork_oak_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> CORK_OAK_WOODEN_BARREL = BLOCKS.register("cork_oak_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Dragon Blood ──────────────────────────────────
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_LOG = BLOCKS.register("dragon_blood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_DRAGON_BLOOD_LOG = BLOCKS.register("stripped_dragon_blood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_WOOD = BLOCKS.register("dragon_blood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_DRAGON_BLOOD_WOOD = BLOCKS.register("stripped_dragon_blood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_PLANKS = BLOCKS.register("dragon_blood_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_LEAVES = BLOCKS.register("dragon_blood_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_SAPLING = BLOCKS.register("dragon_blood_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.DRAGON_BLOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_SLAB = BLOCKS.register("dragon_blood_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_STAIRS = BLOCKS.register("dragon_blood_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_FENCE = BLOCKS.register("dragon_blood_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_FENCE_GATE = BLOCKS.register("dragon_blood_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.DRAGON_BLOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_PRESSURE_PLATE = BLOCKS.register("dragon_blood_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_BUTTON = BLOCKS.register("dragon_blood_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_DOOR = BLOCKS.register("dragon_blood_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_TRAPDOOR = BLOCKS.register("dragon_blood_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_SIGN = BLOCKS.register("dragon_blood_sign",
        () -> new StandingSignBlock(ModWoodTypes.DRAGON_BLOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_WALL_SIGN = BLOCKS.register("dragon_blood_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.DRAGON_BLOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_HANGING_SIGN = BLOCKS.register("dragon_blood_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.DRAGON_BLOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_WALL_HANGING_SIGN = BLOCKS.register("dragon_blood_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.DRAGON_BLOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("dragon_blood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("dragon_blood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_WOODEN_CAULDRON = BLOCKS.register("dragon_blood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_WOODEN_HOPPER = BLOCKS.register("dragon_blood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_WOODEN_BARREL = BLOCKS.register("dragon_blood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Kapok ──────────────────────────────────
    public static final DeferredHolder<Block, Block> KAPOK_LOG = BLOCKS.register("kapok_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_KAPOK_LOG = BLOCKS.register("stripped_kapok_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> KAPOK_WOOD = BLOCKS.register("kapok_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_KAPOK_WOOD = BLOCKS.register("stripped_kapok_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> KAPOK_PLANKS = BLOCKS.register("kapok_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> KAPOK_LEAVES = BLOCKS.register("kapok_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> KAPOK_SAPLING = BLOCKS.register("kapok_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.KAPOK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> KAPOK_SLAB = BLOCKS.register("kapok_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> KAPOK_STAIRS = BLOCKS.register("kapok_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> KAPOK_FENCE = BLOCKS.register("kapok_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> KAPOK_FENCE_GATE = BLOCKS.register("kapok_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.KAPOK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> KAPOK_PRESSURE_PLATE = BLOCKS.register("kapok_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> KAPOK_BUTTON = BLOCKS.register("kapok_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> KAPOK_DOOR = BLOCKS.register("kapok_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> KAPOK_TRAPDOOR = BLOCKS.register("kapok_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> KAPOK_SIGN = BLOCKS.register("kapok_sign",
        () -> new StandingSignBlock(ModWoodTypes.KAPOK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> KAPOK_WALL_SIGN = BLOCKS.register("kapok_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.KAPOK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> KAPOK_HANGING_SIGN = BLOCKS.register("kapok_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.KAPOK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> KAPOK_WALL_HANGING_SIGN = BLOCKS.register("kapok_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.KAPOK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> KAPOK_WOODEN_CRAFTING_TABLE = BLOCKS.register("kapok_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> KAPOK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("kapok_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> KAPOK_WOODEN_CAULDRON = BLOCKS.register("kapok_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> KAPOK_WOODEN_HOPPER = BLOCKS.register("kapok_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> KAPOK_WOODEN_BARREL = BLOCKS.register("kapok_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Larch ──────────────────────────────────
    public static final DeferredHolder<Block, Block> LARCH_LOG = BLOCKS.register("larch_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_LARCH_LOG = BLOCKS.register("stripped_larch_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> LARCH_WOOD = BLOCKS.register("larch_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_LARCH_WOOD = BLOCKS.register("stripped_larch_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> LARCH_PLANKS = BLOCKS.register("larch_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> LARCH_LEAVES = BLOCKS.register("larch_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> LARCH_SAPLING = BLOCKS.register("larch_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.LARCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> LARCH_SLAB = BLOCKS.register("larch_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> LARCH_STAIRS = BLOCKS.register("larch_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> LARCH_FENCE = BLOCKS.register("larch_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> LARCH_FENCE_GATE = BLOCKS.register("larch_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.LARCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> LARCH_PRESSURE_PLATE = BLOCKS.register("larch_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> LARCH_BUTTON = BLOCKS.register("larch_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> LARCH_DOOR = BLOCKS.register("larch_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> LARCH_TRAPDOOR = BLOCKS.register("larch_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> LARCH_SIGN = BLOCKS.register("larch_sign",
        () -> new StandingSignBlock(ModWoodTypes.LARCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> LARCH_WALL_SIGN = BLOCKS.register("larch_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.LARCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> LARCH_HANGING_SIGN = BLOCKS.register("larch_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.LARCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> LARCH_WALL_HANGING_SIGN = BLOCKS.register("larch_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.LARCH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> LARCH_WOODEN_CRAFTING_TABLE = BLOCKS.register("larch_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> LARCH_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("larch_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> LARCH_WOODEN_CAULDRON = BLOCKS.register("larch_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> LARCH_WOODEN_HOPPER = BLOCKS.register("larch_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> LARCH_WOODEN_BARREL = BLOCKS.register("larch_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Sandalwood ──────────────────────────────────
    public static final DeferredHolder<Block, Block> SANDALWOOD_LOG = BLOCKS.register("sandalwood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_SANDALWOOD_LOG = BLOCKS.register("stripped_sandalwood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_WOOD = BLOCKS.register("sandalwood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_SANDALWOOD_WOOD = BLOCKS.register("stripped_sandalwood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_PLANKS = BLOCKS.register("sandalwood_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_LEAVES = BLOCKS.register("sandalwood_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_SAPLING = BLOCKS.register("sandalwood_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.SANDALWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_SLAB = BLOCKS.register("sandalwood_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_STAIRS = BLOCKS.register("sandalwood_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_FENCE = BLOCKS.register("sandalwood_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_FENCE_GATE = BLOCKS.register("sandalwood_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.SANDALWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_PRESSURE_PLATE = BLOCKS.register("sandalwood_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_BUTTON = BLOCKS.register("sandalwood_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_DOOR = BLOCKS.register("sandalwood_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_TRAPDOOR = BLOCKS.register("sandalwood_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_SIGN = BLOCKS.register("sandalwood_sign",
        () -> new StandingSignBlock(ModWoodTypes.SANDALWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_WALL_SIGN = BLOCKS.register("sandalwood_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.SANDALWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_HANGING_SIGN = BLOCKS.register("sandalwood_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.SANDALWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_WALL_HANGING_SIGN = BLOCKS.register("sandalwood_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.SANDALWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> SANDALWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("sandalwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> SANDALWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sandalwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> SANDALWOOD_WOODEN_CAULDRON = BLOCKS.register("sandalwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> SANDALWOOD_WOODEN_HOPPER = BLOCKS.register("sandalwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> SANDALWOOD_WOODEN_BARREL = BLOCKS.register("sandalwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Sycamore ──────────────────────────────────
    public static final DeferredHolder<Block, Block> SYCAMORE_LOG = BLOCKS.register("sycamore_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_SYCAMORE_LOG = BLOCKS.register("stripped_sycamore_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> SYCAMORE_WOOD = BLOCKS.register("sycamore_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_SYCAMORE_WOOD = BLOCKS.register("stripped_sycamore_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> SYCAMORE_PLANKS = BLOCKS.register("sycamore_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> SYCAMORE_LEAVES = BLOCKS.register("sycamore_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> SYCAMORE_SAPLING = BLOCKS.register("sycamore_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.SYCAMORE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> SYCAMORE_SLAB = BLOCKS.register("sycamore_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> SYCAMORE_STAIRS = BLOCKS.register("sycamore_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> SYCAMORE_FENCE = BLOCKS.register("sycamore_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> SYCAMORE_FENCE_GATE = BLOCKS.register("sycamore_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.SYCAMORE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> SYCAMORE_PRESSURE_PLATE = BLOCKS.register("sycamore_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> SYCAMORE_BUTTON = BLOCKS.register("sycamore_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> SYCAMORE_DOOR = BLOCKS.register("sycamore_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> SYCAMORE_TRAPDOOR = BLOCKS.register("sycamore_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> SYCAMORE_SIGN = BLOCKS.register("sycamore_sign",
        () -> new StandingSignBlock(ModWoodTypes.SYCAMORE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> SYCAMORE_WALL_SIGN = BLOCKS.register("sycamore_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.SYCAMORE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> SYCAMORE_HANGING_SIGN = BLOCKS.register("sycamore_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.SYCAMORE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> SYCAMORE_WALL_HANGING_SIGN = BLOCKS.register("sycamore_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.SYCAMORE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> SYCAMORE_WOODEN_CRAFTING_TABLE = BLOCKS.register("sycamore_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> SYCAMORE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sycamore_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> SYCAMORE_WOODEN_CAULDRON = BLOCKS.register("sycamore_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> SYCAMORE_WOODEN_HOPPER = BLOCKS.register("sycamore_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> SYCAMORE_WOODEN_BARREL = BLOCKS.register("sycamore_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Teak ──────────────────────────────────
    public static final DeferredHolder<Block, Block> TEAK_LOG = BLOCKS.register("teak_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_TEAK_LOG = BLOCKS.register("stripped_teak_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> TEAK_WOOD = BLOCKS.register("teak_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_TEAK_WOOD = BLOCKS.register("stripped_teak_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> TEAK_PLANKS = BLOCKS.register("teak_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> TEAK_LEAVES = BLOCKS.register("teak_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> TEAK_SAPLING = BLOCKS.register("teak_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.TEAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> TEAK_SLAB = BLOCKS.register("teak_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> TEAK_STAIRS = BLOCKS.register("teak_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> TEAK_FENCE = BLOCKS.register("teak_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> TEAK_FENCE_GATE = BLOCKS.register("teak_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.TEAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> TEAK_PRESSURE_PLATE = BLOCKS.register("teak_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> TEAK_BUTTON = BLOCKS.register("teak_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> TEAK_DOOR = BLOCKS.register("teak_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> TEAK_TRAPDOOR = BLOCKS.register("teak_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> TEAK_SIGN = BLOCKS.register("teak_sign",
        () -> new StandingSignBlock(ModWoodTypes.TEAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> TEAK_WALL_SIGN = BLOCKS.register("teak_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.TEAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> TEAK_HANGING_SIGN = BLOCKS.register("teak_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.TEAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> TEAK_WALL_HANGING_SIGN = BLOCKS.register("teak_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.TEAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> TEAK_WOODEN_CRAFTING_TABLE = BLOCKS.register("teak_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> TEAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("teak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> TEAK_WOODEN_CAULDRON = BLOCKS.register("teak_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> TEAK_WOODEN_HOPPER = BLOCKS.register("teak_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> TEAK_WOODEN_BARREL = BLOCKS.register("teak_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Wenge ──────────────────────────────────
    public static final DeferredHolder<Block, Block> WENGE_LOG = BLOCKS.register("wenge_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_WENGE_LOG = BLOCKS.register("stripped_wenge_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> WENGE_WOOD = BLOCKS.register("wenge_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_WENGE_WOOD = BLOCKS.register("stripped_wenge_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> WENGE_PLANKS = BLOCKS.register("wenge_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> WENGE_LEAVES = BLOCKS.register("wenge_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> WENGE_SAPLING = BLOCKS.register("wenge_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.WENGE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> WENGE_SLAB = BLOCKS.register("wenge_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> WENGE_STAIRS = BLOCKS.register("wenge_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> WENGE_FENCE = BLOCKS.register("wenge_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> WENGE_FENCE_GATE = BLOCKS.register("wenge_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.WENGE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> WENGE_PRESSURE_PLATE = BLOCKS.register("wenge_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> WENGE_BUTTON = BLOCKS.register("wenge_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> WENGE_DOOR = BLOCKS.register("wenge_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> WENGE_TRAPDOOR = BLOCKS.register("wenge_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> WENGE_SIGN = BLOCKS.register("wenge_sign",
        () -> new StandingSignBlock(ModWoodTypes.WENGE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> WENGE_WALL_SIGN = BLOCKS.register("wenge_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.WENGE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> WENGE_HANGING_SIGN = BLOCKS.register("wenge_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.WENGE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> WENGE_WALL_HANGING_SIGN = BLOCKS.register("wenge_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.WENGE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> WENGE_WOODEN_CRAFTING_TABLE = BLOCKS.register("wenge_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> WENGE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("wenge_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> WENGE_WOODEN_CAULDRON = BLOCKS.register("wenge_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> WENGE_WOODEN_HOPPER = BLOCKS.register("wenge_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> WENGE_WOODEN_BARREL = BLOCKS.register("wenge_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Zebrawood ──────────────────────────────────
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_LOG = BLOCKS.register("zebrawood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)));
    public static final DeferredHolder<Block, Block> STRIPPED_ZEBRAWOOD_LOG = BLOCKS.register("stripped_zebrawood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_WOOD = BLOCKS.register("zebrawood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD)));
    public static final DeferredHolder<Block, Block> STRIPPED_ZEBRAWOOD_WOOD = BLOCKS.register("stripped_zebrawood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_PLANKS = BLOCKS.register("zebrawood_planks",
        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_LEAVES = BLOCKS.register("zebrawood_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_SAPLING = BLOCKS.register("zebrawood_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.ZEBRAWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_SLAB = BLOCKS.register("zebrawood_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_STAIRS = BLOCKS.register("zebrawood_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_FENCE = BLOCKS.register("zebrawood_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_FENCE_GATE = BLOCKS.register("zebrawood_fence_gate",
        () -> new FenceGateBlock(ModWoodTypes.ZEBRAWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_PRESSURE_PLATE = BLOCKS.register("zebrawood_pressure_plate",
        () -> new PressurePlateBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_BUTTON = BLOCKS.register("zebrawood_button",
        () -> new net.minecraft.world.level.block.ButtonBlock(BlockSetType.OAK, 30, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_DOOR = BLOCKS.register("zebrawood_door",
        () -> new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_TRAPDOOR = BLOCKS.register("zebrawood_trapdoor",
        () -> new TrapDoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_SIGN = BLOCKS.register("zebrawood_sign",
        () -> new StandingSignBlock(ModWoodTypes.ZEBRAWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_WALL_SIGN = BLOCKS.register("zebrawood_wall_sign",
        () -> new WallSignBlock(ModWoodTypes.ZEBRAWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_HANGING_SIGN = BLOCKS.register("zebrawood_hanging_sign",
        () -> new CeilingHangingSignBlock(ModWoodTypes.ZEBRAWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_WALL_HANGING_SIGN = BLOCKS.register("zebrawood_wall_hanging_sign",
        () -> new WallHangingSignBlock(ModWoodTypes.ZEBRAWOOD, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("zebrawood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("zebrawood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_WOODEN_CAULDRON = BLOCKS.register("zebrawood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_WOODEN_HOPPER = BLOCKS.register("zebrawood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_WOODEN_BARREL = BLOCKS.register("zebrawood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Wooden Chests ──────────────────────────────────────────────────────────
    // ── Vanilla ─────────────────────────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> WOODEN_CHEST = BLOCKS.register("wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> OAK_WOODEN_CHEST = BLOCKS.register("oak_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> SPRUCE_WOODEN_CHEST = BLOCKS.register("spruce_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BIRCH_WOODEN_CHEST = BLOCKS.register("birch_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> JUNGLE_WOODEN_CHEST = BLOCKS.register("jungle_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> ACACIA_WOODEN_CHEST = BLOCKS.register("acacia_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> DARK_OAK_WOODEN_CHEST = BLOCKS.register("dark_oak_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> MANGROVE_WOODEN_CHEST = BLOCKS.register("mangrove_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> CHERRY_WOODEN_CHEST = BLOCKS.register("cherry_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BAMBOO_WOODEN_CHEST = BLOCKS.register("bamboo_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> CRIMSON_WOODEN_CHEST = BLOCKS.register("crimson_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> WARPED_WOODEN_CHEST = BLOCKS.register("warped_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));

    // ── Twilight Forest ────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> TWILIGHT_OAK_WOODEN_CHEST = BLOCKS.register("twilight_oak_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> CANOPY_WOODEN_CHEST = BLOCKS.register("canopy_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> TWILIGHT_MANGROVE_WOODEN_CHEST = BLOCKS.register("twilight_mangrove_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> DARK_WOODEN_CHEST = BLOCKS.register("dark_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> TIME_WOODEN_CHEST = BLOCKS.register("time_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> TRANSFORMATION_WOODEN_CHEST = BLOCKS.register("transformation_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> MINING_WOODEN_CHEST = BLOCKS.register("mining_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> SORTING_WOODEN_CHEST = BLOCKS.register("sorting_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> TOWERWOOD_WOODEN_CHEST = BLOCKS.register("towerwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));

    // ── Biomes O'Plenty ──────────────────────────────────────────
    public static final DeferredHolder<Block, Block> FIR_WOODEN_CHEST = BLOCKS.register("fir_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> PINE_WOODEN_CHEST = BLOCKS.register("pine_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> MAPLE_WOODEN_CHEST = BLOCKS.register("maple_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> REDWOOD_WOODEN_CHEST = BLOCKS.register("redwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> MAHOGANY_WOODEN_CHEST = BLOCKS.register("mahogany_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> JACARANDA_WOODEN_CHEST = BLOCKS.register("jacaranda_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> PALM_WOODEN_CHEST = BLOCKS.register("palm_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> WILLOW_WOODEN_CHEST = BLOCKS.register("willow_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> DEAD_WOODEN_CHEST = BLOCKS.register("dead_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> MAGIC_WOODEN_CHEST = BLOCKS.register("magic_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> UMBRAN_WOODEN_CHEST = BLOCKS.register("umbran_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> HELLBARK_WOODEN_CHEST = BLOCKS.register("hellbark_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> EMPYREAL_WOODEN_CHEST = BLOCKS.register("empyreal_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));

    // ── Deep Aether ──────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> ROSEROOT_WOODEN_CHEST = BLOCKS.register("roseroot_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> YAGROOT_WOODEN_CHEST = BLOCKS.register("yagroot_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> CRUDEROOT_WOODEN_CHEST = BLOCKS.register("cruderoot_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> CONBERRY_WOODEN_CHEST = BLOCKS.register("conberry_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> SUNROOT_WOODEN_CHEST = BLOCKS.register("sunroot_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));

    // ── Aether ───────────────────────────────────────────────────
    public static final DeferredHolder<Block, Block> SKYROOT_WOODEN_CHEST = BLOCKS.register("skyroot_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));

    // ── Biomes We've Gone ────────────────────────────────────────
    public static final DeferredHolder<Block, Block> ASPEN_WOODEN_CHEST = BLOCKS.register("aspen_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BAOBAB_WOODEN_CHEST = BLOCKS.register("baobab_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BLUE_ENCHANTED_WOODEN_CHEST = BLOCKS.register("blue_enchanted_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> CIKA_WOODEN_CHEST = BLOCKS.register("cika_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> CYPRESS_WOODEN_CHEST = BLOCKS.register("cypress_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> EBONY_WOODEN_CHEST = BLOCKS.register("ebony_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BWG_FIR_WOODEN_CHEST = BLOCKS.register("bwg_fir_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> FLORUS_WOODEN_CHEST = BLOCKS.register("florus_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> GREEN_ENCHANTED_WOODEN_CHEST = BLOCKS.register("green_enchanted_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> HOLLY_WOODEN_CHEST = BLOCKS.register("holly_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> IRONWOOD_WOODEN_CHEST = BLOCKS.register("ironwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BWG_JACARANDA_WOODEN_CHEST = BLOCKS.register("bwg_jacaranda_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BWG_MAHOGANY_WOODEN_CHEST = BLOCKS.register("bwg_mahogany_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BWG_MAPLE_WOODEN_CHEST = BLOCKS.register("bwg_maple_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BWG_PALM_WOODEN_CHEST = BLOCKS.register("bwg_palm_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BWG_PINE_WOODEN_CHEST = BLOCKS.register("bwg_pine_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> RAINBOW_EUCALYPTUS_WOODEN_CHEST = BLOCKS.register("rainbow_eucalyptus_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BWG_REDWOOD_WOODEN_CHEST = BLOCKS.register("bwg_redwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> SAKURA_WOODEN_CHEST = BLOCKS.register("sakura_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> SKYRIS_WOODEN_CHEST = BLOCKS.register("skyris_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> SPIRIT_WOODEN_CHEST = BLOCKS.register("spirit_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> WHITE_MANGROVE_WOODEN_CHEST = BLOCKS.register("white_mangrove_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BWG_WILLOW_WOODEN_CHEST = BLOCKS.register("bwg_willow_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> WITCH_HAZEL_WOODEN_CHEST = BLOCKS.register("witch_hazel_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> ZELKOVA_WOODEN_CHEST = BLOCKS.register("zelkova_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> AFRICAN_BLACKWOOD_WOODEN_CHEST = BLOCKS.register("african_blackwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BANYAN_WOODEN_CHEST = BLOCKS.register("banyan_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BLACK_WALNUT_WOODEN_CHEST = BLOCKS.register("black_walnut_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BLOODWOOD_WOODEN_CHEST = BLOCKS.register("bloodwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> BRISTLECONE_PINE_WOODEN_CHEST = BLOCKS.register("bristlecone_pine_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> CORK_OAK_WOODEN_CHEST = BLOCKS.register("cork_oak_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> DRAGON_BLOOD_WOODEN_CHEST = BLOCKS.register("dragon_blood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> KAPOK_WOODEN_CHEST = BLOCKS.register("kapok_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> LARCH_WOODEN_CHEST = BLOCKS.register("larch_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> SANDALWOOD_WOODEN_CHEST = BLOCKS.register("sandalwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> SYCAMORE_WOODEN_CHEST = BLOCKS.register("sycamore_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> TEAK_WOODEN_CHEST = BLOCKS.register("teak_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> WENGE_WOODEN_CHEST = BLOCKS.register("wenge_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final DeferredHolder<Block, Block> ZEBRAWOOD_WOODEN_CHEST = BLOCKS.register("zebrawood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    *///?} else {
    //? if old_props {
    private static net.minecraft.world.level.block.state.BlockBehaviour.Properties cauldronProps() {
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
    private static net.minecraft.world.level.block.state.BlockBehaviour.Properties chestProps() {
        return net.minecraft.world.level.block.state.BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.CHEST);
    }
    //?} else {
    /*private static net.minecraft.world.level.block.state.BlockBehaviour.Properties cauldronProps() {
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
    private static net.minecraft.world.level.block.state.BlockBehaviour.Properties chestProps() {
        return net.minecraft.world.level.block.state.BlockBehaviour.Properties.ofFullCopy(net.minecraft.world.level.block.Blocks.CHEST);
    }
    *///?}
        // ── Wooden Cauldrons ──────────────────────────────────────────
        // ── Vanilla ───────────────────────────────────────────────────
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

    // ── Twilight Forest ────────────────────────────────────────────
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

    // ── Biomes O'Plenty ──────────────────────────────────────────
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

    // ── Deep Aether ──────────────────────────────────────────────
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

    // ── Aether ───────────────────────────────────────────────────
    public static final RegistryObject<Block> SKYROOT_WOODEN_CAULDRON = BLOCKS.register("skyroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));

    // ── Biomes We've Gone ────────────────────────────────────────
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

        // ── Wooden Barrels ────────────────────────────────────────────
        // ── Vanilla ───────────────────────────────────────────────────
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

    // ── Twilight Forest ────────────────────────────────────────────
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

    // ── Biomes O'Plenty ──────────────────────────────────────────
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

    // ── Deep Aether ──────────────────────────────────────────────
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

    // ── Aether ───────────────────────────────────────────────────
    public static final RegistryObject<Block> SKYROOT_WOODEN_BARREL = BLOCKS.register("skyroot_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));


    // ── Biomes We've Gone ────────────────────────────────────────
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

        // ── Wooden Hoppers ────────────────────────────────────────────
        // ── Vanilla ───────────────────────────────────────────────────
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

    // ── Twilight Forest ────────────────────────────────────────────
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

    // ── Biomes O'Plenty ──────────────────────────────────────────
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

    // ── Deep Aether ──────────────────────────────────────────────
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

    // ── Aether ───────────────────────────────────────────────────
    public static final RegistryObject<Block> SKYROOT_WOODEN_HOPPER = BLOCKS.register("skyroot_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));

    // ── Biomes We've Gone ────────────────────────────────────────
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

    public static final RegistryObject<Block> WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
        // ── Wooden Crafting Table Slabs ───────────────────────────────
        // ── Vanilla ───────────────────────────────────────────────────
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

    // ── Twilight Forest ────────────────────────────────────────────
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

    // ── Biomes O'Plenty ──────────────────────────────────────────
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

    // ── Deep Aether ──────────────────────────────────────────────
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

    // ── Aether ───────────────────────────────────────────────────
    public static final RegistryObject<Block> SKYROOT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("skyroot_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));

    // ── Biomes We've Gone ────────────────────────────────────────
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

    // ── African Blackwood ──────────────────────────────────
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_LOG = BLOCKS.register("african_blackwood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_AFRICAN_BLACKWOOD_LOG = BLOCKS.register("stripped_african_blackwood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_WOOD = BLOCKS.register("african_blackwood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_AFRICAN_BLACKWOOD_WOOD = BLOCKS.register("stripped_african_blackwood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_PLANKS = BLOCKS.register("african_blackwood_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_LEAVES = BLOCKS.register("african_blackwood_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_SAPLING = BLOCKS.register("african_blackwood_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.AFRICAN_BLACKWOOD, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_SLAB = BLOCKS.register("african_blackwood_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_STAIRS = BLOCKS.register("african_blackwood_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_FENCE = BLOCKS.register("african_blackwood_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_FENCE_GATE = BLOCKS.register("african_blackwood_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.AFRICAN_BLACKWOOD));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_PRESSURE_PLATE = BLOCKS.register("african_blackwood_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_BUTTON = BLOCKS.register("african_blackwood_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_DOOR = BLOCKS.register("african_blackwood_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_TRAPDOOR = BLOCKS.register("african_blackwood_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_SIGN = BLOCKS.register("african_blackwood_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.AFRICAN_BLACKWOOD));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_WALL_SIGN = BLOCKS.register("african_blackwood_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.AFRICAN_BLACKWOOD));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_HANGING_SIGN = BLOCKS.register("african_blackwood_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.AFRICAN_BLACKWOOD));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_WALL_HANGING_SIGN = BLOCKS.register("african_blackwood_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.AFRICAN_BLACKWOOD));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("african_blackwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("african_blackwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_WOODEN_CAULDRON = BLOCKS.register("african_blackwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_WOODEN_HOPPER = BLOCKS.register("african_blackwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_WOODEN_BARREL = BLOCKS.register("african_blackwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Banyan ──────────────────────────────────
    public static final RegistryObject<Block> BANYAN_LOG = BLOCKS.register("banyan_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BANYAN_LOG = BLOCKS.register("stripped_banyan_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> BANYAN_WOOD = BLOCKS.register("banyan_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BANYAN_WOOD = BLOCKS.register("stripped_banyan_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> BANYAN_PLANKS = BLOCKS.register("banyan_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BANYAN_LEAVES = BLOCKS.register("banyan_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> BANYAN_SAPLING = BLOCKS.register("banyan_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.BANYAN, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> BANYAN_SLAB = BLOCKS.register("banyan_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BANYAN_STAIRS = BLOCKS.register("banyan_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> BANYAN_FENCE = BLOCKS.register("banyan_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BANYAN_FENCE_GATE = BLOCKS.register("banyan_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.BANYAN));
    public static final RegistryObject<Block> BANYAN_PRESSURE_PLATE = BLOCKS.register("banyan_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> BANYAN_BUTTON = BLOCKS.register("banyan_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> BANYAN_DOOR = BLOCKS.register("banyan_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BANYAN_TRAPDOOR = BLOCKS.register("banyan_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BANYAN_SIGN = BLOCKS.register("banyan_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BANYAN));
    public static final RegistryObject<Block> BANYAN_WALL_SIGN = BLOCKS.register("banyan_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BANYAN));
    public static final RegistryObject<Block> BANYAN_HANGING_SIGN = BLOCKS.register("banyan_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BANYAN));
    public static final RegistryObject<Block> BANYAN_WALL_HANGING_SIGN = BLOCKS.register("banyan_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BANYAN));
    public static final RegistryObject<Block> BANYAN_WOODEN_CRAFTING_TABLE = BLOCKS.register("banyan_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BANYAN_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("banyan_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BANYAN_WOODEN_CAULDRON = BLOCKS.register("banyan_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BANYAN_WOODEN_HOPPER = BLOCKS.register("banyan_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BANYAN_WOODEN_BARREL = BLOCKS.register("banyan_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Black Walnut ──────────────────────────────────
    public static final RegistryObject<Block> BLACK_WALNUT_LOG = BLOCKS.register("black_walnut_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BLACK_WALNUT_LOG = BLOCKS.register("stripped_black_walnut_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> BLACK_WALNUT_WOOD = BLOCKS.register("black_walnut_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BLACK_WALNUT_WOOD = BLOCKS.register("stripped_black_walnut_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> BLACK_WALNUT_PLANKS = BLOCKS.register("black_walnut_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLACK_WALNUT_LEAVES = BLOCKS.register("black_walnut_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> BLACK_WALNUT_SAPLING = BLOCKS.register("black_walnut_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.BLACK_WALNUT, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> BLACK_WALNUT_SLAB = BLOCKS.register("black_walnut_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BLACK_WALNUT_STAIRS = BLOCKS.register("black_walnut_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> BLACK_WALNUT_FENCE = BLOCKS.register("black_walnut_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BLACK_WALNUT_FENCE_GATE = BLOCKS.register("black_walnut_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.BLACK_WALNUT));
    public static final RegistryObject<Block> BLACK_WALNUT_PRESSURE_PLATE = BLOCKS.register("black_walnut_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> BLACK_WALNUT_BUTTON = BLOCKS.register("black_walnut_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> BLACK_WALNUT_DOOR = BLOCKS.register("black_walnut_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BLACK_WALNUT_TRAPDOOR = BLOCKS.register("black_walnut_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BLACK_WALNUT_SIGN = BLOCKS.register("black_walnut_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BLACK_WALNUT));
    public static final RegistryObject<Block> BLACK_WALNUT_WALL_SIGN = BLOCKS.register("black_walnut_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BLACK_WALNUT));
    public static final RegistryObject<Block> BLACK_WALNUT_HANGING_SIGN = BLOCKS.register("black_walnut_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BLACK_WALNUT));
    public static final RegistryObject<Block> BLACK_WALNUT_WALL_HANGING_SIGN = BLOCKS.register("black_walnut_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BLACK_WALNUT));
    public static final RegistryObject<Block> BLACK_WALNUT_WOODEN_CRAFTING_TABLE = BLOCKS.register("black_walnut_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BLACK_WALNUT_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("black_walnut_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BLACK_WALNUT_WOODEN_CAULDRON = BLOCKS.register("black_walnut_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BLACK_WALNUT_WOODEN_HOPPER = BLOCKS.register("black_walnut_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BLACK_WALNUT_WOODEN_BARREL = BLOCKS.register("black_walnut_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Bloodwood ──────────────────────────────────
    public static final RegistryObject<Block> BLOODWOOD_LOG = BLOCKS.register("bloodwood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BLOODWOOD_LOG = BLOCKS.register("stripped_bloodwood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> BLOODWOOD_WOOD = BLOCKS.register("bloodwood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BLOODWOOD_WOOD = BLOCKS.register("stripped_bloodwood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> BLOODWOOD_PLANKS = BLOCKS.register("bloodwood_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BLOODWOOD_LEAVES = BLOCKS.register("bloodwood_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> BLOODWOOD_SAPLING = BLOCKS.register("bloodwood_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.BLOODWOOD, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> BLOODWOOD_SLAB = BLOCKS.register("bloodwood_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BLOODWOOD_STAIRS = BLOCKS.register("bloodwood_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> BLOODWOOD_FENCE = BLOCKS.register("bloodwood_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BLOODWOOD_FENCE_GATE = BLOCKS.register("bloodwood_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.BLOODWOOD));
    public static final RegistryObject<Block> BLOODWOOD_PRESSURE_PLATE = BLOCKS.register("bloodwood_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> BLOODWOOD_BUTTON = BLOCKS.register("bloodwood_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> BLOODWOOD_DOOR = BLOCKS.register("bloodwood_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BLOODWOOD_TRAPDOOR = BLOCKS.register("bloodwood_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BLOODWOOD_SIGN = BLOCKS.register("bloodwood_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BLOODWOOD));
    public static final RegistryObject<Block> BLOODWOOD_WALL_SIGN = BLOCKS.register("bloodwood_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BLOODWOOD));
    public static final RegistryObject<Block> BLOODWOOD_HANGING_SIGN = BLOCKS.register("bloodwood_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BLOODWOOD));
    public static final RegistryObject<Block> BLOODWOOD_WALL_HANGING_SIGN = BLOCKS.register("bloodwood_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BLOODWOOD));
    public static final RegistryObject<Block> BLOODWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("bloodwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BLOODWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bloodwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BLOODWOOD_WOODEN_CAULDRON = BLOCKS.register("bloodwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BLOODWOOD_WOODEN_HOPPER = BLOCKS.register("bloodwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BLOODWOOD_WOODEN_BARREL = BLOCKS.register("bloodwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Bristlecone Pine ──────────────────────────────────
    public static final RegistryObject<Block> BRISTLECONE_PINE_LOG = BLOCKS.register("bristlecone_pine_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_BRISTLECONE_PINE_LOG = BLOCKS.register("stripped_bristlecone_pine_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> BRISTLECONE_PINE_WOOD = BLOCKS.register("bristlecone_pine_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_BRISTLECONE_PINE_WOOD = BLOCKS.register("stripped_bristlecone_pine_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> BRISTLECONE_PINE_PLANKS = BLOCKS.register("bristlecone_pine_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BRISTLECONE_PINE_LEAVES = BLOCKS.register("bristlecone_pine_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> BRISTLECONE_PINE_SAPLING = BLOCKS.register("bristlecone_pine_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.BRISTLECONE_PINE, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> BRISTLECONE_PINE_SLAB = BLOCKS.register("bristlecone_pine_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> BRISTLECONE_PINE_STAIRS = BLOCKS.register("bristlecone_pine_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> BRISTLECONE_PINE_FENCE = BLOCKS.register("bristlecone_pine_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> BRISTLECONE_PINE_FENCE_GATE = BLOCKS.register("bristlecone_pine_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.BRISTLECONE_PINE));
    public static final RegistryObject<Block> BRISTLECONE_PINE_PRESSURE_PLATE = BLOCKS.register("bristlecone_pine_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> BRISTLECONE_PINE_BUTTON = BLOCKS.register("bristlecone_pine_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> BRISTLECONE_PINE_DOOR = BLOCKS.register("bristlecone_pine_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BRISTLECONE_PINE_TRAPDOOR = BLOCKS.register("bristlecone_pine_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> BRISTLECONE_PINE_SIGN = BLOCKS.register("bristlecone_pine_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.BRISTLECONE_PINE));
    public static final RegistryObject<Block> BRISTLECONE_PINE_WALL_SIGN = BLOCKS.register("bristlecone_pine_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.BRISTLECONE_PINE));
    public static final RegistryObject<Block> BRISTLECONE_PINE_HANGING_SIGN = BLOCKS.register("bristlecone_pine_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.BRISTLECONE_PINE));
    public static final RegistryObject<Block> BRISTLECONE_PINE_WALL_HANGING_SIGN = BLOCKS.register("bristlecone_pine_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.BRISTLECONE_PINE));
    public static final RegistryObject<Block> BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE = BLOCKS.register("bristlecone_pine_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("bristlecone_pine_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> BRISTLECONE_PINE_WOODEN_CAULDRON = BLOCKS.register("bristlecone_pine_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> BRISTLECONE_PINE_WOODEN_HOPPER = BLOCKS.register("bristlecone_pine_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> BRISTLECONE_PINE_WOODEN_BARREL = BLOCKS.register("bristlecone_pine_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Cork Oak ──────────────────────────────────
    public static final RegistryObject<Block> CORK_OAK_LOG = BLOCKS.register("cork_oak_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_CORK_OAK_LOG = BLOCKS.register("stripped_cork_oak_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> CORK_OAK_WOOD = BLOCKS.register("cork_oak_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_CORK_OAK_WOOD = BLOCKS.register("stripped_cork_oak_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> CORK_OAK_PLANKS = BLOCKS.register("cork_oak_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CORK_OAK_LEAVES = BLOCKS.register("cork_oak_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> CORK_OAK_SAPLING = BLOCKS.register("cork_oak_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.CORK_OAK, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> CORK_OAK_SLAB = BLOCKS.register("cork_oak_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> CORK_OAK_STAIRS = BLOCKS.register("cork_oak_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> CORK_OAK_FENCE = BLOCKS.register("cork_oak_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> CORK_OAK_FENCE_GATE = BLOCKS.register("cork_oak_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.CORK_OAK));
    public static final RegistryObject<Block> CORK_OAK_PRESSURE_PLATE = BLOCKS.register("cork_oak_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> CORK_OAK_BUTTON = BLOCKS.register("cork_oak_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> CORK_OAK_DOOR = BLOCKS.register("cork_oak_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> CORK_OAK_TRAPDOOR = BLOCKS.register("cork_oak_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> CORK_OAK_SIGN = BLOCKS.register("cork_oak_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.CORK_OAK));
    public static final RegistryObject<Block> CORK_OAK_WALL_SIGN = BLOCKS.register("cork_oak_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.CORK_OAK));
    public static final RegistryObject<Block> CORK_OAK_HANGING_SIGN = BLOCKS.register("cork_oak_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.CORK_OAK));
    public static final RegistryObject<Block> CORK_OAK_WALL_HANGING_SIGN = BLOCKS.register("cork_oak_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.CORK_OAK));
    public static final RegistryObject<Block> CORK_OAK_WOODEN_CRAFTING_TABLE = BLOCKS.register("cork_oak_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> CORK_OAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("cork_oak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> CORK_OAK_WOODEN_CAULDRON = BLOCKS.register("cork_oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> CORK_OAK_WOODEN_HOPPER = BLOCKS.register("cork_oak_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> CORK_OAK_WOODEN_BARREL = BLOCKS.register("cork_oak_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Dragon Blood ──────────────────────────────────
    public static final RegistryObject<Block> DRAGON_BLOOD_LOG = BLOCKS.register("dragon_blood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_DRAGON_BLOOD_LOG = BLOCKS.register("stripped_dragon_blood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> DRAGON_BLOOD_WOOD = BLOCKS.register("dragon_blood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_DRAGON_BLOOD_WOOD = BLOCKS.register("stripped_dragon_blood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> DRAGON_BLOOD_PLANKS = BLOCKS.register("dragon_blood_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> DRAGON_BLOOD_LEAVES = BLOCKS.register("dragon_blood_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> DRAGON_BLOOD_SAPLING = BLOCKS.register("dragon_blood_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.DRAGON_BLOOD, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> DRAGON_BLOOD_SLAB = BLOCKS.register("dragon_blood_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> DRAGON_BLOOD_STAIRS = BLOCKS.register("dragon_blood_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> DRAGON_BLOOD_FENCE = BLOCKS.register("dragon_blood_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> DRAGON_BLOOD_FENCE_GATE = BLOCKS.register("dragon_blood_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.DRAGON_BLOOD));
    public static final RegistryObject<Block> DRAGON_BLOOD_PRESSURE_PLATE = BLOCKS.register("dragon_blood_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> DRAGON_BLOOD_BUTTON = BLOCKS.register("dragon_blood_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> DRAGON_BLOOD_DOOR = BLOCKS.register("dragon_blood_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> DRAGON_BLOOD_TRAPDOOR = BLOCKS.register("dragon_blood_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> DRAGON_BLOOD_SIGN = BLOCKS.register("dragon_blood_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.DRAGON_BLOOD));
    public static final RegistryObject<Block> DRAGON_BLOOD_WALL_SIGN = BLOCKS.register("dragon_blood_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.DRAGON_BLOOD));
    public static final RegistryObject<Block> DRAGON_BLOOD_HANGING_SIGN = BLOCKS.register("dragon_blood_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.DRAGON_BLOOD));
    public static final RegistryObject<Block> DRAGON_BLOOD_WALL_HANGING_SIGN = BLOCKS.register("dragon_blood_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.DRAGON_BLOOD));
    public static final RegistryObject<Block> DRAGON_BLOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("dragon_blood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> DRAGON_BLOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("dragon_blood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> DRAGON_BLOOD_WOODEN_CAULDRON = BLOCKS.register("dragon_blood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> DRAGON_BLOOD_WOODEN_HOPPER = BLOCKS.register("dragon_blood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> DRAGON_BLOOD_WOODEN_BARREL = BLOCKS.register("dragon_blood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Kapok ──────────────────────────────────
    public static final RegistryObject<Block> KAPOK_LOG = BLOCKS.register("kapok_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_KAPOK_LOG = BLOCKS.register("stripped_kapok_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> KAPOK_WOOD = BLOCKS.register("kapok_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_KAPOK_WOOD = BLOCKS.register("stripped_kapok_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> KAPOK_PLANKS = BLOCKS.register("kapok_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> KAPOK_LEAVES = BLOCKS.register("kapok_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> KAPOK_SAPLING = BLOCKS.register("kapok_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.KAPOK, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> KAPOK_SLAB = BLOCKS.register("kapok_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> KAPOK_STAIRS = BLOCKS.register("kapok_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> KAPOK_FENCE = BLOCKS.register("kapok_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> KAPOK_FENCE_GATE = BLOCKS.register("kapok_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.KAPOK));
    public static final RegistryObject<Block> KAPOK_PRESSURE_PLATE = BLOCKS.register("kapok_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> KAPOK_BUTTON = BLOCKS.register("kapok_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> KAPOK_DOOR = BLOCKS.register("kapok_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> KAPOK_TRAPDOOR = BLOCKS.register("kapok_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> KAPOK_SIGN = BLOCKS.register("kapok_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.KAPOK));
    public static final RegistryObject<Block> KAPOK_WALL_SIGN = BLOCKS.register("kapok_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.KAPOK));
    public static final RegistryObject<Block> KAPOK_HANGING_SIGN = BLOCKS.register("kapok_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.KAPOK));
    public static final RegistryObject<Block> KAPOK_WALL_HANGING_SIGN = BLOCKS.register("kapok_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.KAPOK));
    public static final RegistryObject<Block> KAPOK_WOODEN_CRAFTING_TABLE = BLOCKS.register("kapok_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> KAPOK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("kapok_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> KAPOK_WOODEN_CAULDRON = BLOCKS.register("kapok_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> KAPOK_WOODEN_HOPPER = BLOCKS.register("kapok_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> KAPOK_WOODEN_BARREL = BLOCKS.register("kapok_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Larch ──────────────────────────────────
    public static final RegistryObject<Block> LARCH_LOG = BLOCKS.register("larch_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_LARCH_LOG = BLOCKS.register("stripped_larch_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> LARCH_WOOD = BLOCKS.register("larch_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_LARCH_WOOD = BLOCKS.register("stripped_larch_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> LARCH_PLANKS = BLOCKS.register("larch_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LARCH_LEAVES = BLOCKS.register("larch_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> LARCH_SAPLING = BLOCKS.register("larch_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.LARCH, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> LARCH_SLAB = BLOCKS.register("larch_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> LARCH_STAIRS = BLOCKS.register("larch_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> LARCH_FENCE = BLOCKS.register("larch_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> LARCH_FENCE_GATE = BLOCKS.register("larch_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.LARCH));
    public static final RegistryObject<Block> LARCH_PRESSURE_PLATE = BLOCKS.register("larch_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> LARCH_BUTTON = BLOCKS.register("larch_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> LARCH_DOOR = BLOCKS.register("larch_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> LARCH_TRAPDOOR = BLOCKS.register("larch_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> LARCH_SIGN = BLOCKS.register("larch_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.LARCH));
    public static final RegistryObject<Block> LARCH_WALL_SIGN = BLOCKS.register("larch_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.LARCH));
    public static final RegistryObject<Block> LARCH_HANGING_SIGN = BLOCKS.register("larch_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.LARCH));
    public static final RegistryObject<Block> LARCH_WALL_HANGING_SIGN = BLOCKS.register("larch_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.LARCH));
    public static final RegistryObject<Block> LARCH_WOODEN_CRAFTING_TABLE = BLOCKS.register("larch_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> LARCH_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("larch_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> LARCH_WOODEN_CAULDRON = BLOCKS.register("larch_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> LARCH_WOODEN_HOPPER = BLOCKS.register("larch_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> LARCH_WOODEN_BARREL = BLOCKS.register("larch_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Sandalwood ──────────────────────────────────
    public static final RegistryObject<Block> SANDALWOOD_LOG = BLOCKS.register("sandalwood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_SANDALWOOD_LOG = BLOCKS.register("stripped_sandalwood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> SANDALWOOD_WOOD = BLOCKS.register("sandalwood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_SANDALWOOD_WOOD = BLOCKS.register("stripped_sandalwood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> SANDALWOOD_PLANKS = BLOCKS.register("sandalwood_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SANDALWOOD_LEAVES = BLOCKS.register("sandalwood_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> SANDALWOOD_SAPLING = BLOCKS.register("sandalwood_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.SANDALWOOD, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> SANDALWOOD_SLAB = BLOCKS.register("sandalwood_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> SANDALWOOD_STAIRS = BLOCKS.register("sandalwood_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> SANDALWOOD_FENCE = BLOCKS.register("sandalwood_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SANDALWOOD_FENCE_GATE = BLOCKS.register("sandalwood_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.SANDALWOOD));
    public static final RegistryObject<Block> SANDALWOOD_PRESSURE_PLATE = BLOCKS.register("sandalwood_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> SANDALWOOD_BUTTON = BLOCKS.register("sandalwood_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> SANDALWOOD_DOOR = BLOCKS.register("sandalwood_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> SANDALWOOD_TRAPDOOR = BLOCKS.register("sandalwood_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> SANDALWOOD_SIGN = BLOCKS.register("sandalwood_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.SANDALWOOD));
    public static final RegistryObject<Block> SANDALWOOD_WALL_SIGN = BLOCKS.register("sandalwood_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.SANDALWOOD));
    public static final RegistryObject<Block> SANDALWOOD_HANGING_SIGN = BLOCKS.register("sandalwood_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.SANDALWOOD));
    public static final RegistryObject<Block> SANDALWOOD_WALL_HANGING_SIGN = BLOCKS.register("sandalwood_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.SANDALWOOD));
    public static final RegistryObject<Block> SANDALWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("sandalwood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> SANDALWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sandalwood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> SANDALWOOD_WOODEN_CAULDRON = BLOCKS.register("sandalwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> SANDALWOOD_WOODEN_HOPPER = BLOCKS.register("sandalwood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> SANDALWOOD_WOODEN_BARREL = BLOCKS.register("sandalwood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Sycamore ──────────────────────────────────
    public static final RegistryObject<Block> SYCAMORE_LOG = BLOCKS.register("sycamore_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_SYCAMORE_LOG = BLOCKS.register("stripped_sycamore_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> SYCAMORE_WOOD = BLOCKS.register("sycamore_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_SYCAMORE_WOOD = BLOCKS.register("stripped_sycamore_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> SYCAMORE_PLANKS = BLOCKS.register("sycamore_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SYCAMORE_LEAVES = BLOCKS.register("sycamore_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> SYCAMORE_SAPLING = BLOCKS.register("sycamore_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.SYCAMORE, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> SYCAMORE_SLAB = BLOCKS.register("sycamore_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> SYCAMORE_STAIRS = BLOCKS.register("sycamore_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> SYCAMORE_FENCE = BLOCKS.register("sycamore_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> SYCAMORE_FENCE_GATE = BLOCKS.register("sycamore_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.SYCAMORE));
    public static final RegistryObject<Block> SYCAMORE_PRESSURE_PLATE = BLOCKS.register("sycamore_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> SYCAMORE_BUTTON = BLOCKS.register("sycamore_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> SYCAMORE_DOOR = BLOCKS.register("sycamore_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> SYCAMORE_TRAPDOOR = BLOCKS.register("sycamore_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> SYCAMORE_SIGN = BLOCKS.register("sycamore_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.SYCAMORE));
    public static final RegistryObject<Block> SYCAMORE_WALL_SIGN = BLOCKS.register("sycamore_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.SYCAMORE));
    public static final RegistryObject<Block> SYCAMORE_HANGING_SIGN = BLOCKS.register("sycamore_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.SYCAMORE));
    public static final RegistryObject<Block> SYCAMORE_WALL_HANGING_SIGN = BLOCKS.register("sycamore_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.SYCAMORE));
    public static final RegistryObject<Block> SYCAMORE_WOODEN_CRAFTING_TABLE = BLOCKS.register("sycamore_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> SYCAMORE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("sycamore_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> SYCAMORE_WOODEN_CAULDRON = BLOCKS.register("sycamore_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> SYCAMORE_WOODEN_HOPPER = BLOCKS.register("sycamore_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> SYCAMORE_WOODEN_BARREL = BLOCKS.register("sycamore_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Teak ──────────────────────────────────
    public static final RegistryObject<Block> TEAK_LOG = BLOCKS.register("teak_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_TEAK_LOG = BLOCKS.register("stripped_teak_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> TEAK_WOOD = BLOCKS.register("teak_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_TEAK_WOOD = BLOCKS.register("stripped_teak_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> TEAK_PLANKS = BLOCKS.register("teak_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TEAK_LEAVES = BLOCKS.register("teak_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> TEAK_SAPLING = BLOCKS.register("teak_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.TEAK, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> TEAK_SLAB = BLOCKS.register("teak_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> TEAK_STAIRS = BLOCKS.register("teak_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> TEAK_FENCE = BLOCKS.register("teak_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> TEAK_FENCE_GATE = BLOCKS.register("teak_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.TEAK));
    public static final RegistryObject<Block> TEAK_PRESSURE_PLATE = BLOCKS.register("teak_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> TEAK_BUTTON = BLOCKS.register("teak_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> TEAK_DOOR = BLOCKS.register("teak_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> TEAK_TRAPDOOR = BLOCKS.register("teak_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> TEAK_SIGN = BLOCKS.register("teak_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.TEAK));
    public static final RegistryObject<Block> TEAK_WALL_SIGN = BLOCKS.register("teak_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.TEAK));
    public static final RegistryObject<Block> TEAK_HANGING_SIGN = BLOCKS.register("teak_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.TEAK));
    public static final RegistryObject<Block> TEAK_WALL_HANGING_SIGN = BLOCKS.register("teak_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.TEAK));
    public static final RegistryObject<Block> TEAK_WOODEN_CRAFTING_TABLE = BLOCKS.register("teak_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> TEAK_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("teak_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> TEAK_WOODEN_CAULDRON = BLOCKS.register("teak_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> TEAK_WOODEN_HOPPER = BLOCKS.register("teak_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> TEAK_WOODEN_BARREL = BLOCKS.register("teak_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Wenge ──────────────────────────────────
    public static final RegistryObject<Block> WENGE_LOG = BLOCKS.register("wenge_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_WENGE_LOG = BLOCKS.register("stripped_wenge_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> WENGE_WOOD = BLOCKS.register("wenge_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_WENGE_WOOD = BLOCKS.register("stripped_wenge_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> WENGE_PLANKS = BLOCKS.register("wenge_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> WENGE_LEAVES = BLOCKS.register("wenge_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> WENGE_SAPLING = BLOCKS.register("wenge_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.WENGE, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> WENGE_SLAB = BLOCKS.register("wenge_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> WENGE_STAIRS = BLOCKS.register("wenge_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> WENGE_FENCE = BLOCKS.register("wenge_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> WENGE_FENCE_GATE = BLOCKS.register("wenge_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.WENGE));
    public static final RegistryObject<Block> WENGE_PRESSURE_PLATE = BLOCKS.register("wenge_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> WENGE_BUTTON = BLOCKS.register("wenge_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> WENGE_DOOR = BLOCKS.register("wenge_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> WENGE_TRAPDOOR = BLOCKS.register("wenge_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> WENGE_SIGN = BLOCKS.register("wenge_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.WENGE));
    public static final RegistryObject<Block> WENGE_WALL_SIGN = BLOCKS.register("wenge_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.WENGE));
    public static final RegistryObject<Block> WENGE_HANGING_SIGN = BLOCKS.register("wenge_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.WENGE));
    public static final RegistryObject<Block> WENGE_WALL_HANGING_SIGN = BLOCKS.register("wenge_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.WENGE));
    public static final RegistryObject<Block> WENGE_WOODEN_CRAFTING_TABLE = BLOCKS.register("wenge_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> WENGE_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("wenge_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> WENGE_WOODEN_CAULDRON = BLOCKS.register("wenge_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> WENGE_WOODEN_HOPPER = BLOCKS.register("wenge_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> WENGE_WOODEN_BARREL = BLOCKS.register("wenge_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Zebrawood ──────────────────────────────────
    public static final RegistryObject<Block> ZEBRAWOOD_LOG = BLOCKS.register("zebrawood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_ZEBRAWOOD_LOG = BLOCKS.register("stripped_zebrawood_log",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> ZEBRAWOOD_WOOD = BLOCKS.register("zebrawood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_ZEBRAWOOD_WOOD = BLOCKS.register("stripped_zebrawood_wood",
        () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> ZEBRAWOOD_PLANKS = BLOCKS.register("zebrawood_planks",
        () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ZEBRAWOOD_LEAVES = BLOCKS.register("zebrawood_leaves",
        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> ZEBRAWOOD_SAPLING = BLOCKS.register("zebrawood_sapling",
        () -> new SaplingBlock(ModSaplingGrowers.ZEBRAWOOD, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ZEBRAWOOD_SLAB = BLOCKS.register("zebrawood_slab",
        () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> ZEBRAWOOD_STAIRS = BLOCKS.register("zebrawood_stairs",
        () -> new StairBlock(Blocks.OAK_PLANKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> ZEBRAWOOD_FENCE = BLOCKS.register("zebrawood_fence",
        () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> ZEBRAWOOD_FENCE_GATE = BLOCKS.register("zebrawood_fence_gate",
        () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), ModWoodTypes.ZEBRAWOOD));
    public static final RegistryObject<Block> ZEBRAWOOD_PRESSURE_PLATE = BLOCKS.register("zebrawood_pressure_plate",
        () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> ZEBRAWOOD_BUTTON = BLOCKS.register("zebrawood_button",
        () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> ZEBRAWOOD_DOOR = BLOCKS.register("zebrawood_door",
        () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> ZEBRAWOOD_TRAPDOOR = BLOCKS.register("zebrawood_trapdoor",
        () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> ZEBRAWOOD_SIGN = BLOCKS.register("zebrawood_sign",
        () -> new StandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ZEBRAWOOD));
    public static final RegistryObject<Block> ZEBRAWOOD_WALL_SIGN = BLOCKS.register("zebrawood_wall_sign",
        () -> new WallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ZEBRAWOOD));
    public static final RegistryObject<Block> ZEBRAWOOD_HANGING_SIGN = BLOCKS.register("zebrawood_hanging_sign",
        () -> new CeilingHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.ZEBRAWOOD));
    public static final RegistryObject<Block> ZEBRAWOOD_WALL_HANGING_SIGN = BLOCKS.register("zebrawood_wall_hanging_sign",
        () -> new WallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.ZEBRAWOOD));
    public static final RegistryObject<Block> ZEBRAWOOD_WOODEN_CRAFTING_TABLE = BLOCKS.register("zebrawood_wooden_crafting_table",
        () -> new WoodenCraftingTableBlock(craftingTableProps()));
    public static final RegistryObject<Block> ZEBRAWOOD_WOODEN_CRAFTING_TABLE_SLAB = BLOCKS.register("zebrawood_wooden_crafting_table_slab",
        () -> new WoodenCraftingTableSlabBlock(craftingTableProps()));
    public static final RegistryObject<Block> ZEBRAWOOD_WOODEN_CAULDRON = BLOCKS.register("zebrawood_wooden_cauldron",
        () -> new WoodenCauldronBlock(cauldronProps()));
    public static final RegistryObject<Block> ZEBRAWOOD_WOODEN_HOPPER = BLOCKS.register("zebrawood_wooden_hopper",
        () -> new WoodenHopperBlock(hopperProps()));
    public static final RegistryObject<Block> ZEBRAWOOD_WOODEN_BARREL = BLOCKS.register("zebrawood_wooden_barrel",
        () -> new WoodenBarrelBlock(barrelProps()));

    // ── Wooden Chests ──────────────────────────────────────────────────────────
    // ── Vanilla ─────────────────────────────────────────────────────────────────
    public static final RegistryObject<Block> WOODEN_CHEST = BLOCKS.register("wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> OAK_WOODEN_CHEST = BLOCKS.register("oak_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> SPRUCE_WOODEN_CHEST = BLOCKS.register("spruce_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BIRCH_WOODEN_CHEST = BLOCKS.register("birch_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> JUNGLE_WOODEN_CHEST = BLOCKS.register("jungle_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> ACACIA_WOODEN_CHEST = BLOCKS.register("acacia_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> DARK_OAK_WOODEN_CHEST = BLOCKS.register("dark_oak_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> MANGROVE_WOODEN_CHEST = BLOCKS.register("mangrove_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> CHERRY_WOODEN_CHEST = BLOCKS.register("cherry_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BAMBOO_WOODEN_CHEST = BLOCKS.register("bamboo_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> CRIMSON_WOODEN_CHEST = BLOCKS.register("crimson_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> WARPED_WOODEN_CHEST = BLOCKS.register("warped_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));

    // ── Twilight Forest ────────────────────────────────────────────
    public static final RegistryObject<Block> TWILIGHT_OAK_WOODEN_CHEST = BLOCKS.register("twilight_oak_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> CANOPY_WOODEN_CHEST = BLOCKS.register("canopy_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> TWILIGHT_MANGROVE_WOODEN_CHEST = BLOCKS.register("twilight_mangrove_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> DARK_WOODEN_CHEST = BLOCKS.register("dark_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> TIME_WOODEN_CHEST = BLOCKS.register("time_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> TRANSFORMATION_WOODEN_CHEST = BLOCKS.register("transformation_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> MINING_WOODEN_CHEST = BLOCKS.register("mining_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> SORTING_WOODEN_CHEST = BLOCKS.register("sorting_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> TOWERWOOD_WOODEN_CHEST = BLOCKS.register("towerwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));

    // ── Biomes O'Plenty ──────────────────────────────────────────
    public static final RegistryObject<Block> FIR_WOODEN_CHEST = BLOCKS.register("fir_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> PINE_WOODEN_CHEST = BLOCKS.register("pine_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> MAPLE_WOODEN_CHEST = BLOCKS.register("maple_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> REDWOOD_WOODEN_CHEST = BLOCKS.register("redwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> MAHOGANY_WOODEN_CHEST = BLOCKS.register("mahogany_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> JACARANDA_WOODEN_CHEST = BLOCKS.register("jacaranda_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> PALM_WOODEN_CHEST = BLOCKS.register("palm_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> WILLOW_WOODEN_CHEST = BLOCKS.register("willow_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> DEAD_WOODEN_CHEST = BLOCKS.register("dead_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> MAGIC_WOODEN_CHEST = BLOCKS.register("magic_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> UMBRAN_WOODEN_CHEST = BLOCKS.register("umbran_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> HELLBARK_WOODEN_CHEST = BLOCKS.register("hellbark_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> EMPYREAL_WOODEN_CHEST = BLOCKS.register("empyreal_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));

    // ── Deep Aether ──────────────────────────────────────────────
    public static final RegistryObject<Block> ROSEROOT_WOODEN_CHEST = BLOCKS.register("roseroot_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> YAGROOT_WOODEN_CHEST = BLOCKS.register("yagroot_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> CRUDEROOT_WOODEN_CHEST = BLOCKS.register("cruderoot_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> CONBERRY_WOODEN_CHEST = BLOCKS.register("conberry_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> SUNROOT_WOODEN_CHEST = BLOCKS.register("sunroot_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));

    // ── Aether ───────────────────────────────────────────────────
    public static final RegistryObject<Block> SKYROOT_WOODEN_CHEST = BLOCKS.register("skyroot_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));

    // ── Biomes We've Gone ────────────────────────────────────────
    public static final RegistryObject<Block> ASPEN_WOODEN_CHEST = BLOCKS.register("aspen_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BAOBAB_WOODEN_CHEST = BLOCKS.register("baobab_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BLUE_ENCHANTED_WOODEN_CHEST = BLOCKS.register("blue_enchanted_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> CIKA_WOODEN_CHEST = BLOCKS.register("cika_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> CYPRESS_WOODEN_CHEST = BLOCKS.register("cypress_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> EBONY_WOODEN_CHEST = BLOCKS.register("ebony_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BWG_FIR_WOODEN_CHEST = BLOCKS.register("bwg_fir_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> FLORUS_WOODEN_CHEST = BLOCKS.register("florus_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> GREEN_ENCHANTED_WOODEN_CHEST = BLOCKS.register("green_enchanted_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> HOLLY_WOODEN_CHEST = BLOCKS.register("holly_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> IRONWOOD_WOODEN_CHEST = BLOCKS.register("ironwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BWG_JACARANDA_WOODEN_CHEST = BLOCKS.register("bwg_jacaranda_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BWG_MAHOGANY_WOODEN_CHEST = BLOCKS.register("bwg_mahogany_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BWG_MAPLE_WOODEN_CHEST = BLOCKS.register("bwg_maple_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BWG_PALM_WOODEN_CHEST = BLOCKS.register("bwg_palm_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BWG_PINE_WOODEN_CHEST = BLOCKS.register("bwg_pine_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> RAINBOW_EUCALYPTUS_WOODEN_CHEST = BLOCKS.register("rainbow_eucalyptus_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BWG_REDWOOD_WOODEN_CHEST = BLOCKS.register("bwg_redwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> SAKURA_WOODEN_CHEST = BLOCKS.register("sakura_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> SKYRIS_WOODEN_CHEST = BLOCKS.register("skyris_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    //? if neoforge {
    /*public static final RegistryObject<Block> SPIRIT_WOODEN_CHEST = BLOCKS.register("spirit_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    *///?}
    public static final RegistryObject<Block> WHITE_MANGROVE_WOODEN_CHEST = BLOCKS.register("white_mangrove_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BWG_WILLOW_WOODEN_CHEST = BLOCKS.register("bwg_willow_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> WITCH_HAZEL_WOODEN_CHEST = BLOCKS.register("witch_hazel_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> ZELKOVA_WOODEN_CHEST = BLOCKS.register("zelkova_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> AFRICAN_BLACKWOOD_WOODEN_CHEST = BLOCKS.register("african_blackwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BANYAN_WOODEN_CHEST = BLOCKS.register("banyan_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BLACK_WALNUT_WOODEN_CHEST = BLOCKS.register("black_walnut_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BLOODWOOD_WOODEN_CHEST = BLOCKS.register("bloodwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> BRISTLECONE_PINE_WOODEN_CHEST = BLOCKS.register("bristlecone_pine_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> CORK_OAK_WOODEN_CHEST = BLOCKS.register("cork_oak_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> DRAGON_BLOOD_WOODEN_CHEST = BLOCKS.register("dragon_blood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> KAPOK_WOODEN_CHEST = BLOCKS.register("kapok_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> LARCH_WOODEN_CHEST = BLOCKS.register("larch_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> SANDALWOOD_WOODEN_CHEST = BLOCKS.register("sandalwood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> SYCAMORE_WOODEN_CHEST = BLOCKS.register("sycamore_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> TEAK_WOODEN_CHEST = BLOCKS.register("teak_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> WENGE_WOODEN_CHEST = BLOCKS.register("wenge_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));
    public static final RegistryObject<Block> ZEBRAWOOD_WOODEN_CHEST = BLOCKS.register("zebrawood_wooden_chest",
        () -> new WoodenChestBlock(chestProps()));

    //?}

    private ModBlocks() {
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

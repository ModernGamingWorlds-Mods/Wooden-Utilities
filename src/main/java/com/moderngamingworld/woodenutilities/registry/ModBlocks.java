package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenCauldronBlock;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import com.moderngamingworld.woodenutilities.WoodenWaterCauldronBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WoodenUtilities.MOD_ID);

    public static final RegistryObject<Block> WOODEN_WATER_CAULDRON = BLOCKS.register("wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.WOODEN_CAULDRON));
    public static final RegistryObject<Block> WOODEN_CAULDRON = BLOCKS.register("wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> OAK_WOODEN_WATER_CAULDRON = BLOCKS.register("oak_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.OAK_WOODEN_CAULDRON));
    public static final RegistryObject<Block> SPRUCE_WOODEN_WATER_CAULDRON = BLOCKS.register("spruce_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.SPRUCE_WOODEN_CAULDRON));
    public static final RegistryObject<Block> BIRCH_WOODEN_WATER_CAULDRON = BLOCKS.register("birch_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.BIRCH_WOODEN_CAULDRON));
    public static final RegistryObject<Block> JUNGLE_WOODEN_WATER_CAULDRON = BLOCKS.register("jungle_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.JUNGLE_WOODEN_CAULDRON));
    public static final RegistryObject<Block> ACACIA_WOODEN_WATER_CAULDRON = BLOCKS.register("acacia_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.ACACIA_WOODEN_CAULDRON));
    public static final RegistryObject<Block> DARK_OAK_WOODEN_WATER_CAULDRON = BLOCKS.register("dark_oak_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.DARK_OAK_WOODEN_CAULDRON));
    public static final RegistryObject<Block> MANGROVE_WOODEN_WATER_CAULDRON = BLOCKS.register("mangrove_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.MANGROVE_WOODEN_CAULDRON));
    public static final RegistryObject<Block> CHERRY_WOODEN_WATER_CAULDRON = BLOCKS.register("cherry_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.CHERRY_WOODEN_CAULDRON));
    public static final RegistryObject<Block> BAMBOO_WOODEN_WATER_CAULDRON = BLOCKS.register("bamboo_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.BAMBOO_WOODEN_CAULDRON));
    public static final RegistryObject<Block> CRIMSON_WOODEN_WATER_CAULDRON = BLOCKS.register("crimson_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.CRIMSON_WOODEN_CAULDRON));
    public static final RegistryObject<Block> WARPED_WOODEN_WATER_CAULDRON = BLOCKS.register("warped_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.WARPED_WOODEN_CAULDRON));
    public static final RegistryObject<Block> TWILIGHT_OAK_WOODEN_WATER_CAULDRON = BLOCKS.register("twilight_oak_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.TWILIGHT_OAK_WOODEN_CAULDRON));
    public static final RegistryObject<Block> CANOPY_WOODEN_WATER_CAULDRON = BLOCKS.register("canopy_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.CANOPY_WOODEN_CAULDRON));
    public static final RegistryObject<Block> TWILIGHT_MANGROVE_WOODEN_WATER_CAULDRON = BLOCKS.register("twilight_mangrove_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.TWILIGHT_MANGROVE_WOODEN_CAULDRON));
    public static final RegistryObject<Block> DARK_WOODEN_WATER_CAULDRON = BLOCKS.register("dark_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.DARK_WOODEN_CAULDRON));
    public static final RegistryObject<Block> TIME_WOODEN_WATER_CAULDRON = BLOCKS.register("time_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.TIME_WOODEN_CAULDRON));
    public static final RegistryObject<Block> TRANSFORMATION_WOODEN_WATER_CAULDRON = BLOCKS.register("transformation_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.TRANSFORMATION_WOODEN_CAULDRON));
    public static final RegistryObject<Block> MINING_WOODEN_WATER_CAULDRON = BLOCKS.register("mining_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.MINING_WOODEN_CAULDRON));
    public static final RegistryObject<Block> SORTING_WOODEN_WATER_CAULDRON = BLOCKS.register("sorting_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.SORTING_WOODEN_CAULDRON));
    public static final RegistryObject<Block> TOWERWOOD_WOODEN_WATER_CAULDRON = BLOCKS.register("towerwood_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.TOWERWOOD_WOODEN_CAULDRON));
    public static final RegistryObject<Block> FIR_WOODEN_WATER_CAULDRON = BLOCKS.register("fir_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.FIR_WOODEN_CAULDRON));
    public static final RegistryObject<Block> PINE_WOODEN_WATER_CAULDRON = BLOCKS.register("pine_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.PINE_WOODEN_CAULDRON));
    public static final RegistryObject<Block> MAPLE_WOODEN_WATER_CAULDRON = BLOCKS.register("maple_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.MAPLE_WOODEN_CAULDRON));
    public static final RegistryObject<Block> REDWOOD_WOODEN_WATER_CAULDRON = BLOCKS.register("redwood_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.REDWOOD_WOODEN_CAULDRON));
    public static final RegistryObject<Block> MAHOGANY_WOODEN_WATER_CAULDRON = BLOCKS.register("mahogany_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.MAHOGANY_WOODEN_CAULDRON));
    public static final RegistryObject<Block> JACARANDA_WOODEN_WATER_CAULDRON = BLOCKS.register("jacaranda_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.JACARANDA_WOODEN_CAULDRON));
    public static final RegistryObject<Block> PALM_WOODEN_WATER_CAULDRON = BLOCKS.register("palm_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.PALM_WOODEN_CAULDRON));
    public static final RegistryObject<Block> WILLOW_WOODEN_WATER_CAULDRON = BLOCKS.register("willow_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.WILLOW_WOODEN_CAULDRON));
    public static final RegistryObject<Block> DEAD_WOODEN_WATER_CAULDRON = BLOCKS.register("dead_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.DEAD_WOODEN_CAULDRON));
    public static final RegistryObject<Block> MAGIC_WOODEN_WATER_CAULDRON = BLOCKS.register("magic_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.MAGIC_WOODEN_CAULDRON));
    public static final RegistryObject<Block> UMBRAN_WOODEN_WATER_CAULDRON = BLOCKS.register("umbran_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.UMBRAN_WOODEN_CAULDRON));
    public static final RegistryObject<Block> HELLBARK_WOODEN_WATER_CAULDRON = BLOCKS.register("hellbark_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.HELLBARK_WOODEN_CAULDRON));
    public static final RegistryObject<Block> EMPYREAL_WOODEN_WATER_CAULDRON = BLOCKS.register("empyreal_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.EMPYREAL_WOODEN_CAULDRON));
    public static final RegistryObject<Block> ROSEROOT_WOODEN_WATER_CAULDRON = BLOCKS.register("roseroot_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.ROSEROOT_WOODEN_CAULDRON));
    public static final RegistryObject<Block> YAGROOT_WOODEN_WATER_CAULDRON = BLOCKS.register("yagroot_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.YAGROOT_WOODEN_CAULDRON));
    public static final RegistryObject<Block> CRUDEROOT_WOODEN_WATER_CAULDRON = BLOCKS.register("cruderoot_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.CRUDEROOT_WOODEN_CAULDRON));
    public static final RegistryObject<Block> CONBERRY_WOODEN_WATER_CAULDRON = BLOCKS.register("conberry_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.CONBERRY_WOODEN_CAULDRON));
    public static final RegistryObject<Block> SUNROOT_WOODEN_WATER_CAULDRON = BLOCKS.register("sunroot_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.SUNROOT_WOODEN_CAULDRON));
    public static final RegistryObject<Block> SKYROOT_WOODEN_WATER_CAULDRON = BLOCKS.register("skyroot_wooden_water_cauldron",
        () -> new WoodenWaterCauldronBlock(BlockBehaviour.Properties.copy(Blocks.WATER_CAULDRON), ModBlocks.SKYROOT_WOODEN_CAULDRON));
    public static final RegistryObject<Block> OAK_WOODEN_CAULDRON = BLOCKS.register("oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.OAK_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> SPRUCE_WOODEN_CAULDRON = BLOCKS.register("spruce_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.SPRUCE_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> BIRCH_WOODEN_CAULDRON = BLOCKS.register("birch_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.BIRCH_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> JUNGLE_WOODEN_CAULDRON = BLOCKS.register("jungle_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.JUNGLE_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> ACACIA_WOODEN_CAULDRON = BLOCKS.register("acacia_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.ACACIA_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> DARK_OAK_WOODEN_CAULDRON = BLOCKS.register("dark_oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.DARK_OAK_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> MANGROVE_WOODEN_CAULDRON = BLOCKS.register("mangrove_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.MANGROVE_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> CHERRY_WOODEN_CAULDRON = BLOCKS.register("cherry_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.CHERRY_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> BAMBOO_WOODEN_CAULDRON = BLOCKS.register("bamboo_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.BAMBOO_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> CRIMSON_WOODEN_CAULDRON = BLOCKS.register("crimson_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.CRIMSON_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> WARPED_WOODEN_CAULDRON = BLOCKS.register("warped_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.WARPED_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> TWILIGHT_OAK_WOODEN_CAULDRON = BLOCKS.register("twilight_oak_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.TWILIGHT_OAK_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> CANOPY_WOODEN_CAULDRON = BLOCKS.register("canopy_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.CANOPY_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> TWILIGHT_MANGROVE_WOODEN_CAULDRON = BLOCKS.register("twilight_mangrove_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.TWILIGHT_MANGROVE_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> DARK_WOODEN_CAULDRON = BLOCKS.register("dark_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.DARK_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> TIME_WOODEN_CAULDRON = BLOCKS.register("time_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.TIME_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> TRANSFORMATION_WOODEN_CAULDRON = BLOCKS.register("transformation_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.TRANSFORMATION_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> MINING_WOODEN_CAULDRON = BLOCKS.register("mining_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.MINING_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> SORTING_WOODEN_CAULDRON = BLOCKS.register("sorting_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.SORTING_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> TOWERWOOD_WOODEN_CAULDRON = BLOCKS.register("towerwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.TOWERWOOD_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> FIR_WOODEN_CAULDRON = BLOCKS.register("fir_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.FIR_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> PINE_WOODEN_CAULDRON = BLOCKS.register("pine_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.PINE_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> MAPLE_WOODEN_CAULDRON = BLOCKS.register("maple_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.MAPLE_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> REDWOOD_WOODEN_CAULDRON = BLOCKS.register("redwood_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.REDWOOD_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> MAHOGANY_WOODEN_CAULDRON = BLOCKS.register("mahogany_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.MAHOGANY_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> JACARANDA_WOODEN_CAULDRON = BLOCKS.register("jacaranda_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.JACARANDA_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> PALM_WOODEN_CAULDRON = BLOCKS.register("palm_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.PALM_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> WILLOW_WOODEN_CAULDRON = BLOCKS.register("willow_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.WILLOW_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> DEAD_WOODEN_CAULDRON = BLOCKS.register("dead_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.DEAD_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> MAGIC_WOODEN_CAULDRON = BLOCKS.register("magic_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.MAGIC_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> UMBRAN_WOODEN_CAULDRON = BLOCKS.register("umbran_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.UMBRAN_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> HELLBARK_WOODEN_CAULDRON = BLOCKS.register("hellbark_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.HELLBARK_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> EMPYREAL_WOODEN_CAULDRON = BLOCKS.register("empyreal_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.EMPYREAL_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> ROSEROOT_WOODEN_CAULDRON = BLOCKS.register("roseroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.ROSEROOT_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> YAGROOT_WOODEN_CAULDRON = BLOCKS.register("yagroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.YAGROOT_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> CRUDEROOT_WOODEN_CAULDRON = BLOCKS.register("cruderoot_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.CRUDEROOT_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> CONBERRY_WOODEN_CAULDRON = BLOCKS.register("conberry_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.CONBERRY_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> SUNROOT_WOODEN_CAULDRON = BLOCKS.register("sunroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.SUNROOT_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> SKYROOT_WOODEN_CAULDRON = BLOCKS.register("skyroot_wooden_cauldron",
        () -> new WoodenCauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON), ModBlocks.SKYROOT_WOODEN_WATER_CAULDRON));
    public static final RegistryObject<Block> WOODEN_BARREL = BLOCKS.register("wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> OAK_WOODEN_BARREL = BLOCKS.register("oak_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SPRUCE_WOODEN_BARREL = BLOCKS.register("spruce_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BIRCH_WOODEN_BARREL = BLOCKS.register("birch_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JUNGLE_WOODEN_BARREL = BLOCKS.register("jungle_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ACACIA_WOODEN_BARREL = BLOCKS.register("acacia_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_OAK_WOODEN_BARREL = BLOCKS.register("dark_oak_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> MANGROVE_WOODEN_BARREL = BLOCKS.register("mangrove_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CHERRY_WOODEN_BARREL = BLOCKS.register("cherry_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BAMBOO_WOODEN_BARREL = BLOCKS.register("bamboo_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRIMSON_WOODEN_BARREL = BLOCKS.register("crimson_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WARPED_WOODEN_BARREL = BLOCKS.register("warped_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> TWILIGHT_OAK_WOODEN_BARREL = BLOCKS.register("twilight_oak_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CANOPY_WOODEN_BARREL = BLOCKS.register("canopy_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> TWILIGHT_MANGROVE_WOODEN_BARREL = BLOCKS.register("twilight_mangrove_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_WOODEN_BARREL = BLOCKS.register("dark_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> TIME_WOODEN_BARREL = BLOCKS.register("time_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> TRANSFORMATION_WOODEN_BARREL = BLOCKS.register("transformation_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> MINING_WOODEN_BARREL = BLOCKS.register("mining_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SORTING_WOODEN_BARREL = BLOCKS.register("sorting_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> TOWERWOOD_WOODEN_BARREL = BLOCKS.register("towerwood_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> FIR_WOODEN_BARREL = BLOCKS.register("fir_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> PINE_WOODEN_BARREL = BLOCKS.register("pine_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> MAPLE_WOODEN_BARREL = BLOCKS.register("maple_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> REDWOOD_WOODEN_BARREL = BLOCKS.register("redwood_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> MAHOGANY_WOODEN_BARREL = BLOCKS.register("mahogany_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JACARANDA_WOODEN_BARREL = BLOCKS.register("jacaranda_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> PALM_WOODEN_BARREL = BLOCKS.register("palm_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WILLOW_WOODEN_BARREL = BLOCKS.register("willow_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DEAD_WOODEN_BARREL = BLOCKS.register("dead_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> MAGIC_WOODEN_BARREL = BLOCKS.register("magic_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> UMBRAN_WOODEN_BARREL = BLOCKS.register("umbran_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> HELLBARK_WOODEN_BARREL = BLOCKS.register("hellbark_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> EMPYREAL_WOODEN_BARREL = BLOCKS.register("empyreal_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ROSEROOT_WOODEN_BARREL = BLOCKS.register("roseroot_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> YAGROOT_WOODEN_BARREL = BLOCKS.register("yagroot_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRUDEROOT_WOODEN_BARREL = BLOCKS.register("cruderoot_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CONBERRY_WOODEN_BARREL = BLOCKS.register("conberry_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SUNROOT_WOODEN_BARREL = BLOCKS.register("sunroot_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SKYROOT_WOODEN_BARREL = BLOCKS.register("skyroot_wooden_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.copy(Blocks.BARREL)));

    private ModBlocks() {
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

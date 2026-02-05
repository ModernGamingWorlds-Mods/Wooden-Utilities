package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.CauldronBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WoodenUtilities.MOD_ID);

    public static final RegistryObject<Block> WOODEN_CAULDRON = BLOCKS.register("wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> OAK_WOODEN_CAULDRON = BLOCKS.register("oak_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> SPRUCE_WOODEN_CAULDRON = BLOCKS.register("spruce_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> BIRCH_WOODEN_CAULDRON = BLOCKS.register("birch_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> JUNGLE_WOODEN_CAULDRON = BLOCKS.register("jungle_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> ACACIA_WOODEN_CAULDRON = BLOCKS.register("acacia_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> DARK_OAK_WOODEN_CAULDRON = BLOCKS.register("dark_oak_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> MANGROVE_WOODEN_CAULDRON = BLOCKS.register("mangrove_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> CHERRY_WOODEN_CAULDRON = BLOCKS.register("cherry_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> BAMBOO_WOODEN_CAULDRON = BLOCKS.register("bamboo_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> CRIMSON_WOODEN_CAULDRON = BLOCKS.register("crimson_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> WARPED_WOODEN_CAULDRON = BLOCKS.register("warped_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> TWILIGHT_OAK_WOODEN_CAULDRON = BLOCKS.register("twilight_oak_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> CANOPY_WOODEN_CAULDRON = BLOCKS.register("canopy_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> TWILIGHT_MANGROVE_WOODEN_CAULDRON = BLOCKS.register("twilight_mangrove_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> DARK_WOODEN_CAULDRON = BLOCKS.register("dark_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> TIME_WOODEN_CAULDRON = BLOCKS.register("time_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> TRANSFORMATION_WOODEN_CAULDRON = BLOCKS.register("transformation_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> MINING_WOODEN_CAULDRON = BLOCKS.register("mining_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> SORTING_WOODEN_CAULDRON = BLOCKS.register("sorting_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> TOWERWOOD_WOODEN_CAULDRON = BLOCKS.register("towerwood_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> FIR_WOODEN_CAULDRON = BLOCKS.register("fir_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> PINE_WOODEN_CAULDRON = BLOCKS.register("pine_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> MAPLE_WOODEN_CAULDRON = BLOCKS.register("maple_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> REDWOOD_WOODEN_CAULDRON = BLOCKS.register("redwood_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> MAHOGANY_WOODEN_CAULDRON = BLOCKS.register("mahogany_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> JACARANDA_WOODEN_CAULDRON = BLOCKS.register("jacaranda_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> PALM_WOODEN_CAULDRON = BLOCKS.register("palm_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> WILLOW_WOODEN_CAULDRON = BLOCKS.register("willow_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> DEAD_WOODEN_CAULDRON = BLOCKS.register("dead_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> MAGIC_WOODEN_CAULDRON = BLOCKS.register("magic_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> UMBRAN_WOODEN_CAULDRON = BLOCKS.register("umbran_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> HELLBARK_WOODEN_CAULDRON = BLOCKS.register("hellbark_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> EMPYREAL_WOODEN_CAULDRON = BLOCKS.register("empyreal_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> ROSEROOT_WOODEN_CAULDRON = BLOCKS.register("roseroot_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> YAGROOT_WOODEN_CAULDRON = BLOCKS.register("yagroot_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> CRUDEROOT_WOODEN_CAULDRON = BLOCKS.register("cruderoot_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> CONBERRY_WOODEN_CAULDRON = BLOCKS.register("conberry_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> SUNROOT_WOODEN_CAULDRON = BLOCKS.register("sunroot_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
    public static final RegistryObject<Block> SKYROOT_WOODEN_CAULDRON = BLOCKS.register("skyroot_wooden_cauldron",
        () -> new CauldronBlock(BlockBehaviour.Properties.copy(Blocks.CAULDRON)));
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

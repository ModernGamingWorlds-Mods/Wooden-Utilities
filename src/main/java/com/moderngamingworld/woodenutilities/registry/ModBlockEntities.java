package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenBarrelBlockEntity;
import com.moderngamingworld.woodenutilities.WoodenCauldronBlockEntity;
import com.moderngamingworld.woodenutilities.WoodenHopperBlockEntity;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
//? if neoforge {
/*import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
*///?} else {
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
//?}

public final class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, WoodenUtilities.MOD_ID);

    //? if neoforge {
    /*public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenCauldronBlockEntity>> WOODEN_CAULDRON =
    *///?} else {
    public static final RegistryObject<BlockEntityType<WoodenCauldronBlockEntity>> WOODEN_CAULDRON =
    //?}
            BLOCK_ENTITIES.register("wooden_cauldron", () ->
                    BlockEntityType.Builder.of(WoodenCauldronBlockEntity::new,
                            ModBlocks.OAK_WOODEN_CAULDRON.get(),
                            ModBlocks.SPRUCE_WOODEN_CAULDRON.get(),
                            ModBlocks.BIRCH_WOODEN_CAULDRON.get(),
                            ModBlocks.JUNGLE_WOODEN_CAULDRON.get(),
                            ModBlocks.ACACIA_WOODEN_CAULDRON.get(),
                            ModBlocks.DARK_OAK_WOODEN_CAULDRON.get(),
                            ModBlocks.MANGROVE_WOODEN_CAULDRON.get(),
                            ModBlocks.CHERRY_WOODEN_CAULDRON.get(),
                            ModBlocks.BAMBOO_WOODEN_CAULDRON.get(),
                            ModBlocks.CRIMSON_WOODEN_CAULDRON.get(),
                            ModBlocks.WARPED_WOODEN_CAULDRON.get(),
                            ModBlocks.TWILIGHT_OAK_WOODEN_CAULDRON.get(),
                            ModBlocks.CANOPY_WOODEN_CAULDRON.get(),
                            ModBlocks.TWILIGHT_MANGROVE_WOODEN_CAULDRON.get(),
                            ModBlocks.DARK_WOODEN_CAULDRON.get(),
                            ModBlocks.TIME_WOODEN_CAULDRON.get(),
                            ModBlocks.MINING_WOODEN_CAULDRON.get(),
                            ModBlocks.SORTING_WOODEN_CAULDRON.get(),
                            ModBlocks.TOWERWOOD_WOODEN_CAULDRON.get(),
                            ModBlocks.FIR_WOODEN_CAULDRON.get(),
                            ModBlocks.PINE_WOODEN_CAULDRON.get(),
                            ModBlocks.MAPLE_WOODEN_CAULDRON.get(),
                            ModBlocks.REDWOOD_WOODEN_CAULDRON.get(),
                            ModBlocks.MAHOGANY_WOODEN_CAULDRON.get(),
                            ModBlocks.JACARANDA_WOODEN_CAULDRON.get(),
                            ModBlocks.PALM_WOODEN_CAULDRON.get(),
                            ModBlocks.WILLOW_WOODEN_CAULDRON.get(),
                            ModBlocks.DEAD_WOODEN_CAULDRON.get(),
                            ModBlocks.MAGIC_WOODEN_CAULDRON.get(),
                            ModBlocks.UMBRAN_WOODEN_CAULDRON.get(),
                            ModBlocks.HELLBARK_WOODEN_CAULDRON.get(),
                            ModBlocks.EMPYREAL_WOODEN_CAULDRON.get(),
                            ModBlocks.ROSEROOT_WOODEN_CAULDRON.get(),
                            ModBlocks.YAGROOT_WOODEN_CAULDRON.get(),
                            ModBlocks.CRUDEROOT_WOODEN_CAULDRON.get(),
                            ModBlocks.CONBERRY_WOODEN_CAULDRON.get(),
                            ModBlocks.SUNROOT_WOODEN_CAULDRON.get(),
                            ModBlocks.SKYROOT_WOODEN_CAULDRON.get(),
                            ModBlocks.ASPEN_WOODEN_CAULDRON.get(),
                            ModBlocks.BAOBAB_WOODEN_CAULDRON.get(),
                            ModBlocks.BLUE_ENCHANTED_WOODEN_CAULDRON.get(),
                            ModBlocks.CIKA_WOODEN_CAULDRON.get(),
                            ModBlocks.CYPRESS_WOODEN_CAULDRON.get(),
                            ModBlocks.EBONY_WOODEN_CAULDRON.get(),
                            ModBlocks.BWG_FIR_WOODEN_CAULDRON.get(),
                            ModBlocks.FLORUS_WOODEN_CAULDRON.get(),
                            ModBlocks.GREEN_ENCHANTED_WOODEN_CAULDRON.get(),
                            ModBlocks.HOLLY_WOODEN_CAULDRON.get(),
                            ModBlocks.IRONWOOD_WOODEN_CAULDRON.get(),
                            ModBlocks.BWG_JACARANDA_WOODEN_CAULDRON.get(),
                            ModBlocks.BWG_MAHOGANY_WOODEN_CAULDRON.get(),
                            ModBlocks.BWG_MAPLE_WOODEN_CAULDRON.get(),
                            ModBlocks.BWG_PALM_WOODEN_CAULDRON.get(),
                            ModBlocks.BWG_PINE_WOODEN_CAULDRON.get(),
                            ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_CAULDRON.get(),
                            ModBlocks.BWG_REDWOOD_WOODEN_CAULDRON.get(),
                            ModBlocks.SAKURA_WOODEN_CAULDRON.get(),
                            ModBlocks.SKYRIS_WOODEN_CAULDRON.get(),
                            //? if neoforge {
                            /*ModBlocks.SPIRIT_WOODEN_CAULDRON.get(),
                            *///?}
                            ModBlocks.WHITE_MANGROVE_WOODEN_CAULDRON.get(),
                            ModBlocks.BWG_WILLOW_WOODEN_CAULDRON.get(),
                            ModBlocks.WITCH_HAZEL_WOODEN_CAULDRON.get(),
                            ModBlocks.ZELKOVA_WOODEN_CAULDRON.get()
                    ).build(null));

    //? if neoforge {
    /*public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenBarrelBlockEntity>> WOODEN_BARREL =
    *///?} else {
    public static final RegistryObject<BlockEntityType<WoodenBarrelBlockEntity>> WOODEN_BARREL =
    //?}
            BLOCK_ENTITIES.register("wooden_barrel", () ->
                    BlockEntityType.Builder.of(WoodenBarrelBlockEntity::new,
                            ModBlocks.WOODEN_BARREL.get(),
                            ModBlocks.OAK_WOODEN_BARREL.get(),
                            ModBlocks.SPRUCE_WOODEN_BARREL.get(),
                            ModBlocks.BIRCH_WOODEN_BARREL.get(),
                            ModBlocks.JUNGLE_WOODEN_BARREL.get(),
                            ModBlocks.ACACIA_WOODEN_BARREL.get(),
                            ModBlocks.DARK_OAK_WOODEN_BARREL.get(),
                            ModBlocks.MANGROVE_WOODEN_BARREL.get(),
                            ModBlocks.CHERRY_WOODEN_BARREL.get(),
                            ModBlocks.BAMBOO_WOODEN_BARREL.get(),
                            ModBlocks.CRIMSON_WOODEN_BARREL.get(),
                            ModBlocks.WARPED_WOODEN_BARREL.get(),
                            ModBlocks.TWILIGHT_OAK_WOODEN_BARREL.get(),
                            ModBlocks.CANOPY_WOODEN_BARREL.get(),
                            ModBlocks.TWILIGHT_MANGROVE_WOODEN_BARREL.get(),
                            ModBlocks.DARK_WOODEN_BARREL.get(),
                            ModBlocks.TIME_WOODEN_BARREL.get(),
                            ModBlocks.TRANSFORMATION_WOODEN_BARREL.get(),
                            ModBlocks.MINING_WOODEN_BARREL.get(),
                            ModBlocks.SORTING_WOODEN_BARREL.get(),
                            ModBlocks.TOWERWOOD_WOODEN_BARREL.get(),
                            ModBlocks.FIR_WOODEN_BARREL.get(),
                            ModBlocks.PINE_WOODEN_BARREL.get(),
                            ModBlocks.MAPLE_WOODEN_BARREL.get(),
                            ModBlocks.REDWOOD_WOODEN_BARREL.get(),
                            ModBlocks.MAHOGANY_WOODEN_BARREL.get(),
                            ModBlocks.JACARANDA_WOODEN_BARREL.get(),
                            ModBlocks.PALM_WOODEN_BARREL.get(),
                            ModBlocks.WILLOW_WOODEN_BARREL.get(),
                            ModBlocks.DEAD_WOODEN_BARREL.get(),
                            ModBlocks.MAGIC_WOODEN_BARREL.get(),
                            ModBlocks.UMBRAN_WOODEN_BARREL.get(),
                            ModBlocks.HELLBARK_WOODEN_BARREL.get(),
                            ModBlocks.EMPYREAL_WOODEN_BARREL.get(),
                            ModBlocks.ROSEROOT_WOODEN_BARREL.get(),
                            ModBlocks.YAGROOT_WOODEN_BARREL.get(),
                            ModBlocks.CRUDEROOT_WOODEN_BARREL.get(),
                            ModBlocks.CONBERRY_WOODEN_BARREL.get(),
                            ModBlocks.SUNROOT_WOODEN_BARREL.get(),
                            ModBlocks.SKYROOT_WOODEN_BARREL.get(),
                            ModBlocks.ASPEN_WOODEN_BARREL.get(),
                            ModBlocks.BAOBAB_WOODEN_BARREL.get(),
                            ModBlocks.BLUE_ENCHANTED_WOODEN_BARREL.get(),
                            ModBlocks.CIKA_WOODEN_BARREL.get(),
                            ModBlocks.CYPRESS_WOODEN_BARREL.get(),
                            ModBlocks.EBONY_WOODEN_BARREL.get(),
                            ModBlocks.BWG_FIR_WOODEN_BARREL.get(),
                            ModBlocks.FLORUS_WOODEN_BARREL.get(),
                            ModBlocks.GREEN_ENCHANTED_WOODEN_BARREL.get(),
                            ModBlocks.HOLLY_WOODEN_BARREL.get(),
                            ModBlocks.IRONWOOD_WOODEN_BARREL.get(),
                            ModBlocks.BWG_JACARANDA_WOODEN_BARREL.get(),
                            ModBlocks.BWG_MAHOGANY_WOODEN_BARREL.get(),
                            ModBlocks.BWG_MAPLE_WOODEN_BARREL.get(),
                            ModBlocks.BWG_PALM_WOODEN_BARREL.get(),
                            ModBlocks.BWG_PINE_WOODEN_BARREL.get(),
                            ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_BARREL.get(),
                            ModBlocks.BWG_REDWOOD_WOODEN_BARREL.get(),
                            ModBlocks.SAKURA_WOODEN_BARREL.get(),
                            ModBlocks.SKYRIS_WOODEN_BARREL.get(),
                            //? if neoforge {
                            /*ModBlocks.SPIRIT_WOODEN_BARREL.get(),
                            *///?}
                            ModBlocks.WHITE_MANGROVE_WOODEN_BARREL.get(),
                            ModBlocks.BWG_WILLOW_WOODEN_BARREL.get(),
                            ModBlocks.WITCH_HAZEL_WOODEN_BARREL.get(),
                            ModBlocks.ZELKOVA_WOODEN_BARREL.get()
                    ).build(null));

    //? if neoforge {
    /*public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WoodenHopperBlockEntity>> WOODEN_HOPPER =
    *///?} else {
    public static final RegistryObject<BlockEntityType<WoodenHopperBlockEntity>> WOODEN_HOPPER =
    //?}
            BLOCK_ENTITIES.register("wooden_hopper", () ->
                    BlockEntityType.Builder.of(WoodenHopperBlockEntity::new,
                            ModBlocks.OAK_WOODEN_HOPPER.get(),
                            ModBlocks.SPRUCE_WOODEN_HOPPER.get(),
                            ModBlocks.BIRCH_WOODEN_HOPPER.get(),
                            ModBlocks.JUNGLE_WOODEN_HOPPER.get(),
                            ModBlocks.ACACIA_WOODEN_HOPPER.get(),
                            ModBlocks.DARK_OAK_WOODEN_HOPPER.get(),
                            ModBlocks.MANGROVE_WOODEN_HOPPER.get(),
                            ModBlocks.CHERRY_WOODEN_HOPPER.get(),
                            ModBlocks.BAMBOO_WOODEN_HOPPER.get(),
                            ModBlocks.CRIMSON_WOODEN_HOPPER.get(),
                            ModBlocks.WARPED_WOODEN_HOPPER.get(),
                            ModBlocks.TWILIGHT_OAK_WOODEN_HOPPER.get(),
                            ModBlocks.CANOPY_WOODEN_HOPPER.get(),
                            ModBlocks.TWILIGHT_MANGROVE_WOODEN_HOPPER.get(),
                            ModBlocks.DARK_WOODEN_HOPPER.get(),
                            ModBlocks.TIME_WOODEN_HOPPER.get(),
                            ModBlocks.MINING_WOODEN_HOPPER.get(),
                            ModBlocks.SORTING_WOODEN_HOPPER.get(),
                            ModBlocks.TOWERWOOD_WOODEN_HOPPER.get(),
                            ModBlocks.FIR_WOODEN_HOPPER.get(),
                            ModBlocks.PINE_WOODEN_HOPPER.get(),
                            ModBlocks.MAPLE_WOODEN_HOPPER.get(),
                            ModBlocks.REDWOOD_WOODEN_HOPPER.get(),
                            ModBlocks.MAHOGANY_WOODEN_HOPPER.get(),
                            ModBlocks.JACARANDA_WOODEN_HOPPER.get(),
                            ModBlocks.PALM_WOODEN_HOPPER.get(),
                            ModBlocks.WILLOW_WOODEN_HOPPER.get(),
                            ModBlocks.DEAD_WOODEN_HOPPER.get(),
                            ModBlocks.MAGIC_WOODEN_HOPPER.get(),
                            ModBlocks.UMBRAN_WOODEN_HOPPER.get(),
                            ModBlocks.HELLBARK_WOODEN_HOPPER.get(),
                            ModBlocks.EMPYREAL_WOODEN_HOPPER.get(),
                            ModBlocks.ROSEROOT_WOODEN_HOPPER.get(),
                            ModBlocks.YAGROOT_WOODEN_HOPPER.get(),
                            ModBlocks.CRUDEROOT_WOODEN_HOPPER.get(),
                            ModBlocks.CONBERRY_WOODEN_HOPPER.get(),
                            ModBlocks.SUNROOT_WOODEN_HOPPER.get(),
                            ModBlocks.SKYROOT_WOODEN_HOPPER.get(),
                            ModBlocks.ASPEN_WOODEN_HOPPER.get(),
                            ModBlocks.BAOBAB_WOODEN_HOPPER.get(),
                            ModBlocks.BLUE_ENCHANTED_WOODEN_HOPPER.get(),
                            ModBlocks.CIKA_WOODEN_HOPPER.get(),
                            ModBlocks.CYPRESS_WOODEN_HOPPER.get(),
                            ModBlocks.EBONY_WOODEN_HOPPER.get(),
                            ModBlocks.BWG_FIR_WOODEN_HOPPER.get(),
                            ModBlocks.FLORUS_WOODEN_HOPPER.get(),
                            ModBlocks.GREEN_ENCHANTED_WOODEN_HOPPER.get(),
                            ModBlocks.HOLLY_WOODEN_HOPPER.get(),
                            ModBlocks.IRONWOOD_WOODEN_HOPPER.get(),
                            ModBlocks.BWG_JACARANDA_WOODEN_HOPPER.get(),
                            ModBlocks.BWG_MAHOGANY_WOODEN_HOPPER.get(),
                            ModBlocks.BWG_MAPLE_WOODEN_HOPPER.get(),
                            ModBlocks.BWG_PALM_WOODEN_HOPPER.get(),
                            ModBlocks.BWG_PINE_WOODEN_HOPPER.get(),
                            ModBlocks.RAINBOW_EUCALYPTUS_WOODEN_HOPPER.get(),
                            ModBlocks.BWG_REDWOOD_WOODEN_HOPPER.get(),
                            ModBlocks.SAKURA_WOODEN_HOPPER.get(),
                            ModBlocks.SKYRIS_WOODEN_HOPPER.get(),
                            //? if neoforge {
                            /*ModBlocks.SPIRIT_WOODEN_HOPPER.get(),
                            *///?}
                            ModBlocks.WHITE_MANGROVE_WOODEN_HOPPER.get(),
                            ModBlocks.BWG_WILLOW_WOODEN_HOPPER.get(),
                            ModBlocks.WITCH_HAZEL_WOODEN_HOPPER.get(),
                            ModBlocks.ZELKOVA_WOODEN_HOPPER.get()
                    ).build(null));

    private ModBlockEntities() {}

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}

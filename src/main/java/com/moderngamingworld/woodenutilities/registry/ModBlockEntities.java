package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenCauldronBlockEntity;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WoodenUtilities.MOD_ID);

    public static final RegistryObject<BlockEntityType<WoodenCauldronBlockEntity>> WOODEN_CAULDRON =
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
                            ModBlocks.SKYROOT_WOODEN_CAULDRON.get()
                    ).build(null));

    private ModBlockEntities() {}

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}

package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenBucketItem;
import com.moderngamingworld.woodenutilities.WoodenUtilities;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluids;
//? if neoforge {
/*import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
*///?} else {
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
//?}

public final class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WoodenUtilities.MOD_ID);

    //? if neoforge {
    /*public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WOODEN_UTILITIES_TAB =
    *///?} else {
    public static final RegistryObject<CreativeModeTab> WOODEN_UTILITIES_TAB =
    //?}
            CREATIVE_MODE_TABS.register("wooden_utilities", () ->
                    CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.OAK_WOODEN_CAULDRON.get()))
                            .title(Component.translatable("itemGroup.woodenutilities"))
                            .displayItems((params, output) -> {
                                boolean hasTF        = ModList.get().isLoaded("twilightforest");
                                boolean hasBOP       = ModList.get().isLoaded("biomesoplenty");
                                boolean hasDeepAether = ModList.get().isLoaded("deep_aether");
                                boolean hasAether     = ModList.get().isLoaded("aether");

                                // ── Plates ──────────────────────────────────────────────
                                output.accept(ModItems.OAK_WOODEN_PLATE.get());
                                output.accept(ModItems.SPRUCE_WOODEN_PLATE.get());
                                output.accept(ModItems.BIRCH_WOODEN_PLATE.get());
                                output.accept(ModItems.JUNGLE_WOODEN_PLATE.get());
                                output.accept(ModItems.ACACIA_WOODEN_PLATE.get());
                                output.accept(ModItems.DARK_OAK_WOODEN_PLATE.get());
                                output.accept(ModItems.MANGROVE_WOODEN_PLATE.get());
                                output.accept(ModItems.CHERRY_WOODEN_PLATE.get());
                                output.accept(ModItems.BAMBOO_WOODEN_PLATE.get());
                                output.accept(ModItems.CRIMSON_WOODEN_PLATE.get());
                                output.accept(ModItems.WARPED_WOODEN_PLATE.get());
                                if (hasTF) {
                                    output.accept(ModItems.TWILIGHT_OAK_WOODEN_PLATE.get());
                                    output.accept(ModItems.CANOPY_WOODEN_PLATE.get());
                                    output.accept(ModItems.TWILIGHT_MANGROVE_WOODEN_PLATE.get());
                                    output.accept(ModItems.DARK_WOODEN_PLATE.get());
                                    output.accept(ModItems.TIME_WOODEN_PLATE.get());
                                    output.accept(ModItems.TRANSFORMATION_WOODEN_PLATE.get());
                                    output.accept(ModItems.MINING_WOODEN_PLATE.get());
                                    output.accept(ModItems.SORTING_WOODEN_PLATE.get());
                                    output.accept(ModItems.TOWERWOOD_WOODEN_PLATE.get());
                                }
                                if (hasBOP) {
                                    output.accept(ModItems.FIR_WOODEN_PLATE.get());
                                    output.accept(ModItems.PINE_WOODEN_PLATE.get());
                                    output.accept(ModItems.MAPLE_WOODEN_PLATE.get());
                                    output.accept(ModItems.REDWOOD_WOODEN_PLATE.get());
                                    output.accept(ModItems.MAHOGANY_WOODEN_PLATE.get());
                                    output.accept(ModItems.JACARANDA_WOODEN_PLATE.get());
                                    output.accept(ModItems.PALM_WOODEN_PLATE.get());
                                    output.accept(ModItems.WILLOW_WOODEN_PLATE.get());
                                    output.accept(ModItems.DEAD_WOODEN_PLATE.get());
                                    output.accept(ModItems.MAGIC_WOODEN_PLATE.get());
                                    output.accept(ModItems.UMBRAN_WOODEN_PLATE.get());
                                    output.accept(ModItems.HELLBARK_WOODEN_PLATE.get());
                                    output.accept(ModItems.EMPYREAL_WOODEN_PLATE.get());
                                }
                                if (hasDeepAether) {
                                    output.accept(ModItems.ROSEROOT_WOODEN_PLATE.get());
                                    output.accept(ModItems.YAGROOT_WOODEN_PLATE.get());
                                    output.accept(ModItems.CRUDEROOT_WOODEN_PLATE.get());
                                    output.accept(ModItems.CONBERRY_WOODEN_PLATE.get());
                                    output.accept(ModItems.SUNROOT_WOODEN_PLATE.get());
                                }
                                if (hasAether) {
                                    output.accept(ModItems.SKYROOT_WOODEN_PLATE.get());
                                }

                                // ── Cauldrons ────────────────────────────────────────────
                                output.accept(ModItems.OAK_WOODEN_CAULDRON.get());
                                output.accept(ModItems.SPRUCE_WOODEN_CAULDRON.get());
                                output.accept(ModItems.BIRCH_WOODEN_CAULDRON.get());
                                output.accept(ModItems.JUNGLE_WOODEN_CAULDRON.get());
                                output.accept(ModItems.ACACIA_WOODEN_CAULDRON.get());
                                output.accept(ModItems.DARK_OAK_WOODEN_CAULDRON.get());
                                output.accept(ModItems.MANGROVE_WOODEN_CAULDRON.get());
                                output.accept(ModItems.CHERRY_WOODEN_CAULDRON.get());
                                output.accept(ModItems.BAMBOO_WOODEN_CAULDRON.get());
                                output.accept(ModItems.CRIMSON_WOODEN_CAULDRON.get());
                                output.accept(ModItems.WARPED_WOODEN_CAULDRON.get());
                                if (hasTF) {
                                    output.accept(ModItems.TWILIGHT_OAK_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.CANOPY_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.TWILIGHT_MANGROVE_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.DARK_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.TIME_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.MINING_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.SORTING_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.TOWERWOOD_WOODEN_CAULDRON.get());
                                }
                                if (hasBOP) {
                                    output.accept(ModItems.FIR_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.PINE_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.MAPLE_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.REDWOOD_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.MAHOGANY_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.JACARANDA_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.PALM_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.WILLOW_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.DEAD_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.MAGIC_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.UMBRAN_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.HELLBARK_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.EMPYREAL_WOODEN_CAULDRON.get());
                                }
                                if (hasDeepAether) {
                                    output.accept(ModItems.ROSEROOT_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.YAGROOT_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.CRUDEROOT_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.CONBERRY_WOODEN_CAULDRON.get());
                                    output.accept(ModItems.SUNROOT_WOODEN_CAULDRON.get());
                                }
                                if (hasAether) {
                                    output.accept(ModItems.SKYROOT_WOODEN_CAULDRON.get());
                                }

                                // ── Barrels ──────────────────────────────────────────────
                                output.accept(ModItems.WOODEN_BARREL.get());
                                output.accept(ModItems.OAK_WOODEN_BARREL.get());
                                output.accept(ModItems.SPRUCE_WOODEN_BARREL.get());
                                output.accept(ModItems.BIRCH_WOODEN_BARREL.get());
                                output.accept(ModItems.JUNGLE_WOODEN_BARREL.get());
                                output.accept(ModItems.ACACIA_WOODEN_BARREL.get());
                                output.accept(ModItems.DARK_OAK_WOODEN_BARREL.get());
                                output.accept(ModItems.MANGROVE_WOODEN_BARREL.get());
                                output.accept(ModItems.CHERRY_WOODEN_BARREL.get());
                                output.accept(ModItems.BAMBOO_WOODEN_BARREL.get());
                                output.accept(ModItems.CRIMSON_WOODEN_BARREL.get());
                                output.accept(ModItems.WARPED_WOODEN_BARREL.get());
                                if (hasTF) {
                                    output.accept(ModItems.TWILIGHT_OAK_WOODEN_BARREL.get());
                                    output.accept(ModItems.CANOPY_WOODEN_BARREL.get());
                                    output.accept(ModItems.TWILIGHT_MANGROVE_WOODEN_BARREL.get());
                                    output.accept(ModItems.DARK_WOODEN_BARREL.get());
                                    output.accept(ModItems.TIME_WOODEN_BARREL.get());
                                    output.accept(ModItems.TRANSFORMATION_WOODEN_BARREL.get());
                                    output.accept(ModItems.MINING_WOODEN_BARREL.get());
                                    output.accept(ModItems.SORTING_WOODEN_BARREL.get());
                                    output.accept(ModItems.TOWERWOOD_WOODEN_BARREL.get());
                                }
                                if (hasBOP) {
                                    output.accept(ModItems.FIR_WOODEN_BARREL.get());
                                    output.accept(ModItems.PINE_WOODEN_BARREL.get());
                                    output.accept(ModItems.MAPLE_WOODEN_BARREL.get());
                                    output.accept(ModItems.REDWOOD_WOODEN_BARREL.get());
                                    output.accept(ModItems.MAHOGANY_WOODEN_BARREL.get());
                                    output.accept(ModItems.JACARANDA_WOODEN_BARREL.get());
                                    output.accept(ModItems.PALM_WOODEN_BARREL.get());
                                    output.accept(ModItems.WILLOW_WOODEN_BARREL.get());
                                    output.accept(ModItems.DEAD_WOODEN_BARREL.get());
                                    output.accept(ModItems.MAGIC_WOODEN_BARREL.get());
                                    output.accept(ModItems.UMBRAN_WOODEN_BARREL.get());
                                    output.accept(ModItems.HELLBARK_WOODEN_BARREL.get());
                                    output.accept(ModItems.EMPYREAL_WOODEN_BARREL.get());
                                }
                                if (hasDeepAether) {
                                    output.accept(ModItems.ROSEROOT_WOODEN_BARREL.get());
                                    output.accept(ModItems.YAGROOT_WOODEN_BARREL.get());
                                    output.accept(ModItems.CRUDEROOT_WOODEN_BARREL.get());
                                    output.accept(ModItems.CONBERRY_WOODEN_BARREL.get());
                                    output.accept(ModItems.SUNROOT_WOODEN_BARREL.get());
                                }
                                if (hasAether) {
                                    output.accept(ModItems.SKYROOT_WOODEN_BARREL.get());
                                }

                                // ── Hoppers ──────────────────────────────────────────────
                                output.accept(ModItems.OAK_WOODEN_HOPPER.get());
                                output.accept(ModItems.SPRUCE_WOODEN_HOPPER.get());
                                output.accept(ModItems.BIRCH_WOODEN_HOPPER.get());
                                output.accept(ModItems.JUNGLE_WOODEN_HOPPER.get());
                                output.accept(ModItems.ACACIA_WOODEN_HOPPER.get());
                                output.accept(ModItems.DARK_OAK_WOODEN_HOPPER.get());
                                output.accept(ModItems.MANGROVE_WOODEN_HOPPER.get());
                                output.accept(ModItems.CHERRY_WOODEN_HOPPER.get());
                                output.accept(ModItems.BAMBOO_WOODEN_HOPPER.get());
                                output.accept(ModItems.CRIMSON_WOODEN_HOPPER.get());
                                output.accept(ModItems.WARPED_WOODEN_HOPPER.get());
                                if (hasTF) {
                                    output.accept(ModItems.TWILIGHT_OAK_WOODEN_HOPPER.get());
                                    output.accept(ModItems.CANOPY_WOODEN_HOPPER.get());
                                    output.accept(ModItems.TWILIGHT_MANGROVE_WOODEN_HOPPER.get());
                                    output.accept(ModItems.DARK_WOODEN_HOPPER.get());
                                    output.accept(ModItems.TIME_WOODEN_HOPPER.get());
                                    output.accept(ModItems.MINING_WOODEN_HOPPER.get());
                                    output.accept(ModItems.SORTING_WOODEN_HOPPER.get());
                                    output.accept(ModItems.TOWERWOOD_WOODEN_HOPPER.get());
                                }
                                if (hasBOP) {
                                    output.accept(ModItems.FIR_WOODEN_HOPPER.get());
                                    output.accept(ModItems.PINE_WOODEN_HOPPER.get());
                                    output.accept(ModItems.MAPLE_WOODEN_HOPPER.get());
                                    output.accept(ModItems.REDWOOD_WOODEN_HOPPER.get());
                                    output.accept(ModItems.MAHOGANY_WOODEN_HOPPER.get());
                                    output.accept(ModItems.JACARANDA_WOODEN_HOPPER.get());
                                    output.accept(ModItems.PALM_WOODEN_HOPPER.get());
                                    output.accept(ModItems.WILLOW_WOODEN_HOPPER.get());
                                    output.accept(ModItems.DEAD_WOODEN_HOPPER.get());
                                    output.accept(ModItems.MAGIC_WOODEN_HOPPER.get());
                                    output.accept(ModItems.UMBRAN_WOODEN_HOPPER.get());
                                    output.accept(ModItems.HELLBARK_WOODEN_HOPPER.get());
                                    output.accept(ModItems.EMPYREAL_WOODEN_HOPPER.get());
                                }
                                if (hasDeepAether) {
                                    output.accept(ModItems.ROSEROOT_WOODEN_HOPPER.get());
                                    output.accept(ModItems.YAGROOT_WOODEN_HOPPER.get());
                                    output.accept(ModItems.CRUDEROOT_WOODEN_HOPPER.get());
                                    output.accept(ModItems.CONBERRY_WOODEN_HOPPER.get());
                                    output.accept(ModItems.SUNROOT_WOODEN_HOPPER.get());
                                }
                                if (hasAether) {
                                    output.accept(ModItems.SKYROOT_WOODEN_HOPPER.get());
                                }

                                // ── Crafting Table Slabs ──────────────────────────────────
                                output.accept(ModItems.WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.OAK_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.SPRUCE_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.BIRCH_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.JUNGLE_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.ACACIA_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.DARK_OAK_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.MANGROVE_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.CHERRY_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.BAMBOO_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.CRIMSON_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.WARPED_WOODEN_CRAFTING_TABLE_SLAB.get());
                                if (hasTF) {
                                    output.accept(ModItems.TWILIGHT_OAK_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.CANOPY_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.TWILIGHT_MANGROVE_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.DARK_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.TIME_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.TRANSFORMATION_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.MINING_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.SORTING_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.TOWERWOOD_WOODEN_CRAFTING_TABLE_SLAB.get());
                                }
                                if (hasBOP) {
                                    output.accept(ModItems.FIR_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.PINE_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.MAPLE_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.REDWOOD_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.MAHOGANY_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.JACARANDA_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.PALM_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.WILLOW_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.DEAD_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.MAGIC_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.UMBRAN_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.HELLBARK_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.EMPYREAL_WOODEN_CRAFTING_TABLE_SLAB.get());
                                }
                                if (hasDeepAether) {
                                    output.accept(ModItems.ROSEROOT_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.YAGROOT_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.CRUDEROOT_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.CONBERRY_WOODEN_CRAFTING_TABLE_SLAB.get());
                                    output.accept(ModItems.SUNROOT_WOODEN_CRAFTING_TABLE_SLAB.get());
                                }
                                if (hasAether) {
                                    output.accept(ModItems.SKYROOT_WOODEN_CRAFTING_TABLE_SLAB.get());
                                }

                                // ── Tools ────────────────────────────────────────────────
                                output.accept(ModItems.WOODEN_SHEARS.get());
                                output.accept(ModItems.WOODEN_WRENCH.get());
                                output.accept(ModItems.WOODEN_HAMMER.get());

                                // ── Buckets (empty, water, lava for each wood type) ──────
                                java.util.function.Consumer<net.minecraft.world.item.Item> addBucket = (item) -> {
                                    output.accept(item);
                                    ItemStack w = new ItemStack(item);
                                    WoodenBucketItem.setFluid(w, new FluidStack(Fluids.WATER, 1000));
                                    output.accept(w);
                                    ItemStack l = new ItemStack(item);
                                    WoodenBucketItem.setFluid(l, new FluidStack(Fluids.LAVA, 1000));
                                    output.accept(l);
                                };
                                addBucket.accept(ModItems.WOODEN_BUCKET.get());
                                addBucket.accept(ModItems.OAK_WOODEN_BUCKET.get());
                                addBucket.accept(ModItems.SPRUCE_WOODEN_BUCKET.get());
                                addBucket.accept(ModItems.BIRCH_WOODEN_BUCKET.get());
                                addBucket.accept(ModItems.JUNGLE_WOODEN_BUCKET.get());
                                addBucket.accept(ModItems.ACACIA_WOODEN_BUCKET.get());
                                addBucket.accept(ModItems.DARK_OAK_WOODEN_BUCKET.get());
                                addBucket.accept(ModItems.MANGROVE_WOODEN_BUCKET.get());
                                addBucket.accept(ModItems.CHERRY_WOODEN_BUCKET.get());
                                addBucket.accept(ModItems.BAMBOO_WOODEN_BUCKET.get());
                                addBucket.accept(ModItems.CRIMSON_WOODEN_BUCKET.get());
                                addBucket.accept(ModItems.WARPED_WOODEN_BUCKET.get());
                                if (hasTF) {
                                    addBucket.accept(ModItems.TWILIGHT_OAK_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.CANOPY_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.TWILIGHT_MANGROVE_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.DARK_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.TIME_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.MINING_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.SORTING_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.TOWERWOOD_WOODEN_BUCKET.get());
                                }
                                if (hasBOP) {
                                    addBucket.accept(ModItems.FIR_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.PINE_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.MAPLE_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.REDWOOD_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.MAHOGANY_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.JACARANDA_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.PALM_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.WILLOW_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.DEAD_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.MAGIC_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.UMBRAN_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.HELLBARK_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.EMPYREAL_WOODEN_BUCKET.get());
                                }
                                if (hasDeepAether) {
                                    addBucket.accept(ModItems.ROSEROOT_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.YAGROOT_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.CRUDEROOT_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.CONBERRY_WOODEN_BUCKET.get());
                                    addBucket.accept(ModItems.SUNROOT_WOODEN_BUCKET.get());
                                }
                                if (hasAether) {
                                    addBucket.accept(ModItems.SKYROOT_WOODEN_BUCKET.get());
                                }

                                // ── Rods ─────────────────────────────────────────────────
                                output.accept(ModItems.ACACIA_ROD.get());
                                output.accept(ModItems.BIRCH_ROD.get());
                                output.accept(ModItems.DARK_OAK_ROD.get());
                                output.accept(ModItems.JUNGLE_ROD.get());

                                // ── Misc Items ───────────────────────────────────────────
                                output.accept(ModItems.SAWDUST.get());
                            })
                            .build()
            );

    private ModCreativeTabs() {}

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

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
                                output.accept(ModItems.AFRICAN_BLACKWOOD_WOODEN_PLATE.get());
                                output.accept(ModItems.BANYAN_WOODEN_PLATE.get());
                                output.accept(ModItems.BLACK_WALNUT_WOODEN_PLATE.get());
                                output.accept(ModItems.BLOODWOOD_WOODEN_PLATE.get());
                                output.accept(ModItems.BRISTLECONE_PINE_WOODEN_PLATE.get());
                                output.accept(ModItems.CORK_OAK_WOODEN_PLATE.get());
                                output.accept(ModItems.DRAGON_BLOOD_WOODEN_PLATE.get());
                                output.accept(ModItems.KAPOK_WOODEN_PLATE.get());
                                output.accept(ModItems.LARCH_WOODEN_PLATE.get());
                                output.accept(ModItems.SANDALWOOD_WOODEN_PLATE.get());
                                output.accept(ModItems.SYCAMORE_WOODEN_PLATE.get());
                                output.accept(ModItems.TEAK_WOODEN_PLATE.get());
                                output.accept(ModItems.WENGE_WOODEN_PLATE.get());
                                output.accept(ModItems.ZEBRAWOOD_WOODEN_PLATE.get());

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
                                output.accept(ModItems.AFRICAN_BLACKWOOD_WOODEN_CAULDRON.get());
                                output.accept(ModItems.BANYAN_WOODEN_CAULDRON.get());
                                output.accept(ModItems.BLACK_WALNUT_WOODEN_CAULDRON.get());
                                output.accept(ModItems.BLOODWOOD_WOODEN_CAULDRON.get());
                                output.accept(ModItems.BRISTLECONE_PINE_WOODEN_CAULDRON.get());
                                output.accept(ModItems.CORK_OAK_WOODEN_CAULDRON.get());
                                output.accept(ModItems.DRAGON_BLOOD_WOODEN_CAULDRON.get());
                                output.accept(ModItems.KAPOK_WOODEN_CAULDRON.get());
                                output.accept(ModItems.LARCH_WOODEN_CAULDRON.get());
                                output.accept(ModItems.SANDALWOOD_WOODEN_CAULDRON.get());
                                output.accept(ModItems.SYCAMORE_WOODEN_CAULDRON.get());
                                output.accept(ModItems.TEAK_WOODEN_CAULDRON.get());
                                output.accept(ModItems.WENGE_WOODEN_CAULDRON.get());
                                output.accept(ModItems.ZEBRAWOOD_WOODEN_CAULDRON.get());

                                // ── New Wood Blocks ──────────────────────────────────────
                                // African Blackwood
                                output.accept(ModItems.AFRICAN_BLACKWOOD_LOG.get());
                                output.accept(ModItems.STRIPPED_AFRICAN_BLACKWOOD_LOG.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_WOOD.get());
                                output.accept(ModItems.STRIPPED_AFRICAN_BLACKWOOD_WOOD.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_PLANKS.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_LEAVES.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_SAPLING.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_SLAB.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_STAIRS.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_FENCE.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_FENCE_GATE.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_PRESSURE_PLATE.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_BUTTON.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_DOOR.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_TRAPDOOR.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_SIGN.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_HANGING_SIGN.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_BOAT.get());
                                output.accept(ModItems.AFRICAN_BLACKWOOD_CHEST_BOAT.get());
                                // Banyan
                                output.accept(ModItems.BANYAN_LOG.get());
                                output.accept(ModItems.STRIPPED_BANYAN_LOG.get());
                                output.accept(ModItems.BANYAN_WOOD.get());
                                output.accept(ModItems.STRIPPED_BANYAN_WOOD.get());
                                output.accept(ModItems.BANYAN_PLANKS.get());
                                output.accept(ModItems.BANYAN_LEAVES.get());
                                output.accept(ModItems.BANYAN_SAPLING.get());
                                output.accept(ModItems.BANYAN_SLAB.get());
                                output.accept(ModItems.BANYAN_STAIRS.get());
                                output.accept(ModItems.BANYAN_FENCE.get());
                                output.accept(ModItems.BANYAN_FENCE_GATE.get());
                                output.accept(ModItems.BANYAN_PRESSURE_PLATE.get());
                                output.accept(ModItems.BANYAN_BUTTON.get());
                                output.accept(ModItems.BANYAN_DOOR.get());
                                output.accept(ModItems.BANYAN_TRAPDOOR.get());
                                output.accept(ModItems.BANYAN_SIGN.get());
                                output.accept(ModItems.BANYAN_HANGING_SIGN.get());
                                output.accept(ModItems.BANYAN_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.BANYAN_BOAT.get());
                                output.accept(ModItems.BANYAN_CHEST_BOAT.get());
                                // Black Walnut
                                output.accept(ModItems.BLACK_WALNUT_LOG.get());
                                output.accept(ModItems.STRIPPED_BLACK_WALNUT_LOG.get());
                                output.accept(ModItems.BLACK_WALNUT_WOOD.get());
                                output.accept(ModItems.STRIPPED_BLACK_WALNUT_WOOD.get());
                                output.accept(ModItems.BLACK_WALNUT_PLANKS.get());
                                output.accept(ModItems.BLACK_WALNUT_LEAVES.get());
                                output.accept(ModItems.BLACK_WALNUT_SAPLING.get());
                                output.accept(ModItems.BLACK_WALNUT_SLAB.get());
                                output.accept(ModItems.BLACK_WALNUT_STAIRS.get());
                                output.accept(ModItems.BLACK_WALNUT_FENCE.get());
                                output.accept(ModItems.BLACK_WALNUT_FENCE_GATE.get());
                                output.accept(ModItems.BLACK_WALNUT_PRESSURE_PLATE.get());
                                output.accept(ModItems.BLACK_WALNUT_BUTTON.get());
                                output.accept(ModItems.BLACK_WALNUT_DOOR.get());
                                output.accept(ModItems.BLACK_WALNUT_TRAPDOOR.get());
                                output.accept(ModItems.BLACK_WALNUT_SIGN.get());
                                output.accept(ModItems.BLACK_WALNUT_HANGING_SIGN.get());
                                output.accept(ModItems.BLACK_WALNUT_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.BLACK_WALNUT_BOAT.get());
                                output.accept(ModItems.BLACK_WALNUT_CHEST_BOAT.get());
                                // Bloodwood
                                output.accept(ModItems.BLOODWOOD_LOG.get());
                                output.accept(ModItems.STRIPPED_BLOODWOOD_LOG.get());
                                output.accept(ModItems.BLOODWOOD_WOOD.get());
                                output.accept(ModItems.STRIPPED_BLOODWOOD_WOOD.get());
                                output.accept(ModItems.BLOODWOOD_PLANKS.get());
                                output.accept(ModItems.BLOODWOOD_LEAVES.get());
                                output.accept(ModItems.BLOODWOOD_SAPLING.get());
                                output.accept(ModItems.BLOODWOOD_SLAB.get());
                                output.accept(ModItems.BLOODWOOD_STAIRS.get());
                                output.accept(ModItems.BLOODWOOD_FENCE.get());
                                output.accept(ModItems.BLOODWOOD_FENCE_GATE.get());
                                output.accept(ModItems.BLOODWOOD_PRESSURE_PLATE.get());
                                output.accept(ModItems.BLOODWOOD_BUTTON.get());
                                output.accept(ModItems.BLOODWOOD_DOOR.get());
                                output.accept(ModItems.BLOODWOOD_TRAPDOOR.get());
                                output.accept(ModItems.BLOODWOOD_SIGN.get());
                                output.accept(ModItems.BLOODWOOD_HANGING_SIGN.get());
                                output.accept(ModItems.BLOODWOOD_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.BLOODWOOD_BOAT.get());
                                output.accept(ModItems.BLOODWOOD_CHEST_BOAT.get());
                                // Bristlecone Pine
                                output.accept(ModItems.BRISTLECONE_PINE_LOG.get());
                                output.accept(ModItems.STRIPPED_BRISTLECONE_PINE_LOG.get());
                                output.accept(ModItems.BRISTLECONE_PINE_WOOD.get());
                                output.accept(ModItems.STRIPPED_BRISTLECONE_PINE_WOOD.get());
                                output.accept(ModItems.BRISTLECONE_PINE_PLANKS.get());
                                output.accept(ModItems.BRISTLECONE_PINE_LEAVES.get());
                                output.accept(ModItems.BRISTLECONE_PINE_SAPLING.get());
                                output.accept(ModItems.BRISTLECONE_PINE_SLAB.get());
                                output.accept(ModItems.BRISTLECONE_PINE_STAIRS.get());
                                output.accept(ModItems.BRISTLECONE_PINE_FENCE.get());
                                output.accept(ModItems.BRISTLECONE_PINE_FENCE_GATE.get());
                                output.accept(ModItems.BRISTLECONE_PINE_PRESSURE_PLATE.get());
                                output.accept(ModItems.BRISTLECONE_PINE_BUTTON.get());
                                output.accept(ModItems.BRISTLECONE_PINE_DOOR.get());
                                output.accept(ModItems.BRISTLECONE_PINE_TRAPDOOR.get());
                                output.accept(ModItems.BRISTLECONE_PINE_SIGN.get());
                                output.accept(ModItems.BRISTLECONE_PINE_HANGING_SIGN.get());
                                output.accept(ModItems.BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.BRISTLECONE_PINE_BOAT.get());
                                output.accept(ModItems.BRISTLECONE_PINE_CHEST_BOAT.get());
                                // Cork Oak
                                output.accept(ModItems.CORK_OAK_LOG.get());
                                output.accept(ModItems.STRIPPED_CORK_OAK_LOG.get());
                                output.accept(ModItems.CORK_OAK_WOOD.get());
                                output.accept(ModItems.STRIPPED_CORK_OAK_WOOD.get());
                                output.accept(ModItems.CORK_OAK_PLANKS.get());
                                output.accept(ModItems.CORK_OAK_LEAVES.get());
                                output.accept(ModItems.CORK_OAK_SAPLING.get());
                                output.accept(ModItems.CORK_OAK_SLAB.get());
                                output.accept(ModItems.CORK_OAK_STAIRS.get());
                                output.accept(ModItems.CORK_OAK_FENCE.get());
                                output.accept(ModItems.CORK_OAK_FENCE_GATE.get());
                                output.accept(ModItems.CORK_OAK_PRESSURE_PLATE.get());
                                output.accept(ModItems.CORK_OAK_BUTTON.get());
                                output.accept(ModItems.CORK_OAK_DOOR.get());
                                output.accept(ModItems.CORK_OAK_TRAPDOOR.get());
                                output.accept(ModItems.CORK_OAK_SIGN.get());
                                output.accept(ModItems.CORK_OAK_HANGING_SIGN.get());
                                output.accept(ModItems.CORK_OAK_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.CORK_OAK_BOAT.get());
                                output.accept(ModItems.CORK_OAK_CHEST_BOAT.get());
                                // Dragon Blood
                                output.accept(ModItems.DRAGON_BLOOD_LOG.get());
                                output.accept(ModItems.STRIPPED_DRAGON_BLOOD_LOG.get());
                                output.accept(ModItems.DRAGON_BLOOD_WOOD.get());
                                output.accept(ModItems.STRIPPED_DRAGON_BLOOD_WOOD.get());
                                output.accept(ModItems.DRAGON_BLOOD_PLANKS.get());
                                output.accept(ModItems.DRAGON_BLOOD_LEAVES.get());
                                output.accept(ModItems.DRAGON_BLOOD_SAPLING.get());
                                output.accept(ModItems.DRAGON_BLOOD_SLAB.get());
                                output.accept(ModItems.DRAGON_BLOOD_STAIRS.get());
                                output.accept(ModItems.DRAGON_BLOOD_FENCE.get());
                                output.accept(ModItems.DRAGON_BLOOD_FENCE_GATE.get());
                                output.accept(ModItems.DRAGON_BLOOD_PRESSURE_PLATE.get());
                                output.accept(ModItems.DRAGON_BLOOD_BUTTON.get());
                                output.accept(ModItems.DRAGON_BLOOD_DOOR.get());
                                output.accept(ModItems.DRAGON_BLOOD_TRAPDOOR.get());
                                output.accept(ModItems.DRAGON_BLOOD_SIGN.get());
                                output.accept(ModItems.DRAGON_BLOOD_HANGING_SIGN.get());
                                output.accept(ModItems.DRAGON_BLOOD_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.DRAGON_BLOOD_BOAT.get());
                                output.accept(ModItems.DRAGON_BLOOD_CHEST_BOAT.get());
                                // Kapok
                                output.accept(ModItems.KAPOK_LOG.get());
                                output.accept(ModItems.STRIPPED_KAPOK_LOG.get());
                                output.accept(ModItems.KAPOK_WOOD.get());
                                output.accept(ModItems.STRIPPED_KAPOK_WOOD.get());
                                output.accept(ModItems.KAPOK_PLANKS.get());
                                output.accept(ModItems.KAPOK_LEAVES.get());
                                output.accept(ModItems.KAPOK_SAPLING.get());
                                output.accept(ModItems.KAPOK_SLAB.get());
                                output.accept(ModItems.KAPOK_STAIRS.get());
                                output.accept(ModItems.KAPOK_FENCE.get());
                                output.accept(ModItems.KAPOK_FENCE_GATE.get());
                                output.accept(ModItems.KAPOK_PRESSURE_PLATE.get());
                                output.accept(ModItems.KAPOK_BUTTON.get());
                                output.accept(ModItems.KAPOK_DOOR.get());
                                output.accept(ModItems.KAPOK_TRAPDOOR.get());
                                output.accept(ModItems.KAPOK_SIGN.get());
                                output.accept(ModItems.KAPOK_HANGING_SIGN.get());
                                output.accept(ModItems.KAPOK_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.KAPOK_BOAT.get());
                                output.accept(ModItems.KAPOK_CHEST_BOAT.get());
                                // Larch
                                output.accept(ModItems.LARCH_LOG.get());
                                output.accept(ModItems.STRIPPED_LARCH_LOG.get());
                                output.accept(ModItems.LARCH_WOOD.get());
                                output.accept(ModItems.STRIPPED_LARCH_WOOD.get());
                                output.accept(ModItems.LARCH_PLANKS.get());
                                output.accept(ModItems.LARCH_LEAVES.get());
                                output.accept(ModItems.LARCH_SAPLING.get());
                                output.accept(ModItems.LARCH_SLAB.get());
                                output.accept(ModItems.LARCH_STAIRS.get());
                                output.accept(ModItems.LARCH_FENCE.get());
                                output.accept(ModItems.LARCH_FENCE_GATE.get());
                                output.accept(ModItems.LARCH_PRESSURE_PLATE.get());
                                output.accept(ModItems.LARCH_BUTTON.get());
                                output.accept(ModItems.LARCH_DOOR.get());
                                output.accept(ModItems.LARCH_TRAPDOOR.get());
                                output.accept(ModItems.LARCH_SIGN.get());
                                output.accept(ModItems.LARCH_HANGING_SIGN.get());
                                output.accept(ModItems.LARCH_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.LARCH_BOAT.get());
                                output.accept(ModItems.LARCH_CHEST_BOAT.get());
                                // Sandalwood
                                output.accept(ModItems.SANDALWOOD_LOG.get());
                                output.accept(ModItems.STRIPPED_SANDALWOOD_LOG.get());
                                output.accept(ModItems.SANDALWOOD_WOOD.get());
                                output.accept(ModItems.STRIPPED_SANDALWOOD_WOOD.get());
                                output.accept(ModItems.SANDALWOOD_PLANKS.get());
                                output.accept(ModItems.SANDALWOOD_LEAVES.get());
                                output.accept(ModItems.SANDALWOOD_SAPLING.get());
                                output.accept(ModItems.SANDALWOOD_SLAB.get());
                                output.accept(ModItems.SANDALWOOD_STAIRS.get());
                                output.accept(ModItems.SANDALWOOD_FENCE.get());
                                output.accept(ModItems.SANDALWOOD_FENCE_GATE.get());
                                output.accept(ModItems.SANDALWOOD_PRESSURE_PLATE.get());
                                output.accept(ModItems.SANDALWOOD_BUTTON.get());
                                output.accept(ModItems.SANDALWOOD_DOOR.get());
                                output.accept(ModItems.SANDALWOOD_TRAPDOOR.get());
                                output.accept(ModItems.SANDALWOOD_SIGN.get());
                                output.accept(ModItems.SANDALWOOD_HANGING_SIGN.get());
                                output.accept(ModItems.SANDALWOOD_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.SANDALWOOD_BOAT.get());
                                output.accept(ModItems.SANDALWOOD_CHEST_BOAT.get());
                                // Sycamore
                                output.accept(ModItems.SYCAMORE_LOG.get());
                                output.accept(ModItems.STRIPPED_SYCAMORE_LOG.get());
                                output.accept(ModItems.SYCAMORE_WOOD.get());
                                output.accept(ModItems.STRIPPED_SYCAMORE_WOOD.get());
                                output.accept(ModItems.SYCAMORE_PLANKS.get());
                                output.accept(ModItems.SYCAMORE_LEAVES.get());
                                output.accept(ModItems.SYCAMORE_SAPLING.get());
                                output.accept(ModItems.SYCAMORE_SLAB.get());
                                output.accept(ModItems.SYCAMORE_STAIRS.get());
                                output.accept(ModItems.SYCAMORE_FENCE.get());
                                output.accept(ModItems.SYCAMORE_FENCE_GATE.get());
                                output.accept(ModItems.SYCAMORE_PRESSURE_PLATE.get());
                                output.accept(ModItems.SYCAMORE_BUTTON.get());
                                output.accept(ModItems.SYCAMORE_DOOR.get());
                                output.accept(ModItems.SYCAMORE_TRAPDOOR.get());
                                output.accept(ModItems.SYCAMORE_SIGN.get());
                                output.accept(ModItems.SYCAMORE_HANGING_SIGN.get());
                                output.accept(ModItems.SYCAMORE_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.SYCAMORE_BOAT.get());
                                output.accept(ModItems.SYCAMORE_CHEST_BOAT.get());
                                // Teak
                                output.accept(ModItems.TEAK_LOG.get());
                                output.accept(ModItems.STRIPPED_TEAK_LOG.get());
                                output.accept(ModItems.TEAK_WOOD.get());
                                output.accept(ModItems.STRIPPED_TEAK_WOOD.get());
                                output.accept(ModItems.TEAK_PLANKS.get());
                                output.accept(ModItems.TEAK_LEAVES.get());
                                output.accept(ModItems.TEAK_SAPLING.get());
                                output.accept(ModItems.TEAK_SLAB.get());
                                output.accept(ModItems.TEAK_STAIRS.get());
                                output.accept(ModItems.TEAK_FENCE.get());
                                output.accept(ModItems.TEAK_FENCE_GATE.get());
                                output.accept(ModItems.TEAK_PRESSURE_PLATE.get());
                                output.accept(ModItems.TEAK_BUTTON.get());
                                output.accept(ModItems.TEAK_DOOR.get());
                                output.accept(ModItems.TEAK_TRAPDOOR.get());
                                output.accept(ModItems.TEAK_SIGN.get());
                                output.accept(ModItems.TEAK_HANGING_SIGN.get());
                                output.accept(ModItems.TEAK_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.TEAK_BOAT.get());
                                output.accept(ModItems.TEAK_CHEST_BOAT.get());
                                // Wenge
                                output.accept(ModItems.WENGE_LOG.get());
                                output.accept(ModItems.STRIPPED_WENGE_LOG.get());
                                output.accept(ModItems.WENGE_WOOD.get());
                                output.accept(ModItems.STRIPPED_WENGE_WOOD.get());
                                output.accept(ModItems.WENGE_PLANKS.get());
                                output.accept(ModItems.WENGE_LEAVES.get());
                                output.accept(ModItems.WENGE_SAPLING.get());
                                output.accept(ModItems.WENGE_SLAB.get());
                                output.accept(ModItems.WENGE_STAIRS.get());
                                output.accept(ModItems.WENGE_FENCE.get());
                                output.accept(ModItems.WENGE_FENCE_GATE.get());
                                output.accept(ModItems.WENGE_PRESSURE_PLATE.get());
                                output.accept(ModItems.WENGE_BUTTON.get());
                                output.accept(ModItems.WENGE_DOOR.get());
                                output.accept(ModItems.WENGE_TRAPDOOR.get());
                                output.accept(ModItems.WENGE_SIGN.get());
                                output.accept(ModItems.WENGE_HANGING_SIGN.get());
                                output.accept(ModItems.WENGE_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.WENGE_BOAT.get());
                                output.accept(ModItems.WENGE_CHEST_BOAT.get());
                                // Zebrawood
                                output.accept(ModItems.ZEBRAWOOD_LOG.get());
                                output.accept(ModItems.STRIPPED_ZEBRAWOOD_LOG.get());
                                output.accept(ModItems.ZEBRAWOOD_WOOD.get());
                                output.accept(ModItems.STRIPPED_ZEBRAWOOD_WOOD.get());
                                output.accept(ModItems.ZEBRAWOOD_PLANKS.get());
                                output.accept(ModItems.ZEBRAWOOD_LEAVES.get());
                                output.accept(ModItems.ZEBRAWOOD_SAPLING.get());
                                output.accept(ModItems.ZEBRAWOOD_SLAB.get());
                                output.accept(ModItems.ZEBRAWOOD_STAIRS.get());
                                output.accept(ModItems.ZEBRAWOOD_FENCE.get());
                                output.accept(ModItems.ZEBRAWOOD_FENCE_GATE.get());
                                output.accept(ModItems.ZEBRAWOOD_PRESSURE_PLATE.get());
                                output.accept(ModItems.ZEBRAWOOD_BUTTON.get());
                                output.accept(ModItems.ZEBRAWOOD_DOOR.get());
                                output.accept(ModItems.ZEBRAWOOD_TRAPDOOR.get());
                                output.accept(ModItems.ZEBRAWOOD_SIGN.get());
                                output.accept(ModItems.ZEBRAWOOD_HANGING_SIGN.get());
                                output.accept(ModItems.ZEBRAWOOD_WOODEN_CRAFTING_TABLE.get());
                                output.accept(ModItems.ZEBRAWOOD_BOAT.get());
                                output.accept(ModItems.ZEBRAWOOD_CHEST_BOAT.get());

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
                                output.accept(ModItems.OAK_ROD.get());
                                output.accept(ModItems.SPRUCE_ROD.get());
                                output.accept(ModItems.ACACIA_ROD.get());
                                output.accept(ModItems.BIRCH_ROD.get());
                                output.accept(ModItems.DARK_OAK_ROD.get());
                                output.accept(ModItems.JUNGLE_ROD.get());

                                // ── Misc Items ───────────────────────────────────────────
                                output.accept(ModItems.SAWDUST.get());
                            })
                            .build()
            );
    //? if neoforge {
    /*public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WOODEN_UTILITIES_STORAGE_TAB =
    *///?} else {
    public static final RegistryObject<CreativeModeTab> WOODEN_UTILITIES_STORAGE_TAB =
    //?}
            CREATIVE_MODE_TABS.register("wooden_utilities_storage", () ->
                    CreativeModeTab.builder()
                            .icon(() -> new ItemStack(ModItems.OAK_WOODEN_BARREL.get()))
                            .title(Component.translatable("itemGroup.woodenutilities.storage"))
                            .displayItems((params, output) -> {
                                boolean hasTF        = ModList.get().isLoaded("twilightforest");
                                boolean hasBOP       = ModList.get().isLoaded("biomesoplenty");
                                boolean hasDeepAether = ModList.get().isLoaded("deep_aether");
                                boolean hasAether     = ModList.get().isLoaded("aether");
                                boolean hasSS        = ModList.get().isLoaded("sophisticatedstorage");

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
                                output.accept(ModItems.AFRICAN_BLACKWOOD_WOODEN_BARREL.get());
                                output.accept(ModItems.BANYAN_WOODEN_BARREL.get());
                                output.accept(ModItems.BLACK_WALNUT_WOODEN_BARREL.get());
                                output.accept(ModItems.BLOODWOOD_WOODEN_BARREL.get());
                                output.accept(ModItems.BRISTLECONE_PINE_WOODEN_BARREL.get());
                                output.accept(ModItems.CORK_OAK_WOODEN_BARREL.get());
                                output.accept(ModItems.DRAGON_BLOOD_WOODEN_BARREL.get());
                                output.accept(ModItems.KAPOK_WOODEN_BARREL.get());
                                output.accept(ModItems.LARCH_WOODEN_BARREL.get());
                                output.accept(ModItems.SANDALWOOD_WOODEN_BARREL.get());
                                output.accept(ModItems.SYCAMORE_WOODEN_BARREL.get());
                                output.accept(ModItems.TEAK_WOODEN_BARREL.get());
                                output.accept(ModItems.WENGE_WOODEN_BARREL.get());
                                output.accept(ModItems.ZEBRAWOOD_WOODEN_BARREL.get());

            // ── Wooden Chests ────────────────────────────────────────────────────
            output.accept(ModItems.WOODEN_CHEST.get());
            output.accept(ModItems.OAK_WOODEN_CHEST.get());
            output.accept(ModItems.SPRUCE_WOODEN_CHEST.get());
            output.accept(ModItems.BIRCH_WOODEN_CHEST.get());
            output.accept(ModItems.JUNGLE_WOODEN_CHEST.get());
            output.accept(ModItems.ACACIA_WOODEN_CHEST.get());
            output.accept(ModItems.DARK_OAK_WOODEN_CHEST.get());
            output.accept(ModItems.MANGROVE_WOODEN_CHEST.get());
            output.accept(ModItems.CHERRY_WOODEN_CHEST.get());
            output.accept(ModItems.BAMBOO_WOODEN_CHEST.get());
            output.accept(ModItems.CRIMSON_WOODEN_CHEST.get());
            output.accept(ModItems.WARPED_WOODEN_CHEST.get());
            output.accept(ModItems.TWILIGHT_OAK_WOODEN_CHEST.get());
            output.accept(ModItems.CANOPY_WOODEN_CHEST.get());
            output.accept(ModItems.TWILIGHT_MANGROVE_WOODEN_CHEST.get());
            output.accept(ModItems.DARK_WOODEN_CHEST.get());
            output.accept(ModItems.TIME_WOODEN_CHEST.get());
            output.accept(ModItems.TRANSFORMATION_WOODEN_CHEST.get());
            output.accept(ModItems.MINING_WOODEN_CHEST.get());
            output.accept(ModItems.SORTING_WOODEN_CHEST.get());
            output.accept(ModItems.TOWERWOOD_WOODEN_CHEST.get());
            output.accept(ModItems.FIR_WOODEN_CHEST.get());
            output.accept(ModItems.PINE_WOODEN_CHEST.get());
            output.accept(ModItems.MAPLE_WOODEN_CHEST.get());
            output.accept(ModItems.REDWOOD_WOODEN_CHEST.get());
            output.accept(ModItems.MAHOGANY_WOODEN_CHEST.get());
            output.accept(ModItems.JACARANDA_WOODEN_CHEST.get());
            output.accept(ModItems.PALM_WOODEN_CHEST.get());
            output.accept(ModItems.WILLOW_WOODEN_CHEST.get());
            output.accept(ModItems.DEAD_WOODEN_CHEST.get());
            output.accept(ModItems.MAGIC_WOODEN_CHEST.get());
            output.accept(ModItems.UMBRAN_WOODEN_CHEST.get());
            output.accept(ModItems.HELLBARK_WOODEN_CHEST.get());
            output.accept(ModItems.EMPYREAL_WOODEN_CHEST.get());
            output.accept(ModItems.ROSEROOT_WOODEN_CHEST.get());
            output.accept(ModItems.YAGROOT_WOODEN_CHEST.get());
            output.accept(ModItems.CRUDEROOT_WOODEN_CHEST.get());
            output.accept(ModItems.CONBERRY_WOODEN_CHEST.get());
            output.accept(ModItems.SUNROOT_WOODEN_CHEST.get());
            output.accept(ModItems.SKYROOT_WOODEN_CHEST.get());
            output.accept(ModItems.ASPEN_WOODEN_CHEST.get());
            output.accept(ModItems.BAOBAB_WOODEN_CHEST.get());
            output.accept(ModItems.BLUE_ENCHANTED_WOODEN_CHEST.get());
            output.accept(ModItems.CIKA_WOODEN_CHEST.get());
            output.accept(ModItems.CYPRESS_WOODEN_CHEST.get());
            output.accept(ModItems.EBONY_WOODEN_CHEST.get());
            output.accept(ModItems.BWG_FIR_WOODEN_CHEST.get());
            output.accept(ModItems.FLORUS_WOODEN_CHEST.get());
            output.accept(ModItems.GREEN_ENCHANTED_WOODEN_CHEST.get());
            output.accept(ModItems.HOLLY_WOODEN_CHEST.get());
            output.accept(ModItems.IRONWOOD_WOODEN_CHEST.get());
            output.accept(ModItems.BWG_JACARANDA_WOODEN_CHEST.get());
            output.accept(ModItems.BWG_MAHOGANY_WOODEN_CHEST.get());
            output.accept(ModItems.BWG_MAPLE_WOODEN_CHEST.get());
            output.accept(ModItems.BWG_PALM_WOODEN_CHEST.get());
            output.accept(ModItems.BWG_PINE_WOODEN_CHEST.get());
            output.accept(ModItems.RAINBOW_EUCALYPTUS_WOODEN_CHEST.get());
            output.accept(ModItems.BWG_REDWOOD_WOODEN_CHEST.get());
            output.accept(ModItems.SAKURA_WOODEN_CHEST.get());
            output.accept(ModItems.SKYRIS_WOODEN_CHEST.get());
            //? if neoforge {
            /*output.accept(ModItems.SPIRIT_WOODEN_CHEST.get());
            *///?}
            output.accept(ModItems.WHITE_MANGROVE_WOODEN_CHEST.get());
            output.accept(ModItems.BWG_WILLOW_WOODEN_CHEST.get());
            output.accept(ModItems.WITCH_HAZEL_WOODEN_CHEST.get());
            output.accept(ModItems.ZELKOVA_WOODEN_CHEST.get());
            output.accept(ModItems.AFRICAN_BLACKWOOD_WOODEN_CHEST.get());
            output.accept(ModItems.BANYAN_WOODEN_CHEST.get());
            output.accept(ModItems.BLACK_WALNUT_WOODEN_CHEST.get());
            output.accept(ModItems.BLOODWOOD_WOODEN_CHEST.get());
            output.accept(ModItems.BRISTLECONE_PINE_WOODEN_CHEST.get());
            output.accept(ModItems.CORK_OAK_WOODEN_CHEST.get());
            output.accept(ModItems.DRAGON_BLOOD_WOODEN_CHEST.get());
            output.accept(ModItems.KAPOK_WOODEN_CHEST.get());
            output.accept(ModItems.LARCH_WOODEN_CHEST.get());
            output.accept(ModItems.SANDALWOOD_WOODEN_CHEST.get());
            output.accept(ModItems.SYCAMORE_WOODEN_CHEST.get());
            output.accept(ModItems.TEAK_WOODEN_CHEST.get());
            output.accept(ModItems.WENGE_WOODEN_CHEST.get());
            output.accept(ModItems.ZEBRAWOOD_WOODEN_CHEST.get());


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
                                output.accept(ModItems.AFRICAN_BLACKWOOD_WOODEN_HOPPER.get());
                                output.accept(ModItems.BANYAN_WOODEN_HOPPER.get());
                                output.accept(ModItems.BLACK_WALNUT_WOODEN_HOPPER.get());
                                output.accept(ModItems.BLOODWOOD_WOODEN_HOPPER.get());
                                output.accept(ModItems.BRISTLECONE_PINE_WOODEN_HOPPER.get());
                                output.accept(ModItems.CORK_OAK_WOODEN_HOPPER.get());
                                output.accept(ModItems.DRAGON_BLOOD_WOODEN_HOPPER.get());
                                output.accept(ModItems.KAPOK_WOODEN_HOPPER.get());
                                output.accept(ModItems.LARCH_WOODEN_HOPPER.get());
                                output.accept(ModItems.SANDALWOOD_WOODEN_HOPPER.get());
                                output.accept(ModItems.SYCAMORE_WOODEN_HOPPER.get());
                                output.accept(ModItems.TEAK_WOODEN_HOPPER.get());
                                output.accept(ModItems.WENGE_WOODEN_HOPPER.get());
                                output.accept(ModItems.ZEBRAWOOD_WOODEN_HOPPER.get());

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
                                output.accept(ModItems.AFRICAN_BLACKWOOD_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.BANYAN_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.BLACK_WALNUT_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.BLOODWOOD_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.BRISTLECONE_PINE_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.CORK_OAK_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.DRAGON_BLOOD_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.KAPOK_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.LARCH_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.SANDALWOOD_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.SYCAMORE_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.TEAK_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.WENGE_WOODEN_CRAFTING_TABLE_SLAB.get());
                                output.accept(ModItems.ZEBRAWOOD_WOODEN_CRAFTING_TABLE_SLAB.get());


                                // ── Sophisticated Storage Barrels ─────────────────────────────────────
                                if (hasSS) {
                                    addIfLoaded(output, "sophisticatedstorage", "barrel");
                                    addIfLoaded(output, "sophisticatedstorage", "copper_barrel");
                                    addIfLoaded(output, "sophisticatedstorage", "iron_barrel");
                                    addIfLoaded(output, "sophisticatedstorage", "gold_barrel");
                                    addIfLoaded(output, "sophisticatedstorage", "diamond_barrel");
                                    addIfLoaded(output, "sophisticatedstorage", "netherite_barrel");
                                }
                            })
                            .build()
            );



    private static void addIfLoaded(CreativeModeTab.Output output, String namespace, String path) {
        net.minecraft.world.item.Item item = net.minecraft.core.registries.BuiltInRegistries.ITEM.get(
            //? if (forge_1201 || forge_mid) {
            new net.minecraft.resources.ResourceLocation(namespace, path));
            //?} else {
            /*net.minecraft.resources.ResourceLocation.fromNamespaceAndPath(namespace, path));
            *///?}
        if (item != null && item != net.minecraft.world.item.Items.AIR) {
            output.accept(item);
        }
    }
    private ModCreativeTabs() {}

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

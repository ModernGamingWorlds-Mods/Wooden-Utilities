package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModBlocks;
import com.moderngamingworld.woodenutilities.registry.ModItems;
import com.moderngamingworld.woodenutilities.registry.ModMenuTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.ItemCombinerMenu;
import net.minecraft.world.inventory.ItemCombinerMenuSlotDefinition;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashMap;
import java.util.Map;

public class WoodenAnvilMenu extends ItemCombinerMenu {

    private static final Map<Item, Item> PLANK_TO_PLATE = new HashMap<>();

    static {
        // Vanilla
        PLANK_TO_PLATE.put(Items.OAK_PLANKS,      ModItems.OAK_WOODEN_PLATE.get());
        PLANK_TO_PLATE.put(Items.SPRUCE_PLANKS,    ModItems.SPRUCE_WOODEN_PLATE.get());
        PLANK_TO_PLATE.put(Items.BIRCH_PLANKS,     ModItems.BIRCH_WOODEN_PLATE.get());
        PLANK_TO_PLATE.put(Items.JUNGLE_PLANKS,    ModItems.JUNGLE_WOODEN_PLATE.get());
        PLANK_TO_PLATE.put(Items.ACACIA_PLANKS,    ModItems.ACACIA_WOODEN_PLATE.get());
        PLANK_TO_PLATE.put(Items.DARK_OAK_PLANKS,  ModItems.DARK_OAK_WOODEN_PLATE.get());
        PLANK_TO_PLATE.put(Items.MANGROVE_PLANKS,  ModItems.MANGROVE_WOODEN_PLATE.get());
        PLANK_TO_PLATE.put(Items.CHERRY_PLANKS,    ModItems.CHERRY_WOODEN_PLATE.get());
        PLANK_TO_PLATE.put(Items.BAMBOO_PLANKS,    ModItems.BAMBOO_WOODEN_PLATE.get());
        PLANK_TO_PLATE.put(Items.CRIMSON_PLANKS,   ModItems.CRIMSON_WOODEN_PLATE.get());
        PLANK_TO_PLATE.put(Items.WARPED_PLANKS,    ModItems.WARPED_WOODEN_PLATE.get());
        // Twilight Forest
        addModPlank("twilightforest:twilight_oak_planks",  ModItems.TWILIGHT_OAK_WOODEN_PLATE.get());
        addModPlank("twilightforest:canopy_planks",         ModItems.CANOPY_WOODEN_PLATE.get());
        addModPlank("twilightforest:mangrove_planks",       ModItems.TWILIGHT_MANGROVE_WOODEN_PLATE.get());
        addModPlank("twilightforest:dark_planks",           ModItems.DARK_WOODEN_PLATE.get());
        addModPlank("twilightforest:time_planks",           ModItems.TIME_WOODEN_PLATE.get());
        addModPlank("twilightforest:transformation_planks", ModItems.TRANSFORMATION_WOODEN_PLATE.get());
        addModPlank("twilightforest:mining_planks",         ModItems.MINING_WOODEN_PLATE.get());
        addModPlank("twilightforest:sorting_planks",        ModItems.SORTING_WOODEN_PLATE.get());
        addModPlank("twilightforest:towerwood_planks",      ModItems.TOWERWOOD_WOODEN_PLATE.get());
        // Biomes O' Plenty
        addModPlank("biomesoplenty:fir_planks",       ModItems.FIR_WOODEN_PLATE.get());
        addModPlank("biomesoplenty:pine_planks",      ModItems.PINE_WOODEN_PLATE.get());
        addModPlank("biomesoplenty:maple_planks",     ModItems.MAPLE_WOODEN_PLATE.get());
        addModPlank("biomesoplenty:redwood_planks",   ModItems.REDWOOD_WOODEN_PLATE.get());
        addModPlank("biomesoplenty:mahogany_planks",  ModItems.MAHOGANY_WOODEN_PLATE.get());
        addModPlank("biomesoplenty:jacaranda_planks", ModItems.JACARANDA_WOODEN_PLATE.get());
        addModPlank("biomesoplenty:palm_planks",      ModItems.PALM_WOODEN_PLATE.get());
        addModPlank("biomesoplenty:willow_planks",    ModItems.WILLOW_WOODEN_PLATE.get());
        addModPlank("biomesoplenty:dead_planks",      ModItems.DEAD_WOODEN_PLATE.get());
        addModPlank("biomesoplenty:magic_planks",     ModItems.MAGIC_WOODEN_PLATE.get());
        addModPlank("biomesoplenty:umbran_planks",    ModItems.UMBRAN_WOODEN_PLATE.get());
        addModPlank("biomesoplenty:hellbark_planks",  ModItems.HELLBARK_WOODEN_PLATE.get());
        addModPlank("biomesoplenty:empyreal_planks",  ModItems.EMPYREAL_WOODEN_PLATE.get());
        // Aether
        addModPlank("aether:skyroot_planks",         ModItems.SKYROOT_WOODEN_PLATE.get());
        // Deep Aether
        addModPlank("deep_aether:roseroot_planks",   ModItems.ROSEROOT_WOODEN_PLATE.get());
        addModPlank("deep_aether:yagroot_planks",    ModItems.YAGROOT_WOODEN_PLATE.get());
        addModPlank("deep_aether:cruderoot_planks",  ModItems.CRUDEROOT_WOODEN_PLATE.get());
        addModPlank("deep_aether:conberry_planks",   ModItems.CONBERRY_WOODEN_PLATE.get());
        addModPlank("deep_aether:sunroot_planks",    ModItems.SUNROOT_WOODEN_PLATE.get());
        // Biomes We've Gone
        addModPlank("biomeswevegone:aspen_planks",              ModItems.ASPEN_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:baobab_planks",             ModItems.BAOBAB_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:blue_enchanted_planks",     ModItems.BLUE_ENCHANTED_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:cika_planks",               ModItems.CIKA_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:cypress_planks",            ModItems.CYPRESS_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:ebony_planks",              ModItems.EBONY_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:fir_planks",                ModItems.BWG_FIR_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:florus_planks",             ModItems.FLORUS_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:green_enchanted_planks",    ModItems.GREEN_ENCHANTED_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:holly_planks",              ModItems.HOLLY_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:ironwood_planks",           ModItems.IRONWOOD_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:jacaranda_planks",          ModItems.BWG_JACARANDA_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:mahogany_planks",           ModItems.BWG_MAHOGANY_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:maple_planks",              ModItems.BWG_MAPLE_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:palm_planks",               ModItems.BWG_PALM_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:pine_planks",               ModItems.BWG_PINE_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:rainbow_eucalyptus_planks", ModItems.RAINBOW_EUCALYPTUS_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:redwood_planks",            ModItems.BWG_REDWOOD_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:sakura_planks",             ModItems.SAKURA_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:skyris_planks",             ModItems.SKYRIS_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:spirit_planks",             ModItems.SPIRIT_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:white_mangrove_planks",     ModItems.WHITE_MANGROVE_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:willow_planks",             ModItems.BWG_WILLOW_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:witch_hazel_planks",        ModItems.WITCH_HAZEL_WOODEN_PLATE.get());
        addModPlank("biomeswevegone:zelkova_planks",            ModItems.ZELKOVA_WOODEN_PLATE.get());
    }

    private static void addModPlank(String id, Item plate) {
        ResourceLocation rl = ResourceLocation.tryParse(id);
        if (rl == null) return;
        BuiltInRegistries.ITEM.getOptional(rl)
            .filter(i -> i != Items.AIR)
            .ifPresent(i -> PLANK_TO_PLATE.put(i, plate));
    }

    public WoodenAnvilMenu(int containerId, Inventory playerInventory) {
        this(containerId, playerInventory, ContainerLevelAccess.NULL);
    }

    public WoodenAnvilMenu(int containerId, Inventory playerInventory, ContainerLevelAccess access) {
        super(ModMenuTypes.WOODEN_ANVIL.get(), containerId, playerInventory, access);
    }

    @Override
    protected ItemCombinerMenuSlotDefinition createInputSlotDefinitions() {
        return ItemCombinerMenuSlotDefinition.create()
            .withSlot(0, 27, 47, stack -> !stack.isEmpty())
            .withSlot(1, 76, 47, stack -> !stack.isEmpty())
            .withResultSlot(2, 134, 47)
            .build();
    }

    @Override
    protected boolean isValidBlock(BlockState state) {
        return state.is(ModBlocks.WOODEN_ANVIL.get());
    }

    @Override
    protected boolean mayPickup(Player player, boolean hasItem) {
        return hasItem;
    }

    @Override
    protected void onTake(Player player, ItemStack stack) {
        // Damage the hammer by 1 use
        ItemStack hammer = this.inputSlots.getItem(0);
        if (!hammer.isEmpty()) {
            //? if neoforge {
            /*hammer.hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
            *///?} else {
            hammer.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(EquipmentSlot.MAINHAND));
            //?}
            if (hammer.isEmpty()) {
                this.inputSlots.setItem(0, ItemStack.EMPTY);
            }
        }
        // Consume one plank
        ItemStack plank = this.inputSlots.getItem(1);
        if (!plank.isEmpty()) {
            plank.shrink(1);
            if (plank.isEmpty()) {
                this.inputSlots.setItem(1, ItemStack.EMPTY);
            }
        }
        this.access.execute((level, pos) ->
            level.levelEvent(1030, pos, 0) // anvil use sound event
        );
    }

    @Override
    public void createResult() {
        ItemStack hammer = this.inputSlots.getItem(0);
        ItemStack plank  = this.inputSlots.getItem(1);

        if (!hammer.isEmpty() && hammer.is(ModItems.WOODEN_HAMMER.get()) && !plank.isEmpty()) {
            Item plate = PLANK_TO_PLATE.get(plank.getItem());
            if (plate != null) {
                this.resultSlots.setItem(0, new ItemStack(plate, 2));
                this.broadcastChanges();
                return;
            }
        }
        this.resultSlots.setItem(0, ItemStack.EMPTY);
        this.broadcastChanges();
    }
}

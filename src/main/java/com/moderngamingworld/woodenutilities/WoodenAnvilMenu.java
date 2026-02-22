package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModBlocks;
import com.moderngamingworld.woodenutilities.registry.ModItems;
import com.moderngamingworld.woodenutilities.registry.ModMenuTypes;
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
            hammer.hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
            //?} else {
            /*hammer.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(EquipmentSlot.MAINHAND));
            *///?}
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

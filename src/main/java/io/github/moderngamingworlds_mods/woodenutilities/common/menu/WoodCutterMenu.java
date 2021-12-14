package io.github.moderngamingworlds_mods.woodenutilities.common.menu;

import com.google.common.collect.Lists;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModRecipes;
import io.github.moderngamingworlds_mods.woodenutilities.common.menu.slot.TakeFuncOutSlot;
import io.github.moderngamingworlds_mods.woodenutilities.common.recipes.WoodcutterRecipe;
import io.github.noeppi_noeppi.libx.menu.BlockMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.forgespi.language.IModInfo;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.stream.Collectors;

public class WoodCutterMenu extends BlockMenu {

    private ItemStack input = ItemStack.EMPTY;
    private final DataSlot selectedRecipeIndex = DataSlot.standalone();
    private final Level level;
    private Runnable slotUpdateListener = () -> {
    };
    private List<WoodcutterRecipe> recipes = Lists.newArrayList();

    private final ContainerLevelAccess access;
    private final Slot inputSlot;
    private final Slot outputSlot;

    public final Container container = new SimpleContainer(1) {
        public void setChanged() {
            super.setChanged();
            slotsChanged(this);
            slotUpdateListener.run();
        }
    };

    final ResultContainer resultContainer = new ResultContainer();


    public WoodCutterMenu(@Nullable MenuType<? extends BlockMenu> type, int windowId, Level level, BlockPos pos, Inventory playerContainer, Player player) {
        super(type, windowId, level, pos, playerContainer, player, 0, 0);

        this.level = level;

        this.access = ContainerLevelAccess.create(level, pos);

        this.inputSlot = this.addSlot(new Slot(this.container, 0, 20, 33));
        this.outputSlot = this.addSlot(new TakeFuncOutSlot(this.resultContainer, 1, 143, 33, this::onItemTakeFromOutputSlot));
        this.layoutPlayerInventorySlots(8, 84);

        this.addDataSlot(this.selectedRecipeIndex);
    }

    private void onItemTakeFromOutputSlot(Player player, ItemStack stack) {
        stack.onCraftedBy(player.level, player, stack.getCount());
        this.resultContainer.awardUsedRecipes(player);
        ItemStack itemstack = this.inputSlot.remove(1);
        if (!itemstack.isEmpty()) {
            this.setupResultSlot();
        }
    }

    public int getSelectedRecipeIndex() {
        return this.selectedRecipeIndex.get();
    }

    public List<WoodcutterRecipe> getRecipes() {
        return this.recipes;
    }

    public int getNumRecipes() {
        return this.getRecipes().size();
    }

    public boolean hasInputItem() {
        return this.inputSlot.hasItem() && !this.getRecipes().isEmpty();
    }

    private boolean isValidRecipeIndex(int index) {
        return index >= 0 && index < this.getRecipes().size();
    }

    @Override
    public boolean clickMenuButton(Player player, int i) {
        if (this.isValidRecipeIndex(i)) {
            this.selectedRecipeIndex.set(i);
            this.setupResultSlot();
        }

        return true;
    }

    @Override
    public void slotsChanged(Container container) {
        ItemStack itemstack = this.inputSlot.getItem();
        if (!itemstack.is(this.input.getItem())) {
            this.input = itemstack.copy();
            this.setupRecipeList(container, itemstack);
        }

    }

    private void setupRecipeList(Container container, ItemStack stack) {
        this.getRecipes().clear();
        this.selectedRecipeIndex.set(-1);
        this.outputSlot.set(ItemStack.EMPTY);
        if (!stack.isEmpty()) {
            this.recipes = this.level.getRecipeManager().getRecipesFor(ModRecipes.WOODCUTTER, container, this.level).stream()
                    .filter(wcr -> ModList.get().getMods().stream()
                            .map(IModInfo::getModId)
                            .collect(Collectors.toList())
                            .containsAll(wcr.requiredMods)
                    ).collect(Collectors.toList());
        }
    }

    private void setupResultSlot() {
        if (!this.getRecipes().isEmpty() && this.isValidRecipeIndex(this.selectedRecipeIndex.get())) {
            WoodcutterRecipe woodcutterRecipe = this.getRecipes().get(this.selectedRecipeIndex.get());
            this.resultContainer.setRecipeUsed(woodcutterRecipe);
            this.outputSlot.set(woodcutterRecipe.assemble(this.container));
        } else {
            this.outputSlot.set(ItemStack.EMPTY);
        }
        this.broadcastChanges();
    }

    public void registerUpdateListener(Runnable other) {
        this.slotUpdateListener = other;
    }

    @Override
    public boolean canTakeItemForPickAll(ItemStack stack, Slot slot) {
        return slot.container != this.resultContainer && super.canTakeItemForPickAll(stack, slot);
    }

    @Nonnull
    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot.hasItem()) {
            ItemStack onSlot = slot.getItem();
            Item item = onSlot.getItem();
            itemstack = onSlot.copy();
            if (index == 1) {
                item.onCraftedBy(onSlot, player.level, player);
                if (!this.moveItemStackTo(onSlot, 2, 38, true)) {
                    return ItemStack.EMPTY;
                }

                slot.onQuickCraft(onSlot, itemstack);
            } else if (index == 0) {
                if (!this.moveItemStackTo(onSlot, 2, 38, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (this.level.getRecipeManager().getRecipeFor(RecipeType.STONECUTTING, new SimpleContainer(onSlot), this.level).isPresent()) {
                if (!this.moveItemStackTo(onSlot, 0, 1, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (index >= 2 && index < 29) {
                if (!this.moveItemStackTo(onSlot, 29, 38, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (index >= 29 && index < 38 && !this.moveItemStackTo(onSlot, 2, 29, false)) {
                return ItemStack.EMPTY;
            }

            if (onSlot.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            }

            slot.setChanged();
            if (onSlot.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(player, onSlot);
            this.broadcastChanges();
        }

        return itemstack;
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        this.resultContainer.removeItemNoUpdate(1);
        this.access.execute((p1, p2) -> this.clearContainer(player, this.container));
    }
}

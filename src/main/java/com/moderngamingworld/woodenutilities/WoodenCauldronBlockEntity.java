package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModBlockEntities;
import com.moderngamingworld.woodenutilities.registry.ModRecipes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Container;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
//? if recipe_holder {
/*import net.minecraft.world.item.crafting.RecipeHolder;
*///?}
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
//? if neoforge {
/*import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
*///?} else {
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
//?}

import net.minecraft.tags.FluidTags;

import javax.annotation.Nonnull;
import java.util.List;

public class WoodenCauldronBlockEntity extends BlockEntity {

    private static final int TANK_CAPACITY = 1000;

    final FluidTank tankA = new FluidTank(TANK_CAPACITY);
    final FluidTank tankB = new FluidTank(TANK_CAPACITY);
    final ItemStackHandler itemHandler = new ItemStackHandler(1);
    private ItemStack filterItem = ItemStack.EMPTY;

    // -- Fluid handler: fill + drain (sides: N/S/E/W) ------------------------
    final IFluidHandler sideFluidHandler = new IFluidHandler() {
        @Override public int getTanks() { return 2; }

        @Override public FluidStack getFluidInTank(int tank) {
            return tank == 0 ? tankA.getFluid() : tankB.getFluid();
        }

        @Override public int getTankCapacity(int tank) { return TANK_CAPACITY; }

        @Override public boolean isFluidValid(int tank, FluidStack stack) { return true; }

        @Override
        public int fill(FluidStack resource, FluidAction action) {
            // If filter is set, only accept fluids used in recipes producing the filter item
            if (!isFluidAllowedByFilter(resource)) return 0;
            // Try Tank A first (accepts same fluid or is empty)
            int filledA = tankA.fill(resource, action);
            if (filledA > 0) return filledA;
            // Tank A rejected it — try Tank B only when a recipe pairs them
            if (!tankA.isEmpty() && recipeAllowsSecondFluid(resource)) {
                return tankB.fill(resource, action);
            }
            return 0;
        }

        @Override
        public FluidStack drain(FluidStack resource, FluidAction action) {
            FluidStack drained = tankA.drain(resource, action);
            if (!drained.isEmpty()) return drained;
            return tankB.drain(resource, action);
        }

        @Override
        public FluidStack drain(int maxDrain, FluidAction action) {
            FluidStack drained = tankA.drain(maxDrain, action);
            if (!drained.isEmpty()) return drained;
            return tankB.drain(maxDrain, action);
        }
    };

    // -- Fluid handler: drain only (DOWN face) --------------------------------
    final IFluidHandler extractFluidHandler = new IFluidHandler() {
        @Override public int getTanks() { return 2; }

        @Override public FluidStack getFluidInTank(int tank) {
            return tank == 0 ? tankA.getFluid() : tankB.getFluid();
        }

        @Override public int getTankCapacity(int tank) { return TANK_CAPACITY; }

        @Override public boolean isFluidValid(int tank, FluidStack stack) { return false; }

        @Override public int fill(FluidStack resource, FluidAction action) { return 0; }

        @Override
        public FluidStack drain(FluidStack resource, FluidAction action) {
            FluidStack drained = tankA.drain(resource, action);
            if (!drained.isEmpty()) return drained;
            return tankB.drain(resource, action);
        }

        @Override
        public FluidStack drain(int maxDrain, FluidAction action) {
            FluidStack drained = tankA.drain(maxDrain, action);
            if (!drained.isEmpty()) return drained;
            return tankB.drain(maxDrain, action);
        }
    };

    // -- Item handler: insert-only (UP face) ----------------------------------
    final IItemHandler insertOnlyItemHandler = new IItemHandler() {
        @Override public int getSlots() { return 1; }

        @Override @Nonnull
        public ItemStack getStackInSlot(int slot) { return itemHandler.getStackInSlot(slot); }

        @Override @Nonnull
        public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
            if (!isItemAllowedByFilter(stack)) return stack;
            return itemHandler.insertItem(slot, stack, simulate);
        }

        @Override @Nonnull
        public ItemStack extractItem(int slot, int amount, boolean simulate) {
            return ItemStack.EMPTY;
        }

        @Override public int getSlotLimit(int slot) { return itemHandler.getSlotLimit(slot); }

        @Override public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
            return isItemAllowedByFilter(stack) && itemHandler.isItemValid(slot, stack);
        }
    };

    // -------------------------------------------------------------------------

    public WoodenCauldronBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WOODEN_CAULDRON.get(), pos, state);
    }

    public ItemStack getFilterItem() { return filterItem; }
    public void setFilterItem(ItemStack stack) { this.filterItem = stack; }

    // -- Server tick -----------------------------------------------------------

    public static void serverTick(Level level, BlockPos pos, BlockState state,
                                  WoodenCauldronBlockEntity be) {
        if (be.tankA.isEmpty()) return;

        //? if recipe_holder {
        /*for (net.minecraft.world.item.crafting.RecipeHolder<WoodenCauldronRecipe> holder :
                level.getRecipeManager().getAllRecipesFor(ModRecipes.WOODEN_CAULDRON_TYPE.get())) {
            WoodenCauldronRecipe recipe = holder.value();
        *///?} else {
        for (WoodenCauldronRecipe recipe :
                level.getRecipeManager().getAllRecipesFor(ModRecipes.WOODEN_CAULDRON_TYPE.get())) {
        //?}
            if (recipe.matches(be)) {
                // If a filter is set, skip recipes whose result doesn't match
                if (!be.filterItem.isEmpty() && be.filterItem.getItem() != recipe.getResultCopy().getItem()) {
                    continue;
                }
                recipe.consumeInputs(be);
                be.setChanged();
                level.sendBlockUpdated(pos, state, state, 3);
                tryOutputItem(level, pos, recipe.getResultCopy());
                break;
            }
        }
    }

    private static void tryOutputItem(Level level, BlockPos pos, ItemStack result) {
        BlockPos belowPos = pos.below();
        net.minecraft.world.level.block.entity.BlockEntity belowBE = level.getBlockEntity(belowPos);
        if (belowBE instanceof Container container) {
            ItemStack remaining = result.copy();
            for (int i = 0; i < container.getContainerSize() && !remaining.isEmpty(); i++) {
                if (container.canPlaceItem(i, remaining)) {
                    ItemStack slot = container.getItem(i);
                    if (slot.isEmpty()) {
                        container.setItem(i, remaining);
                        remaining = ItemStack.EMPTY;
                    //? if modern_nbt {
                    /*} else if (ItemStack.isSameItemSameComponents(slot, remaining)) {
                    *///?} else {
                    } else if (ItemStack.isSameItemSameTags(slot, remaining)) {
                    //?}
                        int canFit = Math.min(remaining.getCount(), slot.getMaxStackSize() - slot.getCount());
                        if (canFit > 0) {
                            slot.grow(canFit);
                            remaining.shrink(canFit);
                            container.setChanged();
                        }
                    }
                }
            }
            if (!remaining.isEmpty()) {
                spawnItemEntity(level, pos, remaining);
            }
        } else {
            spawnItemEntity(level, pos, result);
        }
    }

    private static void spawnItemEntity(Level level, BlockPos pos, ItemStack stack) {
        if (stack.isEmpty()) return;
        double x = pos.getX() + 0.5;
        double y = pos.getY() + 1.2;
        double z = pos.getZ() + 0.5;
        double vx = (level.random.nextFloat() - 0.5f) * 0.1f;
        double vz = (level.random.nextFloat() - 0.5f) * 0.1f;
        ItemEntity entity = new ItemEntity(level, x, y, z, stack);
        entity.setDeltaMovement(vx, 0.2, vz);
        level.addFreshEntity(entity);
    }

    // -- Fluid routing helper --------------------------------------------------

    private boolean recipeAllowsSecondFluid(FluidStack incoming) {
        if (level == null) return false;
        FluidStack aFluid = tankA.getFluid();
        if (aFluid.isEmpty()) return false;

        //? if recipe_holder {
        /*return level.getRecipeManager().getAllRecipesFor(ModRecipes.WOODEN_CAULDRON_TYPE.get())
                .stream().anyMatch(h -> {
            WoodenCauldronRecipe r = h.value();
            return r.isFluidFluid()
                    && r.getInputFluid().getFluid() == aFluid.getFluid()
                    && r.getInputFluid2() != null
                    && r.getInputFluid2().getFluid() == incoming.getFluid()
                    && (filterItem.isEmpty() || r.getResultCopy().getItem() == filterItem.getItem());
        });
        *///?} else {
        return level.getRecipeManager().getAllRecipesFor(ModRecipes.WOODEN_CAULDRON_TYPE.get())
                .stream().anyMatch(r ->
            r.isFluidFluid()
                    && r.getInputFluid().getFluid() == aFluid.getFluid()
                    && r.getInputFluid2() != null
                    && r.getInputFluid2().getFluid() == incoming.getFluid()
                    && (filterItem.isEmpty() || r.getResultCopy().getItem() == filterItem.getItem())
        );
        //?}
    }

    public boolean isFluidAllowedByFilter(FluidStack incoming) {
        if (filterItem.isEmpty() || level == null) return true;

        //? if recipe_holder {
        /*return level.getRecipeManager().getAllRecipesFor(ModRecipes.WOODEN_CAULDRON_TYPE.get())
                .stream().anyMatch(h -> {
            WoodenCauldronRecipe r = h.value();
            return r.getResultCopy().getItem() == filterItem.getItem()
                    && (r.getInputFluid().getFluid() == incoming.getFluid()
                        || (r.isFluidFluid() && r.getInputFluid2() != null
                            && r.getInputFluid2().getFluid() == incoming.getFluid()));
        });
        *///?} else {
        return level.getRecipeManager().getAllRecipesFor(ModRecipes.WOODEN_CAULDRON_TYPE.get())
                .stream().anyMatch(r ->
            r.getResultCopy().getItem() == filterItem.getItem()
                    && (r.getInputFluid().getFluid() == incoming.getFluid()
                        || (r.isFluidFluid() && r.getInputFluid2() != null
                            && r.getInputFluid2().getFluid() == incoming.getFluid()))
        );
        //?}
    }

    public boolean isItemAllowedByFilter(ItemStack stack) {
        if (filterItem.isEmpty() || level == null || stack.isEmpty()) return true;

        //? if recipe_holder {
        /*return level.getRecipeManager().getAllRecipesFor(ModRecipes.WOODEN_CAULDRON_TYPE.get())
                .stream().anyMatch(h -> {
            WoodenCauldronRecipe r = h.value();
            return r.getResultCopy().getItem() == filterItem.getItem()
                    && !r.isFluidFluid()
                    && r.getInputItem() != null
                    && r.getInputItem().test(stack);
        });
        *///?} else {
        return level.getRecipeManager().getAllRecipesFor(ModRecipes.WOODEN_CAULDRON_TYPE.get())
                .stream().anyMatch(r ->
            r.getResultCopy().getItem() == filterItem.getItem()
                    && !r.isFluidFluid()
                    && r.getInputItem() != null
                    && r.getInputItem().test(stack)
        );
        //?}
    }

    // -- NBT persistence -------------------------------------------------------

    //? if modern_nbt {
    /*@Override
    protected void saveAdditional(CompoundTag tag, net.minecraft.core.HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("TankA", tankA.writeToNBT(registries, new CompoundTag()));
        tag.put("TankB", tankB.writeToNBT(registries, new CompoundTag()));
        tag.put("Items", itemHandler.serializeNBT(registries));
        if (!filterItem.isEmpty()) tag.put("Filter", filterItem.save(registries));
    }

    @Override
    public void loadAdditional(CompoundTag tag, net.minecraft.core.HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        tankA.readFromNBT(registries, tag.getCompound("TankA"));
        tankB.readFromNBT(registries, tag.getCompound("TankB"));
        itemHandler.deserializeNBT(registries, tag.getCompound("Items"));
        filterItem = ItemStack.parseOptional(registries, tag.getCompound("Filter"));
    }
    *///?} else {
    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.put("TankA", tankA.writeToNBT(new CompoundTag()));
        tag.put("TankB", tankB.writeToNBT(new CompoundTag()));
        tag.put("Items", itemHandler.serializeNBT());
        if (!filterItem.isEmpty()) tag.put("Filter", filterItem.save(new CompoundTag()));
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        tankA.readFromNBT(tag.getCompound("TankA"));
        tankB.readFromNBT(tag.getCompound("TankB"));
        itemHandler.deserializeNBT(tag.getCompound("Items"));
        filterItem = tag.contains("Filter") ? ItemStack.of(tag.getCompound("Filter")) : ItemStack.EMPTY;
    }
    //?}

    // -- Client sync -----------------------------------------------------------

    //? if modern_nbt {
    /*@Override
    public CompoundTag getUpdateTag(net.minecraft.core.HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }
    *///?} else {
    @Override
    public CompoundTag getUpdateTag() {
        return saveWithoutMetadata();
    }
    //?}

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    //? if modern_nbt {
    /*@Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt,
                             net.minecraft.core.HolderLookup.Provider registries) {
        if (pkt.getTag() != null) loadAdditional(pkt.getTag(), registries);
    }
    *///?} else {
    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
        if (pkt.getTag() != null) load(pkt.getTag());
    }
    //?}

    // -- Forge capabilities ----------------------------------------------------

    //? if neoforge {
    
    //?} else {
    private final LazyOptional<IFluidHandler> fluidCap         = LazyOptional.of(() -> sideFluidHandler);
    private final LazyOptional<IFluidHandler> extractFluidCap  = LazyOptional.of(() -> extractFluidHandler);
    private final LazyOptional<IItemHandler>  itemCap          = LazyOptional.of(() -> insertOnlyItemHandler);

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        if (cap == ForgeCapabilities.FLUID_HANDLER) {
            if (side == Direction.UP) return LazyOptional.empty();
            if (side == Direction.DOWN) return extractFluidCap.cast();
            return fluidCap.cast();
        }
        if (cap == ForgeCapabilities.ITEM_HANDLER) {
            if (side == null || side == Direction.UP) return itemCap.cast();
            return LazyOptional.empty();
        }
        return super.getCapability(cap, side);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        fluidCap.invalidate();
        extractFluidCap.invalidate();
        itemCap.invalidate();
    }
    //?}

    // -- Accessors (used by recipe and block) ----------------------------------

    public boolean hasLava() {
        return (!tankA.isEmpty() && tankA.getFluid().getFluid().is(FluidTags.LAVA))
            || (!tankB.isEmpty() && tankB.getFluid().getFluid().is(FluidTags.LAVA));
    }

    public FluidTank getTankA() { return tankA; }
    public FluidTank getTankB() { return tankB; }
    public ItemStackHandler getItemHandler() { return itemHandler; }
    public IFluidHandler getSideFluidHandler() { return sideFluidHandler; }
}

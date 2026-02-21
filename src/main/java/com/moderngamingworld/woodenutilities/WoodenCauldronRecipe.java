package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModRecipes;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandler;

import javax.annotation.Nullable;

public class WoodenCauldronRecipe implements Recipe<SimpleContainer> {

    private final ResourceLocation id;
    private final FluidStack inputFluid;
    @Nullable private final FluidStack inputFluid2;
    @Nullable private final Ingredient inputItem;
    private final ItemStack result;

    public WoodenCauldronRecipe(ResourceLocation id, FluidStack inputFluid,
                                @Nullable FluidStack inputFluid2,
                                @Nullable Ingredient inputItem,
                                ItemStack result) {
        this.id = id;
        this.inputFluid = inputFluid;
        this.inputFluid2 = inputFluid2;
        this.inputItem = inputItem;
        this.result = result;
    }

    public boolean isFluidFluid() {
        return inputFluid2 != null;
    }

    public boolean matches(WoodenCauldronBlockEntity be) {
        FluidStack tankAFluid = be.getTankA().getFluid();
        if (tankAFluid.isEmpty() || tankAFluid.getFluid() != inputFluid.getFluid()
                || tankAFluid.getAmount() < inputFluid.getAmount()) {
            return false;
        }
        if (isFluidFluid()) {
            FluidStack tankBFluid = be.getTankB().getFluid();
            return !tankBFluid.isEmpty()
                    && tankBFluid.getFluid() == inputFluid2.getFluid()
                    && tankBFluid.getAmount() >= inputFluid2.getAmount();
        } else {
            ItemStack slotItem = be.getItemHandler().getStackInSlot(0);
            return inputItem != null && inputItem.test(slotItem);
        }
    }

    public void consumeInputs(WoodenCauldronBlockEntity be) {
        be.getTankA().drain(inputFluid.getAmount(), IFluidHandler.FluidAction.EXECUTE);
        if (isFluidFluid()) {
            be.getTankB().drain(inputFluid2.getAmount(), IFluidHandler.FluidAction.EXECUTE);
        } else {
            be.getItemHandler().extractItem(0, 1, false);
        }
    }

    public FluidStack getInputFluid() { return inputFluid; }

    @Nullable
    public FluidStack getInputFluid2() { return inputFluid2; }

    @Nullable
    public Ingredient getInputItem() { return inputItem; }

    public ItemStack getResultCopy() { return result.copy(); }

    // ── Recipe<SimpleContainer> interface ────────────────────────────────────
    // Real matching is done via matches(WoodenCauldronBlockEntity).
    // These vanilla methods are stubs so the type registers correctly.

    @Override
    public boolean matches(SimpleContainer container, Level level) { return false; }

    @Override
    public ItemStack assemble(SimpleContainer container, RegistryAccess access) { return result.copy(); }

    @Override
    public boolean canCraftInDimensions(int width, int height) { return false; }

    @Override
    public ItemStack getResultItem(RegistryAccess access) { return result.copy(); }

    @Override
    public ResourceLocation getId() { return id; }

    @Override
    public RecipeSerializer<?> getSerializer() { return ModRecipes.WOODEN_CAULDRON_SERIALIZER.get(); }

    @Override
    public RecipeType<?> getType() { return ModRecipes.WOODEN_CAULDRON_TYPE.get(); }
}

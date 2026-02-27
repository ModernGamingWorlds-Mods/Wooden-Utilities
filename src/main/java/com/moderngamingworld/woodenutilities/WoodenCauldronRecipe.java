package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModRecipes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
//? if modern_nbt {
/*import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.crafting.RecipeInput;
*///?} else {
import net.minecraft.core.RegistryAccess;
import net.minecraft.world.Container;
//?}
//? if neoforge {
/*import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
*///?} else {
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandler;
//?}

import javax.annotation.Nullable;

//? if modern_nbt {
/*public class WoodenCauldronRecipe implements Recipe<RecipeInput> {
*///?} else {
public class WoodenCauldronRecipe implements Recipe<Container> {
//?}

    private final FluidStack inputFluid;
    @Nullable private final FluidStack inputFluid2;
    @Nullable private final Ingredient inputItem;
    private final ItemStack result;
    //? if forge_1201 {
    net.minecraft.resources.ResourceLocation id;
    //?}

    public WoodenCauldronRecipe(FluidStack inputFluid,
                                @Nullable FluidStack inputFluid2,
                                @Nullable Ingredient inputItem,
                                ItemStack result) {
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

    // ── Recipe interface stubs ────────────────────────────────────────────────

    //? if modern_nbt {
    /*@Override
    public boolean matches(RecipeInput input, Level level) { return false; }

    @Override
    public ItemStack assemble(RecipeInput input, HolderLookup.Provider registries) { return result.copy(); }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) { return result.copy(); }
    *///?} else {
    @Override
    public boolean matches(Container container, Level level) { return false; }

    @Override
    public ItemStack assemble(Container container, RegistryAccess registryAccess) { return result.copy(); }

    @Override
    public ItemStack getResultItem(RegistryAccess registryAccess) { return result.copy(); }
    //?}

    @Override
    public boolean canCraftInDimensions(int width, int height) { return false; }

    @Override
    public RecipeSerializer<?> getSerializer() { return ModRecipes.WOODEN_CAULDRON_SERIALIZER.get(); }

    @Override
    public RecipeType<?> getType() { return ModRecipes.WOODEN_CAULDRON_TYPE.get(); }

    //? if forge_1201 {
    @Override
    public net.minecraft.resources.ResourceLocation getId() { return id; }
    //?}
}

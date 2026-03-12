package com.moderngamingworld.woodenutilities;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
//? if neoforge {
/*import com.moderngamingworld.woodenutilities.registry.ModDataComponents;
import net.neoforged.neoforge.fluids.FluidActionResult;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.FluidUtil;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.IFluidHandlerItem;
*///?} else {
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.FluidActionResult;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack;
import javax.annotation.Nullable;
//?}

public class WoodenBucketItem extends Item {

    public static final int CAPACITY = 1000;

    public WoodenBucketItem(Properties props) {
        super(props);
    }

    // -- Fluid storage helpers -------------------------------------------------

    //? if neoforge {
    /*public static FluidStack getFluid(ItemStack stack) {
        return stack.getOrDefault(ModDataComponents.BUCKET_FLUID.get(), FluidStack.EMPTY);
    }

    public static void setFluid(ItemStack stack, FluidStack fluid) {
        if (fluid.isEmpty()) stack.remove(ModDataComponents.BUCKET_FLUID.get());
        else stack.set(ModDataComponents.BUCKET_FLUID.get(), fluid);
    }

    /^* Called by RegisterCapabilitiesEvent in WoodenUtilities. ^/
    public static IFluidHandlerItem createFluidHandler(ItemStack stack) {
        return new IFluidHandlerItem() {
            @Override public ItemStack getContainer() { return stack; }
            @Override public int getTanks() { return 1; }
            @Override public FluidStack getFluidInTank(int tank) { return getFluid(stack); }
            @Override public int getTankCapacity(int tank) { return CAPACITY; }
            @Override public boolean isFluidValid(int tank, FluidStack fluid) { return true; }

            @Override
            public int fill(FluidStack resource, FluidAction action) {
                if (resource.isEmpty() || !getFluid(stack).isEmpty()) return 0;
                int amount = Math.min(resource.getAmount(), CAPACITY);
                if (action.execute()) setFluid(stack, resource.copyWithAmount(amount));
                return amount;
            }

            @Override
            public FluidStack drain(FluidStack resource, FluidAction action) {
                FluidStack held = getFluid(stack);
                if (held.isEmpty() || held.getFluid() != resource.getFluid()) return FluidStack.EMPTY;
                int amount = Math.min(held.getAmount(), resource.getAmount());
                FluidStack result = held.copyWithAmount(amount);
                if (action.execute()) {
                    setFluid(stack, amount >= held.getAmount()
                            ? FluidStack.EMPTY : held.copyWithAmount(held.getAmount() - amount));
                }
                return result;
            }

            @Override
            public FluidStack drain(int maxDrain, FluidAction action) {
                FluidStack held = getFluid(stack);
                if (held.isEmpty()) return FluidStack.EMPTY;
                int amount = Math.min(held.getAmount(), maxDrain);
                FluidStack result = held.copyWithAmount(amount);
                if (action.execute()) {
                    setFluid(stack, amount >= held.getAmount()
                            ? FluidStack.EMPTY : held.copyWithAmount(held.getAmount() - amount));
                }
                return result;
            }
        };
    }
    *///?} else {
    public static FluidStack getFluid(ItemStack stack) {
        if (!stack.hasTag() || !stack.getTag().contains("Fluid")) return FluidStack.EMPTY;
        return FluidStack.loadFluidStackFromNBT(stack.getTag().getCompound("Fluid"));
    }

    public static void setFluid(ItemStack stack, FluidStack fluid) {
        if (fluid.isEmpty()) {
            if (stack.hasTag()) stack.getTag().remove("Fluid");
        } else {
            stack.getOrCreateTag().put("Fluid", fluid.writeToNBT(new CompoundTag()));
        }
    }

    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundTag nbt) {
        return new FluidHandlerItemStack(stack, CAPACITY) {
            @Override
            public boolean canFillFluidType(FluidStack fluid) { return true; }
        };
    }
    //?}

    // -- Display name changes based on fluid content ---------------------------

    @Override
    public Component getName(ItemStack stack) {
        FluidStack fluid = getFluid(stack);
        if (!fluid.isEmpty()) {
            String base = getDescriptionId(stack);
            if (fluid.getFluid() == Fluids.WATER)
                return Component.translatable(base.replace("_wooden_bucket", "_wooden_water_bucket"));
            if (fluid.getFluid() == Fluids.LAVA)
                return Component.translatable(base.replace("_wooden_bucket", "_wooden_lava_bucket"));
        }
        return super.getName(stack);
    }

    // -- World interaction: pick up / place fluids -----------------------------

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        FluidStack held = getFluid(stack);

        if (held.isEmpty()) {
            BlockHitResult ray = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);
            if (ray.getType() != HitResult.Type.MISS) {
                FluidActionResult result =
                        FluidUtil.tryPickUpFluid(stack, player, level, ray.getBlockPos(), ray.getDirection());
                if (result.isSuccess()) {
                    return InteractionResultHolder.sidedSuccess(result.getResult(), level.isClientSide);
                }
            }
        } else {
            BlockHitResult ray = getPlayerPOVHitResult(level, player, ClipContext.Fluid.NONE);
            if (ray.getType() != HitResult.Type.MISS) {
                FluidActionResult result = FluidUtil.tryPlaceFluid(player, level, hand,
                        ray.getBlockPos().relative(ray.getDirection()), stack, held);
                if (result.isSuccess()) {
                    return InteractionResultHolder.sidedSuccess(result.getResult(), level.isClientSide);
                }
            }
        }

        return InteractionResultHolder.pass(stack);
    }
}

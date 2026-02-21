package com.moderngamingworld.woodenutilities;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.FluidActionResult;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack;

import javax.annotation.Nullable;

public class WoodenBucketItem extends Item {

    private static final int CAPACITY = 1000;

    public WoodenBucketItem(Properties props) {
        super(props);
    }

    // ── Fluid NBT helpers (compatible with FluidHandlerItemStack's "Fluid" tag) ──

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

    // ── Capability: 1000 mb single-tank, any fluid ────────────────────────────

    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundTag nbt) {
        return new FluidHandlerItemStack(stack, CAPACITY) {
            @Override
            public boolean canFillFluidType(FluidStack fluid) {
                return true;
            }
        };
    }

    // ── World interaction: pick up / place fluids ─────────────────────────────

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        FluidStack held = getFluid(stack);

        if (held.isEmpty()) {
            // Look for a fluid source block to pick up
            BlockHitResult ray = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);
            if (ray.getType() != HitResult.Type.MISS) {
                FluidActionResult result =
                        FluidUtil.tryPickUpFluid(stack, player, level, ray.getBlockPos(), ray.getDirection());
                if (result.isSuccess()) {
                    return InteractionResultHolder.sidedSuccess(result.getResult(), level.isClientSide);
                }
            }
        } else {
            // Place fluid adjacent to the targeted block face
            BlockHitResult ray = getPlayerPOVHitResult(level, player, ClipContext.Fluid.NONE);
            if (ray.getType() != HitResult.Type.MISS) {
                BlockPos placePos = ray.getBlockPos().relative(ray.getDirection());
                FluidActionResult result = FluidUtil.tryPlaceFluid(player, level, hand, placePos, stack, held);
                if (result.isSuccess()) {
                    return InteractionResultHolder.sidedSuccess(result.getResult(), level.isClientSide);
                }
            }
        }

        return InteractionResultHolder.pass(stack);
    }
}

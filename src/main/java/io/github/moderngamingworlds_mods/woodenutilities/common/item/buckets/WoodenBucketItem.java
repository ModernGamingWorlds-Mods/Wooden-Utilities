package io.github.moderngamingworlds_mods.woodenutilities.common.item.buckets;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.config.WUCommonConfig;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BucketPickup;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

//TODO: rework completely, this doesn't support modded fluids and stores player-specific state on a singleton
@SuppressWarnings("deprecation")
public class WoodenBucketItem extends BucketItem {

    private boolean hasCooldown = false;

    public WoodenBucketItem(Supplier<Fluid> inFluid) {
        super(inFluid, new Properties()
                .tab(WoodenUtilities.CREATIVE_TAB)
                .stacksTo(inFluid == Fluids.EMPTY ? 16 : 1)
        );
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(ModItems.WOODEN_BUCKET.get());
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int itemSlot, boolean isSelected) {
        if (!level.isClientSide) {
            if (this.getFluid().getAttributes().getTemperature() >= WUCommonConfig.INSTANCE.bucketMaxTemperature.get()
                    && entity instanceof Player player) {
                if (!this.hasCooldown) {
                    player.getCooldowns().addCooldown(this, WUCommonConfig.INSTANCE.bucketDestroyTime.get());
                    this.hasCooldown = true;
                }
                if (!player.getCooldowns().isOnCooldown(this)) {
                    player.getCooldowns().removeCooldown(this);
                    if (level.getBlockState(entity.blockPosition()).isAir()) {
                        level.setBlock(entity.blockPosition(), this.getFluid().defaultFluidState().createLegacyBlock(), Block.UPDATE_ALL);
                    }
                    stack.shrink(1);
                    //TODO: This is crashing the game. Needs investigation.
                    //player.broadcastBreakEvent(InteractionHand.MAIN_HAND);
                    this.hasCooldown = false;
                }
            }
        }
    }

    // [Vanilla copy]
    @Override
    @Nonnull
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        BlockHitResult hitResult = Item.getPlayerPOVHitResult(level, player, this.getFluid() == Fluids.EMPTY ? ClipContext.Fluid.SOURCE_ONLY : ClipContext.Fluid.NONE);

        InteractionResultHolder<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onBucketUse(player, level, stack, hitResult);
        if (ret != null) return ret;

        if (hitResult.getType() == HitResult.Type.MISS) {
            return InteractionResultHolder.pass(stack);
        }

        if (hitResult.getType() != HitResult.Type.BLOCK) {
            return InteractionResultHolder.pass(stack);
        }

        BlockPos pos = hitResult.getBlockPos();
        Direction face = hitResult.getDirection();
        BlockPos neighborPos = pos.relative(face);
        if (!level.mayInteract(player, pos) || !player.mayUseItemAt(neighborPos, face, stack)) {
            return InteractionResultHolder.fail(stack);
        }

        BlockState state = level.getBlockState(pos);
        if (this.getFluid() == Fluids.EMPTY) {
            if (state.getBlock() instanceof BucketPickup bucketpickup) {
                ItemStack pickupItem = bucketpickup.pickupBlock(level, pos, state);

                if (!pickupItem.isEmpty()) {
                    player.awardStat(Stats.ITEM_USED.get(this));
                    bucketpickup.getPickupSound().ifPresent(soundEvent -> player.playSound(soundEvent, 1, 1));
                    level.gameEvent(player, GameEvent.FLUID_PICKUP, pos);

                    // [START] custom insertion
                    ItemStack bucket = EnumWoodenBucket.getBucket(((BucketItem) pickupItem.getItem()).getFluid());
                    // [END]
                    ItemStack filledResult = ItemUtils.createFilledResult(stack, player, bucket /* use custom bucket instead of pickupItem */);

                    if (!level.isClientSide) {
                        CriteriaTriggers.FILLED_BUCKET.trigger((ServerPlayer) player, pickupItem);
                    }

                    return InteractionResultHolder.sidedSuccess(filledResult, level.isClientSide());
                }
            }

            return InteractionResultHolder.fail(stack);
        }

        BlockPos placePos = this.canBlockContainFluid(level, pos, state) ? pos : neighborPos;

        if (!this.emptyContents(player, level, placePos, hitResult)) {
            return InteractionResultHolder.fail(stack);
        }

        this.checkExtraContent(player, level, stack, placePos);
        if (player instanceof ServerPlayer) {
            CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer) player, placePos, stack);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        return InteractionResultHolder.sidedSuccess(getEmptySuccessItem(stack, player), level.isClientSide());
    }

    @Nonnull
    public static ItemStack getEmptySuccessItem(ItemStack stack, Player player) {
        return !player.getAbilities().instabuild ? new ItemStack(ModItems.WOODEN_BUCKET.get()) : stack;
    }

    private boolean canBlockContainFluid(Level level, BlockPos pos, BlockState state) {
        return state.getBlock() instanceof LiquidBlockContainer container && container.canPlaceLiquid(level, pos, state, this.getFluid());
    }
}

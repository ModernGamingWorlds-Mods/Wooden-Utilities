package com.moderngamingworld.woodenutilities;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemHandlerHelper;

@Mod.EventBusSubscriber(modid = WoodenUtilities.MOD_ID)
public class WaterCrucibleEvents {
    private static final int MB_PER_LEVEL = 333;

    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);

        if (state.getBlock() != Blocks.WATER_CAULDRON || !(state.getBlock() instanceof LayeredCauldronBlock)) {
            return;
        }

        Player player = event.getEntity();
        ItemStack stack = player.getItemInHand(event.getHand());
        if (stack.isEmpty()) {
            return;
        }

        WaterCrucibleRecipeManager.findMatching(stack, WaterCrucibleRecipeManager.waterFluid()).ifPresent(recipe -> {
            int levelAmount = state.getValue(LayeredCauldronBlock.LEVEL);
            int requiredLevels = Math.max(1, (int) Math.ceil(recipe.amount() / (double) MB_PER_LEVEL));
            if (levelAmount < requiredLevels) {
                return;
            }

            event.setCanceled(true);
            event.setCancellationResult(InteractionResult.sidedSuccess(level.isClientSide));
            if (level.isClientSide) {
                return;
            }

            ItemStack result = recipe.createResultStack();

            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }

            int newLevel = levelAmount - requiredLevels;
            if (newLevel <= 0) {
                level.setBlockAndUpdate(pos, Blocks.CAULDRON.defaultBlockState());
            } else {
                level.setBlockAndUpdate(pos, state.setValue(LayeredCauldronBlock.LEVEL, newLevel));
            }

            distributeResult(level, pos, result);
            level.playSound(null, pos, SoundEvents.GENERIC_SPLASH, SoundSource.BLOCKS, 1.0F, 1.0F);
        });
    }

    private static void distributeResult(Level level, BlockPos cauldronPos, ItemStack result) {
        BlockPos belowPos = cauldronPos.below();
        BlockEntity below = level.getBlockEntity(belowPos);
        if (below != null) {
            ItemStack remaining = insertIntoHandler(below, result);
            if (!remaining.isEmpty()) {
                spawnOutput(level, cauldronPos, remaining);
            }
            return;
        }

        spawnOutput(level, cauldronPos, result);
    }

    private static ItemStack insertIntoHandler(BlockEntity blockEntity, ItemStack stack) {
        ItemStack remaining = stack;

        IItemHandler topHandler = blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, Direction.UP).orElse(null);
        if (topHandler != null) {
            remaining = ItemHandlerHelper.insertItem(topHandler, remaining, false);
        }

        if (remaining.isEmpty()) {
            return ItemStack.EMPTY;
        }

        IItemHandler internalHandler = blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).orElse(null);
        if (internalHandler != null) {
            remaining = ItemHandlerHelper.insertItem(internalHandler, remaining, false);
        }

        return remaining;
    }

    private static void spawnOutput(Level level, BlockPos pos, ItemStack stack) {
        if (stack.isEmpty()) {
            return;
        }

        ItemEntity itemEntity = new ItemEntity(
            level,
            pos.getX() + 0.5D,
            pos.getY() + 1.0D,
            pos.getZ() + 0.5D,
            stack
        );
        level.addFreshEntity(itemEntity);
    }
}

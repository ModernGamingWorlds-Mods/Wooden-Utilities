package com.moderngamingworld.woodenutilities;

import java.util.function.Supplier;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CauldronInteraction;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

public class WoodenWaterCauldronBlock extends LayeredCauldronBlock {
    private final Supplier<Block> emptyCauldron;

    public WoodenWaterCauldronBlock(BlockBehaviour.Properties properties, Supplier<Block> emptyCauldron) {
        super(properties, precipitation -> precipitation == Biome.Precipitation.RAIN, CauldronInteraction.WATER);
        this.emptyCauldron = emptyCauldron;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(hand);
        if (heldItem.getItem() == Items.BUCKET && state.getValue(LEVEL) == 3) {
            if (!level.isClientSide) {
                ItemStack filledBucket = ItemUtils.createFilledResult(heldItem, player, new ItemStack(Items.WATER_BUCKET));
                player.setItemInHand(hand, filledBucket);
                level.setBlockAndUpdate(pos, emptyCauldron.get().defaultBlockState());
                level.playSound(null, pos, SoundEvents.BUCKET_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.gameEvent(player, GameEvent.FLUID_PICKUP, pos);
            }
            return InteractionResult.sidedSuccess(level.isClientSide);
        }

        return super.use(state, level, pos, player, hand, hit);
    }
}

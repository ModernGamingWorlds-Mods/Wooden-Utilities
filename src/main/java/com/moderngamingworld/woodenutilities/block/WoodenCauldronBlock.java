package com.moderngamingworld.woodenutilities.block;

import java.util.function.Supplier;
import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CauldronBlock;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

public class WoodenCauldronBlock extends CauldronBlock {
    private final Supplier<? extends LayeredCauldronBlock> waterCauldron;

    public WoodenCauldronBlock(BlockBehaviour.Properties properties, Supplier<? extends LayeredCauldronBlock> waterCauldron) {
        super(properties);
        this.waterCauldron = waterCauldron;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (itemStack.is(Items.WATER_BUCKET)) {
            if (!level.isClientSide) {
                if (!player.getAbilities().instabuild) {
                    player.setItemInHand(hand, new ItemStack(Items.BUCKET));
                }
                BlockState filledState = waterCauldron.get().defaultBlockState()
                    .setValue(LayeredCauldronBlock.LEVEL, 3);
                level.setBlock(pos, filledState, 3);
                level.gameEvent(GameEvent.FLUID_PLACE, pos);
                player.awardStat(Stats.FILL_CAULDRON);
                player.awardStat(Stats.ITEM_USED.get(Items.WATER_BUCKET));
            }
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
        return super.use(state, level, pos, player, hand, hit);
    }
}

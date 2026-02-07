package com.moderngamingworld.woodenutilities;

import java.util.Map;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.CauldronInteraction;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class WoodenLayeredCauldronBlock extends LayeredCauldronBlock {
    public WoodenLayeredCauldronBlock(
        BlockBehaviour.Properties properties,
        Predicate<Biome.Precipitation> precipitationPredicate,
        Map<Item, CauldronInteraction> interactions
    ) {
        super(properties, precipitationPredicate, interactions);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(hand);
        if (heldItem.getItem() instanceof BucketItem
            && heldItem.getItem() != Items.BUCKET
            && heldItem.getItem() != Items.WATER_BUCKET) {
            return InteractionResult.sidedSuccess(level.isClientSide);
        }

        return super.use(state, level, pos, player, hand, hit);
    }
}

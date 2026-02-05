package com.moderngamingworld.woodenutilities;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.cauldron.CauldronInteraction;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.ForgeRegistries;

public class WoodenLayeredCauldronBlock extends LayeredCauldronBlock {
    public WoodenLayeredCauldronBlock(BlockBehaviour.Properties properties) {
        super(properties, precipitation -> true, CauldronInteraction.WATER);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(hand);

        if (heldItem.is(Items.BUCKET) && state.getValue(LEVEL) == 3) {
            if (!level.isClientSide) {
                Block emptyCauldron = getEmptyVariant(state.getBlock());
                if (emptyCauldron != null) {
                    level.setBlockAndUpdate(pos, emptyCauldron.defaultBlockState());
                }

                player.awardStat(Stats.USE_CAULDRON);
                if (!player.getAbilities().instabuild) {
                    player.setItemInHand(hand, new ItemStack(Items.WATER_BUCKET));
                }

                level.playSound(null, pos, SoundEvents.BUCKET_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
            }

            return InteractionResult.sidedSuccess(level.isClientSide);
        }

        return super.use(state, level, pos, player, hand, hit);
    }

    private static Block getEmptyVariant(Block block) {
        ResourceLocation id = ForgeRegistries.BLOCKS.getKey(block);
        if (id == null || !id.getPath().endsWith("_water_cauldron")) {
            return null;
        }

        ResourceLocation emptyId = new ResourceLocation(id.getNamespace(), id.getPath().replace("_water_cauldron", "_cauldron"));
        Block emptyBlock = ForgeRegistries.BLOCKS.getValue(emptyId);
        return emptyBlock == null ? null : emptyBlock;
    }
}

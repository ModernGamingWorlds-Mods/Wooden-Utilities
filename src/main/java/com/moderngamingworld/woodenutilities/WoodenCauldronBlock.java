package com.moderngamingworld.woodenutilities;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CauldronBlock;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.registries.ForgeRegistries;

public class WoodenCauldronBlock extends CauldronBlock {
    public WoodenCauldronBlock(BlockBehaviour.Properties properties) {
        super(properties);
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

    private static Block getWaterVariant(Block block) {
        ResourceLocation id = ForgeRegistries.BLOCKS.getKey(block);
        if (id == null || !id.getPath().endsWith("_cauldron")) {
            return null;
        }

        ResourceLocation waterId = new ResourceLocation(id.getNamespace(), id.getPath().replace("_cauldron", "_water_cauldron"));
        Block waterBlock = ForgeRegistries.BLOCKS.getValue(waterId);
        return waterBlock == null ? null : waterBlock;
    }
}

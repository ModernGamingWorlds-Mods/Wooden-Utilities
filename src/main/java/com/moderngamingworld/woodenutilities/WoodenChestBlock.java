package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.ChestType;

import javax.annotation.Nullable;

public class WoodenChestBlock extends ChestBlock {

    public WoodenChestBlock(BlockBehaviour.Properties properties) {
        super(properties, () -> ModBlockEntities.WOODEN_CHEST.get());
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WoodenChestBlockEntity(pos, state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        //? if has_geckolib {
        // RIGHT block is invisible — the LEFT block renders the full double chest geo
        if (state.getValue(ChestBlock.TYPE) == ChestType.RIGHT) {
            return RenderShape.INVISIBLE;
        }
        return RenderShape.ENTITYBLOCK_ANIMATED;
        //?} else {
        /*return RenderShape.MODEL;
        *///?}
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        // GeckoLib drives animation via isOpen boolean (set in triggerEvent), no vanilla lid tick needed
        return null;
    }
}

package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HopperBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WoodenHopperBlockEntity extends HopperBlockEntity {

    private int tickSkip = 0;

    public WoodenHopperBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.WOODEN_HOPPER.get();
    }

    public static void serverTick(Level level, BlockPos pos, BlockState state, WoodenHopperBlockEntity be) {
        if (++be.tickSkip < 2) return;
        be.tickSkip = 0;
        HopperBlockEntity.pushItemsTick(level, pos, state, (HopperBlockEntity) be);
    }
}

package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Containers;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
//? if neoforge {
/*import com.mojang.serialization.MapCodec;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.fluids.FluidUtil;
*///?} else if forge_mid {
import com.mojang.serialization.MapCodec;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.fluids.FluidUtil;
//?} else if modern_nbt {
/*import com.mojang.serialization.MapCodec;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.fluids.FluidUtil;
*///?} else {
/*import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.fluids.FluidUtil;
*///?}

import javax.annotation.Nullable;

public class WoodenCauldronBlock extends BaseEntityBlock {

    //? if neoforge {
    /*public static final MapCodec<WoodenCauldronBlock> CODEC = simpleCodec(WoodenCauldronBlock::new);

    @Override
    protected MapCodec<WoodenCauldronBlock> codec() {
        return CODEC;
    }
    *///?} else if modern_nbt {
    /*public static final MapCodec<WoodenCauldronBlock> CODEC = simpleCodec(WoodenCauldronBlock::new);

    @Override
    protected MapCodec<WoodenCauldronBlock> codec() {
        return CODEC;
    }
    *///?} else if forge_mid {
    public static final MapCodec<WoodenCauldronBlock> CODEC = simpleCodec(WoodenCauldronBlock::new);

    @Override
    protected MapCodec<WoodenCauldronBlock> codec() {
        return CODEC;
    }
    //?}

    // Matches the vanilla AbstractCauldronBlock shape
    private static final VoxelShape SHAPE = Shapes.join(
            Shapes.block(),
            Shapes.join(
                    box(2.0, 4.0, 2.0, 14.0, 16.0, 14.0),
                    box(4.0, 0.0, 4.0, 12.0, 4.0, 12.0),
                    BooleanOp.OR),
            BooleanOp.ONLY_FIRST);

    public WoodenCauldronBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    // ── Light emission ────────────────────────────────────────────────────────

    @Override
    public int getLightEmission(BlockState state, net.minecraft.world.level.BlockGetter level, BlockPos pos) {
        BlockEntity be = level.getBlockEntity(pos);
        if (be instanceof WoodenCauldronBlockEntity cauldron && cauldron.hasLava()) return 15;
        return super.getLightEmission(state, level, pos);
    }

    // ── Block entity wiring ───────────────────────────────────────────────────

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WoodenCauldronBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state,
                                                                   BlockEntityType<T> type) {
        return level.isClientSide ? null
                : createTickerHelper(type, ModBlockEntities.WOODEN_CAULDRON.get(),
                        WoodenCauldronBlockEntity::serverTick);
    }

    // ── Bucket / fluid item interaction ───────────────────────────────────────

    //? if neoforge {
    /*@Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level,
                                              BlockPos pos, Player player, InteractionHand hand,
                                              BlockHitResult hit) {
        if (stack.getCapability(Capabilities.FluidHandler.ITEM) == null)
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;

        if (!level.isClientSide) {
            BlockEntity be = level.getBlockEntity(pos);
            if (be instanceof WoodenCauldronBlockEntity cauldron) {
                FluidUtil.interactWithFluidHandler(player, hand, cauldron.getSideFluidHandler());
                cauldron.setChanged();
                level.sendBlockUpdated(pos, state, state, 3);
            }
        }
        return ItemInteractionResult.sidedSuccess(level.isClientSide);
    }
    *///?} else {
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos,
                                 Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack stack = player.getItemInHand(hand);
        if (!stack.getCapability(ForgeCapabilities.FLUID_HANDLER_ITEM).isPresent())
            return InteractionResult.PASS;

        if (!level.isClientSide) {
            BlockEntity be = level.getBlockEntity(pos);
            if (be instanceof WoodenCauldronBlockEntity cauldron) {
                FluidUtil.interactWithFluidHandler(player, hand, level, pos, null);
                cauldron.setChanged();
                level.sendBlockUpdated(pos, state, state, 3);
            }
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }
    //?}

    // ── Absorb dropped items ──────────────────────────────────────────────────

    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (level.isClientSide || !(entity instanceof ItemEntity itemEntity)) return;

        BlockEntity be = level.getBlockEntity(pos);
        if (!(be instanceof WoodenCauldronBlockEntity cauldron)) return;

        ItemStack current = itemEntity.getItem();
        ItemStack remaining = cauldron.getItemHandler().insertItem(0, current, false);

        if (remaining != current) {
            cauldron.setChanged();
            level.sendBlockUpdated(pos, state, state, 3);
            if (remaining.isEmpty()) {
                itemEntity.discard();
            } else {
                itemEntity.setItem(remaining);
            }
        }
    }

    // ── Drop item slot contents on block removal ───────────────────────────────

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean movedByPiston) {
        if (!state.is(newState.getBlock())) {
            BlockEntity be = level.getBlockEntity(pos);
            if (be instanceof WoodenCauldronBlockEntity cauldron) {
                ItemStack item = cauldron.getItemHandler().getStackInSlot(0);
                if (!item.isEmpty()) {
                    Containers.dropItemStack(level, pos.getX(), pos.getY(), pos.getZ(), item);
                }
            }
        }
        super.onRemove(state, level, pos, newState, movedByPiston);
    }
}

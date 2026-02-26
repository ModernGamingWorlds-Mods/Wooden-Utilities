package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModMenuTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
//? if forge {
import net.minecraft.world.InteractionHand;
//?}
//? if forge_1201 {
/*import net.minecraftforge.network.NetworkHooks;
*///?}

public class WoodenAnvilBlock extends Block {

    public WoodenAnvilBlock(Properties props) {
        super(props);
    }

    //? if neoforge {
    /*@Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                            Player player, BlockHitResult hit) {
        if (level.isClientSide) return InteractionResult.SUCCESS;
        ((ServerPlayer) player).openMenu(
            new SimpleMenuProvider(
                (id, inv, p) -> new WoodenAnvilMenu(id, inv, ContainerLevelAccess.create(level, pos)),
                Component.translatable("container.wooden_anvil")
            )
        );
        return InteractionResult.CONSUME;
    }
    *///?} else {
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos,
                                 Player player, InteractionHand hand, BlockHitResult hit) {
        if (level.isClientSide) return InteractionResult.SUCCESS;
        //? if forge_1201 {
        /*NetworkHooks.openScreen(
            (ServerPlayer) player,
            new SimpleMenuProvider(
                (id, inv, p) -> new WoodenAnvilMenu(id, inv, ContainerLevelAccess.create(level, pos)),
                Component.translatable("container.wooden_anvil")
            )
        );
        *///?} else {
        ((ServerPlayer) player).openMenu(
            new SimpleMenuProvider(
                (id, inv, p) -> new WoodenAnvilMenu(id, inv, ContainerLevelAccess.create(level, pos)),
                Component.translatable("container.wooden_anvil")
            )
        );
        //?}
        return InteractionResult.CONSUME;
    }
    //?}
}

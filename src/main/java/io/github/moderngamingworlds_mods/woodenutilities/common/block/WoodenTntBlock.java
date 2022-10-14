package io.github.moderngamingworlds_mods.woodenutilities.common.block;

import io.github.moderngamingworlds_mods.woodenutilities.common.config.WUCommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.Nullable;

public class WoodenTntBlock extends Block {

    public WoodenTntBlock() {
        super(Properties.copy(Blocks.TNT));
    }

    @SuppressWarnings("deprecation")
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide) {
            if (player.getItemInHand(hand).is(Items.FLINT_AND_STEEL) || player.getItemInHand(hand).is(Items.FIRE_CHARGE)) {
                this.explode(level, pos, player);
                if (player.getItemInHand(hand).is(Items.FLINT_AND_STEEL)) {
                    player.getItemInHand(hand).hurtAndBreak(1, player, (stack) -> stack.broadcastBreakEvent(hand));
                } else {
                    player.getItemInHand(hand).shrink(1);
                }
                player.awardStat(Stats.ITEM_USED.get(asItem()));
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.SUCCESS;
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onProjectileHit(Level level, BlockState state, BlockHitResult hit, Projectile projectile) {
        if (!level.isClientSide) {
            if (projectile.isOnFire() && projectile.mayInteract(level, hit.getBlockPos())) {
                this.explode(level, hit.getBlockPos(), projectile.getOwner());
                level.removeBlock(hit.getBlockPos(), false);
            }
        }
    }

    private void explode(Level level, BlockPos pos, @Nullable Entity player) {
        level.explode(null, pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D, WUCommonConfig.INSTANCE.woodenTntExplosionRadius.get().floatValue(), Explosion.BlockInteraction.BREAK);
        level.playSound(null, pos.getX(), pos.getY(), pos.getZ(), SoundEvents.TNT_PRIMED, SoundSource.BLOCKS, 1.0F, 1.0F);
        level.gameEvent(player, GameEvent.PRIME_FUSE, pos);
        level.setBlock(pos, Blocks.AIR.defaultBlockState(), 11);
    }

    @Override
    public void wasExploded(Level level, BlockPos pos, Explosion explosion) {
        if(!level.isClientSide){
            this.explode(level, pos, null);
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean dropFromExplosion(Explosion explosion) {
        return false;
    }
}

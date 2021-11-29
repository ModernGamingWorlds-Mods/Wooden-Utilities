package io.github.moderngamingworlds_mods.woodenutilities.common.block;

import com.google.common.collect.ImmutableSet;
import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.entity.WoodenFurnaceBlockEntity;
import io.github.moderngamingworlds_mods.woodenutilities.common.config.ModConfig;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModBlocks;
import io.github.noeppi_noeppi.libx.mod.registration.Registerable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.network.NetworkHooks;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class WoodenFurnaceBlock extends AbstractFurnaceBlock implements Registerable {

    private final Item item;

    public WoodenFurnaceBlock() {
        super(Properties.of(Material.WOOD).lightLevel(state -> state.getValue(LIT) ? 13 : 0));
        this.item = new BlockItem(this, new Item.Properties().tab(Objects.requireNonNull(WoodenUtilities.getInstance().tab)));
    }

    @Override
    public Set<Object> getAdditionalRegisters(ResourceLocation id) {
        return ImmutableSet.of(this.item);
    }

    @Override
    protected void openContainer(Level level, BlockPos pos, Player player) {
        if (level.getBlockEntity(pos) instanceof WoodenFurnaceBlockEntity) {
            NetworkHooks.openGui((ServerPlayer) player, (MenuProvider) level.getBlockEntity(pos));
            player.awardStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ModBlocks.WOODEN_FURNACE.create(pos, state);
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level levelIn, BlockState stateIn, BlockEntityType<T> blockEntityType) {
        return levelIn.isClientSide ? null : createTickerHelper(blockEntityType, ModBlocks.WOODEN_FURNACE, (level, pos, state, blockEntity) -> {
            AbstractFurnaceBlockEntity.serverTick(level, pos, state, blockEntity);
            WoodenFurnaceBlockEntity.catchOnFireTick(level, pos, state, (WoodenFurnaceBlockEntity) blockEntity);
        });
    }

    // [Vanilla copy] I don't why vanilla doesn't implement this on the abstract version. Maybe the sound its different but yeah.
    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, Random rand) {
        if (state.getValue(LIT)) {
            double d0 = (double) pos.getX() + 0.5D;
            double d1 = (double) pos.getY();
            double d2 = (double) pos.getZ() + 0.5D;
            if (rand.nextDouble() < 0.1D) {
                level.playLocalSound(d0, d1, d2, SoundEvents.FURNACE_FIRE_CRACKLE, SoundSource.BLOCKS, 1.0F, 1.0F, false);
            }

            Direction direction = state.getValue(FACING);
            Direction.Axis direction$axis = direction.getAxis();
            double d3 = 0.52D;
            double d4 = rand.nextDouble() * 0.6D - 0.3D;
            double d5 = direction$axis == Direction.Axis.X ? (double) direction.getStepX() * 0.52D : d4;
            double d6 = rand.nextDouble() * 6.0D / 16.0D;
            double d7 = direction$axis == Direction.Axis.Z ? (double) direction.getStepZ() * 0.52D : d4;
            level.addParticle(ParticleTypes.SMOKE, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
            level.addParticle(ParticleTypes.FLAME, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return ModConfig.catchOnFireProbability;
    }
}
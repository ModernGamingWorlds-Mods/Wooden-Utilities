package io.github.moderngamingworlds_mods.woodenutilities.common.block.entity;

import io.github.moderngamingworlds_mods.woodenutilities.common.config.ModConfig;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WoodenFurnaceBlockEntity extends AbstractFurnaceBlockEntity {

    private int catchOnFireTimer = 0;

    public WoodenFurnaceBlockEntity(BlockPos worldPosition, BlockState blockState) {
        super(ModBlocks.WOODEN_FURNACE, worldPosition, blockState, RecipeType.SMELTING);
    }

    public static void catchOnFireTick(Level level, BlockPos pos, BlockState state, WoodenFurnaceBlockEntity self) {
        if (!level.isClientSide && state.getValue(BlockStateProperties.LIT)) {
            if (self.catchOnFireTimer > 0) {
                self.catchOnFireTimer--;
            } else {
                self.catchOnFireTimer = ModConfig.WoodenFurnace.tryCatchOnFireTimeCycle;
                if (level.random.nextDouble() < ModConfig.WoodenFurnace.chanceOfCatchingFire) {
                    var availableSpots = Arrays.stream(Direction.values())
                            .filter(dir -> level.getBlockState(pos.relative(dir)).isAir()
                                    && !level.getBlockState(pos.relative(dir).below()).isAir())
                            .map(pos::relative)
                            .collect(Collectors.toList());

                    if (!availableSpots.isEmpty()) {
                        var randomPosInArea = availableSpots.size() == 1 ? availableSpots.get(0)
                                : availableSpots.get(level.random.nextInt(availableSpots.size() - 1));
                        if (level.getBlockState(randomPosInArea).isAir() && !level.getBlockState(randomPosInArea.below()).isAir())
                            level.setBlock(randomPosInArea, Blocks.FIRE.defaultBlockState(), Block.UPDATE_ALL);
                    }
                }
            }
        }
    }

    @Override
    public Component getDefaultName() {
        return new TranslatableComponent("container.wooden_furnace");
    }

    @Override
    protected AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return new FurnaceMenu(containerId, inventory, this, this.dataAccess);
    }
}

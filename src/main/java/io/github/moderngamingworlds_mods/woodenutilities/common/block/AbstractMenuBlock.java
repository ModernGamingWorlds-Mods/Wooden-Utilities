package io.github.moderngamingworlds_mods.woodenutilities.common.block;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.menu.AbstractBlockMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.function.Supplier;

public abstract class AbstractMenuBlock<C extends AbstractBlockMenu> extends Block {

    private final Supplier<MenuType<C>> menu;

    public AbstractMenuBlock(Supplier<MenuType<C>> menu, Properties properties) {
        super(properties);
        this.menu = menu;
    }

    @Nonnull
    @Override
    @SuppressWarnings("deprecation")
    public InteractionResult use(@Nonnull BlockState state, @Nonnull Level level, @Nonnull BlockPos pos, @Nonnull Player player, @Nonnull InteractionHand hand, @Nonnull BlockHitResult hit) {
        if (!level.isClientSide && player instanceof ServerPlayer sp) {
            Component title = new TranslatableComponent("screen." + WoodenUtilities.MOD_ID + "." + Objects.requireNonNull(getRegistryName()).getPath());
            AbstractBlockMenu.open(sp, this.menu.get(), title, pos);
        }
        return InteractionResult.SUCCESS;
    }
}

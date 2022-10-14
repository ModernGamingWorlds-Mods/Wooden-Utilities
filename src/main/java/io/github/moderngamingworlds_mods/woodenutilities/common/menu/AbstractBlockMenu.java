package io.github.moderngamingworlds_mods.woodenutilities.common.menu;

import io.netty.buffer.Unpooled;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;
import net.minecraftforge.network.NetworkHooks;

import javax.annotation.Nonnull;

@SuppressWarnings({ "SameParameterValue", "UnusedReturnValue" })
public abstract class AbstractBlockMenu extends AbstractContainerMenu {

    protected final Level level;
    protected final BlockPos pos;
    protected final IItemHandler playerInv;
    private final ContainerLevelAccess levelAccess;

    protected AbstractBlockMenu(MenuType<?> type, Level level, BlockPos pos, Inventory playerInv, int containerId) {
        super(type, containerId);
        this.level = level;
        this.pos = pos;
        this.playerInv = new InvWrapper(playerInv);
        this.levelAccess = ContainerLevelAccess.create(this.level, this.pos);
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(this.levelAccess, player, this.level.getBlockState(this.pos).getBlock());
    }

    protected final void layoutPlayerInventorySlots(int leftCol, int topRow) {
        this.addSlotArea(this.playerInv, 9, leftCol, topRow, 9, 3, 18, 18);
        topRow += 58;
        this.addSlotRow(this.playerInv, 0, leftCol, topRow, 9, 18);
    }

    protected final int addSlotArea(IItemHandler handler, int index, int leftCol, int topRow, int horCount, int vertCount, int dx, int dy) {
        return this.addSlotArea(handler, index, leftCol, topRow, horCount, dx, vertCount, dy, SlotItemHandler::new);
    }

    protected final int addSlotArea(IItemHandler handler, int index, int leftCol, int topRow, int horCount, int dx, int vertCount, int dy, SlotFactory slotFactory) {
        for (int i = 0; i < vertCount; i++) {
            index = this.addSlotRow(handler, index, leftCol, topRow, horCount, dx, slotFactory);
            topRow += dy;
        }
        return index;
    }

    protected final int addSlotRow(IItemHandler handler, int index, int leftCol, int topRow, int count, int dx) {
        return this.addSlotRow(handler, index, leftCol, topRow, count, dx, SlotItemHandler::new);
    }

    protected final int addSlotRow(IItemHandler handler, int index, int leftCol, int topRow, int count, int dx, SlotFactory slotFactory) {
        for (int i = 0; i < count; i++) {
            this.addSlot(slotFactory.apply(handler, index, leftCol, topRow));
            leftCol += dx;
            index++;
        }
        return index;
    }



    public static void open(ServerPlayer player, MenuType<? extends AbstractBlockMenu> menu, Component title, BlockPos pos) {
        MenuProvider provider = new MenuProvider() {

            @Nonnull
            @Override
            public Component getDisplayName() {
                return title;
            }

            @Override
            public AbstractContainerMenu createMenu(int containerId, @Nonnull Inventory inventory, @Nonnull Player player) {
                FriendlyByteBuf buffer = new FriendlyByteBuf(Unpooled.buffer());
                buffer.writeBlockPos(pos);
                return menu.create(containerId, inventory, buffer);
            }
        };
        NetworkHooks.openGui(player, provider, pos);
    }

    protected interface SlotFactory {

        Slot apply(IItemHandler inv, Integer idx, Integer x, Integer y);
    }
}

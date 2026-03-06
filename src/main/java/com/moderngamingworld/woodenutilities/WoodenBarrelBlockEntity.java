package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
//? if has_geckolib {
import software.bernie.geckolib.animatable.GeoBlockEntity;
//?}
//? if (has_geckolib && forge) {
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;
//?}
//? if (has_geckolib && neoforge) {
/*import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;
*///?}
//? if modern_nbt {
/*import net.minecraft.core.HolderLookup;
*///?}

//? if has_geckolib {
public class WoodenBarrelBlockEntity extends RandomizableContainerBlockEntity implements GeoBlockEntity {
//?} else {
/*public class WoodenBarrelBlockEntity extends RandomizableContainerBlockEntity {
*///?}

    //? if has_geckolib {
    private static final RawAnimation OPEN_ANIM  = RawAnimation.begin().thenPlay("open");
    private static final RawAnimation CLOSE_ANIM = RawAnimation.begin().thenPlay("close");

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    //?}

    private NonNullList<ItemStack> items = NonNullList.withSize(27, ItemStack.EMPTY);
    private NonNullList<ItemStack> displayItems = NonNullList.withSize(5, ItemStack.EMPTY);

    private final ContainerOpenersCounter openersCounter = new ContainerOpenersCounter() {
        @Override
        protected void onOpen(Level level, BlockPos pos, BlockState state) {
            WoodenBarrelBlockEntity.playSound(level, pos, state, SoundEvents.BARREL_OPEN);
            WoodenBarrelBlockEntity.updateBlockState(level, pos, state, true);
            WoodenBarrelBlockEntity.this.refreshDisplayItems();
            level.sendBlockUpdated(pos, level.getBlockState(pos), level.getBlockState(pos), 3);
        }

        @Override
        protected void onClose(Level level, BlockPos pos, BlockState state) {
            WoodenBarrelBlockEntity.playSound(level, pos, state, SoundEvents.BARREL_CLOSE);
            WoodenBarrelBlockEntity.updateBlockState(level, pos, state, false);
            WoodenBarrelBlockEntity.this.displayItems = NonNullList.withSize(5, ItemStack.EMPTY);
            level.sendBlockUpdated(pos, level.getBlockState(pos), level.getBlockState(pos), 3);
        }

        @Override
        protected void openerCountChanged(Level level, BlockPos pos, BlockState state, int count, int openCount) {}

        @Override
        protected boolean isOwnContainer(Player player) {
            if (player.containerMenu instanceof ChestMenu menu) {
                return menu.getContainer() == WoodenBarrelBlockEntity.this;
            }
            return false;
        }
    };

    public WoodenBarrelBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WOODEN_BARREL.get(), pos, state);
    }

    // ── GeoBlockEntity ──────────────────────────────────────────────────────

    //? if (has_geckolib && forge) {
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar registrar) {
        registrar.add(new AnimationController<>(this, "barrel_controller", 0, this::animPredicate));
    }
    //?}
    //? if (has_geckolib && neoforge) {
    /*@Override
    public void registerControllers(AnimatableManager.ControllerRegistrar registrar) {
        registrar.add(new AnimationController<>(this, "barrel_controller", this::animPredicate));
    }
    *///?}
    //? if has_geckolib {
    private PlayState animPredicate(AnimationState<WoodenBarrelBlockEntity> state) {
        if (getLevel() == null) return PlayState.STOP;
        boolean open = getBlockState().getValue(BarrelBlock.OPEN);
        state.getController().setAnimation(open ? OPEN_ANIM : CLOSE_ANIM);
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
    //?}

    // ── Container ───────────────────────────────────────────────────────────

    @Override
    public int getContainerSize() {
        return 27;
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> items) {
        this.items = items;
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.barrel");
    }

    @Override
    protected AbstractContainerMenu createMenu(int id, Inventory inventory) {
        return ChestMenu.threeRows(id, inventory, this);
    }

    //? if modern_nbt {
    /*@Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        if (!this.trySaveLootTable(tag)) {
            ContainerHelper.saveAllItems(tag, this.items, registries);
        }
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        this.items = NonNullList.withSize(27, ItemStack.EMPTY);
        if (!this.tryLoadLootTable(tag)) {
            ContainerHelper.loadAllItems(tag, this.items, registries);
        }
    }
    *///?} else {
    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        if (!this.trySaveLootTable(tag)) {
            ContainerHelper.saveAllItems(tag, this.items);
        }
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        this.items = NonNullList.withSize(27, ItemStack.EMPTY);
        if (!this.tryLoadLootTable(tag)) {
            ContainerHelper.loadAllItems(tag, this.items);
        }
    }
    //?}

    @Override
    public void startOpen(Player player) {
        if (!this.remove && !player.isSpectator()) {
            this.openersCounter.incrementOpeners(player, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }
    }

    @Override
    public void stopOpen(Player player) {
        if (!this.remove && !player.isSpectator()) {
            this.openersCounter.decrementOpeners(player, this.getLevel(), this.getBlockPos(), this.getBlockState());
        }
    }

    // ── Display items (synced on open/close only) ────────────────────────────

    private void refreshDisplayItems() {
        int idx = 0;
        for (ItemStack stack : this.items) {
            if (!stack.isEmpty()) {
                this.displayItems.set(idx, stack.copy());
                if (++idx >= 5) break;
            }
        }
        while (idx < 5) this.displayItems.set(idx++, ItemStack.EMPTY);
    }

    public NonNullList<ItemStack> getDisplayItems() {
        return this.displayItems;
    }

    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    //? if modern_nbt {
    /*@Override
    public CompoundTag getUpdateTag(net.minecraft.core.HolderLookup.Provider registries) {
        CompoundTag tag = new CompoundTag();
        ContainerHelper.saveAllItems(tag, this.displayItems, true, registries);
        return tag;
    }

    @Override
    public void handleUpdateTag(CompoundTag tag, net.minecraft.core.HolderLookup.Provider registries) {
        this.displayItems = NonNullList.withSize(5, ItemStack.EMPTY);
        ContainerHelper.loadAllItems(tag, this.displayItems, registries);
    }
    *///?} else {
    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag tag = new CompoundTag();
        ContainerHelper.saveAllItems(tag, this.displayItems, true);
        return tag;
    }

    @Override
    public void onDataPacket(net.minecraft.network.Connection connection,
                             ClientboundBlockEntityDataPacket packet) {
        CompoundTag tag = packet.getTag();
        if (tag != null) {
            this.displayItems = NonNullList.withSize(5, ItemStack.EMPTY);
            ContainerHelper.loadAllItems(tag, this.displayItems);
        }
    }
    //?}

    static void playSound(Level level, BlockPos pos, BlockState state, SoundEvent sound) {
        double dx = pos.getX() + 0.5, dy = pos.getY() + 0.5, dz = pos.getZ() + 0.5;
        level.playSound(null, dx, dy, dz, sound, SoundSource.BLOCKS, 0.5F,
                level.random.nextFloat() * 0.1F + 0.9F);
    }

    static void updateBlockState(Level level, BlockPos pos, BlockState state, boolean open) {
        level.setBlock(pos, state.setValue(BarrelBlock.OPEN, open), 3);
    }
}

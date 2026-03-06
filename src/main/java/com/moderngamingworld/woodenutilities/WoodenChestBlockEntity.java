package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
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

//? if has_geckolib {
public class WoodenChestBlockEntity extends ChestBlockEntity implements GeoBlockEntity {
//?} else {
/*public class WoodenChestBlockEntity extends ChestBlockEntity {
*///?}

    //? if has_geckolib {
    private static final RawAnimation OPEN_ANIM  = RawAnimation.begin().thenPlay("open");
    private static final RawAnimation CLOSE_ANIM = RawAnimation.begin().thenPlay("close");

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    //?}

    private boolean isOpen;

    public WoodenChestBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WOODEN_CHEST.get(), pos, state);
    }

    @Override
    public boolean triggerEvent(int id, int type) {
        if (id == 1) {
            // type is the new open viewer count — track open state for animation
            isOpen = type > 0;
        }
        return super.triggerEvent(id, type);
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    protected Component getDefaultName() {
        String path = BuiltInRegistries.BLOCK.getKey(this.getBlockState().getBlock()).getPath();
        return Component.translatable("block." + WoodenUtilities.MOD_ID + "." + path);
    }

    //? if has_geckolib {
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar registrar) {
        //? if forge {
        registrar.add(new AnimationController<>(this, "chest_controller", 0, this::animPredicate));
        //?} else {
        /*registrar.add(new AnimationController<>(this, "chest_controller", this::animPredicate));
        *///?}
    }

    private <T extends GeoBlockEntity> PlayState animPredicate(AnimationState<T> state) {
        state.getController().setAnimation(isOpen ? OPEN_ANIM : CLOSE_ANIM);
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
    //?}
}

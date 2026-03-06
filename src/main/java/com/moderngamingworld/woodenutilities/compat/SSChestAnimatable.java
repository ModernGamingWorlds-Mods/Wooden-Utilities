package com.moderngamingworld.woodenutilities.compat;

//? if (has_geckolib && forge) {
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.util.RenderUtils;

public class SSChestAnimatable implements GeoAnimatable {

    private static final RawAnimation OPEN_ANIM  = RawAnimation.begin().thenPlay("open");
    private static final RawAnimation CLOSE_ANIM = RawAnimation.begin().thenPlay("close");

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private String tier;
    private String woodKey;
    private boolean isOpen;
    private boolean isDouble;

    public SSChestAnimatable(String tier, String woodKey) {
        this.tier = tier;
        this.woodKey = woodKey;
    }

    public String getTier()          { return tier; }
    public void   setTier(String t)  { this.tier = t; }
    public String getWoodKey()            { return woodKey; }
    public void   setWoodKey(String w)    { this.woodKey = w; }
    public boolean isOpen()               { return isOpen; }
    public void    setOpen(boolean open)  { this.isOpen = open; }
    public boolean isDouble()             { return isDouble; }
    public void    setDouble(boolean d)   { this.isDouble = d; }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar registrar) {
        registrar.add(new AnimationController<>(this, "ss_chest_controller", 0, this::animPredicate));
    }

    private PlayState animPredicate(AnimationState<SSChestAnimatable> state) {
        state.getController().setAnimation(isOpen ? OPEN_ANIM : CLOSE_ANIM);
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public double getTick(Object o) {
        return RenderUtils.getCurrentTick();
    }
}
//?}
//? if (has_geckolib && neoforge) {
/*import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.util.RenderUtil;

public class SSChestAnimatable implements GeoAnimatable {

    private static final RawAnimation OPEN_ANIM  = RawAnimation.begin().thenPlay("open");
    private static final RawAnimation CLOSE_ANIM = RawAnimation.begin().thenPlay("close");

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private String tier;
    private String woodKey;
    private boolean isOpen;
    private boolean isDouble;

    public SSChestAnimatable(String tier, String woodKey) {
        this.tier = tier;
        this.woodKey = woodKey;
    }

    public String getTier()          { return tier; }
    public void   setTier(String t)  { this.tier = t; }
    public String getWoodKey()            { return woodKey; }
    public void   setWoodKey(String w)    { this.woodKey = w; }
    public boolean isOpen()               { return isOpen; }
    public void    setOpen(boolean open)  { this.isOpen = open; }
    public boolean isDouble()             { return isDouble; }
    public void    setDouble(boolean d)   { this.isDouble = d; }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar registrar) {
        registrar.add(new AnimationController<>(this, "ss_chest_controller", this::animPredicate));
    }

    private PlayState animPredicate(AnimationState<SSChestAnimatable> state) {
        state.getController().setAnimation(isOpen ? OPEN_ANIM : CLOSE_ANIM);
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public double getTick(Object o) {
        return RenderUtil.getCurrentTick();
    }
}
*///?}

package com.moderngamingworld.woodenutilities;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
//? if (has_geckolib && forge) {
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import java.util.function.Consumer;
//?}
//? if (has_geckolib && neoforge) {
/*import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.renderer.GeoItemRenderer;
import java.util.function.Consumer;
*///?}

//? if (has_geckolib && forge) {
public class WoodenChestBlockItem extends BlockItem implements GeoItem {

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public WoodenChestBlockItem(Block block, Item.Properties properties) {
        super(block, properties);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar registrar) {}

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private WoodenChestItemRenderer renderer;

            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                if (this.renderer == null) this.renderer = new WoodenChestItemRenderer();
                return this.renderer;
            }
        });
    }
}
//?}
//? if (has_geckolib && neoforge) {
/*public class WoodenChestBlockItem extends BlockItem implements GeoItem {

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public WoodenChestBlockItem(Block block, Item.Properties properties) {
        super(block, properties);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar registrar) {}

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private WoodenChestItemRenderer renderer;

            @Override
            public GeoItemRenderer<?> getGeoItemRenderer() {
                if (this.renderer == null) this.renderer = new WoodenChestItemRenderer();
                return this.renderer;
            }
        });
    }
}
*///?}
//? if !has_geckolib {
/*public class WoodenChestBlockItem extends BlockItem {

    public WoodenChestBlockItem(Block block, Item.Properties properties) {
        super(block, properties);
    }
}
*///?}

package com.moderngamingworld.woodenutilities;

import com.moderngamingworld.woodenutilities.registry.ModBlockEntities;
import com.moderngamingworld.woodenutilities.registry.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.level.material.Fluids;
//? if neoforge {
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.fluids.FluidStack;
//?} else {
/*import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.fluids.FluidStack;
*///?}

//? if neoforge {
@EventBusSubscriber(modid = WoodenUtilities.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
//?} else {
/*@Mod.EventBusSubscriber(modid = WoodenUtilities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
*///?}
public class ClientEvents {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.WOODEN_CAULDRON.get(), WoodenCauldronRenderer::new);
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            //? if neoforge {
            ResourceLocation fluidTypeProp = ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID, "fluid_type");
            //?} else {
            /*ResourceLocation fluidTypeProp = new ResourceLocation(WoodenUtilities.MOD_ID, "fluid_type");
            *///?}
            net.minecraft.client.renderer.item.ClampedItemPropertyFunction fluidFunc =
                (stack, level, entity, seed) -> {
                    FluidStack fluid = WoodenBucketItem.getFluid(stack);
                    if (fluid.isEmpty()) return 0f;
                    if (fluid.getFluid() == Fluids.WATER) return 0.5f;
                    if (fluid.getFluid() == Fluids.LAVA)  return 1.0f;
                    return 0f;
                };
            ItemProperties.register(ModItems.WOODEN_BUCKET.get(),             fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.OAK_WOODEN_BUCKET.get(),         fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.SPRUCE_WOODEN_BUCKET.get(),      fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.BIRCH_WOODEN_BUCKET.get(),       fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.JUNGLE_WOODEN_BUCKET.get(),      fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.ACACIA_WOODEN_BUCKET.get(),      fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.DARK_OAK_WOODEN_BUCKET.get(),    fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.MANGROVE_WOODEN_BUCKET.get(),    fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.CHERRY_WOODEN_BUCKET.get(),      fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.BAMBOO_WOODEN_BUCKET.get(),      fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.CRIMSON_WOODEN_BUCKET.get(),     fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.WARPED_WOODEN_BUCKET.get(),      fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.TWILIGHT_OAK_WOODEN_BUCKET.get(),      fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.CANOPY_WOODEN_BUCKET.get(),            fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.TWILIGHT_MANGROVE_WOODEN_BUCKET.get(), fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.DARK_WOODEN_BUCKET.get(),        fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.TIME_WOODEN_BUCKET.get(),        fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.MINING_WOODEN_BUCKET.get(),      fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.SORTING_WOODEN_BUCKET.get(),     fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.TOWERWOOD_WOODEN_BUCKET.get(),   fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.FIR_WOODEN_BUCKET.get(),         fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.PINE_WOODEN_BUCKET.get(),        fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.MAPLE_WOODEN_BUCKET.get(),       fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.REDWOOD_WOODEN_BUCKET.get(),     fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.MAHOGANY_WOODEN_BUCKET.get(),    fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.JACARANDA_WOODEN_BUCKET.get(),   fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.PALM_WOODEN_BUCKET.get(),        fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.WILLOW_WOODEN_BUCKET.get(),      fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.DEAD_WOODEN_BUCKET.get(),        fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.MAGIC_WOODEN_BUCKET.get(),       fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.UMBRAN_WOODEN_BUCKET.get(),      fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.HELLBARK_WOODEN_BUCKET.get(),    fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.EMPYREAL_WOODEN_BUCKET.get(),    fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.ROSEROOT_WOODEN_BUCKET.get(),    fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.YAGROOT_WOODEN_BUCKET.get(),     fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.CRUDEROOT_WOODEN_BUCKET.get(),   fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.CONBERRY_WOODEN_BUCKET.get(),    fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.SUNROOT_WOODEN_BUCKET.get(),     fluidTypeProp, fluidFunc);
            ItemProperties.register(ModItems.SKYROOT_WOODEN_BUCKET.get(),     fluidTypeProp, fluidFunc);
        });
    }
}

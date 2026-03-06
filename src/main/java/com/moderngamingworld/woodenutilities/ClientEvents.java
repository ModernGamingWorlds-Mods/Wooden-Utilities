package com.moderngamingworld.woodenutilities;

//? if has_geckolib {
import com.moderngamingworld.woodenutilities.compat.SophisticatedStorageCompat;
//?}
import com.moderngamingworld.woodenutilities.registry.ModBlockEntities;
import com.moderngamingworld.woodenutilities.registry.ModBlocks;
import com.moderngamingworld.woodenutilities.registry.ModItems;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.FoliageColor;
//? if neoforge {
/*import net.neoforged.fml.ModList;
*///?} else {
import net.minecraftforge.fml.ModList;
//?}
//? if has_item_props {
import net.minecraft.client.renderer.item.ItemProperties;
//?}
import net.minecraft.world.level.material.Fluids;
//? if neoforge {
/*import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.fluids.FluidStack;
*///?} else {
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.fluids.FluidStack;
//?}

//? if neoforge {
/*@EventBusSubscriber(modid = WoodenUtilities.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
*///?} else {
@Mod.EventBusSubscriber(modid = WoodenUtilities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
//?}
public class ClientEvents {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.WOODEN_CAULDRON.get(), WoodenCauldronRenderer::new);
        //? if has_geckolib {
        event.registerBlockEntityRenderer(ModBlockEntities.WOODEN_BARREL.get(), WoodenBarrelRenderer::new);
        if (ModList.get().isLoaded(SophisticatedStorageCompat.SS_MOD_ID)) {
            SophisticatedStorageCompat.registerRenderers(event);
        }
        //?}
    }

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        event.register(
            (state, level, pos, tintIndex) -> level != null && pos != null
                ? BiomeColors.getAverageFoliageColor(level, pos)
                : FoliageColor.getDefaultColor(),
            ModBlocks.AFRICAN_BLACKWOOD_LEAVES.get(),
            ModBlocks.BANYAN_LEAVES.get(),
            ModBlocks.BLACK_WALNUT_LEAVES.get(),
            ModBlocks.BLOODWOOD_LEAVES.get(),
            ModBlocks.BRISTLECONE_PINE_LEAVES.get(),
            ModBlocks.CORK_OAK_LEAVES.get(),
            ModBlocks.DRAGON_BLOOD_LEAVES.get(),
            ModBlocks.KAPOK_LEAVES.get(),
            ModBlocks.LARCH_LEAVES.get(),
            ModBlocks.SANDALWOOD_LEAVES.get(),
            ModBlocks.SYCAMORE_LEAVES.get(),
            ModBlocks.TEAK_LEAVES.get(),
            ModBlocks.WENGE_LEAVES.get(),
            ModBlocks.ZEBRAWOOD_LEAVES.get()
        );
    }

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.register(
            (stack, tintIndex) -> FoliageColor.getDefaultColor(),
            ModItems.AFRICAN_BLACKWOOD_LEAVES.get(),
            ModItems.BANYAN_LEAVES.get(),
            ModItems.BLACK_WALNUT_LEAVES.get(),
            ModItems.BLOODWOOD_LEAVES.get(),
            ModItems.BRISTLECONE_PINE_LEAVES.get(),
            ModItems.CORK_OAK_LEAVES.get(),
            ModItems.DRAGON_BLOOD_LEAVES.get(),
            ModItems.KAPOK_LEAVES.get(),
            ModItems.LARCH_LEAVES.get(),
            ModItems.SANDALWOOD_LEAVES.get(),
            ModItems.SYCAMORE_LEAVES.get(),
            ModItems.TEAK_LEAVES.get(),
            ModItems.WENGE_LEAVES.get(),
            ModItems.ZEBRAWOOD_LEAVES.get()
        );
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        //? if has_item_props {
        event.enqueueWork(() -> {
            //? if neoforge {
            /*ResourceLocation fluidTypeProp = ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID, "fluid_type");
            *///?} else {
            ResourceLocation fluidTypeProp = ResourceLocation.fromNamespaceAndPath(WoodenUtilities.MOD_ID, "fluid_type");
            //?}
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
        //?}
    }
}

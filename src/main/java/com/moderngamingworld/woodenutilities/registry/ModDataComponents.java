package com.moderngamingworld.woodenutilities.registry;

import com.moderngamingworld.woodenutilities.WoodenUtilities;
//? if neoforge {
/*import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
*///?} else {
import net.minecraftforge.eventbus.api.IEventBus;
//?}

public final class ModDataComponents {

    //? if neoforge {
    /*public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENTS =
        DeferredRegister.create(Registries.DATA_COMPONENT_TYPE, WoodenUtilities.MOD_ID);

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<FluidStack>> BUCKET_FLUID =
        DATA_COMPONENTS.register("bucket_fluid", () ->
            DataComponentType.<FluidStack>builder()
                .persistent(FluidStack.CODEC)
                .networkSynchronized(FluidStack.STREAM_CODEC)
                .build());
    *///?}

    private ModDataComponents() {}

    public static void register(IEventBus eventBus) {
        //? if neoforge {
        /*DATA_COMPONENTS.register(eventBus);
        *///?}
        // Forge 1.20.1: no DataComponents — fluid storage uses NBT instead.
    }
}

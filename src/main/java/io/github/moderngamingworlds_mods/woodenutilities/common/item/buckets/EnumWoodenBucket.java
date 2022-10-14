package io.github.moderngamingworlds_mods.woodenutilities.common.item.buckets;

import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;

import java.util.*;
import java.util.function.Supplier;

public enum EnumWoodenBucket {

    EMPTY(() -> Fluids.EMPTY, ModItems.WOODEN_BUCKET),
    LAVA (() -> Fluids.LAVA, ModItems.LAVA_WOODEN_BUCKET),
    WATER(() -> Fluids.WATER, ModItems.WATER_WOODEN_BUCKET);

    private static final Map<Fluid, EnumWoodenBucket> BY_FLUID = new IdentityHashMap<>();

    private final Supplier<Fluid> withFluid;
    private final Supplier<Item> item;

    EnumWoodenBucket(Supplier<Fluid> withFluid, Supplier<Item> item) {
        this.withFluid = withFluid;
        this.item = item;
    }

    public static ItemStack getBucket(Fluid fluid) {
        return Optional.ofNullable(BY_FLUID.get(fluid))
                .map(bucket -> new ItemStack(bucket.getItem()))
                .orElseThrow(RuntimeException::new);
    }

    public Item getItem() {
        return item.get();
    }

    public Fluid getFluid() {
        return this.withFluid.get();
    }



    public static void setup() {
        for (EnumWoodenBucket bucket : values()) {
            BY_FLUID.put(bucket.getFluid(), bucket);
        }
    }
}

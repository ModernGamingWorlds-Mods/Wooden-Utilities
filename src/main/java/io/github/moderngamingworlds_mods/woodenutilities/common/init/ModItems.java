package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.common.item.BaseItem;
import io.github.moderngamingworlds_mods.woodenutilities.common.item.WoodenShearsItem;
import io.github.moderngamingworlds_mods.woodenutilities.common.item.buckets.WoodenBucketItem;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;

@RegisterClass
public class ModItems {

    public static final Item oakPlate = new BaseItem();
    public static final Item birchPlate = new BaseItem();
    public static final Item junglePlate = new BaseItem();
    public static final Item acaciaPlate = new BaseItem();
    public static final Item darkOakPlate = new BaseItem();
    public static final Item sprucePlate = new BaseItem();
    public static final Item crimsonPlate = new BaseItem();
    public static final Item warpedPlate = new BaseItem();

    public static final Item woodenShears = new WoodenShearsItem();
    public static final Item woodenDiamond = new BaseItem();

    public static final Item woodenBucket = new WoodenBucketItem(() -> Fluids.EMPTY);
    public static final Item waterWoodenBucket = new WoodenBucketItem(() -> Fluids.WATER);
    public static final Item lavaWoodenBucket = new WoodenBucketItem(() -> Fluids.LAVA);
}

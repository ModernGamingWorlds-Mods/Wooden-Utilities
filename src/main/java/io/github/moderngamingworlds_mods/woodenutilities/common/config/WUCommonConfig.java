package io.github.moderngamingworlds_mods.woodenutilities.common.config;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public final class WUCommonConfig {

    public static final ForgeConfigSpec SPEC;
    public static final WUCommonConfig INSTANCE;

    public final ForgeConfigSpec.DoubleValue miningFatigueChance;
    public final ForgeConfigSpec.DoubleValue woodenTntExplosionRadius;
    public final ForgeConfigSpec.IntValue catchOnFireProbability;

    public final ForgeConfigSpec.IntValue bucketDestroyTime;
    public final ForgeConfigSpec.IntValue bucketMaxTemperature;

    public final ForgeConfigSpec.DoubleValue furnaceChanceOfCatchingFire;
    public final ForgeConfigSpec.IntValue furnaceTryCatchOnFireInterval;

    public WUCommonConfig(ForgeConfigSpec.Builder builder) {
        builder.push("general");

        miningFatigueChance = builder
                .comment("Chance to get mining fatigue when breaking logs with empty hand")
                .translation(i18nKey("miningFatigueChance"))
                .defineInRange("miningFatigueChance", .2D, 0D, 1D);

        woodenTntExplosionRadius = builder
                .comment("Wooden TNT explosion radius")
                .translation(i18nKey("woodenTntExplosionRadius"))
                .defineInRange("woodenTntExplosionRadius", 1D, .5D, 20D);

        catchOnFireProbability = builder
                .comment("Probability of catching on fire")
                .translation(i18nKey("catchOnFireProbability"))
                .defineInRange("catchOnFireProbability", 30, 0, Integer.MAX_VALUE);

        {
            builder.push("WoodenBucket");

            bucketDestroyTime = builder
                    .comment("The time in ticks that the Wooden Bucket will take to burn up when holding a hot fluid")
                    .translation(i18nKey("bucket.destroyTime"))
                    .defineInRange("destroyTime", 50, -1, 2400);

            bucketMaxTemperature = builder
                    .comment("The max fluid temperature the Wooden Bucket can hold before burning up")
                    .translation(i18nKey("bucket.maxTemperature"))
                    .defineInRange("maxTemperature", 1300, 0, Integer.MAX_VALUE);

            builder.pop();
        }

        {
            builder.push("WoodenFurnace");

            furnaceChanceOfCatchingFire = builder
                    .comment("The chance of the furnace catching fire")
                    .translation(i18nKey("furnace.chanceOfCatchingFire"))
                    .defineInRange("chanceOfCatchingOnFire", .5, .1, 1D);

            furnaceTryCatchOnFireInterval = builder
                    .comment("Time in ticks between attempts to catch on fire")
                    .translation(i18nKey("furnace.tryCatchOnFireInterval"))
                    .defineInRange("tryCatchOnFireInterval", 100, 0, Integer.MAX_VALUE);

            builder.pop();
        }

        builder.pop();
    }

    private static String i18nKey(String configKey) {
        return "config." + WoodenUtilities.MOD_ID + "." + configKey;
    }

    static {
        final Pair<WUCommonConfig, ForgeConfigSpec> configSpecPair = new ForgeConfigSpec.Builder().configure(WUCommonConfig::new);
        SPEC = configSpecPair.getRight();
        INSTANCE = configSpecPair.getLeft();
    }
}

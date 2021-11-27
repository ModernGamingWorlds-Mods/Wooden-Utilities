package io.github.moderngamingworlds_mods.woodenutilities.common.config;

import io.github.noeppi_noeppi.libx.annotation.config.RegisterConfig;
import io.github.noeppi_noeppi.libx.config.Config;
import io.github.noeppi_noeppi.libx.config.Group;

@RegisterConfig
public class ModConfig {

    @Config("Chance to get mining fatigue when breaking logs with empty hand.")
    public static double miningFatigueChance = 0.2;

    @Config("Wooden TNT explosion radius")
    public static float woodenTntExplosionRadius = 1f;

    @Group
    public static class WoodenBucket {

        @Config("The time in ticks that the Wooden Bucket will take to self burn when picking a hot fluid.")
        public static int destroyTime = 50;

        @Config("The max temperature that the Wooden Bucket can hold until burns itself.")
        public static int maxTemperature = 1300;

        @Config("Number of seconds that the player will be set on fire when the bucket burn itself.")
        public static int fireTime = 5;
    }
}

package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.config.WUCommonConfig;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WoodenUtilities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEvents {

    @SubscribeEvent
    public static void onBreakBlock(BlockEvent.BreakEvent event) {
        if (!event.getWorld().isClientSide()) {
            if (event.getPlayer().getMainHandItem() == ItemStack.EMPTY) {
                if (event.getState().is(BlockTags.LOGS)) {
                    if (event.getWorld().getRandom().nextDouble() <= WUCommonConfig.INSTANCE.miningFatigueChance.get()) {
                        event.getPlayer().addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 2000, 2));
                    }
                }
            }
        }
    }
}

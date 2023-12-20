package io.github.moderngamingworlds_mods;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public record WoodenUtilitiesTabs() {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            WoodenUtilities.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EGGS_TAB = TABS.register("eggs",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup." + WoodenUtilities.MOD_ID + ".eggs")).icon(
                    () -> new ItemStack(NeoDoomItems.IMP_SPAWN_EGG.get())).displayItems((enabledFeatures, entries) -> {
            }).build());
}
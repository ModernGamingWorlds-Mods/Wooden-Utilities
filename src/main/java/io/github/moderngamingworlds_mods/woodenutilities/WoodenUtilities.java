package io.github.moderngamingworlds_mods.woodenutilities;

import io.github.moderngamingworlds_mods.woodenutilities.common.config.WUCommonConfig;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.*;
import io.github.moderngamingworlds_mods.woodenutilities.common.item.buckets.EnumWoodenBucket;
import io.github.moderngamingworlds_mods.woodenutilities.common.util.WoodTypeCondition;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.Nonnull;

@Mod(WoodenUtilities.MOD_ID)
public final class WoodenUtilities {

    public static final String MOD_ID = "woodenutilities";
    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab("woodenutilities") {
        @Nonnull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PLATES.getRaw(ModWoodType.MC_OAK));
        }
    };

    public WoodenUtilities() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.init(bus);
        ModItems.init(bus);
        ModRecipes.init(bus);
        ModMenus.init(bus);

        bus.register(WoodenUtilities.class);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, WUCommonConfig.SPEC);
    }

    @SubscribeEvent
    public static void registerRecipeSerializers(RegistryEvent.Register<RecipeSerializer<?>> event) {
        //Abuse serializer registry event because common setup does not fire in datagen
        CraftingHelper.register(new WoodTypeCondition.Serializer());
    }

    @SubscribeEvent
    public static void setup(FMLCommonSetupEvent event) {
        EnumWoodenBucket.setup();
    }
}

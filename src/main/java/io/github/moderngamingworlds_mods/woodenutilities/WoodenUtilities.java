package io.github.moderngamingworlds_mods.woodenutilities;

import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModItems;
import io.github.moderngamingworlds_mods.woodenutilities.common.tests.BucketTests;
import io.github.noeppi_noeppi.libx.mod.registration.ModXRegistration;
import io.github.noeppi_noeppi.libx.mod.registration.RegistrationBuilder;
import net.minecraft.gametest.framework.GameTestRegistry;
import net.minecraft.gametest.framework.TestCommand;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLanguageProvider;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmlserverevents.FMLServerStartedEvent;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;

import javax.annotation.Nonnull;

@Mod(WoodenUtilities.MOD_ID)
public final class WoodenUtilities extends ModXRegistration {

    public static final String MOD_ID = "woodenutilities";

    private static WoodenUtilities instance;

    public WoodenUtilities() {
        super(new CreativeModeTab(MOD_ID) {
            @Nonnull
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModItems.oakPlate);
            }
        });
        instance = this;
    }

    @Override
    protected void setup(FMLCommonSetupEvent event) {
    }

    @Override
    protected void clientSetup(FMLClientSetupEvent event) {

    }

    @Override
    protected void initRegistration(RegistrationBuilder builder) {
        builder.setVersion(1);
    }

    public static WoodenUtilities getInstance() {
        return instance;
    }
}

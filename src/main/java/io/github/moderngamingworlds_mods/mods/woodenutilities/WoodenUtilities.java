package io.github.moderngamingworlds_mods.mods.woodenutilities;

import io.github.moderngamingworlds_mods.mods.woodenutilities.common.init.ModItems;
import io.github.noeppi_noeppi.libx.mod.registration.ModXRegistration;
import io.github.noeppi_noeppi.libx.mod.registration.RegistrationBuilder;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import javax.annotation.Nonnull;

@Mod("woodenutilities")
public class WoodenUtilities extends ModXRegistration {

    private static WoodenUtilities instance;

    public WoodenUtilities() {
        super("woodenutilities", new CreativeModeTab("woodenutilities") {
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

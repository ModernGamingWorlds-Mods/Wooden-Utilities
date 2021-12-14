package io.github.moderngamingworlds_mods.woodenutilities;

import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModBlocks;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModItems;
import io.github.noeppi_noeppi.libx.mod.registration.ModXRegistration;
import io.github.noeppi_noeppi.libx.mod.registration.RegistrationBuilder;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import javax.annotation.Nonnull;

@Mod("woodenutilities")
public final class WoodenUtilities extends ModXRegistration {

    private static WoodenUtilities instance;

    public WoodenUtilities() {
        super(new CreativeModeTab("woodenutilities") {
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
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.woodcutter, RenderType.translucent());
    }

    @Override
    protected void initRegistration(RegistrationBuilder builder) {
        builder.setVersion(1);
    }

    public static WoodenUtilities getInstance() {
        return instance;
    }
}

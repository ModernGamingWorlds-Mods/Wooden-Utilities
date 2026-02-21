package com.moderngamingworld.woodenutilities;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.ItemCombinerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WoodenAnvilScreen extends ItemCombinerScreen<WoodenAnvilMenu> {

    private static final ResourceLocation TEXTURE =
        new ResourceLocation("minecraft", "textures/gui/container/anvil.png");

    public WoodenAnvilScreen(WoodenAnvilMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title, TEXTURE);
    }

    @Override
    protected void subInit() {}

    @Override
    protected void renderErrorIcon(GuiGraphics guiGraphics, int x, int y) {}

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {
        guiGraphics.blit(TEXTURE, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
        // Intentionally omit nameEdit.render() — no rename field needed
    }
}

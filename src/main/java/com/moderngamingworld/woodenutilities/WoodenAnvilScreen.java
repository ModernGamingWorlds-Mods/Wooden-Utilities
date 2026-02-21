package com.moderngamingworld.woodenutilities;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WoodenAnvilScreen extends AbstractContainerScreen<WoodenAnvilMenu> {

    private static final ResourceLocation TEXTURE =
        new ResourceLocation("minecraft", "textures/gui/container/anvil.png");

    public WoodenAnvilScreen(WoodenAnvilMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        this.imageWidth = 176;
        this.imageHeight = 166;
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {
        guiGraphics.blit(TEXTURE, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
        // The vanilla anvil texture has a red rectangle baked in for the name field.
        // Fill it with the standard GUI background colour so it blends away.
        guiGraphics.fill(this.leftPos + 59, this.topPos + 20,
                         this.leftPos + 169, this.topPos + 36,
                         0xFFC6C6C6);
    }
}

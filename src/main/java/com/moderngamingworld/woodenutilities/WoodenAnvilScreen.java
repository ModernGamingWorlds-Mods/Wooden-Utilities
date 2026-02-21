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
    protected void subInit() {
        // No name field needed
    }

    @Override
    protected void renderErrorIcon(GuiGraphics guiGraphics, int x, int y) {
        // No error icon needed
    }
}

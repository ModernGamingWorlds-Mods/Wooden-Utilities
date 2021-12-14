package io.github.moderngamingworlds_mods.woodenutilities.client.screen;

import com.google.common.base.Preconditions;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.menu.WoodCutterMenu;
import io.github.moderngamingworlds_mods.woodenutilities.common.recipes.WoodcutterRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Inventory;

import java.util.List;

public class WoodCutterScreen extends AbstractContainerScreen<WoodCutterMenu> {

    private static final ResourceLocation BACK = new ResourceLocation(WoodenUtilities.getInstance().modid, "textures/gui/woodcutter.png");

    private float scrollOffs;
    private boolean scrolling;
    private int startIndex;
    private boolean displayRecipes;

    public WoodCutterScreen(WoodCutterMenu woodenCutterMenu, Inventory inventory, Component component) {
        super(woodenCutterMenu, inventory, component);
        woodenCutterMenu.registerUpdateListener(this::containerChanged);
        --this.titleLabelY;
    }

    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float partialTicks) {
        super.render(poseStack, mouseX, mouseY, partialTicks);
        this.renderTooltip(poseStack, mouseX, mouseY);
    }

    @Override
    protected void renderBg(PoseStack poseStack, float partialTicks, int mouseX, int mouseY) {
        this.renderBackground(poseStack);
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, BACK);
        this.blit(poseStack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
        int scrollbarBtnY = (int) (41.0F * this.scrollOffs);
        this.blit(poseStack, this.leftPos + 119, this.topPos + 15 + scrollbarBtnY, 176 + (this.isScrollBarActive() ? 0 : 12), 0, 12, 15);
        int x = this.leftPos + 52;
        int y = this.topPos + 14;
        int lastVisibleElementIndex = this.startIndex + 12;
        this.renderButtons(poseStack, mouseX, mouseY, x, y, lastVisibleElementIndex);
        this.renderRecipes(x, y, lastVisibleElementIndex);
    }

    @Override
    protected void renderTooltip(PoseStack poseStack, int mouseX, int mouseY) {
        super.renderTooltip(poseStack, mouseX, mouseY);
        if (this.displayRecipes) {
            int x = this.leftPos + 52;
            int y = this.topPos + 14;
            int k = this.startIndex + 12;
            List<WoodcutterRecipe> list = this.menu.getRecipes();

            for (int l = this.startIndex; l < k && l < this.menu.getNumRecipes(); ++l) {
                int recipeStart = l - this.startIndex;
                int recipeXEnd = x + recipeStart % 4 * 16;
                int recipeYEnd = y + recipeStart / 4 * 18 + 2;
                if (mouseX >= recipeXEnd && mouseX < recipeXEnd + 16 && mouseY >= recipeYEnd && mouseY < recipeYEnd + 18) {
                    this.renderTooltip(poseStack, list.get(l).getResultItem(), mouseX, mouseY);
                }
            }
        }

    }

    private void renderButtons(PoseStack poseStack, int mouseX, int mouseY, int x, int y, int lastVisibleElementIndex) {
        for (int i = this.startIndex; i < lastVisibleElementIndex && i < this.menu.getNumRecipes(); ++i) {
            int recipeIndex = i - this.startIndex;
            int xStart = x + recipeIndex % 4 * 16;
            int l = recipeIndex / 4;
            int yStart = y + l * 18 + 2;
            int height = this.imageHeight;
            if (i == this.menu.getSelectedRecipeIndex()) {
                height += 18;
            } else if (mouseX >= xStart && mouseY >= yStart && mouseX < xStart + 16 && mouseY < yStart + 18) {
                height += 36;
            }

            this.blit(poseStack, xStart, yStart - 1, 0, height, 16, 18);
        }

    }

    private void renderRecipes(int x, int y, int recipeIndexOffsetMax) {
        Preconditions.checkNotNull(this.minecraft);
        List<WoodcutterRecipe> list = this.menu.getRecipes();

        for (int i = this.startIndex; i < recipeIndexOffsetMax && i < this.menu.getNumRecipes(); ++i) {
            int recipeStart = i - this.startIndex;
            int xStart = x + recipeStart % 4 * 16;
            int l = recipeStart / 4;
            int yStart = y + l * 18 + 2;
            this.minecraft.getItemRenderer().renderAndDecorateItem(list.get(i).getResultItem(), xStart, yStart);
        }

    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int buttonCode) {
        Preconditions.checkNotNull(this.minecraft);
        Preconditions.checkNotNull(this.minecraft.gameMode);
        Preconditions.checkNotNull(this.minecraft.player);
        this.scrolling = false;
        if (this.displayRecipes) {
            int xStart = this.leftPos + 52;
            int yStart = this.topPos + 14;
            int index = this.startIndex + 12;

            for (int l = this.startIndex; l < index; ++l) {
                int recipeIndex = l - this.startIndex;
                double deltaX = mouseX - (double) (xStart + recipeIndex % 4 * 16);
                double deltaY = mouseY - (double) (yStart + recipeIndex / 4 * 18);
                if (deltaX >= 0.0D && deltaY >= 0.0D && deltaX < 16.0D && deltaY < 18.0D && this.menu.clickMenuButton(this.minecraft.player, l)) {
                    Minecraft.getInstance().getSoundManager().play(SimpleSoundInstance.forUI(SoundEvents.UI_STONECUTTER_SELECT_RECIPE, 1.0F));
                    this.minecraft.gameMode.handleInventoryButtonClick((this.menu).containerId, l);
                    return true;
                }
            }

            xStart = this.leftPos + 119;
            yStart = this.topPos + 9;
            if (mouseX >= (double) xStart && mouseX < (double) (xStart + 12) && mouseY >= (double) yStart && mouseY < (double) (yStart + 54)) {
                this.scrolling = true;
            }
        }

        return super.mouseClicked(mouseX, mouseY, buttonCode);
    }

    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int buttonCode, double dragX, double dragY) {
        if (this.scrolling && this.isScrollBarActive()) {
            int yStart = this.topPos + 14;
            int y = yStart + 54;
            this.scrollOffs = ((float) mouseY - (float) yStart - 7.5F) / ((float) (y - yStart) - 15.0F);
            this.scrollOffs = Mth.clamp(this.scrollOffs, 0.0F, 1.0F);
            this.startIndex = (int) ((double) (this.scrollOffs * (float) this.getOffscreenRows()) + 0.5D) * 4;
            return true;
        } else {
            return super.mouseDragged(mouseX, mouseY, buttonCode, dragX, dragY);
        }
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double delta) {
        if (this.isScrollBarActive()) {
            int i = this.getOffscreenRows();
            this.scrollOffs = (float) ((double) this.scrollOffs - delta / (double) i);
            this.scrollOffs = Mth.clamp(this.scrollOffs, 0.0F, 1.0F);
            this.startIndex = (int) ((double) (this.scrollOffs * (float) i) + 0.5D) * 4;
        }

        return true;
    }

    private boolean isScrollBarActive() {
        return this.displayRecipes && this.menu.getNumRecipes() > 12;
    }

    protected int getOffscreenRows() {
        return (this.menu.getNumRecipes() + 4 - 1) / 4 - 3;
    }

    private void containerChanged() {
        this.displayRecipes = this.menu.hasInputItem();
        if (!this.displayRecipes) {
            this.scrollOffs = 0.0F;
            this.startIndex = 0;
        }
    }
}

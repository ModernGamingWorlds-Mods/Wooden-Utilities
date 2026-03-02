package com.moderngamingworld.woodenutilities;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.joml.Matrix4f;
//? if neoforge {
/*import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidStack;
*///?} else {
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.fluids.FluidStack;
//?}

public class WoodenCauldronRenderer implements BlockEntityRenderer<WoodenCauldronBlockEntity> {

    public WoodenCauldronRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public void render(WoodenCauldronBlockEntity be, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        renderFluid(be, poseStack, bufferSource, packedLight, packedOverlay);
        renderItem(be, poseStack, bufferSource, packedLight, packedOverlay);
        renderFilter(be, poseStack, bufferSource, packedLight, packedOverlay);
    }

    private void renderFluid(WoodenCauldronBlockEntity be, PoseStack poseStack,
                              MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        FluidStack fluidA = be.getTankA().getFluid();
        if (fluidA.isEmpty()) return;

        IClientFluidTypeExtensions ext = IClientFluidTypeExtensions.of(fluidA.getFluid());
        ResourceLocation stillTexture = ext.getStillTexture();
        if (stillTexture == null) return;

        TextureAtlasSprite sprite = Minecraft.getInstance()
                .getTextureAtlas(InventoryMenu.BLOCK_ATLAS)
                .apply(stillTexture);

        int color = ext.getTintColor();
        float a = ((color >> 24) & 0xFF) / 255f;
        float r = ((color >> 16) & 0xFF) / 255f;
        float g = ((color >> 8) & 0xFF) / 255f;
        float b = (color & 0xFF) / 255f;
        if (a < 0.01f) a = 1f;

        float fillFraction = Math.min(1f, (float) fluidA.getAmount() / be.getTankA().getCapacity());
        // Cauldron interior: floor at 4/16, usable height up to ~11/16
        float floorY = 4f / 16f;
        float ceilY  = 11f / 16f;
        float fluidY = floorY + (ceilY - floorY) * fillFraction;

        // Inset 2px from cauldron walls, with tiny epsilon to avoid z-fighting
        float x1 = 2f / 16f + 0.001f;
        float x2 = 14f / 16f - 0.001f;
        float z1 = 2f / 16f + 0.001f;
        float z2 = 14f / 16f - 0.001f;

        float u0 = sprite.getU0();
        float u1 = sprite.getU1();
        float v0 = sprite.getV0();
        float v1 = sprite.getV1();

        Matrix4f pose = poseStack.last().pose();

        VertexConsumer vc = bufferSource.getBuffer(RenderType.translucent());

        //? if neoforge {
        /*// Top face (normal pointing up) — NeoForge 1.21 vertex API (no endVertex)
        vc.addVertex(pose, x1, fluidY, z1).setColor(r, g, b, a).setUv(u0, v0).setOverlay(packedOverlay).setLight(packedLight).setNormal(0, 1, 0);
        vc.addVertex(pose, x1, fluidY, z2).setColor(r, g, b, a).setUv(u0, v1).setOverlay(packedOverlay).setLight(packedLight).setNormal(0, 1, 0);
        vc.addVertex(pose, x2, fluidY, z2).setColor(r, g, b, a).setUv(u1, v1).setOverlay(packedOverlay).setLight(packedLight).setNormal(0, 1, 0);
        vc.addVertex(pose, x2, fluidY, z1).setColor(r, g, b, a).setUv(u1, v0).setOverlay(packedOverlay).setLight(packedLight).setNormal(0, 1, 0);
        *///?} else {
        // Top face (normal pointing up) — Forge 1.20.1 vertex API (requires endVertex)
        vc.vertex(pose, x1, fluidY, z1).color(r, g, b, a).uv(u0, v0).overlayCoords(packedOverlay).uv2(packedLight).normal(0, 1, 0).endVertex();
        vc.vertex(pose, x1, fluidY, z2).color(r, g, b, a).uv(u0, v1).overlayCoords(packedOverlay).uv2(packedLight).normal(0, 1, 0).endVertex();
        vc.vertex(pose, x2, fluidY, z2).color(r, g, b, a).uv(u1, v1).overlayCoords(packedOverlay).uv2(packedLight).normal(0, 1, 0).endVertex();
        vc.vertex(pose, x2, fluidY, z1).color(r, g, b, a).uv(u1, v0).overlayCoords(packedOverlay).uv2(packedLight).normal(0, 1, 0).endVertex();
        //?}
    }

    private void renderItem(WoodenCauldronBlockEntity be, PoseStack poseStack,
                             MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        ItemStack stack = be.getItemHandler().getStackInSlot(0);
        if (stack.isEmpty()) return;

        poseStack.pushPose();
        // Center of the cauldron, slightly above water surface level
        poseStack.translate(0.5, 0.55, 0.5);
        poseStack.scale(0.45f, 0.45f, 0.45f);
        Minecraft.getInstance().getItemRenderer().renderStatic(
                stack, ItemDisplayContext.FIXED,
                packedLight, packedOverlay,
                poseStack, bufferSource,
                be.getLevel(), 0
        );
        poseStack.popPose();
    }

    private void renderFilter(WoodenCauldronBlockEntity be, PoseStack poseStack,
                               MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        ItemStack filter = be.getFilterItem();
        if (filter.isEmpty()) return;

        poseStack.pushPose();
        // Hover just above the cauldron rim so it's visible from all sides
        poseStack.translate(0.5, 1.15, 0.5);
        poseStack.scale(0.35f, 0.35f, 0.35f);
        Minecraft.getInstance().getItemRenderer().renderStatic(
                filter, ItemDisplayContext.FIXED,
                packedLight, packedOverlay,
                poseStack, bufferSource,
                be.getLevel(), 1
        );
        poseStack.popPose();
    }
}

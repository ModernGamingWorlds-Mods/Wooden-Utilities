package com.moderngamingworld.woodenutilities;

//? if (has_geckolib && forge_1201) {
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.BarrelBlock;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class WoodenBarrelRenderer extends GeoBlockRenderer<WoodenBarrelBlockEntity> {

    public WoodenBarrelRenderer(BlockEntityRendererProvider.Context context) {
        super(new WoodenBarrelGeoModel());
    }

    @Override
    public void preRender(PoseStack poseStack, WoodenBarrelBlockEntity animatable,
                          BakedGeoModel model, MultiBufferSource bufferSource,
                          VertexConsumer buffer, boolean isReRender,
                          float partialTick, int packedLight, int packedOverlay,
                          float red, float green, float blue, float alpha) {
        super.preRender(poseStack, animatable, model, bufferSource, buffer,
                isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);

        Direction facing = animatable.getBlockState().getValue(BarrelBlock.FACING);
        poseStack.translate(0.5, 0.5, 0.5);
        switch (facing) {
            case SOUTH -> poseStack.mulPose(Axis.YP.rotationDegrees(180));
            case EAST  -> poseStack.mulPose(Axis.YP.rotationDegrees(90));
            case WEST  -> poseStack.mulPose(Axis.YP.rotationDegrees(270));
            case UP    -> poseStack.mulPose(Axis.XP.rotationDegrees(270));
            case DOWN  -> poseStack.mulPose(Axis.XP.rotationDegrees(90));
            default    -> {}
        }
        poseStack.translate(-0.5, -0.5, -0.5);
    }

    private static final float[][] ITEM_POSITIONS = {
        {0.5f,  0.5f,  0.18f},
        {0.3f,  0.65f, 0.18f},
        {0.7f,  0.65f, 0.18f},
        {0.3f,  0.35f, 0.18f},
        {0.7f,  0.35f, 0.18f},
    };

    @Override
    public void renderFinal(PoseStack poseStack, WoodenBarrelBlockEntity animatable,
                            BakedGeoModel model, MultiBufferSource bufferSource,
                            VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay,
                            float red, float green, float blue, float alpha) {
        super.renderFinal(poseStack, animatable, model, bufferSource, buffer, partialTick, packedLight, packedOverlay, red, green, blue, alpha);

        if (!animatable.getBlockState().getValue(BarrelBlock.OPEN)) return;

        NonNullList<ItemStack> display = animatable.getDisplayItems();
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        Direction facing = animatable.getBlockState().getValue(BarrelBlock.FACING);

        for (int i = 0; i < 5; i++) {
            ItemStack stack = display.get(i);
            if (stack.isEmpty()) continue;

            poseStack.pushPose();
            poseStack.translate(0.5, 0.5, 0.5);
            switch (facing) {
                case SOUTH -> poseStack.mulPose(Axis.YP.rotationDegrees(180));
                case EAST  -> poseStack.mulPose(Axis.YP.rotationDegrees(90));
                case WEST  -> poseStack.mulPose(Axis.YP.rotationDegrees(270));
                case UP    -> poseStack.mulPose(Axis.XP.rotationDegrees(270));
                case DOWN  -> poseStack.mulPose(Axis.XP.rotationDegrees(90));
                default    -> {}
            }
            poseStack.translate(-0.5, -0.5, -0.5);

            float[] pos = ITEM_POSITIONS[i];
            poseStack.translate(pos[0], pos[1], pos[2]);
            poseStack.scale(0.25f, 0.25f, 0.25f);

            itemRenderer.renderStatic(stack, ItemDisplayContext.GROUND,
                    packedLight, packedOverlay, poseStack, bufferSource,
                    animatable.getLevel(), i);
            poseStack.popPose();
        }
    }
}
//?}
//? if (has_geckolib && !forge_1201) {
/*import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.BarrelBlock;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class WoodenBarrelRenderer extends GeoBlockRenderer<WoodenBarrelBlockEntity> {

    public WoodenBarrelRenderer(BlockEntityRendererProvider.Context context) {
        super(new WoodenBarrelGeoModel());
    }

    @Override
    public void preRender(PoseStack poseStack, WoodenBarrelBlockEntity animatable,
                          BakedGeoModel model, MultiBufferSource bufferSource,
                          VertexConsumer buffer, boolean isReRender,
                          float partialTick, int packedLight, int packedOverlay, int colour) {
        super.preRender(poseStack, animatable, model, bufferSource, buffer,
                isReRender, partialTick, packedLight, packedOverlay, colour);

        Direction facing = animatable.getBlockState().getValue(BarrelBlock.FACING);
        poseStack.translate(0.5, 0.5, 0.5);
        switch (facing) {
            case SOUTH -> poseStack.mulPose(Axis.YP.rotationDegrees(180));
            case EAST  -> poseStack.mulPose(Axis.YP.rotationDegrees(90));
            case WEST  -> poseStack.mulPose(Axis.YP.rotationDegrees(270));
            case UP    -> poseStack.mulPose(Axis.XP.rotationDegrees(270));
            case DOWN  -> poseStack.mulPose(Axis.XP.rotationDegrees(90));
            default    -> {}
        }
        poseStack.translate(-0.5, -0.5, -0.5);
    }

    private static final float[][] ITEM_POSITIONS = {
        {0.5f,  0.5f,  0.18f},
        {0.3f,  0.65f, 0.18f},
        {0.7f,  0.65f, 0.18f},
        {0.3f,  0.35f, 0.18f},
        {0.7f,  0.35f, 0.18f},
    };

    @Override
    public void renderFinal(PoseStack poseStack, WoodenBarrelBlockEntity animatable,
                            BakedGeoModel model, MultiBufferSource bufferSource,
                            VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay,
                            int colour) {
        super.renderFinal(poseStack, animatable, model, bufferSource, buffer, partialTick, packedLight, packedOverlay, colour);

        if (!animatable.getBlockState().getValue(BarrelBlock.OPEN)) return;

        NonNullList<ItemStack> display = animatable.getDisplayItems();
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        Direction facing = animatable.getBlockState().getValue(BarrelBlock.FACING);

        for (int i = 0; i < 5; i++) {
            ItemStack stack = display.get(i);
            if (stack.isEmpty()) continue;

            poseStack.pushPose();
            poseStack.translate(0.5, 0.5, 0.5);
            switch (facing) {
                case SOUTH -> poseStack.mulPose(Axis.YP.rotationDegrees(180));
                case EAST  -> poseStack.mulPose(Axis.YP.rotationDegrees(90));
                case WEST  -> poseStack.mulPose(Axis.YP.rotationDegrees(270));
                case UP    -> poseStack.mulPose(Axis.XP.rotationDegrees(270));
                case DOWN  -> poseStack.mulPose(Axis.XP.rotationDegrees(90));
                default    -> {}
            }
            poseStack.translate(-0.5, -0.5, -0.5);

            float[] pos = ITEM_POSITIONS[i];
            poseStack.translate(pos[0], pos[1], pos[2]);
            poseStack.scale(0.25f, 0.25f, 0.25f);

            itemRenderer.renderStatic(stack, ItemDisplayContext.GROUND,
                    packedLight, packedOverlay, poseStack, bufferSource,
                    animatable.getLevel(), i);
            poseStack.popPose();
        }
    }
}
*///?}

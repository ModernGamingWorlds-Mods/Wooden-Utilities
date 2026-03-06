package com.moderngamingworld.woodenutilities;

//? if (has_geckolib && forge_1201) {
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.state.properties.ChestType;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class WoodenChestRenderer extends GeoBlockRenderer<WoodenChestBlockEntity> {

    public WoodenChestRenderer(BlockEntityRendererProvider.Context context) {
        super(new WoodenChestGeoModel());
    }

    @Override
    public void preRender(PoseStack poseStack, WoodenChestBlockEntity animatable,
                          BakedGeoModel model, MultiBufferSource bufferSource,
                          VertexConsumer buffer, boolean isReRender,
                          float partialTick, int packedLight, int packedOverlay,
                          float red, float green, float blue, float alpha) {
        super.preRender(poseStack, animatable, model, bufferSource, buffer,
                isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
        applyFacingRotation(poseStack, animatable);
    }

    private static void applyFacingRotation(PoseStack poseStack, WoodenChestBlockEntity animatable) {
        Direction facing = animatable.getBlockState().getValue(ChestBlock.FACING);
        ChestType type   = animatable.getBlockState().getValue(ChestBlock.TYPE);

        poseStack.translate(0.5, 0.5, 0.5);

        // For double chest LEFT block, shift pivot so the double model centres across both blocks.
        // Adjustment direction depends on facing; the RIGHT block is always to the right of FACING.
        if (type == ChestType.LEFT) {
            switch (facing) {
                case NORTH -> poseStack.translate(-0.5, 0, 0);
                case SOUTH -> poseStack.translate(0.5, 0, 0);
                case EAST  -> poseStack.translate(0, 0, -0.5);
                case WEST  -> poseStack.translate(0, 0, 0.5);
                default    -> {}
            }
        }

        switch (facing) {
            case SOUTH -> poseStack.mulPose(Axis.YP.rotationDegrees(180));
            case EAST  -> poseStack.mulPose(Axis.YP.rotationDegrees(90));
            case WEST  -> poseStack.mulPose(Axis.YP.rotationDegrees(270));
            default    -> {} // NORTH = no rotation
        }
        poseStack.translate(-0.5, -0.5, -0.5);
    }
}
//?}
//? if (has_geckolib && !forge_1201) {
/*import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.state.properties.ChestType;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class WoodenChestRenderer extends GeoBlockRenderer<WoodenChestBlockEntity> {

    public WoodenChestRenderer(BlockEntityRendererProvider.Context context) {
        super(new WoodenChestGeoModel());
    }

    @Override
    public void preRender(PoseStack poseStack, WoodenChestBlockEntity animatable,
                          BakedGeoModel model, MultiBufferSource bufferSource,
                          VertexConsumer buffer, boolean isReRender,
                          float partialTick, int packedLight, int packedOverlay, int colour) {
        super.preRender(poseStack, animatable, model, bufferSource, buffer,
                isReRender, partialTick, packedLight, packedOverlay, colour);
        applyFacingRotation(poseStack, animatable);
    }

    private static void applyFacingRotation(PoseStack poseStack, WoodenChestBlockEntity animatable) {
        Direction facing = animatable.getBlockState().getValue(ChestBlock.FACING);
        ChestType type   = animatable.getBlockState().getValue(ChestBlock.TYPE);

        poseStack.translate(0.5, 0.5, 0.5);

        if (type == ChestType.LEFT) {
            switch (facing) {
                case NORTH -> poseStack.translate(-0.5, 0, 0);
                case SOUTH -> poseStack.translate(0.5, 0, 0);
                case EAST  -> poseStack.translate(0, 0, -0.5);
                case WEST  -> poseStack.translate(0, 0, 0.5);
                default    -> {}
            }
        }

        switch (facing) {
            case SOUTH -> poseStack.mulPose(Axis.YP.rotationDegrees(180));
            case EAST  -> poseStack.mulPose(Axis.YP.rotationDegrees(90));
            case WEST  -> poseStack.mulPose(Axis.YP.rotationDegrees(270));
            default    -> {}
        }
        poseStack.translate(-0.5, -0.5, -0.5);
    }
}
*///?}

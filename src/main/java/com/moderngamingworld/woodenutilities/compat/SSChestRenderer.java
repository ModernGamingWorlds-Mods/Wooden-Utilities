package com.moderngamingworld.woodenutilities.compat;

//? if (has_geckolib && forge) {
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.LidBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import software.bernie.geckolib.renderer.GeoObjectRenderer;

import java.util.HashMap;
import java.util.Map;

public class SSChestRenderer implements BlockEntityRenderer<BlockEntity> {

    private final GeoObjectRenderer<SSChestAnimatable> geoRenderer;
    private final Map<Long, SSChestAnimatable> animatables = new HashMap<>();

    public SSChestRenderer(BlockEntityRendererProvider.Context ctx) {
        this.geoRenderer = new GeoObjectRenderer<>(new SSChestGeoModel());
    }

    @Override
    public void render(BlockEntity blockEntity, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        BlockState state = blockEntity.getBlockState();

        // Determine chest type (SINGLE / LEFT / RIGHT)
        String typeStr = getStringProp(state, "type");
        if ("right".equals(typeStr)) return; // RIGHT block — LEFT renders the full double geo

        boolean isDouble = "left".equals(typeStr);

        ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(state.getBlock());
        String tier    = blockId.getPath(); // e.g. "chest", "iron_chest"
        String woodKey = SSBarrelRenderer.resolveWoodKeyStatic(blockEntity);

        long posKey = blockEntity.getBlockPos().asLong();
        SSChestAnimatable anim = animatables.computeIfAbsent(
                posKey, k -> new SSChestAnimatable(tier, woodKey));
        anim.setTier(tier);
        anim.setWoodKey(woodKey);
        anim.setDouble(isDouble);

        // Determine open state via LidBlockEntity (SS ChestBlockEntity implements it)
        boolean open = false;
        if (blockEntity instanceof LidBlockEntity lid) {
            open = lid.getOpenNess(partialTick) > 0.001f;
        }
        anim.setOpen(open);

        Direction facing = getDirProp(state, "facing");

        poseStack.pushPose();
        poseStack.translate(0.5, 0.5, 0.5);

        // For double chest, shift the origin so the model spans from LEFT into RIGHT block space
        if (isDouble) {
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

        ResourceLocation texture = geoRenderer.getTextureLocation(anim);
        RenderType renderType = geoRenderer.getRenderType(anim, texture, bufferSource, partialTick);
        VertexConsumer buffer = bufferSource.getBuffer(renderType);
        geoRenderer.render(poseStack, anim, bufferSource, renderType, buffer, packedLight);

        poseStack.popPose();
    }

    private static String getStringProp(BlockState state, String name) {
        Property<?> prop = state.getBlock().getStateDefinition().getProperty(name);
        if (prop == null) return "single";
        return state.getValue((Property) prop).toString().toLowerCase();
    }

    private static Direction getDirProp(BlockState state, String name) {
        Property<?> prop = state.getBlock().getStateDefinition().getProperty(name);
        return prop instanceof DirectionProperty dp ? state.getValue(dp) : Direction.NORTH;
    }
}
//?}
//? if (has_geckolib && neoforge) {
/*import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.LidBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import software.bernie.geckolib.renderer.GeoObjectRenderer;

import java.util.HashMap;
import java.util.Map;

public class SSChestRenderer implements BlockEntityRenderer<BlockEntity> {

    private final GeoObjectRenderer<SSChestAnimatable> geoRenderer;
    private final Map<Long, SSChestAnimatable> animatables = new HashMap<>();

    public SSChestRenderer(BlockEntityRendererProvider.Context ctx) {
        this.geoRenderer = new GeoObjectRenderer<>(new SSChestGeoModel());
    }

    @Override
    public void render(BlockEntity blockEntity, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        BlockState state = blockEntity.getBlockState();

        String typeStr = getStringProp(state, "type");
        if ("right".equals(typeStr)) return;

        boolean isDouble = "left".equals(typeStr);

        ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(state.getBlock());
        String tier    = blockId.getPath();
        String woodKey = SSBarrelRenderer.resolveWoodKeyStatic(blockEntity);

        long posKey = blockEntity.getBlockPos().asLong();
        SSChestAnimatable anim = animatables.computeIfAbsent(
                posKey, k -> new SSChestAnimatable(tier, woodKey));
        anim.setTier(tier);
        anim.setWoodKey(woodKey);
        anim.setDouble(isDouble);

        boolean open = false;
        if (blockEntity instanceof LidBlockEntity lid) {
            open = lid.getOpenNess(partialTick) > 0.001f;
        }
        anim.setOpen(open);

        Direction facing = getDirProp(state, "facing");

        poseStack.pushPose();
        poseStack.translate(0.5, 0.5, 0.5);

        if (isDouble) {
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

        ResourceLocation texture = geoRenderer.getTextureLocation(anim);
        RenderType renderType = geoRenderer.getRenderType(anim, texture, bufferSource, partialTick);
        VertexConsumer buffer = bufferSource.getBuffer(renderType);
        geoRenderer.render(poseStack, anim, bufferSource, renderType, buffer, packedLight, partialTick);

        poseStack.popPose();
    }

    private static String getStringProp(BlockState state, String name) {
        Property<?> prop = state.getBlock().getStateDefinition().getProperty(name);
        if (prop == null) return "single";
        return state.getValue((Property) prop).toString().toLowerCase();
    }

    private static Direction getDirProp(BlockState state, String name) {
        Property<?> prop = state.getBlock().getStateDefinition().getProperty(name);
        return prop instanceof DirectionProperty dp ? state.getValue(dp) : Direction.NORTH;
    }
}
*///?}

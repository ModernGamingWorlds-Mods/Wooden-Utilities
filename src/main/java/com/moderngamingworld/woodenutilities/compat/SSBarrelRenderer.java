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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import software.bernie.geckolib.renderer.GeoObjectRenderer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SSBarrelRenderer implements BlockEntityRenderer<BlockEntity> {

    private static final Map<String, String> SS_WOOD_TO_KEY;
    static {
        Map<String, String> m = new HashMap<>();

        String[] vanilla = {
            "oak", "spruce", "birch", "jungle", "acacia", "dark_oak",
            "mangrove", "cherry", "bamboo", "crimson", "warped", "pale_oak"
        };
        for (String w : vanilla) {
            m.put(w, "vanilla_" + w);
            m.put("minecraft:" + w, "vanilla_" + w);
        }

        for (String w : new String[]{
            "fir","pine","maple","redwood","mahogany","jacaranda",
            "palm","willow","dead","magic","umbran","hellbark","empyreal"
        }) { m.put("biomesoplenty:" + w, "bop_" + w); }

        for (String w : new String[]{
            "aspen","baobab","blue_enchanted","cika","cypress","ebony","fir","florus",
            "green_enchanted","holly","ironwood","jacaranda","mahogany","maple","palm",
            "pine","rainbow_eucalyptus","redwood","sakura","skyris","spirit",
            "white_mangrove","willow","witch_hazel","zelkova"
        }) { m.put("byg:" + w, "bwg_" + w); }

        m.put("twilightforest:twilight_oak",    "tf_twilight_oak");
        m.put("twilightforest:canopy",           "tf_canopy");
        m.put("twilightforest:mangrove",         "tf_mangrove");
        m.put("twilightforest:dark",             "tf_darkwood");
        m.put("twilightforest:time",             "tf_time");
        m.put("twilightforest:transformation",   "tf_trans");
        m.put("twilightforest:mining",           "tf_mine");
        m.put("twilightforest:sorting",          "tf_sort");
        m.put("twilightforest:towerwood",        "tf_towerwood");

        m.put("aether:skyroot", "aether_skyroot");

        for (String w : new String[]{"conberry","cruderoot","roseroot","sunroot","yagroot"}) {
            m.put("deepaether:" + w, "deep_aether_" + w);
        }

        for (String w : new String[]{
            "african_blackwood","banyan","black_walnut","bloodwood","bristlecone_pine",
            "cork_oak","dragon_blood","kapok","larch","sandalwood",
            "sycamore","teak","wenge","zebrawood"
        }) {
            m.put("woodenutilities:" + w, w);
            m.put(w, w);
        }

        SS_WOOD_TO_KEY = Collections.unmodifiableMap(m);
    }

    private final GeoObjectRenderer<SSBarrelAnimatable> geoRenderer;
    private final Map<Long, SSBarrelAnimatable> animatables = new HashMap<>();

    public SSBarrelRenderer(BlockEntityRendererProvider.Context ctx) {
        this.geoRenderer = new GeoObjectRenderer<>(new SSBarrelGeoModel());
    }

    @Override
    public void render(BlockEntity blockEntity, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        BlockState state = blockEntity.getBlockState();

        ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(state.getBlock());
        String tier    = extractTier(blockId.getPath());
        String woodKey = resolveWoodKey(blockEntity);

        long posKey = blockEntity.getBlockPos().asLong();
        SSBarrelAnimatable anim = animatables.computeIfAbsent(
                posKey, k -> new SSBarrelAnimatable(tier, woodKey));
        anim.setTier(tier);
        anim.setWoodKey(woodKey);
        anim.setOpen(getBoolProp(state, "open"));

        Direction facing = getDirProp(state, "facing");

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

        ResourceLocation texture = geoRenderer.getTextureLocation(anim);
        RenderType renderType = geoRenderer.getRenderType(anim, texture, bufferSource, partialTick);
        VertexConsumer buffer = bufferSource.getBuffer(renderType);
        geoRenderer.render(poseStack, anim, bufferSource, renderType, buffer, packedLight);

        poseStack.popPose();
    }

    /** Shared wood-key resolver, also used by SSChestRenderer. */
    static String resolveWoodKeyStatic(BlockEntity blockEntity) {
        return resolveWoodKey(blockEntity);
    }

    private static String resolveWoodKey(BlockEntity blockEntity) {
        try {
            Object woodType = blockEntity.getClass().getMethod("getWoodType").invoke(blockEntity);
            String rawName;
            try {
                rawName = (String) woodType.getClass().getMethod("name").invoke(woodType);
            } catch (NoSuchMethodException e) {
                rawName = woodType.toString();
            }
            return SS_WOOD_TO_KEY.getOrDefault(rawName, "vanilla_oak");
        } catch (Exception e) {
            return "vanilla_oak";
        }
    }

    private static String extractTier(String path) {
        if (path.startsWith("limited_")) {
            path = path.substring("limited_".length());
            path = path.replaceAll("_[1-4]$", "");
        }
        return path;
    }

    private static boolean getBoolProp(BlockState state, String name) {
        Property<?> prop = state.getBlock().getStateDefinition().getProperty(name);
        return prop instanceof BooleanProperty bp && state.getValue(bp);
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import software.bernie.geckolib.renderer.GeoObjectRenderer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SSBarrelRenderer implements BlockEntityRenderer<BlockEntity> {

    private static final Map<String, String> SS_WOOD_TO_KEY;
    static {
        Map<String, String> m = new HashMap<>();

        String[] vanilla = {
            "oak", "spruce", "birch", "jungle", "acacia", "dark_oak",
            "mangrove", "cherry", "bamboo", "crimson", "warped", "pale_oak"
        };
        for (String w : vanilla) {
            m.put(w, "vanilla_" + w);
            m.put("minecraft:" + w, "vanilla_" + w);
        }

        for (String w : new String[]{
            "fir","pine","maple","redwood","mahogany","jacaranda",
            "palm","willow","dead","magic","umbran","hellbark","empyreal"
        }) { m.put("biomesoplenty:" + w, "bop_" + w); }

        for (String w : new String[]{
            "aspen","baobab","blue_enchanted","cika","cypress","ebony","fir","florus",
            "green_enchanted","holly","ironwood","jacaranda","mahogany","maple","palm",
            "pine","rainbow_eucalyptus","redwood","sakura","skyris","spirit",
            "white_mangrove","willow","witch_hazel","zelkova"
        }) { m.put("byg:" + w, "bwg_" + w); }

        m.put("twilightforest:twilight_oak",    "tf_twilight_oak");
        m.put("twilightforest:canopy",           "tf_canopy");
        m.put("twilightforest:mangrove",         "tf_mangrove");
        m.put("twilightforest:dark",             "tf_darkwood");
        m.put("twilightforest:time",             "tf_time");
        m.put("twilightforest:transformation",   "tf_trans");
        m.put("twilightforest:mining",           "tf_mine");
        m.put("twilightforest:sorting",          "tf_sort");
        m.put("twilightforest:towerwood",        "tf_towerwood");

        m.put("aether:skyroot", "aether_skyroot");

        for (String w : new String[]{"conberry","cruderoot","roseroot","sunroot","yagroot"}) {
            m.put("deepaether:" + w, "deep_aether_" + w);
        }

        for (String w : new String[]{
            "african_blackwood","banyan","black_walnut","bloodwood","bristlecone_pine",
            "cork_oak","dragon_blood","kapok","larch","sandalwood",
            "sycamore","teak","wenge","zebrawood"
        }) {
            m.put("woodenutilities:" + w, w);
            m.put(w, w);
        }

        SS_WOOD_TO_KEY = Collections.unmodifiableMap(m);
    }

    private final GeoObjectRenderer<SSBarrelAnimatable> geoRenderer;
    private final Map<Long, SSBarrelAnimatable> animatables = new HashMap<>();

    public SSBarrelRenderer(BlockEntityRendererProvider.Context ctx) {
        this.geoRenderer = new GeoObjectRenderer<>(new SSBarrelGeoModel());
    }

    @Override
    public void render(BlockEntity blockEntity, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        BlockState state = blockEntity.getBlockState();

        ResourceLocation blockId = BuiltInRegistries.BLOCK.getKey(state.getBlock());
        String tier    = extractTier(blockId.getPath());
        String woodKey = resolveWoodKey(blockEntity);

        long posKey = blockEntity.getBlockPos().asLong();
        SSBarrelAnimatable anim = animatables.computeIfAbsent(
                posKey, k -> new SSBarrelAnimatable(tier, woodKey));
        anim.setTier(tier);
        anim.setWoodKey(woodKey);
        anim.setOpen(getBoolProp(state, "open"));

        Direction facing = getDirProp(state, "facing");

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

        ResourceLocation texture = geoRenderer.getTextureLocation(anim);
        RenderType renderType = geoRenderer.getRenderType(anim, texture, bufferSource, partialTick);
        VertexConsumer buffer = bufferSource.getBuffer(renderType);
        geoRenderer.render(poseStack, anim, bufferSource, renderType, buffer, packedLight, partialTick);

        poseStack.popPose();
    }

    static String resolveWoodKeyStatic(BlockEntity blockEntity) {
        return resolveWoodKey(blockEntity);
    }

    private static String resolveWoodKey(BlockEntity blockEntity) {
        try {
            Object woodType = blockEntity.getClass().getMethod("getWoodType").invoke(blockEntity);
            String rawName;
            try {
                rawName = (String) woodType.getClass().getMethod("name").invoke(woodType);
            } catch (NoSuchMethodException e) {
                rawName = woodType.toString();
            }
            return SS_WOOD_TO_KEY.getOrDefault(rawName, "vanilla_oak");
        } catch (Exception e) {
            return "vanilla_oak";
        }
    }

    private static String extractTier(String path) {
        if (path.startsWith("limited_")) {
            path = path.substring("limited_".length());
            path = path.replaceAll("_[1-4]$", "");
        }
        return path;
    }

    private static boolean getBoolProp(BlockState state, String name) {
        Property<?> prop = state.getBlock().getStateDefinition().getProperty(name);
        return prop instanceof BooleanProperty bp && state.getValue(bp);
    }

    private static Direction getDirProp(BlockState state, String name) {
        Property<?> prop = state.getBlock().getStateDefinition().getProperty(name);
        return prop instanceof DirectionProperty dp ? state.getValue(dp) : Direction.NORTH;
    }
}
*///?}

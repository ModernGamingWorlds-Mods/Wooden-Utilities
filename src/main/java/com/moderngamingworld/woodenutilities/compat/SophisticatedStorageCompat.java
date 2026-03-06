package com.moderngamingworld.woodenutilities.compat;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
//? if neoforge {
/*import net.neoforged.neoforge.client.event.EntityRenderersEvent;
*///?} else {
import net.minecraftforge.client.event.EntityRenderersEvent;
//?}

/**
 * Client-side compat for Sophisticated Storage.
 * Registers GeckoLib renderers for SS barrel block entity types,
 * replacing SS's default baked model rendering with animated geo models.
 * Safe to call even if SS is absent — null types are silently skipped.
 */
public class SophisticatedStorageCompat {

    public static final String SS_MOD_ID = "sophisticatedstorage";

    /** All expected SS barrel block entity type registry names. */
    private static final String[] SS_BARREL_TYPES = {
        "barrel",          "copper_barrel",          "iron_barrel",
        "gold_barrel",     "diamond_barrel",          "netherite_barrel",
        "limited_barrel",  "limited_copper_barrel",   "limited_iron_barrel",
        "limited_gold_barrel", "limited_diamond_barrel", "limited_netherite_barrel",
    };

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        //? if has_geckolib {
        for (String typeName : SS_BARREL_TYPES) {
            BlockEntityType<?> type = BuiltInRegistries.BLOCK_ENTITY_TYPE.get(
                    ResourceLocation.fromNamespaceAndPath(SS_MOD_ID, typeName));
            if (type != null) {
                event.registerBlockEntityRenderer((BlockEntityType) type, SSBarrelRenderer::new);
            }
        }
        //?}
    }
}

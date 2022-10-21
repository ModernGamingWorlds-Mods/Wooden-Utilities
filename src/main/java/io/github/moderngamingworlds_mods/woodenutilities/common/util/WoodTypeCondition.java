package io.github.moderngamingworlds_mods.woodenutilities.common.util;

import com.google.gson.JsonObject;
import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModWoodType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

public final class WoodTypeCondition implements ICondition {

    public static final ResourceLocation ID = new ResourceLocation(WoodenUtilities.MOD_ID, "wood_type_condition");

    private final ModWoodType type;

    public WoodTypeCondition(ModWoodType type) {
        this.type = type;
    }

    @Override
    public ResourceLocation getID() {
        return ID;
    }

    @Override
    @SuppressWarnings("removal")
    public boolean test() {
        return type.isAvailable();
    }

    public static class Serializer implements IConditionSerializer<WoodTypeCondition> {

        @Override
        public void write(JsonObject json, WoodTypeCondition value) {
            json.addProperty("wood_type", value.type.name());
        }

        @Override
        public WoodTypeCondition read(JsonObject json) {
            String type = GsonHelper.getAsString(json, "wood_type");
            return new WoodTypeCondition(ModWoodType.valueOf(type));
        }

        @Override
        public ResourceLocation getID() {
            return ID;
        }
    }
}

package com.moderngamingworld.woodenutilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.AddReloadListenerEvent;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class WaterCrucibleRecipeManager extends SimpleJsonResourceReloadListener {
    private static final Gson GSON = new GsonBuilder().create();
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final ResourceLocation WATER = new ResourceLocation("minecraft", "water");

    private static List<WaterCrucibleRecipe> recipes = List.of();

    public WaterCrucibleRecipeManager() {
        super(GSON, "water_crucible");
    }

    @Override
    protected void apply(Map<ResourceLocation, JsonElement> jsonMap, ResourceManager resourceManager, ProfilerFiller profiler) {
        List<WaterCrucibleRecipe> loadedRecipes = new ArrayList<>();

        for (Map.Entry<ResourceLocation, JsonElement> entry : jsonMap.entrySet()) {
            try {
                JsonObject json = entry.getValue().getAsJsonObject();
                if (json.has("type") && !"woodenutilities:water_crucible".equals(json.get("type").getAsString())) {
                    continue;
                }

                loadedRecipes.add(WaterCrucibleRecipe.fromJson(json));
            } catch (Exception exception) {
                LOGGER.error("Failed to parse water crucible recipe {}", entry.getKey(), exception);
            }
        }

        recipes = List.copyOf(loadedRecipes);
        LOGGER.info("Loaded {} Wooden Utilities water crucible recipes", recipes.size());
    }

    public static Optional<WaterCrucibleRecipe> findMatching(ItemStack stack, ResourceLocation fluid) {
        return recipes.stream().filter(recipe -> recipe.matches(stack, fluid)).findFirst();
    }

    public static ResourceLocation waterFluid() {
        return WATER;
    }

    public static void onAddReloadListeners(AddReloadListenerEvent event) {
        event.addListener(new WaterCrucibleRecipeManager());
    }
}

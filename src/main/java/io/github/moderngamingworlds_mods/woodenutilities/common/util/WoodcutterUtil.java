package io.github.moderngamingworlds_mods.woodenutilities.common.util;

import com.google.common.base.Preconditions;
import io.github.moderngamingworlds_mods.woodenutilities.common.recipes.WoodcutterRecipe;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WoodcutterUtil {

    public static List<String> plankVariants = Arrays.asList(
            "slab",
            "door",
            "sign",
            "pressure_plate",
            "fence",
            "fence_gate",
            "trapdoor",
            "button"
    );

    public static Map<String, List<WoodcutterRecipe>> genMcWoodcutterRecipes() {
        var mcRecipes = new HashMap<String, List<WoodcutterRecipe>>();

        for (Item mcPlanks : getAllMCPlanks()) {
            Preconditions.checkNotNull(mcPlanks.getRegistryName());
            var plankType = mcPlanks.getRegistryName().getPath().replace("_planks", "");
            mcRecipes.put(plankType, ForgeRegistries.ITEMS.getValues().stream()
                    .filter(item -> item.getRegistryName() != null)
                    .filter(WoodcutterUtil::isFromMC)
                    .filter(item -> item.getRegistryName().toString().contains(plankType))
                    .filter(item -> isVariant(plankType, item))
                    .map(item -> new WoodcutterRecipe(Ingredient.of(mcPlanks), new ItemStack(item)))
                    .collect(Collectors.toList()));
        }
        return mcRecipes;
    }


    public static boolean isVariant(String plankType, Item item) {
        return plankVariants.stream().anyMatch(variant -> item.getRegistryName().toString().contains(":" + plankType + "_" + variant));
    }

    public static boolean isPlank(Item item) {
        return ItemTags.PLANKS.contains(item);
    }

    public static String getWoodType(Item item) {
        return item.getRegistryName().getPath().replace("_planks", "");
    }

    private static boolean isFromMC(Item item) {
        return item.getRegistryName().getNamespace().equals("minecraft");
    }

    private static List<Item> getAllMCPlanks() {
        return ForgeRegistries.ITEMS.getValues().stream().filter(WoodcutterUtil::isFromMC).filter(WoodcutterUtil::isPlank).collect(Collectors.toList());
    }

    public static List<WoodcutterRecipe> getRecipesForPlank(Block plank){
        return WoodcutterUtil.genMcWoodcutterRecipes().get(getWoodType(plank.asItem()));
    }
}

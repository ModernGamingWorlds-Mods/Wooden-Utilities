package io.github.moderngamingworlds_mods.woodenutilities.common.recipes;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModRecipes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class WoodcutterRecipeBuilder implements FinishedRecipe {

    public ResourceLocation loc;
    public List<String> requiredMods = new ArrayList<>();
    public List<String> ingredients = new ArrayList<>();
    public String result;
    public int count;

    public WoodcutterRecipeBuilder(ResourceLocation loc) {
        this.loc = loc;
    }

    public static void from(WoodcutterRecipe recipe, Consumer<FinishedRecipe> recipeConsumer) {
        String path = "woodcutter/".concat(Objects.requireNonNull(recipe.result.getItem().getRegistryName()).getPath());
        var woodcutterRecipeBuilder = new WoodcutterRecipeBuilder(new ResourceLocation(WoodenUtilities.getInstance().modid, path));
        woodcutterRecipeBuilder.requiredMods.addAll(recipe.requiredMods);
        for (ItemStack item : recipe.ingredient.getItems()) {
            woodcutterRecipeBuilder.ingredients.add(Objects.requireNonNull(item.getItem().getRegistryName()).toString());
        }
        woodcutterRecipeBuilder.result = recipe.result.getItem().getRegistryName().toString();
        woodcutterRecipeBuilder.count = recipe.result.getCount();
        recipeConsumer.accept(woodcutterRecipeBuilder);
    }

    @Override
    public void serializeRecipeData(JsonObject object) {
        if (!this.requiredMods.isEmpty()) {
            var modArr = new JsonArray();
            this.requiredMods.forEach(modArr::add);
            object.add("requireMods", modArr);
        }
        if(this.ingredients.size() > 1){
            var ingredientsArr = new JsonArray();
            for (String ingredient : this.ingredients) {
                var itemObj = new JsonObject();
                itemObj.addProperty("item", ingredient);
                ingredientsArr.add(itemObj);
            }
            object.add("ingredient", ingredientsArr);
        } else if(this.ingredients.size() == 1){
            var ingredientObj = new JsonObject();
            ingredientObj.addProperty("item", this.ingredients.get(0));
            object.add("ingredient", ingredientObj);
        }
        object.addProperty("result", this.result);
        object.addProperty("count", this.count);
    }

    @Override
    public ResourceLocation getId() {
        return this.loc;
    }

    @Override
    public RecipeSerializer<?> getType() {
        return ModRecipes.WOODCUTTER_SERIALIZER;
    }

    @Nullable
    @Override
    public JsonObject serializeAdvancement() {
        return null;
    }

    @Nullable
    @Override
    public ResourceLocation getAdvancementId() {
        return null;
    }
}

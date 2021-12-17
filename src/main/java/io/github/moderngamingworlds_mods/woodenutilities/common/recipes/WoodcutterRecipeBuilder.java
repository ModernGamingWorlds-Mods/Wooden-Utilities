package io.github.moderngamingworlds_mods.woodenutilities.common.recipes;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModRecipes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
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
    public int count = 1;

    public WoodcutterRecipeBuilder(ResourceLocation loc) {
        this.loc = loc;
    }

    public static WoodcutterRecipeBuilder create(ResourceLocation loc) {
        return new WoodcutterRecipeBuilder(loc);
    }

    public WoodcutterRecipeBuilder requiredMod(String modId) {
        this.requiredMods.add(modId);
        return this;
    }

    public WoodcutterRecipeBuilder ingredient(Item item) {
        this.ingredients.add(Objects.requireNonNull(item.getRegistryName()).toString());
        return this;
    }

    public WoodcutterRecipeBuilder result(Item result) {
        this.result = Objects.requireNonNull(result.getRegistryName()).toString();
        return this;
    }

    public WoodcutterRecipeBuilder count(int count) {
        this.count = count;
        return this;
    }

    public void build(Consumer<FinishedRecipe> finishedRecipeConsumer){
        finishedRecipeConsumer.accept(this);
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

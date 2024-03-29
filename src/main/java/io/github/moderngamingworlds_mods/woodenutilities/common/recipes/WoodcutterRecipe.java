package io.github.moderngamingworlds_mods.woodenutilities.common.recipes;

import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModBlocks;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModRecipes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class WoodcutterRecipe implements Recipe<Container> {

    public static final String ID = WoodenUtilities.MOD_ID.concat("_woodcutter");
    public static final String SERIALIZER_ID = "woodcutter_serializer";

    public ResourceLocation recipeLoc;

    public List<String> requiredMods;
    public Ingredient ingredient;
    public ItemStack result;

    public WoodcutterRecipe(ResourceLocation recipeLoc, Ingredient ingredient, ItemStack result, List<String> requiredMods) {
        this.recipeLoc = recipeLoc;
        this.ingredient = ingredient;
        this.result = result;
        this.requiredMods = requiredMods;
    }

    public WoodcutterRecipe(Ingredient ingredient, ItemStack stack) {
        this(new ResourceLocation(WoodenUtilities.MOD_ID, stack.getItem().getRegistryName().getPath() + "woodcutter"),
                ingredient,
                stack,
                List.of("minecraft"));
    }

    @Override
    public boolean matches(Container container, @Nonnull Level level) {
        return this.ingredient.test(container.getItem(0));
    }

    @Override
    public ItemStack assemble(Container container) {
        return this.result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int w, int h) {
        return true;
    }

    @Override
    public ItemStack getResultItem() {
        return this.result;
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(ModBlocks.WOODCUTTER.get());
    }

    @Override
    public ResourceLocation getId() {
        return this.recipeLoc;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.WOODCUTTER_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.WOODCUTTER.get();
    }

    public static class WoodcutterSerializer extends ForgeRegistryEntry<RecipeSerializer<?>> implements RecipeSerializer<WoodcutterRecipe> {

        @Override
        public WoodcutterRecipe fromJson(ResourceLocation recipeLoc, JsonObject recipeJson) {

            var requireMods = List.of("minecraft");

            if (GsonHelper.isValidNode(recipeJson, "requireMods")) {
                requireMods = StreamSupport.stream(GsonHelper.getAsJsonArray(recipeJson, "requireMods").spliterator(), false).
                        map(JsonElement::getAsString).collect(Collectors.toList());
            }

            Ingredient ingredient;
            if (GsonHelper.isArrayNode(recipeJson, "ingredient")) {
                ingredient = Ingredient.fromJson(GsonHelper.getAsJsonArray(recipeJson, "ingredient"));
            } else {
                ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(recipeJson, "ingredient"));
            }

            var resultItem = GsonHelper.getAsString(recipeJson, "result");
            int count = GsonHelper.getAsInt(recipeJson, "count");
            var result = new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(resultItem)), count);

            return new WoodcutterRecipe(recipeLoc, ingredient, result, requireMods);
        }

        @Nullable
        @Override
        public WoodcutterRecipe fromNetwork(ResourceLocation res, FriendlyByteBuf buf) {
            var ingredient = Ingredient.fromNetwork(buf);
            var result = buf.readItem();
            List<String> requiredMods = Lists.newArrayList();
            int size = buf.readVarInt();
            for (int i = 0; i < size; i++) {
                requiredMods.add(buf.readUtf());
            }
            return new WoodcutterRecipe(res, ingredient, result, requiredMods);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, WoodcutterRecipe recipe) {
            buf.writeItem(recipe.result);
            recipe.ingredient.toNetwork(buf);
            buf.writeVarInt(recipe.requiredMods.size());
            for (String mod : recipe.requiredMods) {
                buf.writeUtf(mod);
            }
        }
    }

}

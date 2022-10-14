package io.github.moderngamingworlds_mods.woodenutilities.common.datagen.providers;

import com.google.common.collect.Sets;
import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.loaders.DynamicBucketModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModItemGenerator extends ItemModelProvider {

    public static final ResourceLocation GENERATED_PARENT = new ResourceLocation("item/generated");
    public static final ResourceLocation HANDHELD_PARENT = new ResourceLocation("item/handheld");
    public static final ResourceLocation DRIPPING_BUCKET = new ResourceLocation("forge", "bucket_drip");

    private final Set<Item> knownItems = Sets.newIdentityHashSet();

    public ModItemGenerator(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, WoodenUtilities.MOD_ID, fileHelper);
    }

    @Override
    protected void registerModels() {
        this.handheld(ModItems.WOODEN_DIAMOND);
        this.handheld(ModItems.WOODEN_SHEARS);

        ModItems.getRegisteredItems().forEach(itemRo -> {
            ResourceLocation id = itemRo.getId();
            Item item = itemRo.get();

            if (item instanceof BucketItem bucket) {
                this.bucket(id, bucket);
            }
            else if (!knownItems.contains(item)) {
                this.withExistingParent(id.getPath(), GENERATED_PARENT)
                        .texture("layer0", new ResourceLocation(id.getNamespace(), "item/" + id.getPath()));
            }
        });
    }

    private ItemModelBuilder custom(RegistryObject<Item> item) {
        this.knownItems.add(item.get());

        ResourceLocation id = item.getId();
        return getBuilder(id.getPath());
    }

    private void handheld(RegistryObject<Item> item) {
        this.knownItems.add(item.get());

        ResourceLocation id = item.getId();
        this.withExistingParent(id.getPath(), HANDHELD_PARENT)
                .texture("layer0", new ResourceLocation(id.getNamespace(), "item/" + id.getPath()));
    }

    private void bucket(ResourceLocation id, BucketItem bucket) {
        this.withExistingParent(id.getPath(), DRIPPING_BUCKET)
                .texture("base", this.modLoc("item/wooden_bucket"))
                .customLoader(DynamicBucketModelBuilder::begin)
                .fluid(bucket.getFluid());
    }
}

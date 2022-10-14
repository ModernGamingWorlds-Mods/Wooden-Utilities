package io.github.moderngamingworlds_mods.woodenutilities.common.datagen.providers;

import com.google.common.collect.Sets;
import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodenFurnaceBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;
import java.util.Set;

public class ModBlockStateGenerator extends BlockStateProvider {

    private final Set<Block> noAutoItem = Sets.newIdentityHashSet();

    public ModBlockStateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, WoodenUtilities.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.slab(ModBlocks.CRAFTING_SLAB,
                this.mcLoc("block/crafting_table_top"),
                this.mcLoc("block/crafting_table_side"),
                this.mcLoc("block/oak_planks")
        );

        this.simpleBlock(ModBlocks.WOODEN_TNT.get(), this.models().cubeBottomTop(
                ModBlocks.WOODEN_TNT.getId().getPath(),
                this.modLoc("block/wooden_tnt_side"),
                this.modLoc("block/wooden_tnt_top"),
                this.modLoc("block/wooden_tnt_bottom")
        ));

        this.horizontalBlock(
                ModBlocks.WOODCUTTER.get(),
                existing(ModBlocks.WOODCUTTER)
        );

        ModBlocks.getRegisteredBlocks().forEach(blockRo -> {
            ResourceLocation id = blockRo.getId();
            Block block = blockRo.get();

            if (block instanceof WoodenFurnaceBlock furnaceBlock) {
                this.furnaceBlock(id, furnaceBlock);
            }

            //noinspection
            if (!noAutoItem.contains(block) && block.asItem() != Items.AIR) {
                itemModels().withExistingParent(id.getPath(), new ResourceLocation(id.getNamespace(), "block/" + id.getPath()));
            }
        });
    }

    private void noAutoItem(RegistryObject<Block> block) {
        this.noAutoItem.add(block.get());
    }

    private ModelFile existing(RegistryObject<Block> block) {
        ResourceLocation id = block.getId();
        return this.models().getExistingFile(new ResourceLocation(id.getNamespace(), "block/" + id.getPath()));
    }

    private void slab(RegistryObject<Block> block, ResourceLocation top, ResourceLocation side, ResourceLocation bottom) {
        ResourceLocation id = block.getId();

        Map<SlabType, ModelFile> models = Map.of(
                SlabType.BOTTOM, this.models().slab(id.getPath(), side, bottom, top),
                SlabType.TOP, this.models().slabTop(id.getPath() + "_top", side, bottom, top),
                SlabType.DOUBLE, this.models().cubeBottomTop(id.getPath() + "_full", side, bottom, top)
        );

        VariantBlockStateBuilder builder = this.getVariantBuilder(block.get());
        for (SlabType type : BlockStateProperties.SLAB_TYPE.getPossibleValues()) {
            builder.partialState()
                    .with(BlockStateProperties.SLAB_TYPE, type)
                    .addModels(new ConfiguredModel(models.get(type)));
        }
    }

    private void furnaceBlock(ResourceLocation id, WoodenFurnaceBlock block) {
        this.horizontalBlock(block, state -> {
            WoodType type = block.type();
            ResourceLocation side = this.mcLoc("block/" + type.name() + "_planks");
            if (state.getValue(BlockStateProperties.LIT)) {
                return this.models().orientable(id.getPath() + "_on", side,
                        this.modLoc("block/" + id.getPath() + "_front_on"), side);
            }
            else {
                return this.models().orientable(id.getPath(), side,
                        this.modLoc("block/" + id.getPath() + "_front"), side);
            }
        });
    }
}

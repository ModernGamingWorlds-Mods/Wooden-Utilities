package io.github.moderngamingworlds_mods.woodenutilities.common.datagen;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodenFurnaceBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModBlocks;
import io.github.noeppi_noeppi.libx.annotation.data.Datagen;
import io.github.noeppi_noeppi.libx.data.provider.BlockStateProviderBase;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

@Datagen
public class ModBlockStateGenerator extends BlockStateProviderBase {

    public ModBlockStateGenerator(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(WoodenUtilities.getInstance(), gen, exFileHelper);
    }

    @Override
    protected void setup() {
        this.manualModel(ModBlocks.woodcutter);
    }

    @Override
    protected void defaultState(ResourceLocation id, Block block, Supplier<ModelFile> model) {
        if (block == ModBlocks.craftingSlab) {
            this.slab(id, block, this.mcLoc("block/crafting_table_top"), this.mcLoc("block/crafting_table_side"), this.mcLoc("block/oak_planks"));
        } else if (block == ModBlocks.woodenTnt) {
            this.simpleBlock(block, this.models().cubeBottomTop(id.getPath(),
                    this.modLoc("block/wooden_tnt_side"),
                    this.modLoc("block/wooden_tnt_top"),
                    this.modLoc("block/wooden_tnt_bottom")));
        } else if (block == ModBlocks.woodcutter) {
            this.horizontalBlock(block, model.get());
        } else if (block instanceof WoodenFurnaceBlock furnaceBlock) {
            this.furnaceBlock(id, furnaceBlock);
        } else {
            super.defaultState(id, block, model);
        }
    }

    @Override
    protected ModelFile defaultModel(ResourceLocation id, Block block) {
        if (block == ModBlocks.craftingSlab) {
            return null;
        }

        return super.defaultModel(id, block);
    }

    private void slab(ResourceLocation id, Block block, ResourceLocation top, ResourceLocation side, ResourceLocation bottom) {
        ModelFile modelBottom = this.models().slab(id.getPath(), side, bottom, top);
        ModelFile modelTop = this.models().slabTop(id.getPath() + "_top", side, bottom, top);
        ModelFile modelFull = this.models().cubeBottomTop(id.getPath() + "_full", side, bottom, top);
        VariantBlockStateBuilder builder = this.getVariantBuilder(block);

        for (SlabType type : BlockStateProperties.SLAB_TYPE.getPossibleValues()) {
            builder.partialState()
                    .with(BlockStateProperties.SLAB_TYPE, type)
                    .addModels(new ConfiguredModel(type == SlabType.TOP ? modelTop : type == SlabType.BOTTOM ? modelBottom : modelFull));
        }
    }

    private void furnaceBlock(ResourceLocation id, WoodenFurnaceBlock block) {
        this.horizontalBlock(block, state -> {
            WoodType type = block.type();
            ResourceLocation side = this.mcLoc("block/" + type.name() + "_planks");
            if (state.getValue(BlockStateProperties.LIT)) {
                return this.models().orientable(id.getPath() + "_on", side,
                        this.modLoc("block/" + id.getPath() + "_front_on"), side);
            } else {
                return this.models().orientable(id.getPath(), side,
                        this.modLoc("block/" + id.getPath() + "_front"), side);
            }
        });
    }
}

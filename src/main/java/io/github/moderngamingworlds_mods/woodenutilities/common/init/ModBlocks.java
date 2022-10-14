package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.CraftingSlabBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodcutterBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodenFurnaceBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodenTntBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.entity.WoodenFurnaceBlockEntity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WoodenUtilities.MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WoodenUtilities.MOD_ID);
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, WoodenUtilities.MOD_ID);

    public static final RegistryObject<Block> CRAFTING_SLAB = block("crafting_slab", CraftingSlabBlock::new);
    public static final RegistryObject<Block> WOODEN_TNT = block("wooden_tnt", WoodenTntBlock::new);
    public static final RegistryObject<Block> WOODCUTTER = block("woodcutter", WoodcutterBlock::new);

    public static final RegistryObject<Block> OAK_FURNACE = block("oak_furnace", () -> new WoodenFurnaceBlock(WoodType.OAK));
    public static final RegistryObject<Block> SPRUCE_FURNACE = block("spruce_furnace", () -> new WoodenFurnaceBlock(WoodType.SPRUCE));
    public static final RegistryObject<Block> BIRCH_FURNACE = block("birch_furnace", () -> new WoodenFurnaceBlock(WoodType.BIRCH));
    public static final RegistryObject<Block> ACACIA_FURNACE = block("acacia_furnace", () -> new WoodenFurnaceBlock(WoodType.ACACIA));
    public static final RegistryObject<Block> JUNGLE_FURNACE = block("jungle_furnace", () -> new WoodenFurnaceBlock(WoodType.JUNGLE));
    public static final RegistryObject<Block> DARK_OAK_FURNACE = block("dark_oak_furnace", () -> new WoodenFurnaceBlock(WoodType.DARK_OAK));
    public static final RegistryObject<Block> CRIMSON_FURNACE = block("crimson_furnace", () -> new WoodenFurnaceBlock(WoodType.CRIMSON));
    public static final RegistryObject<Block> WARPED_FURNACE = block("warped_furnace", () -> new WoodenFurnaceBlock(WoodType.WARPED));

    public static final RegistryObject<BlockEntityType<WoodenFurnaceBlockEntity>> WOODEN_FURNACE = blockEntity(
            "wooden_furnace",
            WoodenFurnaceBlockEntity::new,
            List.of(OAK_FURNACE, SPRUCE_FURNACE, BIRCH_FURNACE, ACACIA_FURNACE, JUNGLE_FURNACE, DARK_OAK_FURNACE, CRIMSON_FURNACE, WARPED_FURNACE)
    );



    private static RegistryObject<Block> block(String name, Supplier<Block> blockFactory) {
        return block(name, blockFactory, block -> new BlockItem(
                block,
                new Item.Properties().tab(WoodenUtilities.CREATIVE_TAB))
        );
    }

    private static RegistryObject<Block> block(String name, Supplier<Block> blockFactory, Function<Block, BlockItem> blockItemFactory) {
        RegistryObject<Block> block = BLOCKS.register(name, blockFactory);
        ITEMS.register(name, () -> blockItemFactory.apply(block.get()));
        return block;
    }

    private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> blockEntity(
            String name, BlockEntityType.BlockEntitySupplier<T> beFactory, List<RegistryObject<Block>> allowedBlocks
    ) {
        //noinspection ConstantConditions
        return BLOCK_ENTITIES.register(
                name,
                () -> BlockEntityType.Builder.of(
                        beFactory,
                        allowedBlocks.stream().map(RegistryObject::get).toArray(Block[]::new)
                ).build(null)
        );
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
        BLOCK_ENTITIES.register(bus);
    }

    public static Collection<RegistryObject<Block>> getRegisteredBlocks() {
        return BLOCKS.getEntries();
    }
}

package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.WoodenUtilities;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.CraftingSlabBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodcutterBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodenFurnaceBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodenTntBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.entity.WoodenFurnaceBlockEntity;
import io.github.moderngamingworlds_mods.woodenutilities.common.item.WoodBlockItem;
import io.github.moderngamingworlds_mods.woodenutilities.common.util.WoodTypeObjectMap;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
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

    public static final WoodTypeObjectMap<Block> FURNACES = woodBlocks("furnace", WoodenFurnaceBlock::new);

    public static final RegistryObject<BlockEntityType<WoodenFurnaceBlockEntity>> WOODEN_FURNACE = blockEntity(
            "wooden_furnace",
            WoodenFurnaceBlockEntity::new,
            FURNACES.getAll()
    );



    private static WoodTypeObjectMap<Block> woodBlocks(String nameSuffix, Supplier<Block> factory) {
        return woodBlocks(nameSuffix, type -> factory.get());
    }

    private static WoodTypeObjectMap<Block> woodBlocks(String nameSuffix, Function<ModWoodType, Block> factory) {
        Map<ModWoodType, RegistryObject<Block>> map = new EnumMap<>(ModWoodType.class);
        for (ModWoodType type : ModWoodType.values()) {
            map.put(
                    type,
                    block(type.getName() + "_" + nameSuffix, () -> factory.apply(type), block -> new WoodBlockItem(type, block))
            );
        }
        return new WoodTypeObjectMap<>(map);
    }

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
            String name, BlockEntityType.BlockEntitySupplier<T> beFactory, Collection<RegistryObject<Block>> allowedBlocks
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

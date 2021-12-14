package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.common.block.CraftingSlabBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodcutterBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodenFurnaceBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodenTntBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.entity.WoodenFurnaceBlockEntity;
import io.github.noeppi_noeppi.libx.annotation.registration.RegName;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

@RegisterClass
public class ModBlocks {

    public static final Block craftingSlab = new CraftingSlabBlock();
    public static final Block woodenTnt = new WoodenTntBlock();
    @RegName("woodcutter")
    public static final Block woodCutter = new WoodcutterBlock();

    public static final Block woodenFurnace = new WoodenFurnaceBlock();
    public static final BlockEntityType<WoodenFurnaceBlockEntity> WOODEN_FURNACE = BlockEntityType.Builder.of(WoodenFurnaceBlockEntity::new, woodenFurnace).build(null);
}

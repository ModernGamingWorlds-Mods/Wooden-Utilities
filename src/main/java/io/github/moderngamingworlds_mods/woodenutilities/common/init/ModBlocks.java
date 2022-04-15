package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.common.block.CraftingSlabBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodcutterBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodenFurnaceBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.WoodenTntBlock;
import io.github.moderngamingworlds_mods.woodenutilities.common.block.entity.WoodenFurnaceBlockEntity;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.properties.WoodType;

@RegisterClass
public class ModBlocks {

    public static final Block craftingSlab = new CraftingSlabBlock();
    public static final Block woodenTnt = new WoodenTntBlock();
    public static final Block woodcutter = new WoodcutterBlock();

    public static final Block oakFurnace = new WoodenFurnaceBlock(WoodType.OAK);
    public static final Block spruceFurnace = new WoodenFurnaceBlock(WoodType.SPRUCE);
    public static final Block birchFurnace = new WoodenFurnaceBlock(WoodType.BIRCH);
    public static final Block acaciaFurnace = new WoodenFurnaceBlock(WoodType.ACACIA);
    public static final Block jungleFurnace = new WoodenFurnaceBlock(WoodType.JUNGLE);
    public static final Block darkOakFurnace = new WoodenFurnaceBlock(WoodType.DARK_OAK);
    public static final Block crimsonFurnace = new WoodenFurnaceBlock(WoodType.CRIMSON);
    public static final Block warpedFurnace = new WoodenFurnaceBlock(WoodType.WARPED);
    public static final BlockEntityType<WoodenFurnaceBlockEntity> WOODEN_FURNACE = BlockEntityType.Builder.of(WoodenFurnaceBlockEntity::new, oakFurnace, spruceFurnace, birchFurnace, acaciaFurnace, jungleFurnace, darkOakFurnace, crimsonFurnace, warpedFurnace).build(null);
}

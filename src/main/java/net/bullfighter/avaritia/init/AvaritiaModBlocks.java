
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;

import net.bullfighter.avaritia.block.NeutroniumCompressorBlock;
import net.bullfighter.avaritia.block.NeutroniumBlockBlock;
import net.bullfighter.avaritia.block.NeutronCollectorBlock;
import net.bullfighter.avaritia.block.InfinityBlockBlock;
import net.bullfighter.avaritia.block.ExtremeCraftingTableBlock;
import net.bullfighter.avaritia.block.DoubleCompressedCraftingTableBlock;
import net.bullfighter.avaritia.block.CrystalMatrixBlock;
import net.bullfighter.avaritia.block.CompressedCraftingTableBlock;
import net.bullfighter.avaritia.AvaritiaMod;

public class AvaritiaModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AvaritiaMod.MODID);
	public static final DeferredHolder<Block, Block> NEUTRON_COLLECTOR = REGISTRY.register("neutron_collector", NeutronCollectorBlock::new);
	public static final DeferredHolder<Block, Block> NEUTRONIUM_COMPRESSOR = REGISTRY.register("neutronium_compressor", NeutroniumCompressorBlock::new);
	public static final DeferredHolder<Block, Block> COMPRESSED_CRAFTING_TABLE = REGISTRY.register("compressed_crafting_table", CompressedCraftingTableBlock::new);
	public static final DeferredHolder<Block, Block> DOUBLE_COMPRESSED_CRAFTING_TABLE = REGISTRY.register("double_compressed_crafting_table", DoubleCompressedCraftingTableBlock::new);
	public static final DeferredHolder<Block, Block> EXTREME_CRAFTING_TABLE = REGISTRY.register("extreme_crafting_table", ExtremeCraftingTableBlock::new);
	public static final DeferredHolder<Block, Block> NEUTRONIUM_BLOCK = REGISTRY.register("neutronium_block", NeutroniumBlockBlock::new);
	public static final DeferredHolder<Block, Block> INFINITY_BLOCK = REGISTRY.register("infinity_block", InfinityBlockBlock::new);
	public static final DeferredHolder<Block, Block> CRYSTAL_MATRIX = REGISTRY.register("crystal_matrix", CrystalMatrixBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}

/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
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

import java.util.function.Function;

public class AvaritiaModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(AvaritiaMod.MODID);
	public static final DeferredBlock<Block> NEUTRON_COLLECTOR = register("neutron_collector", NeutronCollectorBlock::new);
	public static final DeferredBlock<Block> NEUTRONIUM_COMPRESSOR = register("neutronium_compressor", NeutroniumCompressorBlock::new);
	public static final DeferredBlock<Block> COMPRESSED_CRAFTING_TABLE = register("compressed_crafting_table", CompressedCraftingTableBlock::new);
	public static final DeferredBlock<Block> DOUBLE_COMPRESSED_CRAFTING_TABLE = register("double_compressed_crafting_table", DoubleCompressedCraftingTableBlock::new);
	public static final DeferredBlock<Block> EXTREME_CRAFTING_TABLE = register("extreme_crafting_table", ExtremeCraftingTableBlock::new);
	public static final DeferredBlock<Block> NEUTRONIUM_BLOCK = register("neutronium_block", NeutroniumBlockBlock::new);
	public static final DeferredBlock<Block> INFINITY_BLOCK = register("infinity_block", InfinityBlockBlock::new);
	public static final DeferredBlock<Block> CRYSTAL_MATRIX = register("crystal_matrix", CrystalMatrixBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
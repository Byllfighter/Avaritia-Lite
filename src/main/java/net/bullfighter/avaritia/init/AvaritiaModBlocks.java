
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

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
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AvaritiaMod.MODID);
	public static final RegistryObject<Block> NEUTRON_COLLECTOR = REGISTRY.register("neutron_collector", () -> new NeutronCollectorBlock());
	public static final RegistryObject<Block> NEUTRONIUM_COMPRESSOR = REGISTRY.register("neutronium_compressor", () -> new NeutroniumCompressorBlock());
	public static final RegistryObject<Block> COMPRESSED_CRAFTING_TABLE = REGISTRY.register("compressed_crafting_table", () -> new CompressedCraftingTableBlock());
	public static final RegistryObject<Block> DOUBLE_COMPRESSED_CRAFTING_TABLE = REGISTRY.register("double_compressed_crafting_table", () -> new DoubleCompressedCraftingTableBlock());
	public static final RegistryObject<Block> EXTREME_CRAFTING_TABLE = REGISTRY.register("extreme_crafting_table", () -> new ExtremeCraftingTableBlock());
	public static final RegistryObject<Block> NEUTRONIUM_BLOCK = REGISTRY.register("neutronium_block", () -> new NeutroniumBlockBlock());
	public static final RegistryObject<Block> INFINITY_BLOCK = REGISTRY.register("infinity_block", () -> new InfinityBlockBlock());
	public static final RegistryObject<Block> CRYSTAL_MATRIX = REGISTRY.register("crystal_matrix", () -> new CrystalMatrixBlock());
}

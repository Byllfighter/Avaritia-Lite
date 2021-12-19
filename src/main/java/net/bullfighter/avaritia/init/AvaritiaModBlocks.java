
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.bullfighter.avaritia.block.NeutroniumCompressorBlock;
import net.bullfighter.avaritia.block.NeutroniumBlockBlock;
import net.bullfighter.avaritia.block.NeutronCollectorBlock;
import net.bullfighter.avaritia.block.InfinityBlockBlock;
import net.bullfighter.avaritia.block.ExtremeCraftingTableBlock;
import net.bullfighter.avaritia.block.DoubleCompressedCraftingTableBlock;
import net.bullfighter.avaritia.block.CrystalMatrixBlock;
import net.bullfighter.avaritia.block.CompressedCraftingTableBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block NEUTRON_COLLECTOR = register(new NeutronCollectorBlock());
	public static final Block NEUTRONIUM_COMPRESSOR = register(new NeutroniumCompressorBlock());
	public static final Block COMPRESSED_CRAFTING_TABLE = register(new CompressedCraftingTableBlock());
	public static final Block DOUBLE_COMPRESSED_CRAFTING_TABLE = register(new DoubleCompressedCraftingTableBlock());
	public static final Block EXTREME_CRAFTING_TABLE = register(new ExtremeCraftingTableBlock());
	public static final Block NEUTRONIUM_BLOCK = register(new NeutroniumBlockBlock());
	public static final Block INFINITY_BLOCK = register(new InfinityBlockBlock());
	public static final Block CRYSTAL_MATRIX = register(new CrystalMatrixBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}

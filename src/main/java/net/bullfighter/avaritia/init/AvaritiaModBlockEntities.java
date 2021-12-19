
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.bullfighter.avaritia.block.entity.NeutroniumCompressorBlockEntity;
import net.bullfighter.avaritia.block.entity.NeutronCollectorBlockEntity;
import net.bullfighter.avaritia.block.entity.ExtremeCraftingTableBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> NEUTRON_COLLECTOR = register("avaritia:neutron_collector", AvaritiaModBlocks.NEUTRON_COLLECTOR,
			NeutronCollectorBlockEntity::new);
	public static final BlockEntityType<?> NEUTRONIUM_COMPRESSOR = register("avaritia:neutronium_compressor", AvaritiaModBlocks.NEUTRONIUM_COMPRESSOR,
			NeutroniumCompressorBlockEntity::new);
	public static final BlockEntityType<?> EXTREME_CRAFTING_TABLE = register("avaritia:extreme_crafting_table",
			AvaritiaModBlocks.EXTREME_CRAFTING_TABLE, ExtremeCraftingTableBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}

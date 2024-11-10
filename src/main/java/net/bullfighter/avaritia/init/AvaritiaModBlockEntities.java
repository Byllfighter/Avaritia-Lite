
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.bullfighter.avaritia.block.entity.NeutroniumCompressorBlockEntity;
import net.bullfighter.avaritia.block.entity.NeutronCollectorBlockEntity;
import net.bullfighter.avaritia.block.entity.ExtremeCraftingTableBlockEntity;
import net.bullfighter.avaritia.AvaritiaMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AvaritiaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, AvaritiaMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> NEUTRON_COLLECTOR = register("neutron_collector", AvaritiaModBlocks.NEUTRON_COLLECTOR, NeutronCollectorBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> NEUTRONIUM_COMPRESSOR = register("neutronium_compressor", AvaritiaModBlocks.NEUTRONIUM_COMPRESSOR, NeutroniumCompressorBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> EXTREME_CRAFTING_TABLE = register("extreme_crafting_table", AvaritiaModBlocks.EXTREME_CRAFTING_TABLE, ExtremeCraftingTableBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NEUTRON_COLLECTOR.get(), (blockEntity, side) -> ((NeutronCollectorBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NEUTRONIUM_COMPRESSOR.get(), (blockEntity, side) -> ((NeutroniumCompressorBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EXTREME_CRAFTING_TABLE.get(), (blockEntity, side) -> ((ExtremeCraftingTableBlockEntity) blockEntity).getItemHandler());
	}
}

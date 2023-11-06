
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.bullfighter.avaritia.block.entity.NeutroniumCompressorBlockEntity;
import net.bullfighter.avaritia.block.entity.NeutronCollectorBlockEntity;
import net.bullfighter.avaritia.block.entity.ExtremeCraftingTableBlockEntity;
import net.bullfighter.avaritia.AvaritiaMod;

public class AvaritiaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AvaritiaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> NEUTRON_COLLECTOR = register("neutron_collector", AvaritiaModBlocks.NEUTRON_COLLECTOR, NeutronCollectorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NEUTRONIUM_COMPRESSOR = register("neutronium_compressor", AvaritiaModBlocks.NEUTRONIUM_COMPRESSOR, NeutroniumCompressorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EXTREME_CRAFTING_TABLE = register("extreme_crafting_table", AvaritiaModBlocks.EXTREME_CRAFTING_TABLE, ExtremeCraftingTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

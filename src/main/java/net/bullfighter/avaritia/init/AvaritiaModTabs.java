
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("avaritia", "avaritiatab"),
				builder -> builder.title(Component.translatable("item_group.avaritia.avaritiatab")).icon(() -> new ItemStack(AvaritiaModItems.INFINITY_CATALYST.get())).displayItems((parameters, tabData) -> {
					tabData.accept(AvaritiaModItems.DIAMOND_LATTICE.get());
					tabData.accept(AvaritiaModItems.CRYSTAL_MATRIX_INGOT.get());
					tabData.accept(AvaritiaModItems.PILEOF_NEUTRONS.get());
					tabData.accept(AvaritiaModItems.NEUTRONIUM_NUGGET.get());
					tabData.accept(AvaritiaModItems.NEUTRONIUM_INGOT.get());
					tabData.accept(AvaritiaModItems.INFINITY_CATALYST.get());
					tabData.accept(AvaritiaModBlocks.NEUTRON_COLLECTOR.get().asItem());
					tabData.accept(AvaritiaModItems.INFINITY_INGOT.get());
					tabData.accept(AvaritiaModItems.RECORD_FRAGMENT.get());
					tabData.accept(AvaritiaModItems.IRON_SINGULARITY.get());
					tabData.accept(AvaritiaModItems.GOLDEN_SINGULARITY.get());
					tabData.accept(AvaritiaModItems.LAPIS_SINGULARITY.get());
					tabData.accept(AvaritiaModItems.REDSTONE_SINGULARITY.get());
					tabData.accept(AvaritiaModItems.NETHER_QUARTZ_SINGULARITY.get());
					tabData.accept(AvaritiaModItems.DIAMOND_SINGULARITY.get());
					tabData.accept(AvaritiaModItems.EMERALD_SINGULARITY.get());
					tabData.accept(AvaritiaModBlocks.NEUTRONIUM_COMPRESSOR.get().asItem());
					tabData.accept(AvaritiaModItems.SWORDOFTHE_COSMOS.get());
					tabData.accept(AvaritiaModItems.PLANET_EATER.get());
					tabData.accept(AvaritiaModItems.NATURES_RUIN.get());
					tabData.accept(AvaritiaModItems.HOEOFTHE_GREEN_EARTH.get());
					tabData.accept(AvaritiaModItems.WORLD_BREAKER.get());
					tabData.accept(AvaritiaModItems.INFINITY_ARMOR_HELMET.get());
					tabData.accept(AvaritiaModItems.INFINITY_ARMOR_CHESTPLATE.get());
					tabData.accept(AvaritiaModItems.INFINITY_ARMOR_LEGGINGS.get());
					tabData.accept(AvaritiaModItems.INFINITY_ARMOR_BOOTS.get());
					tabData.accept(AvaritiaModItems.SKULLFIRE_SWORD.get());
					tabData.accept(AvaritiaModBlocks.COMPRESSED_CRAFTING_TABLE.get().asItem());
					tabData.accept(AvaritiaModBlocks.DOUBLE_COMPRESSED_CRAFTING_TABLE.get().asItem());
					tabData.accept(AvaritiaModBlocks.EXTREME_CRAFTING_TABLE.get().asItem());
					tabData.accept(AvaritiaModBlocks.NEUTRONIUM_BLOCK.get().asItem());
					tabData.accept(AvaritiaModBlocks.INFINITY_BLOCK.get().asItem());
					tabData.accept(AvaritiaModBlocks.CRYSTAL_MATRIX.get().asItem());
					tabData.accept(AvaritiaModItems.ULTIMATE_STEW.get());
					tabData.accept(AvaritiaModItems.COSMIC_MEATBALLS.get());
					tabData.accept(AvaritiaModItems.LONGBOWOFTHE_HEAVENS.get());
					tabData.accept(AvaritiaModItems.ENDEST_PEARL.get());
				})

		);
	}
}

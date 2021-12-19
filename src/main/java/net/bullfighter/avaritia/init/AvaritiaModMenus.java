
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.bullfighter.avaritia.world.inventory.NeutroniumCompressorGuiMenu;
import net.bullfighter.avaritia.world.inventory.NeutronCollectorGuiMenu;
import net.bullfighter.avaritia.world.inventory.ExtremeCraftingTableGuiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<NeutronCollectorGuiMenu> NEUTRON_COLLECTOR_GUI = register("neutron_collector_gui",
			(id, inv, extraData) -> new NeutronCollectorGuiMenu(id, inv, extraData));
	public static final MenuType<ExtremeCraftingTableGuiMenu> EXTREME_CRAFTING_TABLE_GUI = register("extreme_crafting_table_gui",
			(id, inv, extraData) -> new ExtremeCraftingTableGuiMenu(id, inv, extraData));
	public static final MenuType<NeutroniumCompressorGuiMenu> NEUTRONIUM_COMPRESSOR_GUI = register("neutronium_compressor_gui",
			(id, inv, extraData) -> new NeutroniumCompressorGuiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}

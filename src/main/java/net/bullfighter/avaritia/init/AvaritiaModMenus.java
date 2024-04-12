
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.bullfighter.avaritia.world.inventory.NeutroniumCompressorGuiMenu;
import net.bullfighter.avaritia.world.inventory.NeutronCollectorGuiMenu;
import net.bullfighter.avaritia.world.inventory.ExtremeCraftingTableGuiMenu;
import net.bullfighter.avaritia.AvaritiaMod;

public class AvaritiaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, AvaritiaMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<NeutronCollectorGuiMenu>> NEUTRON_COLLECTOR_GUI = REGISTRY.register("neutron_collector_gui", () -> IMenuTypeExtension.create(NeutronCollectorGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ExtremeCraftingTableGuiMenu>> EXTREME_CRAFTING_TABLE_GUI = REGISTRY.register("extreme_crafting_table_gui", () -> IMenuTypeExtension.create(ExtremeCraftingTableGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<NeutroniumCompressorGuiMenu>> NEUTRONIUM_COMPRESSOR_GUI = REGISTRY.register("neutronium_compressor_gui", () -> IMenuTypeExtension.create(NeutroniumCompressorGuiMenu::new));
}

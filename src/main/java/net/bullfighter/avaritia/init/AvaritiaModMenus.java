
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.bullfighter.avaritia.world.inventory.NeutroniumCompressorGuiMenu;
import net.bullfighter.avaritia.world.inventory.NeutronCollectorGuiMenu;
import net.bullfighter.avaritia.world.inventory.ExtremeCraftingTableGuiMenu;
import net.bullfighter.avaritia.AvaritiaMod;

public class AvaritiaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AvaritiaMod.MODID);
	public static final RegistryObject<MenuType<NeutronCollectorGuiMenu>> NEUTRON_COLLECTOR_GUI = REGISTRY.register("neutron_collector_gui", () -> IForgeMenuType.create(NeutronCollectorGuiMenu::new));
	public static final RegistryObject<MenuType<ExtremeCraftingTableGuiMenu>> EXTREME_CRAFTING_TABLE_GUI = REGISTRY.register("extreme_crafting_table_gui", () -> IForgeMenuType.create(ExtremeCraftingTableGuiMenu::new));
	public static final RegistryObject<MenuType<NeutroniumCompressorGuiMenu>> NEUTRONIUM_COMPRESSOR_GUI = REGISTRY.register("neutronium_compressor_gui", () -> IForgeMenuType.create(NeutroniumCompressorGuiMenu::new));
}

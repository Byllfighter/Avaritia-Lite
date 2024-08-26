
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.bullfighter.avaritia.client.gui.NeutroniumCompressorGuiScreen;
import net.bullfighter.avaritia.client.gui.NeutronCollectorGuiScreen;
import net.bullfighter.avaritia.client.gui.ExtremeCraftingTableGuiScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AvaritiaModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(AvaritiaModMenus.NEUTRON_COLLECTOR_GUI.get(), NeutronCollectorGuiScreen::new);
		event.register(AvaritiaModMenus.EXTREME_CRAFTING_TABLE_GUI.get(), ExtremeCraftingTableGuiScreen::new);
		event.register(AvaritiaModMenus.NEUTRONIUM_COMPRESSOR_GUI.get(), NeutroniumCompressorGuiScreen::new);
	}
}

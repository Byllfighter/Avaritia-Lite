
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.bullfighter.avaritia.client.gui.NeutroniumCompressorGuiScreen;
import net.bullfighter.avaritia.client.gui.NeutronCollectorGuiScreen;
import net.bullfighter.avaritia.client.gui.ExtremeCraftingTableGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AvaritiaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AvaritiaModMenus.NEUTRON_COLLECTOR_GUI, NeutronCollectorGuiScreen::new);
			MenuScreens.register(AvaritiaModMenus.EXTREME_CRAFTING_TABLE_GUI, ExtremeCraftingTableGuiScreen::new);
			MenuScreens.register(AvaritiaModMenus.NEUTRONIUM_COMPRESSOR_GUI, NeutroniumCompressorGuiScreen::new);
		});
	}
}

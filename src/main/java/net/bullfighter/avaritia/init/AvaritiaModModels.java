
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.bullfighter.avaritia.client.model.Modellongbowoftheheavensprojectile;
import net.bullfighter.avaritia.client.model.Modelinfinitywings;
import net.bullfighter.avaritia.client.model.Modelinfinityeyes;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AvaritiaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelinfinitywings.LAYER_LOCATION, Modelinfinitywings::createBodyLayer);
		event.registerLayerDefinition(Modelinfinityeyes.LAYER_LOCATION, Modelinfinityeyes::createBodyLayer);
		event.registerLayerDefinition(Modellongbowoftheheavensprojectile.LAYER_LOCATION, Modellongbowoftheheavensprojectile::createBodyLayer);
	}
}

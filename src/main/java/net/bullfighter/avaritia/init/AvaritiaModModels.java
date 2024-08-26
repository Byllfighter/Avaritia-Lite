
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.bullfighter.avaritia.client.model.Modellongbowoftheheavensprojectile;
import net.bullfighter.avaritia.client.model.Modelinfinitywings;
import net.bullfighter.avaritia.client.model.Modelinfinityeyes;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AvaritiaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelinfinitywings.LAYER_LOCATION, Modelinfinitywings::createBodyLayer);
		event.registerLayerDefinition(Modelinfinityeyes.LAYER_LOCATION, Modelinfinityeyes::createBodyLayer);
		event.registerLayerDefinition(Modellongbowoftheheavensprojectile.LAYER_LOCATION, Modellongbowoftheheavensprojectile::createBodyLayer);
	}
}

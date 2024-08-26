
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.bullfighter.avaritia.client.renderer.LongbowoftheHeavensProjectileRenderer;
import net.bullfighter.avaritia.client.renderer.BlackHoleRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AvaritiaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AvaritiaModEntities.BLACK_HOLE.get(), BlackHoleRenderer::new);
		event.registerEntityRenderer(AvaritiaModEntities.LONGBOWOFTHE_HEAVENS_PROJECTILE.get(), LongbowoftheHeavensProjectileRenderer::new);
		event.registerEntityRenderer(AvaritiaModEntities.ENDEST_PEARL_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}

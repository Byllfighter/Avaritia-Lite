
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.bullfighter.avaritia.client.renderer.BlackHoleRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AvaritiaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AvaritiaModEntities.BLACK_HOLE.get(), BlackHoleRenderer::new);
		event.registerEntityRenderer(AvaritiaModEntities.ENDEST_PEARL_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AvaritiaModEntities.LONGBOWOFTHE_HEAVENS_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}

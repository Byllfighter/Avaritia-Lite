package net.bullfighter.avaritia.procedures;

import net.neoforged.neoforge.client.event.RenderLivingEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.Minecraft;

import net.bullfighter.avaritia.init.AvaritiaModItems;
import net.bullfighter.avaritia.client.model.Modelinfinitywings;
import net.bullfighter.avaritia.client.model.Modelinfinityeyes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class PlayerRenderProcedure {
	@SubscribeEvent
	public static void KleidersRenderEvent(RenderLivingEvent.Pre event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (ModList.get().isLoaded("kleiders_custom_renderer")) {
			RenderLivingEvent _evt = (RenderLivingEvent) event;
			Minecraft mc = Minecraft.getInstance();
			EntityRenderDispatcher dis = Minecraft.getInstance().getEntityRenderDispatcher();
			EntityRendererProvider.Context context = new EntityRendererProvider.Context(dis, mc.getItemRenderer(), mc.getBlockRenderer(), dis.getItemInHandRenderer(), mc.getResourceManager(), mc.getEntityModels(), mc.font);
			if (entity instanceof Player || entity instanceof ServerPlayer) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_ARMOR_CHESTPLATE.get()) {
					if (entity instanceof Player _player) {
						if (_player.getAbilities().flying) {
							if (_evt.getRenderer() instanceof PlayerRenderer) {
								if (_evt instanceof RenderLivingEvent.Pre _pre) {
									// _pre.setCanceled(true);
								}
								new com.kleiders.kleidersplayerrenderer.KleidersPlayerRenderer(context, new ResourceLocation("avaritia:textures/models/armor/infinity_armor_wing.png"),
										new Modelinfinitywings(context.bakeLayer(Modelinfinitywings.LAYER_LOCATION)))
										.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
							}
						}
					}
				}
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_ARMOR_HELMET.get()
						&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_ARMOR_CHESTPLATE.get()
						&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_ARMOR_LEGGINGS.get()
						&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_ARMOR_BOOTS.get()) {
					if (_evt.getRenderer() instanceof PlayerRenderer) {
						if (_evt instanceof RenderLivingEvent.Pre _pre) {
							// _pre.setCanceled(true);
						}
						new com.kleiders.kleidersplayerrenderer.KleidersPlayerRenderer(context,
								new ResourceLocation(("avaritia:textures/models/armor/infinity_eyes_" + new java.text.DecimalFormat("##").format(entity.getPersistentData().getDouble("infinityEyeFrame")) + ".png")),
								new Modelinfinityeyes(context.bakeLayer(Modelinfinityeyes.LAYER_LOCATION)))
								.render((AbstractClientPlayer) _evt.getEntity(), _evt.getEntity().getYRot(), _evt.getPartialTick(), _evt.getPoseStack(), _evt.getMultiBufferSource(), _evt.getPackedLight());
					}
				}
			}
		}
	}
}

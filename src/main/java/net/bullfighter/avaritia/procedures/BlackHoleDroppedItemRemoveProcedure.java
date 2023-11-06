package net.bullfighter.avaritia.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.bullfighter.avaritia.init.AvaritiaModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BlackHoleDroppedItemRemoveProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ItemEntity) {
			if ((entity instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.BLACK_HOLE_ITEM.get()) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}

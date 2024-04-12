package net.bullfighter.avaritia.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.nbt.CompoundTag;

import net.bullfighter.avaritia.init.AvaritiaModItems;

public class PlanetEaterRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack hammer = ItemStack.EMPTY;
		hammer = new ItemStack(AvaritiaModItems.PLANET_EATER_DESTROYER.get());
		{
			CompoundTag _nbtTag = itemstack.getTag();
			if (_nbtTag != null)
				hammer.setTag(_nbtTag.copy());
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.PLANET_EATER.get()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = hammer;
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.PLANET_EATER.get()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = hammer;
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}

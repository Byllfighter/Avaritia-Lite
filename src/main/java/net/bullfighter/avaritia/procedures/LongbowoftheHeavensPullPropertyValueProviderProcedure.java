package net.bullfighter.avaritia.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class LongbowoftheHeavensPullPropertyValueProviderProcedure {
	public static double execute(Entity entity, ItemStack itemstack) {
		if (entity == null) {
			return 0.0F;
		} else {
			return ((LivingEntity)entity).getUseItem() != itemstack ? 0.0F : (float)(itemstack.getUseDuration() - ((LivingEntity)entity).getUseItemRemainingTicks()) / 10.0F;
		}
	}
}

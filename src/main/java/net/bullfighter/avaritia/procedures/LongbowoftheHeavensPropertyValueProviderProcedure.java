package net.bullfighter.avaritia.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class LongbowoftheHeavensPropertyValueProviderProcedure {
	public static double execute(Entity entity, ItemStack itemstack) {
		return entity != null && ((LivingEntity)entity).isUsingItem() && ((LivingEntity)entity).getUseItem() == itemstack ? 1.0F : 0.0F;
	}
}

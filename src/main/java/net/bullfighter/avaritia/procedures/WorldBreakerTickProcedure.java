package net.bullfighter.avaritia.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.Registries;

public class WorldBreakerTickProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		MendProcedure.execute(world, itemstack);
		if (!(itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)) != 0)) {
			itemstack.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE), 10);
		}
	}
}

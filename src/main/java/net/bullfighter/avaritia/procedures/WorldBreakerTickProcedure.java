package net.bullfighter.avaritia.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

public class WorldBreakerTickProcedure {
	public static void execute(ItemStack itemstack) {
		MendProcedure.execute(itemstack);
		if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)) {
			(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 10);
		}
	}
}

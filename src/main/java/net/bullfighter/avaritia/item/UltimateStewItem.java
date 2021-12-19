
package net.bullfighter.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.bullfighter.avaritia.procedures.UltimateStewEatenProcedure;
import net.bullfighter.avaritia.init.AvaritiaModTabs;

public class UltimateStewItem extends Item {
	public UltimateStewItem() {
		super(new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIATAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(999).saturationMod(999f).alwaysEat()

						.build()));
		setRegistryName("ultimate_stew");
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		UltimateStewEatenProcedure.execute(entity);
		return retval;
	}
}


package net.bullfighter.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.bullfighter.avaritia.procedures.CosmicMeatballsEatenProcedure;
import net.bullfighter.avaritia.init.AvaritiaModTabs;

public class CosmicMeatballsItem extends Item {
	public CosmicMeatballsItem() {
		super(new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIATAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(999).saturationMod(999f).alwaysEat().meat().build()));
		setRegistryName("cosmic_meatballs");
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CosmicMeatballsEatenProcedure.execute(entity);
		return retval;
	}
}

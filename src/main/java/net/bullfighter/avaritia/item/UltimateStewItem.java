package net.bullfighter.avaritia.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.bullfighter.avaritia.procedures.UltimateStewEatenProcedure;

public class UltimateStewItem extends Item {
	public UltimateStewItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(999).saturationModifier(999f).alwaysEdible().build()));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0f;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		UltimateStewEatenProcedure.execute(entity);
		return retval;
	}
}
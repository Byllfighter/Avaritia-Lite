
package net.bullfighter.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.bullfighter.avaritia.procedures.SwordoftheCosmosKillProcedure;
import net.bullfighter.avaritia.procedures.MendProcedure;

import java.util.List;

public class SwordoftheCosmosItem extends SwordItem {
	public SwordoftheCosmosItem() {
		super(new Tier() {
			public int getUses() {
				return (int) Double.POSITIVE_INFINITY;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return (float) Double.POSITIVE_INFINITY;
			}

			public int getLevel() {
				return (int) Double.POSITIVE_INFINITY;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -1f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SwordoftheCosmosKillProcedure.execute(entity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			MendProcedure.execute(itemstack);
	}
}

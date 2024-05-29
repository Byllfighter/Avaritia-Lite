
package net.bullfighter.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.bullfighter.avaritia.procedures.NaturesRuinRightclickedProcedure;
import net.bullfighter.avaritia.procedures.MendProcedure;

public class NaturesRuinItem extends AxeItem {
	public NaturesRuinItem() {
		super(new Tier() {
			public int getUses() {
				return (int) Double.POSITIVE_INFINITY;
			}

			public float getSpeed() {
				return (float) Double.POSITIVE_INFINITY;
			}

			public float getAttackDamageBonus() {
				return 19f;
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
		}, 1, -3f, new Item.Properties());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		NaturesRuinRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			MendProcedure.execute(itemstack);
	}
}

package net.bullfighter.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.bullfighter.avaritia.procedures.SwordoftheCosmosKillProcedure;
import net.bullfighter.avaritia.procedures.MendProcedure;

public class SwordoftheCosmosItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, (int) Double.POSITIVE_INFINITY, 0f, 0, 100, TagKey.create(Registries.ITEM, ResourceLocation.parse("avaritia:swordofthe_cosmos_repair_items")));

	public SwordoftheCosmosItem(Item.Properties properties) {
		super(TOOL_MATERIAL, (float) Double.POSITIVE_INFINITY, -1f, properties);
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		SwordoftheCosmosKillProcedure.execute(entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			MendProcedure.execute(world, itemstack);
	}
}
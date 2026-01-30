package net.bullfighter.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.bullfighter.avaritia.procedures.MendProcedure;

public class HoeoftheGreenEarthItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 100, 1f, 0, 100, TagKey.create(Registries.ITEM, ResourceLocation.parse("avaritia:hoeofthe_green_earth_repair_items")));

	public HoeoftheGreenEarthItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8f, -3f, properties);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			MendProcedure.execute(world, itemstack);
	}
}
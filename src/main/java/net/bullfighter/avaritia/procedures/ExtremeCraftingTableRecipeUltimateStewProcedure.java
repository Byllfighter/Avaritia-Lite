package net.bullfighter.avaritia.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.bullfighter.avaritia.ExtremeCraftingTableRecipeShapeless;
import net.bullfighter.avaritia.ExtremeCraftingTableRecipeUltimateStewEvent;
import net.bullfighter.avaritia.init.AvaritiaModItems;

import java.util.List;
import java.util.ArrayList;

public class ExtremeCraftingTableRecipeUltimateStewProcedure {
    public static void execute(Entity entity) {
		if (entity == null)
			return;

        final List<ItemStack> requiredItems = new ArrayList<>();
        requiredItems.add(new ItemStack(AvaritiaModItems.PILEOF_NEUTRONS.get()));
        requiredItems.add(new ItemStack(Items.WHEAT));
        requiredItems.add(new ItemStack(Items.WHEAT));
        requiredItems.add(new ItemStack(Items.CARROT));
        requiredItems.add(new ItemStack(Items.CARROT));
        requiredItems.add(new ItemStack(Items.POTATO));
        requiredItems.add(new ItemStack(Items.POTATO));
        requiredItems.add(new ItemStack(Items.BEETROOT));
        requiredItems.add(new ItemStack(Items.BEETROOT));
        requiredItems.add(new ItemStack(Items.APPLE));
        requiredItems.add(new ItemStack(Items.APPLE));
        requiredItems.add(new ItemStack(Items.MELON));
        requiredItems.add(new ItemStack(Items.MELON));
        requiredItems.add(new ItemStack(Items.PUMPKIN));
        requiredItems.add(new ItemStack(Items.PUMPKIN));
		requiredItems.add(new ItemStack(Items.CACTUS));
		requiredItems.add(new ItemStack(Items.CACTUS));
		requiredItems.add(new ItemStack(Items.RED_MUSHROOM));
		requiredItems.add(new ItemStack(Items.RED_MUSHROOM));
		requiredItems.add(new ItemStack(Items.BROWN_MUSHROOM));
		requiredItems.add(new ItemStack(Items.BROWN_MUSHROOM));
        MinecraftForge.EVENT_BUS.post(new ExtremeCraftingTableRecipeUltimateStewEvent(entity, requiredItems));

        ExtremeCraftingTableRecipeShapeless.execute(entity, requiredItems, new ItemStack(AvaritiaModItems.ULTIMATE_STEW.get(), 4));
    }
}

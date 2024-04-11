package net.bullfighter.avaritia.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.bullfighter.avaritia.ExtremeCraftingTableRecipeCosmicMeatballsEvent;
import net.bullfighter.avaritia.ExtremeCraftingTableRecipeShapeless;
import net.bullfighter.avaritia.init.AvaritiaModItems;

import java.util.List;
import java.util.ArrayList;

public class ExtremeCraftingTableRecipeCosmicMeatballsProcedure {
    public static void execute(Entity entity) {
		if (entity == null)
			return;

        final List<ItemStack> requiredItems = new ArrayList<>();
        requiredItems.add(new ItemStack(AvaritiaModItems.PILEOF_NEUTRONS.get()));
        requiredItems.add(new ItemStack(Items.BEEF));
        requiredItems.add(new ItemStack(Items.BEEF));
        requiredItems.add(new ItemStack(Items.CHICKEN));
        requiredItems.add(new ItemStack(Items.CHICKEN));
        requiredItems.add(new ItemStack(Items.PORKCHOP));
        requiredItems.add(new ItemStack(Items.PORKCHOP));
        requiredItems.add(new ItemStack(Items.RABBIT));
        requiredItems.add(new ItemStack(Items.RABBIT));
        requiredItems.add(new ItemStack(Items.COD));
        requiredItems.add(new ItemStack(Items.COD));
        requiredItems.add(new ItemStack(Items.SALMON));
        requiredItems.add(new ItemStack(Items.SALMON));
        requiredItems.add(new ItemStack(Items.MUTTON));
        requiredItems.add(new ItemStack(Items.MUTTON));
        MinecraftForge.EVENT_BUS.post(new ExtremeCraftingTableRecipeCosmicMeatballsEvent(entity, requiredItems));

        ExtremeCraftingTableRecipeShapeless.execute(entity, requiredItems, new ItemStack(AvaritiaModItems.COSMIC_MEATBALLS.get(), 2));
    }
}

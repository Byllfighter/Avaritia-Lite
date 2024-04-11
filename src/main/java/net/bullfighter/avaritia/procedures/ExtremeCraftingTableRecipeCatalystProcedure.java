package net.bullfighter.avaritia.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.bullfighter.avaritia.ExtremeCraftingTableRecipeCatalystEvent;
import net.bullfighter.avaritia.ExtremeCraftingTableRecipeShapeless;
import net.bullfighter.avaritia.init.AvaritiaModItems;

import java.util.List;
import java.util.ArrayList;

public class ExtremeCraftingTableRecipeCatalystProcedure {
    public static void execute(Entity entity) {
		if (entity == null)
			return;

        final List<ItemStack> requiredItems = new ArrayList<>();
        requiredItems.add(new ItemStack(AvaritiaModItems.DIAMOND_LATTICE.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.CRYSTAL_MATRIX_INGOT.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.PILEOF_NEUTRONS.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.NEUTRONIUM_NUGGET.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.NEUTRONIUM_INGOT.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.ULTIMATE_STEW.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.COSMIC_MEATBALLS.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.ENDEST_PEARL.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.RECORD_FRAGMENT.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.IRON_SINGULARITY.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.GOLDEN_SINGULARITY.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.LAPIS_SINGULARITY.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.REDSTONE_SINGULARITY.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.NETHER_QUARTZ_SINGULARITY.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.DIAMOND_SINGULARITY.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.EMERALD_SINGULARITY.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.COPPER_SINGULARITY.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.AMETHYST_SINGULARITY.get()));
        requiredItems.add(new ItemStack(AvaritiaModItems.NETHERITE_SINGULARITY.get()));
        MinecraftForge.EVENT_BUS.post(new ExtremeCraftingTableRecipeCatalystEvent(entity, requiredItems));

        ExtremeCraftingTableRecipeShapeless.execute(entity, requiredItems, new ItemStack(AvaritiaModItems.INFINITY_CATALYST.get(), 1));
    }
}

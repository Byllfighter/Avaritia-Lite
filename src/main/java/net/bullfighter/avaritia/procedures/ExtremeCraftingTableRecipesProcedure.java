package net.bullfighter.avaritia.procedures;

import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.entity.Entity;

import net.bullfighter.avaritia.ExtremeCraftingTableRecipeEvent;

public class ExtremeCraftingTableRecipesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		MinecraftForge.EVENT_BUS.post(new ExtremeCraftingTableRecipeEvent(entity));
		ExtremeCraftingTableRecipeProcedure.execute(entity);
		ExtremeCraftingTableRecipe2Procedure.execute(entity);
		ExtremeCraftingTableRecipe3Procedure.execute(entity);
		ExtremeCraftingTableRecipe4Procedure.execute(entity);
		ExtremeCraftingTableRecipe5Procedure.execute(entity);
		ExtremeCraftingTableRecipe6Procedure.execute(entity);
		ExtremeCraftingTableRecipeCatalystProcedure.execute(entity);
		ExtremeCraftingTableRecipeCosmicMeatballsProcedure.execute(entity);
		ExtremeCraftingTableRecipeUltimateStewProcedure.execute(entity);
	}
}

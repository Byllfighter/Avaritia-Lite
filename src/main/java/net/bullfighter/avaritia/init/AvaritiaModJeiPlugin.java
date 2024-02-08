
package net.bullfighter.avaritia.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.bullfighter.avaritia.jei_recipes.ExtremeCraftingTableJEIRecipeCategory;
import net.bullfighter.avaritia.jei_recipes.ExtremeCraftingTableJEIRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class AvaritiaModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<ExtremeCraftingTableJEIRecipe> ExtremeCraftingTableJEI_Type = new mezz.jei.api.recipe.RecipeType<>(ExtremeCraftingTableJEIRecipeCategory.UID, ExtremeCraftingTableJEIRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("avaritia:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new ExtremeCraftingTableJEIRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<ExtremeCraftingTableJEIRecipe> ExtremeCraftingTableJEIRecipes = recipeManager.getAllRecipesFor(ExtremeCraftingTableJEIRecipe.Type.INSTANCE);
		registration.addRecipes(ExtremeCraftingTableJEI_Type, ExtremeCraftingTableJEIRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(AvaritiaModBlocks.EXTREME_CRAFTING_TABLE.get().asItem()), ExtremeCraftingTableJEI_Type);
	}
}

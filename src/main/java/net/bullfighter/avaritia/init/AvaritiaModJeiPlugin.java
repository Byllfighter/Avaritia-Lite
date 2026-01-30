package net.bullfighter.avaritia.init;

import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;

import net.bullfighter.avaritia.jei_recipes.ExtremeCraftingTableJEIRecipeCategory;
import net.bullfighter.avaritia.jei_recipes.ExtremeCraftingTableJEIRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.stream.Collectors;
import java.util.List;

@JeiPlugin
public class AvaritiaModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<ExtremeCraftingTableJEIRecipe> ExtremeCraftingTableJEI_Type = new mezz.jei.api.recipe.RecipeType<>(ExtremeCraftingTableJEIRecipeCategory.UID, ExtremeCraftingTableJEIRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("avaritia:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new ExtremeCraftingTableJEIRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		List<ExtremeCraftingTableJEIRecipe> ExtremeCraftingTableJEIRecipes = AvaritiaModRecipeTypes.recipes.byType(ExtremeCraftingTableJEIRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
		registration.addRecipes(ExtremeCraftingTableJEI_Type, ExtremeCraftingTableJEIRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(AvaritiaModBlocks.EXTREME_CRAFTING_TABLE.get().asItem()), ExtremeCraftingTableJEI_Type);
	}
}
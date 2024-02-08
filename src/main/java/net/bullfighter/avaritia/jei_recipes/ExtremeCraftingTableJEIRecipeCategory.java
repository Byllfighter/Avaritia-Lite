
package net.bullfighter.avaritia.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.bullfighter.avaritia.init.AvaritiaModJeiPlugin;
import net.bullfighter.avaritia.init.AvaritiaModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class ExtremeCraftingTableJEIRecipeCategory implements IRecipeCategory<ExtremeCraftingTableJEIRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("avaritia", "extreme_crafting_table_jei");
	public final static ResourceLocation TEXTURE = new ResourceLocation("avaritia", "textures/screens/extreme_crafting_table_gui_jei.png");
	private final IDrawable background;
	private final IDrawable icon;

	public ExtremeCraftingTableJEIRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 260, 200);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(AvaritiaModBlocks.EXTREME_CRAFTING_TABLE.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<ExtremeCraftingTableJEIRecipe> getRecipeType() {
		return AvaritiaModJeiPlugin.ExtremeCraftingTableJEI_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Extreme Crafting Table");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, ExtremeCraftingTableJEIRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 19, 24).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 24).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 228, 97).addItemStack(recipe.getResultItem(null));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 24).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 24).addIngredients(recipe.getIngredients().get(3));
		builder.addSlot(RecipeIngredientRole.INPUT, 91, 24).addIngredients(recipe.getIngredients().get(4));
		builder.addSlot(RecipeIngredientRole.INPUT, 109, 24).addIngredients(recipe.getIngredients().get(5));
		builder.addSlot(RecipeIngredientRole.INPUT, 127, 24).addIngredients(recipe.getIngredients().get(6));
		builder.addSlot(RecipeIngredientRole.INPUT, 145, 24).addIngredients(recipe.getIngredients().get(7));
		builder.addSlot(RecipeIngredientRole.INPUT, 163, 24).addIngredients(recipe.getIngredients().get(8));
		builder.addSlot(RecipeIngredientRole.INPUT, 19, 42).addIngredients(recipe.getIngredients().get(9));
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 42).addIngredients(recipe.getIngredients().get(10));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 42).addIngredients(recipe.getIngredients().get(11));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 42).addIngredients(recipe.getIngredients().get(12));
		builder.addSlot(RecipeIngredientRole.INPUT, 91, 42).addIngredients(recipe.getIngredients().get(13));
		builder.addSlot(RecipeIngredientRole.INPUT, 109, 42).addIngredients(recipe.getIngredients().get(14));
		builder.addSlot(RecipeIngredientRole.INPUT, 127, 42).addIngredients(recipe.getIngredients().get(15));
		builder.addSlot(RecipeIngredientRole.INPUT, 145, 42).addIngredients(recipe.getIngredients().get(16));
		builder.addSlot(RecipeIngredientRole.INPUT, 163, 42).addIngredients(recipe.getIngredients().get(17));
		builder.addSlot(RecipeIngredientRole.INPUT, 19, 60).addIngredients(recipe.getIngredients().get(18));
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 60).addIngredients(recipe.getIngredients().get(19));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 60).addIngredients(recipe.getIngredients().get(20));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 60).addIngredients(recipe.getIngredients().get(21));
		builder.addSlot(RecipeIngredientRole.INPUT, 91, 60).addIngredients(recipe.getIngredients().get(22));
		builder.addSlot(RecipeIngredientRole.INPUT, 109, 60).addIngredients(recipe.getIngredients().get(23));
		builder.addSlot(RecipeIngredientRole.INPUT, 127, 60).addIngredients(recipe.getIngredients().get(24));
		builder.addSlot(RecipeIngredientRole.INPUT, 145, 60).addIngredients(recipe.getIngredients().get(25));
		builder.addSlot(RecipeIngredientRole.INPUT, 163, 60).addIngredients(recipe.getIngredients().get(26));
		builder.addSlot(RecipeIngredientRole.INPUT, 19, 78).addIngredients(recipe.getIngredients().get(27));
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 78).addIngredients(recipe.getIngredients().get(28));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 78).addIngredients(recipe.getIngredients().get(29));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 78).addIngredients(recipe.getIngredients().get(30));
		builder.addSlot(RecipeIngredientRole.INPUT, 91, 78).addIngredients(recipe.getIngredients().get(31));
		builder.addSlot(RecipeIngredientRole.INPUT, 109, 78).addIngredients(recipe.getIngredients().get(32));
		builder.addSlot(RecipeIngredientRole.INPUT, 127, 78).addIngredients(recipe.getIngredients().get(33));
		builder.addSlot(RecipeIngredientRole.INPUT, 145, 78).addIngredients(recipe.getIngredients().get(34));
		builder.addSlot(RecipeIngredientRole.INPUT, 163, 78).addIngredients(recipe.getIngredients().get(35));
		builder.addSlot(RecipeIngredientRole.INPUT, 19, 96).addIngredients(recipe.getIngredients().get(36));
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 96).addIngredients(recipe.getIngredients().get(37));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 96).addIngredients(recipe.getIngredients().get(38));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 96).addIngredients(recipe.getIngredients().get(39));
		builder.addSlot(RecipeIngredientRole.INPUT, 91, 96).addIngredients(recipe.getIngredients().get(40));
		builder.addSlot(RecipeIngredientRole.INPUT, 109, 96).addIngredients(recipe.getIngredients().get(41));
		builder.addSlot(RecipeIngredientRole.INPUT, 127, 96).addIngredients(recipe.getIngredients().get(42));
		builder.addSlot(RecipeIngredientRole.INPUT, 145, 96).addIngredients(recipe.getIngredients().get(43));
		builder.addSlot(RecipeIngredientRole.INPUT, 163, 96).addIngredients(recipe.getIngredients().get(44));
		builder.addSlot(RecipeIngredientRole.INPUT, 19, 114).addIngredients(recipe.getIngredients().get(45));
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 114).addIngredients(recipe.getIngredients().get(46));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 114).addIngredients(recipe.getIngredients().get(47));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 114).addIngredients(recipe.getIngredients().get(48));
		builder.addSlot(RecipeIngredientRole.INPUT, 91, 114).addIngredients(recipe.getIngredients().get(49));
		builder.addSlot(RecipeIngredientRole.INPUT, 109, 114).addIngredients(recipe.getIngredients().get(50));
		builder.addSlot(RecipeIngredientRole.INPUT, 127, 114).addIngredients(recipe.getIngredients().get(51));
		builder.addSlot(RecipeIngredientRole.INPUT, 145, 114).addIngredients(recipe.getIngredients().get(52));
		builder.addSlot(RecipeIngredientRole.INPUT, 163, 114).addIngredients(recipe.getIngredients().get(53));
		builder.addSlot(RecipeIngredientRole.INPUT, 19, 132).addIngredients(recipe.getIngredients().get(54));
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 132).addIngredients(recipe.getIngredients().get(55));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 132).addIngredients(recipe.getIngredients().get(56));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 132).addIngredients(recipe.getIngredients().get(57));
		builder.addSlot(RecipeIngredientRole.INPUT, 91, 132).addIngredients(recipe.getIngredients().get(58));
		builder.addSlot(RecipeIngredientRole.INPUT, 109, 132).addIngredients(recipe.getIngredients().get(59));
		builder.addSlot(RecipeIngredientRole.INPUT, 127, 132).addIngredients(recipe.getIngredients().get(60));
		builder.addSlot(RecipeIngredientRole.INPUT, 145, 132).addIngredients(recipe.getIngredients().get(61));
		builder.addSlot(RecipeIngredientRole.INPUT, 163, 132).addIngredients(recipe.getIngredients().get(62));
		builder.addSlot(RecipeIngredientRole.INPUT, 19, 150).addIngredients(recipe.getIngredients().get(63));
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 150).addIngredients(recipe.getIngredients().get(64));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 150).addIngredients(recipe.getIngredients().get(65));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 150).addIngredients(recipe.getIngredients().get(66));
		builder.addSlot(RecipeIngredientRole.INPUT, 91, 150).addIngredients(recipe.getIngredients().get(67));
		builder.addSlot(RecipeIngredientRole.INPUT, 109, 150).addIngredients(recipe.getIngredients().get(68));
		builder.addSlot(RecipeIngredientRole.INPUT, 127, 150).addIngredients(recipe.getIngredients().get(69));
		builder.addSlot(RecipeIngredientRole.INPUT, 145, 150).addIngredients(recipe.getIngredients().get(70));
		builder.addSlot(RecipeIngredientRole.INPUT, 163, 150).addIngredients(recipe.getIngredients().get(71));
		builder.addSlot(RecipeIngredientRole.INPUT, 19, 168).addIngredients(recipe.getIngredients().get(72));
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 168).addIngredients(recipe.getIngredients().get(73));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 168).addIngredients(recipe.getIngredients().get(74));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 168).addIngredients(recipe.getIngredients().get(75));
		builder.addSlot(RecipeIngredientRole.INPUT, 91, 168).addIngredients(recipe.getIngredients().get(76));
		builder.addSlot(RecipeIngredientRole.INPUT, 109, 168).addIngredients(recipe.getIngredients().get(77));
		builder.addSlot(RecipeIngredientRole.INPUT, 127, 168).addIngredients(recipe.getIngredients().get(78));
		builder.addSlot(RecipeIngredientRole.INPUT, 145, 168).addIngredients(recipe.getIngredients().get(79));
		builder.addSlot(RecipeIngredientRole.INPUT, 163, 168).addIngredients(recipe.getIngredients().get(80));
	}
}

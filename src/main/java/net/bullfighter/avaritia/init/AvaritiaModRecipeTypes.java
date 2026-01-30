package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.OnDatapackSyncEvent;
import net.neoforged.neoforge.client.event.RecipesReceivedEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeMap;
import net.minecraft.core.registries.BuiltInRegistries;

import net.bullfighter.avaritia.jei_recipes.ExtremeCraftingTableJEIRecipe;
import net.bullfighter.avaritia.AvaritiaMod;

@EventBusSubscriber(modid = AvaritiaMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class AvaritiaModRecipeTypes {
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, "avaritia");
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, "avaritia");
	public static RecipeMap recipes = null;

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = ModList.get().getModContainerById("avaritia").get().getEventBus();
		event.enqueueWork(() -> {
			RECIPE_TYPES.register(bus);
			SERIALIZERS.register(bus);
			RECIPE_TYPES.register("extreme_crafting_table_jei", () -> ExtremeCraftingTableJEIRecipe.Type.INSTANCE);
			SERIALIZERS.register("extreme_crafting_table_jei", () -> ExtremeCraftingTableJEIRecipe.Serializer.INSTANCE);
		});
	}

	@EventBusSubscriber
	private static class Fetcher {
		@SubscribeEvent
		public static void syncRecipes(OnDatapackSyncEvent event) {
			event.sendRecipes(ExtremeCraftingTableJEIRecipe.Type.INSTANCE);
		}

		@OnlyIn(Dist.CLIENT)
		@SubscribeEvent
		public static void receiveRecipes(RecipesReceivedEvent event) {
			recipes = event.getRecipeMap();
		}

		@OnlyIn(Dist.CLIENT)
		@SubscribeEvent
		public static void clearRecipes(ClientPlayerNetworkEvent.LoggingOut event) {
			recipes = null;
		}
	}
}
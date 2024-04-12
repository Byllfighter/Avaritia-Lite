package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.core.registries.BuiltInRegistries;

import net.bullfighter.avaritia.jei_recipes.ExtremeCraftingTableJEIRecipe;
import net.bullfighter.avaritia.AvaritiaMod;

@Mod.EventBusSubscriber(modid = AvaritiaMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, "avaritia");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("extreme_crafting_table_jei", () -> ExtremeCraftingTableJEIRecipe.Serializer.INSTANCE);
		});
	}
}

package net.bullfighter.avaritia.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.bullfighter.avaritia.jei_recipes.ExtremeCraftingTableJEIRecipe;
import net.bullfighter.avaritia.AvaritiaMod;

@Mod.EventBusSubscriber(modid = AvaritiaMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "avaritia");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("extreme_crafting_table_jei", () -> ExtremeCraftingTableJEIRecipe.Serializer.INSTANCE);
		});
	}
}

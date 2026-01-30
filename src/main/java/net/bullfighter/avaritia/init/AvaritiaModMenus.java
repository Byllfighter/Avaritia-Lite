/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.avaritia.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.bullfighter.avaritia.world.inventory.NeutroniumCompressorGuiMenu;
import net.bullfighter.avaritia.world.inventory.NeutronCollectorGuiMenu;
import net.bullfighter.avaritia.world.inventory.ExtremeCraftingTableGuiMenu;
import net.bullfighter.avaritia.network.MenuStateUpdateMessage;
import net.bullfighter.avaritia.AvaritiaMod;

import java.util.Map;

public class AvaritiaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, AvaritiaMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<NeutronCollectorGuiMenu>> NEUTRON_COLLECTOR_GUI = REGISTRY.register("neutron_collector_gui", () -> IMenuTypeExtension.create(NeutronCollectorGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ExtremeCraftingTableGuiMenu>> EXTREME_CRAFTING_TABLE_GUI = REGISTRY.register("extreme_crafting_table_gui", () -> IMenuTypeExtension.create(ExtremeCraftingTableGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<NeutroniumCompressorGuiMenu>> NEUTRONIUM_COMPRESSOR_GUI = REGISTRY.register("neutronium_compressor_gui", () -> IMenuTypeExtension.create(NeutroniumCompressorGuiMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof AvaritiaModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				PacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}
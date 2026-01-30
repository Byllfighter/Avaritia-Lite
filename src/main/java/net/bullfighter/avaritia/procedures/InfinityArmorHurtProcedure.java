package net.bullfighter.avaritia.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.client.Minecraft;

import net.bullfighter.avaritia.init.AvaritiaModItems;

public class InfinityArmorHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (getEntityGameType(entity) == GameType.SURVIVAL || getEntityGameType(entity) == GameType.ADVENTURE) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.SWORDOFTHE_COSMOS.get()) {
				if ((entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler4 ? _modHandler4.getStackInSlot(103).copy() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_ARMOR_HELMET.get()
						&& (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler6 ? _modHandler6.getStackInSlot(102).copy() : ItemStack.EMPTY)
								.getItem() == AvaritiaModItems.INFINITY_ARMOR_CHESTPLATE.get()
						&& (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler8 ? _modHandler8.getStackInSlot(101).copy() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_ARMOR_LEGGINGS
								.get()
						&& (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler10 ? _modHandler10.getStackInSlot(100).copy() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_ARMOR_BOOTS
								.get()
						|| (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler12 ? _modHandler12.getStackInSlot(39).copy() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_ARMOR_HELMET
								.get()
								&& (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler14 ? _modHandler14.getStackInSlot(38).copy() : ItemStack.EMPTY)
										.getItem() == AvaritiaModItems.INFINITY_ARMOR_CHESTPLATE.get()
								&& (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler16 ? _modHandler16.getStackInSlot(37).copy() : ItemStack.EMPTY)
										.getItem() == AvaritiaModItems.INFINITY_ARMOR_LEGGINGS.get()
								&& (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler18 ? _modHandler18.getStackInSlot(36).copy() : ItemStack.EMPTY)
										.getItem() == AvaritiaModItems.INFINITY_ARMOR_BOOTS.get()) {
					if (entity instanceof Player _player) {
						_player.getAbilities().invulnerable = false;
						_player.onUpdateAbilities();
					}
					entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.PLAYER_EXPLOSION), sourceentity), 4);
					if (entity instanceof Player _player) {
						_player.getAbilities().invulnerable = true;
						_player.onUpdateAbilities();
					}
				}
			}
		}
	}

	private static GameType getEntityGameType(Entity entity) {
		if (entity instanceof ServerPlayer serverPlayer) {
			return serverPlayer.gameMode.getGameModeForPlayer();
		} else if (entity instanceof Player player && player.level().isClientSide()) {
			PlayerInfo playerInfo = Minecraft.getInstance().getConnection().getPlayerInfo(player.getGameProfile().getId());
			if (playerInfo != null)
				return playerInfo.getGameMode();
		}
		return null;
	}
}
package net.bullfighter.avaritia.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.event.entity.living.LivingHurtEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.bullfighter.avaritia.init.AvaritiaModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InfinityArmorHurtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity) || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.SWORDOFTHE_COSMOS.get()) {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
							return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
						return ItemStack.EMPTY;
					}
				}.getItemStack(103, entity)).getItem() == AvaritiaModItems.INFINITY_ARMOR_HELMET.get() && (new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
							return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
						return ItemStack.EMPTY;
					}
				}.getItemStack(102, entity)).getItem() == AvaritiaModItems.INFINITY_ARMOR_CHESTPLATE.get() && (new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
							return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
						return ItemStack.EMPTY;
					}
				}.getItemStack(101, entity)).getItem() == AvaritiaModItems.INFINITY_ARMOR_LEGGINGS.get() && (new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
							return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
						return ItemStack.EMPTY;
					}
				}.getItemStack(100, entity)).getItem() == AvaritiaModItems.INFINITY_ARMOR_BOOTS.get() || (new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
							return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
						return ItemStack.EMPTY;
					}
				}.getItemStack(39, entity)).getItem() == AvaritiaModItems.INFINITY_ARMOR_HELMET.get() && (new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
							return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
						return ItemStack.EMPTY;
					}
				}.getItemStack(38, entity)).getItem() == AvaritiaModItems.INFINITY_ARMOR_CHESTPLATE.get() && (new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
							return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
						return ItemStack.EMPTY;
					}
				}.getItemStack(37, entity)).getItem() == AvaritiaModItems.INFINITY_ARMOR_LEGGINGS.get() && (new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntGetSlot)
							return _modHandlerEntGetSlot.getStackInSlot(sltid).copy();
						return ItemStack.EMPTY;
					}
				}.getItemStack(36, entity)).getItem() == AvaritiaModItems.INFINITY_ARMOR_BOOTS.get()) {
					if (entity instanceof Player _player) {
						_player.getAbilities().invulnerable = false;
						_player.onUpdateAbilities();
					}
					entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_EXPLOSION), sourceentity), 4);
					if (entity instanceof Player _player) {
						_player.getAbilities().invulnerable = true;
						_player.onUpdateAbilities();
					}
				}
			}
		}
	}
}

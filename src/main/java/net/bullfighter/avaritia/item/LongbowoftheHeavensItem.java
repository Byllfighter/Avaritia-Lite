package net.bullfighter.avaritia.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.client.renderer.item.properties.numeric.RangeSelectItemModelProperty;
import net.minecraft.client.multiplayer.ClientLevel;

import net.bullfighter.avaritia.procedures.MendProcedure;
import net.bullfighter.avaritia.procedures.LongbowoftheHeavensPullPropertyValueProviderProcedure;
import net.bullfighter.avaritia.procedures.LongbowoftheHeavensPropertyValueProviderProcedure;
import net.bullfighter.avaritia.entity.LongbowoftheHeavensProjectileEntity;

import javax.annotation.Nullable;

import com.mojang.serialization.MapCodec;

public class LongbowoftheHeavensItem extends Item {
	public LongbowoftheHeavensItem(Item.Properties properties) {
		super(properties.durability(100));
	}

	@Override
	public ItemUseAnimation getUseAnimation(ItemStack itemstack) {
		return ItemUseAnimation.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return 72000;
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0f;
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = InteractionResult.FAIL;
		if (entity.getAbilities().instabuild || findAmmo(entity) != ItemStack.EMPTY) {
			ar = InteractionResult.SUCCESS;
			entity.startUsingItem(hand);
		}
		return ar;
	}

	@Override
	public boolean releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		if (!world.isClientSide() && entity instanceof ServerPlayer player) {
			ItemStack stack = findAmmo(player);
			if (player.getAbilities().instabuild || stack != ItemStack.EMPTY) {
				LongbowoftheHeavensProjectileEntity projectile = LongbowoftheHeavensProjectileEntity.shoot(world, entity, world.getRandom());
				itemstack.hurtAndBreak(1, entity, LivingEntity.getSlotForHand(entity.getUsedItemHand()));
				if (player.getAbilities().instabuild) {
					projectile.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
				} else {
					if (stack.isDamageableItem()) {
						if (world instanceof ServerLevel serverLevel)
							stack.hurtAndBreak(1, serverLevel, player, _stkprov -> {
							});
					} else {
						stack.shrink(1);
					}
				}
				MendProcedure.execute(world, itemstack);
			}
		}
		return super.releaseUsing(itemstack, world, entity, time);
	}

	private ItemStack findAmmo(Player player) {
		return new ItemStack(LongbowoftheHeavensProjectileEntity.PROJECTILE_ITEM.getItem());
	}

	public record PullingProperty() implements RangeSelectItemModelProperty {
		public static final MapCodec<PullingProperty> MAP_CODEC = MapCodec.unit(new PullingProperty());

		@Override
		public float get(ItemStack itemStackToRender, @Nullable ClientLevel clientWorld, @Nullable LivingEntity entity, int seed) {
			return (float) LongbowoftheHeavensPropertyValueProviderProcedure.execute(entity, itemStackToRender);
		}

		@Override
		public MapCodec<PullingProperty> type() {
			return MAP_CODEC;
		}
	}

	public record PullProperty() implements RangeSelectItemModelProperty {
		public static final MapCodec<PullProperty> MAP_CODEC = MapCodec.unit(new PullProperty());

		@Override
		public float get(ItemStack itemStackToRender, @Nullable ClientLevel clientWorld, @Nullable LivingEntity entity, int seed) {
			return (float) LongbowoftheHeavensPullPropertyValueProviderProcedure.execute(entity, itemStackToRender);
		}

		@Override
		public MapCodec<PullProperty> type() {
			return MAP_CODEC;
		}
	}
}
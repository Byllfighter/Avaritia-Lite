package net.bullfighter.avaritia.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.bullfighter.avaritia.network.AvaritiaModVariables;
import net.bullfighter.avaritia.init.AvaritiaModItems;
import net.bullfighter.avaritia.init.AvaritiaModGameRules;

import java.util.function.Supplier;
import java.util.Map;

public class NeutroniumCompressorGuiTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world,
				BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
				"process") >= (world.getLevelData().getGameRules().getInt(AvaritiaModGameRules.NEUTRONIUMCOMPRESSORAMOUNT))) {
			if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world,
					BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
					"material")).equals("Gold")) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.GOLDEN_SINGULARITY.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world,
					BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
					"material")).equals("Lapis")) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.LAPIS_SINGULARITY.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world,
					BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
					"material")).equals("Redstone")) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.REDSTONE_SINGULARITY.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world,
					BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
					"material")).equals("Quartz")) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.NETHER_QUARTZ_SINGULARITY.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world,
					BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
					"material")).equals("Diamond")) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.DIAMOND_SINGULARITY.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world,
					BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
					"material")).equals("Emerald")) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.EMERALD_SINGULARITY.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world,
					BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
					"material")).equals("Iron")) {
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.IRON_SINGULARITY.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("process", ((new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world,
							BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
									(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
									(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
							"process")) - (world.getLevelData().getGameRules().getInt(AvaritiaModGameRules.NEUTRONIUMCOMPRESSORAMOUNT))));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world,
					BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
					"process") == 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("material", "");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world,
				BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
				"material")).equals("Iron") || true) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.IRON_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("material", "Iron");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("process", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world,
								BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world,
				BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
				"material")).equals("Quartz") || true) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.SMOOTH_QUARTZ.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("material", "Quartz");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("process", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world,
								BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world,
				BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
				"material")).equals("Emerald") || true) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.EMERALD_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("material", "Emerald");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("process", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world,
								BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world,
				BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
				"material")).equals("Lapis") || true) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.LAPIS_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("material", "Lapis");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("process", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world,
								BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world,
				BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
				"material")).equals("Redstone") || true) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.REDSTONE_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("material", "Redstone");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("process", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world,
								BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world,
				BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
				"material")).equals("Gold") || true) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.GOLD_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("material", "Gold");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("process", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world,
								BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world,
				BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
						(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
				"material")).equals("Diamond") || true) {
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.DIAMOND_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("material", "Diamond");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
							(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("process", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world,
								BlockPos.containing((entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorx,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectory,
										(entity.getCapability(AvaritiaModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AvaritiaModVariables.PlayerVariables())).neutroniumcollectorz),
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}

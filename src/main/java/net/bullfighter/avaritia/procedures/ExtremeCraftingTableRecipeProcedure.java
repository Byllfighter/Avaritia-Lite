package net.bullfighter.avaritia.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.bullfighter.avaritia.init.AvaritiaModMenus;
import net.bullfighter.avaritia.init.AvaritiaModItems;
import net.bullfighter.avaritia.init.AvaritiaModBlocks;

public class ExtremeCraftingTableRecipeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double removeslots = 0;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu10 ? _menu10.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu12 ? _menu12.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu14 ? _menu14.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu16 ? _menu16.getSlots().get(8).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu18 ? _menu18.getSlots().get(9).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu20 ? _menu20.getSlots().get(10).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu22 ? _menu22.getSlots().get(11).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu24 ? _menu24.getSlots().get(12).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu26 ? _menu26.getSlots().get(13).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu28 ? _menu28.getSlots().get(14).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu30 ? _menu30.getSlots().get(15).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu32 ? _menu32.getSlots().get(16).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu34 ? _menu34.getSlots().get(17).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu36 ? _menu36.getSlots().get(18).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu38 ? _menu38.getSlots().get(19).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu40 ? _menu40.getSlots().get(20).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu42 ? _menu42.getSlots().get(21).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu44 ? _menu44.getSlots().get(22).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu46 ? _menu46.getSlots().get(23).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu48 ? _menu48.getSlots().get(24).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu50 ? _menu50.getSlots().get(25).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu52 ? _menu52.getSlots().get(26).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu54 ? _menu54.getSlots().get(27).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu56 ? _menu56.getSlots().get(28).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu58 ? _menu58.getSlots().get(29).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu60 ? _menu60.getSlots().get(30).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu62 ? _menu62.getSlots().get(31).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu64 ? _menu64.getSlots().get(32).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu66 ? _menu66.getSlots().get(33).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu68 ? _menu68.getSlots().get(34).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu70 ? _menu70.getSlots().get(35).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu72 ? _menu72.getSlots().get(36).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu74 ? _menu74.getSlots().get(37).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.CRYSTAL_MATRIX_INGOT
						.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu76 ? _menu76.getSlots().get(38).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu78 ? _menu78.getSlots().get(39).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu80 ? _menu80.getSlots().get(40).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu82 ? _menu82.getSlots().get(41).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu84 ? _menu84.getSlots().get(42).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu86 ? _menu86.getSlots().get(43).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu88 ? _menu88.getSlots().get(44).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu90 ? _menu90.getSlots().get(45).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu92 ? _menu92.getSlots().get(46).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu94 ? _menu94.getSlots().get(47).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.CRYSTAL_MATRIX_INGOT
						.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu96 ? _menu96.getSlots().get(48).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu98 ? _menu98.getSlots().get(49).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu100 ? _menu100.getSlots().get(50).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu102 ? _menu102.getSlots().get(51).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu104 ? _menu104.getSlots().get(52).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu106 ? _menu106.getSlots().get(53).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu108 ? _menu108.getSlots().get(54).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu110 ? _menu110.getSlots().get(55).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu112 ? _menu112.getSlots().get(56).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NEUTRONIUM_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu114 ? _menu114.getSlots().get(57).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.CRYSTAL_MATRIX_INGOT
						.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu116 ? _menu116.getSlots().get(58).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu118 ? _menu118.getSlots().get(59).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu120 ? _menu120.getSlots().get(60).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu122 ? _menu122.getSlots().get(61).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu124 ? _menu124.getSlots().get(62).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu126 ? _menu126.getSlots().get(63).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu128 ? _menu128.getSlots().get(64).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NEUTRONIUM_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu130 ? _menu130.getSlots().get(65).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu132 ? _menu132.getSlots().get(66).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu134 ? _menu134.getSlots().get(67).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.CRYSTAL_MATRIX_INGOT
						.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu136 ? _menu136.getSlots().get(68).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu138 ? _menu138.getSlots().get(69).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu140 ? _menu140.getSlots().get(70).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu142 ? _menu142.getSlots().get(71).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu144 ? _menu144.getSlots().get(72).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_CATALYST.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu146 ? _menu146.getSlots().get(73).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu148 ? _menu148.getSlots().get(74).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu150 ? _menu150.getSlots().get(75).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu152 ? _menu152.getSlots().get(76).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu154 ? _menu154.getSlots().get(77).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu156 ? _menu156.getSlots().get(78).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu158 ? _menu158.getSlots().get(79).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu160 ? _menu160.getSlots().get(80).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu162 ? _menu162.getSlots().get(81).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
					|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu164 ? _menu164.getSlots().get(81).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.SWORDOFTHE_COSMOS
							.get())
					&& getAmountInGUISlot(entity, 81) < 1) {
				removeslots = -1;
				for (int index0 = 0; index0 < 81; index0++) {
					removeslots = removeslots + 1;
					if (entity instanceof Player _player && _player.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu) {
						_menu.getSlots().get((int) removeslots).remove(1);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.SWORDOFTHE_COSMOS.get()).copy();
					_setstack.setCount(getAmountInGUISlot(entity, 81) + 1);
					_menu.getSlots().get(81).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu170 ? _menu170.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu172 ? _menu172.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu174 ? _menu174.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu176 ? _menu176.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu178 ? _menu178.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu180 ? _menu180.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu182 ? _menu182.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu184 ? _menu184.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu186 ? _menu186.getSlots().get(8).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu188 ? _menu188.getSlots().get(9).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu190 ? _menu190.getSlots().get(10).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu192 ? _menu192.getSlots().get(11).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu194 ? _menu194.getSlots().get(12).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu196 ? _menu196.getSlots().get(13).getItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_WOOL.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu198 ? _menu198.getSlots().get(14).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu200 ? _menu200.getSlots().get(15).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu202 ? _menu202.getSlots().get(16).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu204 ? _menu204.getSlots().get(17).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu206 ? _menu206.getSlots().get(18).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu208 ? _menu208.getSlots().get(19).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu210 ? _menu210.getSlots().get(20).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu212 ? _menu212.getSlots().get(21).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu214 ? _menu214.getSlots().get(22).getItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_WOOL.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu216 ? _menu216.getSlots().get(23).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu218 ? _menu218.getSlots().get(24).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu220 ? _menu220.getSlots().get(25).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu222 ? _menu222.getSlots().get(26).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu224 ? _menu224.getSlots().get(27).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu226 ? _menu226.getSlots().get(28).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu228 ? _menu228.getSlots().get(29).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu230 ? _menu230.getSlots().get(30).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu232 ? _menu232.getSlots().get(31).getItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_WOOL.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu234 ? _menu234.getSlots().get(32).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu236 ? _menu236.getSlots().get(33).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu238 ? _menu238.getSlots().get(34).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu240 ? _menu240.getSlots().get(35).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu242 ? _menu242.getSlots().get(36).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModBlocks.CRYSTAL_MATRIX.get()
						.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu244 ? _menu244.getSlots().get(37).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu246 ? _menu246.getSlots().get(38).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu248 ? _menu248.getSlots().get(39).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu250 ? _menu250.getSlots().get(40).getItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_WOOL.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu252 ? _menu252.getSlots().get(41).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu254 ? _menu254.getSlots().get(42).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu256 ? _menu256.getSlots().get(43).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu258 ? _menu258.getSlots().get(44).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu260 ? _menu260.getSlots().get(45).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu262 ? _menu262.getSlots().get(46).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu264 ? _menu264.getSlots().get(47).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu266 ? _menu266.getSlots().get(48).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu268 ? _menu268.getSlots().get(49).getItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_WOOL.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu270 ? _menu270.getSlots().get(50).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu272 ? _menu272.getSlots().get(51).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu274 ? _menu274.getSlots().get(52).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu276 ? _menu276.getSlots().get(53).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu278 ? _menu278.getSlots().get(54).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu280 ? _menu280.getSlots().get(55).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu282 ? _menu282.getSlots().get(56).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu284 ? _menu284.getSlots().get(57).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu286 ? _menu286.getSlots().get(58).getItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_WOOL.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu288 ? _menu288.getSlots().get(59).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu290 ? _menu290.getSlots().get(60).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu292 ? _menu292.getSlots().get(61).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu294 ? _menu294.getSlots().get(62).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu296 ? _menu296.getSlots().get(63).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu298 ? _menu298.getSlots().get(64).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu300 ? _menu300.getSlots().get(65).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu302 ? _menu302.getSlots().get(66).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu304 ? _menu304.getSlots().get(67).getItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_WOOL.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu306 ? _menu306.getSlots().get(68).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu308 ? _menu308.getSlots().get(69).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu310 ? _menu310.getSlots().get(70).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu312 ? _menu312.getSlots().get(71).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu314 ? _menu314.getSlots().get(72).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu316 ? _menu316.getSlots().get(73).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu318 ? _menu318.getSlots().get(74).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu320 ? _menu320.getSlots().get(75).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu322 ? _menu322.getSlots().get(76).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu324 ? _menu324.getSlots().get(77).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu326 ? _menu326.getSlots().get(78).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu328 ? _menu328.getSlots().get(79).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu330 ? _menu330.getSlots().get(80).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu332 ? _menu332.getSlots().get(81).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
					|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu334 ? _menu334.getSlots().get(81).getItem() : ItemStack.EMPTY)
							.getItem() == AvaritiaModItems.LONGBOWOFTHE_HEAVENS.get())
					&& getAmountInGUISlot(entity, 81) < 1) {
				removeslots = -1;
				for (int index1 = 0; index1 < 81; index1++) {
					removeslots = removeslots + 1;
					if (entity instanceof Player _player && _player.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu) {
						_menu.getSlots().get((int) removeslots).remove(1);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.LONGBOWOFTHE_HEAVENS.get()).copy();
					_setstack.setCount(getAmountInGUISlot(entity, 81) + 1);
					_menu.getSlots().get(81).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu340 ? _menu340.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu342 ? _menu342.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu344 ? _menu344.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu346 ? _menu346.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu348 ? _menu348.getSlots().get(4).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu350 ? _menu350.getSlots().get(5).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu352 ? _menu352.getSlots().get(6).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu354 ? _menu354.getSlots().get(7).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu356 ? _menu356.getSlots().get(8).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu358 ? _menu358.getSlots().get(9).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu360 ? _menu360.getSlots().get(10).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu362 ? _menu362.getSlots().get(11).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu364 ? _menu364.getSlots().get(12).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu366 ? _menu366.getSlots().get(13).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModBlocks.CRYSTAL_MATRIX.get()
						.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu368 ? _menu368.getSlots().get(14).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu370 ? _menu370.getSlots().get(15).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu372 ? _menu372.getSlots().get(16).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu374 ? _menu374.getSlots().get(17).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu376 ? _menu376.getSlots().get(18).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu378 ? _menu378.getSlots().get(19).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu380 ? _menu380.getSlots().get(20).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu382 ? _menu382.getSlots().get(21).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu384 ? _menu384.getSlots().get(22).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NEUTRONIUM_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu386 ? _menu386.getSlots().get(23).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu388 ? _menu388.getSlots().get(24).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu390 ? _menu390.getSlots().get(25).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu392 ? _menu392.getSlots().get(26).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu394 ? _menu394.getSlots().get(27).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu396 ? _menu396.getSlots().get(28).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu398 ? _menu398.getSlots().get(29).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu400 ? _menu400.getSlots().get(30).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu402 ? _menu402.getSlots().get(31).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NEUTRONIUM_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu404 ? _menu404.getSlots().get(32).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu406 ? _menu406.getSlots().get(33).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu408 ? _menu408.getSlots().get(34).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu410 ? _menu410.getSlots().get(35).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu412 ? _menu412.getSlots().get(36).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu414 ? _menu414.getSlots().get(37).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu416 ? _menu416.getSlots().get(38).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu418 ? _menu418.getSlots().get(39).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu420 ? _menu420.getSlots().get(40).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NEUTRONIUM_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu422 ? _menu422.getSlots().get(41).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu424 ? _menu424.getSlots().get(42).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu426 ? _menu426.getSlots().get(43).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu428 ? _menu428.getSlots().get(44).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu430 ? _menu430.getSlots().get(45).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu432 ? _menu432.getSlots().get(46).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu434 ? _menu434.getSlots().get(47).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu436 ? _menu436.getSlots().get(48).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu438 ? _menu438.getSlots().get(49).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NEUTRONIUM_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu440 ? _menu440.getSlots().get(50).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu442 ? _menu442.getSlots().get(51).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu444 ? _menu444.getSlots().get(52).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu446 ? _menu446.getSlots().get(53).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu448 ? _menu448.getSlots().get(54).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu450 ? _menu450.getSlots().get(55).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu452 ? _menu452.getSlots().get(56).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu454 ? _menu454.getSlots().get(57).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu456 ? _menu456.getSlots().get(58).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NEUTRONIUM_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu458 ? _menu458.getSlots().get(59).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu460 ? _menu460.getSlots().get(60).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu462 ? _menu462.getSlots().get(61).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu464 ? _menu464.getSlots().get(62).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu466 ? _menu466.getSlots().get(63).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu468 ? _menu468.getSlots().get(64).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu470 ? _menu470.getSlots().get(65).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu472 ? _menu472.getSlots().get(66).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu474 ? _menu474.getSlots().get(67).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NEUTRONIUM_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu476 ? _menu476.getSlots().get(68).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu478 ? _menu478.getSlots().get(69).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu480 ? _menu480.getSlots().get(70).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu482 ? _menu482.getSlots().get(71).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu484 ? _menu484.getSlots().get(72).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu486 ? _menu486.getSlots().get(73).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu488 ? _menu488.getSlots().get(74).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu490 ? _menu490.getSlots().get(75).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu492 ? _menu492.getSlots().get(76).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NEUTRONIUM_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu494 ? _menu494.getSlots().get(77).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu496 ? _menu496.getSlots().get(78).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu498 ? _menu498.getSlots().get(79).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu500 ? _menu500.getSlots().get(80).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()) {
			if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu502 ? _menu502.getSlots().get(81).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
					|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu504 ? _menu504.getSlots().get(81).getItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.WORLD_BREAKER
							.get())
					&& getAmountInGUISlot(entity, 81) < 1) {
				removeslots = -1;
				for (int index2 = 0; index2 < 81; index2++) {
					removeslots = removeslots + 1;
					if (entity instanceof Player _player && _player.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu) {
						_menu.getSlots().get((int) removeslots).remove(1);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof AvaritiaModMenus.MenuAccessor _menu) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.WORLD_BREAKER.get()).copy();
					_setstack.setCount(getAmountInGUISlot(entity, 81) + 1);
					_menu.getSlots().get(81).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}

	private static int getAmountInGUISlot(Entity entity, int sltid) {
		if (entity instanceof Player player && player.containerMenu instanceof AvaritiaModMenus.MenuAccessor menuAccessor) {
			ItemStack stack = menuAccessor.getSlots().get(sltid).getItem();
			if (stack != null)
				return stack.getCount();
		}
		return 0;
	}
}
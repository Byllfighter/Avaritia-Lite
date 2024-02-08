package net.bullfighter.avaritia.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.bullfighter.avaritia.init.AvaritiaModItems;

import java.util.function.Supplier;
import java.util.Map;

public class ExtremeCraftingTableRecipeCatalystProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double removeslots = 0;
		double currentslot = 0;
		double recipediamondlattice = 0;
		double recipecrystalmatrixingot = 0;
		double recipepileofneutrons = 0;
		double recipeneutroniumnugget = 0;
		double recipeneutroniumingot = 0;
		double recipeultimatestew = 0;
		double recipecosmicmeatballs = 0;
		double recipeendestpearl = 0;
		double reciperecordfragment = 0;
		double recipeironsingularity = 0;
		double recipegoldensingularity = 0;
		double recipelapissingularity = 0;
		double reciperedstonesingularity = 0;
		double recipenetherquartzsingularity = 0;
		double recipediamondsingularity = 0;
		double recipeemeraldsingularity = 0;
		double recipecoppersingularity = 0;
		double recipeamethystsingularity = 0;
		double recipenetheritesingularity = 0;
		currentslot = -1;
		for (int index0 = 0; index0 < 81; index0++) {
			currentslot = currentslot + 1;
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.DIAMOND_LATTICE.get()) {
				recipediamondlattice = recipediamondlattice + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.CRYSTAL_MATRIX_INGOT.get()) {
				recipecrystalmatrixingot = recipecrystalmatrixingot + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.PILEOF_NEUTRONS.get()) {
				recipepileofneutrons = recipepileofneutrons + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.NEUTRONIUM_NUGGET.get()) {
				recipeneutroniumnugget = recipeneutroniumnugget + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.NEUTRONIUM_INGOT.get()) {
				recipeneutroniumingot = recipeneutroniumingot + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.ULTIMATE_STEW.get()) {
				recipeultimatestew = recipeultimatestew + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.COSMIC_MEATBALLS.get()) {
				recipecosmicmeatballs = recipecosmicmeatballs + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.ENDEST_PEARL.get()) {
				recipeendestpearl = recipeendestpearl + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.RECORD_FRAGMENT.get()) {
				reciperecordfragment = reciperecordfragment + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.IRON_SINGULARITY.get()) {
				recipeironsingularity = recipeironsingularity + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.GOLDEN_SINGULARITY.get()) {
				recipegoldensingularity = recipegoldensingularity + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.LAPIS_SINGULARITY.get()) {
				recipelapissingularity = recipelapissingularity + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.REDSTONE_SINGULARITY.get()) {
				reciperedstonesingularity = reciperedstonesingularity + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.NETHER_QUARTZ_SINGULARITY.get()) {
				recipenetherquartzsingularity = recipenetherquartzsingularity + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.DIAMOND_SINGULARITY.get()) {
				recipediamondsingularity = recipediamondsingularity + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.EMERALD_SINGULARITY.get()) {
				recipeemeraldsingularity = recipeemeraldsingularity + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.COPPER_SINGULARITY.get()) {
				recipecoppersingularity = recipecoppersingularity + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.AMETHYST_SINGULARITY.get()) {
				recipeamethystsingularity = recipeamethystsingularity + 1;
			}
			if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) currentslot)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaModItems.NETHERITE_SINGULARITY.get()) {
				recipenetheritesingularity = recipenetheritesingularity + 1;
			}
		}
		if (recipediamondlattice == 1 && recipecrystalmatrixingot == 1 && recipepileofneutrons == 1 && recipeneutroniumnugget == 1 && recipeneutroniumingot == 1 && recipeultimatestew == 1 && recipecosmicmeatballs == 1 && recipeendestpearl == 1
				&& reciperecordfragment == 1 && recipeironsingularity == 1 && recipegoldensingularity == 1 && recipelapissingularity == 1 && reciperedstonesingularity == 1 && recipenetherquartzsingularity == 1 && recipediamondsingularity == 1
				&& recipeemeraldsingularity == 1 && recipecoppersingularity == 1 && recipeamethystsingularity == 1 && recipenetheritesingularity == 1) {
			if (((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(81)).getItem() : ItemStack.EMPTY).getItem() == Blocks.AIR.asItem()
					|| (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(81)).getItem() : ItemStack.EMPTY)
							.getItem() == AvaritiaModItems.INFINITY_CATALYST.get())
					&& new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(81) < 64) {
				removeslots = -1;
				for (int index1 = 0; index1 < 81; index1++) {
					removeslots = removeslots + 1;
					if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get((int) removeslots)).remove(1);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.INFINITY_CATALYST.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(81) + 1));
					((Slot) _slots.get(81)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}

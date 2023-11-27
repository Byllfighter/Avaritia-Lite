package net.bullfighter.avaritia.procedures;

import net.minecraft.network.chat.Component;

public class RecordFragmentSpecialInformationProcedure {
	public static String execute() {
		return Component.translatable("item.avaritia.record_fragment.description").getString();
	}
}

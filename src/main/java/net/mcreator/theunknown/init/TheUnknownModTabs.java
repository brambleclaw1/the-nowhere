
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknown.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TheUnknownModTabs {
	public static CreativeModeTab TAB_THE_UNKNOWN_TAB;

	public static void load() {
		TAB_THE_UNKNOWN_TAB = new CreativeModeTab("tabthe_unknown_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.SCULK_CATALYST);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}

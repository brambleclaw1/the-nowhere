
package net.mcreator.theunknown.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.theunknown.init.TheUnknownModTabs;
import net.mcreator.theunknown.init.TheUnknownModFluids;

public class CorruptedLavaItem extends BucketItem {
	public CorruptedLavaItem() {
		super(TheUnknownModFluids.CORRUPTED_LAVA, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(TheUnknownModTabs.TAB_THE_UNKNOWN_TAB));
	}
}

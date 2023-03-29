
package net.mcreator.theunknown.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.theunknown.init.TheUnknownModFluids;

public class CorruptedLavaBlock extends LiquidBlock {
	public CorruptedLavaBlock() {
		super(() -> TheUnknownModFluids.CORRUPTED_LAVA.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f).lightLevel(s -> 7).noCollission().noLootTable());
	}
}

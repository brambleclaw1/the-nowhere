
package net.mcreator.theunknown.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.theunknown.init.TheUnknownModItems;
import net.mcreator.theunknown.init.TheUnknownModFluids;
import net.mcreator.theunknown.init.TheUnknownModFluidTypes;
import net.mcreator.theunknown.init.TheUnknownModBlocks;

public abstract class CorruptedLavaFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TheUnknownModFluidTypes.CORRUPTED_LAVA_TYPE.get(), () -> TheUnknownModFluids.CORRUPTED_LAVA.get(),
			() -> TheUnknownModFluids.FLOWING_CORRUPTED_LAVA.get()).explosionResistance(100f).bucket(() -> TheUnknownModItems.CORRUPTED_LAVA_BUCKET.get()).block(() -> (LiquidBlock) TheUnknownModBlocks.CORRUPTED_LAVA.get());

	private CorruptedLavaFluid() {
		super(PROPERTIES);
	}

	public static class Source extends CorruptedLavaFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CorruptedLavaFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}

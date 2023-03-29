
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknown.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.theunknown.fluid.types.CorruptedLavaFluidType;
import net.mcreator.theunknown.TheUnknownMod;

public class TheUnknownModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TheUnknownMod.MODID);
	public static final RegistryObject<FluidType> CORRUPTED_LAVA_TYPE = REGISTRY.register("corrupted_lava", () -> new CorruptedLavaFluidType());
}

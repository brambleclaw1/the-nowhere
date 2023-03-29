
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknown.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.theunknown.fluid.CorruptedLavaFluid;
import net.mcreator.theunknown.TheUnknownMod;

public class TheUnknownModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, TheUnknownMod.MODID);
	public static final RegistryObject<FlowingFluid> CORRUPTED_LAVA = REGISTRY.register("corrupted_lava", () -> new CorruptedLavaFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CORRUPTED_LAVA = REGISTRY.register("flowing_corrupted_lava", () -> new CorruptedLavaFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CORRUPTED_LAVA.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CORRUPTED_LAVA.get(), RenderType.translucent());
		}
	}
}

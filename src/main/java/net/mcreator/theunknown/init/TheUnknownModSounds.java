
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknown.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.theunknown.TheUnknownMod;

public class TheUnknownModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheUnknownMod.MODID);
	public static final RegistryObject<SoundEvent> METROID = REGISTRY.register("metroid", () -> new SoundEvent(new ResourceLocation("the_unknown", "metroid")));
	public static final RegistryObject<SoundEvent> ZEBES = REGISTRY.register("zebes", () -> new SoundEvent(new ResourceLocation("the_unknown", "zebes")));
	public static final RegistryObject<SoundEvent> PIGS = REGISTRY.register("pigs", () -> new SoundEvent(new ResourceLocation("the_unknown", "pigs")));
	public static final RegistryObject<SoundEvent> OVERSIDE = REGISTRY.register("overside", () -> new SoundEvent(new ResourceLocation("the_unknown", "overside")));
}

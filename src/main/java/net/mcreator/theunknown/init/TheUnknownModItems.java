
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknown.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.theunknown.item.TheUnknownItem;
import net.mcreator.theunknown.item.CorruptedLavaItem;
import net.mcreator.theunknown.TheUnknownMod;

public class TheUnknownModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheUnknownMod.MODID);
	public static final RegistryObject<Item> THE_UNKNOWN = REGISTRY.register("the_unknown", () -> new TheUnknownItem());
	public static final RegistryObject<Item> CORRUPTED_LAVA_BUCKET = REGISTRY.register("corrupted_lava_bucket", () -> new CorruptedLavaItem());
}

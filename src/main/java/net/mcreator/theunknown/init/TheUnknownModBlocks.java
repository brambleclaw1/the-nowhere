
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunknown.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.theunknown.block.TheUnknownPortalBlock;
import net.mcreator.theunknown.block.CorruptedLavaBlock;
import net.mcreator.theunknown.TheUnknownMod;

public class TheUnknownModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheUnknownMod.MODID);
	public static final RegistryObject<Block> THE_UNKNOWN_PORTAL = REGISTRY.register("the_unknown_portal", () -> new TheUnknownPortalBlock());
	public static final RegistryObject<Block> CORRUPTED_LAVA = REGISTRY.register("corrupted_lava", () -> new CorruptedLavaBlock());
}

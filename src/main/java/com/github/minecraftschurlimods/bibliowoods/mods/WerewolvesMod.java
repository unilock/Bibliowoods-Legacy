package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import de.teamlapen.werewolves.blocks.LogBlock;
import de.teamlapen.werewolves.core.ModBlocks;
import net.neoforged.bus.api.IEventBus;

public class WerewolvesMod extends AbstractMod {
	public WerewolvesMod(String modId, IEventBus bus) {
		super(modId, bus);
	}

	@Override
	protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
		woodType(event, "jacaranda", LogBlock.JACARANDA, ModBlocks.JACARANDA_PLANKS, ModBlocks.JACARANDA_SLAB, ModBlocks.JACARANDA_STAIRS);
		woodType(event, "magic", LogBlock.MAGIC, ModBlocks.MAGIC_PLANKS, ModBlocks.MAGIC_SLAB, ModBlocks.MAGIC_STAIRS);
	}
}

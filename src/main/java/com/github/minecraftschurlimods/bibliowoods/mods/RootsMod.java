package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import mysticmods.roots.init.ModBlocks;
import mysticmods.roots.init.ModTypes;
import net.neoforged.bus.api.IEventBus;

public class RootsMod extends AbstractMod {
	public RootsMod(String modId, IEventBus bus) {
		super(modId, bus);
	}

	@Override
	protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
		woodType(event, "wildwood", ModTypes.WILDWOOD_WOOD_TYPE, ModBlocks.WILDWOOD_PLANKS, ModBlocks.WILDWOOD_SLAB, ModBlocks.WILDWOOD_STAIRS);
	}
}

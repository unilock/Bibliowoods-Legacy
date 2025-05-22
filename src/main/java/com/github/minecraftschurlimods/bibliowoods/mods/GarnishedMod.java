package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.neoforged.bus.api.IEventBus;

public class GarnishedMod extends AbstractMod {
	public GarnishedMod(String modId, IEventBus bus) {
		super(modId, bus);
	}

	@Override
	protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
//		woodType(event, "nut", GarnishedWoodType.NUT, GarnishedBlocks.NUT_PLANKS, GarnishedBlocks.NUT_SLAB, GarnishedBlocks.NUT_STAIRS);
//		woodType(event, "sepia", GarnishedWoodType.SEPIA, GarnishedBlocks.SEPIA_PLANKS, GarnishedBlocks.SEPIA_SLAB, GarnishedBlocks.SEPIA_STAIRS);
	}
}

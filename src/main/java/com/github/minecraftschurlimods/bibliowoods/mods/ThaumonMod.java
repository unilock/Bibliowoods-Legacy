package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import jdlenl.thaumon.block.ThaumonBlocks;
import net.neoforged.bus.api.IEventBus;

public class ThaumonMod extends AbstractMod {
	public ThaumonMod(String modId, IEventBus bus) {
		super(modId, bus);
	}

	@Override
	protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
		woodType(event, "greatwood", ThaumonBlocks.GREATWOOD_PLANKS, ThaumonBlocks.GREATWOOD_SLAB, ThaumonBlocks.GREATWOOD_STAIRS);
		woodType(event, "silverwood", ThaumonBlocks.SILVERWOOD_PLANKS, ThaumonBlocks.SILVERWOOD_SLAB, ThaumonBlocks.SILVERWOOD_STAIRS);
	}
}

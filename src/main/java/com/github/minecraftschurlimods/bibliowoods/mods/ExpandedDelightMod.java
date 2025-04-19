package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import ianm1647.expandeddelight.common.registry.EDBlocks;
import ianm1647.expandeddelight.common.registry.EDWoodTypes;
import net.neoforged.bus.api.IEventBus;

public class ExpandedDelightMod extends AbstractMod {
    public ExpandedDelightMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "cinnamon", EDWoodTypes.CINNAMON, EDBlocks.CINNAMON_PLANKS, EDBlocks.CINNAMON_SLAB, EDBlocks.CINNAMON_STAIRS);
    }
}

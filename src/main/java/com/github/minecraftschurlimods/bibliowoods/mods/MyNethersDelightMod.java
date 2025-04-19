package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import com.soytutta.mynethersdelight.common.block.utility.MNDWoodTypes;
import com.soytutta.mynethersdelight.common.registry.MNDBlocks;
import net.neoforged.bus.api.IEventBus;

public class MyNethersDelightMod extends AbstractMod {
    public MyNethersDelightMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "powdery", MNDWoodTypes.POWDERY, MNDBlocks.POWDERY_PLANKS, MNDBlocks.POWDERY_PLANKS_SLAB, MNDBlocks.POWDERY_PLANKS_STAIRS);
    }
}

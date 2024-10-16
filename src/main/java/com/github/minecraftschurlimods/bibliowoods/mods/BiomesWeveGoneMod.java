package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.neoforged.bus.api.IEventBus;
import net.potionstudios.biomeswevegone.world.level.block.wood.BWGWoodSet;

public class BiomesWeveGoneMod extends AbstractMod {
    public BiomesWeveGoneMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        for (BWGWoodSet woodSet : BWGWoodSet.woodsets()) {
            woodType(event, woodSet.name(), "block/" + woodSet.name() + "/planks", woodSet.woodType(), woodSet::planks, woodSet::slab, woodSet::stairs);
        }
    }
}

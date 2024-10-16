package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import com.thevortex.allthemodium.registry.ModRegistry;
import net.neoforged.bus.api.IEventBus;

public class AllthemodiumMod extends AbstractMod {
    public AllthemodiumMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "ancient", ModRegistry.ANCIENT_PLANKS, ModRegistry.ANCIENT_WOODEN_SLABS, ModRegistry.ANCIENT_WOODEN_STAIRS);
        woodType(event, "soul",    ModRegistry.SOUL_PLANKS,    ModRegistry.SOUL_WOODEN_SLABS,    ModRegistry.SOUL_WOODEN_STAIRS);
        woodType(event, "demonic", ModRegistry.DEMONIC_PLANKS, ModRegistry.DEMONIC_WOODEN_SLABS, ModRegistry.DEMONIC_WOODEN_STAIRS);
    }
}

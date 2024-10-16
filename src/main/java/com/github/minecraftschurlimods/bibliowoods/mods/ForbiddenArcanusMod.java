package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import com.stal111.forbidden_arcanus.core.init.ModBlocks;
import com.stal111.forbidden_arcanus.core.init.other.ModWoodTypes;
import net.neoforged.bus.api.IEventBus;

public class ForbiddenArcanusMod extends AbstractMod {
    public ForbiddenArcanusMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "fungyss",  ModWoodTypes.FUNGYSS,  ModBlocks.FUNGYSS_PLANKS,  ModBlocks.FUNGYSS_SLAB,  ModBlocks.FUNGYSS_STAIRS);
        woodType(event, "aurum",    ModWoodTypes.AURUM,    ModBlocks.AURUM_PLANKS,    ModBlocks.AURUM_SLAB,    ModBlocks.AURUM_STAIRS);
        woodType(event, "edelwood", ModWoodTypes.EDELWOOD, ModBlocks.EDELWOOD_PLANKS, ModBlocks.EDELWOOD_SLAB, ModBlocks.EDELWOOD_STAIRS);
    }
}

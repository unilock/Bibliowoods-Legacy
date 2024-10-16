package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.neoforged.bus.api.IEventBus;
import quek.undergarden.registry.UGBlocks;
import quek.undergarden.registry.UGWoodStuff;

public class UndergardenMod extends AbstractMod {
    public UndergardenMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "smogstem",   UGWoodStuff.SMOGSTEM_WOOD_TYPE,   UGBlocks.SMOGSTEM_PLANKS,   UGBlocks.SMOGSTEM_SLAB,   UGBlocks.SMOGSTEM_STAIRS);
        woodType(event, "wigglewood", UGWoodStuff.WIGGLEWOOD_WOOD_TYPE, UGBlocks.WIGGLEWOOD_PLANKS, UGBlocks.WIGGLEWOOD_SLAB, UGBlocks.WIGGLEWOOD_STAIRS);
        woodType(event, "grongle",    UGWoodStuff.GRONGLE_WOOD_TYPE,    UGBlocks.GRONGLE_PLANKS,    UGBlocks.GRONGLE_SLAB,    UGBlocks.GRONGLE_STAIRS);
    }
}

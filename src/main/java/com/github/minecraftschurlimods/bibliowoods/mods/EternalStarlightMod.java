package com.github.minecraftschurlimods.bibliowoods.mods;

import cn.leolezury.eternalstarlight.common.block.ESWoodTypes;
import cn.leolezury.eternalstarlight.common.registry.ESBlocks;
import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.neoforged.bus.api.IEventBus;

public class EternalStarlightMod extends AbstractMod {
    public EternalStarlightMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "lunar",              ESWoodTypes.LUNAR,              ESBlocks.LUNAR_PLANKS,              ESBlocks.LUNAR_SLAB,              ESBlocks.LUNAR_STAIRS);
        woodType(event, "northland",          ESWoodTypes.NORTHLAND,          ESBlocks.NORTHLAND_PLANKS,          ESBlocks.NORTHLAND_SLAB,          ESBlocks.NORTHLAND_STAIRS);
        woodType(event, "starlight_mangrove", ESWoodTypes.STARLIGHT_MANGROVE, ESBlocks.STARLIGHT_MANGROVE_PLANKS, ESBlocks.STARLIGHT_MANGROVE_SLAB, ESBlocks.STARLIGHT_MANGROVE_STAIRS);
        woodType(event, "scarlet",            ESWoodTypes.SCARLET,            ESBlocks.SCARLET_PLANKS,            ESBlocks.SCARLET_SLAB,            ESBlocks.SCARLET_STAIRS);
        woodType(event, "torreya",            ESWoodTypes.TORREYA,            ESBlocks.TORREYA_PLANKS,            ESBlocks.TORREYA_SLAB,            ESBlocks.TORREYA_STAIRS);
        woodType(event, "jinglestem",         ESWoodTypes.JINGLESTEM,         ESBlocks.JINGLESTEM_PLANKS,         ESBlocks.JINGLESTEM_SLAB,         ESBlocks.JINGLESTEM_STAIRS);
    }
}

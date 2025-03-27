package com.github.minecraftschurlimods.bibliowoods.mods;

import com.cobblemon.mod.common.CobblemonBlocks;
import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.neoforged.bus.api.IEventBus;

public class CobblemonMod extends AbstractMod {
    public CobblemonMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "apricorn", () -> CobblemonBlocks.APRICORN_PLANKS, () -> CobblemonBlocks.APRICORN_SLAB, () -> CobblemonBlocks.APRICORN_STAIRS);
    }
}

package com.github.minecraftschurlimods.bibliowoods.mods;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.block.BOPWoodTypes;
import biomesoplenty.neoforge.datagen.BOPBlockFamilies;
import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.neoforged.bus.api.IEventBus;

public class BiomesOPlentyMod extends AbstractMod {
    public BiomesOPlentyMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "fir",       BOPWoodTypes.FIR,       () -> BOPBlocks.FIR_PLANKS,       () -> BOPBlockFamilies.FIR_PLANKS);
        woodType(event, "pine",      BOPWoodTypes.PINE,      () -> BOPBlocks.PINE_PLANKS,      () -> BOPBlockFamilies.PINE_PLANKS);
        woodType(event, "maple",     BOPWoodTypes.MAPLE,     () -> BOPBlocks.MAPLE_PLANKS,     () -> BOPBlockFamilies.MAPLE_PLANKS);
        woodType(event, "redwood",   BOPWoodTypes.REDWOOD,   () -> BOPBlocks.REDWOOD_PLANKS,   () -> BOPBlockFamilies.REDWOOD_PLANKS);
        woodType(event, "mahogany",  BOPWoodTypes.MAHOGANY,  () -> BOPBlocks.MAHOGANY_PLANKS,  () -> BOPBlockFamilies.MAHOGANY_PLANKS);
        woodType(event, "jacaranda", BOPWoodTypes.JACARANDA, () -> BOPBlocks.JACARANDA_PLANKS, () -> BOPBlockFamilies.JACARANDA_PLANKS);
        woodType(event, "palm",      BOPWoodTypes.PALM,      () -> BOPBlocks.PALM_PLANKS,      () -> BOPBlockFamilies.PALM_PLANKS);
        woodType(event, "willow",    BOPWoodTypes.WILLOW,    () -> BOPBlocks.WILLOW_PLANKS,    () -> BOPBlockFamilies.WILLOW_PLANKS);
        woodType(event, "dead",      BOPWoodTypes.DEAD,      () -> BOPBlocks.DEAD_PLANKS,      () -> BOPBlockFamilies.DEAD_PLANKS);
        woodType(event, "magic",     BOPWoodTypes.MAGIC,     () -> BOPBlocks.MAGIC_PLANKS,     () -> BOPBlockFamilies.MAGIC_PLANKS);
        woodType(event, "umbran",    BOPWoodTypes.UMBRAN,    () -> BOPBlocks.UMBRAN_PLANKS,    () -> BOPBlockFamilies.UMBRAN_PLANKS);
        woodType(event, "hellbark",  BOPWoodTypes.HELLBARK,  () -> BOPBlocks.HELLBARK_PLANKS,  () -> BOPBlockFamilies.HELLBARK_PLANKS);
        woodType(event, "empyreal",  BOPWoodTypes.EMPYREAL,  () -> BOPBlocks.EMPYREAL_PLANKS,  () -> BOPBlockFamilies.EMPYREAL_PLANKS);
    }
}

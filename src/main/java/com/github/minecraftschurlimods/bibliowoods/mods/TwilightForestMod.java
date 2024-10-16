package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.neoforged.bus.api.IEventBus;
import twilightforest.init.TFBlocks;
import twilightforest.util.woods.TFWoodTypes;

public class TwilightForestMod extends AbstractMod {
    public TwilightForestMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "twilight_oak",   "block/wood/planks_twilight_oak_0", TFWoodTypes.TWILIGHT_OAK_WOOD_TYPE,   TFBlocks.TWILIGHT_OAK_PLANKS,   TFBlocks.TWILIGHT_OAK_SLAB,   TFBlocks.TWILIGHT_OAK_STAIRS);
        woodType(event, "canopy",         "block/wood/planks_canopy_0",       TFWoodTypes.CANOPY_WOOD_TYPE,         TFBlocks.CANOPY_PLANKS,         TFBlocks.CANOPY_SLAB,         TFBlocks.CANOPY_STAIRS);
        woodType(event, "mangrove",       "block/wood/planks_mangrove_0",     TFWoodTypes.MANGROVE_WOOD_TYPE,       TFBlocks.MANGROVE_PLANKS,       TFBlocks.MANGROVE_SLAB,       TFBlocks.MANGROVE_STAIRS);
        woodType(event, "dark",           "block/wood/planks_darkwood_0",     TFWoodTypes.DARK_WOOD_TYPE,           TFBlocks.DARK_PLANKS,           TFBlocks.DARK_SLAB,           TFBlocks.DARK_STAIRS);
        woodType(event, "time",           "block/wood/planks_time_0",         TFWoodTypes.TIME_WOOD_TYPE,           TFBlocks.TIME_PLANKS,           TFBlocks.TIME_SLAB,           TFBlocks.TIME_STAIRS);
        woodType(event, "transformation", "block/wood/planks_trans_0",        TFWoodTypes.TRANSFORMATION_WOOD_TYPE, TFBlocks.TRANSFORMATION_PLANKS, TFBlocks.TRANSFORMATION_SLAB, TFBlocks.TRANSFORMATION_STAIRS);
        woodType(event, "mining",         "block/wood/planks_mine_0",         TFWoodTypes.MINING_WOOD_TYPE,         TFBlocks.MINING_PLANKS,         TFBlocks.MINING_SLAB,         TFBlocks.MINING_STAIRS);
        woodType(event, "sorting",        "block/wood/planks_sort_0",         TFWoodTypes.SORTING_WOOD_TYPE,        TFBlocks.SORTING_PLANKS,        TFBlocks.SORTING_SLAB,        TFBlocks.SORTING_STAIRS);
    }
}

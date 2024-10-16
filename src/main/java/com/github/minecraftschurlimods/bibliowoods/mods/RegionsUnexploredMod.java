package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.neoforged.bus.api.IEventBus;
import net.regions_unexplored.block.RuBlocks;
import net.regions_unexplored.data.block.RuWoodTypes;

public class RegionsUnexploredMod extends AbstractMod {
    public RegionsUnexploredMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "alpha", "block/alpha_oak_planks",            RuWoodTypes.ALPHA,            RuBlocks.ALPHA_PLANKS,            RuBlocks.ALPHA_SLAB,            RuBlocks.ALPHA_STAIRS);
        woodType(event, "baobab",           RuWoodTypes.BAOBAB,           RuBlocks.BAOBAB_PLANKS,           RuBlocks.BAOBAB_SLAB,           RuBlocks.BAOBAB_STAIRS);
        woodType(event, "blackwood",        RuWoodTypes.BLACKWOOD,        RuBlocks.BLACKWOOD_PLANKS,        RuBlocks.BLACKWOOD_SLAB,        RuBlocks.BLACKWOOD_STAIRS);
        woodType(event, "blue_bioshroom",   RuWoodTypes.BLUE_BIOSHROOM,   RuBlocks.BLUE_BIOSHROOM_PLANKS,   RuBlocks.BLUE_BIOSHROOM_SLAB,   RuBlocks.BLUE_BIOSHROOM_STAIRS);
        woodType(event, "brimwood",         RuWoodTypes.BRIMWOOD,         RuBlocks.BRIMWOOD_PLANKS,         RuBlocks.BRIMWOOD_SLAB,         RuBlocks.BRIMWOOD_STAIRS);
        woodType(event, "cobalt",           RuWoodTypes.COBALT,           RuBlocks.COBALT_PLANKS,           RuBlocks.COBALT_SLAB,           RuBlocks.COBALT_STAIRS);
        woodType(event, "cypress",          RuWoodTypes.CYPRESS,          RuBlocks.CYPRESS_PLANKS,          RuBlocks.CYPRESS_SLAB,          RuBlocks.CYPRESS_STAIRS);
        woodType(event, "dead",             RuWoodTypes.DEAD,             RuBlocks.DEAD_PLANKS,             RuBlocks.DEAD_SLAB,             RuBlocks.DEAD_STAIRS);
        woodType(event, "eucalyptus",       RuWoodTypes.EUCALYPTUS,       RuBlocks.EUCALYPTUS_PLANKS,       RuBlocks.EUCALYPTUS_SLAB,       RuBlocks.EUCALYPTUS_STAIRS);
        woodType(event, "green_bioshroom",  RuWoodTypes.GREEN_BIOSHROOM,  RuBlocks.GREEN_BIOSHROOM_PLANKS,  RuBlocks.GREEN_BIOSHROOM_SLAB,  RuBlocks.GREEN_BIOSHROOM_STAIRS);
        woodType(event, "joshua",           RuWoodTypes.JOSHUA,           RuBlocks.JOSHUA_PLANKS,           RuBlocks.JOSHUA_SLAB,           RuBlocks.JOSHUA_STAIRS);
        woodType(event, "kapok",            RuWoodTypes.KAPOK,            RuBlocks.KAPOK_PLANKS,            RuBlocks.KAPOK_SLAB,            RuBlocks.KAPOK_STAIRS);
        woodType(event, "larch",            RuWoodTypes.LARCH,            RuBlocks.LARCH_PLANKS,            RuBlocks.LARCH_SLAB,            RuBlocks.LARCH_STAIRS);
        woodType(event, "magnolia",         RuWoodTypes.MAGNOLIA,         RuBlocks.MAGNOLIA_PLANKS,         RuBlocks.MAGNOLIA_SLAB,         RuBlocks.MAGNOLIA_STAIRS);
        woodType(event, "maple",            RuWoodTypes.MAPLE,            RuBlocks.MAPLE_PLANKS,            RuBlocks.MAPLE_SLAB,            RuBlocks.MAPLE_STAIRS);
        woodType(event, "mauve",            RuWoodTypes.MAUVE,            RuBlocks.MAUVE_PLANKS,            RuBlocks.MAUVE_SLAB,            RuBlocks.MAUVE_STAIRS);
        woodType(event, "palm",             RuWoodTypes.PALM,             RuBlocks.PALM_PLANKS,             RuBlocks.PALM_SLAB,             RuBlocks.PALM_STAIRS);
        woodType(event, "pine",             RuWoodTypes.PINE,             RuBlocks.PINE_PLANKS,             RuBlocks.PINE_SLAB,             RuBlocks.PINE_STAIRS);
        woodType(event, "pink_bioshroom",   RuWoodTypes.PINK_BIOSHROOM,   RuBlocks.PINK_BIOSHROOM_PLANKS,   RuBlocks.PINK_BIOSHROOM_SLAB,   RuBlocks.PINK_BIOSHROOM_STAIRS);
        woodType(event, "redwood",          RuWoodTypes.REDWOOD,          RuBlocks.REDWOOD_PLANKS,          RuBlocks.REDWOOD_SLAB,          RuBlocks.REDWOOD_STAIRS);
        woodType(event, "socotra",          RuWoodTypes.SOCOTRA,          RuBlocks.SOCOTRA_PLANKS,          RuBlocks.SOCOTRA_SLAB,          RuBlocks.SOCOTRA_STAIRS);
        woodType(event, "willow",           RuWoodTypes.WILLOW,           RuBlocks.WILLOW_PLANKS,           RuBlocks.WILLOW_SLAB,           RuBlocks.WILLOW_STAIRS);
        woodType(event, "yellow_bioshroom", RuWoodTypes.YELLOW_BIOSHROOM, RuBlocks.YELLOW_BIOSHROOM_PLANKS, RuBlocks.YELLOW_BIOSHROOM_SLAB, RuBlocks.YELLOW_BIOSHROOM_STAIRS);
    }
}

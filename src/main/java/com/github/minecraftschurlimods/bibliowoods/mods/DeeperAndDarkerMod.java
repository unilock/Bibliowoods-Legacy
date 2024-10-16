package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import com.kyanite.deeperdarker.content.DDBlocks;
import net.neoforged.bus.api.IEventBus;

public class DeeperAndDarkerMod extends AbstractMod {
    public DeeperAndDarkerMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "echo",  DDBlocks.ECHO,  DDBlocks.ECHO_PLANKS,  DDBlocks.ECHO_SLAB,  DDBlocks.ECHO_STAIRS);
        woodType(event, "bloom", DDBlocks.BLOOM, DDBlocks.BLOOM_PLANKS, DDBlocks.BLOOM_SLAB, DDBlocks.BLOOM_STAIRS);
    }
}

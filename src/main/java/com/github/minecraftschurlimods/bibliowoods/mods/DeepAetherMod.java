package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import io.github.razordevs.deep_aether.init.DABlocks;
import io.github.razordevs.deep_aether.init.DAWoodTypes;
import net.neoforged.bus.api.IEventBus;

public class DeepAetherMod extends AbstractMod {
    public DeepAetherMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "roseroot",  DAWoodTypes.ROSEROOT,  DABlocks.ROSEROOT_PLANKS,  DABlocks.ROSEROOT_SLAB,  DABlocks.ROSEROOT_STAIRS);
        woodType(event, "yagroot",   DAWoodTypes.YAGROOT,   DABlocks.YAGROOT_PLANKS,   DABlocks.YAGROOT_SLAB,   DABlocks.YAGROOT_STAIRS);
        woodType(event, "cruderoot", DAWoodTypes.CRUDEROOT, DABlocks.CRUDEROOT_PLANKS, DABlocks.CRUDEROOT_SLAB, DABlocks.CRUDEROOT_STAIRS);
        woodType(event, "conberry",  DAWoodTypes.CONBERRY,  DABlocks.CONBERRY_PLANKS,  DABlocks.CONBERRY_SLAB,  DABlocks.CONBERRY_STAIRS);
        woodType(event, "sunroot",   DAWoodTypes.SUNROOT,   DABlocks.SUNROOT_PLANKS,   DABlocks.SUNROOT_SLAB,   DABlocks.SUNROOT_STAIRS);
    }
}

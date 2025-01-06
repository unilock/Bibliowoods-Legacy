package com.github.minecraftschurlimods.bibliowoods.mods;

import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.block.AetherWoodTypes;
import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.neoforged.bus.api.IEventBus;

public class AetherMod extends AbstractMod {
    public AetherMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "skyroot", "block/construction/skyroot_planks", AetherWoodTypes.SKYROOT, AetherBlocks.SKYROOT_PLANKS, AetherBlocks.SKYROOT_SLAB, AetherBlocks.SKYROOT_STAIRS);
    }
}

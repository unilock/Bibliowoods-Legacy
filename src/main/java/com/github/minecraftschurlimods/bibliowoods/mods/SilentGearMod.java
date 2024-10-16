package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.silentchaos512.gear.setup.SgBlocks;

public class SilentGearMod extends AbstractMod {
    public SilentGearMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "netherwood", WoodType.CRIMSON, SgBlocks.NETHERWOOD_PLANKS, SgBlocks.NETHERWOOD_SLAB, SgBlocks.NETHERWOOD_STAIRS);
    }
}

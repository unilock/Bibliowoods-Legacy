package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import com.hollingsworth.arsnouveau.setup.registry.BlockRegistry;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;

public class ArsNouveauMod extends AbstractMod {
    public ArsNouveauMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "archwood", WoodType.OAK, BlockRegistry.ARCHWOOD_PLANK, BlockRegistry.ARCHWOOD_SLABS, BlockRegistry.ARCHWOOD_STAIRS);
    }
}

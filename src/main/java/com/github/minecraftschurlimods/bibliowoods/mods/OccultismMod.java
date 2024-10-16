package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import com.klikli_dev.occultism.registry.OccultismBlocks;
import com.klikli_dev.occultism.util.OtherWoodType;
import net.neoforged.bus.api.IEventBus;

public class OccultismMod extends AbstractMod {
    public OccultismMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "otherplanks", "block/otherplanks", OtherWoodType.OTHERPLANKS, OccultismBlocks.OTHERPLANKS, OccultismBlocks.OTHERPLANKS_SLAB, OccultismBlocks.OTHERPLANKS_STAIRS);
    }
}

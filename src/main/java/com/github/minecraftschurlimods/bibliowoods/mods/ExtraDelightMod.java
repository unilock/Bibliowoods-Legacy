package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import com.lance5057.extradelight.ExtraDelightBlocks;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;

public class ExtraDelightMod extends AbstractMod {
    public ExtraDelightMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "cinnamon", WoodType.OAK, ExtraDelightBlocks.CINNAMON_PLANKS, ExtraDelightBlocks.CINNAMON_SLAB, ExtraDelightBlocks.CINNAMON_STAIRS);
        woodType(event, "fruit",    WoodType.OAK, ExtraDelightBlocks.FRUIT_PLANKS,    ExtraDelightBlocks.FRUIT_SLAB,    ExtraDelightBlocks.FRUIT_STAIRS);
    }
}

package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import de.teamlapen.vampirism.blocks.LogBlock;
import de.teamlapen.vampirism.core.ModBlocks;
import net.neoforged.bus.api.IEventBus;

public class VampirismMod extends AbstractMod {
    public VampirismMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        woodType(event, "dark_spruce",   LogBlock.DARK_SPRUCE,   ModBlocks.DARK_SPRUCE_PLANKS,   ModBlocks.DARK_SPRUCE_SLAB,   ModBlocks.DARK_SPRUCE_STAIRS);
        woodType(event, "cursed_spruce", LogBlock.CURSED_SPRUCE, ModBlocks.CURSED_SPRUCE_PLANKS, ModBlocks.CURSED_SPRUCE_SLAB, ModBlocks.CURSED_SPRUCE_STAIRS);
    }
}

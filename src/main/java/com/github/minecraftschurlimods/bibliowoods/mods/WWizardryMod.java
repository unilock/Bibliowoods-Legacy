package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import dev.sweetberry.wwizardry.content.datagen.DatagenInitializer;
import net.neoforged.bus.api.IEventBus;

public class WWizardryMod extends AbstractMod {
	public WWizardryMod(String modId, IEventBus bus) {
		super(modId, bus);
	}

	@Override
	protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
		woodType(event, "denia", DatagenInitializer.DENIA_WOOD.TYPE.get(), DatagenInitializer.DENIA_WOOD.PLANKS, DatagenInitializer.DENIA_WOOD.SLAB, DatagenInitializer.DENIA_WOOD.STAIRS);
		woodType(event, "mycha", DatagenInitializer.MYCHA_WOOD.TYPE.get(), DatagenInitializer.MYCHA_WOOD.PLANKS, DatagenInitializer.MYCHA_WOOD.SLAB, DatagenInitializer.MYCHA_WOOD.STAIRS);
	}
}

package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.joefoxe.hexerei.block.ModBlocks;
import net.joefoxe.hexerei.block.ModWoodType;
import net.neoforged.bus.api.IEventBus;

public class HexereiMod extends AbstractMod {
	public HexereiMod(String modId, IEventBus bus) {
		super(modId, bus);
	}

	@Override
	protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
		woodType(event, "mahogany", ModWoodType.MAHOGANY, ModBlocks.MAHOGANY_PLANKS, ModBlocks.MAHOGANY_SLAB, ModBlocks.MAHOGANY_STAIRS);
		woodType(event, "polished_mahogany", ModWoodType.POLISHED_MAHOGANY, ModBlocks.POLISHED_MAHOGANY_PLANKS, ModBlocks.POLISHED_MAHOGANY_SLAB, ModBlocks.POLISHED_MAHOGANY_STAIRS);
		woodType(event, "willow", ModWoodType.WILLOW, ModBlocks.WILLOW_PLANKS, ModBlocks.WILLOW_SLAB, ModBlocks.WILLOW_STAIRS);
		woodType(event, "polished_willow", ModWoodType.POLISHED_WILLOW, ModBlocks.POLISHED_WILLOW_PLANKS, ModBlocks.POLISHED_WILLOW_SLAB, ModBlocks.POLISHED_WILLOW_STAIRS);
		woodType(event, "witch_hazel", ModWoodType.WITCH_HAZEL, ModBlocks.WITCH_HAZEL_PLANKS, ModBlocks.WITCH_HAZEL_SLAB, ModBlocks.WITCH_HAZEL_STAIRS);
		woodType(event, "polished_witch_hazel", ModWoodType.POLISHED_WITCH_HAZEL, ModBlocks.POLISHED_WITCH_HAZEL_PLANKS, ModBlocks.POLISHED_WITCH_HAZEL_SLAB, ModBlocks.POLISHED_WITCH_HAZEL_STAIRS);
	}
}

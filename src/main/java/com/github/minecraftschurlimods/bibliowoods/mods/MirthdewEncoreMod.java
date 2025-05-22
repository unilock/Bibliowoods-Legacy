package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public class MirthdewEncoreMod extends AbstractMod {
	public MirthdewEncoreMod(String modId, IEventBus bus) {
		super(modId, bus);
	}

	@Override
	protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
		Supplier<Block> clinkeraPlanks = () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "clinkera_planks"));
		Supplier<Block> clinkeraSlab =   () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "clinkera_slab"));
		Supplier<Block> clinkeraStairs = () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "clinkera_stairs"));
		woodType(event, "clinkera", clinkeraPlanks, clinkeraSlab, clinkeraStairs);
		Supplier<Block> decidrheumPlanks = () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "decidrheum_planks"));
		Supplier<Block> decidrheumSlab =   () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "decidrheum_slab"));
		Supplier<Block> decidrheumStairs = () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "decidrheum_stairs"));
		woodType(event, "decidrheum", decidrheumPlanks, decidrheumSlab, decidrheumStairs);
	}
}

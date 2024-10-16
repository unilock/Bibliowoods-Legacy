package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public class GregTechMod extends AbstractMod {
    public GregTechMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        Supplier<Block> rubberPlanks = () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "rubber_planks"));
        Supplier<Block> rubberSlab =   () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "rubber_slab"));
        Supplier<Block> rubberStairs = () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "rubber_stairs"));
        woodType(event, "rubber", rubberPlanks, rubberSlab, rubberStairs);
        Supplier<Block> treatedWoodPlanks = () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "treated_wood_planks"));
        Supplier<Block> treatedWoodSlab =   () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "treated_wood_slab"));
        Supplier<Block> treatedWoodStairs = () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "treated_wood_stairs"));
        woodType(event, "treated_wood", treatedWoodPlanks, treatedWoodSlab, treatedWoodStairs);
    }
}

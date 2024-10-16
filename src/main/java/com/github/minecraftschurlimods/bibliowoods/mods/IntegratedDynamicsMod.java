package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public class IntegratedDynamicsMod extends AbstractMod {
    public IntegratedDynamicsMod(String modId, IEventBus bus) {
        super(modId, bus);
    }

    @Override
    protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
        Supplier<Block> menrilPlanks = () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "menril_planks"));
        Supplier<Block> menrilSlab =   () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "menril_slab"));
        Supplier<Block> menrilStairs = () -> BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(modId, "menril_stairs"));
        woodType(event, "menril", WoodType.OAK, menrilPlanks, menrilSlab, menrilStairs);
    }
}

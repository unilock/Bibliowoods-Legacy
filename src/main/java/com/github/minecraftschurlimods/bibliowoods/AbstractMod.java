package com.github.minecraftschurlimods.bibliowoods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;

import java.util.function.Supplier;

public abstract class AbstractMod {
    protected final String modId;
    
    public AbstractMod(String modId, IEventBus bus) {
        this.modId = modId;
        bus.addListener(this::registerWoodTypes);
    }
    
    protected abstract void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event);

    public void woodType(RegisterBibliocraftWoodTypesEvent event, String name, String texture, WoodType woodType, Supplier<? extends Block> planks, Supplier<BlockFamily> blockFamily) {
        event.register(
                ResourceLocation.fromNamespaceAndPath(modId, name),
                woodType,
                () -> BlockBehaviour.Properties.ofFullCopy(planks.get()),
                ResourceLocation.fromNamespaceAndPath(modId, texture),
                blockFamily);
    }

    public void woodType(RegisterBibliocraftWoodTypesEvent event, String name, WoodType woodType, Supplier<? extends Block> planks, Supplier<BlockFamily> blockFamily) {
        woodType(event, name, "block/" + name + "_planks", woodType, planks, blockFamily);
    }

    public void woodType(RegisterBibliocraftWoodTypesEvent event, String name, String texture, Supplier<? extends Block> planks, Supplier<BlockFamily> blockFamily) {
        woodType(event, name, texture, vanillaWoodType(modId + "_" + name), planks, blockFamily);
    }

    public void woodType(RegisterBibliocraftWoodTypesEvent event, String name, Supplier<? extends Block> planks, Supplier<BlockFamily> blockFamily) {
        woodType(event, name, "block/" + name + "_planks", vanillaWoodType(modId + "_" + name), planks, blockFamily);
    }

    public void woodType(RegisterBibliocraftWoodTypesEvent event, String name, String texture, WoodType woodType, Supplier<? extends Block> planks, Supplier<? extends Block> slab, Supplier<? extends Block> stairs) {
        woodType(event, name, texture, woodType, planks, blockFamily(planks, slab, stairs));
    }

    public void woodType(RegisterBibliocraftWoodTypesEvent event, String name, WoodType woodType, Supplier<? extends Block> planks, Supplier<? extends Block> slab, Supplier<? extends Block> stairs) {
        woodType(event, name, "block/" + name + "_planks", woodType, planks, blockFamily(planks, slab, stairs));
    }

    public void woodType(RegisterBibliocraftWoodTypesEvent event, String name, String texture, Supplier<? extends Block> planks, Supplier<? extends Block> slab, Supplier<? extends Block> stairs) {
        woodType(event, name, texture, vanillaWoodType(modId + "_" + name), planks, blockFamily(planks, slab, stairs));
    }

    public void woodType(RegisterBibliocraftWoodTypesEvent event, String name, Supplier<? extends Block> planks, Supplier<? extends Block> slab, Supplier<? extends Block> stairs) {
        woodType(event, name, "block/" + name + "_planks", vanillaWoodType(modId + "_" + name), planks, blockFamily(planks, slab, stairs));
    }

    public static WoodType vanillaWoodType(String name) {
        return new WoodType(name, new BlockSetType(name));
    }

    public static Supplier<BlockFamily> blockFamily(Supplier<? extends Block> planks, Supplier<? extends Block> slab, Supplier<? extends Block> stairs) {
        return () -> new BlockFamily.Builder(planks.get()).slab(slab.get()).stairs(stairs.get()).getFamily();
    }
}

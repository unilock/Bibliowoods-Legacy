package com.github.minecraftschurlimods.bibliowoods.mods;

import com.github.minecraftschurlimods.bibliocraft.api.woodtype.RegisterBibliocraftWoodTypesEvent;
import com.github.minecraftschurlimods.bibliowoods.AbstractMod;
import dev.sterner.witchery.registry.WitcheryBlocks;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;

import java.lang.invoke.MethodHandles;

public class WitcheryMod extends AbstractMod {
	public WitcheryMod(String modId, IEventBus bus) {
		super(modId, bus);
	}

	private static final WoodType ALDER_WOOD_TYPE;
	private static final WoodType HAWTHORN_WOOD_TYPE;
	private static final WoodType ROWAN_WOOD_TYPE;
	static {
		try {
			ALDER_WOOD_TYPE = (WoodType) MethodHandles.privateLookupIn(WitcheryBlocks.class, MethodHandles.lookup()).findStaticGetter(WitcheryBlocks.class, "ALDER_WOOD_TYPE", WoodType.class).invoke();
			HAWTHORN_WOOD_TYPE = (WoodType) MethodHandles.privateLookupIn(WitcheryBlocks.class, MethodHandles.lookup()).findStaticGetter(WitcheryBlocks.class, "HAWTHORN_WOOD_TYPE", WoodType.class).invoke();
			ROWAN_WOOD_TYPE = (WoodType) MethodHandles.privateLookupIn(WitcheryBlocks.class, MethodHandles.lookup()).findStaticGetter(WitcheryBlocks.class, "ROWAN_WOOD_TYPE", WoodType.class).invoke();
		} catch (Throwable e) {
			throw new RuntimeException("Failed to find and invoke handles for WitcheryBlocks' WoodTypes", e);
		}
	}

	@Override
	protected void registerWoodTypes(RegisterBibliocraftWoodTypesEvent event) {
		woodType(event, "alder", ALDER_WOOD_TYPE, WitcheryBlocks.INSTANCE.getALDER_PLANKS(), WitcheryBlocks.INSTANCE.getALDER_SLAB(), WitcheryBlocks.INSTANCE.getALDER_STAIRS());
		woodType(event, "hawthorn", HAWTHORN_WOOD_TYPE, WitcheryBlocks.INSTANCE.getHAWTHORN_PLANKS(), WitcheryBlocks.INSTANCE.getHAWTHORN_SLAB(), WitcheryBlocks.INSTANCE.getHAWTHORN_STAIRS());
		woodType(event, "rowan", ROWAN_WOOD_TYPE, WitcheryBlocks.INSTANCE.getROWAN_PLANKS(), WitcheryBlocks.INSTANCE.getROWAN_SLAB(), WitcheryBlocks.INSTANCE.getROWAN_STAIRS());
	}
}

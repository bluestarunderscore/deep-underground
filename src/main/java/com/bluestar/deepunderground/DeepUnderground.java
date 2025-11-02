package com.bluestar.deepunderground;

import com.bluestar.deepunderground.blocks.DeepUndergroundBlocks;
import com.bluestar.deepunderground.items.DeepUndergroundItems;
import com.bluestar.deepunderground.world.gen.DeepUndergroundFeatures;
import com.bluestar.deepunderground.world.loot.DeepUndergroundLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.kyrptonaught.customportalapi.event.CPASoundEventData;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeepUnderground implements ModInitializer {
	public static final String MOD_ID = "deep_underground";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		DeepUndergroundItems.initialize();
		DeepUndergroundBlocks.initialize();
		DeepUndergroundSounds.registerSounds();
		DeepUndergroundFeatures.initialize();
		DeepUndergroundLootTableModifiers.modifyLootTables();
		CustomPortalBuilder.beginPortal()
				.frameBlock(DeepUndergroundBlocks.FRAMED_POLISHED_BLACKSTONE)
				.customPortalBlock(DeepUndergroundBlocks.DEEP_PORTAL)
				.lightWithFluid(Fluids.LAVA)
				.destDimID(Identifier.of(MOD_ID, "deep_underground"))
				.onlyLightInOverworld()
				.registerPostTPPortalAmbience(player -> new CPASoundEventData(DeepUndergroundSounds.PORTAL_TRAVEL, 1.0F, 0.55F))
				.registerInPortalAmbienceSound(player -> new CPASoundEventData(DeepUndergroundSounds.PORTAL_TRIGGER, 1.0F, 0.55F))
				.setPortalSearchYRange(170,236)
				.registerPortal();
	}
}
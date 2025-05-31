package com.bluestar.deepunderground;

import net.fabricmc.api.ClientModInitializer;

public class DeepUndergroundClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		DungDimEffects.initialize();
	}
}
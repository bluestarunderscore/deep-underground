package com.bluestar.deepunderground;

import com.bluestar.deepunderground.blocks.DeepUndergroundBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class DeepUndergroundClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		DungDimEffects.initialize();
		BlockRenderLayerMap.INSTANCE.putBlock(DeepUndergroundBlocks.DEEP_PORTAL, RenderLayer.getTranslucent());
	}
}
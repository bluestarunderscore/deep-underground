package com.bluestar.deepunderground.world.gen;

import com.bluestar.deepunderground.DeepUnderground;
import com.bluestar.deepunderground.world.gen.feature.LargeCavePillarFeature;
import com.bluestar.deepunderground.world.gen.feature.LargeCavePillarFeatureConfig;
import net.minecraft.block.Blocks;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

public class DeepUndergroundFeatures {
    public static final LargeCavePillarFeature DEEPSLATE_PILLAR_FEATURE =
            registerFeature("deepslate_pillar", new LargeCavePillarFeature(LargeCavePillarFeatureConfig.CODEC, Blocks.DEEPSLATE));

    public static final LargeCavePillarFeature ICE_PILLAR_FEATURE =
            registerFeature("ice_pillar", new LargeCavePillarFeature(LargeCavePillarFeatureConfig.CODEC, Blocks.PACKED_ICE));

    private static <C extends FeatureConfig, F extends Feature<C>> F registerFeature(
            String id, F feature) {

        Identifier featureId = Identifier.of(DeepUnderground.MOD_ID, id);
        return Registry.register(Registries.FEATURE, featureId, feature);
    }

    public static void initialize()
    {

    }
}

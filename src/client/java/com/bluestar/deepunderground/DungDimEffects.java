package com.bluestar.deepunderground;

import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.rendering.v1.DimensionRenderingRegistry;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.DimensionEffects;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class DungDimEffects
{
    public static final Identifier DEEP_UNDERGROUND_ID = Identifier.of(DeepUnderground.MOD_ID, "deep_underground_effects");
    public static DimensionEffects EFFECT_DEEP_UNDERGROUND = new Deep_Underground_Effects();
    public static void initialize()
    {
        DimensionRenderingRegistry.registerDimensionEffects(DEEP_UNDERGROUND_ID, EFFECT_DEEP_UNDERGROUND);
    }
}


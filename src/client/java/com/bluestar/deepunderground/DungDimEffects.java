package com.bluestar.deepunderground;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.rendering.v1.DimensionRenderingRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.DimensionRenderingRegistryImpl;
import net.minecraft.client.render.DimensionEffects;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.dimension.DimensionTypes;

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


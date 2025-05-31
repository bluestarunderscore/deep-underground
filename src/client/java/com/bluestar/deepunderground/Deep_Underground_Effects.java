package com.bluestar.deepunderground;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.DimensionEffects;
import net.minecraft.util.math.Vec3d;

@Environment(EnvType.CLIENT)
public class Deep_Underground_Effects extends DimensionEffects
{
    public Deep_Underground_Effects() {
        super(Float.NaN, true, DimensionEffects.SkyType.NONE, false, false);
    }
    public Vec3d adjustFogColor(Vec3d color, float sunHeight) {
        return color.multiply(0.0F);
    }
    public boolean useThickFog(int camX, int camY) {
        return false;
    }
}

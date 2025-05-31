package com.bluestar.deepunderground;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class DeepUndergroundSounds
{
    public static final SoundEvent PORTAL_TRIGGER = register("block.deep_underground_portal.trigger");
    public static final SoundEvent PORTAL_TRAVEL = register("block.deep_underground_portal.travel");
    public static final SoundEvent PORTAL_AMBIENT = register("block.deep_underground_portal.ambient");

    private static SoundEvent register(String name) {
        Identifier id = Identifier.of(DeepUnderground.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds()
    {

    }

}

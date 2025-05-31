package com.bluestar.deepunderground.items;

import com.bluestar.deepunderground.DeepUnderground;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class DeepUndergroundArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> VIRIDIUM_ARMOR_MATERIAL = registerArmorMaterial("viridium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
            }), 16, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(DeepUndergroundItems.VIRIDIUM_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(DeepUnderground.MOD_ID, "viridium"))), 0,0));

    public static final RegistryEntry<ArmorMaterial> CERULIUM_ARMOR_MATERIAL = registerArmorMaterial("cerulium",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.HELMET, 4);
            }), 16, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(DeepUndergroundItems.CERULIUM_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(DeepUnderground.MOD_ID, "cerulium"))), 2.0F, 0.25F));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(DeepUnderground.MOD_ID, name), material.get());
    }
}
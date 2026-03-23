package com.bluestar.deepunderground.datagen;

import java.util.concurrent.CompletableFuture;

import com.bluestar.deepunderground.DeepUnderground;
import com.bluestar.deepunderground.world.gen.DeepUndergroundFeatures;
import com.bluestar.deepunderground.world.gen.feature.LargeCavePillarFeatureConfig;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.Registerable;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.floatprovider.UniformFloatProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;


public class DeepUndergroundFeatureProvider extends FabricDynamicRegistryProvider {
    public DeepUndergroundFeatureProvider(FabricDataOutput output,
                              CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public String getName() {
        return DeepUnderground.MOD_ID + "_feature_provider";
    }

    // This method is called when the data provider needs to provide its data
    // We are telling it to add all entries in the configured feature and placed feature
    // registries to the list of generated data
    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        entries.addAll(registries.getWrapperOrThrow(RegistryKeys.CONFIGURED_FEATURE));
    }

    private static RegistryKey<Feature<?>> featureKey(Identifier id) {
        return RegistryKey.of(RegistryKeys.FEATURE, id);
    }
    private static RegistryKey<ConfiguredFeature<?, ?>> configuredFeatureKey(Identifier id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, id);
    }

    public static void bootstrapConfiguredFeatures(Registerable<ConfiguredFeature<?, ?>> registerable)
    {
        registerable.register(configuredFeatureKey(Identifier.of(DeepUnderground.MOD_ID, "deepslate_pillar")),
                new ConfiguredFeature<>(DeepUndergroundFeatures.DEEPSLATE_PILLAR_FEATURE, new LargeCavePillarFeatureConfig(
                        30,
                        UniformIntProvider.create(7, 20),
                        UniformFloatProvider.create(0.4F, 2.0F),
                        0.32F,
                        UniformFloatProvider.create(0.3F, 0.9F),
                        UniformFloatProvider.create(0.4F, 1.0F),
                        UniformFloatProvider.create(0.0F, 0.3F),
                        4,
                        0.6F)));

        registerable.register(configuredFeatureKey(Identifier.of(DeepUnderground.MOD_ID, "ice_pillar")),
                new ConfiguredFeature<>(DeepUndergroundFeatures.ICE_PILLAR_FEATURE, new LargeCavePillarFeatureConfig(
                        28,
                        UniformIntProvider.create(7, 20),
                        UniformFloatProvider.create(0.4F, 2.0F),
                        0.32F,
                        UniformFloatProvider.create(0.3F, 0.9F),
                        UniformFloatProvider.create(0.4F, 1.0F),
                        UniformFloatProvider.create(0.0F, 0.3F),
                        4,
                        0.6F)));
    }
}
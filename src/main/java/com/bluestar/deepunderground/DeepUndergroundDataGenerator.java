package com.bluestar.deepunderground;

import com.bluestar.deepunderground.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class DeepUndergroundDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(DeepUndergroundBlockTagProvider::new);
		pack.addProvider(DeepUndergroundItemTagProvider::new);
		pack.addProvider(DeepUndergroundLootTableProvider::new);
		pack.addProvider(DeepUndergroundModelProvider::new);
		pack.addProvider(DeepUndergroundRecipeProvider::new);
		pack.addProvider(DeepUndergroundFeatureProvider::new);
	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder)
	{
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, DeepUndergroundFeatureProvider::bootstrapConfiguredFeatures);
	}
}
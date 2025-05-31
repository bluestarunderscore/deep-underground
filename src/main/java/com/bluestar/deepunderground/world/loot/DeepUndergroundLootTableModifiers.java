package com.bluestar.deepunderground.world.loot;

import com.bluestar.deepunderground.items.DeepUndergroundItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class DeepUndergroundLootTableModifiers
{
    public static void modifyLootTables()
    {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) ->
        {

            if (LootTables.BASTION_TREASURE_CHEST.equals(key))
            {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f)) // Drops 80% of the time
                        .with(ItemEntry.builder(DeepUndergroundItems.RED_ONYX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 5.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (LootTables.BASTION_OTHER_CHEST.equals(key))
            {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.65f)) // Drops 65% of the time
                        .with(ItemEntry.builder(DeepUndergroundItems.RED_ONYX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if (LootTables.BASTION_BRIDGE_CHEST.equals(key))
            {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f)) // Drops 40% of the time
                        .with(ItemEntry.builder(DeepUndergroundItems.RED_ONYX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

        });
    }

}

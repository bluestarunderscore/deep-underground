package com.bluestar.deepunderground.datagen;

import com.bluestar.deepunderground.blocks.DeepUndergroundBlocks;
import com.bluestar.deepunderground.items.DeepUndergroundItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class DeepUndergroundItemTagProvider extends FabricTagProvider.ItemTagProvider
{
    public static final TagKey<Item> COMMON_ARMORS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "armors"));

    public static final TagKey<Item> COMMON_GEMS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "gems"));
    public static final TagKey<Item> COMMON_VIRIDIUM_INGOTS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "ingots/viridium"));
    public static final TagKey<Item> COMMON_CERULIUM_INGOTS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "ingots/cerulium"));
    public static final TagKey<Item> COMMON_INGOTS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "ingots"));
    public static final TagKey<Item> COMMON_NUGGETS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "nuggets"));
    public static final TagKey<Item> COMMON_RAW_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "raw_materials"));
    public static final TagKey<Item> COMMON_STONES = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "stones"));
    public static final TagKey<Item> COMMON_COBBLESTONES = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "cobblestones"));

    public static final TagKey<Item> COMMON_ORES = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "ores"));
    public static final TagKey<Item> COMMON_D_ORES = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "ores_in_ground/deepslate"));

    public static final TagKey<Item> COMMON_STORAGE = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "storage_blocks"));
    public static final TagKey<Item> COMMON_RAW_BLOCKS = TagKey.of(RegistryKeys.ITEM, Identifier.of("c", "raw_blocks"));

    public DeepUndergroundItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(DeepUndergroundBlocks.FRAMED_POLISHED_BLACKSTONE.asItem());

        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(DeepUndergroundItems.CERULIUM_INGOT)
                .add(DeepUndergroundItems.VIRIDIUM_INGOT)
                .add(DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT);

        getOrCreateTagBuilder(COMMON_INGOTS)
                .add(DeepUndergroundItems.VIRIDIUM_INGOT)
                .add(DeepUndergroundItems.CERULIUM_INGOT)
                .add(DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT);

        getOrCreateTagBuilder(COMMON_RAW_MATERIALS)
                .add(DeepUndergroundItems.RAW_VIRIDIUM)
                .add(DeepUndergroundItems.RAW_CERULIUM);

        getOrCreateTagBuilder(COMMON_CERULIUM_INGOTS)
                .add(DeepUndergroundItems.CERULIUM_INGOT);

        getOrCreateTagBuilder(COMMON_VIRIDIUM_INGOTS)
                .add(DeepUndergroundItems.VIRIDIUM_INGOT);

        getOrCreateTagBuilder(COMMON_NUGGETS)
                .add(DeepUndergroundItems.VIRIDIUM_NUGGET)
                .add(DeepUndergroundItems.CERULIUM_NUGGET)
                .add(DeepUndergroundItems.DEPTHBOUND_STEEL_NUGGET);

        getOrCreateTagBuilder(COMMON_COBBLESTONES)
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE.asItem())
                .add(DeepUndergroundBlocks.COBBLED_SCHIST.asItem());

        getOrCreateTagBuilder(COMMON_STONES)
                .add(DeepUndergroundBlocks.BLACK_GRANITE.asItem())
                .add(DeepUndergroundBlocks.GRIMSLATE.asItem())
                .add(DeepUndergroundBlocks.SCHIST.asItem());

        getOrCreateTagBuilder(COMMON_RAW_BLOCKS)
                .add(DeepUndergroundBlocks.RAW_VIRIDIUM_BLOCK.asItem())
                .add(DeepUndergroundBlocks.RAW_CERULIUM_BLOCK.asItem())
                .add(DeepUndergroundBlocks.INERT_DEPTHBOUND_BLOCK.asItem());

        getOrCreateTagBuilder(COMMON_STORAGE)
                .add(DeepUndergroundBlocks.RAW_VIRIDIUM_BLOCK.asItem())
                .add(DeepUndergroundBlocks.RAW_CERULIUM_BLOCK.asItem())
                .add(DeepUndergroundBlocks.VIRIDIUM_BLOCK.asItem())
                .add(DeepUndergroundBlocks.CERULIUM_BLOCK.asItem())
                .add(DeepUndergroundBlocks.INERT_DEPTHBOUND_BLOCK.asItem())
                .add(DeepUndergroundBlocks.DEPTHBOUND_STEEL_BLOCK.asItem());

        getOrCreateTagBuilder(COMMON_D_ORES)
                .add(DeepUndergroundBlocks.DEEPSLATE_VIRIDIUM_ORE.asItem())
                .add(DeepUndergroundBlocks.DEEPSLATE_CERULIUM_ORE.asItem())
                .add(DeepUndergroundBlocks.DEEPSLATE_CYCLITE_ORE.asItem());

        getOrCreateTagBuilder(COMMON_ORES)
                .add(DeepUndergroundBlocks.DEEPSLATE_VIRIDIUM_ORE.asItem())
                .add(DeepUndergroundBlocks.DEEPSLATE_CERULIUM_ORE.asItem())
                .add(DeepUndergroundBlocks.DEEPSLATE_CYCLITE_ORE.asItem());

        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(DeepUndergroundBlocks.COBBLED_SCHIST.asItem())
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE.asItem());

        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(DeepUndergroundBlocks.COBBLED_SCHIST.asItem())
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(DeepUndergroundBlocks.BLACK_GRANITE_STAIRS.asItem())
                .add(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_STAIRS.asItem())
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE_STAIRS.asItem())
                .add(DeepUndergroundBlocks.POLISHED_GRIMSLATE_STAIRS.asItem())
                .add(DeepUndergroundBlocks.GRIMSLATE_BRICK_STAIRS.asItem())
                .add(DeepUndergroundBlocks.COBBLED_SCHIST_STAIRS.asItem())
                .add(DeepUndergroundBlocks.POLISHED_SCHIST_STAIRS.asItem())
                .add(DeepUndergroundBlocks.SCHIST_BRICK_STAIRS.asItem())
                .add(DeepUndergroundBlocks.HADEITE_BRICK_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(DeepUndergroundBlocks.BLACK_GRANITE_SLAB.asItem())
                .add(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_SLAB.asItem())
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE_SLAB.asItem())
                .add(DeepUndergroundBlocks.POLISHED_GRIMSLATE_SLAB.asItem())
                .add(DeepUndergroundBlocks.GRIMSLATE_BRICK_SLAB.asItem())
                .add(DeepUndergroundBlocks.COBBLED_SCHIST_SLAB.asItem())
                .add(DeepUndergroundBlocks.POLISHED_SCHIST_SLAB.asItem())
                .add(DeepUndergroundBlocks.SCHIST_BRICK_SLAB.asItem())
                .add(DeepUndergroundBlocks.HADEITE_BRICK_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(DeepUndergroundBlocks.BLACK_GRANITE_WALL.asItem())
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE_WALL.asItem())
                .add(DeepUndergroundBlocks.POLISHED_GRIMSLATE_WALL.asItem())
                .add(DeepUndergroundBlocks.GRIMSLATE_BRICK_WALL.asItem())
                .add(DeepUndergroundBlocks.COBBLED_SCHIST_WALL.asItem())
                .add(DeepUndergroundBlocks.POLISHED_SCHIST_WALL.asItem())
                .add(DeepUndergroundBlocks.SCHIST_BRICK_WALL.asItem())
                .add(DeepUndergroundBlocks.HADEITE_BRICK_WALL.asItem());

        getOrCreateTagBuilder(COMMON_ARMORS)
                .add(DeepUndergroundItems.VIRIDIUM_HELMET)
                .add(DeepUndergroundItems.VIRIDIUM_CHESTPLATE)
                .add(DeepUndergroundItems.VIRIDIUM_LEGGINGS)
                .add(DeepUndergroundItems.VIRIDIUM_BOOTS)
                .add(DeepUndergroundItems.CERULIUM_HELMET)
                .add(DeepUndergroundItems.CERULIUM_CHESTPLATE)
                .add(DeepUndergroundItems.CERULIUM_LEGGINGS)
                .add(DeepUndergroundItems.CERULIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(DeepUndergroundItems.VIRIDIUM_HELMET)
                .add(DeepUndergroundItems.VIRIDIUM_CHESTPLATE)
                .add(DeepUndergroundItems.VIRIDIUM_LEGGINGS)
                .add(DeepUndergroundItems.VIRIDIUM_BOOTS)
                .add(DeepUndergroundItems.CERULIUM_HELMET)
                .add(DeepUndergroundItems.CERULIUM_CHESTPLATE)
                .add(DeepUndergroundItems.CERULIUM_LEGGINGS)
                .add(DeepUndergroundItems.CERULIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(DeepUndergroundItems.VIRIDIUM_HELMET)
                .add(DeepUndergroundItems.CERULIUM_HELMET);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(DeepUndergroundItems.VIRIDIUM_HELMET)
                .add(DeepUndergroundItems.CERULIUM_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(DeepUndergroundItems.VIRIDIUM_CHESTPLATE)
                .add(DeepUndergroundItems.CERULIUM_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(DeepUndergroundItems.VIRIDIUM_CHESTPLATE)
                .add(DeepUndergroundItems.CERULIUM_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(DeepUndergroundItems.VIRIDIUM_LEGGINGS)
                .add(DeepUndergroundItems.CERULIUM_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(DeepUndergroundItems.VIRIDIUM_LEGGINGS)
                .add(DeepUndergroundItems.CERULIUM_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(DeepUndergroundItems.VIRIDIUM_BOOTS)
                .add(DeepUndergroundItems.CERULIUM_BOOTS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(DeepUndergroundItems.VIRIDIUM_BOOTS)
                .add(DeepUndergroundItems.CERULIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(DeepUndergroundItems.VIRIDIUM_SWORD)
                .add(DeepUndergroundItems.DEPTHBOUND_SWORD)
                .add(DeepUndergroundItems.CERULIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(DeepUndergroundItems.VIRIDIUM_PICKAXE)
                .add(DeepUndergroundItems.DEPTHBOUND_PICKAXE)
                .add(DeepUndergroundItems.CERULIUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(DeepUndergroundItems.VIRIDIUM_AXE)
                .add(DeepUndergroundItems.DEPTHBOUND_AXE)
                .add(DeepUndergroundItems.CERULIUM_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(DeepUndergroundItems.VIRIDIUM_SHOVEL)
                .add(DeepUndergroundItems.DEPTHBOUND_SHOVEL)
                .add(DeepUndergroundItems.CERULIUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(DeepUndergroundItems.VIRIDIUM_HOE)
                .add(DeepUndergroundItems.DEPTHBOUND_HOE)
                .add(DeepUndergroundItems.CERULIUM_HOE);

    }

}

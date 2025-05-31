package com.bluestar.deepunderground.datagen;

import com.bluestar.deepunderground.blocks.DeepUndergroundBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class DeepUndergroundBlockTagProvider extends FabricTagProvider.BlockTagProvider
{

    public DeepUndergroundBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {


        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(DeepUndergroundBlocks.VIRIDIUM_BLOCK)
                .add(DeepUndergroundBlocks.CERULIUM_BLOCK)
                .add(DeepUndergroundBlocks.RED_ONYX_BLOCK)
                .add(DeepUndergroundBlocks.DEPTHBOUND_STEEL_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(DeepUndergroundBlocks.GRIMSLATE)
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE)
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE_STAIRS)
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE_SLAB)
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE_WALL)
                .add(DeepUndergroundBlocks.POLISHED_GRIMSLATE)
                .add(DeepUndergroundBlocks.POLISHED_GRIMSLATE_SLAB)
                .add(DeepUndergroundBlocks.POLISHED_GRIMSLATE_STAIRS)
                .add(DeepUndergroundBlocks.POLISHED_GRIMSLATE_WALL)
                .add(DeepUndergroundBlocks.GRIMSLATE_BRICKS)
                .add(DeepUndergroundBlocks.GRIMSLATE_BRICK_STAIRS)
                .add(DeepUndergroundBlocks.GRIMSLATE_BRICK_SLAB)
                .add(DeepUndergroundBlocks.GRIMSLATE_BRICK_WALL)
                .add(DeepUndergroundBlocks.BLACK_GRANITE)
                .add(DeepUndergroundBlocks.BLACK_GRANITE_STAIRS)
                .add(DeepUndergroundBlocks.BLACK_GRANITE_SLAB)
                .add(DeepUndergroundBlocks.BLACK_GRANITE_WALL)
                .add(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE)
                .add(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_STAIRS)
                .add(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_SLAB)
                .add(DeepUndergroundBlocks.SCHIST)
                .add(DeepUndergroundBlocks.COBBLED_SCHIST)
                .add(DeepUndergroundBlocks.COBBLED_SCHIST_STAIRS)
                .add(DeepUndergroundBlocks.COBBLED_SCHIST_SLAB)
                .add(DeepUndergroundBlocks.COBBLED_SCHIST_WALL)
                .add(DeepUndergroundBlocks.POLISHED_SCHIST)
                .add(DeepUndergroundBlocks.POLISHED_SCHIST_STAIRS)
                .add(DeepUndergroundBlocks.POLISHED_SCHIST_SLAB)
                .add(DeepUndergroundBlocks.POLISHED_SCHIST_WALL)
                .add(DeepUndergroundBlocks.SCHIST_BRICKS)
                .add(DeepUndergroundBlocks.SCHIST_BRICK_STAIRS)
                .add(DeepUndergroundBlocks.SCHIST_BRICK_SLAB)
                .add(DeepUndergroundBlocks.SCHIST_BRICK_WALL)
                .add(DeepUndergroundBlocks.CRACKED_SCHIST_BRICKS)
                .add(DeepUndergroundBlocks.CHISELED_SCHIST)
                .add(DeepUndergroundBlocks.FRAMED_POLISHED_BLACKSTONE)
                .add(DeepUndergroundBlocks.DEEPSLATE_VIRIDIUM_ORE)
                .add(DeepUndergroundBlocks.DEEPSLATE_CERULIUM_ORE)
                .add(DeepUndergroundBlocks.RAW_VIRIDIUM_BLOCK)
                .add(DeepUndergroundBlocks.RAW_CERULIUM_BLOCK)
                .add(DeepUndergroundBlocks.VIRIDIUM_BLOCK)
                .add(DeepUndergroundBlocks.CERULIUM_BLOCK)
                .add(DeepUndergroundBlocks.RED_ONYX_BLOCK)
                .add(DeepUndergroundBlocks.INERT_DEPTHBOUND_BLOCK)
                .add(DeepUndergroundBlocks.DEPTHBOUND_STEEL_BLOCK);

        getOrCreateTagBuilder(BlockTags.BASE_STONE_OVERWORLD)
                .add(DeepUndergroundBlocks.GRIMSLATE)
                .add(DeepUndergroundBlocks.BLACK_GRANITE)
                .add(DeepUndergroundBlocks.SCHIST);

        getOrCreateTagBuilder(BlockTags.OVERWORLD_CARVER_REPLACEABLES)
                .add(DeepUndergroundBlocks.GRIMSLATE)
                .add(DeepUndergroundBlocks.BLACK_GRANITE)
                .add(DeepUndergroundBlocks.SCHIST);

        getOrCreateTagBuilder(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
                .add(DeepUndergroundBlocks.BLACK_GRANITE)
                .add(DeepUndergroundBlocks.SCHIST)
                .add(DeepUndergroundBlocks.GRIMSLATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(DeepUndergroundBlocks.DEEPSLATE_CERULIUM_ORE)
                .add(DeepUndergroundBlocks.DEEPSLATE_VIRIDIUM_ORE)
                .add(DeepUndergroundBlocks.RAW_CERULIUM_BLOCK)
                .add(DeepUndergroundBlocks.RAW_VIRIDIUM_BLOCK)
                .add(DeepUndergroundBlocks.CERULIUM_BLOCK)
                .add(DeepUndergroundBlocks.VIRIDIUM_BLOCK)
                .add(DeepUndergroundBlocks.INERT_DEPTHBOUND_BLOCK)
                .add(DeepUndergroundBlocks.DEPTHBOUND_STEEL_BLOCK);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(DeepUndergroundBlocks.BLACK_GRANITE_STAIRS)
                .add(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_STAIRS)
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE_STAIRS)
                .add(DeepUndergroundBlocks.POLISHED_GRIMSLATE_STAIRS)
                .add(DeepUndergroundBlocks.COBBLED_SCHIST_STAIRS)
                .add(DeepUndergroundBlocks.POLISHED_SCHIST_STAIRS)
                .add(DeepUndergroundBlocks.SCHIST_BRICK_STAIRS)
                .add(DeepUndergroundBlocks.GRIMSLATE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(DeepUndergroundBlocks.BLACK_GRANITE_SLAB)
                .add(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_SLAB)
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE_SLAB)
                .add(DeepUndergroundBlocks.POLISHED_GRIMSLATE_SLAB)
                .add(DeepUndergroundBlocks.COBBLED_SCHIST_SLAB)
                .add(DeepUndergroundBlocks.POLISHED_SCHIST_SLAB)
                .add(DeepUndergroundBlocks.SCHIST_BRICK_SLAB)
                .add(DeepUndergroundBlocks.GRIMSLATE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(DeepUndergroundBlocks.BLACK_GRANITE_WALL)
                .add(DeepUndergroundBlocks.COBBLED_GRIMSLATE_WALL)
                .add(DeepUndergroundBlocks.POLISHED_GRIMSLATE_WALL)
                .add(DeepUndergroundBlocks.GRIMSLATE_BRICK_WALL)
                .add(DeepUndergroundBlocks.COBBLED_SCHIST_WALL)
                .add(DeepUndergroundBlocks.POLISHED_SCHIST_WALL)
                .add(DeepUndergroundBlocks.SCHIST_BRICK_WALL);
    }
}

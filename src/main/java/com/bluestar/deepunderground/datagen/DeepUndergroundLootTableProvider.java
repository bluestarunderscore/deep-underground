package com.bluestar.deepunderground.datagen;

import com.bluestar.deepunderground.blocks.DeepUndergroundBlocks;
import com.bluestar.deepunderground.items.DeepUndergroundItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class DeepUndergroundLootTableProvider extends FabricBlockLootTableProvider
{
    public DeepUndergroundLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {

        addDrop(DeepUndergroundBlocks.CERULIUM_BLOCK);
        addDrop(DeepUndergroundBlocks.VIRIDIUM_BLOCK);
        addDrop(DeepUndergroundBlocks.RAW_VIRIDIUM_BLOCK);
        addDrop(DeepUndergroundBlocks.RAW_CERULIUM_BLOCK);
        addDrop(DeepUndergroundBlocks.RED_ONYX_BLOCK);
        addDrop(DeepUndergroundBlocks.DEPTHBOUND_STEEL_BLOCK);
        addDrop(DeepUndergroundBlocks.INERT_DEPTHBOUND_BLOCK);

        addDrop(DeepUndergroundBlocks.FRAMED_POLISHED_BLACKSTONE);


        addDrop(DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        addDrop(DeepUndergroundBlocks.COBBLED_SCHIST);
        addDrop(DeepUndergroundBlocks.BLACK_GRANITE);

        addDrop(DeepUndergroundBlocks.GRIMSLATE_BRICKS);
        addDrop(DeepUndergroundBlocks.SCHIST_BRICKS);
        addDrop(DeepUndergroundBlocks.CRACKED_SCHIST_BRICKS);
        addDrop(DeepUndergroundBlocks.CHISELED_SCHIST);

        addDrop(DeepUndergroundBlocks.DEEPSLATE_VIRIDIUM_ORE, oreDrops(DeepUndergroundBlocks.DEEPSLATE_VIRIDIUM_ORE, DeepUndergroundItems.RAW_VIRIDIUM));
        addDrop(DeepUndergroundBlocks.DEEPSLATE_CERULIUM_ORE, oreDrops(DeepUndergroundBlocks.DEEPSLATE_CERULIUM_ORE, DeepUndergroundItems.RAW_CERULIUM));

        addDrop(DeepUndergroundBlocks.GRIMSLATE, block -> this.drops(block, DeepUndergroundBlocks.COBBLED_GRIMSLATE));
        addDrop(DeepUndergroundBlocks.SCHIST, block -> this.drops(block, DeepUndergroundBlocks.COBBLED_SCHIST));

        //POLISHED
        addDrop(DeepUndergroundBlocks.POLISHED_GRIMSLATE);
        addDrop(DeepUndergroundBlocks.POLISHED_SCHIST);
        addDrop(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE);

        //SLABS
        addSlab(DeepUndergroundBlocks.COBBLED_GRIMSLATE_SLAB);
        addSlab(DeepUndergroundBlocks.POLISHED_GRIMSLATE_SLAB);
        addSlab(DeepUndergroundBlocks.GRIMSLATE_BRICK_SLAB);
        addSlab(DeepUndergroundBlocks.COBBLED_SCHIST_SLAB);
        addSlab(DeepUndergroundBlocks.POLISHED_SCHIST_SLAB);
        addSlab(DeepUndergroundBlocks.SCHIST_BRICK_SLAB);
        addSlab(DeepUndergroundBlocks.BLACK_GRANITE_SLAB);
        addSlab(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_SLAB);

        //STAIRS
        addDrop(DeepUndergroundBlocks.COBBLED_GRIMSLATE_STAIRS);
        addDrop(DeepUndergroundBlocks.POLISHED_GRIMSLATE_STAIRS);
        addDrop(DeepUndergroundBlocks.GRIMSLATE_BRICK_STAIRS);
        addDrop(DeepUndergroundBlocks.COBBLED_SCHIST_STAIRS);
        addDrop(DeepUndergroundBlocks.POLISHED_SCHIST_STAIRS);
        addDrop(DeepUndergroundBlocks.SCHIST_BRICK_STAIRS);
        addDrop(DeepUndergroundBlocks.BLACK_GRANITE_STAIRS);
        addDrop(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_STAIRS);

        //WALLS
        addDrop(DeepUndergroundBlocks.COBBLED_GRIMSLATE_WALL);
        addDrop(DeepUndergroundBlocks.POLISHED_GRIMSLATE_WALL);
        addDrop(DeepUndergroundBlocks.GRIMSLATE_BRICK_WALL);
        addDrop(DeepUndergroundBlocks.COBBLED_SCHIST_WALL);
        addDrop(DeepUndergroundBlocks.POLISHED_SCHIST_WALL);
        addDrop(DeepUndergroundBlocks.SCHIST_BRICK_WALL);
        addDrop(DeepUndergroundBlocks.BLACK_GRANITE_WALL);
    }

    public void addSlab(Block block)
    {
        addDrop(block, slabDrops(block));
    }
}

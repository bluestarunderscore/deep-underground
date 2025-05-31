package com.bluestar.deepunderground.datagen;

import com.bluestar.deepunderground.blocks.DeepUndergroundBlocks;
import com.bluestar.deepunderground.items.DeepUndergroundItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

//TODO: FIX WALL DATAGEN
public class DeepUndergroundModelProvider extends FabricModelProvider
{
    public DeepUndergroundModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        BlockStateModelGenerator.BlockTexturePool blackGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(
                DeepUndergroundBlocks.BLACK_GRANITE
        );

        BlockStateModelGenerator.BlockTexturePool polishedblackGranitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(
                DeepUndergroundBlocks.POLISHED_BLACK_GRANITE
        );

        BlockStateModelGenerator.BlockTexturePool cobbledGrimslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(
                DeepUndergroundBlocks.COBBLED_GRIMSLATE
        );

        BlockStateModelGenerator.BlockTexturePool polishedGrimslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(
                DeepUndergroundBlocks.POLISHED_GRIMSLATE
        );

        BlockStateModelGenerator.BlockTexturePool grimslateBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(
                DeepUndergroundBlocks.GRIMSLATE_BRICKS
        );

        BlockStateModelGenerator.BlockTexturePool cobbledSchistPool = blockStateModelGenerator.registerCubeAllModelTexturePool(
                DeepUndergroundBlocks.COBBLED_SCHIST
        );

        BlockStateModelGenerator.BlockTexturePool polishedSchistPool = blockStateModelGenerator.registerCubeAllModelTexturePool(
                DeepUndergroundBlocks.POLISHED_SCHIST
        );

        BlockStateModelGenerator.BlockTexturePool schistBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(
                DeepUndergroundBlocks.SCHIST_BRICKS
        );

        //BLOCKS
        blockStateModelGenerator.registerSimpleCubeAll(DeepUndergroundBlocks.FRAMED_POLISHED_BLACKSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(DeepUndergroundBlocks.CRACKED_SCHIST_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(DeepUndergroundBlocks.CHISELED_SCHIST);
        blockStateModelGenerator.registerSimpleCubeAll(DeepUndergroundBlocks.DEEPSLATE_VIRIDIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(DeepUndergroundBlocks.DEEPSLATE_CERULIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(DeepUndergroundBlocks.RAW_VIRIDIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DeepUndergroundBlocks.RAW_CERULIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DeepUndergroundBlocks.VIRIDIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DeepUndergroundBlocks.CERULIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DeepUndergroundBlocks.RED_ONYX_BLOCK);
        //blockStateModelGenerator.registerSimpleCubeAll(DeepUndergroundBlocks.INERT_DEPTHBOUND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(DeepUndergroundBlocks.DEPTHBOUND_STEEL_BLOCK);

        //BLACK GRANITE
        blackGranitePool.stairs(DeepUndergroundBlocks.BLACK_GRANITE_STAIRS);
        blackGranitePool.slab(DeepUndergroundBlocks.BLACK_GRANITE_SLAB);
        blackGranitePool.wall(DeepUndergroundBlocks.BLACK_GRANITE_WALL);

        polishedblackGranitePool.stairs(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_STAIRS);
        polishedblackGranitePool.slab(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_SLAB);

        //GRIMSLATE
        cobbledGrimslatePool.stairs(DeepUndergroundBlocks.COBBLED_GRIMSLATE_STAIRS);
        cobbledGrimslatePool.slab(DeepUndergroundBlocks.COBBLED_GRIMSLATE_SLAB);
        cobbledGrimslatePool.wall(DeepUndergroundBlocks.COBBLED_GRIMSLATE_WALL);

        polishedGrimslatePool.stairs(DeepUndergroundBlocks.POLISHED_GRIMSLATE_STAIRS);
        polishedGrimslatePool.slab(DeepUndergroundBlocks.POLISHED_GRIMSLATE_SLAB);
        polishedGrimslatePool.wall(DeepUndergroundBlocks.POLISHED_GRIMSLATE_WALL);

        grimslateBricksPool.stairs(DeepUndergroundBlocks.GRIMSLATE_BRICK_STAIRS);
        grimslateBricksPool.slab(DeepUndergroundBlocks.GRIMSLATE_BRICK_SLAB);
        grimslateBricksPool.wall(DeepUndergroundBlocks.GRIMSLATE_BRICK_WALL);

        //SCHIST
        cobbledSchistPool.stairs(DeepUndergroundBlocks.COBBLED_SCHIST_STAIRS);
        cobbledSchistPool.slab(DeepUndergroundBlocks.COBBLED_SCHIST_SLAB);
        cobbledSchistPool.wall(DeepUndergroundBlocks.COBBLED_SCHIST_WALL);

        polishedSchistPool.stairs(DeepUndergroundBlocks.POLISHED_SCHIST_STAIRS);
        polishedSchistPool.slab(DeepUndergroundBlocks.POLISHED_SCHIST_SLAB);
        polishedSchistPool.wall(DeepUndergroundBlocks.POLISHED_SCHIST_WALL);

        schistBricksPool.stairs(DeepUndergroundBlocks.SCHIST_BRICK_STAIRS);
        schistBricksPool.slab(DeepUndergroundBlocks.SCHIST_BRICK_SLAB);
        schistBricksPool.wall(DeepUndergroundBlocks.SCHIST_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(DeepUndergroundItems.RAW_CERULIUM, Models.GENERATED);
        itemModelGenerator.register(DeepUndergroundItems.RAW_VIRIDIUM, Models.GENERATED);
        itemModelGenerator.register(DeepUndergroundItems.CERULIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(DeepUndergroundItems.CERULIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(DeepUndergroundItems.VIRIDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(DeepUndergroundItems.VIRIDIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(DeepUndergroundItems.RED_ONYX, Models.GENERATED);
        itemModelGenerator.register(DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(DeepUndergroundItems.DEPTHBOUND_STEEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(DeepUndergroundItems.DEPTHBOUND_SCRAP, Models.GENERATED);

        itemModelGenerator.register(DeepUndergroundItems.VIRIDIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DeepUndergroundItems.VIRIDIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DeepUndergroundItems.VIRIDIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(DeepUndergroundItems.VIRIDIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DeepUndergroundItems.VIRIDIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(DeepUndergroundItems.CERULIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(DeepUndergroundItems.CERULIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(DeepUndergroundItems.CERULIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(DeepUndergroundItems.CERULIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(DeepUndergroundItems.CERULIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(DeepUndergroundItems.DEPTHBOUND_SWORD, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) DeepUndergroundItems.VIRIDIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) DeepUndergroundItems.VIRIDIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) DeepUndergroundItems.VIRIDIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) DeepUndergroundItems.VIRIDIUM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) DeepUndergroundItems.CERULIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) DeepUndergroundItems.CERULIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) DeepUndergroundItems.CERULIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) DeepUndergroundItems.CERULIUM_BOOTS));
    }
}

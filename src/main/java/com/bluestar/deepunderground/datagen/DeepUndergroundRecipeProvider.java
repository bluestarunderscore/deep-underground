package com.bluestar.deepunderground.datagen;

import com.bluestar.deepunderground.blocks.DeepUndergroundBlocks;
import com.bluestar.deepunderground.items.DeepUndergroundItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class DeepUndergroundRecipeProvider extends FabricRecipeProvider
{
    public DeepUndergroundRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, DeepUndergroundItems.DEPTHBOUND_SCRAP, 1)
                .input(Items.NETHERITE_SCRAP)
                .input(Items.NETHERITE_SCRAP)
                .input(Items.NETHERITE_SCRAP)
                .input(Items.NETHERITE_SCRAP)
                .input(DeepUndergroundItems.RAW_CERULIUM)
                .input(DeepUndergroundItems.RAW_CERULIUM)
                .input(DeepUndergroundItems.RAW_CERULIUM)
                .input(DeepUndergroundItems.RAW_CERULIUM)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.RAW_CERULIUM),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.RAW_CERULIUM)))
                .offerTo(recipeExporter, "depthbound_scrap_from_netherite_scrap");

        offerStairsRecipe(recipeExporter, DeepUndergroundBlocks.BLACK_GRANITE_STAIRS, DeepUndergroundBlocks.BLACK_GRANITE);
        offerStairsRecipe(recipeExporter, DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_STAIRS, DeepUndergroundBlocks.POLISHED_BLACK_GRANITE);
        offerSlabRecipe(recipeExporter, DeepUndergroundBlocks.BLACK_GRANITE_SLAB, DeepUndergroundBlocks.BLACK_GRANITE);
        offerSlabRecipe(recipeExporter, DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_SLAB, DeepUndergroundBlocks.POLISHED_BLACK_GRANITE);
        offerWallRecipe(recipeExporter, DeepUndergroundBlocks.BLACK_GRANITE_WALL, DeepUndergroundBlocks.BLACK_GRANITE);

        //GRIMSLATE
        offerStairsRecipe(recipeExporter, DeepUndergroundBlocks.COBBLED_GRIMSLATE_STAIRS, DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        offerStairsRecipe(recipeExporter, DeepUndergroundBlocks.POLISHED_GRIMSLATE_STAIRS, DeepUndergroundBlocks.POLISHED_GRIMSLATE);
        offerStairsRecipe(recipeExporter, DeepUndergroundBlocks.GRIMSLATE_BRICK_STAIRS, DeepUndergroundBlocks.GRIMSLATE_BRICKS);
        offerSlabRecipe(recipeExporter, DeepUndergroundBlocks.COBBLED_GRIMSLATE_SLAB, DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        offerSlabRecipe(recipeExporter, DeepUndergroundBlocks.POLISHED_GRIMSLATE_SLAB, DeepUndergroundBlocks.POLISHED_GRIMSLATE);
        offerSlabRecipe(recipeExporter, DeepUndergroundBlocks.GRIMSLATE_BRICK_SLAB, DeepUndergroundBlocks.GRIMSLATE_BRICKS);
        offerWallRecipe(recipeExporter, DeepUndergroundBlocks.COBBLED_GRIMSLATE_WALL, DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        offerWallRecipe(recipeExporter, DeepUndergroundBlocks.POLISHED_GRIMSLATE_WALL, DeepUndergroundBlocks.POLISHED_GRIMSLATE);
        offerWallRecipe(recipeExporter, DeepUndergroundBlocks.GRIMSLATE_BRICK_WALL, DeepUndergroundBlocks.GRIMSLATE_BRICKS);

        //SCHIST
        offerStairsRecipe(recipeExporter, DeepUndergroundBlocks.COBBLED_SCHIST_STAIRS, DeepUndergroundBlocks.COBBLED_SCHIST);
        offerStairsRecipe(recipeExporter, DeepUndergroundBlocks.POLISHED_SCHIST_STAIRS, DeepUndergroundBlocks.POLISHED_SCHIST);
        offerStairsRecipe(recipeExporter, DeepUndergroundBlocks.SCHIST_BRICK_STAIRS, DeepUndergroundBlocks.SCHIST_BRICKS);
        offerSlabRecipe(recipeExporter, DeepUndergroundBlocks.COBBLED_SCHIST_SLAB, DeepUndergroundBlocks.COBBLED_SCHIST);
        offerSlabRecipe(recipeExporter, DeepUndergroundBlocks.POLISHED_SCHIST_SLAB, DeepUndergroundBlocks.POLISHED_SCHIST);
        offerSlabRecipe(recipeExporter, DeepUndergroundBlocks.SCHIST_BRICK_SLAB, DeepUndergroundBlocks.SCHIST_BRICKS);
        offerWallRecipe(recipeExporter, DeepUndergroundBlocks.COBBLED_SCHIST_WALL, DeepUndergroundBlocks.COBBLED_SCHIST);
        offerWallRecipe(recipeExporter, DeepUndergroundBlocks.POLISHED_SCHIST_WALL, DeepUndergroundBlocks.POLISHED_SCHIST);
        offerWallRecipe(recipeExporter, DeepUndergroundBlocks.SCHIST_BRICK_WALL, DeepUndergroundBlocks.SCHIST_BRICKS);

        //HADEITE
        offerStairsRecipe(recipeExporter, DeepUndergroundBlocks.HADEITE_BRICK_STAIRS, DeepUndergroundBlocks.HADEITE_BRICKS);
        offerSlabRecipe(recipeExporter, DeepUndergroundBlocks.HADEITE_BRICK_SLAB, DeepUndergroundBlocks.HADEITE_BRICKS);
        offerWallRecipe(recipeExporter, DeepUndergroundBlocks.HADEITE_BRICK_WALL, DeepUndergroundBlocks.HADEITE_BRICKS);

        //POLISHED
        offerPolishedStoneRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.POLISHED_BLACK_GRANITE, DeepUndergroundBlocks.BLACK_GRANITE);
        offerPolishedStoneRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.POLISHED_GRIMSLATE, DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        offerPolishedStoneRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.POLISHED_SCHIST, DeepUndergroundBlocks.COBBLED_SCHIST);

        offerChiseledBlockRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.CHISELED_HADEITE_BRICKS, DeepUndergroundBlocks.HADEITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.CYCLITE_BLOCK, 1)
                .pattern("gg")
                .pattern("gg")
                .input('g', DeepUndergroundItems.CYCLITE)
                .criterion(hasItem(DeepUndergroundItems.CYCLITE), conditionsFromItem(DeepUndergroundItems.CYCLITE))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, DeepUndergroundItems.HADEITE_BRICK, 4)
                        .input(DeepUndergroundBlocks.HADEITE_BRICKS)
                        .criterion(hasItem(DeepUndergroundBlocks.HADEITE_BRICKS), conditionsFromItem(DeepUndergroundBlocks.HADEITE_BRICKS))
                                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.HADEITE_BRICKS, 1)
                .pattern("gg")
                .pattern("gg")
                .input('g', DeepUndergroundItems.HADEITE_BRICK)
                .criterion(hasItem(DeepUndergroundItems.HADEITE_BRICK), conditionsFromItem(DeepUndergroundItems.HADEITE_BRICK))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, DeepUndergroundItems.HADEITE_CLUMP, 4)
                .input(DeepUndergroundBlocks.HADEITE)
                .criterion(hasItem(DeepUndergroundBlocks.HADEITE), conditionsFromItem(DeepUndergroundBlocks.HADEITE))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.HADEITE, 1)
                .pattern("gg")
                .pattern("gg")
                .input('g', DeepUndergroundItems.HADEITE_CLUMP)
                .criterion(hasItem(DeepUndergroundItems.HADEITE_CLUMP), conditionsFromItem(DeepUndergroundItems.HADEITE_CLUMP))
                .offerTo(recipeExporter);



        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.GRIMSLATE_BRICKS, 4)
                .pattern("gg")
                .pattern("gg")
                .input('g', DeepUndergroundBlocks.POLISHED_GRIMSLATE.asItem())
                .criterion(hasItem(DeepUndergroundBlocks.POLISHED_GRIMSLATE.asItem()), conditionsFromItem(DeepUndergroundBlocks.POLISHED_GRIMSLATE.asItem()))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.SCHIST_BRICKS, 4)
                .pattern("ss")
                .pattern("ss")
                .input('s', DeepUndergroundBlocks.POLISHED_SCHIST.asItem())
                .criterion(hasItem(DeepUndergroundBlocks.POLISHED_SCHIST.asItem()), conditionsFromItem(DeepUndergroundBlocks.POLISHED_SCHIST.asItem()))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.CHISELED_SCHIST)
                .pattern("s")
                .pattern("s")
                .input('s', DeepUndergroundBlocks.SCHIST_BRICK_SLAB.asItem())
                .criterion(hasItem(DeepUndergroundBlocks.SCHIST_BRICK_SLAB.asItem()), conditionsFromItem(DeepUndergroundBlocks.SCHIST_BRICK_SLAB.asItem()))
                .offerTo(recipeExporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.FRAMED_POLISHED_BLACKSTONE)
                .pattern("ggg")
                .pattern("gbg")
                .pattern("ggg")
                .input('g', Items.GOLD_INGOT)
                .input('b', Blocks.POLISHED_BLACKSTONE.asItem())
                .criterion(hasItem(Blocks.POLISHED_BLACKSTONE.asItem()), conditionsFromItem(Blocks.POLISHED_BLACKSTONE.asItem()))
                .offerTo(recipeExporter);



        offerSmelting(recipeExporter, List.of(DeepUndergroundBlocks.COBBLED_SCHIST), RecipeCategory.MISC, DeepUndergroundBlocks.SCHIST, 0.25f, 200, "schist");
        offerSmelting(recipeExporter, List.of(DeepUndergroundBlocks.COBBLED_GRIMSLATE), RecipeCategory.MISC, DeepUndergroundBlocks.GRIMSLATE, 0.25f, 200, "grimslate");
        offerSmelting(recipeExporter, List.of(DeepUndergroundBlocks.SCHIST_BRICKS), RecipeCategory.MISC, DeepUndergroundBlocks.CRACKED_SCHIST_BRICKS, 0.25f, 200, "cracked_schist_bricks");
        offerSmelting(recipeExporter, List.of(DeepUndergroundItems.RAW_CERULIUM), RecipeCategory.MISC, DeepUndergroundItems.CERULIUM_INGOT, 1.2f, 200, "cerulium_ingot");
        offerSmelting(recipeExporter, List.of(DeepUndergroundItems.RAW_VIRIDIUM), RecipeCategory.MISC, DeepUndergroundItems.VIRIDIUM_INGOT, 1.2f, 200, "viridium_ingot");
        offerSmelting(recipeExporter, List.of(DeepUndergroundBlocks.DEEPSLATE_CERULIUM_ORE), RecipeCategory.MISC, DeepUndergroundItems.CERULIUM_INGOT, 1.2f, 100, "cerulium_ingot");
        offerSmelting(recipeExporter, List.of(DeepUndergroundBlocks.DEEPSLATE_VIRIDIUM_ORE), RecipeCategory.MISC, DeepUndergroundItems.VIRIDIUM_INGOT, 1.2f, 100, "viridium_ingot");
        offerBlasting(recipeExporter, List.of(DeepUndergroundItems.RAW_CERULIUM), RecipeCategory.MISC, DeepUndergroundItems.CERULIUM_INGOT, 1.2f, 100, "cerulium_ingot");
        offerBlasting(recipeExporter, List.of(DeepUndergroundItems.RAW_VIRIDIUM), RecipeCategory.MISC, DeepUndergroundItems.VIRIDIUM_INGOT, 1.2f, 100, "viridium_ingot");
        offerBlasting(recipeExporter, List.of(DeepUndergroundBlocks.DEEPSLATE_CERULIUM_ORE), RecipeCategory.MISC, DeepUndergroundItems.CERULIUM_INGOT, 1.2f, 100, "cerulium_ingot");
        offerBlasting(recipeExporter, List.of(DeepUndergroundBlocks.DEEPSLATE_VIRIDIUM_ORE), RecipeCategory.MISC, DeepUndergroundItems.VIRIDIUM_INGOT, 1.2f, 100, "viridium_ingot");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, DeepUndergroundItems.RAW_CERULIUM, RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.RAW_CERULIUM_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, DeepUndergroundItems.RAW_VIRIDIUM, RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.RAW_VIRIDIUM_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, DeepUndergroundItems.DEPTHBOUND_SCRAP, RecipeCategory.BUILDING_BLOCKS, DeepUndergroundBlocks.INERT_DEPTHBOUND_BLOCK);

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, DeepUndergroundItems.CERULIUM_NUGGET, RecipeCategory.MISC, DeepUndergroundItems.CERULIUM_INGOT);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, DeepUndergroundItems.VIRIDIUM_NUGGET, RecipeCategory.MISC, DeepUndergroundItems.VIRIDIUM_INGOT);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.MISC, DeepUndergroundItems.DEPTHBOUND_STEEL_NUGGET, RecipeCategory.MISC, DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT);

        //COBBLES TO OTHERS
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_GRIMSLATE, DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.GRIMSLATE_BRICKS, DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.GRIMSLATE_BRICKS, DeepUndergroundBlocks.POLISHED_GRIMSLATE);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_BLACK_GRANITE, DeepUndergroundBlocks.BLACK_GRANITE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_SCHIST, DeepUndergroundBlocks.COBBLED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.SCHIST_BRICKS, DeepUndergroundBlocks.COBBLED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.SCHIST_BRICKS, DeepUndergroundBlocks.POLISHED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.CHISELED_SCHIST, DeepUndergroundBlocks.COBBLED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.CHISELED_SCHIST, DeepUndergroundBlocks.POLISHED_SCHIST);

        //STONECUT TO STAIRS
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.COBBLED_GRIMSLATE_STAIRS, DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_GRIMSLATE_STAIRS, DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_GRIMSLATE_STAIRS, DeepUndergroundBlocks.POLISHED_GRIMSLATE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.GRIMSLATE_BRICK_STAIRS, DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.GRIMSLATE_BRICK_STAIRS, DeepUndergroundBlocks.POLISHED_GRIMSLATE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.GRIMSLATE_BRICK_STAIRS, DeepUndergroundBlocks.GRIMSLATE_BRICKS);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.HADEITE_BRICK_STAIRS, DeepUndergroundBlocks.HADEITE_BRICKS);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.COBBLED_SCHIST_STAIRS, DeepUndergroundBlocks.COBBLED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_SCHIST_STAIRS, DeepUndergroundBlocks.COBBLED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_SCHIST_STAIRS, DeepUndergroundBlocks.POLISHED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.SCHIST_BRICK_STAIRS, DeepUndergroundBlocks.COBBLED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.SCHIST_BRICK_STAIRS, DeepUndergroundBlocks.POLISHED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.SCHIST_BRICK_STAIRS, DeepUndergroundBlocks.SCHIST_BRICKS);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.BLACK_GRANITE_STAIRS, DeepUndergroundBlocks.BLACK_GRANITE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_STAIRS, DeepUndergroundBlocks.BLACK_GRANITE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_STAIRS, DeepUndergroundBlocks.POLISHED_BLACK_GRANITE);

        //STONECUT TO SLAB
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.COBBLED_GRIMSLATE_SLAB, DeepUndergroundBlocks.COBBLED_GRIMSLATE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_GRIMSLATE_SLAB, DeepUndergroundBlocks.COBBLED_GRIMSLATE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_GRIMSLATE_SLAB, DeepUndergroundBlocks.POLISHED_GRIMSLATE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.GRIMSLATE_BRICK_SLAB, DeepUndergroundBlocks.COBBLED_GRIMSLATE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.GRIMSLATE_BRICK_SLAB, DeepUndergroundBlocks.POLISHED_GRIMSLATE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.GRIMSLATE_BRICK_SLAB, DeepUndergroundBlocks.GRIMSLATE_BRICKS, 2);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.HADEITE_BRICK_SLAB, DeepUndergroundBlocks.HADEITE_BRICKS, 2);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.COBBLED_SCHIST_SLAB, DeepUndergroundBlocks.COBBLED_SCHIST, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_SCHIST_SLAB, DeepUndergroundBlocks.COBBLED_SCHIST, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_SCHIST_SLAB, DeepUndergroundBlocks.POLISHED_SCHIST, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.SCHIST_BRICK_SLAB, DeepUndergroundBlocks.COBBLED_SCHIST, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.SCHIST_BRICK_SLAB, DeepUndergroundBlocks.POLISHED_SCHIST, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.SCHIST_BRICK_SLAB, DeepUndergroundBlocks.SCHIST_BRICKS, 2);

        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.BLACK_GRANITE_SLAB, DeepUndergroundBlocks.BLACK_GRANITE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_SLAB, DeepUndergroundBlocks.BLACK_GRANITE, 2);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_SLAB, DeepUndergroundBlocks.POLISHED_BLACK_GRANITE, 2);

        //STONECUT TO WALL
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.COBBLED_GRIMSLATE_WALL, DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_GRIMSLATE_WALL, DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_GRIMSLATE_WALL, DeepUndergroundBlocks.POLISHED_GRIMSLATE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.GRIMSLATE_BRICK_WALL, DeepUndergroundBlocks.COBBLED_GRIMSLATE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.GRIMSLATE_BRICK_WALL, DeepUndergroundBlocks.POLISHED_GRIMSLATE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.GRIMSLATE_BRICK_WALL, DeepUndergroundBlocks.GRIMSLATE_BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.COBBLED_SCHIST_WALL, DeepUndergroundBlocks.COBBLED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_SCHIST_WALL, DeepUndergroundBlocks.COBBLED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.POLISHED_SCHIST_WALL, DeepUndergroundBlocks.POLISHED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.SCHIST_BRICK_WALL, DeepUndergroundBlocks.COBBLED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.SCHIST_BRICK_WALL, DeepUndergroundBlocks.POLISHED_SCHIST);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.SCHIST_BRICK_WALL, DeepUndergroundBlocks.SCHIST_BRICKS);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.BLACK_GRANITE_WALL, DeepUndergroundBlocks.BLACK_GRANITE);
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, DeepUndergroundBlocks.HADEITE_BRICK_WALL, DeepUndergroundBlocks.HADEITE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DeepUndergroundItems.VIRIDIUM_HELMET)
                .pattern("SSS")
                .pattern("S S")
                .input('S', DeepUndergroundItems.VIRIDIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.VIRIDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.VIRIDIUM_INGOT)))
                .offerTo(recipeExporter, "viridium_helmet");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DeepUndergroundItems.VIRIDIUM_CHESTPLATE)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', DeepUndergroundItems.VIRIDIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.VIRIDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.VIRIDIUM_INGOT)))
                .offerTo(recipeExporter, "viridium_chestplate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DeepUndergroundItems.VIRIDIUM_LEGGINGS)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', DeepUndergroundItems.VIRIDIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.VIRIDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.VIRIDIUM_INGOT)))
                .offerTo(recipeExporter, "viridium_leggings");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DeepUndergroundItems.VIRIDIUM_BOOTS)
                .pattern("S S")
                .pattern("S S")
                .input('S', DeepUndergroundItems.VIRIDIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.VIRIDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.VIRIDIUM_INGOT)))
                .offerTo(recipeExporter, "viridium_boots");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DeepUndergroundItems.CERULIUM_HELMET)
                .pattern("SSS")
                .pattern("S S")
                .input('S', DeepUndergroundItems.CERULIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.CERULIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.CERULIUM_INGOT)))
                .offerTo(recipeExporter, "cerulium_helmet");


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DeepUndergroundItems.CERULIUM_CHESTPLATE)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', DeepUndergroundItems.CERULIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.CERULIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.CERULIUM_INGOT)))
                .offerTo(recipeExporter, "cerulium_chestplate");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DeepUndergroundItems.CERULIUM_LEGGINGS)
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .input('S', DeepUndergroundItems.CERULIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.CERULIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.CERULIUM_INGOT)))
                .offerTo(recipeExporter, "cerulium_leggings");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DeepUndergroundItems.CERULIUM_BOOTS)
                .pattern("S S")
                .pattern("S S")
                .input('S', DeepUndergroundItems.CERULIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.CERULIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.CERULIUM_INGOT)))
                .offerTo(recipeExporter, "cerulium_boots");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DeepUndergroundItems.VIRIDIUM_SWORD)
                .pattern("S")
                .pattern("S")
                .pattern("I")
                .input('S', DeepUndergroundItems.VIRIDIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.VIRIDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.VIRIDIUM_INGOT)))
                .offerTo(recipeExporter, "viridium_sword");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, DeepUndergroundItems.VIRIDIUM_PICKAXE)
                .pattern("SSS")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', DeepUndergroundItems.VIRIDIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.VIRIDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.VIRIDIUM_INGOT)))
                .offerTo(recipeExporter, "viridium_pickaxe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, DeepUndergroundItems.VIRIDIUM_AXE)
                .pattern("SS ")
                .pattern("SI ")
                .pattern(" I ")
                .input('S', DeepUndergroundItems.VIRIDIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.VIRIDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.VIRIDIUM_INGOT)))
                .offerTo(recipeExporter, "viridium_axe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, DeepUndergroundItems.VIRIDIUM_SHOVEL)
                .pattern("S")
                .pattern("I")
                .pattern("I")
                .input('S', DeepUndergroundItems.VIRIDIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.VIRIDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.VIRIDIUM_INGOT)))
                .offerTo(recipeExporter, "viridium_shovel");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, DeepUndergroundItems.VIRIDIUM_HOE)
                .pattern("SS ")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', DeepUndergroundItems.VIRIDIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.VIRIDIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.VIRIDIUM_INGOT)))
                .offerTo(recipeExporter, "viridium_hoe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DeepUndergroundItems.CERULIUM_SWORD)
                .pattern("S")
                .pattern("S")
                .pattern("I")
                .input('S', DeepUndergroundItems.CERULIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.CERULIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.CERULIUM_INGOT)))
                .offerTo(recipeExporter, "cerulium_sword");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, DeepUndergroundItems.CERULIUM_PICKAXE)
                .pattern("SSS")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', DeepUndergroundItems.CERULIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.CERULIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.CERULIUM_INGOT)))
                .offerTo(recipeExporter, "cerulium_pickaxe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, DeepUndergroundItems.CERULIUM_AXE)
                .pattern("SS ")
                .pattern("SI ")
                .pattern(" I ")
                .input('S', DeepUndergroundItems.CERULIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.CERULIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.CERULIUM_INGOT)))
                .offerTo(recipeExporter, "cerulium_axe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, DeepUndergroundItems.CERULIUM_SHOVEL)
                .pattern("S")
                .pattern("I")
                .pattern("I")
                .input('S', DeepUndergroundItems.CERULIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.CERULIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.CERULIUM_INGOT)))
                .offerTo(recipeExporter, "cerulium_shovel");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, DeepUndergroundItems.CERULIUM_HOE)
                .pattern("SS ")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', DeepUndergroundItems.CERULIUM_INGOT)
                .input('I', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.CERULIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.CERULIUM_INGOT)))
                .offerTo(recipeExporter, "cerulium_hoe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, DeepUndergroundItems.DEPTHBOUND_SWORD)
                .pattern("S")
                .pattern("S")
                .pattern("I")
                .input('S', DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT)
                .input('I', Items.BREEZE_ROD)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT)))
                .offerTo(recipeExporter, "depthbound_steel_sword");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, DeepUndergroundItems.DEPTHBOUND_PICKAXE)
                .pattern("SSS")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT)
                .input('I', Items.BREEZE_ROD)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT)))
                .offerTo(recipeExporter, "depthbound_steel_pickaxe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, DeepUndergroundItems.DEPTHBOUND_AXE)
                .pattern("SS ")
                .pattern("SI ")
                .pattern(" I ")
                .input('S', DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT)
                .input('I', Items.BREEZE_ROD)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT)))
                .offerTo(recipeExporter, "depthbound_steel_axe");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, DeepUndergroundItems.DEPTHBOUND_SHOVEL)
                .pattern("S")
                .pattern("I")
                .pattern("I")
                .input('S', DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT)
                .input('I', Items.BREEZE_ROD)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT)))
                .offerTo(recipeExporter, "depthbound_steel_shovel");

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, DeepUndergroundItems.DEPTHBOUND_HOE)
                .pattern("SS ")
                .pattern(" I ")
                .pattern(" I ")
                .input('S', DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT)
                .input('I', Items.BREEZE_ROD)
                .criterion(FabricRecipeProvider.hasItem(DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT),
                        FabricRecipeProvider.conditionsFromItem((DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT)))
                .offerTo(recipeExporter, "depthbound_steel_hoe");
    }

    public static void offerStairsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        createStairsRecipe(output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static void offerSlabRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }

    public static void offerWallRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        getWallRecipe(RecipeCategory.BUILDING_BLOCKS, output, Ingredient.ofItems(input)).criterion(hasItem(input), conditionsFromItem(input)).offerTo(exporter);
    }
}

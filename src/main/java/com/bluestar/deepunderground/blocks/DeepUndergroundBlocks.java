package com.bluestar.deepunderground.blocks;

import com.bluestar.deepunderground.DeepUnderground;
import com.bluestar.deepunderground.DeepUndergroundSounds;
import net.kyrptonaught.customportalapi.CustomPortalBlock;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class DeepUndergroundBlocks
{
    //STONE BLOCKS
    public static final Block DEEPSLATE_VIRIDIUM_ORE = register(new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)),
            "deepslate_viridium_ore", true, true);

    public static final Block DEEPSLATE_CERULIUM_ORE = register(new Block(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.DEEPSLATE)),
            "deepslate_cerulium_ore", true, true);

    public static final Block RAW_VIRIDIUM_BLOCK = register(new Block(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)),
            "raw_viridium_block", true, true);
    public static final Block RAW_CERULIUM_BLOCK = register(new Block(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK).strength(30.0F, 1200.0F)),
            "raw_cerulium_block", true, true);

    public static final Block VIRIDIUM_BLOCK = register(new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)),
            "viridium_block", true, true);
    public static final Block CERULIUM_BLOCK = register(new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.METAL)),
            "cerulium_block", true, true);

    public static final Block INERT_DEPTHBOUND_BLOCK = register(new InertDepthboundBlock(),
            "inert_depthbound_block", true, true);
    public static final Block DEPTHBOUND_STEEL_BLOCK = register(new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.NETHERITE)),
            "depthbound_steel_block", true, true);

    public static final Block FRAMED_POLISHED_BLACKSTONE = register(new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_BLACKSTONE).sounds(BlockSoundGroup.METAL)),
            "framed_polished_blackstone", true, false);
    public static final Block BLACK_GRANITE = register(new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).sounds(BlockSoundGroup.STONE)),
            "black_granite", true, false);
    public static final Block POLISHED_BLACK_GRANITE = register(new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE).sounds(BlockSoundGroup.STONE)),
            "polished_black_granite", true, false);
    public static final PillarBlock GRIMSLATE = registerPillar(new PillarBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)),
            "grimslate", true);
    public static final Block COBBLED_GRIMSLATE = register(new Block(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE)),
            "cobbled_grimslate", true, false);
    public static final Block POLISHED_GRIMSLATE = register(new Block(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE)),
            "polished_grimslate", true, false);
    public static final Block GRIMSLATE_BRICKS = register(new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)),
            "grimslate_bricks", true, false);
    public static final PillarBlock SCHIST = registerPillar(new PillarBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)),
            "schist", true);
    public static final Block COBBLED_SCHIST = register(new Block(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE)),
            "cobbled_schist", true, false);
    public static final Block POLISHED_SCHIST = register(new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)),
            "polished_schist", true, false);
    public static final Block SCHIST_BRICKS = register(new Block(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICKS)),
            "schist_bricks", true, false);
    public static final Block CRACKED_SCHIST_BRICKS = register(new Block(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)),
            "cracked_schist_bricks", true, false);
    public static final Block CHISELED_SCHIST = register(new Block(AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)),
            "chiseled_schist", true, false);

    //STONE SLABS
    public static final Block BLACK_GRANITE_SLAB = register(new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRANITE_SLAB)),
            "black_granite_slab", true, false);
    public static final Block POLISHED_BLACK_GRANITE_SLAB = register(new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE_SLAB)),
            "polished_black_granite_slab", true, false);
    public static final Block GRIMSLATE_BRICK_SLAB = register(new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_SLAB)),
            "grimslate_brick_slab", true, false);
    public static final Block POLISHED_GRIMSLATE_SLAB = register(new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_SLAB)),
            "polished_grimslate_slab", true, false);
    public static final Block COBBLED_GRIMSLATE_SLAB = register(new SlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB)),
            "cobbled_grimslate_slab", true, false);
    public static final Block COBBLED_SCHIST_SLAB = register(new SlabBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_SLAB)),
            "cobbled_schist_slab", true, false);
    public static final Block POLISHED_SCHIST_SLAB = register(new SlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_SLAB)),
            "polished_schist_slab", true, false);
    public static final Block SCHIST_BRICK_SLAB = register(new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_SLAB)),
            "schist_brick_slab", true, false);

    //STONE STAIRS
    public static final Block BLACK_GRANITE_STAIRS = register(new StairsBlock(DeepUndergroundBlocks.BLACK_GRANITE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_STAIRS).sounds(BlockSoundGroup.STONE)), "black_granite_stairs", true, false);

    public static final Block POLISHED_BLACK_GRANITE_STAIRS = register(new StairsBlock(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE_STAIRS).sounds(BlockSoundGroup.STONE)), "polished_black_granite_stairs", true, false);

    public static final Block GRIMSLATE_BRICK_STAIRS = register(new StairsBlock(DeepUndergroundBlocks.POLISHED_GRIMSLATE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_STAIRS)),
            "grimslate_brick_stairs", true, false);
    public static final Block POLISHED_GRIMSLATE_STAIRS = register(new StairsBlock(DeepUndergroundBlocks.POLISHED_GRIMSLATE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_STAIRS)),
            "polished_grimslate_stairs", true, false);
    public static final Block COBBLED_GRIMSLATE_STAIRS = register(new StairsBlock(DeepUndergroundBlocks.COBBLED_GRIMSLATE.getDefaultState(),AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_STAIRS)),
            "cobbled_grimslate_stairs", true, false);

    public static final Block COBBLED_SCHIST_STAIRS = register(new StairsBlock(DeepUndergroundBlocks.COBBLED_SCHIST.getDefaultState(),AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_STAIRS)),
            "cobbled_schist_stairs", true, false);
    public static final Block POLISHED_SCHIST_STAIRS = register(new StairsBlock(DeepUndergroundBlocks.POLISHED_SCHIST.getDefaultState(),AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_STAIRS)),
            "polished_schist_stairs", true, false);
    public static final Block SCHIST_BRICK_STAIRS = register(new StairsBlock(DeepUndergroundBlocks.SCHIST_BRICKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_STAIRS)),
            "schist_brick_stairs", true, false);

    public static final Block BLACK_GRANITE_WALL = register(new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_WALL).sounds(BlockSoundGroup.STONE)),
            "black_granite_wall", true, false);

    public static final Block GRIMSLATE_BRICK_WALL = register(new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_WALL)),
            "grimslate_brick_wall", true, false);
    public static final Block POLISHED_GRIMSLATE_WALL = register(new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_WALL)),
            "polished_grimslate_wall", true, false);
    public static final Block COBBLED_GRIMSLATE_WALL = register(new WallBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_WALL)),
            "cobbled_grimslate_wall", true, false);

    public static final Block COBBLED_SCHIST_WALL = register(new WallBlock(AbstractBlock.Settings.copy(Blocks.COBBLED_DEEPSLATE_WALL)),
            "cobbled_schist_wall", true, false);
    public static final Block POLISHED_SCHIST_WALL = register(new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DEEPSLATE_WALL)),
            "polished_schist_wall", true, false);
    public static final Block SCHIST_BRICK_WALL = register(new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_BRICK_WALL)),
            "schist_brick_wall", true, false);

    public static final CustomPortalBlock DEEP_PORTAL = registerPortal(
            new DeepUndergroundPortalBlock(AbstractBlock.Settings
                    .copy(Blocks.NETHER_PORTAL)
                    .noCollision()
                    .nonOpaque()
                    .blockVision((state, view, pos) -> false)
                    .sounds(DeepUndergroundSounds.PORTAL)
                    .pistonBehavior(PistonBehavior.BLOCK)),
                    "deep_underground_portal",
                    false
    );

    public static void initialize()
    {
    }
    public static Block register(Block block, String name, boolean shouldRegisterItem, boolean isFireproof) {
        // Register the block and its item.
        Identifier id = Identifier.of(DeepUnderground.MOD_ID, name);
        BlockItem blockItem;

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            if(isFireproof)
            {
                blockItem = new BlockItem(block, new Item.Settings().fireproof());
            }
            else {
                blockItem = new BlockItem(block, new Item.Settings());
            }
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static PillarBlock registerPillar(PillarBlock block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = Identifier.of(DeepUnderground.MOD_ID, name);

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static CustomPortalBlock registerPortal(CustomPortalBlock block, String name, boolean shouldRegisterItem) {
        // Register the block (no item associated with portals)
        Identifier id = Identifier.of(DeepUnderground.MOD_ID, name);
        return Registry.register(Registries.BLOCK, id, block);
    }

}

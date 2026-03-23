package com.bluestar.deepunderground.items;

import com.bluestar.deepunderground.DeepUnderground;
import com.bluestar.deepunderground.blocks.DeepUndergroundBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DeepUndergroundItems
{

    //Viridium Armor: 1200 1600 1500 1300
    //Cerulium Armor: 1850 2400 2250 1950
    public static final Item RAW_VIRIDIUM = register("raw_viridium", new Item(new Item.Settings().fireproof()));

    public static final Item RAW_CERULIUM = register("raw_cerulium", new Item(new Item.Settings().fireproof()));

    public static final Item VIRIDIUM_INGOT = register("viridium_ingot", new Item(new Item.Settings().fireproof()));

    public static final Item CERULIUM_INGOT = register("cerulium_ingot", new Item(new Item.Settings().fireproof()));

    public static final Item VIRIDIUM_NUGGET = register("viridium_nugget", new Item(new Item.Settings().fireproof()));

    public static final Item CERULIUM_NUGGET = register("cerulium_nugget", new Item(new Item.Settings().fireproof()));

    public static final Item DEPTHBOUND_STEEL_INGOT = register("depthbound_steel_ingot", new Item(new Item.Settings().fireproof()));

    public static final Item DEPTHBOUND_STEEL_NUGGET = register("depthbound_steel_nugget", new Item(new Item.Settings().fireproof()));

    public static final Item DEPTHBOUND_SCRAP = register("depthbound_scrap", new Item(new Item.Settings()));

    public static final Item CYCLITE = register("cyclite", new Item(new Item.Settings()));

    public static final Item HADEITE_CLUMP = register("hadeite_clump", new Item(new Item.Settings()));

    public static final Item HADEITE_BRICK = register("hadeite_brick", new Item(new Item.Settings()));

    public static final Item VIRIDIUM_HELMET = registerItem("viridium_helmet",
            new ArmorItem(DeepUndergroundArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(109)))); //199
    public static final Item VIRIDIUM_CHESTPLATE = registerItem("viridium_chestplate",
            new ArmorItem(DeepUndergroundArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(100))));
    public static final Item VIRIDIUM_LEGGINGS = registerItem("viridium_leggings",
            new ArmorItem(DeepUndergroundArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(100))));
    public static final Item VIRIDIUM_BOOTS = registerItem("viridium_boots",
            new ArmorItem(DeepUndergroundArmorMaterials.VIRIDIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(100))));

    public static final Item CERULIUM_HELMET = registerItem("cerulium_helmet",
            new ArmorItem(DeepUndergroundArmorMaterials.CERULIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(168)))); //1199
    public static final Item CERULIUM_CHESTPLATE = registerItem("cerulium_chestplate",
            new ArmorItem(DeepUndergroundArmorMaterials.CERULIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(150))));
    public static final Item CERULIUM_LEGGINGS = registerItem("cerulium_leggings",
            new ArmorItem(DeepUndergroundArmorMaterials.CERULIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(150))));
    public static final Item CERULIUM_BOOTS = registerItem("cerulium_boots",
            new ArmorItem(DeepUndergroundArmorMaterials.CERULIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(150))));

    public static final Item VIRIDIUM_SWORD = registerItem("viridium_sword",
            new SwordItem(DeepUndergroundToolMaterials.VIRIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(SwordItem.createAttributeModifiers(DeepUndergroundToolMaterials.VIRIDIUM, 0, -2.2f))));
    public static final Item VIRIDIUM_PICKAXE = registerItem("viridium_pickaxe",
            new PickaxeItem(DeepUndergroundToolMaterials.VIRIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(DeepUndergroundToolMaterials.VIRIDIUM, -2, -2.6f))));
    public static final Item VIRIDIUM_AXE = registerItem("viridium_axe",
            new AxeItem(DeepUndergroundToolMaterials.VIRIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(AxeItem.createAttributeModifiers(DeepUndergroundToolMaterials.VIRIDIUM, 3, -2.8f))));
    public static final Item VIRIDIUM_SHOVEL = registerItem("viridium_shovel",
            new ShovelItem(DeepUndergroundToolMaterials.VIRIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(DeepUndergroundToolMaterials.VIRIDIUM, -1.5F, -2.8f))));
    public static final Item VIRIDIUM_HOE = registerItem("viridium_hoe",
            new HoeItem(DeepUndergroundToolMaterials.VIRIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(HoeItem.createAttributeModifiers(DeepUndergroundToolMaterials.VIRIDIUM, -1.5F, 0.2f))));

    public static final Item CERULIUM_SWORD = registerItem("cerulium_sword",
            new SwordItem(DeepUndergroundToolMaterials.CERULIUM, new Item.Settings().fireproof()
                    .attributeModifiers(SwordItem.createAttributeModifiers(DeepUndergroundToolMaterials.CERULIUM, 0, -2.4f))));
    public static final Item CERULIUM_PICKAXE = registerItem("cerulium_pickaxe",
            new PickaxeItem(DeepUndergroundToolMaterials.CERULIUM, new Item.Settings().fireproof()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(DeepUndergroundToolMaterials.CERULIUM, -2, -2.8f))));
    public static final Item CERULIUM_AXE = registerItem("cerulium_axe",
            new AxeItem(DeepUndergroundToolMaterials.CERULIUM, new Item.Settings().fireproof()
                    .attributeModifiers(AxeItem.createAttributeModifiers(DeepUndergroundToolMaterials.CERULIUM, 3, -3f))));
    public static final Item CERULIUM_SHOVEL = registerItem("cerulium_shovel",
            new ShovelItem(DeepUndergroundToolMaterials.CERULIUM, new Item.Settings().fireproof()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(DeepUndergroundToolMaterials.CERULIUM, -1.5F, -3f))));
    public static final Item CERULIUM_HOE = registerItem("cerulium_hoe",
            new HoeItem(DeepUndergroundToolMaterials.CERULIUM, new Item.Settings().fireproof()
                    .attributeModifiers(HoeItem.createAttributeModifiers(DeepUndergroundToolMaterials.CERULIUM, -1.5F, 0f))));

    public static final Item DEPTHBOUND_SWORD = registerItem("depthbound_steel_sword",
            new SwordItem(DeepUndergroundToolMaterials.DEPTHBOUND_STEEL, new Item.Settings().fireproof()
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(DeepUndergroundToolMaterials.DEPTHBOUND_STEEL, 1, -2.4f))));
    public static final Item DEPTHBOUND_PICKAXE = registerItem("depthbound_steel_pickaxe",
            new PickaxeItem(DeepUndergroundToolMaterials.DEPTHBOUND_STEEL, new Item.Settings().fireproof()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(DeepUndergroundToolMaterials.DEPTHBOUND_STEEL, -1, -2.8f))));
    public static final Item DEPTHBOUND_AXE = registerItem("depthbound_steel_axe",
            new AxeItem(DeepUndergroundToolMaterials.DEPTHBOUND_STEEL, new Item.Settings().fireproof()
                    .attributeModifiers(AxeItem.createAttributeModifiers(DeepUndergroundToolMaterials.DEPTHBOUND_STEEL, 2, -3f))));
    public static final Item DEPTHBOUND_SHOVEL = registerItem("depthbound_steel_shovel",
            new ShovelItem(DeepUndergroundToolMaterials.DEPTHBOUND_STEEL, new Item.Settings().fireproof()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(DeepUndergroundToolMaterials.DEPTHBOUND_STEEL, -0.5F, -3f))));
    public static final Item DEPTHBOUND_HOE = registerItem("depthbound_steel_hoe",
            new HoeItem(DeepUndergroundToolMaterials.DEPTHBOUND_STEEL, new Item.Settings().fireproof()
                    .attributeModifiers(HoeItem.createAttributeModifiers(DeepUndergroundToolMaterials.DEPTHBOUND_STEEL, -0.5F, 0f))));

    public static void initialize()
    {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.HADEITE_CLUMP));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CYCLITE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.RAW_VIRIDIUM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.RAW_CERULIUM));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.DEPTHBOUND_SCRAP));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.VIRIDIUM_NUGGET));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CERULIUM_NUGGET));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.DEPTHBOUND_STEEL_NUGGET));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.HADEITE_BRICK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.VIRIDIUM_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CERULIUM_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
            .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.VIRIDIUM_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.VIRIDIUM_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.VIRIDIUM_AXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.VIRIDIUM_HOE));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CERULIUM_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CERULIUM_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CERULIUM_AXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CERULIUM_HOE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.DEPTHBOUND_SWORD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.DEPTHBOUND_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.DEPTHBOUND_AXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.DEPTHBOUND_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.DEPTHBOUND_HOE));
        //COMBAR
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.VIRIDIUM_SWORD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.VIRIDIUM_AXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CERULIUM_SWORD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CERULIUM_AXE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.DEPTHBOUND_SWORD));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.DEPTHBOUND_AXE));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.VIRIDIUM_HELMET));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.VIRIDIUM_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.VIRIDIUM_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.VIRIDIUM_BOOTS));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CERULIUM_HELMET));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CERULIUM_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CERULIUM_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundItems.CERULIUM_BOOTS));


        //BLOCKS
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.FRAMED_POLISHED_BLACKSTONE.asItem()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.HADEITE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.HADEITE_BRICKS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.HADEITE_BRICK_STAIRS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.HADEITE_BRICK_SLAB.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.HADEITE_BRICK_WALL.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.CHISELED_HADEITE_BRICKS.asItem()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.BLACK_GRANITE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.BLACK_GRANITE_STAIRS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.BLACK_GRANITE_SLAB.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.BLACK_GRANITE_WALL.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_STAIRS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.POLISHED_BLACK_GRANITE_SLAB.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.GRIMSLATE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.COBBLED_GRIMSLATE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.COBBLED_GRIMSLATE_STAIRS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.COBBLED_GRIMSLATE_SLAB.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.COBBLED_GRIMSLATE_WALL.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.POLISHED_GRIMSLATE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.POLISHED_GRIMSLATE_STAIRS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.POLISHED_GRIMSLATE_SLAB.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.POLISHED_GRIMSLATE_WALL.asItem()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.GRIMSLATE_BRICKS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.GRIMSLATE_BRICK_STAIRS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.GRIMSLATE_BRICK_SLAB.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.GRIMSLATE_BRICK_WALL.asItem()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.SCHIST.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.COBBLED_SCHIST.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.COBBLED_SCHIST_STAIRS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.COBBLED_SCHIST_SLAB.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.COBBLED_SCHIST_WALL.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.POLISHED_SCHIST.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.POLISHED_SCHIST_STAIRS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.POLISHED_SCHIST_SLAB.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.POLISHED_SCHIST_WALL.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.SCHIST_BRICKS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.SCHIST_BRICK_STAIRS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.SCHIST_BRICK_SLAB.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.SCHIST_BRICK_WALL.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.CRACKED_SCHIST_BRICKS.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.CHISELED_SCHIST.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.DEEPSLATE_CYCLITE_ORE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.DEEPSLATE_VIRIDIUM_ORE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.DEEPSLATE_CERULIUM_ORE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.RAW_VIRIDIUM_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.CYCLITE_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.RAW_CERULIUM_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.VIRIDIUM_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.CERULIUM_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.INERT_DEPTHBOUND_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.DEPTHBOUND_STEEL_BLOCK.asItem()));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.HADEITE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.BLACK_GRANITE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.GRIMSLATE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.SCHIST.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.DEEPSLATE_CYCLITE_ORE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.DEEPSLATE_VIRIDIUM_ORE.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.add(DeepUndergroundBlocks.DEEPSLATE_CERULIUM_ORE.asItem()));
    }

    public static Item register(String id, Item item)
    {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(DeepUnderground.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DeepUnderground.MOD_ID, name), item);
    }
}

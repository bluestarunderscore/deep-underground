package com.bluestar.deepunderground.items;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum DeepUndergroundToolMaterials implements ToolMaterial
{
    //Viridium Tool -> 1575, Cerulium -> 3200
    VIRIDIUM(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1575, 14.0F, 7F, 20, () -> Ingredient.ofItems(DeepUndergroundItems.VIRIDIUM_INGOT)),

    CERULIUM(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            3200, 12.0F, 9F, 15, () -> Ingredient.ofItems(DeepUndergroundItems.CERULIUM_INGOT)),

    DEPTHBOUND_STEEL(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            8000, 15.0F, 10F, 18, () -> Ingredient.ofItems(DeepUndergroundItems.DEPTHBOUND_STEEL_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    DeepUndergroundToolMaterials(final TagKey<Block> inverseTag, final int itemDurability,final float miningSpeed,
                                final float attackDamage, final int enchantability,final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}

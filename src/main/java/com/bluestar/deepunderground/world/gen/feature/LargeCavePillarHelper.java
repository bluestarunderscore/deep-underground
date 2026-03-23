package com.bluestar.deepunderground.world.gen.feature;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.WorldAccess;

public class LargeCavePillarHelper {
    protected static double scaleHeightFromRadius(double radius, double scale, double heightScale, double bluntness) {
        if (radius < bluntness) {
            radius = bluntness;
        }

        double d = 0.384;
        double e = radius / scale * 0.384;
        double f = 0.75 * Math.pow(e, 1.3333333333333333);
        double g = Math.pow(e, 0.6666666666666666);
        double h = 0.3333333333333333 * Math.log(e);
        double i = heightScale * (f - g - h);
        i = Math.max(i, 0.0);
        return i / 0.384 * scale;
    }

    protected static boolean canGenerateBase(StructureWorldAccess world, BlockPos pos, int height) {
        if (canGenerateOrLava(world, pos)) {
            return false;
        } else {
            float f = 6.0F;
            float g = 6.0F / height;

            for (float h = 0.0F; h < (float) (Math.PI * 2); h += g) {
                int i = (int)(MathHelper.cos(h) * height);
                int j = (int)(MathHelper.sin(h) * height);
                if (canGenerateOrLava(world, pos.add(i, 0, j))) {
                    return false;
                }
            }

            return true;
        }
    }

    protected static boolean canGenerate(WorldAccess world, BlockPos pos) {
        return world.testBlockState(pos, LargeCavePillarHelper::canGenerate);
    }

    protected static boolean canGenerateOrLava(WorldAccess world, BlockPos pos) {
        return world.testBlockState(pos, LargeCavePillarHelper::canGenerateOrLava);
    }

    public static boolean canReplaceOrLava(BlockState state) {
        return canReplace(state) || state.isOf(Blocks.LAVA);
    }

    public static boolean canReplace(BlockState state) {
        return state.isOf(Blocks.PACKED_ICE) || state.isIn(BlockTags.BASE_STONE_OVERWORLD);
    }

    public static boolean canGenerate(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER);
    }

    public static boolean canGenerateOrLava(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) || state.isOf(Blocks.LAVA);
    }
}


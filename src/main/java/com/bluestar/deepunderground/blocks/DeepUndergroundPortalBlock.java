package com.bluestar.deepunderground.blocks;

import com.bluestar.deepunderground.DeepUndergroundSounds;
import com.mojang.serialization.MapCodec;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.kyrptonaught.customportalapi.CustomPortalBlock;
import net.kyrptonaught.customportalapi.util.CustomTeleporter;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;

import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;

import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;

import net.minecraft.world.GameRules;
import net.minecraft.world.TeleportTarget;
import net.minecraft.world.World;

import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;


public class DeepUndergroundPortalBlock extends CustomPortalBlock
{
    public static final MapCodec<com.bluestar.deepunderground.blocks.DeepUndergroundPortalBlock> CODEC = createCodec(com.bluestar.deepunderground.blocks.DeepUndergroundPortalBlock::new);
    public static final EnumProperty<Direction.Axis> AXIS = Properties.AXIS;

    protected static final VoxelShape X_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 6.0D, 16.0D, 16.0D, 10.0D);
    protected static final VoxelShape Z_SHAPE = Block.createCuboidShape(6.0D, 0.0D, 0.0D, 10.0D, 16.0D, 16.0D);
    protected static final VoxelShape Y_SHAPE = Block.createCuboidShape(0.0D, 6.0D, 0.0D, 16.0D, 10.0D, 16.0D);

    public MapCodec<com.bluestar.deepunderground.blocks.DeepUndergroundPortalBlock> getCodec() {
        return CODEC;
    }

    public DeepUndergroundPortalBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((this.stateManager.getDefaultState()).with(AXIS, Direction.Axis.X));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS);
    }

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        return ItemStack.EMPTY;
    }

    @Override
    public int getPortalDelay(ServerWorld world, Entity entity) {
        if (entity instanceof PlayerEntity playerEntity) {
            return Math.max(1, world.getGameRules().getInt(playerEntity.getAbilities().invulnerable ? GameRules.PLAYERS_NETHER_PORTAL_CREATIVE_DELAY : GameRules.PLAYERS_NETHER_PORTAL_DEFAULT_DELAY));
        } else {
            return 0;
        }
    }

    public Portal.Effect getPortalEffect() {
        return Effect.CONFUSION;
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(100) == 0) {
            world.playSound((double)pos.getX() + (double)0.5F, (double)pos.getY() + (double)0.5F, (double)pos.getZ() + (double)0.5F, DeepUndergroundSounds.PORTAL_AMBIENT, SoundCategory.BLOCKS, 0.5F, 1.0F, false);
        }

        for(int i = 0; i < 4; ++i) {
            double d = (double)pos.getX() + random.nextDouble();
            double e = (double)pos.getY() + random.nextDouble();
            double f = (double)pos.getZ() + random.nextDouble();
            double g = ((double)random.nextFloat() - (double)0.5F) * (double)0.5F;
            double h = ((double)random.nextFloat() - (double)0.5F) * (double)0.5F;
            double j = ((double)random.nextFloat() - (double)0.5F) * (double)0.5F;
            int k = random.nextInt(2) * 2 - 1;
            if (!world.getBlockState(pos.west()).isOf(this) && !world.getBlockState(pos.east()).isOf(this)) {
                d = (double)pos.getX() + (double)0.5F + (double)0.25F * (double)k;
                g = (random.nextFloat() * 2.0F * (float)k);
            } else {
                f = (double)pos.getZ() + (double)0.5F + (double)0.25F * (double)k;
                j = (random.nextFloat() * 0.2F * (float)k);
            }

            world.addParticle(ParticleTypes.FLAME, d, e, f, 0.0, 0.0, 0.0);
        }

    }

    @Override
    public @Nullable TeleportTarget createTeleportTarget(ServerWorld world, Entity entity, BlockPos pos) {
        return CustomTeleporter.createTeleportTarget(world, entity, getPortalBase(world, pos), pos);
    }
}
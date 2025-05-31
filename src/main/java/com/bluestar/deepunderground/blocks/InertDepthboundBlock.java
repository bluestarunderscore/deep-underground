package com.bluestar.deepunderground.blocks;
import com.bluestar.deepunderground.DeepUnderground;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class InertDepthboundBlock extends Block
{
    public static IntProperty INFUSING = IntProperty.of("infusing", 0, 3);

    public InertDepthboundBlock() {
        super(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS).sounds(BlockSoundGroup.NETHERITE));
        this.setDefaultState(this.stateManager.getDefaultState().with(INFUSING, 0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(INFUSING);
    }

    protected IntProperty getInfusingProperty() {
        return INFUSING;
    }

    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    public int getMaxInfusingStage() {
        return 3;
    }

    public int getInfusingProgress(BlockState state)
    {
        return state.get(this.getInfusingProperty());
    }

    public BlockState withInfusionProgress(int progress) {
        return this.getDefaultState().with(this.getInfusingProperty(), progress);
    }

    @Override
    protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if(pos.getY() < 24 && world.getDimensionEntry().getKey().toString().contains(DeepUnderground.MOD_ID)) {
            int i = this.getInfusingProgress(state);
            if (i < this.getMaxInfusingStage()) {
                if (world.getRandom().nextInt(25) == 0) {
                    world.setBlockState(pos, this.withInfusionProgress(i + 1), Block.NOTIFY_LISTENERS);
                }
            }
            else
            {
                world.setBlockState(pos, DeepUndergroundBlocks.DEPTHBOUND_STEEL_BLOCK.getDefaultState());
            }
        }
    }
    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (pos.getY() < 24 && world.getDimensionEntry().getKey().toString().contains(DeepUnderground.MOD_ID) && random.nextInt(5) == 0) {
            world.addParticle(ParticleTypes.CRIT, (double) pos.getX() + (double) random.nextFloat(), (double) pos.getY() + (double) random.nextFloat(), (double) pos.getZ() + (double) random.nextFloat(), -0.4D, -0.4D, -0.4D);
        }
    }
}

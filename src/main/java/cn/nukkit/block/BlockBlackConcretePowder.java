package cn.nukkit.block;

import cn.nukkit.block.state.BlockProperties;
import cn.nukkit.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BlockBlackConcretePowder extends Block {
    public static final BlockProperties PROPERTIES = new BlockProperties("minecraft:black_concrete_powder");

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    public BlockBlackConcretePowder() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockBlackConcretePowder(BlockState blockstate) {
        super(blockstate);
    }
}
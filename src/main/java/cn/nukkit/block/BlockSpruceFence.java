package cn.nukkit.block;

import cn.nukkit.block.state.BlockProperties;
import cn.nukkit.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BlockSpruceFence extends Block {
    public static final BlockProperties PROPERTIES = new BlockProperties("minecraft:spruce_fence");

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    public BlockSpruceFence() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockSpruceFence(BlockState blockstate) {
        super(blockstate);
    }
}
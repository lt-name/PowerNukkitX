package cn.nukkit.block;

import cn.nukkit.block.state.BlockProperties;
import cn.nukkit.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BlockPinkWool extends Block {
    public static final BlockProperties PROPERTIES = new BlockProperties("minecraft:pink_wool");

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    public BlockPinkWool() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockPinkWool(BlockState blockstate) {
        super(blockstate);
    }
}
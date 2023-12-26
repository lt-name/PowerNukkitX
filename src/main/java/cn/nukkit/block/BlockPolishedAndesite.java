package cn.nukkit.block;

import cn.nukkit.block.state.BlockProperties;
import cn.nukkit.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BlockPolishedAndesite extends Block {
    public static final BlockProperties PROPERTIES = new BlockProperties("minecraft:polished_andesite");

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    public BlockPolishedAndesite() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockPolishedAndesite(BlockState blockstate) {
        super(blockstate);
    }
}
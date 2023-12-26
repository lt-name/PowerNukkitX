package cn.nukkit.block;

import cn.nukkit.block.state.BlockProperties;
import cn.nukkit.block.state.BlockState;
import cn.nukkit.block.state.property.CommonBlockProperties;
import cn.nukkit.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BlockElement29 extends Block {
    public static final BlockProperties PROPERTIES = new BlockProperties("minecraft:element_29");

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    public BlockElement29() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockElement29(BlockState blockstate) {
        super(blockstate);
    }
}
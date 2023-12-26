package cn.nukkit.block;

import cn.nukkit.block.state.BlockProperties;
import cn.nukkit.block.state.BlockState;
import cn.nukkit.block.state.property.CommonBlockProperties;
import cn.nukkit.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BlockQuartzOre extends Block {
    public static final BlockProperties PROPERTIES = new BlockProperties("minecraft:quartz_ore");

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    public BlockQuartzOre() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockQuartzOre(BlockState blockstate) {
        super(blockstate);
    }
}
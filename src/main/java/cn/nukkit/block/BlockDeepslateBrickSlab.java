package cn.nukkit.block;

import cn.nukkit.block.property.CommonBlockProperties;
import org.jetbrains.annotations.NotNull;

public class BlockDeepslateBrickSlab extends Block {
    public static final BlockProperties PROPERTIES = new BlockProperties(DEEPSLATE_BRICK_SLAB, CommonBlockProperties.MINECRAFT_VERTICAL_HALF);

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    public BlockDeepslateBrickSlab() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockDeepslateBrickSlab(BlockState blockstate) {
        super(blockstate);
    }
}
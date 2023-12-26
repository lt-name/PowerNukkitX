package cn.nukkit.block;

import cn.nukkit.block.state.BlockProperties;
import cn.nukkit.block.state.BlockState;
import cn.nukkit.block.state.property.CommonBlockProperties;
import org.jetbrains.annotations.NotNull;

public class BlockAcaciaTrapdoor extends Block {
    public static final BlockProperties PROPERTIES = new BlockProperties("minecraft:acacia_trapdoor", CommonBlockProperties.DIRECTION, CommonBlockProperties.OPEN_BIT, CommonBlockProperties.UPSIDE_DOWN_BIT);

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    public BlockAcaciaTrapdoor() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockAcaciaTrapdoor(BlockState blockstate) {
        super(blockstate);
    }
}
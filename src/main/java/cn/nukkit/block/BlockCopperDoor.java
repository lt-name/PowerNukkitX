package cn.nukkit.block;

import cn.nukkit.block.state.BlockProperties;
import cn.nukkit.block.state.BlockState;
import cn.nukkit.block.state.property.CommonBlockProperties;
import cn.nukkit.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BlockCopperDoor extends Block {
    public static final BlockProperties PROPERTIES = new BlockProperties("minecraft:copper_door", CommonBlockProperties.DIRECTION, CommonBlockProperties.DOOR_HINGE_BIT, CommonBlockProperties.OPEN_BIT, CommonBlockProperties.UPPER_BLOCK_BIT);

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    public BlockCopperDoor() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockCopperDoor(BlockState blockstate) {
        super(blockstate);
    }
}
package cn.nukkit.block;

import cn.nukkit.block.state.BlockProperties;
import cn.nukkit.block.state.BlockState;
import cn.nukkit.block.state.property.CommonBlockProperties;
import org.jetbrains.annotations.NotNull;

public class BlockCrimsonButton extends Block {
    public static final BlockProperties PROPERTIES = new BlockProperties("minecraft:crimson_button", CommonBlockProperties.BUTTON_PRESSED_BIT, CommonBlockProperties.FACING_DIRECTION);

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    public BlockCrimsonButton() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockCrimsonButton(BlockState blockstate) {
        super(blockstate);
    }
}
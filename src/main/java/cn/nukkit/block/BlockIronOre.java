package cn.nukkit.block;

import cn.nukkit.item.ItemID;
import cn.nukkit.item.ItemTool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BlockIronOre extends BlockOre {
    public static final BlockProperties PROPERTIES = new BlockProperties("minecraft:iron_ore");

    @Override
    public @NotNull BlockProperties getProperties() {
        return PROPERTIES;
    }

    public BlockIronOre() {
        this(PROPERTIES.getDefaultState());
    }

    public BlockIronOre(BlockState blockstate) {
        super(blockstate);
    }

    @Override
    public String getName() {
        return "Iron Ore";
    }

    @Override
    public int getToolTier() {
        return ItemTool.TIER_STONE;
    }

    @Nullable
    @Override
    protected String getRawMaterial() {
        return ItemID.RAW_IRON;
    }
}
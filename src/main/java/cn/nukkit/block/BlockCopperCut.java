package cn.nukkit.block;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

public class BlockCopperCut extends BlockCopperBase {


    public BlockCopperCut() {
        // Does nothing
    }

    @Override
    public String getName() {
        return "Cut Copper";
    }

    @Override
    public int getId() {
        return CUT_COPPER;
    }


    @NotNull
    @Override
    public OxidizationLevel getOxidizationLevel() {
        return OxidizationLevel.UNAFFECTED;
    }


    @Override
    protected int getCopperId(boolean waxed, @Nullable OxidizationLevel oxidizationLevel) {
        if (oxidizationLevel == null) {
            return getId();
        }
        switch (oxidizationLevel) {
            case UNAFFECTED:
                return waxed? WAXED_CUT_COPPER : CUT_COPPER;
            case EXPOSED:
                return waxed? WAXED_EXPOSED_CUT_COPPER : EXPOSED_CUT_COPPER;
            case WEATHERED:
                return waxed? WAXED_WEATHERED_CUT_COPPER : WEATHERED_CUT_COPPER;
            case OXIDIZED:
                return waxed? WAXED_OXIDIZED_CUT_COPPER : OXIDIZED_CUT_COPPER;
            default:
                return getId();
        }
    }
}

package cn.nukkit.item;

public class ItemBlazeSpawnEgg extends ItemSpawnEgg {
    public ItemBlazeSpawnEgg() {
        super(BLAZE_SPAWN_EGG);
    }

    @Override
    public int getEntityNetworkId() {
        return 43;
    }

    @Override
    public void setAux(Integer aux) {
        throw new UnsupportedOperationException();
    }
}
package ewo.haoooo.iceage.item;

import ewo.haoooo.iceage.IceAge;
import ewo.haoooo.iceage.createtabs.TabIceAge;
import net.minecraft.item.Item;

public class ItemIceCube extends Item {
    public ItemIceCube()
    {
        this.setUnlocalizedName(IceAge.MODID + ".icecube");
        this.setCreativeTab(TabIceAge.TAB_ICEAGE);
        this.setRegistryName("ice_cube");
        this.setMaxStackSize(64);
    }
}

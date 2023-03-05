package ewo.haoooo.iceage.item;

import ewo.haoooo.iceage.IceAge;
import ewo.haoooo.iceage.createtabs.TabIceAge;
import net.minecraft.item.Item;

public class ItemIceIngot extends Item {
    public ItemIceIngot()
    {
        this.setUnlocalizedName(IceAge.MODID + ".iceingot");
        this.setCreativeTab(TabIceAge.TAB_ICEAGE);
        this.setRegistryName("ice_ingot");
        this.setMaxStackSize(64);
    }
}

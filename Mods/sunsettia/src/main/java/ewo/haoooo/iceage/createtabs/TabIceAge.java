package ewo.haoooo.iceage.createtabs;

import ewo.haoooo.iceage.item.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabIceAge extends CreativeTabs {
    public static final TabIceAge TAB_ICEAGE = new TabIceAge();
    public TabIceAge() {
        super("iceage");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistryHandler.ICE_CUBE);
    }
}

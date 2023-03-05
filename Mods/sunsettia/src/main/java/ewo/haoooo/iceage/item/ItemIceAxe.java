package ewo.haoooo.iceage.item;

import ewo.haoooo.iceage.IceAge;
import ewo.haoooo.iceage.createtabs.TabIceAge;
import net.minecraft.item.ItemAxe;

public class ItemIceAxe extends ItemAxe {
    public ItemIceAxe(){
        super(ItemRegistryHandler.ICE_TOOL_MATERIAL,6.0F,-3.0F);
        this.setUnlocalizedName(IceAge.MODID + ".iceaxe");
        this.setCreativeTab(TabIceAge.TAB_ICEAGE);
        this.setRegistryName("ice_axe");
    }

}

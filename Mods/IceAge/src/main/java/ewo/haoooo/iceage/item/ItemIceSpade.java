package ewo.haoooo.iceage.item;

import ewo.haoooo.iceage.IceAge;
import ewo.haoooo.iceage.createtabs.TabIceAge;
import net.minecraft.item.ItemSpade;

public class ItemIceSpade extends ItemSpade {
    public ItemIceSpade(){
        super(ItemRegistryHandler.ICE_TOOL_MATERIAL);
        this.setUnlocalizedName(IceAge.MODID + ".icespade");
        this.setCreativeTab(TabIceAge.TAB_ICEAGE);
        this.setRegistryName("ice_spade");
    }
}

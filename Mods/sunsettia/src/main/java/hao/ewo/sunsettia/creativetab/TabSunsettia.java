package hao.ewo.sunsettia.creativetab;


import hao.ewo.sunsettia.Sunsettia;
import hao.ewo.sunsettia.item.ItemRegistryHandler;
import hao.ewo.sunsettia.item.ItemSunsettia;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabSunsettia extends CreativeTabs{
    public static final TabSunsettia TAB_SUNSETTIA = new TabSunsettia();

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistryHandler.SUNSETTIA);
    }
    public TabSunsettia(){
        super("sunsettia");
    }
}

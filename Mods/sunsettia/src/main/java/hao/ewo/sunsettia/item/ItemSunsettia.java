package hao.ewo.sunsettia.item;

import hao.ewo.sunsettia.Sunsettia;
import hao.ewo.sunsettia.creativetab.TabSunsettia;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.property.Properties;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemSunsettia extends ItemFood {
    public ItemSunsettia() {
        super(4, 0.5F, false);
        this.setUnlocalizedName(Sunsettia.MODID + ".sunsettia");
        this.setCreativeTab(TabSunsettia.TAB_SUNSETTIA);
        this.setRegistryName("sunsettia");
        this.setMaxStackSize(64);
    }
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemFood(4, 0.5F, false).setRegistryName("sunsettia", "sunsettia"));
    }
    @Override
    public int getItemBurnTime(ItemStack itemStack)
    {
        return 80;
    }
}
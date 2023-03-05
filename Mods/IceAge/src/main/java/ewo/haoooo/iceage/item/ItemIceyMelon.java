package ewo.haoooo.iceage.item;

import ewo.haoooo.iceage.IceAge;
import ewo.haoooo.iceage.createtabs.TabIceAge;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemIceyMelon extends ItemFood{
    public ItemIceyMelon() {
        super(2,0.6F,false);
        this.setUnlocalizedName(IceAge.MODID + ".iceymelon");
        this.setCreativeTab(TabIceAge.TAB_ICEAGE);
        this.setRegistryName("icey_melon");
        this.setMaxStackSize(64);
    }
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemFood(2, 0.6F, false).setRegistryName("iceage", "icey_melon"));
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 1000, 0));
        }
    }
}

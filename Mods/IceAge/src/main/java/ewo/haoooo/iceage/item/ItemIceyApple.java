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

public class ItemIceyApple extends ItemFood {

    public ItemIceyApple() {
        super(4,0.6F,false);
        this.setUnlocalizedName(IceAge.MODID + ".iceyapple");
        this.setCreativeTab(TabIceAge.TAB_ICEAGE);
        this.setRegistryName("icey_apple");
        this.setMaxStackSize(64);
    }
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemFood(4, 0.6F, false).setRegistryName("iceage", "icey_apple"));
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 300, 0));
        }
    }

}

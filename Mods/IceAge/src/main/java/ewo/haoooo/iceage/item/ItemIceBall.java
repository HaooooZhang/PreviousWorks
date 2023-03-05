package ewo.haoooo.iceage.item;

import ewo.haoooo.iceage.IceAge;
import ewo.haoooo.iceage.createtabs.TabIceAge;
import ewo.haoooo.iceage.entity.EntityIceBall;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class ItemIceBall extends Item {
    public ItemIceBall() {
        this.setUnlocalizedName(IceAge.MODID + ".iceball");
        this.setCreativeTab(TabIceAge.TAB_ICEAGE);
        this.setRegistryName("ice_ball");
        this.setMaxStackSize(16);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){

        ItemStack item = playerIn.getHeldItem(handIn);

        if (!playerIn.capabilities.isCreativeMode)
        {
            item.shrink(1);
        }
        if (!worldIn.isRemote){
            EntityIceBall entityDirtBall = new EntityIceBall(worldIn, playerIn);
            float pitch = playerIn.rotationPitch, yaw = playerIn.rotationYaw;
            entityDirtBall.shoot(playerIn, pitch, yaw, 0.0F, 1.5F, 1.0F);
            worldIn.spawnEntity(entityDirtBall);
        }
        return ActionResult.newResult(EnumActionResult.SUCCESS, item);
    }
}

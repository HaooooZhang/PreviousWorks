package ewo.haoooo.iceage.item;

import ewo.haoooo.iceage.IceAge;
import ewo.haoooo.iceage.createtabs.TabIceAge;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemIcePickaxe extends ItemPickaxe {
    public ItemIcePickaxe(){
        super(ItemRegistryHandler.ICE_TOOL_MATERIAL);
        this.setUnlocalizedName(IceAge.MODID + ".icePickaxe");
        this.setCreativeTab(TabIceAge.TAB_ICEAGE);
        this.setRegistryName("ice_pickaxe");
    }
    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Block block = state.getBlock();
        float speed = super.getDestroySpeed(stack, state);
        return (block == Blocks.ICE || block == Blocks.FROSTED_ICE || block == Blocks.PACKED_ICE) ? speed * 2 : speed;
    }

}

package hao.ewo.sunsettia.event;

import hao.ewo.sunsettia.Sunsettia;
import hao.ewo.sunsettia.item.ItemSunsettia;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemLeaves;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentSelector;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import java.util.List;

@Mod.EventBusSubscriber
public class EventHandler {
    public static class HarvestDropsEvent extends BlockEvent
    {
        private final int fortuneLevel;
        private final List<ItemStack> drops;
        private final boolean isSilkTouching;
        private float dropChance; // Change to e.g. 1.0f, if you manipulate the list and want to guarantee it always drops
        private final EntityPlayer harvester; // May be null for non-player harvesting such as explosions or machines

        public HarvestDropsEvent(World world, BlockPos pos, IBlockState state, int fortuneLevel, float dropChance, List<ItemStack> drops, EntityPlayer harvester, boolean isSilkTouching)
        {
            super(world, pos, state);
            this.fortuneLevel = 2;
            this.setDropChance(0.08f);
            this.drops = drops;
            this.isSilkTouching = false;
            this.harvester = null ;
        }

        public int getFortuneLevel() {
            return fortuneLevel;
        }
        public List<ItemStack> getDrops() {
            return drops;
        }
        public boolean isSilkTouching() {
            return isSilkTouching;
        }
        public float getDropChance() {
            return dropChance;
        }
        public void setDropChance(float dropChance) {
            this.dropChance = dropChance;
        }
        public EntityPlayer getHarvester() {
            return harvester;
        }
    }
}

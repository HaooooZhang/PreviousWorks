package hao.ewo.sunsettia.common;

import hao.ewo.sunsettia.crafting.CraftingLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class CommonProxy {
    public void init(FMLInitializationEvent event)
{
    new CraftingLoader();
}
}

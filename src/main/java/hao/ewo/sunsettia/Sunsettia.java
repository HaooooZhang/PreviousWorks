package hao.ewo.sunsettia;

import hao.ewo.sunsettia.crafting.FurnaceRecipeRegistryHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.Logger;

//EWO STUDIO,haoooo_
//迷离姐姐快和我贴贴！
@Mod(modid = Sunsettia.MODID, name = Sunsettia.NAME, version = Sunsettia.VERSION)
public class Sunsettia {
    public static final String MODID = "sunsettia";
    public static final String NAME = "Sunsettia";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        FurnaceRecipeRegistryHandler.register();
    }

}

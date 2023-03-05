package hao.ewo.sunsettia.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public  class ItemRegistryHandler {
    public static ItemSunsettia SUNSETTIA = new ItemSunsettia();

    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Item> event){
        IForgeRegistry<Item> registry =event.getRegistry();
        registry.register(SUNSETTIA);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(SUNSETTIA,0,new ModelResourceLocation(SUNSETTIA.getRegistryName(),"inventory"));
    }
}
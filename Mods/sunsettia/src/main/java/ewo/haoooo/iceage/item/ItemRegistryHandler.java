package ewo.haoooo.iceage.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class ItemRegistryHandler {
    public static final Item.ToolMaterial ICE_TOOL_MATERIAL = EnumHelper.addToolMaterial(
            "ICE", 1, 81, 5.0F, 1.0F, 5);
    public static final ItemIcePickaxe ICE_PICKAXE = new ItemIcePickaxe();
    public static final ItemIceCube ICE_CUBE = new ItemIceCube();
    public static final ItemIceAxe ICE_AXE = new ItemIceAxe();
    public static final ItemIceSpade ICE_SPADE = new ItemIceSpade();
    public static final ItemIceyApple ICEY_APPLE = new ItemIceyApple();
    public static final ItemIceyCarrot ICEY_CARROT = new ItemIceyCarrot();
    public static final ItemIceyMelon ICEY_MELON = new ItemIceyMelon();
    public static final ItemIceBall ICE_BALL = new ItemIceBall();
    public static final ItemIceIngot ICE_INGOT = new ItemIceIngot();

    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(ICE_PICKAXE);
        registry.register(ICE_CUBE);
        registry.register(ICE_AXE);
        registry.register(ICE_SPADE);
        registry.register(ICEY_APPLE);
        registry.register(ICEY_CARROT);
        registry.register(ICEY_MELON);
        registry.register(ICE_BALL);
        registry.register(ICE_INGOT);
    }
    @SideOnly(Side.CLIENT)
    private static void registerModel(Item item)
    {
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modelResourceLocation);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event) {
        registerModel(ICE_PICKAXE);
        registerModel(ICE_CUBE);
        registerModel(ICE_AXE);
        registerModel(ICE_SPADE);
        registerModel(ICEY_APPLE);
        registerModel(ICEY_CARROT);
        registerModel(ICEY_MELON);
        registerModel(ICE_BALL);
        registerModel(ICE_INGOT);
    }
}

package ewo.haoooo.iceage.client.renderer;

import ewo.haoooo.iceage.entity.EntityIceBall;
import ewo.haoooo.iceage.item.ItemRegistryHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderRegistryHandler {
    public static void register()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityIceBall.class, manager ->
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            return new RenderSnowball<EntityIceBall>(manager, ItemRegistryHandler.ICE_BALL, renderItem);
        });
    }
}

package ewo.haoooo.iceage.entity;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.registries.IForgeRegistry;

public class EntityRegistryHandler {

    public static final EntityEntry ICE_BALL =
            EntityEntryBuilder.create().entity(EntityIceBall.class)
                    .id(EntityIceBall.ID, 1).name(EntityIceBall.NAME).tracker(64, 10, true).build();

    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<EntityEntry> event) {
        IForgeRegistry<EntityEntry> registry = event.getRegistry();
        registry.register(ICE_BALL);
    }
}

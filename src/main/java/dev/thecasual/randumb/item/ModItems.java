package dev.thecasual.randumb.item;


import dev.thecasual.randumb.Randumb;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Randumb.MOD_ID);

    public static final DeferredItem<Item> WEETBIX = ITEMS.registerSimpleItem(
            "weetbix",
            new Item.Properties()
    );

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}

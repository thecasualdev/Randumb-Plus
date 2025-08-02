package dev.thecasual.randumb.item;


import dev.thecasual.randumb.Randumb;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Randumb.MOD_ID);

    public static final DeferredItem<Item> WEETBIX = ITEMS.registerSimpleItem(
            "weetbix",
            new Item.Properties().food(
                    ModFoods.WEEBIX,
                    ModConsumables.WEETBIX
            ).stacksTo(120)
    );

    public static final DeferredItem<Item> BOWL_OF_WEETBIX = ITEMS.registerSimpleItem(
            "bowl_of_weetbix",
            new Item.Properties().food(
                    ModFoods.BOWL_OF_WEEBIX,
                    ModConsumables.BOWL_OF_WEETBIX
            ).stacksTo(16)
    );

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}

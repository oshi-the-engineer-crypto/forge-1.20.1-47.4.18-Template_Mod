package net.oshi.templatemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oshi.templatemod.TemplateMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TemplateMod.MOD_ID);

    public static final RegistryObject<Item> OAK_LOG = ITEMS.register("oak_log",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_LOG = ITEMS.register("birch_log",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_LOG = ITEMS.register("spruce_log",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

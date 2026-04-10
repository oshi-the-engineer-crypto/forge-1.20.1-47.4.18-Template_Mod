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
    public static final RegistryObject<Item> DARK_OAK_LOG = ITEMS.register("dark_oak_log",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_LOG = ITEMS.register("birch_log",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPRUCE_LOG = ITEMS.register("spruce_log",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_LOG = ITEMS.register("acacia_log",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_LOG = ITEMS.register("mangrove_log",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_LOG = ITEMS.register("jungle_log",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHERRY_LOG = ITEMS.register("cherry_log",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

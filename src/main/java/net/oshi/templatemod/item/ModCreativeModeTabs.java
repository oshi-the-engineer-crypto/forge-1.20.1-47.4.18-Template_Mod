package net.oshi.templatemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.oshi.templatemod.TemplateMod;
import net.oshi.templatemod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TemplateMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TEMPLATE_TAB = CREATIVE_MODE_TABS.register("template_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OAK_LOG.get()))
                    .title(Component.translatable("creativetab.template_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.OAK_LOG.get());
                        output.accept(ModItems.DARK_OAK_LOG.get());
                        output.accept(ModItems.BIRCH_LOG.get());
                        output.accept(ModItems.SPRUCE_LOG.get());
                        output.accept(ModItems.ACACIA_LOG.get());
                        output.accept(ModItems.JUNGLE_LOG.get());
                        output.accept(ModItems.MANGROVE_LOG.get());

                        output.accept(ModBlocks.OAK_TRUNK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
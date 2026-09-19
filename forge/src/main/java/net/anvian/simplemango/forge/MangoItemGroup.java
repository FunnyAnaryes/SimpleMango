package net.anvian.simplemango.forge;

import net.anvian.simplemango.MangoMod;
import net.anvian.simplemango.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public final class MangoItemGroup {
    public static CreativeModeTab MANGO;

    private MangoItemGroup() {}

    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        MANGO = event.registerCreativeModeTab(
                new ResourceLocation(MangoMod.MOD_ID, "mango"),
                builder -> builder
                        .icon(() -> new ItemStack(ModItems.MANGO))
                        .title(Component.translatable("itemGroup.simplemango.mango"))
                        .displayItems((enabledFeatures, entries, operatorEnabled) ->
                                ModItems.forEachCreativeItem(item -> entries.accept(item)))
                        .build());
    }
}

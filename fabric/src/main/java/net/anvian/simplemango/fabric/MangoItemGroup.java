package net.anvian.simplemango.fabric;

import net.anvian.simplemango.MangoMod;
import net.anvian.simplemango.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public final class MangoItemGroup {
    public static CreativeModeTab MANGO;

    private MangoItemGroup() {}

    public static void register() {
        MANGO = Registry.register(
                BuiltInRegistries.CREATIVE_MODE_TAB,
                new ResourceLocation(MangoMod.MOD_ID, "mango"),
                FabricItemGroup.builder()
                        .title(Component.translatable("itemGroup.simplemango.mango"))
                        .icon(() -> new ItemStack(ModItems.MANGO))
                        .displayItems((parameters, entries) -> ModItems.forEachCreativeItem(entries::accept))
                        .build());
    }
}

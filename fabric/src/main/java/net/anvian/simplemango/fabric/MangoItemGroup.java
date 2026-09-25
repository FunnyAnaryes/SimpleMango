package net.anvian.simplemango.fabric;

import net.anvian.simplemango.MangoMod;
import net.anvian.simplemango.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public final class MangoItemGroup {
    public static CreativeModeTab MANGO;

    private MangoItemGroup() {}

    public static void register() {
        MANGO = FabricItemGroup.builder(new ResourceLocation(MangoMod.MOD_ID, "mango"))
                .icon(() -> new ItemStack(ModItems.MANGO))
                .displayItems((parameters, entries) ->
                        ModItems.forEachCreativeItem(entries::accept))
                .build();
    }
}

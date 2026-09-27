package net.anvian.simplemango.forge;

import net.anvian.simplemango.MangoMod;
import net.anvian.simplemango.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class MangoItemGroup {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MangoMod.MOD_ID);
    public static final RegistryObject<CreativeModeTab> MANGO = CREATIVE_MODE_TABS.register(
            "mango",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.simplemango.mango"))
                    .icon(() -> new ItemStack(ModItems.MANGO))
                    .displayItems((parameters, entries) -> ModItems.forEachCreativeItem(entries::accept))
                    .build());

    private MangoItemGroup() {}
}

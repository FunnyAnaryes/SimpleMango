package net.anvian.simplemango.fabric;

import net.anvian.simplemango.platform.IPlatformHelper;
import net.anvian.simplemango.wood.ModWoodTypes;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.properties.WoodType;

public final class FabricPlatformHelper implements IPlatformHelper {
    @Override
    public Item.Properties createItemProperties(boolean creativeTab) {
        return new Item.Properties();
    }

    @Override
    public WoodType createWoodType(String name) {
        return ModWoodTypes.createAndRegisterReflectively(name);
    }
}

package net.anvian.simplemango.forge;

import net.anvian.simplemango.platform.IPlatformHelper;
import net.anvian.simplemango.wood.ModWoodTypes;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.properties.WoodType;

public final class ForgePlatformHelper implements IPlatformHelper {
    @Override
    public Item.Properties createItemProperties(boolean creativeTab) {
        return new Item.Properties();
    }

    @Override
    public WoodType createWoodType(String name) {
        return ModWoodTypes.registerReflectively(WoodType.create(name));
    }
}

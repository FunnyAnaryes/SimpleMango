package net.anvian.simplemango.wood;

import net.anvian.simplemango.platform.Services;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.lang.reflect.Method;

public final class ModWoodTypes {
    public static WoodType MANGO;

    private ModWoodTypes() {}

    public static void init() {
        if (MANGO == null) {
            MANGO = Services.PLATFORM.createWoodType("mango");
        }
    }

    public static WoodType createAndRegisterReflectively(String name) {
        return registerReflectively(new WoodType(name, BlockSetType.OAK));
    }

    public static WoodType registerReflectively(WoodType woodType) {
        WoodType existing = WoodType.values()
                .filter(type -> type.name().equals(woodType.name()))
                .findFirst()
                .orElse(null);
        if (existing != null) {
            return existing;
        }

        try {
            Method register = WoodType.class.getDeclaredMethod("register", WoodType.class);
            register.setAccessible(true);
            return (WoodType) register.invoke(null, woodType);
        } catch (ReflectiveOperationException exception) {
            throw new IllegalStateException("Unable to register Mango wood type", exception);
        }
    }
}

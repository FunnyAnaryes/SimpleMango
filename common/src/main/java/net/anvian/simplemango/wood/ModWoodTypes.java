package net.anvian.simplemango.wood;

import net.anvian.simplemango.platform.Services;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

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

        List<Method> registerMethods = Arrays.stream(WoodType.class.getDeclaredMethods())
                .filter(method -> Modifier.isStatic(method.getModifiers()))
                .filter(method -> method.getReturnType() == WoodType.class)
                .filter(method -> Arrays.equals(method.getParameterTypes(), new Class<?>[] {WoodType.class}))
                .toList();
        if (registerMethods.size() != 1) {
            throw new IllegalStateException("Unable to register Mango wood type: expected one static "
                    + "WoodType -> WoodType method, found " + registerMethods.size());
        }

        try {
            Method register = registerMethods.get(0);
            register.setAccessible(true);
            return (WoodType) register.invoke(null, woodType);
        } catch (ReflectiveOperationException exception) {
            throw new IllegalStateException("Unable to register Mango wood type", exception);
        }
    }
}

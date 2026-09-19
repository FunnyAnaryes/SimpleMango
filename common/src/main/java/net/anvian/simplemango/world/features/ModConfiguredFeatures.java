package net.anvian.simplemango.world.features;

import net.anvian.simplemango.MangoMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public final class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> MANGO_TREE_KEY = key("mango_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MANGO_SPAWN_KEY = key("mango_spawn");

    private ModConfiguredFeatures() {}

    private static ResourceKey<ConfiguredFeature<?, ?>> key(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MangoMod.MOD_ID, name));
    }
}

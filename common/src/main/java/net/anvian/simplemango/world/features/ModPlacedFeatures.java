package net.anvian.simplemango.world.features;

import net.anvian.simplemango.MangoMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public final class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> MANGO_CHECKED_KEY = key("mango_checked");
    public static final ResourceKey<PlacedFeature> MANGO_PLACED_KEY = key("mango_placed");

    private ModPlacedFeatures() {}

    private static ResourceKey<PlacedFeature> key(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MangoMod.MOD_ID, name));
    }
}

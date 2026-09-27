package net.anvian.simplemango.entity;

import net.anvian.simplemango.block.ModBlocks;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameRules;

final class MangoBoatSupport {
    private MangoBoatSupport() {}

    static void checkFallDamage(Boat boat, double fallDistance, boolean onGround, float entityFallDistance) {
        if (onGround) {
            if (entityFallDistance > 3.0F) {
                if (boat.isInWaterOrBubble()) {
                    boat.resetFallDistance();
                    return;
                }
                boat.causeFallDamage(
                        entityFallDistance, 1.0F, boat.level().damageSources().fall());
                if (!boat.level().isClientSide() && !boat.isRemoved()) {
                    boat.kill();
                    if (boat.level().getGameRules().getBoolean(GameRules.RULE_DOENTITYDROPS)) {
                        for (int i = 0; i < 3; ++i) {
                            boat.spawnAtLocation(ModBlocks.MANGO_PLANKS);
                        }
                        for (int i = 0; i < 2; ++i) {
                            boat.spawnAtLocation(Items.STICK);
                        }
                    }
                }
            }
            boat.resetFallDistance();
        } else if (!boat.level().getFluidState(boat.blockPosition().below()).is(net.minecraft.tags.FluidTags.WATER)
                && fallDistance < 0.0D) {
            boat.fallDistance -= (float) fallDistance;
        }
    }
}

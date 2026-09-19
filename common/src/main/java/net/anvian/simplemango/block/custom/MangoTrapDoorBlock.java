package net.anvian.simplemango.block.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MangoTrapDoorBlock extends TrapDoorBlock {
    public MangoTrapDoorBlock(BlockBehaviour.Properties properties) {
        super(properties, SoundEvents.WOODEN_TRAPDOOR_CLOSE, SoundEvents.WOODEN_TRAPDOOR_OPEN);
    }
}

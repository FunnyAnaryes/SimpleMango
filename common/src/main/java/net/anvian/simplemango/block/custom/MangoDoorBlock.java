package net.anvian.simplemango.block.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MangoDoorBlock extends DoorBlock {
    public MangoDoorBlock(BlockBehaviour.Properties properties) {
        super(properties, SoundEvents.WOODEN_DOOR_CLOSE, SoundEvents.WOODEN_DOOR_OPEN);
    }
}

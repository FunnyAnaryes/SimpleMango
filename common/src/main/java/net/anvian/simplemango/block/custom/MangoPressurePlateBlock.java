package net.anvian.simplemango.block.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MangoPressurePlateBlock extends PressurePlateBlock {
    public MangoPressurePlateBlock(Sensitivity sensitivity, BlockBehaviour.Properties properties) {
        super(sensitivity, properties, SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_OFF,
                SoundEvents.WOODEN_PRESSURE_PLATE_CLICK_ON);
    }
}

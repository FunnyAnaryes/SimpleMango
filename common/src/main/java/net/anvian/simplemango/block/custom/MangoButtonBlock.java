package net.anvian.simplemango.block.custom;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MangoButtonBlock extends ButtonBlock {
    public MangoButtonBlock(BlockBehaviour.Properties properties) {
        super(properties, 30, true, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundEvents.WOODEN_BUTTON_CLICK_ON);
    }
}

package net.anvian.simplemango.block.custom;

import net.anvian.simplemango.wood.ModWoodTypes;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MangoPressurePlateBlock extends PressurePlateBlock {
    public MangoPressurePlateBlock(Sensitivity sensitivity, BlockBehaviour.Properties properties) {
        super(sensitivity, properties, ModWoodTypes.MANGO.setType());
    }
}

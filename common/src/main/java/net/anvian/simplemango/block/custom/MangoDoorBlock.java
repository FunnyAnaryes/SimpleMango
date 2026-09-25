package net.anvian.simplemango.block.custom;

import net.anvian.simplemango.wood.ModWoodTypes;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MangoDoorBlock extends DoorBlock {
    public MangoDoorBlock(BlockBehaviour.Properties properties) {
        super(properties, ModWoodTypes.MANGO.setType());
    }
}

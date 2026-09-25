package net.anvian.simplemango.block.custom;

import net.anvian.simplemango.wood.ModWoodTypes;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MangoTrapDoorBlock extends TrapDoorBlock {
    public MangoTrapDoorBlock(BlockBehaviour.Properties properties) {
        super(properties, ModWoodTypes.MANGO.setType());
    }
}

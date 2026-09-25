package net.anvian.simplemango.block.custom;

import net.anvian.simplemango.wood.ModWoodTypes;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MangoButtonBlock extends ButtonBlock {
    public MangoButtonBlock(BlockBehaviour.Properties properties) {
        super(properties, ModWoodTypes.MANGO.setType(), 30, true);
    }
}

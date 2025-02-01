package net.metalsight.hrigtools.block;

import net.metalsight.hrigtools.Hrigtools;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Hrigtools.MOD_ID);
}

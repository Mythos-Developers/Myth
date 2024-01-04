package net.mythos.multiblock;

import net.minecraft.block.Block;

public class MultiblockStructure {

	private Block[][][] structure;

	public MultiblockStructure(int xLength, int yLength, int zLength) {
		structure = new Block[xLength][yLength][zLength];
	}

}

package net.mythos.multiblock;

import net.minecraft.block.Block;

public class MultiblockStructure {

	private Block[][][] structure;

	public MultiblockStructure(int x, int y, int z) {
		structure = new Block[x][y][z];
	}

}

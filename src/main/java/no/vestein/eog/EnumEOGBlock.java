package no.vestein.eog;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public enum EnumEOGBlock {

  TEST_BLOCK(new EOGBlock("test_block", 2.0f, 10.0f)),
  TEST_BLOCK2(new EOGBlock("test_block2", 20.0f, 10.0f));

  private EOGBlock block;

  EnumEOGBlock(EOGBlock block) {
    this.block = block;
  }

  public static void registerBlocks() {
    for (EnumEOGBlock enumEOGBlock : values()) {
      registerBlock(enumEOGBlock.block);
    }
  }

  private static void registerBlock(Block block) {
    GameRegistry.registerBlock(block, block.getUnlocalizedName());
  }

}

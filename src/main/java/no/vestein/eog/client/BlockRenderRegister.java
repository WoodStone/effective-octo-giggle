package no.vestein.eog.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import no.vestein.eog.EOGBlock;
import no.vestein.eog.EnumEOGBlock;

import static no.vestein.eog.Reference.*;

public final class BlockRenderRegister {

  public static void registerBlockRenderer() {

    for (EnumEOGBlock enumEOGBlock : EnumEOGBlock.values()) {
      registerBlock(enumEOGBlock.getBlock());
    }

  }

  public static void registerBlock(EOGBlock block) {
    ModelResourceLocation resourceLocation = new ModelResourceLocation(MODID + ":" + block.getUnlocalizedName().substring(5), "inventory");
    Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, resourceLocation);
  }

}

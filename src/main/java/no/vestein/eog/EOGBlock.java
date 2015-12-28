package no.vestein.eog;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EOGBlock extends Block {

  public EOGBlock(String unlocalizedName, Material material, float hardness, float resistance) {
    super(material);
    this.setUnlocalizedName(unlocalizedName);
    this.setHardness(hardness);
    this.setResistance(resistance);

    this.setCreativeTab(CreativeTabs.tabBlock);
  }

  public EOGBlock(String unlocalizedName, float hardness, float resistance) {
    this(unlocalizedName, Material.rock, hardness, resistance);
  }

}

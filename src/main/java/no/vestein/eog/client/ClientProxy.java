package no.vestein.eog.client;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import no.vestein.eog.common.CommonProxy;

public class ClientProxy extends CommonProxy {

  @EventHandler
  @Override
  public void preInit(FMLPreInitializationEvent event) {

  }

  @EventHandler
  @Override
  public void init(FMLInitializationEvent event) {

    ItemRenderRegister.registerItemRenderer();
    BlockRenderRegister.registerBlockRenderer();

  }

  @EventHandler
  @Override
  public void postInit(FMLPostInitializationEvent event) {

  }

}

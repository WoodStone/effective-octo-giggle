package no.vestein.eog;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import no.vestein.eog.common.CommonProxy;

import static no.vestein.eog.Reference.*;

@Mod(modid = MODID, version = VERSION)
public class EffectiveOctoGiggle {

  @SidedProxy(clientSide = "no.vestein.eog.client.ClientProxy", serverSide = "no.vestein.eog.common.CommonProxy")
  public static CommonProxy commonProxy;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {

  }

  @EventHandler
  public void init(FMLInitializationEvent event) {

    EnumEOGBlock.registerBlocks();

    commonProxy.init(event);
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {

  }

}

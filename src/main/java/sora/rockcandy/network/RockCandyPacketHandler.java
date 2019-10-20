package sora.rockcandy.network;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import sora.rockcandy.RockCandy;

public class RockCandyPacketHandler {

  private static final String PROTOCOL_VERSION = "1";
  public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
      new ResourceLocation(RockCandy.MODID, "main"),
      () -> PROTOCOL_VERSION,
      PROTOCOL_VERSION::equals,
      PROTOCOL_VERSION::equals
  );

public static void registerMessage(){
INSTANCE.registerMessage(0,PacketAutoFeed.class,PacketAutoFeed::encode,PacketAutoFeed::new,PacketAutoFeed::handle);
}

}

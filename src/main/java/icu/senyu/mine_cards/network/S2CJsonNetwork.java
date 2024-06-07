package icu.senyu.mine_cards.network;

import com.google.gson.JsonObject;
import icu.senyu.mine_cards.MineCards;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;

import java.nio.charset.StandardCharsets;

public class S2CJsonNetwork {

    public static void sendHelloMessage(ServerPlayerEntity player) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("message", "ÄãºÃ");

        PacketByteBuf buf = PacketByteBufs.create();
        buf.writeString(jsonObject.toString());

        ServerPlayNetworking.send(player, MineCards.PACKET_ID, buf);
    }

}

package icu.senyu.mine_cards.network;

import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;

public class S2CJsonNetwork {

    public static void sendHelloMessage(ServerPlayerEntity player) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("message", "你好");

        PacketByteBuf buf = PacketByteBufs.create();
        buf.writeString(jsonObject.toString());

        ServerPlayNetworking.send(player, new ServerJsonPayload(jsonObject.toString()));
    }

}

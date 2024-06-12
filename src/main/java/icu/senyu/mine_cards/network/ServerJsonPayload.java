package icu.senyu.mine_cards.network;

import icu.senyu.mine_cards.MineCards;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.CustomPayload;

public record ServerJsonPayload(String message) implements CustomPayload {

    public static final Id<ServerJsonPayload> ID = CustomPayload.id(MineCards.MOD_ID + ":server_mine_cards_payload");

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }

    public static ServerJsonPayload decode(PacketByteBuf buf) {
        return new ServerJsonPayload(buf.readString(32767)); // 32767 是 Minecraft 数据包的最大长度限制
    }

    public void encode(PacketByteBuf buf) {
        buf.writeString(message);
    }

}

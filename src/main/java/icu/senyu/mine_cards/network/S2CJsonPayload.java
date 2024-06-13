package icu.senyu.mine_cards.network;

import icu.senyu.mine_cards.MineCards;
import net.fabricmc.fabric.impl.networking.CommonRegisterPayload;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;

public record S2CJsonPayload(String message) implements CustomPayload {

    public static final Id<S2CJsonPayload> ID = CustomPayload.id(MineCards.PACKET_ID.toString());
    public static final PacketCodec<PacketByteBuf, S2CJsonPayload> CODEC = CustomPayload.codecOf(S2CJsonPayload::encode, S2CJsonPayload::new);

    private S2CJsonPayload(PacketByteBuf packetByteBuf) {
        this(packetByteBuf.readString());
    }

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }

    public static S2CJsonPayload decode(PacketByteBuf buf) {
        return new S2CJsonPayload(buf.readString(32767)); // 32767 是 Minecraft 数据包的最大长度限制
    }

    public void encode(PacketByteBuf buf) {
        buf.writeString(message);
    }

}

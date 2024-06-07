package icu.senyu.mine_cards.network;

import icu.senyu.mine_cards.MineCards;
import io.netty.buffer.Unpooled;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;

public record ServerPayloadMineCards(Identifier id, String message) implements CustomPayload {
    public static final CustomPayload.Type<ServerPayloadMineCards> ID = new CustomPayload.Type<>(new Resource(MineCards.MOD_ID, "data"));

    @Override
    public PacketByteBuf getData() {
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        buf.writeString(message);
        return buf;
    }

    @Override
    public Id<? extends CustomPayload> getId() {
        return new Id<>(id);
    }
}

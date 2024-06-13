package icu.senyu.mine_cards;

import com.google.gson.JsonObject;
import icu.senyu.mine_cards.network.S2CJsonPayload;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class MineCards implements ModInitializer {
    public static final String MOD_ID = "mine_cards";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Identifier PACKET_ID = new Identifier(MOD_ID, "server_mine_cards_payload");
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private static MinecraftServer server;
    private int tickCount;


    @Override
    public void onInitialize() {
        PayloadTypeRegistry.playS2C().register(S2CJsonPayload.ID, S2CJsonPayload.CODEC);
        ServerLifecycleEvents.SERVER_STARTED.register(this::onServerStarted);
        ServerTickEvents.START_SERVER_TICK.register(this::onServerTick);
    }

    private void onServerStarted(MinecraftServer server) {
        MineCards.server = server;
    }

    private void onServerTick(MinecraftServer server) {
        // 20 ticks = 1 second
        if (tickCount++ >= 20) {
            tickCount = 0;
            for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
                player.sendMessage(Text.literal("tick info for 20*tick").formatted(Formatting.YELLOW), false);
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("type", 1);
                jsonObject.addProperty("info", "info");
                ServerPlayNetworking.send(player, new S2CJsonPayload(jsonObject.toString()));
            }
        }
    }

}
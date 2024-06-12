package icu.senyu.mine_cards.client;

import icu.senyu.mine_cards.network.ServerJsonPayload;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.MinecraftClient;

@Environment(EnvType.CLIENT)
public class ClientMineCards implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        packetRegister();
    }


    public static void packetRegister(){
        ClientPlayNetworking.registerGlobalReceiver(ServerJsonPayload.ID, (payload, context) -> {

            final MinecraftClient mc = context.client();

            mc.execute(() -> {
                // 在客户端主线程中处理接收到的数据
                ClientJsonRun.run(payload.message());
            });

        });
    }
}

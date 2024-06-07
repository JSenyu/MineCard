package icu.senyu.mine_cards;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MineCards implements ModInitializer {
    public static final String MOD_ID = "mine_cards";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Identifier PACKET_ID = new Identifier(MOD_ID, "json_command");

    @Override
    public void onInitialize() {

    }
}
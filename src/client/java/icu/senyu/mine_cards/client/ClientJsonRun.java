package icu.senyu.mine_cards.client;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import icu.senyu.mine_cards.MineCards;

public class ClientJsonRun {

    public static void run(String json){

        try {
            JsonObject jsonData = getJson(json);

            int type = jsonData.get("type").getAsInt();
            switch (type) {
                case 1:
                    // 在这里处理类型为1的消息
                    MineCards.LOGGER.info("this is a test! you are good!");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                // 其他类型处理
                default:
                    MineCards.LOGGER.warn("unknown info: " + type);
                    break;
            }
        } catch (Exception e) {
            MineCards.LOGGER.error("error info: " + e.getMessage(), e);
        }
    }


    public static JsonObject getJson(String json) throws Exception{
        return JsonParser.parseString(json).getAsJsonObject();
    }


}

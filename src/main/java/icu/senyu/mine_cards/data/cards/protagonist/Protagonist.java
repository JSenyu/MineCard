package icu.senyu.mine_cards.data.cards.protagonist;

import com.google.gson.JsonObject;
import icu.senyu.mine_cards.data.cards.CardList;
import icu.senyu.mine_cards.data.cards.venue.Venue;

import java.util.UUID;

public class Protagonist{

    // 玩家uuid，玩家唯一标识符
    public UUID player;

    // 玩家名称，用于显示
    public String name;

    // 当前可用费用数量
    public int cost = 0;

    // 当前最大费用数量
    public int maxCost = 0;

    // 当前过载费用数量
    public int overloadCost = 0;

    // 当前是否处于过载状态，一般是使用过载费用牌后，再次轮到自己回合时，给其他卡牌获取过载状态
    public boolean isOverload = false;

    // 卡牌列表，玩家当前手牌
    public CardList<?> cards = new CardList<>();

    /**
     * 玩家角色的构造函数，用于初始化关键数据
     * */
    public Protagonist(UUID player, String name){
        this.player = player;
        this.name = name;
    }

    /**
     * 当这个回合开始时，触发效果，默认只有基本的过载费用计算
     * */
    public void onRoundStart(Venue venue){
        this.maxCost ++;
        this.cost = maxCost;
        if(overloadCost > 0){
            this.cost = Math.max(this.cost - overloadCost, 0);
            this.isOverload = true;
        }
    }

    /**
     * 当这个回合结束时，触发效果，默认只有基本的过载费用与过载状态清除
     * */
    public void onRoundEnd(Venue venue){
        this.overloadCost = 0;
        this.isOverload = false;
    }


    /**
     * 将对象转换为JSON字符串
     */
    public String toJson() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("player", player.toString());
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("cost", cost);
        jsonObject.addProperty("maxCost", maxCost);
        jsonObject.addProperty("overloadCost", overloadCost);
        jsonObject.addProperty("isOverload", isOverload);
        jsonObject.add("cards", cards.toJson());
        return jsonObject.toString();
    }


}

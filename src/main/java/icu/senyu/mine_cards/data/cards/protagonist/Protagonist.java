package icu.senyu.mine_cards.data.cards.protagonist;

import com.google.gson.JsonObject;
import icu.senyu.mine_cards.data.cards.CardList;
import icu.senyu.mine_cards.data.cards.venue.Venue;

import java.util.UUID;

public class Protagonist{

    // ���uuid�����Ψһ��ʶ��
    public UUID player;

    // ������ƣ�������ʾ
    public String name;

    // ��ǰ���÷�������
    public int cost = 0;

    // ��ǰ����������
    public int maxCost = 0;

    // ��ǰ���ط�������
    public int overloadCost = 0;

    // ��ǰ�Ƿ��ڹ���״̬��һ����ʹ�ù��ط����ƺ��ٴ��ֵ��Լ��غ�ʱ�����������ƻ�ȡ����״̬
    public boolean isOverload = false;

    // �����б���ҵ�ǰ����
    public CardList<?> cards = new CardList<>();

    /**
     * ��ҽ�ɫ�Ĺ��캯�������ڳ�ʼ���ؼ�����
     * */
    public Protagonist(UUID player, String name){
        this.player = player;
        this.name = name;
    }

    /**
     * ������غϿ�ʼʱ������Ч����Ĭ��ֻ�л����Ĺ��ط��ü���
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
     * ������غϽ���ʱ������Ч����Ĭ��ֻ�л����Ĺ��ط��������״̬���
     * */
    public void onRoundEnd(Venue venue){
        this.overloadCost = 0;
        this.isOverload = false;
    }


    /**
     * ������ת��ΪJSON�ַ���
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

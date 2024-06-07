package icu.senyu.mine_cards.data.cards;

import com.google.gson.JsonObject;

/**
 * ���ǿ��Ƶĳ����࣬���еĿ��ƶ����̳�����������
 * */
public abstract class AbsCard {

    protected final String name;
    protected String displayName;
    protected final int cost;

    protected AbsCard(String cardName, int cost){
        this.name = cardName;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getCost() {
        return cost;
    }

    public abstract UseStatus onUse();

    public abstract CardsLevel getCardsLevel();

    public abstract JsonObject toJson();

}

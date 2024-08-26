package icu.senyu.mine_cards.data.cards;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class CardList<C extends AbsCard> {

    private final List<C> cards = new ArrayList<>();

    public void addCard(C card) {
        cards.add(card);
    }

    // toJsonObject方法
    public JsonArray toJson() {
        JsonArray jsonArray = new JsonArray();
        for (C card : cards) {
            JsonObject cardObject = new JsonObject();
            cardObject.addProperty("name", card.getRegisterName().toString());
            cardObject.addProperty("cost", card.getCost());
            jsonArray.add(cardObject);
        }
        return jsonArray;
    }

}

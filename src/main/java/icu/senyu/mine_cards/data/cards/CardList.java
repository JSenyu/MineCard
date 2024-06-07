package icu.senyu.mine_cards.data.cards;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class CardList {

    private List<AbsCard> cards = new ArrayList<>();

    public void addCard(AbsCard card) {
        cards.add(card);
    }

    // toJsonObject·½·¨
    public JsonArray toJson() {
        JsonArray jsonArray = new JsonArray();
        for (AbsCard card : cards) {
            JsonObject cardObject = new JsonObject();
            cardObject.addProperty("name", card.getName());
            cardObject.addProperty("cost", card.getCost());
            jsonArray.add(cardObject);
        }
        return jsonArray;
    }

}

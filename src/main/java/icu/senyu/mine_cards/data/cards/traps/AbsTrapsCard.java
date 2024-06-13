package icu.senyu.mine_cards.data.cards.traps;

import com.google.gson.JsonObject;
import icu.senyu.mine_cards.data.cards.AbsCard;
import icu.senyu.mine_cards.data.cards.CardType;
import icu.senyu.mine_cards.data.cards.CardsLevel;
import icu.senyu.mine_cards.data.cards.UseStatus;

public abstract class AbsTrapsCard extends AbsCard {
    protected AbsTrapsCard(String cardName, int cost) {
        super(CardType.TRAPS, cardName, cost);
    }

    @Override
    public UseStatus onUse() {
        return UseStatus.SUCCESS;
    }

}

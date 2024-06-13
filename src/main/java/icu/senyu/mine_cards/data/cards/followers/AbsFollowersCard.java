package icu.senyu.mine_cards.data.cards.followers;

import icu.senyu.mine_cards.data.cards.AbsCard;
import icu.senyu.mine_cards.data.cards.CardType;
import icu.senyu.mine_cards.data.cards.UseStatus;

public abstract class AbsFollowersCard extends AbsCard {

    protected AbsFollowersCard(String cardName, int cost) {
        super(CardType.FOLLOWERS, cardName, cost);
    }

    @Override
    public UseStatus onUse() {
        return UseStatus.SUCCESS;
    }

}

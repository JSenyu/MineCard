package icu.senyu.mine_cards.data.cards;

import com.google.gson.JsonObject;
import icu.senyu.mine_cards.MineCards;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * ���ǿ��Ƶĳ����࣬���еĿ��ƶ����̳�����������
 * */
public abstract class AbsCard {

    protected final Identifier registerName;
    protected final int cost;

    protected AbsCard(CardType type, String cardName, int cost){
        this.registerName = Identifier.of(MineCards.MOD_ID, type.id + "." + cardName);
        this.cost = cost;
    }


    public Identifier getRegisterName() {
        return this.registerName;
    }

    public Text getDisplayName() {
        return Text.translatable(this.registerName.toTranslationKey());
    }

    public int getCost() {
        return cost;
    }

    public abstract UseStatus onUse();

    public abstract CardsLevel getCardsLevel();

    public abstract JsonObject toJson();

}

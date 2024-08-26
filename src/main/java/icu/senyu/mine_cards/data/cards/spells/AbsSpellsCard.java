package icu.senyu.mine_cards.data.cards.spells;

import icu.senyu.mine_cards.data.cards.AbsCard;
import icu.senyu.mine_cards.data.cards.CardType;
import icu.senyu.mine_cards.data.cards.UseStatus;

public abstract class AbsSpellsCard extends AbsCard {

    /**
     * 法术卡的类型
     * */
    public final SpellsCardType type;

    protected AbsSpellsCard(String cardName, SpellsCardType type, int cost) {
        super(CardType.SPELLS, cardName, cost);
        this.type = type;
    }

    /**
     * 是否能够造成群体效果，一般与 isOnlyForEnemies() 方法搭配使用
     * */
    public boolean isGroupEffect(){
        return false;
    }

    /**
     * 是否只对敌方生效，如果不是，则会对包括自己牌造成效果，不约束指向性法术
     * */
    public boolean isOnlyForEnemies(){
        return true;
    }


    /**
     * 当卡牌被使用时触发
     * */
    @Override
    public UseStatus onUse() {
        return UseStatus.SUCCESS;
    }


    public int getStrength(){
        return 0;
    }



    public static enum SpellsCardType{
        /**
         * 攻击型法术，一般是对场上的卡牌造成法术伤害，对亡灵生物造成治疗
         * */
        DAMAGE,

        /**
         * 治疗型法术，一般是对场上的卡牌造成法术治疗效果，对亡灵生物造成伤害
         * */
        HEALING,

        /**
         * 功能型法术，需要手动设置法术效果
         * */
        FUNCTIONAL;

    }

}

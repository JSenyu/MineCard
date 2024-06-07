package icu.senyu.mine_cards.data.cards;

/**
 * 卡牌等级，一般是指卡牌的稀有度，注意是稀有度而不是强度！
 * */
public enum CardsLevel {

    /**
     * 普通等级的卡牌，非常常见，炮灰
     * */
    COMMON("common"),

    /**
     * 精锐等级的卡牌，比较少见，但也不至于很难找到，一般作为卡牌的主力军
     * */
    ELITE("elite"),

    /**
     * 稀有的卡牌，非常少见，一般作为卡组中的逆转局势的卡牌
     * */
    RARE("rare"),

    /**
     * 传说中的卡牌，一般是通过稀有的卡牌合成，有特殊的效果或者较高的数值
     * */
    LEGENDARY("legendary"),

    /**
     * 神话，无需多言，可以说是一个完全体卡组中最核心的一张卡，一般是boss，会触发更多的特殊效果，数值极高
     * */
    MYTHICAL("mythical"),

    ;

    public final String levelKey;

    CardsLevel(String levelKey){
        this.levelKey = levelKey;
    }

}

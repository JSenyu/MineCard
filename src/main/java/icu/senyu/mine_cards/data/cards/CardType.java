package icu.senyu.mine_cards.data.cards;

/**
 * 所有卡牌类型
 * 卡牌的功能将会根据这个类型来触发
 * */
public enum CardType {

    // 法术卡牌，直接造成效果
    SPELLS("spells"),

    // 随从卡牌，站场牌
    FOLLOWERS("followers"),

    // 装备卡牌，强化随从
    EQUIPMENTS("equipments"),

    // 陷阱卡牌，相当于是藏起来的法术牌，只有特定效果下才会触发
    TRAPS("traps"),

    // 场地改变，更换场地生物群系与时间！
    VENUE_CHANGES("venue_changes"),

    ;

    public final String id;

    CardType(String key){
        this.id = key;
    }
}

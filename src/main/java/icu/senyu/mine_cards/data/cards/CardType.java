package icu.senyu.mine_cards.data.cards;

/**
 * ���п�������
 * ���ƵĹ��ܽ�������������������
 * */
public enum CardType {

    // �������ƣ�ֱ�����Ч��
    SPELLS("spells"),

    // ��ӿ��ƣ�վ����
    FOLLOWERS("followers"),

    // װ�����ƣ�ǿ�����
    EQUIPMENTS("equipments"),

    // ���忨�ƣ��൱���ǲ������ķ����ƣ�ֻ���ض�Ч���²Żᴥ��
    TRAPS("traps"),

    // ���ظı䣬������������Ⱥϵ��ʱ�䣡
    VENUE_CHANGES("venue_changes"),

    ;

    public final String id;

    CardType(String key){
        this.id = key;
    }
}

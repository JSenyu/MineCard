package icu.senyu.mine_cards.data.cards;

/**
 * ���Ƶȼ���һ����ָ���Ƶ�ϡ�жȣ�ע����ϡ�жȶ�����ǿ�ȣ�
 * */
public enum CardsLevel {

    /**
     * ��ͨ�ȼ��Ŀ��ƣ��ǳ��������ڻ�
     * */
    COMMON("common"),

    /**
     * ����ȼ��Ŀ��ƣ��Ƚ��ټ�����Ҳ�����ں����ҵ���һ����Ϊ���Ƶ�������
     * */
    ELITE("elite"),

    /**
     * ϡ�еĿ��ƣ��ǳ��ټ���һ����Ϊ�����е���ת���ƵĿ���
     * */
    RARE("rare"),

    /**
     * ��˵�еĿ��ƣ�һ����ͨ��ϡ�еĿ��ƺϳɣ��������Ч�����߽ϸߵ���ֵ
     * */
    LEGENDARY("legendary"),

    /**
     * �񻰣�������ԣ�����˵��һ����ȫ�忨��������ĵ�һ�ſ���һ����boss���ᴥ�����������Ч������ֵ����
     * */
    MYTHICAL("mythical"),

    ;

    public final String levelKey;

    CardsLevel(String levelKey){
        this.levelKey = levelKey;
    }

}

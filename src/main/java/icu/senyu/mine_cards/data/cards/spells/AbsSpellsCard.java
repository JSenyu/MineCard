package icu.senyu.mine_cards.data.cards.spells;

import icu.senyu.mine_cards.data.cards.AbsCard;
import icu.senyu.mine_cards.data.cards.UseStatus;

public abstract class AbsSpellsCard extends AbsCard {

    /**
     * ������������
     * */
    public final SpellsCardType type;

    protected AbsSpellsCard(String cardName, SpellsCardType type, int cost) {
        super(cardName, cost);
        this.type = type;
    }

    /**
     * �Ƿ��ܹ����Ⱥ��Ч����һ���� isOnlyForEnemies() ��������ʹ��
     * */
    public boolean isGroupEffect(){
        return false;
    }

    /**
     * �Ƿ�ֻ�Եз���Ч��������ǣ����԰����Լ������Ч������Լ��ָ���Է���
     * */
    public boolean isOnlyForEnemies(){
        return true;
    }


    /**
     * �����Ʊ�ʹ��ʱ����
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
         * �����ͷ�����һ���ǶԳ��ϵĿ�����ɷ����˺��������������������
         * */
        DAMAGE,

        /**
         * �����ͷ�����һ���ǶԳ��ϵĿ�����ɷ�������Ч������������������˺�
         * */
        HEALING,

        /**
         * �����ͷ�������Ҫ�ֶ����÷���Ч��
         * */
        FUNCTIONAL;

    }

}

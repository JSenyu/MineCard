package icu.senyu.mine_cards.data.cards.venue;


/**
 * ��Ϸ���أ�ÿ�ֳ��ظ�����Ч����ͬ�������ҹ�����������ɳ���
 * */
public class Venue {

    /**
     * �����Ƿ������⣬������ʱ�����������ÿ�غ���ɳ���
     * */
    public boolean hasSunny = true;

    /**
     * �����Ƿ���ˮ����ˮʱ��ǿ��ˮ�����������ˮ������
     * */
    public boolean hasWater = false;

    public static Venue asNew() {
        return new Venue();
    }

    /**
     * ��ÿ�غϴ������¼�
     * */
    public void onRound(){

    }

}

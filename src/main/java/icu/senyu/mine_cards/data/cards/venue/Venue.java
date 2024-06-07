package icu.senyu.mine_cards.data.cards.venue;


/**
 * 游戏场地，每种场地附带的效果不同，例如黑夜不会对亡灵造成场伤
 * */
public class Venue {

    /**
     * 场地是否有阳光，有阳光时会对亡灵生物每回合造成场伤
     * */
    public boolean hasSunny = true;

    /**
     * 场地是否有水，有水时会强化水中生物，弱化非水中生物
     * */
    public boolean hasWater = false;

    public static Venue asNew() {
        return new Venue();
    }

    /**
     * 在每回合触发的事件
     * */
    public void onRound(){

    }

}

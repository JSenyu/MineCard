package icu.senyu.mine_cards.data.battle_table;

import icu.senyu.mine_cards.data.cards.CardList;
import icu.senyu.mine_cards.data.cards.protagonist.Protagonist;
import icu.senyu.mine_cards.data.cards.venue.Venue;
import net.minecraft.entity.player.PlayerEntity;

public class ServerBattleTable {

    // 对战id，用于多人游戏中识别
    private final int id;

    // 游戏场地，与场地效果触发有关
    private final Venue venue = Venue.asNew();

    // 两名玩家的数据
    private final Protagonist player0;
    private final Protagonist player1;

    // 两名玩家的牌库，初始化时会根据费用随机排序
    // 费用低的会尽量排在前面，防止高费卡手
    // 算法未写
    private final CardList player0Cards = new CardList();
    private final CardList player1Cards = new CardList();

    // 当前回合玩家
    private boolean isRoundPlayer0 = true;

    // 当前回合数
    private int round = 0;

    /**
     * 构造一个新的牌桌，初始化对战玩家的数据
     * */
    public ServerBattleTable(int id, PlayerEntity player0, PlayerEntity player1) {
        this.id = id;
        this.player0 = new Protagonist(player0.getUuid(), player0.getName().getString());
        this.player1 = new Protagonist(player1.getUuid(), player1.getName().getString());
    }

    /**
     * 交换玩家回合判定
     * */
    public void roundPlayer(){
        this.isRoundPlayer0 = !this.isRoundPlayer0;
    }

    /**
     * 当回合开始时，触发玩家的角色效果，或者触发卡牌的效果
     * */
    public void onRoundStart(){
        if(this.isRoundPlayer0){
            this.player0.onRoundStart(this.venue);
        }else {
            this.player1.onRoundStart(this.venue);
        }
        this.round ++;
    }


    /**
     * 当回合结束时，触发玩家的角色效果，或者触发卡牌的效果
     * */
    public void onRoundEnd(){
        if(this.isRoundPlayer0){
            this.player0.onRoundEnd(this.venue);
        }else {
            this.player1.onRoundEnd(this.venue);
        }
    }

    public int getId() {
        return id;
    }


}

package icu.senyu.mine_cards.data.battle_table;

import icu.senyu.mine_cards.data.cards.venue.Venue;

import java.util.UUID;

public class ServerBattleTable {

    private final int id;
    private Venue venue = Venue.asNew();
    private final UUID player0;
    private final UUID player1;
    private int round = 0;

    public ServerBattleTable(int id, UUID player0, UUID player1) {
        this.id = id;
        this.player0 = player0;
        this.player1 = player1;
    }

    public void onRound(){
        this.round ++;
    }

    public int getId() {
        return id;
    }


}

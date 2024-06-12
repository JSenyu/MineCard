package icu.senyu.mine_cards.item;

import icu.senyu.mine_cards.MineCards;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ItemRegister {


    /**
     * 在这里注册物品
     * */
    public static void registerItems(){
        Items.register(new Identifier("senyu", MineCards.MOD_ID), new Item(new Item.Settings()));
    }


    /**
     * 在这里注册方块物品
     * */
    public static void registerBlockItem(){

    }



}

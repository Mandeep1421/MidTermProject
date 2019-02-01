package com.lambton.magicalcardgame;

public class MagicalCardMain {
    public static void main(String [] args)
    {
        MagicalCardGameModel magicalCardGameModel = new MagicalCardGameModel();
        String [][]cards = {{"A","1","C"},{"2","F","4"},{"3","5","D"}};
        magicalCardGameModel.setCardList(cards);

    }

}

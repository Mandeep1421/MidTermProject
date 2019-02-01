package com.lambton.magicalcardgame;

public class MagicalCardGameModel {

    String firstShuffleColPos;
    String secShuffleColPos;
    String [][]cardList=null;
    String [][]firstShuffle=null;

    public String getFirstShuffleColPos() {
        return firstShuffleColPos;
    }
    public void setFirstShuffleColPos(String firstShuffleColPos) {
        this.firstShuffleColPos = firstShuffleColPos;
    }

    public String getSecShuffleColPos() {
        return secShuffleColPos;
    }

    public void setSecShuffleColPos(String secShuffleColPos) {
        this.secShuffleColPos = secShuffleColPos;
    }

    public String[][] getCardList() {
        return cardList;
    }
}

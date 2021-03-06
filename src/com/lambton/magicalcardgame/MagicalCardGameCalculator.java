package com.lambton.magicalcardgame;

public class MagicalCardGameCalculator {

    public String[][] getFirstShuffleResult(MagicalCardGameModel magicalCardGameModel){
        int rowNum = 0;
        int colNum = 0;
        String [][] cards1 = magicalCardGameModel.getCardList();
        String tempArray [][]=new String[3][3];
        String firstShuffleColPos = magicalCardGameModel.firstShuffleColPos;
        colNum = Integer.parseInt(firstShuffleColPos.substring(1,2));
        if(firstShuffleColPos.contains("A")){
            rowNum =0;
            tempArray[0][0]=cards1[0][1];
            tempArray[0][1]=cards1[1][1];
            tempArray[0][2]=cards1[2][1];

            tempArray[1][0]=cards1[0][0];
            tempArray[1][1]=cards1[1][0];
            tempArray[1][2]=cards1[2][0];

            tempArray[2][0]=cards1[0][2];
            tempArray[2][1]=cards1[1][2];
            tempArray[2][2]=cards1[2][2];

//            for (int w=0; w<cards1.length; w++) {
//                for (int y = rowNumber; y < 1; y++) {
//                    for (int u = 0; u < cards1.length; u++) {
//                        tempArray[y][u] = cards1[y][u + 1];
//                    }
//                }
//                for (int y = columnNumber; y < 2; y++) {
//                    for (int u = 0; u < cards1.length; u++) {
//                        tempArray[y][u] = cards1[y][u + 1];
//                    }
//                }
//            }
        }else if (firstShuffleColPos.contains("B")){
            rowNum =1;
            tempArray[0][0]=cards1[0][0];
            tempArray[0][1]=cards1[1][0];
            tempArray[0][2]=cards1[2][0];

            tempArray[1][0]=cards1[0][1];
            tempArray[1][1]=cards1[1][1];
            tempArray[1][2]=cards1[2][1];

            tempArray[2][0]=cards1[0][2];
            tempArray[2][1]=cards1[1][2];
            tempArray[2][2]=cards1[2][2];

        }else if (firstShuffleColPos.contains("C")) {
            rowNum = 2;
            tempArray[0][0]=cards1[0][1];
            tempArray[0][1]=cards1[1][1];
            tempArray[0][2]=cards1[2][1];

            tempArray[1][0]=cards1[0][2];
            tempArray[1][1]=cards1[1][2];
            tempArray[1][2]=cards1[2][2];

            tempArray[2][0]=cards1[0][0];
            tempArray[2][1]=cards1[1][0];
            tempArray[2][2]=cards1[2][0];
        }
        return cards1;
    }

    };



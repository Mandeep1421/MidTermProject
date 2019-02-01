package com.lambton.magicalcardgame;
import java.util.Scanner;

public class MagicalCardMain {
    public static void main(String [] args)
    {
        MagicalCardGameModel magicalCardGameModel = new MagicalCardGameModel();
        System.out.println("This is Magical Card Game!!");
        String [][]cards = {{"A","1","C"},{"2","F","4"},{"3","5","D"}};
        System.out.println("Please select one card from below");
        for (int i=0;i<cards.length;i++){
            for (int j=0;j<cards.length;j++){
                System.out.print(cards[i][j]);
                System.out.print(" , ");
            }
            System.out.println(" ");
        }


        magicalCardGameModel.setCardList(cards);
        Scanner scanner = new Scanner(System. in);
        String FirstShuffleColPos = scanner. nextLine();
        magicalCardGameModel.setFirstShuffleColPos(FirstShuffleColPos);



    }

}

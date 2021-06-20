package chapterSeven.gameOfCards;

import java.util.ArrayList;
import java.util.Arrays;

public class GameEngine {

    public static boolean containsAPair(Card[] playerHand){
        int countOfDuplicateFaces = 0;
        for (int i = 0; i < playerHand.length - 1; i++) {
            for (int j = i+1; j < playerHand.length ; j++) {
                if(playerHand[i].getCardFace() == playerHand[j].getCardFace()){
                    countOfDuplicateFaces++;
                }
            }
        }
        return countOfDuplicateFaces == 1;
    }

    public static boolean containsTwoPairs(Card[] playerHand) {
        ArrayList<CardFace> countOfDuplicateFaces = new ArrayList<CardFace>(2);
        int counterOfDuplicates = 0;
        for (int i = 0; i < playerHand.length - 1; i++) {
            for (int j = i+1; j < playerHand.length ; j++) {
                if(playerHand[i].getCardFace() == playerHand[j].getCardFace() && !countOfDuplicateFaces.contains(playerHand[i].getCardFace())){
                    countOfDuplicateFaces.add( playerHand[i].getCardFace());
                }
            }
        }
        return (countOfDuplicateFaces.size() == 2);
    }
}

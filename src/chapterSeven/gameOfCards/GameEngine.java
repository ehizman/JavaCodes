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
        ArrayList<CardFace> countOfDuplicateFaces = new ArrayList<>(2);
        for (int i = 0; i < playerHand.length - 1; i++) {
            for (int j = i+1; j < playerHand.length ; j++) {
                if(playerHand[i].getCardFace() == playerHand[j].getCardFace() && !countOfDuplicateFaces.contains(playerHand[i].getCardFace())){
                    countOfDuplicateFaces.add( playerHand[i].getCardFace());
                }
            }
        }
        return (countOfDuplicateFaces.size() == 2);
    }

    public static boolean containsThreeOfAKind(Card[] playerHand) {
        int countOfDuplicateFaces = 0;
        for (int i = 0; i < playerHand.length - 1; i++) {
            for (int j = i+1; j < playerHand.length ; j++) {
                if(playerHand[i].getCardFace() == playerHand[j].getCardFace()){
                    countOfDuplicateFaces++;
                    if(countOfDuplicateFaces == 2){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean containsFourOfAKind(Card[] playerHand) {
        int countOfDuplicateFaces = 0;
        for (int i = 0; i < playerHand.length - 1; i++) {
            countOfDuplicateFaces = 0;
            int j = i + 1;
            while(j < playerHand.length) {
                if(playerHand[i].getCardFace() == playerHand[j].getCardFace()){
                    countOfDuplicateFaces++;
                }
                j++;
            }
            if(countOfDuplicateFaces == 3 && j == playerHand.length){
                return true;
            }
        }

        return false;
    }

    public static boolean isAFlush(Card[] playerHand) {
        for (int i = 0; i < playerHand.length - 1; i++) {
            int countOfDuplicateFaces = 0;
            for (int j = i+1; j < playerHand.length ; j++) {
                if(playerHand[i].getCardFace() == playerHand[j].getCardFace()){
                    countOfDuplicateFaces++;
                    if(countOfDuplicateFaces == 4){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isAStraight(Card[] playerHand) {
        CardFace[] facesOfCardsInPlayerHand = new CardFace[playerHand.length];
        for (int i = 0; i < playerHand.length; i++) {
            facesOfCardsInPlayerHand[i] = playerHand[i].getCardFace();
        }
        if (Arrays.equals(facesOfCardsInPlayerHand, new CardFace[]{CardFace.ACE, CardFace.DEUCE, CardFace.THREE, CardFace.FOUR, CardFace.FIVE})){
            return true;
        }
        else{
            if (Arrays.equals(facesOfCardsInPlayerHand, new CardFace[]{CardFace.DEUCE, CardFace.THREE,
                    CardFace.FOUR, CardFace.FIVE, CardFace.SIX})){
                return true;
            }
            else {
                if (Arrays.equals(facesOfCardsInPlayerHand, new CardFace[]{CardFace.THREE, CardFace.FOUR,
                        CardFace.FIVE, CardFace.SIX, CardFace.SEVEN})){
                    return true;
                }
                else{
                    if (Arrays.equals(facesOfCardsInPlayerHand, new CardFace[]{CardFace.FOUR, CardFace.FIVE,
                            CardFace.SIX, CardFace.SEVEN, CardFace.EIGHT})){
                        return true;
                    }
                    else{
                        if (Arrays.equals(facesOfCardsInPlayerHand, new CardFace[]{CardFace.FIVE,
                                CardFace.SIX, CardFace.SEVEN, CardFace.EIGHT, CardFace.NINE})){
                            return true;
                        }
                        else{
                            if (Arrays.equals(facesOfCardsInPlayerHand, new CardFace[]{CardFace.SIX, CardFace.SEVEN, CardFace.EIGHT, CardFace.NINE, CardFace.TEN})) {
                                return true;
                            }
                            else{
                                if(Arrays.equals(facesOfCardsInPlayerHand, new CardFace[]{CardFace.SEVEN, CardFace.EIGHT
                                        , CardFace.NINE, CardFace.TEN, CardFace.JACK})){
                                    return true;
                                }
                                else{
                                    if (Arrays.equals(facesOfCardsInPlayerHand, new CardFace[]{CardFace.EIGHT, CardFace.NINE, CardFace.TEN, CardFace.JACK, CardFace.QUEEN})){
                                        return true;
                                    }
                                    else {
                                        return Arrays.equals(facesOfCardsInPlayerHand, new CardFace[]{CardFace.NINE,
                                                CardFace.TEN, CardFace.JACK, CardFace.QUEEN, CardFace.KING});
                                    }
                                }
                            }

                        }
                    }
                }
            }
        }
    }

    public static boolean isAFullHouse(Card[] playerHand) {
        int countOfFirstDuplicates = 1;
        int countOfSecondDuplicates = 0;
        int indexOfDifferentFace = 0;
        for (int i = 1; i < playerHand.length; i++) {
            if (playerHand[0].getCardFace().equals(playerHand[i].getCardFace())) {
                countOfFirstDuplicates = countOfFirstDuplicates + 1;
            } else {
                indexOfDifferentFace = i;
            }
        }
        if (countOfFirstDuplicates == 1 || countOfFirstDuplicates > 3) {
            return false;
        }
        else {
            for (Card card : playerHand) {
                if (playerHand[indexOfDifferentFace].getCardFace() == card.getCardFace()) {
                    countOfSecondDuplicates++;
                }
            }
            if (countOfSecondDuplicates != 5 - countOfFirstDuplicates) {
                return false;
            }
            return true;
        }
    }
}


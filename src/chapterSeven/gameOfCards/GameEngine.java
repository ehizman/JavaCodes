package chapterSeven.gameOfCards;

import java.util.*;
import java.util.stream.Collectors;

public class GameEngine {

    public static boolean containsAPair(Card[] playerHand){
        Set<CardFace> cardFaces = Arrays.stream(playerHand).map(Card::getCardFace).collect(Collectors.toSet());
        return cardFaces.size() == 4;
    }

    public static boolean containsTwoPairs(Card[] playerHand) {
        Map<CardFace, List<Card>> cardFaceListMap =
                Arrays.stream(playerHand).collect(Collectors.groupingBy(Card::getCardFace));
        final int[] countOfDuplicates = {0};
        cardFaceListMap.forEach((cardFace, cardList) -> {
            if (cardFaceListMap.get(cardFace).size() == 2){
                countOfDuplicates[0]++;
            }
        });
        return countOfDuplicates[0] == 2;
    }

    public static boolean containsThreeOfAKind(Card[] playerHand) {
        Set<CardFace> cardSet = Arrays.stream(playerHand).map(Card::getCardFace).collect(Collectors.toSet());
        return cardSet.size() == 3;
    }

    public static boolean containsFourOfAKind(Card[] playerHand) {
       Set<CardFace> cardFaces = Arrays.stream(playerHand).map(Card::getCardFace).collect(Collectors.toSet());
       return cardFaces.size() == 2;
    }

    public static boolean isAFlush(Card[] playerHand) {
       Set<CardSuit> cardSuits = Arrays.stream(playerHand)
               .map(Card::getCardSuit).collect(Collectors.toSet());
       return cardSuits.size() == 1;
    }

    public static boolean isAStraight(Card[] playerHand) {
        List<Integer> faceValues=
                Arrays.stream(playerHand).map(card -> card.getCardFace().getFaceValue()).distinct()
                        .sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        return (faceValues.get(faceValues.size() - 1) - faceValues.get(0) == 4)&&(faceValues.size()==5);
    }

    public static boolean isAFullHouse(Card[] playerHand) {
        Set<CardFace> cardSet = Arrays.stream(playerHand).map(Card::getCardFace).collect(Collectors.toSet());
        return cardSet.size() == 2;
    }
}


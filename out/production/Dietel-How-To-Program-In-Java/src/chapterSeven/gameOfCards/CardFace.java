package chapterSeven.gameOfCards;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum CardFace {
    ACE(1),
    DEUCE(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private static final Map<Integer, CardFace> cardFaceMap = new HashMap<>();

    static {
        for (CardFace cardFace: EnumSet.allOf(CardFace.class)) {
            cardFaceMap.put(cardFace.getFaceValue(), cardFace);
        }
    }

    public int getFaceValue() {
        return this.faceValue;
    }

    public CardFace getCardFace(int cardFaceValue){
        return cardFaceMap.get(cardFaceValue);
    }


    private final int faceValue;

    CardFace(int faceValue){
        this.faceValue = faceValue;
    }
}

package chapterSeven.gameOfCards;

public class Card {
    private final FaceEnum face;
    private final SuitEnum suit;

    public Card(FaceEnum cardFace, SuitEnum cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    @Override
    public String toString() {
        return String.format("Card %s of %s%n", face, suit);
    }
}

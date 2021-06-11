package chapterSeven.gameOfCards;

public class DeckOfCards {
    private final int TOTAL_NUMBER_OF_CARDS = 52;
    Card[] deck;

    public DeckOfCards(){
        int count = 0;
        Face[] faces = Face.values();
        Suit[] suits = Suit.values();
        deck = new Card[TOTAL_NUMBER_OF_CARDS];
        for (Suit suit: suits) {
            for (Face face : faces) {
                deck[count] = new Card(face, suit);
                count++;
            }
        }
    }
}

enum Suit {
    HEARTS,
    DIAMONDS,
    CLUBS,
    SPADES
}

enum Face {
    ACE,
    DEUCE,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING
}


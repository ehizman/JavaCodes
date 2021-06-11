package chapterSeven.gameOfCards;

public class Card {

    private final Suit suit;
    private final Face face;

    public Card(Face face, Suit suit){
            this.face = face;
            this.suit = suit;
    }

    @Override
    public String toString() {
        return (face + " of " + suit);
    }
}

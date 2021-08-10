package chapterSeven.gameOfCards;

public class Card {
    private final CardFace face;
    private final CardSuit suit;

    public Card(CardFace face, CardSuit suit){
        this.face = face;
        this.suit = suit;
    }
    @Override
    public String toString(){
        return face+ " of " + suit;
    }

    public CardFace getCardFace(){
        return face;
    }

    public CardSuit getCardSuit(){
        return suit;
    }
}

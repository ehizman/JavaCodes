package chapterSeven.gameOfCards;
import java.security.SecureRandom;

public class DeckOfCards {

    private CardSuit[] suits = CardSuit.values();
    private CardFace[] faces = CardFace.values();
    private Card[] deckOfCards = new Card[52];

    public DeckOfCards(){
        int counter = 0;
        for (CardSuit suit : suits) {
            for (CardFace face: faces) {
                deckOfCards[counter] = new Card(face,suit);
                counter++;
            }
        }
    }

    public void displayDeckOfCards(){
        int counter = 0;
        for (CardFace face : faces) {
            for (CardSuit suit: suits) {
                System.out.printf("%-25s",deckOfCards[counter].toString());
                counter++;
            }
            System.out.println();
        }
    }

    public void shuffle(){
        Card[] copyOfDeck = new Card[deckOfCards.length];
        SecureRandom random = new SecureRandom();
        int randomIndex;
        for (int i = deckOfCards.length-1; i >=0 ; i--) {
            if (i == 0){
                randomIndex = 0;
            }
            else{
                randomIndex = random.nextInt(i);
            }
            copyOfDeck[deckOfCards.length - 1 - i] = deckOfCards[randomIndex];
            deckOfCards[randomIndex] = deckOfCards[i];
        }
        deckOfCards = copyOfDeck;
    }

    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.displayDeckOfCards();
        deckOfCards.shuffle();
        System.out.println();
        System.out.println();
        deckOfCards.displayDeckOfCards();
    }
}

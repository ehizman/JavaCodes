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

    public Card[][] dealCard(int numberOfPlayers){
        final int numberOfCardsToDeal = 5;
        Card[][] hands = new Card[numberOfPlayers][numberOfCardsToDeal];
        int currentCard = 0;
        for (int i = 0; i < numberOfPlayers; i++) {
            Card[] playerHand = new Card[numberOfCardsToDeal];
            for (int j = 0; j < numberOfCardsToDeal; j++) {
                if (currentCard == deckOfCards.length){
                    throw new NullPointerException();
                }
                playerHand[j] = deckOfCards[currentCard];
                currentCard++;
            }
            hands[i] = playerHand;
        }
        return hands;
    }
}

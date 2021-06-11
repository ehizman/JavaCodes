package chapterSeven.gameOfCards;

import java.security.SecureRandom;
import java.util.Arrays;

public class DeckOfCards {
    private final int numberOfCardsInDeck = 52;
    SuitEnum[] suits = SuitEnum.values();
    FaceEnum[] faces = FaceEnum.values();
    Card[] deck = new Card[numberOfCardsInDeck];

    public DeckOfCards() {
        int counter = 0;
        for (SuitEnum suit : suits) {
            for (FaceEnum face : faces) {
                Card card = new Card(face, suit);
                deck[counter] = card;
                counter ++;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(deck);
    }

    public int getNumberOfCardsInDeck() {
        System.out.println(deck[0]);
        return numberOfCardsInDeck;
    }

    public void shuffle() {
        int index;
        Card temp;
        SecureRandom randomNumber = new SecureRandom();
        for (int i = 0; i < numberOfCardsInDeck; i++) {
            index = randomNumber.nextInt(numberOfCardsInDeck);
            temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public Card getCard(int index) {
        return deck[index];
    }
}

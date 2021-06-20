package chapterSeven.gameOfCards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameEngineTest {

    @Test
    void twoPairs(){
        Card firstCard = new Card(CardFace.FIVE, CardSuit.CLUBS);
        Card secondCard = new Card(CardFace.FIVE, CardSuit.DIAMONDS);
        Card thirdCard = new Card(CardFace.ACE, CardSuit.CLUBS);
        Card fourthCard = new Card(CardFace.FOUR, CardSuit.HEARTS);
        Card fifthCard = new Card(CardFace.FOUR, CardSuit.DIAMONDS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameEngine.containsTwoPairs(playerHand));
    }

    @Test
    void aPair(){
        Card firstCard = new Card(CardFace.FIVE, CardSuit.CLUBS);
        Card secondCard = new Card(CardFace.FIVE, CardSuit.DIAMONDS);
        Card thirdCard = new Card(CardFace.ACE, CardSuit.CLUBS);
        Card fourthCard = new Card(CardFace.SEVEN, CardSuit.HEARTS);
        Card fifthCard = new Card(CardFace.SIX, CardSuit.DIAMONDS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameEngine.containsAPair(playerHand));
    }
}
package ChapterSeven.gameOfCards;

import chapterSeven.gameOfCards.Card;
import chapterSeven.gameOfCards.CardFace;
import chapterSeven.gameOfCards.CardSuit;
import chapterSeven.gameOfCards.GameEngine;
import org.junit.jupiter.api.Assertions;
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
        Assertions.assertTrue(GameEngine.containsTwoPairs(playerHand));
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

    @Test
    void threeOfAKind(){
        Card firstCard = new Card(CardFace.QUEEN, CardSuit.CLUBS);
        Card secondCard = new Card(CardFace.QUEEN, CardSuit.DIAMONDS);
        Card thirdCard = new Card(CardFace.FOUR, CardSuit.CLUBS);
        Card fourthCard = new Card(CardFace.QUEEN, CardSuit.HEARTS);
        Card fifthCard = new Card(CardFace.SIX, CardSuit.DIAMONDS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameEngine.containsThreeOfAKind(playerHand));
    }

    @Test
    void fourOfAKind(){
        Card firstCard = new Card(CardFace.QUEEN, CardSuit.CLUBS);
        Card secondCard = new Card(CardFace.QUEEN, CardSuit.CLUBS);
        Card thirdCard = new Card(CardFace.QUEEN, CardSuit.SPADES);
        Card fourthCard = new Card(CardFace.QUEEN, CardSuit.HEARTS);
        Card fifthCard = new Card(CardFace.QUEEN, CardSuit.DIAMONDS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameEngine.containsFourOfAKind(playerHand));
    }

    @Test
    void flush(){
        Card firstCard = new Card(CardFace.QUEEN, CardSuit.CLUBS);
        Card secondCard = new Card(CardFace.QUEEN, CardSuit.CLUBS);
        Card thirdCard = new Card(CardFace.QUEEN, CardSuit.SPADES);
        Card fourthCard = new Card(CardFace.QUEEN, CardSuit.HEARTS);
        Card fifthCard = new Card(CardFace.QUEEN, CardSuit.DIAMONDS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameEngine.isAFlush(playerHand));
    }

    @Test
    void straight(){
        Card firstCard = new Card(CardFace.FOUR, CardSuit.CLUBS);
        Card secondCard = new Card(CardFace.FIVE, CardSuit.CLUBS);
        Card thirdCard = new Card(CardFace.SIX, CardSuit.SPADES);
        Card fourthCard = new Card(CardFace.SEVEN, CardSuit.HEARTS);
        Card fifthCard = new Card(CardFace.EIGHT, CardSuit.DIAMONDS);
        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
        assertTrue(GameEngine.isAStraight(playerHand));
    }
//
//    @Test
//    void isAFullHouse(){
//        Card firstCard = new Card(CardFace.FOUR, CardSuit.CLUBS);
//        Card secondCard = new Card(CardFace.FIVE, CardSuit.CLUBS);
//        Card thirdCard = new Card(CardFace.FOUR, CardSuit.SPADES);
//        Card fourthCard = new Card(CardFace.FIVE, CardSuit.HEARTS);
//        Card fifthCard = new Card(CardFace.FIVE, CardSuit.DIAMONDS);
//        Card[] playerHand = new Card[]{firstCard, secondCard, thirdCard, fourthCard, fifthCard};
//        assertTrue(GameEngine.isAFullHouse(playerHand));
//    }
}
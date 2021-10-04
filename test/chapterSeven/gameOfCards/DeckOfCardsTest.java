package chapterSeven.gameOfCards;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DeckOfCardsTest {
    Player playerOne;
    Player playerTwo;
    Card[] playerOneHand;
    Card[] playerTwoHand;
    Card[][] hands;
    int numberOfCards;
    int numberOfPlayers;

    @BeforeEach
    void setUp(){
        playerOne = new Player("Ehis");
        playerTwo = new Player("Eseosa");
        numberOfCards = 5;
        numberOfPlayers = 2;
        playerOneHand = new Card[numberOfCards];
        playerTwoHand = new Card[numberOfCards];
        hands =new Card[numberOfPlayers][numberOfCards];
    }

    @Test
    void dealCards(){
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();
        Player ehis = new Player("Ehis");
        Player eseosa = new Player("Eseosa");
        Player[] players = new Player[]{ehis, eseosa};
        deckOfCards.dealCards(players, 5);
    }

}
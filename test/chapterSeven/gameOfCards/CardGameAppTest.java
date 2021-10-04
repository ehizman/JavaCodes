package chapterSeven.gameOfCards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardGameAppTest {
    Player playerOne;
    Player playerTwo;
    Card[] playerOneHand;
    Card[] playerTwoHand;

    @BeforeEach
    void setUp(){
        playerOne = new Player("Ehis");
        playerTwo = new Player("Eseosa");
        playerOneHand = new Card[5];
        playerTwoHand = new Card[5];
    }
    @Test
    void canDealCards(){

    }

}
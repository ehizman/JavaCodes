package ChapterSeven;
import chapterSeven.gameOfCards.Card;
import chapterSeven.gameOfCards.DeckOfCards;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeckOfCardsTest {
    @Test
    void testThatDeckHasACollectionOf52Cards(){
        DeckOfCards deckOfCards = new DeckOfCards();
        assertEquals("""
                [Card ACE of HEARTS
                , Card DEUCE of HEARTS
                , Card THREE of HEARTS
                , Card FOUR of HEARTS
                , Card FIVE of HEARTS
                , Card SIX of HEARTS
                , Card SEVEN of HEARTS
                , Card EIGHT of HEARTS
                , Card NINE of HEARTS
                , Card TEN of HEARTS
                , Card JACK of HEARTS
                , Card KING of HEARTS
                , Card QUEEN of HEARTS
                , Card ACE of DIAMONDS
                , Card DEUCE of DIAMONDS
                , Card THREE of DIAMONDS
                , Card FOUR of DIAMONDS
                , Card FIVE of DIAMONDS
                , Card SIX of DIAMONDS
                , Card SEVEN of DIAMONDS
                , Card EIGHT of DIAMONDS
                , Card NINE of DIAMONDS
                , Card TEN of DIAMONDS
                , Card JACK of DIAMONDS
                , Card KING of DIAMONDS
                , Card QUEEN of DIAMONDS
                , Card ACE of CLUBS
                , Card DEUCE of CLUBS
                , Card THREE of CLUBS
                , Card FOUR of CLUBS
                , Card FIVE of CLUBS
                , Card SIX of CLUBS
                , Card SEVEN of CLUBS
                , Card EIGHT of CLUBS
                , Card NINE of CLUBS
                , Card TEN of CLUBS
                , Card JACK of CLUBS
                , Card KING of CLUBS
                , Card QUEEN of CLUBS
                , Card ACE of SPADES
                , Card DEUCE of SPADES
                , Card THREE of SPADES
                , Card FOUR of SPADES
                , Card FIVE of SPADES
                , Card SIX of SPADES
                , Card SEVEN of SPADES
                , Card EIGHT of SPADES
                , Card NINE of SPADES
                , Card TEN of SPADES
                , Card JACK of SPADES
                , Card KING of SPADES
                , Card QUEEN of SPADES
                ]""", deckOfCards.toString());
    }

    @Test
    void testThatDeckOfCardsCanBeShuffled(){
        DeckOfCards deckOfCards = new DeckOfCards();
        Card card = deckOfCards.getCard(0);
        deckOfCards.shuffle();
        assertNotEquals(card, deckOfCards.getCard(0));
    }
}

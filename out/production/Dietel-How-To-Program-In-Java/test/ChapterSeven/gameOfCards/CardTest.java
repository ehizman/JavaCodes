package ChapterSeven.gameOfCards;

import chapterSeven.gameOfCards.Card;
import chapterSeven.gameOfCards.CardFace;
import chapterSeven.gameOfCards.CardSuit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardTest {
    @Test
    void createNewCardThatHasAFaceAndASuit(){
        Card card  = new Card(CardFace.ACE, CardSuit.DIAMONDS);
        assertEquals("ACE of DIAMONDS", card.toString());
    }
}


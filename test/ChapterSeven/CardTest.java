package ChapterSeven;

import chapterSeven.gameOfCards.FaceEnum;
import chapterSeven.gameOfCards.Card;
import chapterSeven.gameOfCards.SuitEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardTest {

    @Test
    void testThatCardHasARankAndBelongsToASuit(){
        Card card = new Card(FaceEnum.ACE, SuitEnum.CLUBS);
        assertEquals("Card ACE of CLUBS\n", card.toString());
    }
}



package ChapterSeven;
import assignments.Kata.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaximumAfterRemovalTest {

    @Test
    void canFindMaximumAfterElementIsRemoved(){
        int[] array = new int[]{1,2,3,4,5,202,12};
        assertEquals(228, Kata.findMaximumAfterRemoval(array));
    }
    @Test
    void throwsExceptionIfArrayIsNull(){
        int[] array = null;
        assertThrows(NullPointerException.class, ()->Kata.findMaximumAfterRemoval(array));
    }

    @Test
    void returnMinimumAfterRemoval(){
        int[] array = new int[]{1,2,3,4,5,35};
        assertEquals(15, Kata.findMinimumAfterRemoval(array));
    }
    @Test
    void throwsExceptionIfArrayIsNullForReturnMinimumAfterRemoval(){
        int[] array = null;
        assertThrows(NullPointerException.class, ()->Kata.findMinimumAfterRemoval(array));
    }
}

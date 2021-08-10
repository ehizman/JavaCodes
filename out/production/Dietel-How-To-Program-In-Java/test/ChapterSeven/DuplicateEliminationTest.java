package ChapterSeven;

import chapterSeven.DuplicateElimination;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {

    @Test
    void canFindDuplicate(){
        int[]array = new int[5];
        array[0] = 10;
        array[1] = 10;
        boolean isElementDuplicated = DuplicateElimination.checkIfNewElementIsDuplicated(10, 1);
        assertTrue(isElementDuplicated);
    }

}
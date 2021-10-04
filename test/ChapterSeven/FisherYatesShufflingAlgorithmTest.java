package ChapterSeven;

import chapterSeven.FisherYatesShufflingAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class FisherYatesShufflingAlgorithmTest {

    @Test
    void testCanShuffle(){
        int[] array = new int[]{1,7,9,6,5,4,6};
        assertFalse(Arrays.equals(array, FisherYatesShufflingAlgorithm.shuffle()));
    }

}

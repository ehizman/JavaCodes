package ChapterTwoExercisesTestFiles;

import chapterTwo.ArithmeticLargestAndSmallest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticLargestAndSmallestTest {
    @Test
    void testThatAppCanCalculateTheSumOfThreeNumbers() {
        assertEquals(13, ArithmeticLargestAndSmallest.sum(5,3,5));
    }

    @Test
    void testThatAppCanCalculateProductOfThreeNumbers(){
        assertEquals(75, ArithmeticLargestAndSmallest.product(5,3,5));
    }

    @Test
    void testThatAppCanCalculateAverageOfThreeNumbers(){
        assertEquals(4, ArithmeticLargestAndSmallest.average(5,3,5));
    }

    @Test
    void testThatAppCanCompareThreeNumbersAndReturnLargest(){
        assertEquals("Largest: 7 and Smallest: 3", ArithmeticLargestAndSmallest.compare(5,3,7));
    }
}

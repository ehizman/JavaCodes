package ChapterTwoExercisesTestFiles;

import chapterTwo.ArithmeticLargestAndSmallest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticLargestAndSmallestTest {
    @Test
    void testThatAppCanCalculateTheSumOfThreeNumbers() {
        ArithmeticLargestAndSmallest calculator = new ArithmeticLargestAndSmallest();
        assertEquals(13, calculator.sum(5,3,5));
    }

    @Test
    void testThatAppCanCalculateProductOfThreeNumbers(){
        ArithmeticLargestAndSmallest calculator = new ArithmeticLargestAndSmallest();
        assertEquals(75, calculator.product(5,3,5));
    }

    @Test
    void testThatAppCanCalculateAverageOfThreeNumbers(){
        ArithmeticLargestAndSmallest calculator = new ArithmeticLargestAndSmallest();
        assertEquals(25, calculator.average(5,3,5));
    }

    @Test
    void testThatAppCanCompareThreeNumbersAndReturnLargest(){
        ArithmeticLargestAndSmallest calculator = new ArithmeticLargestAndSmallest();
        assertEquals("Largest: 7 and Smallest: 3", calculator.compare(5,3,7));
    }
}

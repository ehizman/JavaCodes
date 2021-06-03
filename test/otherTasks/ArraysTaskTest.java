package otherTasks;

import OtherProjects.ArrayTask;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysTaskTest {

    @Test
    void canGetTheLargestElementInArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {2, 5, 6,7, 8, 109,19, 5, 26,-89};
        assertEquals(109, array.findMaximumElement(arrayOfNumbers));
    }

    @Test
    void canGetTheSmallestElementInArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {2, 5, 6,7, 8, 109,19, 5, 26,-89};
        assertEquals(-89, array.findSmallestElement(arrayOfNumbers));
    }

    @Test
    void canGetTheSumElementsInArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {1,2,3,4,5,6,7,8,9,10};
        assertEquals(55, array.sumOfElementsInArray(arrayOfNumbers));
    }

    @Test
    void canGetTheRangeOfElementsInArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {1,2,3,4,5,6,7,8,9,10};
        assertEquals(9, array.getRangeOfElementsInArray(arrayOfNumbers));
    }

    @Test
    void testThatArrayContainsElement(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {1,2,3,4,5,6,7,8,9,10};
        assertTrue(array.searchForElements(6, arrayOfNumbers));
    }

    @Test
    void canDeleteElementFromArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {2, 5, 6,7, 8, 109,19, 5, 26,-89};
        String newArray = Arrays.toString(array.deleteElement(arrayOfNumbers, -89));
        assertEquals(Arrays.toString(new int [] {2,5,6,7,8,109,19,5,26}), newArray);
    }

    @Test
    void canFindTwoLargestNumbersInArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {2, 5, 6,7, 8, 109,19, 5, 26,-89};
        assertEquals(Arrays.toString(new int[]{109, 26}), array.findTwoLargestNumbers(arrayOfNumbers));
    }

    @Test
    void canGetAverageOfElementsInArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {1,2,3,4,5,6,7,8,9,10};
        assertEquals(5.5, array.findAverage(arrayOfNumbers));
    }

    @Test
    void canSearchIfAnElementExistsInArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {1,2,3,4,5,6,7,8,9,10};
        assertTrue(array.findElement(arrayOfNumbers, 8));
    }

    @Test
    void canFindTwoSmallestNumbersInArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {2, 5, 6,7, 8, 109,19, 5, 26,-89};
        assertEquals(Arrays.toString(new int[]{-89, 2}), array.findTwoSmallestNumbers(arrayOfNumbers));
    }

//    @Test
////    void canSortArray(){
////        ArrayTask array = new ArrayTask();
////        int[] arrayOfNumbers = new int[] {2, 5, 6,7, 8, 109,19, 5, 26,-89};
////        assertEquals(Arrays.toString(new int[]{-89, 2, 5, 5, 6, 7, 8, 19, 26, 109}).toString(), Arrays.toString(array.sortArray()));
////    }
}

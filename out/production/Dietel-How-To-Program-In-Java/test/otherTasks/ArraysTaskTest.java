package otherTasks;
import OtherProjects.ArrayTask;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class ArraysTaskTest {

    @Test
    void canGetTheLargestElementInArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = null;
        assertEquals(0, array.findLargestElement(arrayOfNumbers));
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

    @Test
    void canSortArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {2,46,57, -98, 567, 4774, 36, -363, 78, 34};
        assertEquals(Arrays.toString(new int[]{-363, -98, 2, 34, 36,46, 57, 78, 567, 4774}),
                Arrays.toString(array.sortArray(arrayOfNumbers)));
    }

    @Test
    void canFindDuplicatesInArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {1,7,3,7,3,3,2,1,6,8,7,5,6,4,5,0,7,7,7,8,7,9,7,10};
        int[] arrayOfDuplicates = new int[]{1,7,3,6,5,8,10};
        System.out.println(Arrays.toString(arrayOfDuplicates));
        assertAll(
                () -> assertEquals(arrayOfDuplicates[0], array.findDuplicates(arrayOfNumbers)[0]),
                () ->  assertEquals(arrayOfDuplicates[1], array.findDuplicates(arrayOfNumbers)[1]),
                () ->  assertEquals(arrayOfDuplicates[2], array.findDuplicates(arrayOfNumbers)[2]),
                () ->  assertEquals(arrayOfDuplicates[3], array.findDuplicates(arrayOfNumbers)[3]),
                () ->  assertEquals(arrayOfDuplicates[4], array.findDuplicates(arrayOfNumbers)[4]),
                () ->  assertEquals(arrayOfDuplicates[5], array.findDuplicates(arrayOfNumbers)[5]),
                () ->  assertEquals(arrayOfDuplicates[6], array.findDuplicates(arrayOfNumbers)[6])
        );

    }

    @Test
    void canFindTheNumberOfTimesAnElementExistsInArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {1,7,3,7,3,3,2,1,6,8,7,5,6,4,5,0};
        assertEquals(2, array.findNumberOfDuplicatesOf(6, arrayOfNumbers));
    }

    @Test
    void canDeleteElementFromArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = new int[] {1,7,3,7,3,3,2,1,6,8,7,5,6,4,5,0};
        assertEquals(Arrays.toString(new int[]{1, 3, 3, 3, 2, 1, 6, 8, 5, 6, 4, 5, 0}),
                Arrays.toString(array.deleteElement(arrayOfNumbers, 7)));
    }

    @Test
    void canRemoveDuplicatesFromArray(){
        ArrayTask array = new ArrayTask();
        int[] arrayOfNumbers = null;
        assertArrayEquals(null, array.removeDuplicates(arrayOfNumbers));
    }
}

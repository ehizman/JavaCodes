package otherTasks;

import OtherProjects.ArrayTask;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}

package assignment;

import assignments.Kata.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTest {
    @Test
    void canFindMaximum(){
        Kata kata = new Kata();
        int[] array = new int[] {45,36,57,0,-13,4,67,45};
        assertEquals(67, kata.findMaximumFrom(array));
    }
}

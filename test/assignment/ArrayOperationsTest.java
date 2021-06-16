package assignment;

import assignments.Kata.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTest {
    @Test
    void canFindMaximum(){
        int[] array = new int[] {45,36,57,0,-13,4,67,145};
        assertEquals(145, Kata.findMaximumFrom(array));
    }

    @Test
    void throwsExceptionWhenNullArrayIsPassed(){
        int[] array = null;
        assertThrows(NullPointerException.class,()-> Kata.findMaximumFrom(array));
    }

    @Test
    void canFindMinimum(){
        int[] array = new int[] {45,36,57,0,-13,4,67,145};
        assertEquals(-13, Kata.findMinimum(array));
    }

    @Test
    void canThrowNullExceptionWhenNullArrayIsPassed(){
        int[] array = null;
        assertThrows(NullPointerException.class, ()-> Kata.findMinimum(array));
    }

    @Test
    void canFindAverage(){
        int[] array = new int[] {45,36,57,0,-13,4,67,145};
        assertEquals(42.625, Kata.findAverage(array));
    }
    @Test
    void throwsNullExceptionWhenNUllArrayIsPassed(){
        int[] array = null;
        assertThrows(NullPointerException.class, ()->Kata.findAverage(array));
    }
}

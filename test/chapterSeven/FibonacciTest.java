package chapterSeven;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void thatArrayListContainsZeroAndOne(){
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(Arrays.asList(0,1),fibonacci.fibonacci(2));
    }

    @Test
    void thatNextElementIsASumOfPreviousTwoElements(){
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(Arrays.asList(0,1,1,2,3),fibonacci.fibonacci(5));
    }

    @Test
    void returnsAnArrayListOfZeroAndOneWhenTheNthTermIsTwo(){
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(Arrays.asList(0,1), fibonacci.fibonacci(2));
    }
}
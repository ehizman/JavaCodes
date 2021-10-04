import Classwork.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataFirstJune {

    @Test
    void testFindFactorialOfNumber(){
        Kata kata = new Kata();
        assertEquals(720, kata.findFactorialOf(6));
    }

    @Test
    void testThatFactorialIsOneWhenNumberIsOne(){
        Kata kata = new Kata();
        assertEquals(1, kata.findFactorialOf(1));
    }

    @Test
    void testThatFactorialIsOneWhenNumberIsZero(){
        Kata kata = new Kata();
        assertEquals(1, kata.findFactorialOf(1));
    }
}
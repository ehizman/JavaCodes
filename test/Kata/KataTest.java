package Kata;

import assignments.Kata.Kata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    void testMethodProducesReverseOfInput(){
        Kata kata = new Kata();
        assertEquals("54321", kata.reverse(12345));
    }
}
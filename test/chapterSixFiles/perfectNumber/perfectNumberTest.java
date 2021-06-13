package chapterSixFiles.perfectNumber;

import chapterSix.perfectNumber.PerfectNumber;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class perfectNumberTest {
    @Test
    void testThatNumberIsPerfect(){
        assertTrue(PerfectNumber.isPerfect(6));
    }

    @Test
    void testThatNumberIsNotPerfect(){
        assertFalse(PerfectNumber.isPerfect(9));
    }
}

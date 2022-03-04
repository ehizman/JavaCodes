package Hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BetweenTwoSetTest {

    @Test
    void getTotalX() {
        List<Integer> a = Arrays.asList(2, 6);
        List<Integer> b = Arrays.asList(24, 36);
        int actual = BetweenTwoSet.getTotalX(a, b);
        assertEquals(2, actual);
    }
}
package chapter18;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
    @Test
    void returnGCD(){
        GreatestCommonDivisor gcdCalc = new GreatestCommonDivisor();
        int gcd = gcdCalc.calc(4, 10);
        assertEquals(2, gcd);
    }
}
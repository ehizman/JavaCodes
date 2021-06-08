package classwork;

import Classwork.PrimeFactorsOfAnInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PrimeFactorsOfAnInteger_Test {

    @Test
    void testThatCanFindFactorialOfNumbers(){
        PrimeFactorsOfAnInteger factorsCalculator = new PrimeFactorsOfAnInteger();
        assertEquals("2 5 5 ", factorsCalculator.findFactors(50).toString());
    }

    @Test
    void testIsNumberAPrime(){
        PrimeFactorsOfAnInteger factorsCalculator = new PrimeFactorsOfAnInteger();
        assertFalse(factorsCalculator.isPrimeNumber(120));
    }
}

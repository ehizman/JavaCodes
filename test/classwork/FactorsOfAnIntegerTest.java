package classwork;

import Classwork.FactorsOfAnInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FactorsOfAnIntegerTest {

    @Test
    void testThatANumberIsAPrimeNumber() throws Exception {
        FactorsOfAnInteger factorsCalculator = new FactorsOfAnInteger();
        assertTrue(factorsCalculator.isPrimeNumber(1));
    }

    @Test
    void canFindAllFactorsOfANumber() throws Exception {
        FactorsOfAnInteger factorsCalculator = new FactorsOfAnInteger();
        assertEquals("2 2 3 5 2  are factors of 120", factorsCalculator.findFactors(170));
    }
}

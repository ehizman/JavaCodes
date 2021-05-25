package Kata;

import assignments.Kata.NumberOfFactors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfFactorsTest {
    /*10 has 4 factors which are 1, 2, 5 and 10*/
    @Test
    void testThatAppCanDetermineNumberOfFactorsWhen10isGivenAsInput(){
        NumberOfFactors numberOfFactorsApp = new NumberOfFactors();
        int numberOfFactors = numberOfFactorsApp.calculateNumberOfFactors(10);
        assertEquals(4, numberOfFactors);
    }

    /*20 has 6 factors 1, 2, 4, 5, 10 and 20 */
    @Test
    void testThatAppCanDetermineNumberOfFactorsWhen20isGivenAsInput(){
        NumberOfFactors numberOfFactorsApp = new NumberOfFactors();
        int numberOfFactors = numberOfFactorsApp.calculateNumberOfFactors(20);
        assertEquals(6, numberOfFactors);
    }

    @Test
    void testThatAppCanDetermineNumberOfFactorsWhen100isGivenAsInput(){
        NumberOfFactors numberOfFactorsApp = new NumberOfFactors();
        int numberOfFactors = numberOfFactorsApp.calculateNumberOfFactors(100);
        assertEquals(9, numberOfFactors);
    }

    @Test
    void testThatAppCanDetermineNumberOfFactorsWhen1IsGivenAsInput(){
        NumberOfFactors numberOfFactorsApp = new NumberOfFactors();
        int numberOfFactors = numberOfFactorsApp.calculateNumberOfFactors(1);
        assertEquals(1, numberOfFactors);
    }

    @Test
    void testThatAppCanDetermineNumberOfFactorsWhenANegativeNumberIsGivenAsInput() {
        NumberOfFactors numberOfFactorsApp = new NumberOfFactors();
        int numberOfFactors = numberOfFactorsApp.calculateNumberOfFactors(-3);
        assertEquals(4, numberOfFactors);
    }

    @Test
    void testThatAppCanDetermineNumberOfFactorsWhenZeroIsGivenAsInput() {
        NumberOfFactors numberOfFactorsApp = new NumberOfFactors();
        int numberOfFactors = numberOfFactorsApp.calculateNumberOfFactors(0);
        assertEquals(0, numberOfFactors);
    }
}

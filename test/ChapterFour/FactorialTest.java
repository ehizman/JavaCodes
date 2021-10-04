package ChapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    void testFactorial(){
        Factorial factorialCalculator= new Factorial();
        int factorial = factorialCalculator.calculateFactorial(5);
        assertEquals(120, factorial);
    }

    @Test
    void testThat1isReturnedForNegativeInputs(){
        Factorial factorialCalculator= new Factorial();
        int factorial = factorialCalculator.calculateFactorial(-1);
        assertEquals(1, factorial);
    }

    @Test
    void testThat1IsReturnedForZeroInputs(){
        Factorial factorialCalculator= new Factorial();
        int factorial = factorialCalculator.calculateFactorial(0);
        assertEquals(1, factorial);
    }
}

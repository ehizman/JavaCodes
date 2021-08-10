package ChapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueOfMathematicalConstantE_FactorialTest {

    @Test
    void testCalculateValueOfEWhenZeroIsPassedIn(){
        ValueOfMathematicalConstantE_Factorial calculator = new ValueOfMathematicalConstantE_Factorial();
        assertEquals(2.0, calculator.calculateValueOfE(0));
    }

    @Test
    void testCalculateValueOfEWhenAPositiveIntegerGreaterThanZeroIsPassed(){
        ValueOfMathematicalConstantE_Factorial calculator = new ValueOfMathematicalConstantE_Factorial();
        assertEquals(2.5, calculator.calculateValueOfE(2));
    }

    @Test
    void testCalculateValueOfEWhenANegativeIntegerIsPassed(){
        ValueOfMathematicalConstantE_Factorial calculator = new ValueOfMathematicalConstantE_Factorial();
        assertEquals(1, calculator.calculateValueOfE(-2));
    }
}

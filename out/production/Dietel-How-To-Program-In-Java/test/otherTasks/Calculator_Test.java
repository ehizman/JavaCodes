package otherTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator_Test {
    @Test
    void calculatorCanAddTwoNumbers(){
        //given
        Calculator calculator = new Calculator();
        //when
        int sum = calculator.addNumbers(9,9);
        //assert
        assertEquals(18, sum);
    }
    @Test
    void calculatorCanSubtractTwoNumbers(){
        //given
        Calculator calculator = new Calculator();
        //when
        int difference = calculator.subtractNumbers(9,10);
        //assert
        assertEquals(-1, difference);
    }
    void calculatorCanSubtractTwoNumbers_Second_Time(){
        //given
        Calculator calculator = new Calculator();
        //when
        int difference = calculator.subtractNumbers(19,10);
        //assert
        assertEquals(9, difference);
    }

    @Test
    void calculatorCanMultiplyTwoNumbers(){
        //given
        Calculator calculator = new Calculator();
        //when
        int difference = calculator.multiplyNumbers(9,10);
        //assert
        assertEquals(90, difference);
    }

    @Test
    void calculatorCanDivideTwoNumbers(){
        //given
        Calculator calculator = new Calculator();
        //when
        int quotient = calculator.divideNumbers(9,0);
        //assert
        assertEquals(0, quotient);
    }

    @Test
    void calculatorCanDivideTwoNumbers_When_Second_Number_Is_Not_Zero(){
        //given
        Calculator calculator = new Calculator();
        //when
        int quotient = calculator.divideNumbers(19,10);
        //assert
        assertEquals(1, quotient);
    }
    @Test
    void test_main(){
        Calculator.main("Eis");
    }
}

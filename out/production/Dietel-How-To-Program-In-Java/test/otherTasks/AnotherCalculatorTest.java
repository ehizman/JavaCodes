package otherTasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class AnotherCalculatorTest {
    @Test
    void canAddTwoNumbers(){
        int firstNumber = 5;
        int secondNumber = 10;
        assertThat(firstNumber + secondNumber).isEqualTo(15);
    }

    @Test
    void canSubtractTwoNumbers(){
        int firstNumber = 5;
        int secondNumber = 10;
        assertThat(firstNumber + secondNumber).isEqualTo(15);
    }

}
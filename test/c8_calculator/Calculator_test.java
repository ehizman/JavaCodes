package c8_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator_test {
    @Test
    void test_Constructor(){
        //given
        C8Calculator calculator;
                //when
        calculator= new C8Calculator();
        //assert
        assertNotNull(calculator);
    }

    @Test
    void test_That_Calculator_Is_Off_When_Created(){
        //given
        C8Calculator calculator;
        //when
        calculator = new C8Calculator();
        //assert
        assertFalse(calculator.isOn());
    }

    @Test
    void test_That_Can_Power_On_Calculator(){
        //given
        C8Calculator calculator = new C8Calculator();
        //when
        calculator.power();
        //assert
        assertTrue(calculator.isOn());
    }

    @Test
    void test_That_Can_Power_Calculator_Off_After_It_Has_Been_Turned_On(){
        //given
        C8Calculator calculator = new C8Calculator();
        //when
        calculator.power();
        calculator.power();
        //assert
        assertFalse(calculator.isOn());
    }

    @Test
    void test_That_Can_Add_Two_Numbers(){
        //given
        C8Calculator calculator = new C8Calculator();
        //when
        calculator.power();
        assertTrue(calculator.isOn());
        calculator.add(5,8);
        //assert
        assertEquals(13, calculator.getResult());
    }

    @Test
    void can_Subtract_Two_Numbers(){
        //given
        C8Calculator calculator = new C8Calculator();
        //given
        calculator.power();
        calculator.power();
        calculator.power();
        calculator.sub(5,3);
        //assert
        assertEquals(2, calculator.getResult());
    }
}

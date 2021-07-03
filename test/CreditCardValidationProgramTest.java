import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationProgramTest {
    @Test
    void check_That_Credit_Card_Validator_Returns_True_When_A_Number_Starts_With_Valid_Prefix_4() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.validPrefix("488576018402626"));
    }

    @Test
    void check_That_Credit_Card_Validator_ReturnsTrue_When_A_Number_Starts_With_Valid_Prefix_37() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.validPrefix("3788576018402626"));
    }

    @Test
    void check_That_Credit_Card_Validator_ReturnsTrue_When_A_Number_Starts_With_Valid_Prefix_5() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.validPrefix("5788576018402626"));
    }

    @Test
    void check_That_Credit_Card_Validator_ReturnsTrue_When_A_Number_Starts_With_Valid_Prefix_6() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.validPrefix("688576018402626"));
    }

    @Test
    void check_That_Credit_Card_Validator_Returns_False_When_A_Number_Starts_With_An_Invalid_Prefix() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertFalse(creditCardValidator.validPrefix("8388576018402626"));
    }

    @Test
    void check_Credit_Card_Validator_Returns_True_When_Number_With_A_Valid_Length_Of_16__Is_Checked() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.isValidLength("8388576018402626"));
    }

    @Test
    void check_Credit_Card_Validator_Returns_True_When_Number_With_A_Valid_Length_Of_13__Is_Checked() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.isValidLength("8388576018402"));
    }

    @Test
    void check_Credit_Card_Validator_Returns_True_When_Number_With_A_Valid_Length_Of_14__Is_Checked() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.isValidLength("83885760184026"));
    }

    @Test
    void check_Credit_Card_Validator_Returns_True_When_Number_With_A_Valid_Length_Of_15__Is_Checked() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.isValidLength("838857601840262"));
    }

    @Test
    void check_Credit_Card_Validator_Returns_False_When_Number_With_A_Invalid_Length_Is_Checked() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertFalse(creditCardValidator.isValidLength("838857601840"));
    }

    @Test
    void can_Sum_All_Evenly_Placed_Numbers_From_Right_To_Left_When_Length_Of_ValidNumber_Is_16() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertEquals(37, creditCardValidator.sumOfDoubleEvenPlace("4388576018402626"));
    }

    @Test
    void can_Sum_All_Evenly_Placed_Numbers_From_Right_To_Left_When_Length_Of_ValidNumber_Is_15() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertEquals(28, creditCardValidator.sumOfDoubleEvenPlace("438857601840262"));
    }

    @Test
    void can_Sum_All_Evenly_Placed_Numbers_From_Right_To_Left_When_Length_Of_ValidNumber_Is_14() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertEquals(33, creditCardValidator.sumOfDoubleEvenPlace("43885760184026"));
    }

    @Test
    void can_Sum_All_Evenly_Placed_Numbers_From_Right_To_Left_When_Length_Of_ValidNumber_Is_13() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertEquals(25, creditCardValidator.sumOfDoubleEvenPlace("4388576018402"));
    }

    @Test
    void can_Sum_All_Oddly_Placed_Numbers_From_Right_To_Left_When_Length_Of_ValidNumber_Is_16() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertEquals(38, creditCardValidator.sumOfOddPlace("4388576018402626"));
    }

    @Test
    void can_Sum_All_Oddly_Placed_Numbers_From_Right_To_Left_When_Length_Of_ValidNumber_Is_15() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertEquals(32, creditCardValidator.sumOfOddPlace("438857601840262"));
    }

    @Test
    void can_Sum_All_Oddly_Placed_Numbers_From_Right_To_Left_When_Length_Of_ValidNumber_Is_14() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertEquals(32, creditCardValidator.sumOfOddPlace("43885760184026"));
    }

    @Test
    void can_Sum_All_Oddly_Placed_Numbers_From_Right_To_Left_When_Length_Of_ValidNumber_Is_13() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertEquals(30, creditCardValidator.sumOfOddPlace("4388576018402"));
    }

    @Test
    void check_If_Credit_Card_Validator_Returns_True_When_Credit_Card_NUmber_Is_Valid() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        int sum_of_oddly_placed_digits = creditCardValidator.sumOfOddPlace("4388576018410707");
        int sum_of_evenly_placed_digits = creditCardValidator.sumOfDoubleEvenPlace("4388576018410707");
        assertTrue(creditCardValidator.isValidCreditCard(sum_of_evenly_placed_digits, sum_of_oddly_placed_digits));
    }

    @Test
    void check_If_Credit_Card_Validator_Returns_True_When_Credit_Card_NUmber_Is_Invalid() {
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        int sum_of_oddly_placed_digits = creditCardValidator.sumOfOddPlace("4388576018402626");
        int sum_of_evenly_placed_digits = creditCardValidator.sumOfDoubleEvenPlace("4388576018402626");
        assertFalse(creditCardValidator.isValidCreditCard(sum_of_evenly_placed_digits, sum_of_oddly_placed_digits));
    }
}
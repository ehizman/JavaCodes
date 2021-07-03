import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidationProgramTest {
    @Test
    void check_That_Credit_Card_Validator_Returns_True_When_A_Number_Starts_With_Valid_Prefix_4(){
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.validPrefix("488576018402626"));
    }
    @Test
    void check_That_Credit_Card_Validator_ReturnsTrue_When_A_Number_Starts_With_Valid_Prefix_37(){
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.validPrefix("3788576018402626"));
    }
    @Test
    void check_That_Credit_Card_Validator_ReturnsTrue_When_A_Number_Starts_With_Valid_Prefix_5(){
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.validPrefix("5788576018402626"));
    }
    @Test
    void check_That_Credit_Card_Validator_ReturnsTrue_When_A_Number_Starts_With_Valid_Prefix_6(){
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.validPrefix("688576018402626"));
    }
    @Test
    void check_That_Credit_Card_Validator_Returns_False_When_A_Number_Starts_With_An_Invalid_Prefix(){
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertFalse(creditCardValidator.validPrefix("8388576018402626"));
    }

    @Test
    void check_Credit_Card_Validator_Returns_True_When_Number_With_A_Valid_Length_Of_16__Is_Checked(){
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.checkLength("8388576018402626"));
    }

    @Test
    void check_Credit_Card_Validator_Returns_True_When_Number_With_A_Valid_Length_Of_13__Is_Checked(){
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.checkLength("8388576018402"));
    }
    @Test
    void check_Credit_Card_Validator_Returns_True_When_Number_With_A_Valid_Length_Of_14__Is_Checked(){
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.checkLength("83885760184026"));
    }
    @Test
    void check_Credit_Card_Validator_Returns_True_When_Number_With_A_Valid_Length_Of_15__Is_Checked(){
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertTrue(creditCardValidator.checkLength("838857601840262"));
    }
    @Test
    void check_Credit_Card_Validator_Returns_False_When_Number_With_A_Invalid_Length_Is_Checked(){
        CreditCardValidationProgram creditCardValidator = new CreditCardValidationProgram();
        assertFalse(creditCardValidator.checkLength("838857601840"));
    }
}
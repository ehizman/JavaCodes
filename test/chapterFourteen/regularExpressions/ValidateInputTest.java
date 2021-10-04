package chapterFourteen.regularExpressions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateInputTest {
    @Test
    void testValidateFirstName_returnsTrueWhenValidFirstNameIsPassed(){
        boolean isValidFirstName = ValidateInput.validateFirstName("Ehis");
        assertTrue(isValidFirstName, ()-> "first name should match te regex pattern - [A-Z][a-z]*");
    }

    @Test
    void testValidateFirstName_returnsTrueWhenInvalidFirstNameIsPassed(){
        boolean isValidFirstName = ValidateInput.validateFirstName("1Ehis");
        assertFalse(isValidFirstName, ()-> "first name should match the regex pattern - [A-Z][a-z]*");
    }

    @Test
    void testValidateLastName_returnsTrueWhenValidFirstNameIsPassed(){
        boolean isValidFirstName = ValidateInput.validateLastName("Edemakhiota");
        assertTrue(isValidFirstName, ()-> "first name should match the regex pattern -[A-Z]+[-']*[A-Za-z]*");
    }

    @Test
    void testValidateLastName_returnsTrueWhenValidLastNameIsPassed(){
        assertAll(
                ()-> assertTrue(ValidateInput.validateLastName("E'demakhiota"), ()-> "first name should match the regex pattern - [A-Z][a-z]*"),
                ()-> assertTrue(ValidateInput.validateLastName("E-demakhiota")),
                ()-> assertTrue(ValidateInput.validateLastName("edemakhiota"))

        );
    }

    @Test
    void testValidLastName_returnsFalseWhenInvalidLastNameIsPassed(){
        boolean isValidLastName = ValidateInput.validateLastName("-edeamgkgioyt");
        assertFalse(isValidLastName, ()-> "lastName passed in does not match the regex pattern");
    }

    @Test
    void testValidatePhoneNumber_returnsTrueWhenAValidPhoneNumberIsPassed(){
        boolean isValidPhoneNumber = ValidateInput.validatePhoneNumber("+234-810-3456-678");
        assertTrue(isValidPhoneNumber);
    }

    @Test
    void testValidatePhoneNumber_returnsTrueWhenAInvalidPhoneNumberIsPassed(){
        assertAll(
                ()->assertFalse(ValidateInput.validatePhoneNumber("+233-810-5678-679")),
                ()->assertFalse(ValidateInput.validatePhoneNumber("+233-810-5678-7679")),
                ()->assertFalse(ValidateInput.validatePhoneNumber("+234-810-578-7679")),
                ()->assertFalse(ValidateInput.validatePhoneNumber("+2-810-578-7679"))

        );
    }

    @Test
    void testValidateAddress_returnsTrueWhenAValidAddressIsPassed(){
        boolean isValidAddress = ValidateInput.validateAddress("1 Akinbowa Street Alagomeji Yaba");
        assertTrue(isValidAddress);
    }

    @Test
    void testValidateAddress_returnsFalseWhenAnInvalidAddressIsPassed(){
        boolean isValidAddress = ValidateInput.validateAddress("1 Akinbowa Street");
        assertFalse(isValidAddress);
    }

}
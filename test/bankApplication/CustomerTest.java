package bankApplication;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void testCustomerSetUp(){
        Customer newCustomer = new Customer("Ehis","Edemakhiota","ehizman");
        Bank.addNewCustomer(newCustomer);
        newCustomer.generateAccountNumber();
        assertEquals(String.format("%s %s %s %d %.2f","Ehis","Edemakhiota","ehizman",1,0.00),newCustomer.toString());
    }

    @Test
    void testThatCustomerCanChangeDefaultPin(){
        Customer newCustomer = new Customer("Ehis","Edemakhiota","ehizman");
        newCustomer.setPin("2034");
        assertEquals("2034",newCustomer.getPin());
    }

    @Test
    void testThatThrowsExceptionWhenCustomerTriesToSetANullPin(){
        Customer newCustomer = new Customer("Ehis","Edemakhiota", "ehizman");
        assertThrows(NullPointerException.class, ()->newCustomer.setPin(null));
    }
    @Test
    void thatThrowsExceptionWhenCustomerSetsPinThatDoesNotFourCharacters(){
        Customer newCustomer = new Customer("Ehis","Edemakhiota","ehizman");
        assertThrows(InvalidParameterException.class, ()->newCustomer.setPin("123"));
    }
    @Test
    void thatThrowsExceptionWhenUserEntersAlphabeticPin() {
        Customer newCustomer = new Customer("Ehis", "Edemakhiota", "ehizman");
        assertThrows(NumberFormatException.class, () -> newCustomer.setPin("acde"), "Invalid pin!");
    }

}
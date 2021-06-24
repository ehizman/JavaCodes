package bankApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankApplicationTest {

    @Test
    void customerCanLoginIntoBankApplication(){
        BankApplication bankApplication = new BankApplication();
        Customer customer = new Customer("Ehis", "Edemakhiota", "ehizman");
        Bank.addNewCustomer(customer);
        customer.setPin("2345");
        boolean isValidLogin = bankApplication.login("ehizman","2345");
        assertTrue(isValidLogin);
    }
}
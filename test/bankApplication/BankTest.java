package bankApplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    void newCustomerCanBeAddedToListOfBankCustomers(){
        Bank bank = new Bank();
        Customer newCustomer = new Customer("Ehis", "Edemakhiota","ehizman");
        Bank.addNewCustomer(newCustomer);
        newCustomer.generateAccountNumber();
        assertTrue(Bank.getCustomers().contains(newCustomer));
    }

    @Test
    void testThatMultipleCustomersCanBeAddedToBank(){
        Bank bank = new Bank();
        assertEquals(0, Bank.getCustomers().size());
        Customer newCustomer = new Customer("Ehis", "Edemakhiota","ehizman");
        Bank.addNewCustomer(newCustomer);
        newCustomer.generateAccountNumber();
        Customer secondNewCustomer = new Customer("Micheal", "Seyi","miSeyi");
        Bank.addNewCustomer(secondNewCustomer);
        secondNewCustomer.generateAccountNumber();
        assertEquals("2",secondNewCustomer.getAccount().getAccountNumber());
    }

    @AfterEach
    void tearDown() {
        Bank.getCustomers().clear();
    }
}
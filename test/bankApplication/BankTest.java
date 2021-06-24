package bankApplication;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    void newCustomerCanBeAddedToListOfBankCustomers(){
        Bank bank = new Bank();
        Customer newCustomer = new Customer("Ehis", "Edemakhiota","ehizman");
        Bank.addNewCustomer(newCustomer);
        assertTrue(Bank.getCustomers().contains(newCustomer));
    }

    @Test
    void testThatMultipleCustomersCanBeAddedToBank(){
        Bank bank = new Bank();
        Customer newCustomer = new Customer("Ehis", "Edemakhiota","ehizman");
        Bank.addNewCustomer(newCustomer);
        Customer secondNewCustomer = new Customer("Micheal", "Seyi","miSeyi");
        Bank.addNewCustomer(secondNewCustomer);
        assertAll(
                ()-> assertTrue(Bank.getCustomers().contains(newCustomer)),
                ()-> assertTrue(Bank.getCustomers().contains(secondNewCustomer)),
                ()->assertEquals(2,Bank.getNumberOfCustomers())
        );
    }
}
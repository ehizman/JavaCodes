package bankApplication;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BankTest {
    @Test
    void newCustomerCanBeAddedToListOfBankCustomers(){
        Bank bank = new Bank();
        Customer newCustomer = new Customer("Ehis", "Edemakhiota");
        Bank.addNewCustomer(newCustomer);
        assertTrue(Bank.getCustomers().contains(newCustomer));
    }
}
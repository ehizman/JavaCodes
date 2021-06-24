package bankApplication;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BankTest {
    @Test
    void newCustomerCanBeAddedToListOfBankCustomers(){
        List<Customer> bankCustomers = Bank.getCustomers();
        Customer newCustomer = new Customer("Ehis", "Edemakhiota");
        bankCustomers.add(newCustomer);
        assertTrue(bankCustomers.contains(newCustomer));
    }
}
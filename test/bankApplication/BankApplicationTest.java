package bankApplication;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankApplicationTest {

    @Test
    void customerCanLoginIntoBankApplication(){
        BankApplication bankApplication = new BankApplication();
        Customer customer = new Customer("Ehis", "Edemakhiota", "ehizman");
        Bank.addNewCustomer(customer);
        customer.setPin("2345");
        boolean isValidLogin = bankApplication.customerLogin("ehizman","2345");
        assertTrue(isValidLogin);
    }

    @Test
    void bankAdminCanLogin(){
        BankApplication bankApplication = new BankApplication();
        assertTrue(Bank.staff.getUserName().equals("Admin"));
        assertTrue(Bank.staff.getPin().equals("1234"));
        boolean isValidLogin = bankApplication.staffLogin("Admin", "1234");
    }

    @Test
    void thatCustomerCannotLoginWhenInvalidUserNameIsEntered(){
        BankApplication bankApplication = new BankApplication();
        Customer customer = new Customer("Ehis", "Edemakhiota", "ehizman");
        Bank.addNewCustomer(customer);
        customer.setPin("2345");
        boolean isValidLogin = bankApplication.customerLogin("ehizman3","2345");
        assertFalse(isValidLogin);
    }

    @Test
    void thatCustomerCannotLoginWhenInvalidPinIsEntered(){
        BankApplication bankApplication = new BankApplication();
        Customer customer = new Customer("Ehis", "Edemakhiota", "ehizman");
        Bank.addNewCustomer(customer);
        customer.setPin("2345");
        boolean isValidLogin = bankApplication.customerLogin("ehizman3","2341");
        assertFalse(isValidLogin);
    }
    @Test
    void testThatCustomerCanLoginAfterRegisteringThroughBankApp(){
        BankApplication bankApplication = new BankApplication();
        bankApplication.register("Ehis", "Edemakhiota", "ehizman");
        bankApplication.getUser().setPin("1232");
        boolean isValidLogin = bankApplication.customerLogin("ehizman", "1232");
        assertTrue(isValidLogin);
    }

    @Test
    void testThatCustomerCanLoadAirtimeThroughBankApp(){
        BankApplication bankApplication = new BankApplication();
        bankApplication.register("Ehis", "Edemakhiota", "ehizman");
        Customer customer = bankApplication.getUser();
        bankApplication.getUser().setPin("1232");
        bankApplication.getUser().getAccount().deposit(5000);
        System.out.println(bankApplication.getUser().getAccount().getAccountBalance());
        boolean isValidLogin = bankApplication.customerLogin("ehizman", "1232");
        assertTrue(isValidLogin);
        bankApplication.loadAirtime(200);
        assertEquals(4800.00, customer.getAccount().getAccountBalance().doubleValue());
    }
}
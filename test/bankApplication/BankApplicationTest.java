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

    @Test
    void testThatCustomerCanTransferThroughBankApp(){
        BankApplication bankApplication = new BankApplication();
        bankApplication.register("Michael", "Obi", "miObi");
        bankApplication.register("Ehis", "Edemakhiota", "ehizman");
        Customer customer = bankApplication.getUser();
        Customer newCustomer = null;
        bankApplication.getUser().setPin("1232");
        bankApplication.getUser().getAccount().deposit(5000);
        boolean isValidLogin = bankApplication.customerLogin("ehizman", "1232");
        assertTrue(isValidLogin);
        bankApplication.transfer("1", 4000);
        assertEquals(1000.00, customer.getAccount().getAccountBalance().doubleValue());
        for (Customer user: Bank.getCustomers()) {
            if (user.getAccount().getAccountNumber().equals("1")){
                newCustomer = user;
            }
        }
        assert newCustomer != null;
        assertEquals(4000.00, newCustomer.getAccount().getAccountBalance().doubleValue());
    }
}
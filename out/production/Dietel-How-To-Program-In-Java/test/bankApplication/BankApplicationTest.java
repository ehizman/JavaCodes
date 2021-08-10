//package bankApplication;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//
//import java.security.InvalidParameterException;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class BankApplicationTest {
//
//    @Test
//    void customerCanLoginIntoBankApplication(){
//        BankApplication bankApplication = new BankApplication();
//        Customer customer = new Customer("Ehis", "Edemakhiota", "ehizman");
//        Bank.addNewCustomer(customer);
//        customer.setPin("2345");
//        BankApplication.customerLogin();
//        assertTrue(isValidLogin);
//    }
//
//    @Test
//    void bankAdminCanLogin(){
//        BankApplication bankApplication = new BankApplication();
//        assertEquals("Admin", Bank.staff.getUserName());
//        assertEquals("1234", Bank.staff.getPin());
//        boolean isValidLogin = bankApplication.staffValidation("Admin", "1234");
//    }
//
//    @Test
//    void thatCustomerCannotLoginWhenInvalidUserNameIsEntered(){
//        BankApplication bankApplication = new BankApplication();
//        Customer customer = new Customer("Ehis", "Edemakhiota", "ehizman");
//        Bank.addNewCustomer(customer);
//        customer.setPin("2345");
//        boolean isValidLogin = BankApplication.customerLogin("ehizman3","2345");
//        assertFalse(isValidLogin);
//    }
//
//    @Test
//    void thatCustomerCannotLoginWhenInvalidPinIsEntered(){
//        BankApplication bankApplication = new BankApplication();
//        Customer customer = new Customer("Ehis", "Edemakhiota", "ehizman");
//        Bank.addNewCustomer(customer);
//        customer.setPin("2345");
//        boolean isValidLogin = BankApplication.customerLogin("ehizman3","2341");
//        assertFalse(isValidLogin);
//    }
//    @Test
//    void testThatCustomerCanLoginAfterRegisteringThroughBankApp(){
//        BankApplication bankApplication = new BankApplication();
//        BankApplication.register("Ehis", "Edemakhiota", "ehizman");
//        bankApplication.getUser().setPin("1232");
//        boolean isValidLogin = BankApplication.customerLogin("ehizman", "1232");
//        assertTrue(isValidLogin);
//    }
//
//    @Test
//    void testThatThrowsExceptionWhenInvalidPinIsPassed(){
//        BankApplication bankApplication = new BankApplication();
//        bankApplication.register("Ehis", "Edemakhiota", "ehizman");
//        bankApplication.getUser().setPin("1232");
//        assertThrows(InvalidParameterException.class, ()-> BankApplication.customerLogin("ehizman", "1231"));
//    }
//
//    @Test
//    void testThatCustomerCanLoadAirtimeThroughBankApp(){
//        BankApplication bankApplication = new BankApplication();
//        BankApplication.register("Ehis", "Edemakhiota", "ehizman");
//        Customer customer = bankApplication.getUser();
//        bankApplication.getUser().setPin("1232");
//        bankApplication.getUser().getAccount().deposit(5000);
//        boolean isValidLogin = BankApplication.customerLogin("ehizman", "1232");
//        assertTrue(isValidLogin);
//        bankApplication.getUser().getAccount().loadAirtime(200);
//        assertEquals(4800.00, customer.getAccount().getAccountBalance().doubleValue());
//    }
//
//    @Test
//    void testThatCustomerCanTransferThroughBankApp(){
//        BankApplication bankApplication = new BankApplication();
//        BankApplication.register("Michael", "Obi", "miObi");
//        BankApplication.register("Ehis", "Edemakhiota", "ehizman");
//        Customer customer = bankApplication.getUser();
//        Customer newCustomer = null;
//        bankApplication.getUser().setPin("1232");
//        bankApplication.getUser().getAccount().deposit(5000);
//        boolean isValidLogin = BankApplication.customerLogin("ehizman", "1232");
//        assertTrue(isValidLogin);
//        bankApplication.getUser().getAccount().transfer("1", 4000);
//        assertEquals(1000.00, customer.getAccount().getAccountBalance().doubleValue());
//        for (Customer user: Bank.getCustomers()) {
//            if (user.getAccount().getAccountNumber().equals("1")){
//                newCustomer = user;
//            }
//        }
//        assert newCustomer != null;
//        assertEquals(4000.00, newCustomer.getAccount().getAccountBalance().doubleValue());
//    }
//    @Test
//    void testThatCustomerCanCloseAccount(){
//        BankApplication bankApplication = new BankApplication();
//        BankApplication.register("Ehis", "Edemakhiota", "ehizman");
//        Customer customer = bankApplication.getUser();
//        customer.closeAccount();
//        assertEquals("NOT_ACTIVE", customer.getAccountState());
//    }
//
//    @Test
//    void testThatCustomerCannotLoginAfterClosingAccount(){
//        BankApplication bankApplication = new BankApplication();
//        BankApplication.register("Ehis", "Edemakhiota", "ehizman");
//        Customer customer = bankApplication.getUser();
//        customer.setPin("2345");
//        customer.closeAccount();
//        assertThrows(InvalidParameterException.class,()-> BankApplication.customerLogin("ehizman", "2345"));
//    }
//
//    @Test
//    void testThatCustomerCanLogoutFromAccount(){
//        BankApplication bankApplication = new BankApplication();
//        BankApplication.register("Ehis", "Edemakhiota", "ehizman");
//        Customer customer = bankApplication.getUser();
//        customer.setPin("2345");
//        customer.logout();
//        assertTrue(Bank.getCustomers().contains(customer));
//    }
//
//    @AfterEach
//    void tearDown() {
//        Bank.getCustomers().clear();
//    }
//}
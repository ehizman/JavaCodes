package bankApplication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void testThatCanDepositToAccount(){
        Account account = new Account();
        account.deposit(5000);
        assertEquals(5000.00, account.getAccountBalance().doubleValue());
    }

    @Test
    void testThatCanWithdraw(){
        Account account = new Account();
        account.deposit(5000);
        account.withdraw(2000);
        assertEquals(3000.00, account.getAccountBalance().doubleValue());
    }

    @Test
    void testThatCannotDepositAnAmountLessThanZero(){
        Account account = new Account();
        assertAll(
                ()->assertThrows(InvalidParameterException.class, ()->account.deposit(-5000)),
                ()-> assertEquals(0.00, account.getAccountBalance().doubleValue())
        );
    }

    @Test
    void testThatCannotDepositAnInvalidAmount(){
        Account account = new Account();
        assertAll(
                ()-> assertThrows(NullPointerException.class, ()-> account.deposit(0)),
                ()-> assertEquals(0.00, account.getAccountBalance().doubleValue())
        );
    }

    @Test
    void testThatCanWithDrawFromAccount(){
        Account account = new Account();
        account.deposit(5000);
        account.withdraw(2000);
        assertEquals(3000.00, account.getAccountBalance().doubleValue());
    }

    @Test
    void testCannotWithDrawAmountGreaterThanBalance(){
        Account account = new Account();
        account.deposit(5000);
        assertAll(
                ()-> assertThrows(InvalidParameterException.class,()->account.withdraw(50000)),
                ()-> assertEquals(5000.00, account.getAccountBalance().doubleValue())
        );
    }

    @Test
    void testCannotWithDrawZeroAmount(){
        Account account = new Account();
        account.deposit(5000);
        assertAll(
                ()-> assertThrows(NullPointerException.class,()->account.withdraw(0)),
                ()-> assertEquals(5000.00, account.getAccountBalance().doubleValue())
        );
    }

    @AfterEach
    void tearDown() {
        Bank.getCustomers().clear();
    }
}
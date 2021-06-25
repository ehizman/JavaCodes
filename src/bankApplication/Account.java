package bankApplication;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.InvalidParameterException;

public class Account {
    private final String accountNumber;
    private BigDecimal accountBalance;

    public Account() {
        accountBalance = BigDecimal.ZERO.setScale(2, RoundingMode.HALF_EVEN);
        accountNumber = Bank.getAccountNumber() + "";
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return  accountBalance;
    }

    public void deposit(int depositAmount) {
        if (depositAmount < 0){
            throw new InvalidParameterException("Invalid deposit Amount");
        }
        if (Double.parseDouble(depositAmount + "") < 0 || Double.parseDouble(depositAmount + "") > 100000000.00){
            throw new InvalidParameterException("Invalid deposit Amount");
        }
        if(depositAmount == 0){
            throw new NullPointerException("zero amount to deposit!");
        }
        this.accountBalance = this.accountBalance.add(BigDecimal.valueOf(depositAmount));
    }

    public void withdraw(int amountToWithDraw) {
        if (BigDecimal.valueOf(amountToWithDraw).compareTo(accountBalance) == 1){
            throw new InvalidParameterException("Invalid withdrawal amount");
        }
        if (amountToWithDraw == 0){
            throw new NullPointerException("You want to withdraw 0");
        }
        accountBalance = accountBalance.subtract(BigDecimal.valueOf(amountToWithDraw));
    }
}

package bankApplication;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.InvalidParameterException;

public class Account {
    private String accountNumber;
    private int accountBalance;

    public Account() {
        accountNumber = Bank.getCustomers().size()+ 1 + "";
        accountBalance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
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
        this.accountBalance = this.accountBalance +  depositAmount;
    }

    public void withdraw(int amountToWithDraw) {
        if (amountToWithDraw > accountBalance){
            throw new InvalidParameterException("Invalid withdrawal amount");
        }
        if (amountToWithDraw ==0){
            throw new NullPointerException("You want to withdraw 0");
        }
        accountBalance = accountBalance - amountToWithDraw;
    }
}

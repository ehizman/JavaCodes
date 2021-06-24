package bankApplication;

public class Account {
    private String accountNumber;
    private int accountBalance;

    public Account() {
        accountNumber = Bank.getCustomers().size() +"";
        accountBalance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

}

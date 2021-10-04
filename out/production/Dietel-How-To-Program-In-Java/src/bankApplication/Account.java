package bankApplication;
import java.math.BigDecimal;
import java.security.InvalidParameterException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;


public class Account {
    private final String accountNumber;
    private final ArrayList<HashMap<String, String>> transactions;

    public Account() {
        transactions = new ArrayList<>(0);
        accountNumber = Bank.getAccountNumber() + "";
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAccountBalance() {
        BigDecimal accountBalance = BigDecimal.ZERO;
        for (HashMap<String, String> transaction: transactions) {
            accountBalance = accountBalance.add(BigDecimal.valueOf(Long.parseLong(transaction.get("Transaction amount"))));
        }

        return  accountBalance;
    }

    public void deposit(int depositAmount) {
        if (depositAmount < 0 || depositAmount > 100_000_000.00){
            throw new InvalidParameterException("Invalid deposit Amount");
        }
        if(depositAmount == 0){
            throw new NullPointerException("zero amount to deposit!");
        }
        final HashMap<String, String> newTransaction = new HashMap<>();
        newTransaction.put("Transaction type", "Deposit");
        newTransaction.put("Transaction amount", String.valueOf(BigDecimal.valueOf(depositAmount)));
        newTransaction.put("Transaction time", String.valueOf(LocalDateTime.now()));
        transactions.add(newTransaction);
    }

    public void withdraw(int amountToWithDraw) {
        if (BigDecimal.valueOf(amountToWithDraw).compareTo(getAccountBalance()) == 1){
            throw new InvalidParameterException("Invalid withdrawal amount");
        }
        if (amountToWithDraw == 0){
            throw new NullPointerException("You want to withdraw 0");
        }
        final HashMap<String, String> newTransaction = new HashMap<>();
        newTransaction.put("Transaction type", "Withdraw");
        newTransaction.put("Transaction amount", String.valueOf(BigDecimal.valueOf(-(amountToWithDraw))));
        newTransaction.put("Transaction time", String.valueOf(LocalDateTime.now()));
        transactions.add(newTransaction);
    }

    public void transfer(String beneficiaryAccountNumber, int amountToWithdraw) {
        boolean accountExists = false;
        for (Customer customer: Bank.getCustomers()) {
            if (customer.getAccount().getAccountNumber().equals(beneficiaryAccountNumber)){
                if (!(customer.getAccountState().equals("NOT_ACTIVE"))){
                    this.withdraw(amountToWithdraw);
                    customer.getAccount().deposit(amountToWithdraw);
                    accountExists = true;
                }
            }
        }
        if (!accountExists){
            throw new NullPointerException("Invalid beneficiary account");
        }
    }

    public void loadAirtime(int amountToLoad) {
        this.withdraw(amountToLoad);
    }

    public void viewTransactionsOnAccount(){
        if (transactions.size() == 0){
            System.out.println("No transactions on this account");
        }
        for (HashMap<String, String> transaction : transactions) {
            System.out.printf("""
                            {
                                %s : %s
                                %s : %s
                                %s : %s%n
                            }%n""","Transaction time",transaction.get("Transaction time"),
                    "Transaction Type", transaction.get("Transaction type"),
                    "Transaction Amount", transaction.get("Transaction amount"));
        }
    }
}

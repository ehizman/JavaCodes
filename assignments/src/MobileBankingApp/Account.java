package MobileBankingApp;

public class Account {
    private double accountBalance;
    private String accountName;
    private short accountPin;

    public void deposit(double depositAmount) {
        if (depositAmount < 0.0){
            System.out.println("Sorry, cannot deposit negative values");
        }
        else{
            accountBalance = depositAmount + accountBalance;
        }
    }

    public double getAccountBalance() {

        return accountBalance;
    }

    public void withdraw(double amountToWithdraw, short userInput) {
        if (userInput != accountPin){
            System.out.println("Sorry, pin is not valid!!!");
        }
        else{
            if (amountToWithdraw < 0) {
                System.out.println("Sorry, system cannot withdraw negative amount");
            }
            if (amountToWithdraw > accountBalance ){
                System.out.println("Sorry, withdrawal amount is more than current balance");
                System.out.println("System cannot proceed with withdrawal, kindly reduce withdrawal amount");
            }
            if ((amountToWithdraw > 0) && (amountToWithdraw <= accountBalance)) {
                accountBalance -= amountToWithdraw;
            }
        }
    }

    public void setName(String name) {
        accountName = name;
    }

    public String getName() {
        return accountName;
    }

    public void setPin(short pin) {
        accountPin = pin;
    }

    public short getPin() {
        return accountPin;
    }
}
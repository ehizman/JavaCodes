package bankApplication;

import java.security.InvalidParameterException;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin;
    private Account account;
    private String userName;
    private AccountState accountState;

    private enum AccountState {NOT_ACTIVE, ACTIVE };

    @Override
    public String toString() {
        return getFirstName()+" "+getLastName()+" "+getUserName()+" "+account.getAccountNumber()+" "+ account.getAccountBalance();
    }

    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = "1234";
        this.userName = userName;
        this.accountState = AccountState.ACTIVE;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
            if(pin == null){
                throw new NullPointerException("Invalid pin!");
            }
            if(pin.length() != 4){
                throw new InvalidParameterException("Pin too short!");
            }
            if(Integer.parseInt(pin) < 0|| Integer.parseInt(pin) > 9999){
                throw new NumberFormatException("Pin is not numeric!");
            }
            this.pin = pin;
    }
    public void generateAccountNumber(){
        this.account = new Account();
    }

    public Account getAccount() {
        return account;
    }

    public void closeAccount() {
        this.accountState = AccountState.NOT_ACTIVE;
    }

    public String getAccountState() {
        return accountState.toString();
    }
}

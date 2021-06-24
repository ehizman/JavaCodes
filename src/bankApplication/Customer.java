package bankApplication;

import java.security.InvalidParameterException;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin;
    private Account account;

    @Override
    public String toString() {
        return getFirstName()+" "+getLastName()+" "+getAccount().getAccountNumber()+" "+getAccount().getAccountBalance();
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = "1234";
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
    }

    public Account getAccount() {
        return account;
    }
}

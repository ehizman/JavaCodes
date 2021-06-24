package bankApplication;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin;
    private Account account;

    @Override
    public String toString() {
        return getFirstName()+" "+getLastName()+" "+getAccount().getAccountNumber()+" "+getAccount().getAccountBalance();
    }

    public Customer(String firstName, String lastName, String defaultPin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = defaultPin;
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
        this.pin = pin;
    }

    public Account getAccount() {
        return account;
    }
}

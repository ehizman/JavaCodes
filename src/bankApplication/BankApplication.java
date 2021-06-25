package bankApplication;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class BankApplication {
    private Customer user;
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public boolean customerLogin(String userNameInput, String pin) {
        boolean isValidLoginAttempt = false;
        for(Customer customer  : Bank.getCustomers()){
            if (customer.getUserName().equals(userNameInput)){
                if (customer.getAccountState().equals("ACTIVE")){
                    if (customer.getPin().equals(pin)){
                        isValidLoginAttempt = true;
                    }
                    else{
                        throw new InvalidParameterException("Invalid pin");
                    }
                }
                else{
                    throw  new InvalidParameterException("Account is Inactive");
                }

            }
        }
        return isValidLoginAttempt;
    }

    public boolean staffLogin(String adminUserName, String pin) {
        boolean isValidLoginAttempt = false;
        if (adminUserName.equals("Admin")){
            if (pin.equals("1234")){
                isValidLoginAttempt = true;
            }
            else{
                throw new InvalidParameterException("Invalid pin");
            }
        }
        return isValidLoginAttempt;
    }

    public Customer getUser() {
        return user;
    }

    public void register(String firstName, String lastName, String userName) {
        this.user = new Customer(firstName,lastName,userName);
        Bank.addNewCustomer(user);
        this.user.generateAccountNumber();
    }

    public void loadAirtime(int amountToLoad) {
        getUser().getAccount().withdraw(amountToLoad);
    }

    public void transfer(String beneficiaryAccountNumber, int amountToWithdraw) {
        boolean accountExists = false;
        for (Customer customer: Bank.getCustomers()) {
            if (customer.getAccount().getAccountNumber().equals(beneficiaryAccountNumber)){
                if (!(customer.getAccountState().equals("NOT_ACTIVE"))){
                    user.getAccount().withdraw(amountToWithdraw);
                    customer.getAccount().deposit(amountToWithdraw);
                    accountExists = true;
                }
            }
        }
        if (!accountExists){
            throw new NullPointerException("Invalid beneficiary account");
        }
    }
}

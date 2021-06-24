package bankApplication;

import java.util.Scanner;

public class BankApplication {
    private Customer user;
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public boolean customerLogin(String userNameInput, String pin) {
        for(Customer customer  : Bank.getCustomers()){
            if (customer.getUserName().equals(userNameInput)){
                if (customer.getPin().equals(pin)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean staffLogin(String adminUserName, String pin) {
        if (adminUserName.equals("Admin")){
            if (pin.equals("1234")){
                return true;
            }
        }
        return false;
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
                user.getAccount().withdraw(amountToWithdraw);
                customer.getAccount().deposit(amountToWithdraw);
                accountExists = true;
            }
        }
        if (!accountExists){
            throw new NullPointerException("Invalid beneficiary account");
        }
    }
}

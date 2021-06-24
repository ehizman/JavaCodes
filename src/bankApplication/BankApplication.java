package bankApplication;

public class BankApplication {

    public static void main(String[] args) {

    }

    public boolean login(String userNameInput, String pin) {
        for(Customer customer  : Bank.getCustomers()){
            if (customer.getUserName().equals(userNameInput)){
                if (customer.getPin().equals(pin)){
                    return true;
                }
            }
        }
        return false;
    }
}

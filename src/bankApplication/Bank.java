package bankApplication;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static final List<Customer> customers = new ArrayList<>(0);

    public static List<Customer> getCustomers() {
        return customers;
    }

    public static void addNewCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }

    public static String getAccountNumber() {
        if (getCustomers().size() == 10){
            getCustomers().removeIf(customer -> customer.getAccountState().equals("NOT_ACTIVE"));
        }
        return getCustomers().size() + "";
    }
}

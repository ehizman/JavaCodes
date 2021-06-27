package bankApplication;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static final List<Customer> customers = new ArrayList<Customer>(0);


    public static void setCustomers(){

    }
    public static List<Customer> getCustomers() {
        return customers;
    }

    public static void addNewCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }

    public static String getAccountNumber() {
        for (Customer customer: getCustomers()) {
            if (customer.getAccountState().equals("NOT_ACTIVE")){
                return customer.getAccount().getAccountNumber();
            }
        }
        return getCustomers().size() + "";
    }
}

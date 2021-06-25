package bankApplication;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static final List<Customer> customers = new ArrayList<Customer>(0);
    private static int numberOfCustomers = 0;
    public static final Staff staff = new Staff();

    public static List<Customer> getCustomers() {
        return customers;
    }

    public static void addNewCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }

    public String getStaffPassword(){
        return staff.getPin();
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

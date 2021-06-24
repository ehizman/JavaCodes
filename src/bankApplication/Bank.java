package bankApplication;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static List<Customer> customers = new ArrayList<Customer>(0);
    private static int numberOfCustomers = 0;
    private Staff staff = new Staff();

    public static List<Customer> getCustomers() {
        return customers;
    }

    public static void addNewCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }

    public String getStaffPassword(){
        return staff.getPin();
    }

    public static int getNumberOfCustomers() {
        return numberOfCustomers;
    }
}

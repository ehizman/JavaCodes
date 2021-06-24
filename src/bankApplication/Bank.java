package bankApplication;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static List<Customer> customers = new ArrayList<Customer>();
    private int numberOfCustomers = customers.size();
    private Staff staff = new Staff();

    public static List<Customer> getCustomers() {
        return customers;
    }

    public String getStaffPassword(){
        return staff.getPin();
    }
}

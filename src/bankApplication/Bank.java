package bankApplication;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static List<Customer> customers = new ArrayList<Customer>();

    public static List<Customer> getCustomers() {
        return customers;
    }
}

package bankApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void testCustomerSetUp(){
        Customer newCustomer = new Customer("Ehis","Edemakhiota","1234");
        assertEquals(String.format("%s %s\t%d%.2f","Ehis","Edemakhiota",1,0.00),newCustomer.toString());
    }

    @Test
    void testT

}
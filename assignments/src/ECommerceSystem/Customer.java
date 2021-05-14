package ECommerceSystem;

import java.util.List;
import java.util.Random;

public class Customer {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String customerID;
    private List<ShippingAddress> shippingAddresses;
    private List<Order> orders;
    private Cart cart;

    public void setCustomerName (String userNameInput) {
        name = userNameInput;
    }

    public void setPhoneNumber (String userPhoneNumberInput) {
        phoneNumber = userPhoneNumberInput;
    }

    public void setEmailAddress (String userEmailAddressInput) {
        emailAddress = userEmailAddressInput;
    }

    public void setCustomerID () {
        Random customerID = new Random();
        this.customerID = "ECS" + customerID;
    }

    public void setShippingAddresses(List<ShippingAddress> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
    }

    public void updateCustomerInformation(String name, String phoneNumber, String address, String email) {
        setCustomerName(name);
        setPhoneNumber(phoneNumber);
        setEmailAddress(email);
        setEmailAddress(address);
    }

    public String queryCustomerInformation() {
        return (name + " " + (customerID) + ":" + phoneNumber + ":" + emailAddress + ":" + shippingAddresses);
    }
}

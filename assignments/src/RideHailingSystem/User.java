package RideHailingSystem;

import java.util.List;

class User implements OrderService{
    private String name;
    private String phoneNumber;
    private List<Address> addresses;

    public void updateUserPhoneNumber(String userInput) {
        this.phoneNumber = userInput;
    }

    public String getUserPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String rideOrder() {
        return null;
    }

    @Override
    public String findAvailableDriver() {
        return null;
    }
}

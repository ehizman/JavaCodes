package RideHailingSystem;

public class Driver {
    private String driverName;
    private String driverPhoneNumber;
    private Vehicle driverVehicle;

    public void updateDriverProfile(String nameInput, String phoneNumberInput) {
        this.driverName = nameInput;
        this.driverPhoneNumber = phoneNumberInput;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriverPhoneNumber() {
        return driverPhoneNumber;
    }
}

package RideHailingSystem;

public class Vehicle implements vehicleRegistrationDetails, ChooseCarTypeService {
    private String vehicleCode;
    private String vehicleType;
    private String licenseNumber;

    public void updateVehicleInformation(int userVehicleCodeInput, String userVehicleTypeInput, int licenseNumberInput) {
        this.vehicleCode = "VEC" + userVehicleCodeInput;
        this.vehicleType = userVehicleTypeInput;
        this.licenseNumber = "LSC" + licenseNumberInput;
    }

    public String getVehicleInformation() {
        return ("Vehicle information is: " + vehicleCode + " " + vehicleType + " " + licenseNumber);
    }

    public String getVehicleRegistrationDetails() {
        return null;
    }

    @Override
    public String showCar() {
        return null;
    }
}

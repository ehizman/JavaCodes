package ECommerceSystem;

public class ShippingAddress {
    private String houseNumber;
    private String street;
    private String closestLandMark;

    public String getClosestLandMark() {
        return closestLandMark;
    }

    public void setClosestLandMark(String closestLandMark) {
        this.closestLandMark = closestLandMark;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void addNewAddress(String houseNumber, String street, String closestLandMark) {
        setHouseNumber(houseNumber);
        setStreet(street);
        setClosestLandMark(closestLandMark);
    }
}

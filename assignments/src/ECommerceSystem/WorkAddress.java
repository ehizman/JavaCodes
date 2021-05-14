package ECommerceSystem;

public class WorkAddress extends ShippingAddress {

    public void setWorkAddress(String houseNumber, String street, String closestLandMark) {
        setHouseNumber(houseNumber);
        setStreet(street);
        setClosestLandMark(closestLandMark);
    }
}

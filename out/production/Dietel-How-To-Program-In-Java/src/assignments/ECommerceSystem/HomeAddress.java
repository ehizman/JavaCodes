package assignments.ECommerceSystem;

public class HomeAddress extends ShippingAddress {

    public void setHomeAddress(String houseNumber, String street, String closestLandMark) {
        setHouseNumber(houseNumber);
        setStreet(street);
        setClosestLandMark(closestLandMark);
    }
}

package BikeSpecification;

import assignments.BikeSpecification.Bike;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("A Bike")
class BikeSpecification {

    /* Specification 1: Bike can be set on or off
    As a user,
    I want to set the bike On or Off depending on the previous state
    so that I can keep track of the state of the bike
    * */
    @Test
    @DisplayName(" is off at Initial")
    void bikeIsOffBeforePoweredOn(){
        Bike superBike = new Bike();
        assertEquals(0, superBike.getPowerStatus());
    }
    /*Scenario 1:
    * Given that the bike is off,
    * when I push in the power button to turn on the bike
    * then bike should be turned on*/
    @Test
    @DisplayName(" is off before setting on")
    void bikeIsOnBeforePowerOn() {
        Bike superBike = new Bike();
        int powerStatus = superBike.getPowerStatus();
        assertEquals(0,powerStatus);
        superBike.setOn();
        powerStatus = superBike.getPowerStatus();
        assertEquals(1,powerStatus);
    }
    /* Scenario 2
    * Given that the bike is on,
    * when I push in the power button to turn off the bike
    * then bike should be turned off*/
    @Test
    @DisplayName(" is on before turning off")
    void bikeIsOnBeforePowerOff(){
        Bike superBike = new Bike();
        superBike.setOn();
        int powerStatus = superBike.getPowerStatus();
        assertEquals(1,powerStatus);
        superBike.setOff();
        powerStatus = superBike.getPowerStatus();
        assertEquals(0, powerStatus);
    }

    @Test
    @DisplayName(" can be set on only gear 1, 2, 3, 4 & P(park)")
    void bikeCanSelectGear() {
        Bike superBike = new Bike();
        String gearStatus = "5";
        superBike.setGear(gearStatus);
        assertNull(superBike.getGearStatus(), () -> "Gear status cannot be set to 5");
    }

//    @Test
//    @DisplayName(" can accelerate only when on and when gear is not on park")
//    void bike_Can_Accelerate_Only_When_On_And_When_Gear_Is_Not_Set_To_Park() {
//        Bike superBike = new Bike();
//        superBike.setOn();
//        assertEquals(1, superBike.getPowerStatus());
//        assertEquals("P", superBike.getGearStatus(), () -> "Gear is not yet set on park");
//
//    }


}

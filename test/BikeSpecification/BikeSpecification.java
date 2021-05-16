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
    /*
    * As a user,
    * i want bike to have only 5 gears arranged as follows- 4, 3, 2, N, 1
    * Neutral should be between gear 1 and gear 2
     */
    @Test
    @DisplayName(" can be set to only gear 1, 2, 3, 4 & N(neutral)")
    void bikeCanSelectGear() {
        Bike superBike = new Bike();
        String gearStatus = "5";
        superBike.setGear(gearStatus);
        assertNull(superBike.getGearStatus());
    }
    /*
    * As a user,
    * i want bike to be set automatically to neutral when turned off
    *  */
    @Test
    @DisplayName(" is set to Neutral when turning off")
    void bikeIsSetToNeutralWhenTurnedOff() {
        Bike superBike = new Bike();
        superBike.setOn();
        superBike.setOff();
        assertEquals("N",superBike.getGearStatus());
    }

    /*
     * As a user,
     * i want bike to be set automatically to neutral when turned on
     *  */
    @Test
    @DisplayName(" is set to Neutral when turning on for the first time")
    void bikeIsSetToNeutralWhenTurnedOnForTheFirstTime() {
        Bike superBike = new Bike();
        superBike.setOn();
        assertEquals("N",superBike.getGearStatus());
    }

    @Test
    @DisplayName(" can change from lower to higher gear")
    void bikeCanGearUpFromNeutralToGearTwo() {
        Bike superBike = new Bike();
        String gearStatus = "N";
        superBike.setGear(gearStatus);
        assertEquals("N", superBike.getGearStatus());
        superBike.shiftUp();
        assertEquals("2", superBike.getGearStatus());
    }

    @Test
    @DisplayName(" can change from lower to higher gear")
    void bikeCanShiftUpFromGearOneToNeutral() {
        Bike superBike = new Bike();
        String gearStatus = "1";
        superBike.setGear(gearStatus);
        superBike.shiftUp();
        assertEquals("N", superBike.getGearStatus());
    }

    @Test
    @DisplayName(" can change from higher to lower gear")
    void bikeCanGearDownFromGearTwoToNeutral() {
        Bike superBike = new Bike();
        String gearStatus = "2";
        superBike.setGear(gearStatus);
        superBike.shiftDown();
        assertEquals("N", superBike.getGearStatus());
    }
    @Test
    @DisplayName(" can change from higher to lower gear")
    void bikeCanGearDownFromGearThreeToGearTwo() {
        Bike superBike = new Bike();
        String gearStatus = "2";
        superBike.setGear(gearStatus);
        superBike.shiftDown();
        assertEquals("N", superBike.getGearStatus());
    }
}

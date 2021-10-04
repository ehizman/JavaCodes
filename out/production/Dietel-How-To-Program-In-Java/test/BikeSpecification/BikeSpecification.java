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
     * i want bike to be set to neutral when turned
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
    /*As a user,
    * i want to gear change from lower to higher gear
    */
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
        String gearStatus = "3";
        superBike.setGear(gearStatus);
        superBike.shiftDown();
        assertEquals("2", superBike.getGearStatus());
    }
    @Test
    @DisplayName(" cannot shift gear at initial state")
    void bikeCannotShiftUpAtInitialState() {
        Bike superBike = new Bike();
        superBike.shiftUp();
        assertNull(null, superBike.getGearStatus());
    }
    @Test
    @DisplayName(" cannot shift gear at initial state")
    void bikeCannotShiftDownAtInitialState() {
        Bike superBike = new Bike();
        superBike.shiftDown();
        assertNull(null, superBike.getGearStatus());
    }

    /** bike accelerates at a steady rate of 5km/hr each in one hour time throttle is pressed **/
    @Test
    @DisplayName("cannot accelerate when throttle is on and gear is set on neutral")
    void bikeCannotAccelerateWhenThrottleIsOnAndOnNeutral() {
        Bike superBike = new Bike();
        superBike.setOn();
        superBike.setThrottle();
        superBike.accelerate();
        assertEquals(0, superBike.checkSpeedometer());
    }

    @Test
    @DisplayName(" cannot accelerate when throttle is not pressed")
    void bikeCannotAccelerateWhenThrottleIsNotPressed(){
        Bike superBike = new Bike();
        superBike.setOn();
        superBike.shiftDown();
        superBike.accelerate();
        assertEquals(0, superBike.checkSpeedometer());

    }

    @Test
    @DisplayName(" can accelerate to maximum speed of 15km/hr when on and in gear1 and when throttle is on")
    /* bike accelerates at a steady rate of 5km/hr */
    void bikeCanAccelerateToAMaximumSpeedOf15kmPerHrWhenOnAndWhenToggleIsOnAndWhenInGearOne(){
        Bike superBike = new Bike();
        superBike.setOn();
        superBike.shiftDown();
        int maxSpeed = 15;
        superBike.setThrottle();
        superBike.accelerate();
        superBike.accelerate();
        superBike.accelerate();
        superBike.accelerate();
        assertFalse(superBike.checkSpeedometer() > maxSpeed);
    }

    @Test
    @DisplayName(" can accelerate to maximum speed of 30km/hr when on and in gear2 and when throttle is on")
    void bike_Can_Accelerate_To_A_Maximum_Speed_Of_30km_Per_Hr_When_On_And_When_Throttle_Is_On_And_When_In_Gear_Two(){
        Bike superBike = new Bike();
        superBike.setOn();
        int maxSpeed = 30;
        superBike.shiftUp();
        superBike.setThrottle();
        for (int counter = 0; counter < 7; counter++ ){
            superBike.accelerate();
        }
        assertFalse(superBike.checkSpeedometer() > maxSpeed );
    }

    @Test
    @DisplayName(" can accelerate to maximum speed of 45km/hr when on and in gear3 and when throttle is on")
    void bike_Can_Accelerate_To_A_Maximum_Speed_Of_45km_Per_Hr_When_On_And_When_Throttle_Is_On_And_When_In_Gear_Three(){
        Bike superBike = new Bike();
        superBike.setOn();
        superBike.shiftUp();
        superBike.shiftUp();
        int maxSpeed = 45;
        superBike.setThrottle();
        for (int counter = 0; counter < 9; counter++ ){
            superBike.accelerate();
        }
        assertFalse(superBike.checkSpeedometer() > maxSpeed, "speed is greater than maximum speed");
    }

    @Test
    @DisplayName(" can accelerate to maximum speed of 45km/hr when on and in gear3 and when throttle is on")
    void bike_Can_Accelerate_To_A_Maximum_Speed_Of_60km_Per_Hr_When_On_And_When_Throttle_Is_On_And_When_In_Gear_Four(){
        Bike superBike = new Bike();
        superBike.setOn();
        superBike.shiftUp();
        superBike.shiftUp();
        superBike.shiftUp();
        int maxSpeed = 60;
        superBike.setThrottle();
        for (int counter = 0; counter < 12; counter++ ){
            superBike.accelerate();
        }
        assertFalse(superBike.checkSpeedometer() > maxSpeed);
    }

    @Test
    @DisplayName(" cannot change from a higher to a lower gear without first reducing speed")
    void bike_Cannot_Change_From_Gear2_To_Neutral_Without_First_Reducing_Speed(){
        Bike superBike = new Bike();
        superBike.setOn();
        superBike.shiftUp();
        superBike.setThrottle();
        superBike.accelerate();
        superBike.accelerate();
        superBike.accelerate();
        String currentGear = superBike.getGearStatus();
        superBike.shiftDown();
        assertEquals(currentGear, superBike.getGearStatus());
    }

    @Test
    @DisplayName(" cannot change from a higher to a lower gear without first reducing speed")
    void bike_Cannot_Change_From_Gear3_To_Gear2_When_Moving_At_A_Speed_Beyond_30_Km_Per_Hour_Without_First_Reducing_Speed(){
        Bike superBike = new Bike();
        superBike.setOn();
        superBike.shiftUp();
        superBike.shiftUp();
        superBike.setThrottle();
        superBike.accelerate();
        superBike.accelerate();
        superBike.accelerate();
        superBike.accelerate();
        superBike.accelerate();
        superBike.accelerate();
        superBike.accelerate();
        String currentGear = superBike.getGearStatus();
        superBike.shiftDown();
        assertEquals(currentGear, superBike.getGearStatus(),"Cannot change gear from 3 to 2 when moving at a speed " +
                "beyond 30km per hour");
    }

    @Test
    @DisplayName("bike can decelerate")
    void bikeCanDecelerate(){
        Bike superBike = new Bike();
        superBike.setOn();
        superBike.setThrottle();
        superBike.shiftDown();
        superBike.accelerate();
        superBike.decelerate();
        assertEquals(0, superBike.checkSpeedometer());
    }

    @Test
    @DisplayName("bike can decelerate only when clutch is pressed on")
    void bikeCanDecelerateWhenClutchIsPressedOn(){
        Bike superBike = new Bike();
        superBike.setOn();
        superBike.setThrottle();
        superBike.shiftDown();
        superBike.accelerate();
        superBike.setClutch();
        superBike.decelerate();
        assertEquals(0, superBike.checkSpeedometer());
    }
    //test that bike cannot accelerate or decelerate when both clutch and throttle is pressed
}

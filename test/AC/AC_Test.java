package AC;

import assignments.AC.AC;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("AC")
public class AC_Test {
// test commented out because requirement is that AC should not be able to display name
    //when off. At initial state of creation AC is off
    @Test
    @DisplayName(" can be set On")
    void ACCanBeSetOn(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        assertTrue(iCool.isOn());
    }

    @Test
    @DisplayName(" is set off initially upon creation")
    void AC_IsSetOffInitiallyUponCreation(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        assertFalse(iCool.isOn());
    }

    @Test
    @DisplayName(" can be set off after previously being on")
    void AC_canBeSetOffAfterPreviouslyBeingOn() {
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        iCool.powerOff();
        assertFalse(iCool.isOn(), "AC is not off");
    }

    @Test
    @DisplayName(" can be set on for the second time after being set off")
    void AC_CanBeSetOn_For_The_SecondTimeAfterBeingSetOff() {
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        iCool.powerOff();
        iCool.powerOn();
        assertTrue(iCool.isOn());
    }
    @Test
    @DisplayName(" does not display 'iCool By Ehizman' when off")
    void AC_CanNotDisplayProductNameWhenOff(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        iCool.powerOff();
        assertEquals("", iCool.displayName());
    }
    @Test
    @DisplayName(" displays 'iCool By Ehizman' when on")
    void AC_CanDisplayProductNameWhenOn() {
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        assertEquals("iCool By Ehizman", iCool.displayName());
    }

    @Test
    @DisplayName(" is set to initial temperature of 16 when turned on for the first time")
    void AC_SetsInitialTemperatureToSixTeenDegreesWhenTurnedOnForTheFirstTime(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        assertEquals("16", iCool.getTemperature());
    }

    @Test
    @DisplayName(" can set temperature when powered on")
    void AC_CanSetTemperatureWhenPoweredOn(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "18";
        iCool.setTemperature(temperature);
        assertEquals("18", iCool.getTemperature());
    }

    @Test
    @DisplayName(" cannot set temperature when powered off")
    void AC_CannotSetTemperatureWhenPoweredOff(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        iCool.powerOff();
        String temperature = "18";
        iCool.setTemperature(temperature);
        assertNull(iCool.getTemperature());
    }

    @Test
    @DisplayName(" can set temperature more than once")
    void AC_CanSetTemperatureMoreThanOnce(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "18";
        iCool.setTemperature(temperature);
        temperature = "20";
        iCool.setTemperature(temperature);
        assertEquals("20", iCool.getTemperature());
    }
    @Test
    @DisplayName(" stores set temperature when powered off")
    void thatAC_StoresSetTemperatureWhenPoweredOff() {
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "18";
        iCool.setTemperature(temperature);
        iCool.powerOff();
        assertEquals("18", iCool.getPreviousTemperature());
    }
    @Test
    @DisplayName(" remembers previously set temperature when powered on for the second time")
    void AC_RemembersPreviouslySetTemperature() {
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "18";
        iCool.setTemperature(temperature);
        iCool.powerOff();
        iCool.powerOn();
        assertEquals("18", iCool.getTemperature());
    }

    @Test
    @DisplayName(" remembers previously set temperature when powered on and temperature has been set multiple" +
            " times")
    void AC_RemembersPreviouslySetTemperatureAfterBeingPoweredOnAndAfterTemperatureHasBeenSetMultipleTimes() {
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "18";
        iCool.setTemperature(temperature);
        iCool.powerOff();
        iCool.powerOn();
        temperature = "20";
        iCool.setTemperature(temperature);
        temperature = "25";
        iCool.setTemperature(temperature);
        iCool.powerOff();
        iCool.powerOn();
        assertEquals("25", iCool.getTemperature());
    }

    @Test
    @DisplayName(" cannot be set to a temperature lower than 16 degrees after it has been set for only the first time")
    void AC_CannotSetToTemperatureLowerThanSixteenDegreesAfterItHasBeenSetOnlyTheFirstTime(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "15";
        iCool.setTemperature(temperature);
        assertEquals("16", iCool.getTemperature());
    }

    @Test
    @DisplayName(" temperature does not change when a trial is made to set AC to less than 16 degrees")
    void AC_TemperatureDoesNotChangeWhenTrialIsMadeToSetLowerThanSixteenDegrees(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "20";
        iCool.setTemperature(temperature);
        temperature = "15";
        iCool.setTemperature(temperature);
        assertEquals("20",iCool.getTemperature());
    }

    @Test
    @DisplayName(" cannot be set to a temperature higher than 30 degrees after it has been set for only the first time")
    void AC_CannotSetToTemperatureHigherThanThirtyDegreesAfterItHasBeenSetOnlyTheFirstTime(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "31";
        iCool.setTemperature(temperature);
        assertEquals("16", iCool.getTemperature());
    }

    @Test
    @DisplayName(" temperature does not change when a trial is made to set AC to higher than 30 degrees")
    void AC_TemperatureDoesNotChangeWhenTrialIsMadeToSetItHigherThanThirtyDegrees(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "20";
        iCool.setTemperature(temperature);
        temperature = "31";
        iCool.setTemperature(temperature);
        assertEquals("20",iCool.getTemperature());
    }

    @Test
    @DisplayName(" temperature does not change when a trial is made to set AC to higher than 30 degrees")
    void AC_TemperatureDoesNotChangeWhenTrialIsMadeToSetItHigherThanThirtyDegreesAfterTurningOffAndOnMultipleTimes(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "20";
        iCool.setTemperature(temperature);
        iCool.powerOff();
        iCool.powerOn();
        iCool.powerOff();
        iCool.powerOn();
        iCool.powerOff();
        iCool.powerOn();
        iCool.powerOff();
        iCool.powerOn();
        temperature = "31";
        iCool.setTemperature(temperature);
        assertEquals("20",iCool.getTemperature());
    }

    @Test
    @DisplayName(" temperature does not change when a trial is made to set AC to less than 16 degrees after turning " +
            "on and off multiple times")
    void AC_TemperatureDoesNotChangeWhenTrialIsMadeToSetLowerThanSixteenDegreesAfterTurningOnAndOffMultipleTimes(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "20";
        iCool.setTemperature(temperature);
        temperature = "15";
        iCool.powerOff();
        iCool.powerOn();
        iCool.powerOff();
        iCool.powerOn();
        iCool.powerOff();
        iCool.powerOn();
        iCool.powerOff();
        iCool.powerOn();
        iCool.powerOff();
        iCool.powerOn();
        iCool.setTemperature(temperature);
        assertEquals("20",iCool.getTemperature());
    }

    @Test
    @DisplayName(" temperature does not change when a trial is made to set AC to higher than 30 degrees")
    void AC_Temperature_Does_Not_Change_When_Trial_Is_Made_To_Set_It_Higher_Than_Thirty_Degrees_After_Turning_Off_And_On_Multiple_Times_And_After_Setting_Temperature_Multiple_Times(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "20";
        iCool.setTemperature(temperature);
        iCool.powerOff();
        iCool.powerOn();
        iCool.powerOff();
        iCool.powerOn();
        temperature = "24";
        iCool.setTemperature(temperature);
        iCool.powerOff();
        iCool.powerOn();
        temperature = "26";
        iCool.setTemperature(temperature);
        iCool.powerOff();
        iCool.powerOn();
        temperature = "28";
        iCool.setTemperature(temperature);
        temperature = "31";
        iCool.setTemperature(temperature);
        assertEquals("28",iCool.getTemperature());
    }

    @Test
    @DisplayName(" temperature does not change when a trial is made to set AC to less than 16 degrees after turning " +
            "on and off multiple times")
    void AC_Temperature_Does_Not_Change_When_Trial_Is_Made_To_Set_Lower_Than_Sixteen_Degrees_After_Turning_On_And_Off_Multiple_Times_And_Setting_Temperature_Multiple_Times(){
        String name = "iCool By Ehizman";
        AC iCool = new AC(name);
        iCool.powerOn();
        String temperature = "20";
        iCool.setTemperature(temperature);
        temperature = "15";
        iCool.setTemperature(temperature);
        iCool.powerOff();
        iCool.powerOn();
        iCool.powerOff();
        iCool.powerOn();
        temperature = "25";
        iCool.setTemperature(temperature);
        iCool.powerOff();
        iCool.powerOn();
        iCool.powerOff();
        iCool.powerOn();
        temperature = "30";
        iCool.setTemperature(temperature);
        iCool.powerOff();
        iCool.powerOn();
        temperature = "14";
        iCool.setTemperature(temperature);
        assertEquals("30",iCool.getTemperature());
    }
}
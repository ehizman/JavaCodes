package AC;

import assignments.AC.AC;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("AC")
public class AC_Test {
// test commented out because requirement is that AC should not be able to display name
    //when off. At initial state of creation AC is off

//    @Test
//    @DisplayName(" has a name")
//    void AC_Has_Name_Upon_Creation(){
//        String name = "iCool By Ehizman";
//        int initialTemperature = 16;
//        AC newAC = new AC(name, initialTemperature);
//        assertEquals(name, newAC.displayName());
//    }

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
}
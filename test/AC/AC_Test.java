package AC;

import assignments.AC.AC;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("An AC")
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
    @DisplayName(" has an initial temperature upon creation")
    void AC_Has_Initial_Temp_Upon_Creation(){
        String name = "iCool By Ehizman";
        int initialTemperature = 16;
        AC iCool = new AC(name,initialTemperature);
        assertEquals(initialTemperature, iCool.getInitialTemperature());
    }

    @Test
    @DisplayName(" that AC can be set On")
    void ACCanBeSetOn(){
        String name = "iCool By Ehizman";
        int initialTemperature = 16;
        AC iCool = new AC(name,initialTemperature);
        iCool.powerOn();
        assertTrue(iCool.isOn());
    }

    @Test
    @DisplayName(" that AC is set off initially upon creation")
    void AC_IsSetOffInitiallyUponCreation(){
        String name = "iCool By Ehizman";
        int temperature = 16;
        AC iCool = new AC(name,temperature);
        assertFalse(iCool.isOn());
    }

    @Test
    @DisplayName(" that AC can be set off after previously being on")
    void AC_canBeSetOffAfterPreviouslyBeingOn() {
        String name = "iCool By Ehizman";
        int temperature = 16;
        AC iCool = new AC(name, temperature);
        iCool.powerOn();
        iCool.powerOff();
        assertFalse(iCool.isOn(), "AC is not off");
    }

    @Test
    @DisplayName(" that AC can be set on for the second time after being set off")
    void AC_CanBeSetOn_For_The_SecondTimeAfterBeingSetOff() {
        String name = "iCool By Ehizman";
        int temperature = 16;
        AC iCool = new AC(name, temperature);
        iCool.powerOn();
        iCool.powerOff();
        iCool.powerOn();
        assertTrue(iCool.isOn());
    }
    @Test
    @DisplayName(" that AC does not display 'iCool By Ehizman' when off")
    void AC_CanNotDisplayProductNameWhenOff(){
        String name = "iCool By Ehizman";
        int temperature = 16;
        AC iCool = new AC(name, temperature);
        iCool.powerOn();
        iCool.powerOff();
        assertEquals("", iCool.displayName());
    }
    @Test
    @DisplayName(" that AC displays 'iCool By Ehizman' when on")
    void AC_CanDisplayProductNameWhenOn() {
        String name = "iCool By Ehizman";
        int temperature = 16;
        AC iCool = new AC(name, temperature);
        iCool.powerOn();
        assertEquals("iCool By Ehizman", iCool.displayName());
    }

    @
}
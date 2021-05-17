package AC;

import assignments.AC.AC;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("An AC")
public class AC_Test {

    @Test
    @DisplayName(" has a name")
    void AC_Has_Name_Upon_Creation(){
        String name = "iCool By Ehizman";
        int initialTemperature = 16;
        AC newAC = new AC(name, initialTemperature);
        assertEquals(name, newAC.getName());
    }

    @Test
    @DisplayName(" has an initial temperature upon creation")
    void AC_Has_Initial_Temp_Upon_Creation(){
        String name = "iCool By Ehizman";
        int initialTemperature = 16;
        AC iCool = new AC(name,initialTemperature);
        assertEquals(initialTemperature, iCool.getInitialTemperature());
    }
}
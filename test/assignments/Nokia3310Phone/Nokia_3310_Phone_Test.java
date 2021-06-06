package assignments.Nokia3310Phone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Nokia_3310_Phone_Test {
    @Test
    void phoneCanDisplayMenu(){
        //given
        Nokia_3310_Phone phone = new Nokia_3310_Phone();
        //when
        String message = """
                    -> NOKIA 3310
                    -> Press 1 for PHONEBOOK Menu
                    -> Press 2 for MESSAGES Menu
                    -> Press 3 for CHAT
                    -> Press 4 for CALL REGISTER
                    -> Press 5 for TONES Menu
                    -> Press 6 for SETTINGS
                    -> Press 7 for CALL DIVERT
                    -> Press 8 for GAMES
                    -> Press 9 for CALCULATOR
                    -> Press 10 for REMINDERS
                    -> Press 11 for CLOCK Menu
                    -> Press 12 for PROFILE
                    -> Press 13 for SIM SERVICES
                """;
        int returnValue = phone.displayMainMenu();
        assertTrue(returnValue == 0);
    }
}

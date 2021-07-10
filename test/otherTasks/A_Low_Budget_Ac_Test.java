package otherTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class A_Low_Budget_Ac_Test {

    @Test
    void createConstructor(){
        Low_Budget_AC low_budget_ac = new Low_Budget_AC("Samsung");
        assertNotNull(low_budget_ac);
    }
    @Test
    void testThatAcIsOffWhenCreated(){
        Low_Budget_AC low_budget_ac = new Low_Budget_AC("Samsung");
        assertFalse(low_budget_ac.isOn());
    }

    @Test
    void canTurnAcOn(){
        Low_Budget_AC low_budget_ac = new Low_Budget_AC("Samsung");
        low_budget_ac.power();
        assertTrue(low_budget_ac.isOn());
    }

    @Test
    void testThatAcCanPowerOffAfterItHasBeenTurnedOn(){
        Low_Budget_AC low_budget_ac = new Low_Budget_AC("Samsung");
        assertFalse(low_budget_ac.isOn());
        low_budget_ac.power();
        assertEquals(true,low_budget_ac.isOn());
        low_budget_ac.power();
        assertEquals(false,low_budget_ac.isOn());
    }
}

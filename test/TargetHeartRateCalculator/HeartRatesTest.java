package TargetHeartRateCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeartRatesTest {
    private HeartRate person;

    @BeforeEach
    public void startEachTestWithThis(){
        person = new HeartRate("Ehis", "Edemakhiota");
    }


    @Test
    public void testThatFirstNameCanBeSet(){
        //when
        person.updateFirstName("Ehis");
        //confirm
        assertTrue("Ehis".equals(person.getFirstName()));
    }

    @Test
    public void testThatLastNameCanBeSet(){
        //when
        person.updateLastName();
        //confirm
        assertEquals("Edemakhiota", person.getLastName());
    }

    @Test
    public void testThatDayOfBirthCanBeSet() {
        //when
        person.setDayOfBirth(28);
        //confirm
        assertEquals(28, person.getDayOfBirth());
    }

    @Test
    public void testThatMonthOfBirthCanBeSet() {
        //when
        assertTrue(person.getFirstName().equals("Ehis"), "First name of newly created person is Chidi");
        person.setMonthOfBirth("January");
        //confirm
        assertEquals("January", person.getMonthOfBirth());
    }

    @Test
    public void testThatYearOfBirthCanBeSet() {
        //when
        person.setYearOfBirth(1994);
        //confirm
        assertEquals(1994, person.getYearOfBirth());
    }
}

package ChapterThreeFiles.TargetHeartRateCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals("Ehis", person.getFirstName());
    }

    @Test
    public void testThatLastNameCanBeSet(){
        //when
        person.updateLastName("Okoro");
        //confirm
        assertEquals("Okoro", person.getLastName());
    }

    @Test
    public void testThatYearOfBirthCanBeSet() {
        //when
        person.setYearOfBirth(1994);
        //confirm
        assertEquals(1994, person.getYearOfBirth());
    }

    @Test
    public void testThatCalculatorCanReturnAge(){
        //when
        person.setYearOfBirth(2005);
        assertEquals(2005, person.getYearOfBirth());
        Calendar currentDate = Calendar.getInstance();
        int currentYear = currentDate.get(Calendar.YEAR);
        assertEquals(2021, currentYear);
        //confirm
        assertEquals(16, person.calculateAge());
    }

    @Test
    public void testThatCalculatorCanReturnMaximumHeartRate() {
        //when
        person.setYearOfBirth(1985);
        int age = person.calculateAge();
        //confirm
        assertEquals(184, person.calculateMaxHeartRate(age));
    }

    @Test
    public void testThatCalculatorCanReturnTargetHeartRate(){
        //when
        person.setYearOfBirth(1985);
        int age = person.calculateAge();
        int maxHeartRate = person.calculateMaxHeartRate(age);
        //confirm
        assertEquals(Arrays.asList(92.0, 156.4), person.calculateTargetHeartRate(maxHeartRate));
    }
}

package ChapterThreeFiles.HealthProfile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthProfileTest {
    @Test
    @DisplayName("test constructor implementation")
    void testThatConstructorInitializesFields(){
        HealthProfile patientHealthProfile = new HealthProfile("ehis", "edemakhiota", "male", 28, 1, 1994, 72.2,
                171.9);
        assertAll(
                () -> assertEquals("ehis", patientHealthProfile.getFirstName()),
                () -> assertEquals("edemakhiota", patientHealthProfile.getLastName()),
                () -> assertEquals("male", patientHealthProfile.getGender()),
                () -> assertEquals(28, patientHealthProfile.getDayOfBirth()),
                () -> assertEquals(1, patientHealthProfile.getMonthOfBirth()),
                () -> assertEquals(1994, patientHealthProfile.getYearOfBirth()),
                () -> assertEquals(72.2, patientHealthProfile.getHeight()),
                () -> assertEquals(171.9, patientHealthProfile.getWeight())
        );
    }

    @Test
    @DisplayName("calculate BMI")
    void testThatUsersBMICanBeCalculated() {
        HealthProfile patientHealthProfile = new HealthProfile("ehis", "edemakhiota", "male", 28, 1, 1994, 20,
                5);
        assertEquals(8.7875, patientHealthProfile.calculateBMI());
    }

    @Test
    @DisplayName("update patient information")
    void testThatUserInformationCanBeUpdated(){
        HealthProfile patientHealthProfile = new HealthProfile("ehis", "edemakhiota", "male", 28, 1, 1994, 20, 5);
        patientHealthProfile.setFirstName("Umar");
        patientHealthProfile.setLastName("Abdul");
        patientHealthProfile.setGender("female");
        patientHealthProfile.setDayOfBirth(1);
        patientHealthProfile.setMonthOfBirth(12);
        patientHealthProfile.setYearOfBirth(1992);
        patientHealthProfile.setHeight(120);
        patientHealthProfile.setWeight(72);

        assertAll(
                () -> assertEquals("Umar", patientHealthProfile.getFirstName()),
                () -> assertEquals("Abdul", patientHealthProfile.getLastName()),
                () -> assertEquals("female", patientHealthProfile.getGender()),
                () -> assertEquals(1, patientHealthProfile.getDayOfBirth()),
                () -> assertEquals(12, patientHealthProfile.getMonthOfBirth()),
                () -> assertEquals(1992, patientHealthProfile.getYearOfBirth()),
                () -> assertEquals(120, patientHealthProfile.getHeight()),
                () -> assertEquals(72, patientHealthProfile.getWeight())
        );
    }

    @Test
    @DisplayName("calculate maximum heart rate")
    void testThatUsersCanCalculateMaximumHeartRate(){
        HealthProfile patientHealthProfile = new HealthProfile("ehis", "edemakhiota", "male", 28, 1, 1994, 20,
                5);

        assertEquals(193, patientHealthProfile.calculateMaximumHeartRate(patientHealthProfile.getYearOfBirth()));
    }

    @Test
    @DisplayName("calculate maximum heart rate")
    void testThatUsersCanCalculateTargetHeartRate(){
        HealthProfile patientHealthProfile = new HealthProfile("ehis", "edemakhiota", "male", 28,1, 1994, 20,
                5);

        assertEquals(Arrays.asList(96.5, 164.05),
                patientHealthProfile.calculateTargetHeartRate(patientHealthProfile.calculateMaximumHeartRate(1994)));
    }
}

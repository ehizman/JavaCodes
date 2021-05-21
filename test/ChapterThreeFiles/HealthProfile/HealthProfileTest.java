//package ChapterThreeFiles.HealthProfile;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class HealthProfileTest {
//
//    @Test
//    @DisplayName("implementation of constructor")
//    void testConstructorIsCreatedProperly(){
//        HealthProfile ehis = new HealthProfile("ehis", "edemakhiota", "male", 28, 1, 1994, 30, 6);
//        assertAll(() -> assertEquals("ehis", ehis.getFirstName()),
//                ()-> assertEquals("edemakhiota", ehis.getLastName()),
//                () -> assertEquals("male", ehis.getGender()),
//                () -> assertEquals(28, ehis.getDayOfMonth()),
//                () -> assertEquals(1, ehis.getMonthOfBirth()),
//                () -> assertEquals(1994, ehis.getYearOfBirth()),
//                () -> assertEquals(30, ehis.getHeightInInches()),
//                () -> assertEquals(6, ehis.getWeightInPounds()));
//    }
//    @Test
//    void testThatConstructorInitializesFieldsToDefaultValuesWhenInvalidInputArePassed(){
//        HealthProfile dummy = new HealthProfile("ehis", "edemakhiota", "male", 42, 13, 1900, -30, -6);
//        assertAll(()-> assertNotEquals(42, dummy.getDayOfMonth()),
//        ()-> assertEquals(1, dummy.getMonthOfBirth()),
//                ()-> assertEquals(2000, dummy.getYearOfBirth(),"year of Birth should not be before 1900 and after " +
//                        "2021"),
//                ()-> assertEquals(1, dummy.getWeightInPounds()),
//                () -> assertEquals(1,dummy.getHeightInInches()),
//                () -> assertEquals("male", dummy.getGender()));
//    }
//}

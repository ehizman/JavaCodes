package ChapterTwoExercisesTestFiles;

import chapterTwo.CompareIntegersApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareIntegersTest {
    @Test
    void testThatIfTwoNonEqualsArePassedAppDisplaysLargerFollowedBy_IsLargerWhenFirstNumberIsLargerThanSecondNumber() {
        CompareIntegersApp compareIntegersApp = new CompareIntegersApp();
        assertEquals("13 is larger", compareIntegersApp.compare(13,5));
    }

    @Test
    void testThatIfTwoNonEqualsArePassedAppDisplaysLargerFollowedBy_IsLargerWhenSecondNumberIsLargerThanFirstNumber() {
        CompareIntegersApp compareIntegersApp = new CompareIntegersApp();
        assertEquals("13 is larger", compareIntegersApp.compare(5, 13));
    }

    @Test
    void testThatIfTwoEqualNumbersArePassedAppDisplaysNumbersAreEqual() {
        CompareIntegersApp compareIntegersApp = new CompareIntegersApp();
        assertEquals("Numbers are equal", compareIntegersApp.compare(13, 13));
    }
}

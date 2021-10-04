package ChapterFive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacebookUserGrowthTest {
    @Test
    void testThatProjectedGrowthCanBeCalculatedAfterFirstMonth(){
        FacebookUserGrowth growthApp = new FacebookUserGrowth(1);
        growthApp.calculateProjectedNumberOfUsers();
        assertEquals(1040000000, growthApp.calculateProjectedNumberOfUsers());
    }

    @Test
    void testThatProjectedGrowthCanBeCalculatedAfterSecondMonth(){
        FacebookUserGrowth growthApp = new FacebookUserGrowth(2);
        growthApp.calculateProjectedNumberOfUsers();
        assertEquals(1081600000 , growthApp.calculateProjectedNumberOfUsers());
    }

    @Test
    void testThatConstructorCanBeInitializedWithOnlyMonth(){
        FacebookUserGrowth growthApp = new FacebookUserGrowth(2);
        assertEquals(2, growthApp.getMonth());
    }
    @Test
    void testThatConstructorCanBeInitializedWithOnlyProjectedUserNumberIsGiven(){
        FacebookUserGrowth growthApp = new FacebookUserGrowth(1_000_000_000L);
        assertEquals(1_000_000_000 , growthApp.calculateProjectedNumberOfUsers());
    }

    @Test
    void testThatDurationOfTImeRequiredForAProjectedGrowthCanBeCalculated(){
        FacebookUserGrowth growthApp = new FacebookUserGrowth(1_081_600_000L);
        growthApp.calculateGrowthDurationInMonths();
        assertEquals( 2, growthApp.calculateGrowthDurationInMonths());
    }

    @Test
    void testForZeroInputsAsDurationOfMonths(){
        FacebookUserGrowth growthApp = new FacebookUserGrowth(0);
        growthApp.calculateProjectedNumberOfUsers();
        assertEquals(1000000000 , growthApp.calculateProjectedNumberOfUsers());
    }

    @Test
    void testForNegativeInputsAsDurationOfMonths(){
        FacebookUserGrowth growthApp = new FacebookUserGrowth(-1);
        growthApp.calculateProjectedNumberOfUsers();
        assertEquals(1000000000 , growthApp.calculateProjectedNumberOfUsers());
    }

    @Test
    void testForZeroInputsAsProjectedGrowthRate(){
        FacebookUserGrowth growthApp = new FacebookUserGrowth(0L);
        growthApp.calculateProjectedNumberOfUsers();
        assertEquals(0, growthApp.calculateGrowthDurationInMonths());
    }

    @Test
    void testForNegativeInputsAsProjectedGrowthRate(){
        FacebookUserGrowth growthApp = new FacebookUserGrowth(-1000000000L);
        growthApp.calculateProjectedNumberOfUsers();
        assertEquals(0, growthApp.calculateGrowthDurationInMonths());
    }
}

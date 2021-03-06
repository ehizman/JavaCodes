package ChapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldPopulationTest{

    @Test
    void testThatWorldPopulationIncreaseCanBeCalculatedAfterOneYear(){
        //given
        WorldPopulation calculator = new WorldPopulation ();
        assertEquals("7.9814Billion", calculator.growthIncrease(1));
    }
    @Test
    void testThatCalculatorCanCalculateDifferenceInWorldPopulationAfterOneYear(){
        WorldPopulation calculator = new WorldPopulation();
        calculator.growthIncrease(1);
        assertEquals("0.0814Billion", calculator.differenceInPopulation());
    }
}

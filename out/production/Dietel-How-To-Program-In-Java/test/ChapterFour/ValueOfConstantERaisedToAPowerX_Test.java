package ChapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueOfConstantERaisedToAPowerX_Test {
    @Test
    void testThatValueOfConstantERaisedToPowerXWhenInputIsAPositiveNumber(){
        ValueOfConstantERaisedToPowerX calculator = new ValueOfConstantERaisedToPowerX();
        assertEquals (13.0, calculator.calculateValueOfConstant_ERaisedToPower_X(3));
    }

    @Test
    void testThatValueOfConstantERaisedToPowerXWhenInputIsZero(){
        ValueOfConstantERaisedToPowerX calculator = new ValueOfConstantERaisedToPowerX();
        assertEquals(1, calculator.calculateValueOfConstant_ERaisedToPower_X(0));
    }

    @Test
    void testThatValueOfConstantERaisedToPowerXWhenInputIsNegative(){
        ValueOfConstantERaisedToPowerX calculator = new ValueOfConstantERaisedToPowerX();
        assertEquals(1, calculator.calculateValueOfConstant_ERaisedToPower_X(-1));
    }
}

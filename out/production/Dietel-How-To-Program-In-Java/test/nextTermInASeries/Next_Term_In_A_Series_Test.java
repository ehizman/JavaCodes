package nextTermInASeries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Next_Term_In_A_Series_Test {

    @Test
    void test_constructor(){
        Next_Term_In_A_Series nextTermFinder = new Next_Term_In_A_Series();
        assertTrue(nextTermFinder != null);
    }

    @Test
    void canReturnNextTerm(){
        Next_Term_In_A_Series nextTermFinder = new Next_Term_In_A_Series();
        assertEquals(20.0, nextTermFinder.findNextTerm(0,5,10,15));
    }

    @Test
    void canReturnNextTermForFractionalSeries(){
        Next_Term_In_A_Series nextTermFinder = new Next_Term_In_A_Series();
        assertEquals(2.5, nextTermFinder.findNextTerm(0.5, 1.0, 1.5, 2.0));
    }
}

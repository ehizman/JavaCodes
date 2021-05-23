package Kata;

import assignments.Kata.TestDriller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {

    @Test
    void testThatAppCanDetermineTheCorrectTotalPriceForNumberOfCopiesBought(){
        TestDriller testDrillerApp = new TestDriller();
        assertAll(
                () -> assertEquals(3000, testDrillerApp.calculateTotalPrice(2)),
                () -> assertEquals(11200, testDrillerApp.calculateTotalPrice(8)),
                () -> assertEquals(15600, testDrillerApp.calculateTotalPrice(13)),
                () -> assertEquals(34800, testDrillerApp.calculateTotalPrice(29)),
                () -> assertEquals(49500, testDrillerApp.calculateTotalPrice(45)),
                () -> assertEquals(41800, testDrillerApp.calculateTotalPrice(38)),
                () -> assertEquals(87000, testDrillerApp.calculateTotalPrice(87)),
                () -> assertEquals(77000, testDrillerApp.calculateTotalPrice(77)),
                () -> assertEquals(90000, testDrillerApp.calculateTotalPrice(100)),
                () -> assertEquals(99000, testDrillerApp.calculateTotalPrice(110)),
                () -> assertEquals(240000, testDrillerApp.calculateTotalPrice(300))
        );
    }

    @Test
    void testThatAppReturnsZeroWhenNumberOfCopiesEnteredIsLessThan1(){
        TestDriller testDrillerApp = new TestDriller();
        assertEquals(0, testDrillerApp.calculateTotalPrice(0));
    }
}

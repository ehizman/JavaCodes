package chapterFourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringsTest {
    @Test
    void test_CanReverseStrings(){
        String reversedString = ReverseStrings.reverseStrings("768573565 432+");
        assertEquals("+234 565 375 867", reversedString);
    }


}
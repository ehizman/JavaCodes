package Kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KataTest {
    @Test
    public void testThatNumberIsAPalindrome() {
        //given
        Kata number = new Kata();
        //when
        //confirm
        assertTrue(number.isPalindrome(12233221));
        assertFalse(number.isPalindrome(1262636));
    }
}

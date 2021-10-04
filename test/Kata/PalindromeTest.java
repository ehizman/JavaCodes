package Kata;

import assignments.Kata.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @Test
    public void testThatNumberIsAPalindrome() {
        //given
        Palindrome number = new Palindrome();
        //when
        //confirm
        assertTrue(number.isPalindrome(12233221));
        assertFalse(number.isPalindrome(1262636));
    }
}

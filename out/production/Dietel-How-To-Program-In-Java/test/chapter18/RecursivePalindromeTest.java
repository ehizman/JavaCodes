package chapter18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursivePalindromeTest {

    @Test
    void isPalindrome() {
        assertTrue(RecursivePalindrome.isPalindrome("radar"));
    }
}
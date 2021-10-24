package chapter18;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;
class RecursiveExponentTest {
    @Test
    void returnExponent(){
        RecursiveExponent calc = new RecursiveExponent();
        BigInteger result = calc.calculateExponent(2, 2);
        assertEquals(BigInteger.valueOf(4), result);
    }

    @Test
    void returnExponent2(){
        RecursiveExponent calc = new RecursiveExponent();
        BigInteger result = calc.calculateExponent(2, 3);
        assertEquals(BigInteger.valueOf(8), result);
    }

    @Test
    void returnExponent3(){
        RecursiveExponent calc = new RecursiveExponent();
        BigInteger result = calc.calculateExponent(5, 3);
        assertEquals(BigInteger.valueOf(125), result);
    }
}
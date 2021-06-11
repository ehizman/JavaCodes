package Kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryConverterTest {

    @Test
    void testThatDecimalNumberCanBeConvertedToBinary(){

        BinaryConverter binaryConverter = new BinaryConverter();
        String binaryNumber = binaryConverter.convertToBinary(6, 5);
        assertEquals("11", binaryNumber);
    }
}

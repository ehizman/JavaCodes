package chapterSixFiles.numberBaseConverters;

import chapterSix.numberBaseConverters.BinaryConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryConverterTest {

    @Test
    void testThatDecimalNumberCanBeConvertedToBinary(){
        String binaryNumber = BinaryConverter.convertToBinary(6);
        assertEquals("110", binaryNumber);
    }
}

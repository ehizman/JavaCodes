package chapterSixFiles.numberBaseConverters;

import chapterSix.numberBaseConverters.OctalBaseConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OctalConverterTest {
    @Test
    void testThatCanConvertFromDecimalToOctal(){
        OctalBaseConverter converter = new OctalBaseConverter();
        String octalRepresentationOfNumber = converter.convertToOctal(8);
        assertEquals("10", octalRepresentationOfNumber);
    }

    @Test
    void testThatCanCovertNegativeDecimalNumbersToOctal(){
        OctalBaseConverter converter = new OctalBaseConverter();
        String octalRepresentationOfNumber = converter.convertToOctal(-8);
        assertEquals("-10", octalRepresentationOfNumber);
    }

    @Test
    void testThatCanConvertZeroToOctal(){
        OctalBaseConverter converter = new OctalBaseConverter();
        String octalRepresentationOfNumber = converter.convertToOctal(0);
        assertEquals("0", octalRepresentationOfNumber);
    }
}

package chapterSixFiles.numberBaseConverters;

import chapterSix.numberBaseConverters.HexDecimalConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HexDecimalConverterTest {
    @Test
    void CanConvertToHexDecimal(){
        HexDecimalConverter converter = new HexDecimalConverter();
        String hexDecimalRepresentation = converter.hexDecimalConverter(11);
        assertEquals("#B", hexDecimalRepresentation);
    }

    @Test
    void CanConvertZeroToHexDecimal(){
        HexDecimalConverter converter = new HexDecimalConverter();
        String hexDecimalRepresentation = converter.hexDecimalConverter(0);
        assertEquals("#0", hexDecimalRepresentation);
    }
    @Test
    void CanConvertNegativeDecimalToHexDecimal(){
        HexDecimalConverter converter = new HexDecimalConverter();
        String hexDecimalRepresentation = converter.hexDecimalConverter(-11);
        assertEquals("#-B", hexDecimalRepresentation);
    }
}

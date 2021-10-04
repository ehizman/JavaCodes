package chapterSix.numberBaseConverters;

import chapterSix.numberBaseConverters.BinaryConverter;
import chapterSix.numberBaseConverters.HexDecimalConverter;
import chapterSix.numberBaseConverters.OctalBaseConverter;
import commonOperations.IoOperations;

public class NumberBaseConverter {

    public static void main(String[] args) {
        String header = String.format("%-10s%-1850s%-50s%-30s","Number", "Binary Representation","Octal " +
                        "Representation ",
                "HexDecimal Representation");
        IoOperations.display(header);
        for (int i = 1; i <= 256; i++) {
            String row = String.format("%-10d%-1850s%-50s%-30s%n",i,
                    BinaryConverter.convertToBinary(i),OctalBaseConverter.convertToOctal(i),
                    HexDecimalConverter.hexDecimalConverter(i));
            IoOperations.display(row);
        }
    }
}

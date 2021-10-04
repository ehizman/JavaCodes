package chapterSix.numberBaseConverters;

public class OctalBaseConverter {
    public static String convertToOctal(int number) {
        String octalRepresentationOfNumber = "";
        do {
            octalRepresentationOfNumber = (number % 8) + octalRepresentationOfNumber;
            number = number / 8;
        } while (number != 0);
        return octalRepresentationOfNumber;
    }
}

package chapterSix.numberBaseConverters;

import commonOperations.IoOperations;

public class BinaryConverter {
    private static StringBuilder  binaryDigits = new StringBuilder("");

    public static String convertToBinary(int number)
    {
        do {
            binaryDigits.append(number % 2);
            number = number / 2;
        }while (number != 0);

        return binaryDigits.reverse().toString();
    }

    public static void main(String[] args) {
        String binaryNumber = BinaryConverter.convertToBinary(42);
        IoOperations.display(binaryNumber);
    }
}

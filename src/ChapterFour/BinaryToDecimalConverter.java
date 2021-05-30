package ChapterFour;

import java.util.Scanner;

public class BinaryToDecimalConverter {
private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a binary number: ");
        final int binaryNumber = scanner.nextInt();

        int counter = 0;
        int decimalNumber = 0;
        int lastDigit = 0;
        int binaryNumber_Mirror = binaryNumber;

        while (counter < ((""+binaryNumber)).length()){
            lastDigit = binaryNumber_Mirror % 10;
            binaryNumber_Mirror = binaryNumber_Mirror / 10;

            decimalNumber = decimalNumber + (int)(lastDigit * Math.pow(2, counter));
            counter++;
        }
        System.out.printf("The decimal equivalent of %d is %d", binaryNumber, decimalNumber);
    }
}

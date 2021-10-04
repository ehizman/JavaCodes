package chapterTwo;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number;
        Scanner scannerScanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scannerScanner.nextInt();

        if ((number % 2) == 0) {
            System.out.printf("%d is even", number);
        }
        else {
            System.out.printf("%d is odd", number);
        }
    }
}

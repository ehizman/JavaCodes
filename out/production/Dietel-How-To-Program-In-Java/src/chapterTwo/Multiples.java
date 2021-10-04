package chapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = scanner.nextInt();

        if ((firstNumber%secondNumber == 0)) {
            System.out.printf("%d is a multiple of %d", firstNumber, secondNumber);
        }
    }
}

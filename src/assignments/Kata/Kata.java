package assignments.Kata;

import java.util.Scanner;

public class Kata {


    public static String reverse(int number) {
        String numberToReverse = number + "";
        String reversedNumber = "";
        char lastDigit;

        for (int i = 1; i <= numberToReverse.length(); i++) {
            lastDigit= numberToReverse.charAt(numberToReverse.length() -i);
            reversedNumber = reversedNumber + lastDigit;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number and get the reverse of the number: ");
        number = scanner.nextInt();
        System.out.println();

        System.out.printf(" the reverse of %d is %s%n", number, reverse(number));
    }
}


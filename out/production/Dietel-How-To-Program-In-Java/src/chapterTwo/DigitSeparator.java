package chapterTwo;

import java.util.Scanner;

public class DigitSeparator {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five digit number: ");
        number = scanner.nextInt();
        String numberInString = "   ";
        numberInString = numberInString + number % 10;
        number = number/10;
        while ((number / 10) != 0) {
            numberInString ="   " +  (number % 10) + numberInString;
            number = number/10;
        }
        numberInString = number + numberInString;
        System.out.println(numberInString);
    }
}

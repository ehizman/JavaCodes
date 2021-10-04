package chapter_eleven;
import java.util.Scanner;
public class Addition_Of_Numbers_Using_Assert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();
            assert (firstNumber > 0 && secondNumber > 0) : "Invalid input!";

            System.out.printf("The sum of %d and %d is %d", firstNumber, secondNumber, firstNumber + secondNumber);
    }
}

package ChapterFour;

import java.util.Scanner;

public class Factorial {
    private int factorial;

    public Factorial() {
        factorial = 1;
    }

    public int calculateFactorial(int number) {
        while (number > 1){
            factorial = factorial * number;
            number--;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        Factorial calculator = new Factorial();
        System.out.print("Enter number to calculate factorial: ");
        number = scanner.nextInt();

        System.out.printf("The factorial of %d is %d", number, calculator.calculateFactorial(number));
    }
}

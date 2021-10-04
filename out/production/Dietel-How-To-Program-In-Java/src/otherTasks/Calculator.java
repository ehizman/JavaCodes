package otherTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public int addNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtractNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiplyNumbers(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divideNumbers(int firstNumber, int secondNumber) {
        if (secondNumber <= 0) return 0;
        return firstNumber/ secondNumber;
    }

    public static void main(String ... args) {
        Calculator calculator = new Calculator();
//        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
//        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
//        int secondNumber = scanner.nextInt();
//        System.out.println(calculator.divideNumbers(firstNumber, secondNumber));
        System.out.println(args[0]);

    }
}

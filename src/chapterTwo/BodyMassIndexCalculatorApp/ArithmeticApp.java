package chapterTwo.BodyMassIndexCalculatorApp;

import java.util.Scanner;
/*
*   Algorithm:
*                  - Prompt user to enter two numbers
*                  - Obtain numbers from the user
*                  - Display sum of numbers
*                  - Display difference between numbers
*                   - Display product of numbers
*                   - Display quotient of division of numbers
*  */
public class ArithmeticApp {

    public static void main (String ... args) {
        
        int firstNumber;
        int secondNumber;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.println();

        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        System.out.println();


        System.out.printf("The sum of %d and %d is: %d%n", firstNumber, secondNumber, (firstNumber + secondNumber));
        System.out.printf("The product of %d and %d is %d%n", firstNumber, secondNumber, (firstNumber * secondNumber));
        System.out.printf("The difference between %d and %d is: %d%n", firstNumber, secondNumber,
                (firstNumber - secondNumber));
        System.out.printf("The quotient division of %d divided by %d is: %d%n", firstNumber,
                secondNumber,(firstNumber/secondNumber));
    }

}

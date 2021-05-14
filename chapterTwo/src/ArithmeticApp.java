import java.util.Scanner;

public class ArithmeticApp {

    public static void main (String ... args) {
        
        int firstNumber;
        int secondNumber;
        int maximum;
        int minimum;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.println();

        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        System.out.println();

        maximum = (firstNumber > secondNumber) ? (firstNumber) : (secondNumber);
        minimum = (firstNumber < secondNumber) ? (firstNumber) : (secondNumber);
        
        System.out.printf("The sum of %d and %d is: %d%n", firstNumber, secondNumber, (firstNumber + secondNumber));
        System.out.printf("The product of %d and %d is %d%n", firstNumber, secondNumber, (firstNumber * secondNumber));
        System.out.printf("The difference between %d and %d is: %d%n", firstNumber, secondNumber, (maximum - minimum));
        System.out.printf("The quotient division of %d divided by %d is: %d%n", maximum, minimum, (maximum/minimum));
    }

}

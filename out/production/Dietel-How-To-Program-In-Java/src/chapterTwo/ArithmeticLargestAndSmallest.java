package chapterTwo;

import java.util.Scanner;

public class ArithmeticLargestAndSmallest {
    public static int sum(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber + secondNumber + thirdNumber);
    }

    public static int product(int firstNumber, int secondNumber, int thirdNumber) {
        return (firstNumber*secondNumber*thirdNumber);
    }

    public static int  average(int firstNumber, int secondNumber, int thirdNumber) {
        return ((firstNumber + secondNumber + thirdNumber)/3);

    }

    public static String compare(int firstNumber, int secondNumber, int thirdNumber) {
        int largest = Math.max(firstNumber, secondNumber);
        if ((Math.max(largest, thirdNumber)) != largest){
            largest = thirdNumber;
        }
        int smallest = Math.min(firstNumber, secondNumber);
        if ((Math.min(smallest, thirdNumber)) != smallest){
            smallest = thirdNumber;
        }
        return ("Largest: " + largest + " and Smallest: " + smallest);
    }

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        Scanner scannerScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        firstNumber = scannerScanner.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = scannerScanner.nextInt();

        System.out.print("Enter third number: ");
        thirdNumber = scannerScanner.nextInt();

        System.out.println("Sum: " + sum(firstNumber, secondNumber, thirdNumber));
        System.out.println("Product: " + product(firstNumber, secondNumber, thirdNumber));
        System.out.println("Average: " + average(firstNumber, secondNumber, thirdNumber));
        System.out.println(compare(firstNumber, secondNumber, thirdNumber));
    }
}

package chapter_eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Handling_Exceptions {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numerator;
            int denominator = 0;
            int quotient;
            boolean shouldContinue = true;
            do {
                try{
                    System.out.print("Enter integer numerator: ");
                    numerator = scanner.nextInt();
                    while (shouldContinue){
                        try{
                            System.out.print("Enter integer denominator: ");
                            denominator = scanner.nextInt();
                            shouldContinue = false;
                        }
                        catch(InputMismatchException error){
                            scanner.nextLine();
                            System.out.println("Invalid denominator!");
                        }
                    }
                    quotient = quotient(numerator, denominator);
                    System.out.printf("The result of %d / %d is %d", numerator, denominator, quotient);
                    shouldContinue = false;
                }
                catch(ArithmeticException error){
                    System.out.println("Zero is an invalid input!");
                }
                catch (InputMismatchException error){
                    System.out.println("Please enter valid integers. Please try again!");
                    scanner.nextLine();
                }
            }while (shouldContinue);
    }
    private static int quotient(int numerator, int denominator){
        return (numerator/denominator);
    }
}

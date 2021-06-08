package Classwork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactorsOfAnIntegerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeFactorsOfAnInteger factorsOfAnInteger = new PrimeFactorsOfAnInteger();
        System.out.print("Enter a number to find its prime factors: ");
        try{
            int number = scanner.nextInt();
            if (number < 1){
                throw new Exception("Invalid input!");
            }
            StringBuilder primeFactorsOfNumber = factorsOfAnInteger.findFactors(number);
            if (factorsOfAnInteger.isPrimeNumber(number)){
                System.out.printf("%d is a prime number and so its prime factor is %s", number, primeFactorsOfNumber);
                System.exit(0);
            }
            System.out.printf("The prime factors of %d are %s", number, primeFactorsOfNumber);
        }catch (InputMismatchException inputMismatchException){
            System.err.println("Invalid Input");
        }
        catch (NullPointerException nullPointerException){
            System.err.println("Invalid Input!");
        }
        catch (Exception e){
            System.err.println("Invalid input");
        }
    }
}

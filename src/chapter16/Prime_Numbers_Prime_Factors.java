package chapter16;

import javax.sound.sampled.SourceDataLine;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prime_Numbers_Prime_Factors {
    static Set<Integer> uniquePrimeFactors = new HashSet<>();
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = isPrime(number);
        if (!isPrime){
            System.out.printf("%d is not a prime number", number);
        }
        else {
            System.out.printf("%d is a prime number",number);
        }
    }

    public static boolean isPrime(int number){
        for (int i = 2; i <= (int)Math.sqrt(number); i++) {
            if (number % i == 0){
                uniquePrimeFactors.add(i);
                findUniquePrimeFactors(number/i, i);

                return true;
            }
        }
        return false;
    }

    private static void findUniquePrimeFactors(int number, int firstPrimeFactor) {
        for (int i = firstPrimeFactor; i <=number ; i++) {
            if (number % i == 0){
                uniquePrimeFactors.add(i);
                number = number / i;
            }
        }
        System.out.println("Unique prime factors -> " + uniquePrimeFactors);
    }
}

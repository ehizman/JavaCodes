package assignments.Kata;

import java.util.Scanner;

public class Kata {
    public static String reverse(int number) {
        String numberToReverse = number + "";
        String reversedNumber = "";
        char lastDigit;

        for (int i = 1; i <= numberToReverse.length(); i++) {
            lastDigit= numberToReverse.charAt(numberToReverse.length() -i);
            reversedNumber = reversedNumber + lastDigit;
        }
        return reversedNumber;
    }

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number and get the reverse of the number: ");
        number = scanner.nextInt();
        System.out.println();

        System.out.printf(" the reverse of %d is %s%n", number, reverse(number));
    }

    public static int findMaximumFrom(int[] array) {
        if (array == null){
            throw new NullPointerException("Array is Null!");
        }
        else {
            int maximum = array[0];
            for(int number: array){
                maximum = Math.max(number, maximum);
            }
            return maximum;
        }
    }

    public static int findMinimum(int[] array) {
        if (array == null){
            throw new NullPointerException("Null Array!");
        }
        else{
            int minimum = array[0];
            for (int number: array) {
                minimum = Math.min(number, minimum);
            }
            return minimum;
        }
    }

    public static double findAverage(int[] array) {
        if (array == null){
            throw new NullPointerException("Null Array!");
        }
        else{
            int total = 0;
            for (int number: array) {
                total = total + number;
            }
            return (double)total/array.length;
        }
    }
}


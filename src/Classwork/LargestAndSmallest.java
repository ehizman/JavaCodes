package Classwork;

import java.util.Scanner;

public class LargestAndSmallest {

    public static void main(String[] args) {
        System.out.println("This application takes in 10 numbers and then outputs the largest and the smallest");
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int currentInput = 0;
        Scanner scanner = new Scanner (System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Enter number %d: ", i);
            currentInput = scanner.nextInt();
            largest = Math.max(currentInput, largest);
            smallest = Math.min(currentInput, smallest);
        }

        System.out.printf("The largest is %d and the smallest is %d", largest, smallest);
    }
}

package assignments.Kata;

import java.util.Scanner;

public class TotalAndAverageGradeCalculatorWithSentinelLoop {

    public static void main(String[] args) {
        int total = 0;
        int numberOfScoresEntered = 1;
        String numbersEnteredInString = "";
        int userEntry = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Grade Total and Average Score Calculator");
        System.out.print("Enter score " + numberOfScoresEntered + ": ");
        userEntry = scanner.nextInt();

        while (userEntry != -1) {
            numbersEnteredInString = numbersEnteredInString + userEntry + " ";
            total = total + userEntry;
            numberOfScoresEntered++;

            System.out.print("Enter score " + numberOfScoresEntered + ": ");
            userEntry = scanner.nextInt();
        }

        System.out.println("Total: " + total);
        System.out.println("The average of " + (numberOfScoresEntered - 1) + " numbers: " + numbersEnteredInString +
                "is " +  ((double)total/(numberOfScoresEntered-1)));
    }
}

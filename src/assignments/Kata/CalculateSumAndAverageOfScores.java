package assignments.Kata;

/*
*   - set the number of scores to zero
*   - set the sum of scores to zero
*   - while the number of scores is less than 15
*               - obtain a score from the user
*               - add score to the sum of scores
*               - increment the number of scores entered by 1
*   - Display sum of scores
*   - Display average as sum of scores divided by the number of scores
* */
import java.util.Scanner;

public class CalculateSumAndAverageOfScores {

    public static void main(String[] args) {
        int sumOfScores = 0;
        int studentScore;
        int numberOfScores = 0;
        String numberInputsInString = (" ");
        Scanner scannerScanner = new Scanner(System.in);

        System.out.print("How many student scores do you want to enter: ");
        int numberOfStudents = scannerScanner.nextInt();

        while (numberOfScores < numberOfStudents) {
            System.out.print("Enter student score: ");
            studentScore = scannerScanner.nextInt();
            numberInputsInString = numberInputsInString + studentScore + ", ";
            sumOfScores = sumOfScores + studentScore;
            numberOfScores++;
        }

        System.out.println("Sum of scores: " + sumOfScores);
        System.out.println("The average of " + numberInputsInString + " is: " + ((float)sumOfScores / numberOfScores));
    }
}

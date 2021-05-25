package assignments.Kata;
import javax.swing.*;

public class CalculateSumAndAverageOfStudentScoresWithGUI {

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

        public static void main(String[] args) {
            int sumOfScores = 0;
            int studentScore;
            int numberOfScores = 0;
            String numberInputsInString = (" ");

            int numberOfStudents = Integer.parseInt(JOptionPane.showInputDialog("How many student scores do you want to " +
                    "enter: "));

            while (numberOfScores < numberOfStudents) {
                studentScore = Integer.parseInt(JOptionPane.showInputDialog("Enter student score: "));

                numberInputsInString = numberInputsInString + studentScore + ", ";
                sumOfScores = sumOfScores + studentScore;
                numberOfScores++;
            }
            String message = String.format("Sum of scores: %d", sumOfScores);
            JOptionPane.showMessageDialog(null, message);

            message = String.format("The average of %s is: %f", numberInputsInString,
                    ((float)sumOfScores / numberOfScores));
            JOptionPane.showMessageDialog(null, message);
        }
}
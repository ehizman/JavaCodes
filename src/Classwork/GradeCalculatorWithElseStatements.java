package Classwork;
import java.util.Scanner;
public class GradeCalculatorWithElseStatements {
    /*
     * Ask the user to enter a score:
     *   - if the score is greater than or equal to 90, Display A
     *   - if the score is greater than or equal to 80 and score is less than 90, Display        B
     *   - if the score is greater than or equal to 70 and score is less than 80, Display        C
     *   - if the score is greater than or equal to 60 and score is less than 70, Display        D
     *   - if the score is less than 60, Display F
     * */
    public  static void main (String ... args) {

        int score;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score: ");
        score = input.nextInt();

        if (score >= 90) {
            System.out.println("A");
        }

        else if (score >= 80) {
                System.out.println("B");
        }

        else if (score >= 70) {
            System.out.println("C");
        }

        else if (score >= 60) {
            System.out.println("D");
        }

        else {
            System.out.println("F");
        }
    }
}

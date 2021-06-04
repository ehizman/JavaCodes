package assignments.TrackHighestScore;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TrackHighestScore {

    public static void main(String[] args) {
        int score;
        int numberOfStudents;
        int highestScore = Integer.MIN_VALUE;
        String studentNameWithHighestScore = null;
        String studentName;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        numberOfStudents = scanner.nextInt();

        for (int i = 1; i < 6; i++) {
            System.out.print("Enter score " + i + ":");
            score = scanner.nextInt();
            System.out.print("\t\tEnter name of student "+ i + ":");
            studentName = scanner.next();

            if (score > highestScore){
                highestScore = score;
                studentNameWithHighestScore = studentName;
            }
        }
        System.out.printf("Student with highest score is %s with %d", studentNameWithHighestScore, highestScore);
    }
}

package chapterSeven;
import commonOperations.IoOperations;
import java.security.InvalidParameterException;

public class StudentScoresMultiDimensional{
    private static int numberOfSubjects = 0;
    private static int numberOfStudents = 0;
    private static int[][] scores;

    public static void main(String[] args) {
        promptUser();
        System.out.println("_______________________________");
        enterStudentScores();
        System.out.println();
        System.out.println();
        displayScores();
    }

    private static void displayScores() {
        System.out.printf("%-10s", "Student name");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.printf("%9s %d", "Subject", i + 1);
        }
        System.out.println();
        for (int i = 0; i < numberOfStudents; i++){
            System.out.printf("%s %d:","Student", i+1);
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.printf("%10d", scores[i][j]);
            }
            System.out.println();
        }
    }

    private static void enterStudentScores() {
        scores = new int[numberOfStudents][numberOfSubjects];
        boolean isValidScore;
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%s %d%n", "Student", i+1);
            for (int j = 0; j < numberOfSubjects; j++) {
                isValidScore = false;
                do {
                    System.out.printf("%s %d ", "Enter score for subject", j + 1);
                    try{
                        scores[i][j] = Integer.parseInt(IoOperations.collectInput());
                        isValidScore = validateScores(scores[i][j]);
                    }
                    catch(InvalidParameterException | NumberFormatException error){
                        System.out.println("Invalid score entered!");
                    }
                }while(!isValidScore);
            }
            System.out.println("_______________________________");
        }
    }

    private static boolean validateScores(int userInput) {
        if (userInput < 0 || userInput > 100){
            throw new InvalidParameterException();
        }
        return true;
    }

    private static void promptUser() {
        boolean isValid;
        do {
            isValid = false;
            System.out.println("Enter the number of subjects: ");
            try{
                numberOfSubjects = Integer.parseInt(IoOperations.collectInput());
                isValid = validation(numberOfSubjects);
            }
            catch (NumberFormatException | InvalidParameterException error){
                System.out.println("Invalid number of subjects entered");
            }
        } while(!isValid);
        do{
            isValid = false;
            System.out.println("Enter the number of students: ");
            try{
                numberOfStudents = Integer.parseInt(IoOperations.collectInput());
                isValid = validation(numberOfStudents);
            }
            catch (NumberFormatException | InvalidParameterException error){
                System.out.println("Invalid number of students entered");
            }
        } while(!isValid);
    }

    private static boolean validation(int parameterToValidate) {
        if (parameterToValidate <= 0) {
            throw new InvalidParameterException();
        }
        return true;
    }
}
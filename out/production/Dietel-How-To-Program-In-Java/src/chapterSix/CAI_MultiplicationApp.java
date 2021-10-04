package chapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI_MultiplicationApp {
    public static void main(String[] args) {

        String loopControlValue;
        int userInput;
        int firstOperand;
        int secondOperand;
        int correctAnswer;
        String question;
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.print("""
                   Welcome to my multiplication application
                   Press Any Key to continue
                   Press -1 to exit:
                   """);
        System.out.print("-> ");
        loopControlValue = scanner.next();

        while (!loopControlValue.equals("-1")){
            firstOperand = random.nextInt(11);
            secondOperand = random.nextInt(11);
            correctAnswer = firstOperand * secondOperand;
            do {
                question = String.format("%nWhat is %d times %d: ", firstOperand, secondOperand);
                System.out.print(question);
                userInput = scanner.nextInt();

                if (userInput == correctAnswer){
                    System.out.println("Correct Answer! ");
                }
                else{
                    System.out.println("Incorrect Answer\nTry Again! ");
                }
            }while(userInput != correctAnswer);

            System.out.print("""
                   Proceed to next question
                   
                   Press Any Key to continue
                   Press -1 to exit:
                    """);
            System.out.print("-> ");
            loopControlValue = scanner.next();
        }
    }
}

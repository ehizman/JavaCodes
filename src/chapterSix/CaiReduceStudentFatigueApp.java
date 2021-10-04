package chapterSix;
import commonOperations.IoOperations;

import java.security.SecureRandom;

public class CaiReduceStudentFatigueApp {
    private static final SecureRandom secureRandom = new SecureRandom();

    public static void main(String[] args) {
        int sentinelValue ;
        do {
            String message = """
               Welcome to my CAI App
               It asks a multiplication question.
               And then display a random message when the user gets it right or wrong
               Press -1 to exit application. Press any other key to continue.
                """;
            IoOperations.display(message);
            sentinelValue = Integer.parseInt(IoOperations.collectInput());

            if (sentinelValue == -1){
                return;
            }
            else{
                mainOperation();
            }
            IoOperations.display("\n");
        }while(sentinelValue != -1);
    }

    private static void mainOperation(){
        int firstOperand = secureRandom.nextInt(10);
        int secondOperand = secureRandom.nextInt(10);
        int userAnswer;
        boolean isWrong;
        do {
            IoOperations.display(CAI_ReduceStudentFatigue.getQuestion(firstOperand, secondOperand));
            IoOperations.display("Enter answer here -> ");
            userAnswer = Integer.parseInt(IoOperations.collectInput());
            isWrong = userAnswer != CAI_ReduceStudentFatigue.getAnswer(firstOperand,secondOperand);
            if (isWrong){
                IoOperations.display(CAI_ReduceStudentFatigue.getWrongResponse(secureRandom.nextInt(4)));
            }
        }while (isWrong);
        IoOperations.display(CAI_ReduceStudentFatigue.getCorrectResponse(secureRandom.nextInt(4)));
    }
}
package chapterSixFiles;

import chapterSix.CAI_ReduceStudentFatigue;
import chapterSix.CaiReduceStudentFatigueApp;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class CAI_ReduceStudentFatigueTest {

    @Test
    void testCanGenerateQuestion(){
        SecureRandom secureRandom = new SecureRandom();
        int firstOperand = secureRandom.nextInt(10);
        int secondOperand = secureRandom.nextInt(10);
        String question = String.format("What is %d times %d?", firstOperand, secondOperand);
        assertEquals(question, CAI_ReduceStudentFatigue.getQuestion(firstOperand, secondOperand));
    }

    @Test
    void getAnswer(){
        SecureRandom secureRandom = new SecureRandom();
        int firstOperand = secureRandom.nextInt(10);
        int secondOperand = secureRandom.nextInt(10);
        assertEquals((firstOperand * secondOperand), CAI_ReduceStudentFatigue.getAnswer(firstOperand, secondOperand));
    }

    @Test
    void canGenerateRandomResponseWhenUserAnswersCorrectly(){
        SecureRandom secureRandom = new SecureRandom();
        int passResponse = secureRandom.nextInt(4);
        String response = null;
        switch(passResponse){
            case 0 -> response = "Very good!";
            case 1 -> response = "Excellent!";
            case 2 -> response = "Nice work!";
            case 3 -> response = "Keep up the good work!";
        }
        assertSame(response, CAI_ReduceStudentFatigue.getCorrectResponse(passResponse));
    }

    @Test
    void canGenerateRandomResponseWhenUserAnswersWrongly(){
        SecureRandom secureRandom = new SecureRandom();
        int passResponse = secureRandom.nextInt(4);
        String response = null;
        switch(passResponse){
            case 0 -> response = "No. Please try again";
            case 1 -> response = "Wrong. Try once more";
            case 2 -> response = "Don't give up!";
            case 3 -> response = "No. Keep trying";
        }
        assertSame(response, CAI_ReduceStudentFatigue.getWrongResponse(passResponse));
    }
}

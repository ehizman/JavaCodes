package meyers_briggs_personality_test.withOOP;

import java.util.Arrays;

public class Questionnaire {
    private static Question[] questions = new Question[10];
    private int currentQuestion = 0;

    public Questionnaire(){
        loadQuestionArray();
    }

    private static void loadQuestionArray() {
        String[] stringOfQuestions = {"do you consider yourself a quiet person?","do you consider yourself talkactive?"};
        for (int i = 0; i < stringOfQuestions.length; i++) {
            Question question = new Question(stringOfQuestions[i]);
            questions[i] = question;
        }
    }

    public Question serve(){
        currentQuestion++;
        return questions[currentQuestion-1];

    }

    public static void main(String[] args) {
        Questionnaire questionnaire = new Questionnaire();
        System.out.println(Arrays.toString(questions));
    }



}

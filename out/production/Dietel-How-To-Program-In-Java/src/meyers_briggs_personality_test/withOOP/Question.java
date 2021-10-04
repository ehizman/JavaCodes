package meyers_briggs_personality_test.withOOP;

public class Question {
    public final String questionValue;
    private char response;

    public Question(String question){
        this.questionValue = question;
    }

    public String getQuestionValue() {
        return questionValue;
    }

    public char getResponse() {
        return response;
    }

    public void setResponse(char response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionValue='" + questionValue + '\'' +
                ", response=" + response +
                '}';
    }
}

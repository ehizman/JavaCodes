package chapterSix;

public class CAI_ReduceStudentFatigue {


    public static String getQuestion(int firstOperand, int secondOperand) {
        return String.format("What is %d times %d?", firstOperand, secondOperand);
    }

    public static int getAnswer(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }

    public static String getCorrectResponse(int passResponse) {
        String response;
        switch(passResponse){
            case 0 -> response = "Very good!";
            case 1 -> response = "Excellent!";
            case 2 -> response = "Nice work!";
            case 3 -> response = "Keep up the good work!";
            default -> throw new IllegalStateException("Unexpected value: " + passResponse);
        }
        return response;
    }

    public static String getWrongResponse(int passResponse) {
        String response = null;
        switch(passResponse){
            case 0 -> response = "No. Please try again";
            case 1 -> response = "Wrong. Try once more";
            case 2 -> response = "Don't give up!";
            case 3 -> response = "No. Keep trying";
            default -> throw new IllegalStateException("Unexpected value " + passResponse);
        }
        return response;
    }
}

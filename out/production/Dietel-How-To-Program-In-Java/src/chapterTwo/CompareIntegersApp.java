package chapterTwo;

public class CompareIntegersApp {
    public String compare(int firstNumber, int secondNumber) {
        if (firstNumber != secondNumber){
            if (firstNumber > secondNumber) {
                return (firstNumber + " is larger");
            }
            else{
                return (secondNumber + " is larger");
            }
        }
        else{
            return ("Numbers are equal");
        }
    }
}

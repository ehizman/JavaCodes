package chapter18;

public class GreatestCommonDivisor {

    public int calc(int firstNumber, int secondNumber) {
        if (secondNumber == 0){
            return firstNumber;
        }
        else{
            return  calc(secondNumber, firstNumber%secondNumber);
        }
    }
}

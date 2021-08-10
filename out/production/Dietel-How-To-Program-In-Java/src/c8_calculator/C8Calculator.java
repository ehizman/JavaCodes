package c8_calculator;

public class C8Calculator {
    private boolean power;
    private int result;


    public boolean isOn() {
        return power;
    }

    public void power() {
        power = !power;
    }

    public void add(int firstNumber, int secondNumber) {
        result = firstNumber + secondNumber;
    }

    public int getResult() {
        return result;
    }

    public void sub(int firstNumber, int secondNumber) {
        result = firstNumber - secondNumber;
    }
}

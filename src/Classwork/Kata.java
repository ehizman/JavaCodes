package Classwork;

public class Kata {
    private int factorial = 1;
    public int findFactorialOf(int number) {

        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
}

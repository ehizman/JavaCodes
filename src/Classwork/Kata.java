package Classwork;

public class Kata {

    public static int findFactorialOf(int number) {
        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
}

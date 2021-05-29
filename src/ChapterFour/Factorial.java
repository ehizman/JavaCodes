package ChapterFour;

public class Factorial {
    int factorial;

    public Factorial() {
        factorial = 1;
    }

    public int calculateFactorial(int number) {
        while (number > 1){
            factorial = factorial * number;
            number--;
        }
        return factorial;
    }
}

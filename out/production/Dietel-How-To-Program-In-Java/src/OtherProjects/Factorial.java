package OtherProjects;
import java.util.Scanner;

public class Factorial {
    private static int factorial = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to display its factorial: ");
        int number = scanner.nextInt();

        System.out.printf("Factorial of %d is %d", number, factorial(number));
    }

    private static int factorial(int number) {
        while (number > 1){
            factorial = factorial * number;
            number--;
        }
        return factorial;
    }
}
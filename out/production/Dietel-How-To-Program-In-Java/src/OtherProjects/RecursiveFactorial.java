package OtherProjects;
import java.util.Scanner;

public class RecursiveFactorial {
    private static int factorial = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to display its factorial: ");
        int number = scanner.nextInt();

        System.out.printf("Factorial of %d is %d", number, factorial(number));
    }

    private static int factorial(int number) {
        if (number > 1){
            factorial = factorial * number;
            return (factorial(number - 1));
        }
        return factorial;
    }
}
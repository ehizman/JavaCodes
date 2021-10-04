package ChapterFour;

import java.util.Scanner;

public class ValueOfMathematicalConstantE_Factorial {
    private final Factorial calculator = new Factorial();

    public double calculateValueOfE(int number) {
        double constantE = 1;
        if (number == 0){
            constantE = 2.0;
        }
        else{
            for (int i = 1; i <= number; i++) {
                System.out.println(i + " " + calculator.calculateFactorial(i));
                constantE = constantE + (1.0/(calculator.calculateFactorial(i)));
            }
        }
        return constantE;
    }

    public static void main(String[] args) {
        final int  number;
        final double constantE;
        final ValueOfMathematicalConstantE_Factorial calculator = new ValueOfMathematicalConstantE_Factorial();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        constantE = calculator.calculateValueOfE(number);

        System.out.printf("constantE: %f", constantE);

    }
}

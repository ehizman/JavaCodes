package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class FindingRootsOfQuadraticEquation {
    public static double[] findRoots(int coefficientOf_A, int coefficientOf_B, int coefficientOf_C) {
        double determinantOfEquation = Math.pow(coefficientOf_B, 2.0) - (4 * coefficientOf_A * coefficientOf_C);

        if (determinantOfEquation < 0.0){
            System.out.println("The quadratic equation has no real roots");
            return new double[] {0.0, 0.0};
        }

        else{
            double numeratorEquationForFirstRoot = -(coefficientOf_B) - Math.sqrt(determinantOfEquation);
            double firstRoot = numeratorEquationForFirstRoot/ (2 * coefficientOf_A);
            double firstRootToThreeDecimalPlaces = Math.round(firstRoot * 1000.0)/ 1000.0;

            double numeratorEquationForSecondRoot = -(coefficientOf_B) + Math.sqrt(determinantOfEquation);
            double secondRoot = numeratorEquationForSecondRoot/ (2 * coefficientOf_A);
            double secondRootToThreeDecimalPlaces = Math.round(secondRoot * 1000.0)/ 1000.0;
            return (new double[] {firstRootToThreeDecimalPlaces, secondRootToThreeDecimalPlaces});
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my Quadratic Equation App");

        System.out.print("Enter the coefficient A: ");
        int coefficient_A = scanner.nextInt();

        System.out.print("Enter the coefficient B: ");
        int coefficient_B = scanner.nextInt();

        System.out.print("Enter the coefficient C: ");
        int coefficient_C = scanner.nextInt();
        System.out.printf("The roots of the equations are: %s%n", Arrays.toString(findRoots(coefficient_A, coefficient_B,
                coefficient_C)));


    }
}

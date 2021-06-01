package assignments;

public class FindingRootsOfQuadraticEquation {
    public double[] findRoots(int coefficientOf_A, int coefficientOf_B, int coefficientOf_C) {
        double determinantOfEquation = Math.pow(coefficientOf_B, 2.0) - (4 * coefficientOf_A * coefficientOf_C);

        if (determinantOfEquation < 0.0){
            System.out.println("The quadratic equation has no real roots");
            return new double[] {0.0, 0.0};
        }

        else{
            double numeratorEquationForFirstRoot = -(coefficientOf_B) - Math.sqrt(determinantOfEquation);
            double firstRoot = numeratorEquationForFirstRoot/ (2 * coefficientOf_A * coefficientOf_C);
            firstRoot = Math.round(firstRoot * 1000.0)/ 1000.0;

            double numeratorEquationForSecondRoot = -(coefficientOf_B) + Math.sqrt(determinantOfEquation);
            double secondRoot = numeratorEquationForSecondRoot/ (2 * coefficientOf_A * coefficientOf_C);
            secondRoot = Math.round(secondRoot * 1000.0)/ 1000.0;
            System.out.printf("The roots of the equations are: %f and %f%n", firstRoot, secondRoot);
            return (new double[] {firstRoot, secondRoot});
        }
    }
}

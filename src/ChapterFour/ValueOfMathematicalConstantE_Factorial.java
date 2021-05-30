package ChapterFour;

public class ValueOfMathematicalConstantE_Factorial {
    private final Factorial calculator = new Factorial();

    public double calculateValueOfE(int number) {
        double constantE = 1;
        if (number == 0){
            constantE = 2.0;
        }else{
            for (int i = 1; i <= number; i++) {
                constantE = constantE + (1.0/(calculator.calculateFactorial(i)));
            }
        }
        return constantE;
    }
}

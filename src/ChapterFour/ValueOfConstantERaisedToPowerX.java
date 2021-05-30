package ChapterFour;

public class ValueOfConstantERaisedToPowerX {
    private final Factorial calculator = new Factorial();

    public double calculateValueOfConstant_ERaisedToPower_X(int number) {
        double valueOfConstant_ERaisedToPowerX = 1.0 ;

        for (int i = 1; i <= number ; i++) {
            valueOfConstant_ERaisedToPowerX =
                    valueOfConstant_ERaisedToPowerX + (Math.pow(number, i)/ (calculator.calculateFactorial(i)));
        }

        return valueOfConstant_ERaisedToPowerX;
    }
}

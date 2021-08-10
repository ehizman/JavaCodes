package Classwork;

public class PrimeFactorsOfAnInteger {
    private StringBuilder stringOfFactors = new StringBuilder().append("");
    private int squareOfNumber;

    public StringBuilder findFactors(int number) {
        if (isPrimeNumber(number)){
            stringOfFactors.append(number).append(" ");
        }
        else{
            for (int i = 2; i <= squareOfNumber; i++){
                if (number % i == 0){
                    stringOfFactors.append(i).append(" ");
                    findFactors(number/i);
                }
            }
        }
        return stringOfFactors;
    }

    public boolean isPrimeNumber(int number) {
        squareOfNumber = (int)Math.sqrt(number);
        for (int i = 2; i <= squareOfNumber; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}

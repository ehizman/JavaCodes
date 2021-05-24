package assignments.Kata;

public class NumberOfFactors {

    public int calculateNumberOfFactors(int number) {
        int numberOfFactors = 2; //every number automatically has 2 factors: 1 and itself
        int factor = 2;
        int endPointForFactorsSearch = number / 2;
        while (factor <= endPointForFactorsSearch){
            if (number % factor == 0){
                numberOfFactors++;
            }
           factor++;
        }
        return numberOfFactors;
    }
}

package assignments.Kata;
/*
*   -   obtain a number
*   -   if number is 0 then number of factors is 0
*   -   else
*           -   if number is equal to 1, the number of factors is 1
*           -   else
*                   -   set the nu*/

public class NumberOfFactors {

    public int calculateNumberOfFactors(int number) {
        if (number == 0){
            return 0;
        }
        else{
            if (number == 1){
                return 1;
            }
            else {
                int numberOfFactors = 2; //every number automatically has 2 factors: 1 and itself
                int factor = 2;
                int endPointForFactorsSearch = Math.abs(number / 2);
                while (factor <= endPointForFactorsSearch){
                    if (number % factor == 0){
                        numberOfFactors++;
                    }
                    factor++;
                }
                if (number < 0){
                    return numberOfFactors * 2;
                }
                else {
                    return numberOfFactors;
                }
            }
        }
    }
}

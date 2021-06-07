package Classwork;

public class FactorsOfAnInteger {
    private int firstFactor;

    public boolean isPrimeNumber (int number) throws Exception {
        try{
            int squareOfNumber =(int) Math.sqrt(number);
            if(number == 0){
                throw new Exception("Invalid input. 0 is not a valid input");
            }
            if (number == 2 || number == 1){
                setFirstNumber(number);
                return true;
            }
            for (int i = 2; i <= squareOfNumber; i++) {
                if (number % i == 0){
                    setFirstNumber(i);
                    return false;
                }
            }
        }catch (Exception e){
            System.err.println("Invalid input. 0 is not a valid input");
            System.exit(-1);
        }
        return true;
    }

    private void setFirstNumber(int number) {
        firstFactor = number;
    }

    public String findFactors(int number) throws Exception {
        int copyOfNumber = number;
        String message = "";
        StringBuilder stringOfFactors = new StringBuilder();
        if (isPrimeNumber(number)){
            setFirstNumber(number);
            message = String.format("%d is the only factor of %d", getFirstFactor(), number);
        }
        else{
            number = number / getFirstFactor();
            stringOfFactors.append(getFirstFactor()).append(" ");
            int[] primeNumbersBetweenOneAndTen = new int[] {2,3,5,7};
            int factor;
            while(number > 1){
                for (int element: primeNumbersBetweenOneAndTen){
                    if (number % element == 0){
                        factor = element;
                        stringOfFactors.append(factor).append(" ");
                        number = number/element;
                    }
                    if (isPrimeNumber(number)){
                        factor = number;
                        stringOfFactors.append(factor).append(" ");
                        number = 1;
                    }
                }
            }

            message = String.format("%s are factors of %d", stringOfFactors, copyOfNumber);
        }
        System.out.println(message);
        return message;
    }

    private int getFirstFactor() {
        return firstFactor;
    }
}

package chapterTwo;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {

    public static void main(String[] args) {
        int number;
        int numberOfNegativeInputs = 0;
        int numberOfPositiveInputs = 0;
        int numberOfZeroInputs = 0;
        Scanner scannerScanner = new Scanner(System.in);
        int counter = 1;
        while (counter < 6){
            System.out.print("Enter a number: ");
            number = scannerScanner.nextInt();
            if (number > 0){
                numberOfPositiveInputs++;
            }
            else{
                if (number < 0) {
                    numberOfNegativeInputs++;
                }
                else{
                    numberOfZeroInputs++;
                }
            }
            counter++;
        }

        System.out.printf("Number of negative values: %d%n" +
                "Number of positive values: %d%n" +
                "Number of zero values: %d%n", numberOfNegativeInputs, numberOfPositiveInputs, numberOfZeroInputs);
    }
}

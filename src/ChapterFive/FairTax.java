package ChapterFive;

import java.util.Scanner;

public class FairTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double  fairTaxPercentage = 0.23;
        int expense;
        int total = 0;
        do {
            System.out.println("Enter expenses");
            System.out.println("Press -1 to terminate");
            System.out.print("-> ");
            expense = scanner.nextInt();
            total = total + expense;
        } while (expense != -1);

        System.out.printf("Fairtax is: %.2f", total * fairTaxPercentage);
    }
}

package ChapterFour;

import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int milesPerTrip;
        int numberOfGallonsPerTrip;
        String message = String.format("""
            Welcome to average miles per gallon calculator
            Press -1 to exit
            Press any key to continue: %s""", " ");
        System.out.print(message);
        int input = scanner.nextInt();
        System.out.println();
        double averageGallonsUsedPerMile;
        double totalAverageGallonsPerMIle = 0.0;
        while (input != -1) {
            System.out.print("Enter miles driven per trip: ");
            milesPerTrip = scanner.nextInt();
            System.out.print("Enter the number of gallons used per trip: ");
            numberOfGallonsPerTrip = scanner.nextInt();
            averageGallonsUsedPerMile = (double) milesPerTrip / numberOfGallonsPerTrip;
            System.out.printf("Average gallons used on this trip is %f%n", averageGallonsUsedPerMile);
            totalAverageGallonsPerMIle = totalAverageGallonsPerMIle + averageGallonsUsedPerMile;
            System.out.println();
            System.out.print(message);
            input = scanner.nextInt();
            System.out.println();
        }
        System.out.printf("Total average gallons used per mile: %.2f", totalAverageGallonsPerMIle);
    }
}

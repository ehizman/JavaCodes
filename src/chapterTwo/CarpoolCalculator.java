package chapterTwo;

import java.util.Scanner;

public class CarpoolCalculator {

    public static void main(String[] args) {
        int totalMilesDrivenPerDay;
        int costPerGallonOfGasoline;
        int averageMilesPerGallon;
        int parkingFeesPerDay;
        int tollsPerDay;
        Scanner scannerScanner = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        totalMilesDrivenPerDay = scannerScanner.nextInt();

        System.out.print("Enter cost of per gallon of gasoline: ");
        costPerGallonOfGasoline = scannerScanner.nextInt();

        System.out.print("Enter average miles per gallon of gasoline: ");
        averageMilesPerGallon = scannerScanner.nextInt();

        System.out.print("Enter parking fees per day: ");
        parkingFeesPerDay = scannerScanner.nextInt();

        System.out.print("Enter tolls per day: ");
        tollsPerDay = scannerScanner.nextInt();

        int numberOfGallonsOfKerosineUsedPerDay = totalMilesDrivenPerDay / averageMilesPerGallon;

        int costPerDayOfDrivingToWork =
                (numberOfGallonsOfKerosineUsedPerDay * costPerGallonOfGasoline) + parkingFeesPerDay +tollsPerDay;

        System.out.println("Cost per day of going to work:  $" + costPerDayOfDrivingToWork );
    }
}
